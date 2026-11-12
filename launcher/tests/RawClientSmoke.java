import java.nio.file.*;
import java.util.*;
import rise.local.config.ConfigRuntime;
import rise.local.input.RawMouseInput;
import org.json.JSONObject;

public final class RawClientSmoke {
    public static void main(String[] args)throws Exception {
        Thread tester=new Thread(()->{
            try {
                Class<?> type=Class.forName("net.minecraft.client.d");Object client=null;long timeout=System.currentTimeMillis()+90000;
                while(System.currentTimeMillis()<timeout) {
                    try{client=type.getMethod("AL").invoke(null);Object screen=type.getField("bgi").get(client);if(screen!=null&&screen.getClass().getName().equals("hackclient.rise.adr"))break;}catch(Exception ignored){}
                    Thread.sleep(200);
                }
                if(client==null)throw new AssertionError("Client did not initialize");
                boolean raw=Boolean.parseBoolean(System.getProperty("rise.rawMouse","true"));
                if(RawMouseInput.isAvailable()!=raw)throw new AssertionError("Raw input setting was ignored");
                if(raw&&!RawMouseInput.isRegistered())throw new AssertionError("Raw input is not registered");
                if(RawMouseInput.isCapturing())throw new AssertionError("Raw motion captured the main menu");
                Object game=client;
                ConfigRuntime.onMainThread(()->{try{type.getMethod("a",String.class,String.class,Class.forName("net.minecraft.world.an")).invoke(game,"SmokeWorld","SmokeWorld",null);}catch(Exception error){throw new RuntimeException(error);}});
                while(System.currentTimeMillis()<timeout&&type.getField("bgb").get(client)==null)Thread.sleep(200);
                if(type.getField("bgb").get(client)==null)throw new AssertionError("World did not load");
                Thread.sleep(1500);
                ConfigRuntime.onMainThread(()->{
                    try{Object helper=type.getField("bgv").get(game);helper.getClass().getMethod("atf").invoke(helper);RawMouseInput.syncFocus();if(RawMouseInput.isCapturing())throw new AssertionError("Raw input stayed captured after ungrab");}
                    catch(Exception error){throw new RuntimeException(error);}
                });
                JSONObject report=new JSONObject().put("raw_input",raw).put("registered",raw&&RawMouseInput.isRegistered()).put("world_loaded",true).put("menu_ungrab_passed",true).put("camera_polls",RawMouseInput.polls());
                Files.writeString(Paths.get(System.getProperty("smoke.game"),"raw-smoke-"+raw+".json"),report.toString(2));
                System.out.println("[RawSmoke] World startup and mouse ungrab passed with raw input "+raw+".");type.getMethod("Av").invoke(client);
            }catch(Throwable error){error.printStackTrace();System.exit(2);}
        },"raw-input-smoke");tester.setDaemon(true);tester.start();OfflineBootstrap.main(args);
    }
}
