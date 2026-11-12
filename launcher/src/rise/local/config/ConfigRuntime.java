package rise.local.config;

import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import org.json.*;

public final class ConfigRuntime {
    public static final Executor MAIN_THREAD=ConfigRuntime::onMainThread;
    private static volatile OnlineConfigRepository repository;
    private static Path gameDirectory;
    private static volatile long checkedAt;

    public static void configure(Path game)throws IOException {
        gameDirectory=game.toAbsolutePath().normalize();repository=new OnlineConfigRepository(gameDirectory.resolve("Rise/online-configs"));
        repository.exportAll(gameDirectory.resolve("Rise/configs"));
        installDefaultProfile(gameDirectory,repository);
        Thread updater=new Thread(()->{try{refresh();}catch(Exception error){System.out.println("[CAS] Using cached configs: "+error.getMessage());}},"cas-updater");updater.setDaemon(true);updater.start();
    }
    static boolean installDefaultProfile(Path game,OnlineConfigRepository current)throws IOException {
        Path profile=game.resolve("Rise/configs/latest.json");
        if(Files.exists(profile))return false;
        String config=current.config("Hypixel1.8");
        Files.createDirectories(profile.getParent());
        try{Files.writeString(profile,config,StandardCharsets.UTF_8,StandardOpenOption.CREATE_NEW,StandardOpenOption.WRITE);}
        catch(FileAlreadyExistsException ignored){return false;}
        System.out.println("[Config] Initial profile: Hypixel 1.8 ("+current.catalog().revision().substring(0,12)+").");
        return true;
    }
    private static OnlineConfigRepository repo()throws IOException {
        if(repository==null){synchronized(ConfigRuntime.class){if(repository==null)configure(Paths.get(System.getProperty("user.dir")));}}
        return repository;
    }
    public static synchronized void refresh()throws Exception {
        OnlineConfigRepository current=repo();OnlineConfigRepository.Catalog result=current.refresh();current.exportAll(gameDirectory.resolve("Rise/configs"));checkedAt=System.currentTimeMillis();
        System.out.println("[CAS] "+result.entries().size()+" configs ready at "+result.revision().substring(0,12)+".");
    }
    public static ArrayList<Object> featuredTuples() {
        ArrayList<Object> values=new ArrayList<>();
        try {
            OnlineConfigRepository current=repo();if(System.currentTimeMillis()-checkedAt>60000)try{refresh();}catch(Exception error){System.out.println("[CAS] Cached listing: "+error.getMessage());}
            Constructor<?> tuple=Class.forName("hackclient.rise.ajw").getConstructor(Object.class,Object.class,Object.class);
            if(current.catalog()!=null)for(OnlineConfigRepository.Entry item:current.catalog().entries())if(item.featured())values.add(tuple.newInstance(item.name(),item.ip(),item.updated()));
        }catch(Exception error){System.err.println("[CAS] Cannot list configs: "+error.getMessage());}
        return values;
    }
    public static String fetchUrl(String url) {
        try {
            String file=url.substring(url.lastIndexOf('/')+1);return repo().config(java.net.URLDecoder.decode(file,StandardCharsets.UTF_8));
        }catch(Exception error){System.err.println("[CAS] Cannot download config: "+error.getMessage());return "";}
    }
    public static void sendMessage(String message) {
        try {
            JSONObject packet=new JSONObject(message);int id=packet.optInt("id",-1);
            if(id==2)applyJson(packet.getString("a"));
            else if(id==10) {
                String name=packet.getString("a");Thread loader=new Thread(()->{
                    try{if(System.currentTimeMillis()-checkedAt>60000)try{refresh();}catch(Exception ignored){}applyJson(repo().config(name));notifyLoaded(name);}
                    catch(Exception error){System.err.println("[CAS] Load failed: "+error.getMessage());notifyError(error.getMessage());}
                },"cas-loader");loader.setDaemon(true);loader.start();
            }
        }catch(Exception error){System.err.println("[Config] Load failed: "+error.getMessage());notifyError(error.getMessage());}
    }
    public static boolean loadFile(Object config) {
        try {
            File file=(File)call(config,"sZ");if(!file.isFile())return false;
            applyJson(Files.readString(file.toPath(),StandardCharsets.UTF_8));
            if(!file.getName().equalsIgnoreCase("latest.json"))notifyLoaded(file.getName().replaceFirst("\\.json$",""));return true;
        }catch(Exception error){System.err.println("[Config] Cannot load config: "+error.getMessage());return false;}
    }
    public static void restoreProfile() {
        try{call(call(rise(),"p"),"tC");}catch(Exception error){System.err.println("[Config] Cannot restore the last profile: "+error.getMessage());}
    }
    private static Object call(Object target,String method)throws Exception{return target.getClass().getMethod(method).invoke(target);}
    private static Object rise()throws Exception {return Class.forName("hackclient.rise.a").getField("a").get(null);}
    private static List<?> modules()throws Exception {return (List<?>)call(call(rise(),"g"),"ef");}
    public static String[] moduleAliases(Object module) {
        try {return (String[])call(module,"getAliases");}catch(Exception error){return new String[0];}
    }
    public static Map<String,String> aliases()throws Exception {
        Map<String,String> result=new HashMap<>();
        for(Object module:modules()) {
            Object info=call(module,"getModuleInfo");String[] canonical=(String[])info.getClass().getMethod("aliases").invoke(info);String token=canonical[0];
            for(String alias:canonical)result.put(alias.toLowerCase(Locale.ROOT),token);
            for(String alias:moduleAliases(module))result.put(alias.toLowerCase(Locale.ROOT),token);
        }
        return result;
    }
    public static String flatten(String text,Map<String,String> aliases,Set<String> themes)throws IOException {
        try {
            JSONObject root=new JSONObject(text);StringBuilder output=new StringBuilder();String theme=root.optString("theme");
            if(themes.contains(theme))output.append("th_").append(theme);output.append('\n');int recognized=0;
            for(String key:root.keySet()) {
                String module=aliases.get(key.toLowerCase(Locale.ROOT));JSONObject data=root.optJSONObject(key);if(module==null||data==null)continue;recognized++;
                if(data.has("state"))output.append(module).append("_e1_").append(data.getBoolean("state")).append('\n');
                if(data.has("keyCode"))output.append(module).append("_kc_").append(data.getInt("keyCode")).append('\n');
                for(String valueName:data.keySet()) {
                    JSONObject fields=data.optJSONObject(valueName);if(fields==null)continue;String setting=valueName;
                    int context=setting.lastIndexOf(" in ");
                    if(context>=0&&setting.endsWith(" Module")) {
                        String parent=setting.substring(context+4,setting.length()-7);String token=aliases.get(parent.toLowerCase(Locale.ROOT));
                        if(token!=null)setting=setting.substring(0,context+4)+token+" Module";
                    }
                    for(String property:fields.keySet()) {
                        Object value=fields.get(property);if(value instanceof JSONObject||value instanceof JSONArray||value==JSONObject.NULL)continue;
                        String scalar=String.valueOf(value).replace('\n',' ').replace('\r',' ');
                        output.append(module).append('_').append(setting).append('_').append(property).append('_').append(scalar).append('\n');
                    }
                }
            }
            if(recognized==0)throw new IOException("The config has no modules supported by this client.");return output.toString();
        }catch(JSONException error){throw new IOException("Invalid config JSON.",error);}
    }
    public static void applyJson(String json)throws Exception {
        Class<?> theme=Class.forName("hackclient.rise.ady");Set<String> themes=new HashSet<>();for(Object value:theme.getEnumConstants())themes.add(((Enum<?>)value).name());
        String flat=flatten(json,aliases(),themes);Class<?> packet=Class.forName("rip.vantage.commons.packet.impl.server.protection.f");Object update=packet.getConstructor(String.class).newInstance(flat);
        Object handler=Class.forName("rip.vantage.network.core.a").getMethod("aKQ").invoke(null);handler=call(handler,"aKY");
        try{handler.getClass().getMethod("a",packet).invoke(handler,update);}catch(InvocationTargetException error){throw new IOException("Config application failed.",error.getCause());}
        onMainThread(()->{try{Object event=Class.forName("hackclient.rise.ev").getConstructor().newInstance();Object bus=call(rise(),"e");bus.getClass().getMethod("d",Object.class).invoke(bus,event);}catch(Exception error){System.err.println("[Config] Refresh event failed: "+error.getMessage());}});
        System.out.println("[Config] Applied module states and values locally.");
    }
    public static boolean containsDelimiter(String value,CharSequence delimiter){return value.contains(delimiter.toString().replace("\\Q","").replace("\\E",""));}
    public static String[] splitConfig(String value,String pattern){return value.split(pattern,-1);}
    public static void onMainThread(Runnable task) {
        try {
            Object client=Class.forName("net.minecraft.client.d").getMethod("AZ").invoke(null);
            Future<?> result=(Future<?>)client.getClass().getMethod("f",Runnable.class).invoke(client,task);result.get(30,TimeUnit.SECONDS);
        }catch(Exception error){throw new CompletionException(error);}
    }
    private static void notifyLoaded(String name){notifyUser("Loaded "+name+" config");}
    private static void notifyError(String reason){notifyUser("Config: "+reason);}
    private static void notifyUser(String message) {
        try{onMainThread(()->{try{Class.forName("hackclient.rise.cg").getMethod("e",String.class,String.class).invoke(null,"Config",message);}catch(Exception ignored){}});}catch(Exception ignored){}
    }
}
