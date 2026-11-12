import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import rise.local.config.*;
import org.json.*;

public final class ClientConfigSmoke {
    private static Object call(Object target,String name)throws Exception{return target.getClass().getMethod(name).invoke(target);}
    private static JSONObject capture()throws Exception{return new JSONObject(Class.forName("hackclient.rise.afw").getMethod("b",boolean.class,boolean.class).invoke(null,true,true).toString());}
    private static void waitUntil(java.util.function.BooleanSupplier ready)throws Exception{long end=System.currentTimeMillis()+90000;while(!ready.getAsBoolean()){if(System.currentTimeMillis()>end)throw new AssertionError("Client readiness timed out");Thread.sleep(200);}}
    public static void main(String[] args)throws Exception {
        Thread tester=new Thread(()->{
            Object client=null;
            try {
                Class<?> minecraft=Class.forName("net.minecraft.client.d");
                waitUntil(()->{try{Object instance=minecraft.getMethod("AL").invoke(null);Object screen=minecraft.getField("bgi").get(instance);return screen!=null&&screen.getClass().getName().equals("hackclient.rise.adr");}catch(Exception error){return false;}});
                client=minecraft.getMethod("AL").invoke(null);Object game=client;
                ConfigRuntime.onMainThread(()->{try{minecraft.getMethod("a",String.class,String.class,Class.forName("net.minecraft.world.an")).invoke(game,"SmokeWorld","SmokeWorld",null);}catch(Exception error){throw new RuntimeException(error);}});
                waitUntil(()->{try{return minecraft.getField("bgb").get(game)!=null&&minecraft.getField("bfW").get(game)!=null;}catch(Exception error){return false;}});
                Path directory=Paths.get(System.getProperty("smoke.game"));OnlineConfigRepository repository=new OnlineConfigRepository(directory.resolve("Rise/online-configs"));
                JSONObject original=capture();JSONArray results=new JSONArray();
                for(OnlineConfigRepository.Entry entry:repository.catalog().entries()) {
                    if(Boolean.getBoolean("smoke.latestOnly")&&!entry.name().equals("Hypixel1.8"))continue;
                    JSONObject expected=new JSONObject(repository.config(entry.name()));ConfigRuntime.applyJson(expected.toString());JSONObject actual=capture();int checked=0;JSONArray mismatches=new JSONArray();
                    for(String module:expected.keySet()) {
                        JSONObject wanted=expected.optJSONObject(module),got=actual.optJSONObject(module);if(wanted==null||got==null)continue;
                        for(String field:wanted.keySet()) {
                            if(field.equals("keyCode")||field.equals("state")){if(got.has(field)){checked++;if(!wanted.get(field).toString().equalsIgnoreCase(got.get(field).toString()))mismatches.put(module+"/"+field);}continue;}
                            JSONObject values=wanted.optJSONObject(field),current=got.optJSONObject(field);if(values==null||current==null)continue;
                            for(String property:values.keySet())if(current.has(property)) {
                                checked++;Object left=values.get(property),right=current.get(property);boolean same;
                                if(left instanceof Number&&right instanceof Number)same=Math.abs(((Number)left).doubleValue()-((Number)right).doubleValue())<0.0001;
                                else same=left.toString().replace("<percentsign>","%").equalsIgnoreCase(right.toString().replace("<percentsign>","%"));
                                if(!same)mismatches.put(module+"/"+field+"/"+property+": "+left+" -> "+right);
                            }
                        }
                    }
                    results.put(new JSONObject().put("config",entry.name()).put("checked",checked).put("mismatches",mismatches));
                    System.out.println("[ConfigSmoke] "+entry.name()+": "+checked+" checks, "+mismatches.length()+" differences.");
                }
                if(Boolean.getBoolean("smoke.latestOnly")) {
                    ConfigRuntime.onMainThread(()->{try {
                        Object page=Class.forName("hackclient.rise.aca").getConstructor().newInstance();java.util.List<?> featured=(java.util.List<?>)call(page,"qk");
                        if(featured.size()!=11)throw new AssertionError("Featured catalog was not routed locally");
                    }catch(Exception error){throw new RuntimeException(error);}});
                    if(!ConfigRuntime.fetchUrl("https://raw.githubusercontent.com/risellc/RiseOnlineConfigs/main/easecation.json").contains("Metadata"))throw new AssertionError("Mixed-case GitHub config failed");
                    Object core=Class.forName("rip.vantage.network.core.a").getMethod("aKC").invoke(null);Object wire=call(core,"aKL");
                    String latest=repository.config("Hypixel1.8");wire.getClass().getMethod("sendMessage",String.class).invoke(wire,new JSONObject().put("id",2).put("a",latest).toString());
                    Object rise=Class.forName("hackclient.rise.a").getField("a").get(null);Object manager=call(rise,"p");Object local=manager.getClass().getMethod("bL",String.class).invoke(manager,"CAS-Hypixel1.8");
                    if(!Boolean.TRUE.equals(call(local,"tf")))throw new AssertionError("Local CAS config loader failed");
                    wire.getClass().getMethod("sendMessage",String.class).invoke(wire,new JSONObject().put("id",10).put("a","Hypixel1.8").toString());Thread.sleep(1000);
                    System.out.println("[ConfigSmoke] Featured GUI, mixed-case download, config packet, local file and config command routes passed.");
                }
                ConfigRuntime.applyJson(original.toString());
                Path report=directory.resolve(Boolean.getBoolean("smoke.latestOnly")?"cas-smoke-routes.json":"cas-smoke.json");Files.writeString(report,new JSONObject().put("revision",repository.catalog().revision()).put("results",results).toString(2));
                System.out.println("[ConfigSmoke] Finished. Report: "+report);
            }catch(Throwable error){error.printStackTrace();System.exit(2);}
            finally{try{if(client!=null)client.getClass().getMethod("Av").invoke(client);}catch(Exception ignored){}}
        },"config-smoke");tester.setDaemon(true);tester.start();OfflineBootstrap.main(args);
    }
}
