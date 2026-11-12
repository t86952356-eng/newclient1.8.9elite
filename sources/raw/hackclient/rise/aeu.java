/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package hackclient.rise;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.util.account.auth.MicrosoftLogin;
import com.alan.clients.util.account.auth.d;
import com.alan.clients.util.account.auth.e;
import com.alan.clients.util.account.auth.f;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.a;
import hackclient.rise.aeo;
import hackclient.rise.aes;
import hackclient.rise.aev;
import hackclient.rise.akf;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.util.cp;

public final class aeu {
    private static final Gson aFS = new Gson();
    private static final String aFT = "https://sisu.xboxlive.com/connect/XboxLive/?state=login&cobrandId=8058f65d-ce06-4c30-9559-473c9275a65d&tid=896928775&ru=https%3A%2F%2Fwww.minecraft.net%2Fen-us%2Flogin&aid=1142970254";

    private aeu() {
    }

    public static aev a(JsonArray jsonArray) {
        HashSet<String> hashSet = new HashSet<String>();
        List<aeo> list = a.a.q().tA();
        for (aeo aeo2 : list) {
            if (aeo2.sx() == null) continue;
            hashSet.add(aeo2.sx().toLowerCase());
        }
        Object object = "";
        int n2 = 0;
        for (JsonElement jsonElement : jsonArray) {
            String string;
            String string2;
            d d2;
            JsonObject jsonObject;
            if (!jsonElement.isJsonObject() || !(jsonObject = jsonElement.getAsJsonObject()).has("content") || jsonObject.get("content").isJsonNull()) continue;
            String string3 = jsonObject.get("content").getAsString().trim();
            boolean bl2 = aeu.bo(string3);
            String string4 = aeu.bp(string3);
            if (!bl2 && string4.isEmpty() || (d2 = bl2 ? aeu.bs(string3) : MicrosoftLogin.loginMarketplaceRefreshToken(string4)) == null || !d2.sC()) continue;
            if (((String)object).isEmpty()) {
                net.minecraft.client.d.AZ().a(new cp(d2.aCU, d2.aFw, d2.aFI, "mojang"));
                object = d2.aCU;
            }
            String string5 = string2 = d2.aFw == null ? "" : d2.aFw.toLowerCase();
            if (!string2.isEmpty() && !hashSet.add(string2)) continue;
            String string6 = string = bl2 ? d2.aCU : aeu.v(aeu.bq(string3), d2.aCU);
            String string7 = bl2 ? (d2.aFJ == null ? "" : d2.aFJ) : string4;
            AccountManagerScreen.addAccount(new aes(string, d2.aFw, d2.aFI, string7));
            ++n2;
        }
        return new aev((String)object, n2);
    }

    public static boolean bo(String string) {
        return string.contains("MSAAUTH=") || string.contains("MSAAUTHP=") || string.contains("__Host-MSAAUTH=") || string.contains("__Host-MSAAUTHP=");
    }

    private static String bp(String string) {
        String string2 = string == null ? "" : string.trim();
        int n2 = string2.indexOf(58);
        if (n2 > 0) {
            string2 = string2.substring(n2 + 1).trim();
        }
        return aeu.br(string2) ? string2 : "";
    }

    private static String bq(String string) {
        String string2 = string == null ? "" : string.trim();
        int n2 = string2.indexOf(58);
        return n2 > 0 ? string2.substring(0, n2).trim() : "";
    }

    private static String v(String string, String string2) {
        return string != null && !string.isEmpty() ? string : (string2 == null ? "" : string2);
    }

    private static boolean br(String string) {
        return string.length() > 100 && string.startsWith("M.") && string.matches("[A-Za-z0-9.!*_-]+");
    }

    private static d bs(String string) {
        try {
            String string2;
            String string3 = string.trim();
            int n2 = string3.indexOf(59);
            if (n2 >= 0) {
                string3 = string3.substring(0, n2);
            }
            if (!string3.contains("=")) {
                return new d();
            }
            HttpsURLConnection httpsURLConnection = aeu.w(aFT, null);
            String string4 = httpsURLConnection.getHeaderField("Location");
            if (string4 == null) {
                return new d();
            }
            httpsURLConnection = aeu.w(string4.replace(" ", "%20"), string3);
            String string5 = httpsURLConnection.getHeaderField("Location");
            if (string5 == null) {
                return new d();
            }
            httpsURLConnection = aeu.w(string5, string3);
            String string6 = httpsURLConnection.getHeaderField("Location");
            if (string6 == null) {
                return new d();
            }
            String string7 = aeu.x(string6, "accessToken");
            if (string7.isEmpty()) {
                return new d();
            }
            String string8 = new String(aeu.bt(string7), StandardCharsets.UTF_8);
            int n3 = string8.indexOf(string2 = "\"rp://api.minecraftservices.com/\",");
            if (n3 < 0) {
                return new d();
            }
            String string9 = string8.substring(n3 + string2.length());
            String string10 = aeu.y(string9, "Token");
            String string11 = aeu.y(string9, "uhs");
            if (string10.isEmpty() || string11.isEmpty()) {
                return new d();
            }
            e e2 = (e)aFS.fromJson(akf.a("https://api.minecraftservices.com/authentication/login_with_xbox", "{\"identityToken\":\"XBL3.0 x=" + string11 + ";" + string10 + "\",\"ensureLegacyEnabled\":true}", true), e.class);
            if (e2 == null || e2.aFF == null) {
                return new d();
            }
            f f2 = (f)aFS.fromJson(akf.I("https://api.minecraftservices.com/minecraft/profile", e2.aFF), f.class);
            if (f2 == null || f2.aFK == null || f2.gK == null) {
                return new d();
            }
            String string12 = MicrosoftLogin.extractRefreshTokenFromCookies(string3);
            return new d(e2.aFF, string12, f2.aFK, f2.gK);
        }
        catch (Exception exception) {
            return new d();
        }
    }

    private static HttpsURLConnection w(String string, String string2) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        httpsURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        if (string2 != null) {
            httpsURLConnection.setRequestProperty("Cookie", string2);
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.connect();
        return httpsURLConnection;
    }

    private static String x(String string, String string2) {
        int n2 = string.indexOf(string2 + "=");
        if (n2 < 0) {
            return "";
        }
        String string3 = string.substring(n2 + string2.length() + 1);
        int n3 = string3.indexOf(38);
        return URLDecoder.decode(n3 >= 0 ? string3.substring(0, n3) : string3, "UTF-8");
    }

    private static byte[] bt(String string) {
        try {
            return Base64.getDecoder().decode(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Base64.getUrlDecoder().decode(string);
        }
    }

    private static String y(String string, String string2) {
        String string3 = "\"" + string2 + "\":\"";
        int n2 = string.indexOf(string3);
        if (n2 < 0) {
            return "";
        }
        int n3 = n2 + string3.length();
        int n4 = string.indexOf(34, n3);
        return n4 < 0 ? "" : string.substring(n3, n4);
    }
}

