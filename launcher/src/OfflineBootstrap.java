import java.lang.reflect.InvocationTargetException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public final class OfflineBootstrap {
    public static void clientReady(){System.out.println("[Launcher] Client ready.");}
    public static void main(String[] arguments)throws Exception {
        String username=System.getProperty("rise.offline.username","User");
        if(!username.matches("[A-Za-z0-9_]{1,16}"))throw new IllegalArgumentException("Username must contain 1-16 letters, numbers or underscores.");
        System.out.println("[Offline] Local session: "+username);
        NativeRuntime.prepare();
        rise.local.input.RawMouseInput.initialize();
        int dataArgument=Arrays.asList(arguments).indexOf("--gameDir");
        rise.local.config.ConfigRuntime.configure(java.nio.file.Paths.get(dataArgument>=0&&dataArgument+1<arguments.length?arguments[dataArgument+1]:System.getProperty("user.dir")));
        String uuid=UUID.nameUUIDFromBytes(("OfflinePlayer:"+username).getBytes(StandardCharsets.UTF_8)).toString().replace("-","");
        List<String> args=new ArrayList<>(Arrays.asList("--username",username,"--uuid",uuid,"--accessToken","0","--userType","legacy","--version",ClientRelease.VERSION+"-offline"));args.addAll(Arrays.asList(arguments));
        try {Class.forName("net.minecraft.client.main.Main").getMethod("main",String[].class).invoke(null,(Object)args.toArray(new String[0]));}
        catch(InvocationTargetException error){throw new RuntimeException(error.getCause());}
    }
}
