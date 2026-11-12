/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.alan.clients.util.account.auth;

import com.alan.clients.util.account.auth.MicrosoftLogin$Handler;
import com.alan.clients.util.account.auth.a;
import com.alan.clients.util.account.auth.d;
import com.alan.clients.util.account.auth.e;
import com.alan.clients.util.account.auth.f;
import com.alan.clients.util.account.auth.g;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;
import hackclient.rise.akf;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.net.ssl.HttpsURLConnection;

public class MicrosoftLogin {
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    private static final String CLIENT_ID = "ba89e6e0-8490-4a26-8746-f389a0d3ccc7";
    private static final String CLIENT_SECRET = "REDACTED_MICROSOFT_CLIENT_SECRET";
    private static final int PORT = 8247;
    private static HttpServer server;
    private static Consumer<String> callback;
    private static final Gson gson;

    private static void browse(String string) {
        String[] stringArray;
        for (String string2 : stringArray = new String[]{"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe " + string + " -incognito", "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe " + string + " -incognito", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " + string + " -incognito", "open -na \"Google Chrome\" --args --incognito \"" + string + "\""}) {
            try {
                Runtime.getRuntime().exec(string2);
                return;
            }
            catch (Exception exception) {
            }
        }
    }

    private static void copy(String string) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(string), null);
    }

    public static void getRefreshToken(Consumer<String> consumer) {
        callback = consumer;
        MicrosoftLogin.startServer();
        MicrosoftLogin.copy("https://login.live.com/oauth20_authorize.srf?client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&response_type=code&redirect_uri=http://localhost:8247&scope=XboxLive.signin%20offline_access&prompt=select_account");
    }

    public static void getRefreshTokenAndOpenBrowser(Consumer<String> consumer) {
        callback = consumer;
        MicrosoftLogin.startServer();
        MicrosoftLogin.browse("https://login.live.com/oauth20_authorize.srf?client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&response_type=code&redirect_uri=http://localhost:8247&scope=XboxLive.signin%20offline_access&prompt=select_account");
    }

    public static String extractRefreshTokenFromCookies(String string) {
        if (string == null || string.trim().isEmpty()) {
            return "";
        }
        try {
            String string2;
            String string3 = "https://login.live.com/oauth20_authorize.srf?client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&response_type=code&redirect_uri=http://localhost:8247&scope=XboxLive.signin%20offline_access&prompt=none";
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL("https://login.live.com/oauth20_authorize.srf?client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&response_type=code&redirect_uri=http://localhost:8247&scope=XboxLive.signin%20offline_access&prompt=none").openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
            httpsURLConnection.setRequestProperty("Cookie", string);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.connect();
            String string4 = httpsURLConnection.getHeaderField("Location");
            String string5 = string2 = string4 == null ? "" : MicrosoftLogin.queryParam(string4, "code");
            if (string2.isEmpty()) {
                System.out.println("[DEBUG] Cookie->refresh got no code (HTTP " + httpsURLConnection.getResponseCode() + ", location=" + (string4 == null ? "null" : string4.substring(0, Math.min(80, string4.length()))) + ")");
                return "";
            }
            a a2 = (a)gson.fromJson(akf.a("https://login.live.com/oauth20_token.srf", "client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&code=" + string2 + "&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&grant_type=authorization_code&redirect_uri=http://localhost:8247", false), a.class);
            if (a2 == null || a2.aFG == null || a2.aFG.isEmpty()) {
                System.out.println("[DEBUG] Cookie->refresh code exchange returned no refresh_token");
                return "";
            }
            return a2.aFG;
        }
        catch (Exception exception) {
            System.out.println("[DEBUG] Cookie->refresh threw: " + String.valueOf(exception));
            return "";
        }
    }

    private static String queryParam(String string, String string2) {
        for (String string3 : new String[]{"?" + string2 + "=", "&" + string2 + "="}) {
            int n2 = string.indexOf(string3);
            if (n2 < 0) continue;
            String string4 = string.substring(n2 + string3.length());
            int n3 = string4.indexOf(38);
            if (n3 >= 0) {
                string4 = string4.substring(0, n3);
            }
            try {
                return URLDecoder.decode(string4, "UTF-8");
            }
            catch (Exception exception) {
                return string4;
            }
        }
        return "";
    }

    public static d login(String string) {
        a a2 = (a)gson.fromJson(akf.a("https://login.live.com/oauth20_token.srf", "client_id=" + MicrosoftLogin.formValue(CLIENT_ID) + "&client_secret=" + MicrosoftLogin.formValue(CLIENT_SECRET) + "&refresh_token=" + MicrosoftLogin.formValue(string) + "&grant_type=refresh_token&redirect_uri=" + MicrosoftLogin.formValue("http://localhost:8247") + "&prompt=select_account", false), a.class);
        return MicrosoftLogin.loginWithMicrosoftAccessToken(a2, string);
    }

    public static d loginMarketplaceRefreshToken(String string) {
        a a2 = (a)gson.fromJson(akf.a("https://login.live.com/oauth20_token.srf", "client_id=00000000402B5328&grant_type=refresh_token&refresh_token=" + MicrosoftLogin.formValue(string) + "&scope=" + MicrosoftLogin.formValue("service::user.auth.xboxlive.com::MBI_SSL"), false), a.class);
        return MicrosoftLogin.loginWithMicrosoftAccessToken(a2, string);
    }

    private static d loginWithMicrosoftAccessToken(a a2, String string) {
        if (a2 == null || a2.aFF == null || a2.aFF.isEmpty()) {
            return new d();
        }
        String string2 = a2.aFF;
        String string3 = a2.aFG == null || a2.aFG.isEmpty() ? string : a2.aFG;
        g g2 = MicrosoftLogin.authenticateXboxLive("d=" + string2);
        if (!MicrosoftLogin.isUsable(g2)) {
            g2 = MicrosoftLogin.authenticateXboxLive(string2);
        }
        if (!MicrosoftLogin.isUsable(g2)) {
            return new d();
        }
        g g3 = (g)gson.fromJson(akf.a("https://xsts.auth.xboxlive.com/xsts/authorize", "{\"Properties\":{\"SandboxId\":\"RETAIL\",\"UserTokens\":[\"" + g2.aFL + "\"]},\"RelyingParty\":\"rp://api.minecraftservices.com/\",\"TokenType\":\"JWT\"}", true), g.class);
        if (g3 == null) {
            return new d();
        }
        e e2 = (e)gson.fromJson(akf.a("https://api.minecraftservices.com/authentication/login_with_xbox", "{\"identityToken\":\"XBL3.0 x=" + g2.aFM.aFN[0].aFO + ";" + g3.aFL + "\"}", true), e.class);
        if (e2 == null) {
            return new d();
        }
        f f2 = (f)gson.fromJson(akf.I("https://api.minecraftservices.com/minecraft/profile", e2.aFF), f.class);
        if (f2 == null) {
            return new d();
        }
        return new d(e2.aFF, string3, f2.aFK, f2.gK);
    }

    private static String formValue(String string) {
        try {
            return URLEncoder.encode(string, "UTF-8");
        }
        catch (Exception exception) {
            return string;
        }
    }

    private static g authenticateXboxLive(String string) {
        return (g)gson.fromJson(akf.a("https://user.auth.xboxlive.com/user/authenticate", "{\"Properties\":{\"AuthMethod\":\"RPS\",\"SiteName\":\"user.auth.xboxlive.com\",\"RpsTicket\":\"" + string + "\"},\"RelyingParty\":\"http://auth.xboxlive.com\",\"TokenType\":\"JWT\"}", true), g.class);
    }

    private static boolean isUsable(g g2) {
        return g2 != null && g2.aFL != null && g2.aFM != null && g2.aFM.aFN != null && g2.aFM.aFN.length > 0 && g2.aFM.aFN[0] != null && g2.aFM.aFN[0].aFO != null;
    }

    private static void startServer() {
        if (server != null) {
            return;
        }
        try {
            server = HttpServer.create(new InetSocketAddress("localhost", 8247), 0);
            server.createContext("/", new MicrosoftLogin$Handler());
            server.setExecutor(executor);
            server.start();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void stopServer() {
        if (server == null) {
            return;
        }
        server.stop(0);
        server = null;
        callback = null;
    }

    static {
        gson = new Gson();
    }
}

