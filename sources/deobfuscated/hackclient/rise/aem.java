/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package hackclient.rise;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.aen;
import hackclient.rise.ahd;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.net.ssl.HttpsURLConnection;

public class aem
implements ahd {
    private static final String aFo = "https://sessionserver.mojang.com/session/minecraft/profile/";
    private static final Map<UUID, aen> aFp = new ConcurrentHashMap<UUID, aen>();
    private static final long aFq = TimeUnit.MINUTES.toMillis(5L);
    private static long aFr = 0L;
    private static final long aFs = 100L;

    public static void a(UUID uUID, Consumer<Boolean> consumer) {
        if (uUID == null) {
            consumer.accept(false);
            return;
        }
        aen aen2 = aFp.get(uUID);
        if (aen2 != null && !aen2.st()) {
            consumer.accept(aen2.aFt);
            return;
        }
        aNC.execute(() -> {
            boolean bl2 = aem.c(uUID);
            aFp.put(uUID, new aen(bl2));
            consumer.accept(bl2);
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean c(UUID uUID) {
        if (uUID == null) {
            return false;
        }
        Object object = aem.class;
        synchronized (aem.class) {
            long l2 = System.currentTimeMillis();
            long l3 = l2 - aFr;
            if (l3 < 100L) {
                try {
                    Thread.sleep(100L - l3);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    // ** MonitorExit[var1_1] (shouldn't be in output)
                    return false;
                }
            }
            aFr = System.currentTimeMillis();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            object = null;
            try {
                String string = uUID.toString().replace("-", "");
                URL uRL = new URL(aFo + string);
                object = (HttpsURLConnection)uRL.openConnection();
                ((HttpURLConnection)object).setRequestMethod("GET");
                ((URLConnection)object).setConnectTimeout(5000);
                ((URLConnection)object).setReadTimeout(5000);
                ((URLConnection)object).setRequestProperty("User-Agent", "Rise-Client-AntiBot/1.0");
                int n2 = ((HttpURLConnection)object).getResponseCode();
                if (n2 == 200) {
                    String string2;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((string2 = bufferedReader.readLine()) != null) {
                        stringBuilder.append(string2);
                    }
                    bufferedReader.close();
                    try {
                        JsonObject jsonObject = JsonParser.parseString((String)stringBuilder.toString()).getAsJsonObject();
                        if (jsonObject.has("id") && jsonObject.has("name")) {
                            String string3 = jsonObject.get("id").getAsString();
                            boolean bl2 = string3.replace("-", "").equalsIgnoreCase(string);
                            return bl2;
                        }
                    }
                    catch (Exception exception) {
                        boolean bl3 = false;
                        return bl3;
                    }
                    boolean bl4 = false;
                    return bl4;
                }
                if (n2 == 204 || n2 == 404) {
                    boolean bl5 = false;
                    return bl5;
                }
                if (n2 == 429) {
                    boolean bl6 = true;
                    return bl6;
                }
                boolean bl7 = true;
                return bl7;
            }
            catch (Exception exception) {
                boolean bl8 = true;
                return bl8;
            }
            finally {
                if (object != null) {
                    ((HttpURLConnection)object).disconnect();
                }
            }
        }
    }

    public static void sr() {
        aFp.clear();
    }

    public static void ss() {
        aFp.entrySet().removeIf(entry -> ((aen)entry.getValue()).st());
    }
}

