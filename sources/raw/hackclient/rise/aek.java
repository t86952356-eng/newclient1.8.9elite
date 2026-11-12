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
import hackclient.rise.aea;
import hackclient.rise.ael;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.client.entity.a;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.util.cm;

public class aek
implements aea {
    private static final Map<String, cm> aFb = new HashMap<String, cm>();
    private static final String aFc = "https://api.mojang.com/users/profiles/minecraft/";
    private static final String[] aFd = new String[]{"https://mc-heads.net/avatar/%s/%d", "https://minotar.net/avatar/%s/%d", "https://cravatar.eu/helmavatar/%s/%d.png"};
    private static int aFe = 0;

    public static cm a(ael ael2, String string, int n2) {
        String string2 = string + "_" + ael2.name() + "_" + n2;
        if (aFb.containsKey(string2)) {
            return aFb.get(string2);
        }
        String string3 = aek.b(ael2, string, n2);
        cm cm2 = new cm("skins/" + string + "_" + ael2.name() + "_" + n2);
        ThreadDownloadImageData threadDownloadImageData = new ThreadDownloadImageData(null, string3, null, null);
        aER.Bq().a(cm2, threadDownloadImageData);
        aFb.put(string2, cm2);
        a.a(cm2, string);
        return cm2;
    }

    private static String b(ael ael2, String string, int n2) {
        String string2 = aFd[aFe];
        switch (ael2.ordinal()) {
            default: {
                return String.format(string2, string, n2);
            }
            case 2: {
                if (aFe == 0) {
                    return "https://mc-heads.net/bust/" + string + "/" + n2;
                }
                return String.format(string2, string, n2);
            }
            case 4: 
            case 5: {
                if (aFe == 0) {
                    return "https://mc-heads.net/body/" + string + "/" + n2;
                }
                return String.format(string2, string, n2);
            }
            case 6: 
        }
        if (aFe == 0) {
            return "https://mc-heads.net/head/" + string + "/" + n2;
        }
        return String.format(string2, string, n2);
    }

    public static void so() {
        aFe = (aFe + 1) % aFd.length;
        aFb.clear();
    }

    public static String sp() {
        return aFd[aFe].split("/")[2];
    }

    public static String bd(String string) {
        String string2 = aek.be(aFc + string);
        JsonObject jsonObject = JsonParser.parseString((String)string2).getAsJsonObject();
        if (jsonObject == null || !jsonObject.has("id")) {
            return null;
        }
        return jsonObject.get("id").getAsString();
    }

    private static String be(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String string2;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
            httpsURLConnection.setRequestProperty("User-Agent", "Chrome Version 88.0.4324.150");
            httpsURLConnection.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string2).append(System.lineSeparator());
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return stringBuilder.toString();
    }

    public static String bf(String string) {
        return null;
    }
}

