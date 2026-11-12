package rise.local.config;

import java.io.*;
import java.net.*;
import java.net.http.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

public final class OnlineConfigRepository {
    public record Entry(String name,String file,String sha,String ip,String updated,boolean featured) {}
    public record Catalog(String revision,String committedAt,String fetchedAt,List<Entry> entries) {}
    private static final int MAX_BYTES=4*1024*1024;
    private final Path folder;
    private final URI api,raw;
    private final HttpClient http=HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(8)).followRedirects(HttpClient.Redirect.NORMAL).build();
    private volatile Catalog catalog;

    public OnlineConfigRepository(Path directory)throws IOException {this(directory,URI.create("https://api.github.com/repos/risellc/RiseOnlineConfigs/"),URI.create("https://raw.githubusercontent.com/risellc/RiseOnlineConfigs/"));}
    OnlineConfigRepository(Path directory,URI api,URI raw)throws IOException {
        folder=directory.toAbsolutePath().normalize();this.api=api;this.raw=raw;Files.createDirectories(folder);
        Path saved=folder.resolve("catalog.json");
        if(Files.isRegularFile(saved))try{catalog=parse(Files.readString(saved));}catch(Exception ignored){}
        if(catalog==null)seed();
    }
    public Path directory(){return folder;}
    public Catalog catalog(){return catalog;}
    private static Catalog parse(String text)throws IOException {
        try {
            JSONObject json=new JSONObject(text);String revision=json.getString("revision");
            if(!revision.matches("[0-9a-f]{40}"))throw new IOException("Invalid CAS revision.");
            List<Entry> entries=new ArrayList<>();JSONArray configs=json.getJSONArray("configs");Set<String> names=new HashSet<>();
            for(int i=0;i<configs.length();i++) {
                JSONObject item=configs.getJSONObject(i);String file=item.getString("file"),sha=item.getString("sha");
                if(!safeFile(file)||!sha.matches("[0-9a-f]{40}")||!names.add(file.toLowerCase(Locale.ROOT)))throw new IOException("Invalid CAS catalog entry.");
                entries.add(new Entry(item.getString("name"),file,sha,item.optString("ip"),item.optString("updated"),item.optBoolean("featured")));
            }
            if(entries.isEmpty())throw new IOException("The CAS catalog is empty.");
            return new Catalog(revision,json.optString("committed_at"),json.optString("fetched_at"),List.copyOf(entries));
        }catch(JSONException error){throw new IOException("Invalid CAS catalog.",error);}
    }
    private static boolean safeFile(String name){return name.matches("[A-Za-z0-9][A-Za-z0-9 ._-]{0,100}\\.json")&&!name.equalsIgnoreCase("latest.json")&&!name.equalsIgnoreCase("index.json");}
    private Path snapshot(Catalog value){return folder.resolve("snapshots").resolve(value.revision());}
    private synchronized void seed()throws IOException {
        try(InputStream input=getClass().getResourceAsStream("/cas-configs/catalog.json")) {
            if(input==null)return;
            byte[] metadata=input.readAllBytes();Catalog bundled=parse(new String(metadata,StandardCharsets.UTF_8));Path target=snapshot(bundled);Files.createDirectories(target);
            for(Entry item:bundled.entries())try(InputStream resource=getClass().getResourceAsStream("/cas-configs/"+item.file())) {
                if(resource==null)throw new IOException("Missing bundled CAS config: "+item.file());
                byte[] bytes=resource.readAllBytes();validate(bytes,item.sha());write(target.resolve(item.file()),bytes);
            }
            write(folder.resolve("catalog.json"),metadata);catalog=bundled;
        }
    }
    private static byte[] read(InputStream input)throws IOException {
        byte[] bytes=input.readNBytes(MAX_BYTES+1);if(bytes.length>MAX_BYTES)throw new IOException("CAS response is too large.");return bytes;
    }
    private byte[] get(URI uri)throws IOException,InterruptedException {
        HttpRequest request=HttpRequest.newBuilder(uri).timeout(Duration.ofSeconds(15)).header("User-Agent","RiseLocalLauncher/1.0").header("Accept","application/vnd.github+json").header("Cache-Control","no-cache").GET().build();
        HttpResponse<InputStream> response=http.send(request,HttpResponse.BodyHandlers.ofInputStream());
        try(InputStream body=response.body()) {
            if(response.statusCode()!=200)throw new IOException("CAS download failed (HTTP "+response.statusCode()+").");
            return read(body);
        }
    }
    private URI source(String revision,String file){return raw.resolve(revision+"/"+URLEncoder.encode(file,StandardCharsets.UTF_8).replace("+","%20"));}
    public synchronized Catalog refresh()throws IOException,InterruptedException {
        JSONObject commit=new JSONObject(new String(get(api.resolve("commits/main")),StandardCharsets.UTF_8));String revision=commit.getString("sha");
        if(!revision.matches("[0-9a-f]{40}"))throw new IOException("Invalid GitHub revision.");
        if(catalog!=null&&catalog.revision().equals(revision)&&complete(catalog))return catalog;
        JSONObject tree=new JSONObject(new String(get(api.resolve("git/trees/"+revision)),StandardCharsets.UTF_8));
        if(tree.optBoolean("truncated"))throw new IOException("The GitHub config listing is incomplete.");
        JSONArray index=new JSONArray(new String(get(source(revision,"index.json")),StandardCharsets.UTF_8));Map<String,JSONObject> featured=new HashMap<>();
        for(int i=0;i<index.length();i++){JSONObject item=index.getJSONObject(i);featured.put(item.getString("name").toLowerCase(Locale.ROOT)+".json",item);}
        JSONArray result=new JSONArray();JSONArray nodes=tree.getJSONArray("tree");
        for(int i=0;i<nodes.length();i++) {
            JSONObject node=nodes.getJSONObject(i);String file=node.getString("path");
            if(!node.optString("type").equals("blob")||!safeFile(file))continue;
            JSONObject item=featured.get(file.toLowerCase(Locale.ROOT));
            result.put(new JSONObject().put("name",item==null?file.substring(0,file.length()-5):item.getString("name")).put("file",file).put("sha",node.getString("sha")).put("ip",item==null?"":item.optString("ip")).put("updated",item==null?"":item.optString("last updated")).put("featured",item!=null));
        }
        JSONObject metadata=new JSONObject().put("repository","risellc/RiseOnlineConfigs").put("revision",revision).put("committed_at",commit.getJSONObject("commit").getJSONObject("committer").getString("date")).put("fetched_at",Instant.now().toString()).put("configs",result);
        Catalog next=parse(metadata.toString());Path target=snapshot(next);Files.createDirectories(target);
        ExecutorService executor=Executors.newFixedThreadPool(4);List<Future<?>> tasks=new ArrayList<>();
        try {
            for(Entry item:next.entries())tasks.add(executor.submit(()->{
                try {Path file=target.resolve(item.file());if(!valid(file,item.sha())){byte[] bytes=get(source(next.revision(),item.file()));validate(bytes,item.sha());write(file,bytes);}}
                catch(Exception error){throw new CompletionException(error);}
            }));
            for(Future<?> task:tasks)try{task.get();}catch(ExecutionException error){throw new IOException("CAS update failed; the previous snapshot remains available.",error.getCause());}
        }finally{executor.shutdownNow();}
        write(folder.resolve("catalog.json"),metadata.toString(2).getBytes(StandardCharsets.UTF_8));catalog=next;return next;
    }
    public Entry find(String name)throws IOException {
        Catalog current=catalog;if(current==null)throw new IOException("No CAS config snapshot is available.");
        String query=name.toLowerCase(Locale.ROOT);if(query.startsWith("cas-"))query=query.substring(4);if(query.endsWith(".json"))query=query.substring(0,query.length()-5);
        for(Entry item:current.entries())if(item.name().equalsIgnoreCase(query)||item.file().substring(0,item.file().length()-5).equalsIgnoreCase(query))return item;
        throw new IOException("CAS config not found: "+name);
    }
    public String config(String name)throws IOException {
        Entry item=find(name);Path path=snapshot(catalog).resolve(item.file());if(!valid(path,item.sha()))throw new IOException("CAS cache is incomplete: "+item.name());return Files.readString(path,StandardCharsets.UTF_8);
    }
    public Path export(String name,Path directory)throws IOException {
        Entry item=find(name);Files.createDirectories(directory);Path target=directory.resolve("CAS-"+item.file());write(target,config(name).getBytes(StandardCharsets.UTF_8));return target;
    }
    public void exportAll(Path directory)throws IOException {Catalog current=catalog;if(current!=null)for(Entry item:current.entries())export(item.name(),directory);}
    private boolean complete(Catalog value){for(Entry item:value.entries())if(!valid(snapshot(value).resolve(item.file()),item.sha()))return false;return true;}
    private static boolean valid(Path path,String sha){try{if(!Files.isRegularFile(path)||Files.size(path)>MAX_BYTES)return false;validate(Files.readAllBytes(path),sha);return true;}catch(Exception error){return false;}}
    private static void validate(byte[] bytes,String expected)throws IOException {
        try {
            MessageDigest algorithm=MessageDigest.getInstance("SHA-1");algorithm.update(("blob "+bytes.length+"\0").getBytes(StandardCharsets.UTF_8));
            if(!HexFormat.of().formatHex(algorithm.digest(bytes)).equals(expected))throw new IOException("CAS config checksum mismatch.");
            JSONObject value=new JSONObject(new String(bytes,StandardCharsets.UTF_8));boolean modules=false;
            for(String key:value.keySet())if(value.optJSONObject(key)!=null&&(key.startsWith("module.")||value.optJSONObject(key).has("state")))modules=true;
            if(!modules)throw new IOException("Unsupported CAS config format.");
        }catch(JSONException|NoSuchAlgorithmException error){throw new IOException("Invalid CAS config.",error);}
    }
    private static void write(Path path,byte[] bytes)throws IOException {
        Files.createDirectories(path.getParent());Path temporary=Files.createTempFile(path.getParent(),"cas-",".tmp");
        try{Files.write(temporary,bytes);try{Files.move(temporary,path,StandardCopyOption.ATOMIC_MOVE,StandardCopyOption.REPLACE_EXISTING);}catch(AtomicMoveNotSupportedException error){Files.move(temporary,path,StandardCopyOption.REPLACE_EXISTING);}}
        finally{Files.deleteIfExists(temporary);}
    }
    public static void main(String[] args)throws Exception {
        OnlineConfigRepository repository=new OnlineConfigRepository(Paths.get(args[0]));Catalog current=repository.refresh();repository.exportAll(Paths.get(args[1]));
        System.out.println("CAS "+current.revision()+": "+current.entries().size()+" configs, "+current.entries().stream().filter(Entry::featured).count()+" featured.");
    }
}
