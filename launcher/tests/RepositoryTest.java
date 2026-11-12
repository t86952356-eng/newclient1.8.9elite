package rise.local.config;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import com.sun.net.httpserver.*;
import org.json.*;

public final class RepositoryTest {
    public static void main(String[] args)throws Exception {
        AtomicInteger version=new AtomicInteger(1),requests=new AtomicInteger();Map<Integer,byte[]> payloads=new HashMap<>();
        for(int value=1;value<=3;value++)payloads.put(value,("{\"Metadata\":{\"version\":\"6\"},\"module.movement.speed.name\":{\"state\":false,\"Speed in module.movement.speed.name Module\":{\"value\":"+value+"}}}").getBytes(StandardCharsets.UTF_8));
        HttpServer server=HttpServer.create(new InetSocketAddress("127.0.0.1",0),0);
        server.createContext("/",exchange->{
            requests.incrementAndGet();int current=version.get();String revision=String.valueOf(current).repeat(40),path=exchange.getRequestURI().getPath();byte[] bytes;
            if(path.endsWith("commits/main"))bytes=("{\"sha\":\""+revision+"\",\"commit\":{\"committer\":{\"date\":\"2026-10-11T00:00:00Z\"}}}").getBytes(StandardCharsets.UTF_8);
            else if(path.contains("git/trees/"))bytes=("{\"tree\":[{\"type\":\"blob\",\"path\":\"Easecation.json\",\"sha\":\""+blob(payloads.get(current))+"\"},{\"type\":\"blob\",\"path\":\"latest.json\",\"sha\":\""+"0".repeat(40)+"\"}]}").getBytes(StandardCharsets.UTF_8);
            else if(path.endsWith("index.json"))bytes="[{\"name\":\"Easecation\",\"ip\":\"example.test\",\"last updated\":\"11/10/2026\"},{\"name\":\"coming soon\",\"ip\":\"null\"}]".getBytes(StandardCharsets.UTF_8);
            else if(path.endsWith("Easecation.json"))bytes=current==3?"corrupt".getBytes(StandardCharsets.UTF_8):payloads.get(current);
            else {exchange.sendResponseHeaders(404,-1);exchange.close();return;}
            exchange.sendResponseHeaders(200,bytes.length);exchange.getResponseBody().write(bytes);exchange.close();
        });
        server.start();Path folder=Paths.get(args[0]);URI base=URI.create("http://127.0.0.1:"+server.getAddress().getPort()+"/");
        try {
            OnlineConfigRepository repository=new OnlineConfigRepository(folder,base.resolve("api/"),base.resolve("raw/"));
            repository.refresh();check(repository.find("easecation.json").file().equals("Easecation.json"),"Case-sensitive repository path");
            check(repository.catalog().entries().size()==1,"Placeholder or latest profile leaked into catalog");
            check(repository.config("Easecation").contains("\"value\":1"),"First revision not loaded");
            version.set(2);repository.refresh();check(repository.config("EASECATION").contains("\"value\":2"),"Updated revision not loaded");
            int count=requests.get();repository.refresh();check(requests.get()==count+1,"Unchanged revision downloaded again");
            Path exported=repository.export("CAS-Easecation",folder.resolve("exports"));check(exported.getFileName().toString().equals("CAS-Easecation.json"),"Export overwrote local latest profile");
            version.set(3);try{repository.refresh();throw new AssertionError("Invalid checksum accepted");}catch(java.io.IOException expected){}
            check(repository.catalog().revision().equals("2".repeat(40)),"Failed update replaced catalog");
            check(repository.config("Easecation").contains("\"value\":2"),"Failed update damaged last working config");
            server.stop(0);OnlineConfigRepository offline=new OnlineConfigRepository(folder,base.resolve("api/"),base.resolve("raw/"));check(offline.config("Easecation").contains("\"value\":2"),"Offline cache failed");
            String flat=ConfigRuntime.flatten("{\"theme\":\"BLEND\",\"Speed\":{\"state\":true,\"Text in Speed Module\":{\"value\":\"\"},\"Label in Speed Module\":{\"value\":\"a_b%\"}}}",Map.of("speed","module.movement.speed.name"),Set.of("BLEND"));
            check(flat.contains("Text in module.movement.speed.name Module_value_\n"),"Localized context was not canonicalized");
            check(ConfigRuntime.splitConfig("prefix_value_","_value_")[1].isEmpty(),"Empty string was lost");
            check(ConfigRuntime.containsDelimiter("a_value_b","_\\Qvalue\\E_"),"String value delimiter failed");
            try{ConfigRuntime.flatten("{\"Metadata\":{\"version\":\"6\"}}",Map.of("speed","speed"),Set.of());throw new AssertionError("Empty config accepted");}catch(java.io.IOException expected){}
            System.out.println("CAS revision updates, case handling, checksums, failed-update recovery, offline cache and config serialization passed.");
        }finally{server.stop(0);}
    }
    private static String blob(byte[] bytes){try{MessageDigest digest=MessageDigest.getInstance("SHA-1");digest.update(("blob "+bytes.length+"\0").getBytes(StandardCharsets.UTF_8));return HexFormat.of().formatHex(digest.digest(bytes));}catch(Exception error){throw new RuntimeException(error);}}
    private static void check(boolean value,String message){if(!value)throw new AssertionError(message);}
}
