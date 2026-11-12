import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import org.json.*;
import rise.local.config.ConfigRuntime;

public final class StandaloneClientSmoke {
    private static Object call(Object owner,String name)throws Exception{return owner.getClass().getMethod(name).invoke(owner);}
    public static void main(String[] args)throws Exception {
        Path game=Paths.get(System.getProperty("smoke.game")).toAbsolutePath().normalize();
        if(!game.toString().replace('\\','/').contains("/work/launcher-2.6-update/"))throw new IllegalArgumentException("Use an isolated smoke profile.");
        Thread probe=new Thread(()->{
            JSONObject result=new JSONObject();Object client=null;
            try {
                Class<?> type=Class.forName("net.minecraft.client.d");long deadline=System.currentTimeMillis()+120000;
                while(System.currentTimeMillis()<deadline){
                    client=type.getMethod("AZ").invoke(null);
                    if(client!=null){Object screen=type.getField("bgR").get(client);if(screen!=null&&screen.getClass().getName().equals("hackclient.rise.adu"))break;}
                    Thread.sleep(200);
                }
                if(client==null||type.getField("bgR").get(client)==null||!type.getField("bgR").get(client).getClass().getName().equals("hackclient.rise.adu"))throw new AssertionError("Main menu was not reached.");
                result.put("mainMenu",true);System.out.println("[Smoke] Main menu reached.");
                Object core=Class.forName("hackclient.rise.a").getField("a").get(null);
                result.put("version",Class.forName("hackclient.rise.a").getField("d").get(null));
                List<?> modules=(List<?>)call(call(core,"g"),"ef");result.put("modules",modules.size());
                JSONObject profile=new JSONObject(Files.readString(game.resolve("Rise/configs/latest.json")));int checked=0;JSONArray differences=new JSONArray();Object guiModule=null;
                for(Object module:modules){
                    Object info=call(module,"getModuleInfo");String alias=((String[])info.getClass().getMethod("aliases").invoke(info))[0];
                    if(alias.contains("clickgui"))guiModule=module;
                    JSONObject value=profile.optJSONObject(alias);
                    if(value==null||!value.has("state")||!Boolean.TRUE.equals(info.getClass().getMethod("allowDisable").invoke(info)))continue;
                    checked++;if(!Objects.equals(value.getBoolean("state"),call(module,"isEnabled")))differences.put(alias);
                }
                result.put("defaultConfigChecks",checked).put("defaultConfigDifferences",differences);
                if(checked<80||differences.length()!=0)throw new AssertionError("Initial config differs: "+differences);
                if(guiModule==null)throw new AssertionError("Click GUI module missing.");
                Object clickGui=guiModule,instance=client;
                ConfigRuntime.onMainThread(()->{try{clickGui.getClass().getMethod("setEnabled",boolean.class).invoke(clickGui,true);}catch(Exception error){throw new RuntimeException(error);}});
                Thread.sleep(1600);
                if(type.getField("bgR").get(client)==null)throw new AssertionError("Click GUI did not open.");result.put("clickGui",type.getField("bgR").get(client).getClass().getName());
                ConfigRuntime.onMainThread(()->{try{
                    clickGui.getClass().getMethod("setEnabled",boolean.class).invoke(clickGui,false);
                    Class<?> screen=Class.forName("net.minecraft.client.gui.bp");
                    Object accounts=Class.forName("com.alan.clients.ui.menu.impl.account.AccountManagerScreen").getConstructor(screen).newInstance(type.getField("bgR").get(instance));
                    type.getMethod("a",screen).invoke(instance,accounts);
                }catch(Exception error){throw new RuntimeException(error);}});
                Thread.sleep(1600);result.put("altsScreen",type.getField("bgR").get(client).getClass().getName());
                Class<?> mode=Class.forName("net.minecraft.world.ao"),worldType=Class.forName("net.minecraft.world.ap"),settings=Class.forName("net.minecraft.world.an");
                Object creative=mode.getMethod("gC",String.class).invoke(null,"creative");Object flat=worldType.getMethod("gD",String.class).invoke(null,"flat");
                Object worldSettings=settings.getConstructor(long.class,mode,boolean.class,boolean.class,worldType).newInstance(472831L,creative,true,false,flat);
                ConfigRuntime.onMainThread(()->{try{type.getMethod("a",String.class,String.class,settings).invoke(instance,"RiseSmoke","Rise Smoke",worldSettings);}catch(Exception error){throw new RuntimeException(error);}});
                while(System.currentTimeMillis()<deadline&&type.getField("bgK").get(client)==null)Thread.sleep(200);
                if(type.getField("bgK").get(client)==null)throw new AssertionError("World did not load.");
                Thread.sleep(5000);result.put("worldLoaded",true);
                result.put("rawInputAvailable",rise.local.input.RawMouseInput.isAvailable());
                result.put("rawInputRegistered",rise.local.input.RawMouseInput.isRegistered());
                if(!rise.local.input.RawMouseInput.isRegistered())throw new AssertionError("Raw input receiver is not registered.");
                result.put("complete",true);System.out.println("[Smoke] Menu, default config, Click GUI, Alts, world and raw input passed.");
            }catch(Throwable error){result.put("failure",error.toString());error.printStackTrace();}
            finally{
                try{Files.writeString(game.resolve("standalone-smoke.json"),result.toString(2));}catch(Exception error){error.printStackTrace();}
                try{if(client!=null)client.getClass().getMethod("AJ").invoke(client);}catch(Exception error){error.printStackTrace();System.exit(2);}
            }
        },"standalone-smoke");probe.setDaemon(true);probe.start();OfflineBootstrap.main(args);
    }
}
