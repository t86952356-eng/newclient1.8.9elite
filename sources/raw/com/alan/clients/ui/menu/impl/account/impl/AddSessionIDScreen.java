/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.message.BasicNameValuePair
 *  org.apache.http.util.EntityUtils
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aeq;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import net.minecraft.util.cp;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class AddSessionIDScreen
extends bp
implements aea {
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private final adk[] menuButtons = new adk[4];
    private static agp sessionBox;
    private static bp reference;
    private afj animation;
    private static String statusMessage;
    private static final Runnable FOCUS_BOX;
    private static final Runnable CANCEL;
    private static final Runnable LOGIN;
    private static final Runnable PASTE_AND_LOGIN;

    public AddSessionIDScreen() {
        reference = this;
    }

    @Override
    public void initGui() {
        int n2 = 300;
        int n3 = 24;
        int n4 = 4;
        float f2 = (float)(n2 - n4) / 2.0f;
        aka aka2 = new aka((float)this.width / 2.0f - (float)n2 / 2.0f, (float)this.height / 2.0f - 24.0f);
        sessionBox = new agp(aka2.p(n2 / 2, 8.0), gb.ks.a(24, gd.kH), Color.WHITE, ago.aJT, "Session- / Refresh-Token", n2);
        this.menuButtons[0] = new adp(aka2.x, aka2.y, n2, n3, FOCUS_BOX, "");
        this.menuButtons[1] = new adp(aka2.x, aka2.y + (double)n3 + (double)n4, f2, n3, LOGIN, "Login");
        this.menuButtons[2] = new adp(aka2.x + (double)f2 + (double)n4, aka2.y + (double)n3 + (double)n4, f2, n3, CANCEL, "Cancel");
        this.menuButtons[3] = new adp(aka2.x, aka2.y + (double)(2 * (n3 + n4)), n2, n3, PASTE_AND_LOGIN, "Paste and Log In");
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.animation.Q(0.0);
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(() -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        });
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
        this.b(gg.kV).c(() -> {
            FONT_RENDERER.c(statusMessage, (float)this.width / 2.0f, (double)((float)this.height / 2.0f - 64.0f) + this.animation.sV(), Color.WHITE.getRGB());
            sessionBox.pZ();
        });
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        sessionBox.d(n2, n3, n4);
        for (adk adk2 : this.menuButtons) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            break;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (sessionBox.ud()) {
            sessionBox.b(c2, n2);
        }
    }

    private static void tryMinecraftToken(String string) {
        String[] stringArray = AddSessionIDScreen.getProfile(string);
        AddSessionIDScreen.aER.bgO = new cp(stringArray[0], stringArray[1], string, "mojang");
        statusMessage = "Logged in as " + stringArray[0];
        System.out.println("Logged in as " + stringArray[0] + " (" + stringArray[1] + ")");
    }

    private static String refreshMicrosoftToken(String string) {
        try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();){
            String string2;
            block13: {
                HttpPost httpPost = new HttpPost("https://login.live.com/oauth20_token.srf");
                ArrayList<BasicNameValuePair> arrayList = new ArrayList<BasicNameValuePair>();
                arrayList.add(new BasicNameValuePair("client_id", "00000000402B5328"));
                arrayList.add(new BasicNameValuePair("grant_type", "refresh_token"));
                arrayList.add(new BasicNameValuePair("refresh_token", string));
                arrayList.add(new BasicNameValuePair("scope", "service::user.auth.xboxlive.com::MBI_SSL"));
                httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity(arrayList, StandardCharsets.UTF_8));
                CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                try {
                    String string3 = EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity(), (Charset)StandardCharsets.UTF_8);
                    if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                        throw new IOException("Microsoft refresh failed (HTTP " + closeableHttpResponse.getStatusLine().getStatusCode() + ")");
                    }
                    JsonObject jsonObject = JsonParser.parseString((String)string3).getAsJsonObject();
                    string2 = jsonObject.get("access_token").getAsString();
                    if (closeableHttpResponse == null) break block13;
                }
                catch (Throwable throwable) {
                    if (closeableHttpResponse != null) {
                        try {
                            closeableHttpResponse.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                closeableHttpResponse.close();
            }
            return string2;
        }
    }

    private static String microsoftToMinecraft(String string) {
        try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();){
            Object object;
            block31: {
                JsonObject jsonObject;
                String string2;
                CloseableHttpResponse closeableHttpResponse;
                HttpPost httpPost;
                String string32;
                String string4 = null;
                IOException iOException = null;
                for (String string32 : new HttpPost[]{"d=" + string, string}) {
                    httpPost = new HttpPost("https://user.auth.xboxlive.com/user/authenticate");
                    httpPost.setHeader("Content-Type", "application/json");
                    httpPost.setHeader("Accept", "application/json");
                    httpPost.setEntity((HttpEntity)AddSessionIDScreen.json("{\"Properties\":{\"AuthMethod\":\"RPS\",\"SiteName\":\"user.auth.xboxlive.com\",\"RpsTicket\":\"" + string32 + "\"},\"RelyingParty\":\"http://auth.xboxlive.com\",\"TokenType\":\"JWT\"}"));
                    closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                    try {
                        string2 = EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity(), (Charset)StandardCharsets.UTF_8);
                        if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                            iOException = new IOException("user/authenticate HTTP " + closeableHttpResponse.getStatusLine().getStatusCode());
                            continue;
                        }
                        object = JsonParser.parseString((String)string2).getAsJsonObject();
                        string4 = object.get("Token").getAsString();
                        break;
                    }
                    finally {
                        if (closeableHttpResponse != null) {
                            closeableHttpResponse.close();
                        }
                    }
                }
                if (string4 == null) {
                    throw iOException;
                }
                HttpPost httpPost2 = new HttpPost("https://xsts.auth.xboxlive.com/xsts/authorize");
                httpPost2.setHeader("Content-Type", "application/json");
                httpPost2.setHeader("Accept", "application/json");
                httpPost2.setEntity((HttpEntity)AddSessionIDScreen.json("{\"Properties\":{\"SandboxId\":\"RETAIL\",\"UserTokens\":[\"" + string4 + "\"]},\"RelyingParty\":\"rp://api.minecraftservices.com/\",\"TokenType\":\"JWT\"}"));
                try (Object object2 = closeableHttpClient.execute((HttpUriRequest)httpPost2);){
                    string32 = EntityUtils.toString((HttpEntity)object2.getEntity(), (Charset)StandardCharsets.UTF_8);
                    if (object2.getStatusLine().getStatusCode() != 200) {
                        throw new IOException("xsts/authorize HTTP " + object2.getStatusLine().getStatusCode() + " : " + string32);
                    }
                    jsonObject = JsonParser.parseString((String)string32).getAsJsonObject();
                }
                object2 = jsonObject.getAsJsonObject("DisplayClaims").getAsJsonArray("xui").get(0).getAsJsonObject().get("uhs").getAsString();
                string32 = jsonObject.get("Token").getAsString();
                httpPost = new HttpPost("https://api.minecraftservices.com/authentication/login_with_xbox");
                httpPost.setHeader("Content-Type", "application/json");
                httpPost.setEntity((HttpEntity)AddSessionIDScreen.json("{\"identityToken\":\"XBL3.0 x=" + (String)object2 + ";" + string32 + "\"}"));
                closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                try {
                    string2 = EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity(), (Charset)StandardCharsets.UTF_8);
                    if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                        throw new IOException("login_with_xbox HTTP " + closeableHttpResponse.getStatusLine().getStatusCode() + " : " + string2);
                    }
                    object = JsonParser.parseString((String)string2).getAsJsonObject().get("access_token").getAsString();
                    if (closeableHttpResponse == null) break block31;
                }
                catch (Throwable throwable) {
                    if (closeableHttpResponse != null) {
                        try {
                            closeableHttpResponse.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                closeableHttpResponse.close();
            }
            return object;
        }
    }

    private static StringEntity json(String string) {
        return new StringEntity(string, StandardCharsets.UTF_8);
    }

    private static String[] getProfile(String string) {
        try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();){
            String[] stringArray;
            block13: {
                HttpGet httpGet = new HttpGet("https://api.minecraftservices.com/minecraft/profile");
                httpGet.setHeader("Authorization", "Bearer " + string);
                CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpGet);
                try {
                    String string2 = EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity(), (Charset)StandardCharsets.UTF_8);
                    if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                        throw new IOException("Invalid/expired Minecraft token (HTTP " + closeableHttpResponse.getStatusLine().getStatusCode() + ")");
                    }
                    JsonObject jsonObject = JsonParser.parseString((String)string2).getAsJsonObject();
                    stringArray = new String[]{jsonObject.get("name").getAsString(), jsonObject.get("id").getAsString()};
                    if (closeableHttpResponse == null) break block13;
                }
                catch (Throwable throwable) {
                    if (closeableHttpResponse != null) {
                        try {
                            closeableHttpResponse.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                closeableHttpResponse.close();
            }
            return stringArray;
        }
    }

    static {
        statusMessage = "Enter Session- or Refresh-Token";
        FOCUS_BOX = () -> sessionBox.I(true);
        CANCEL = () -> aER.a(new AccountManagerScreen(reference));
        LOGIN = () -> new Thread(() -> {
            String string = AddSessionIDScreen.sessionBox.Yg.trim();
            if (string.isEmpty()) {
                statusMessage = "Nothing to log in with";
                return;
            }
            try {
                cp cp2 = aeq.bj(string);
                statusMessage = "Logged in as " + cp2.bX();
            }
            catch (IOException iOException) {
                try {
                    statusMessage = "Refreshing Microsoft token \u2026";
                    String string2 = AddSessionIDScreen.refreshMicrosoftToken(string);
                    statusMessage = "Authenticating with Xbox Live \u2026";
                    String string3 = AddSessionIDScreen.microsoftToMinecraft(string2);
                    AddSessionIDScreen.tryMinecraftToken(string3);
                }
                catch (Exception exception) {
                    statusMessage = "Login failed: " + exception.getMessage();
                    exception.printStackTrace();
                    return;
                }
            }
            catch (Exception exception) {
                statusMessage = "Login failed: " + exception.getMessage();
                exception.printStackTrace();
                return;
            }
            try {
                Thread.sleep(600L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            CANCEL.run();
        }, "Session Login Thread").start();
        PASTE_AND_LOGIN = () -> {
            try {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                String string = (String)clipboard.getData(DataFlavor.stringFlavor);
                if (string != null && !string.trim().isEmpty()) {
                    AddSessionIDScreen.sessionBox.Yg = string.trim();
                    LOGIN.run();
                } else {
                    statusMessage = "Clipboard is empty";
                }
            }
            catch (Exception exception) {
                statusMessage = "Paste failed";
                exception.printStackTrace();
            }
        };
    }
}

