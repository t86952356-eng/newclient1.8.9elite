/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.util.account.auth.MicrosoftLogin;
import com.alan.clients.util.account.auth.e;
import com.alan.clients.util.account.auth.f;
import com.google.gson.Gson;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aee;
import hackclient.rise.aes;
import hackclient.rise.aff;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.akf;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.cz;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public class AddCookieScreen
extends GuiScreen
implements InstanceAccess {
    private static final long RECENT_LOCALTS_ORDER_WINDOW = 600000L;
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private final adk[] menuButtons = new adk[4];
    private static agp usernameBox;
    private static GuiScreen reference;
    private static String text_to_render;
    private static String[] cookie_string;
    private afj animation;
    private static final Gson gson;
    private static final Runnable TEXT_BOX_RUNNABLE;
    private static final Runnable CANCEL_RUNNABLE;
    private static final Runnable SELECT_FILE_RUNNABLE;
    private static final Runnable LOGIN_RUNNABLE;
    private static final Runnable BACKGROUND_RUNNABLE;

    private static boolean isSisuOAuthCallback(String string) {
        if (string == null) {
            return false;
        }
        try {
            URI uRI = URI.create(string);
            String string2 = uRI.getRawQuery();
            return "https".equalsIgnoreCase(uRI.getScheme()) && "sisu.xboxlive.com".equalsIgnoreCase(uRI.getHost()) && "/connect/oauth/XboxLive".equalsIgnoreCase(uRI.getPath()) && string2 != null && string2.contains("code=") && string2.contains("state=");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public AddCookieScreen() {
        reference = this;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.animation.Q(0.0);
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        this.b(gg.kV).c(() -> {
            FONT_RENDERER.c(text_to_render, this.width / 2, (double)(this.height / 2 - 64) + this.animation.sV(), Color.WHITE.getRGB());
            usernameBox.pZ();
        });
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        usernameBox.d(n2, n3, n4);
        for (adk adk2 : this.menuButtons) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            break;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (usernameBox.ud()) {
            usernameBox.b(c2, n2);
        }
    }

    public static String parseNetscapeCookie(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(string2.split("\n")).filter(string -> string.contains("live.com")).map(string -> string.split("\t")).filter(stringArray -> ((String[])stringArray).length > 6).forEach(stringArray -> stringBuilder.append(String.format("%s=%s; ", stringArray[5], stringArray[6])));
        if (stringBuilder.toString().isEmpty()) {
            return null;
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    @Override
    public void initGui() {
        int n2 = 200;
        int n3 = 24;
        int n4 = 4;
        float f2 = (float)(n2 - n4 * 2) / 3.0f;
        Vector2d vector2d = new Vector2d(this.width / 2 - n2 / 2, this.height / 2 - 24);
        usernameBox = new agp(vector2d.p(n2 / 2, 8.0), gb.ks.a(24, gd.kH), Color.WHITE, ago.aJT, "Username", n2);
        this.menuButtons[0] = new adp(vector2d.x, vector2d.y, n2, n3, TEXT_BOX_RUNNABLE, "");
        this.menuButtons[1] = new adp(vector2d.x, vector2d.y + (double)n3 + (double)n4, n2, n3, SELECT_FILE_RUNNABLE, "Select File");
        this.menuButtons[2] = new adp(vector2d.x, vector2d.y + (double)((n3 + n4) * 2), (double)(n2 / 2) * 1.5, n3, LOGIN_RUNNABLE, "Login & Add");
        this.menuButtons[3] = new adp(vector2d.x + (double)(n2 / 2) * 1.5 + (double)n4, vector2d.y + (double)((n3 + n4) * 2), (double)(n2 / 2) * 0.5 - (double)n4, n3, CANCEL_RUNNABLE, "Cancel");
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
    }

    static {
        text_to_render = "Select file";
        gson = new Gson();
        TEXT_BOX_RUNNABLE = () -> usernameBox.I(true);
        CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
        SELECT_FILE_RUNNABLE = () -> new Thread(() -> {
            FileDialog fileDialog = new FileDialog((Frame)null, "Select Cookie File");
            fileDialog.setMode(0);
            File file = aff.g(600000L);
            if (file != null) {
                fileDialog.setDirectory(file.getAbsolutePath());
            }
            fileDialog.setVisible(true);
            if (fileDialog.getFile() == null || fileDialog.getDirectory() == null) {
                fileDialog.dispose();
                return;
            }
            fileDialog.dispose();
            String string = new File(fileDialog.getDirectory() + fileDialog.getFile()).getAbsolutePath();
            try {
                StringBuilder stringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(new FileReader(string));
                while (scanner.hasNextLine()) {
                    stringBuilder.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
                usernameBox.bX(fileDialog.getFile());
                text_to_render = "Selected file!";
                cookie_string = stringBuilder.toString().split("\n");
            }
            catch (IOException iOException) {
                text_to_render = "Error (read)";
            }
        }, "Select Cookie File").start();
        LOGIN_RUNNABLE = () -> new Thread(() -> {
            try {
                if (cookie_string.length != 0) {
                    String string;
                    Object object;
                    String string22;
                    StringBuilder stringBuilder = new StringBuilder();
                    ArrayList<String> arrayList = new ArrayList<String>();
                    for (String string22 : cookie_string) {
                        object = string22.split("\t");
                        if (((String[])object).length < 7) {
                            System.out.println("[DEBUG] Skipping malformed cookie line");
                            continue;
                        }
                        String string3 = string = object[0].startsWith(".") ? object[0].substring(1) : object[0];
                        if (!string.equals("live.com") && !string.endsWith(".live.com") || arrayList.contains(object[5])) continue;
                        stringBuilder.append(object[5]).append("=").append(object[6]).append("; ");
                        arrayList.add(object[5]);
                    }
                    stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 2));
                    Object object2 = (HttpsURLConnection)new URL("https://sisu.xboxlive.com/connect/XboxLive/?state=login&cobrandId=8058f65d-ce06-4c30-9559-473c9275a65d&tid=896928775&ru=https%3A%2F%2Fwww.minecraft.net%2Fen-us%2Flogin&aid=1142970254").openConnection();
                    ((HttpURLConnection)object2).setRequestMethod("GET");
                    ((URLConnection)object2).setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                    ((URLConnection)object2).setRequestProperty("Accept-Encoding", "niggas");
                    ((URLConnection)object2).setRequestProperty("Accept-Language", "en-US;q=0.8");
                    ((URLConnection)object2).setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
                    ((HttpURLConnection)object2).setInstanceFollowRedirects(false);
                    ((URLConnection)object2).connect();
                    String string4 = ((URLConnection)object2).getHeaderField("Location").replaceAll(" ", "%20");
                    object2 = (HttpsURLConnection)new URL(string4).openConnection();
                    ((HttpURLConnection)object2).setRequestMethod("GET");
                    ((URLConnection)object2).setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                    ((URLConnection)object2).setRequestProperty("Accept-Encoding", "niggas");
                    ((URLConnection)object2).setRequestProperty("Accept-Language", "fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7");
                    ((URLConnection)object2).setRequestProperty("Cookie", stringBuilder.toString());
                    ((URLConnection)object2).setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
                    ((HttpURLConnection)object2).setInstanceFollowRedirects(false);
                    ((URLConnection)object2).connect();
                    String string5 = ((URLConnection)object2).getHeaderField("Location");
                    object2 = (HttpsURLConnection)new URL(string5).openConnection();
                    ((HttpURLConnection)object2).setRequestMethod("GET");
                    ((URLConnection)object2).setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                    ((URLConnection)object2).setRequestProperty("Accept-Encoding", "niggas");
                    ((URLConnection)object2).setRequestProperty("Accept-Language", "fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7");
                    ((URLConnection)object2).setRequestProperty("Cookie", stringBuilder.toString());
                    ((URLConnection)object2).setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
                    ((HttpURLConnection)object2).setInstanceFollowRedirects(false);
                    ((URLConnection)object2).connect();
                    string22 = ((URLConnection)object2).getHeaderField("Location");
                    if (AddCookieScreen.isSisuOAuthCallback(string22)) {
                        object2 = (HttpsURLConnection)new URL(string22).openConnection();
                        ((HttpURLConnection)object2).setRequestMethod("GET");
                        ((URLConnection)object2).setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                        ((URLConnection)object2).setRequestProperty("Accept-Language", "en-US,en;q=0.8");
                        ((URLConnection)object2).setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
                        ((HttpURLConnection)object2).setInstanceFollowRedirects(false);
                        ((URLConnection)object2).connect();
                        string22 = ((URLConnection)object2).getHeaderField("Location");
                    }
                    if (string22 == null || !string22.contains("accessToken=")) {
                        text_to_render = "Invalid Account";
                        return;
                    }
                    object = string22.split("accessToken=")[1];
                    string = new String(Base64.getDecoder().decode((String)object), StandardCharsets.UTF_8).split("\"rp://api.minecraftservices.com/\",")[1];
                    String string6 = string.split("\"Token\":\"")[1].split("\"")[0];
                    String string7 = string.split(Pattern.quote("{\"DisplayClaims\":{\"xui\":[{\"uhs\":\""))[1].split("\"")[0];
                    String string8 = "XBL3.0 x=" + string7 + ";" + string6;
                    e e2 = (e)gson.fromJson(akf.a("https://api.minecraftservices.com/authentication/login_with_xbox", "{\"identityToken\":\"" + string8 + "\",\"ensureLegacyEnabled\":true}", true), e.class);
                    if (e2 == null) {
                        text_to_render = "Error (Invalid Acc)";
                        return;
                    }
                    f f2 = (f)gson.fromJson(akf.I("https://api.minecraftservices.com/minecraft/profile", e2.aFF), f.class);
                    if (f2 == null) {
                        text_to_render = "Error (Invalid Acc)";
                        return;
                    }
                    String string9 = MicrosoftLogin.extractRefreshTokenFromCookies(stringBuilder.toString());
                    aes aes2 = new aes(f2.gK, f2.aFK, e2.aFF, string9);
                    System.out.println("Name: " + f2.gK + ", UUID: " + f2.aFK);
                    aes2.su();
                    System.out.println("[DEBUG] Proceeding to CANCEL_RUNNABLE");
                    AccountManagerScreen.addAccount(aes2);
                    CANCEL_RUNNABLE.run();
                }
            }
            catch (Exception exception) {
                System.out.println("[DEBUG] Exception during login: " + exception.getMessage());
                text_to_render = "Invalid Account";
            }
        }, "Login To Cookie").start();
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
    }
}

