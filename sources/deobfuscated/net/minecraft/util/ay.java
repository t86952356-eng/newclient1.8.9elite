/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
package net.minecraft.util;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.az;
import net.minecraft.util.be;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ay {
    public static final ListeningExecutorService dyj = MoreExecutors.listeningDecorator((ExecutorService)Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build()));
    private static final AtomicInteger dyk = new AtomicInteger(0);
    private static final Logger dyl = LogManager.getLogger();

    public static String r(Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append('=');
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static String a(URL uRL, Map<String, Object> map, boolean bl2) {
        return ay.a(uRL, ay.r(map), bl2);
    }

    private static String a(URL uRL, String string, boolean bl2) {
        try {
            String string2;
            Proxy proxy;
            Proxy proxy2 = proxy = MinecraftServer.afs() == null ? null : MinecraftServer.afs().alM();
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (!bl2) {
                dyl.error("Could not post to " + String.valueOf(uRL), (Throwable)exception);
            }
            return "";
        }
    }

    public static ListenableFuture<Object> a(File file, String string, Map<String, String> map, int n2, be be2, Proxy proxy) {
        ListenableFuture listenableFuture = dyj.submit((Runnable)new az(be2, string, proxy, map, file, n2));
        return listenableFuture;
    }

    public static int atj() {
        ServerSocket serverSocket = null;
        int n2 = -1;
        try {
            serverSocket = new ServerSocket(0);
            n2 = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException iOException) {}
        }
        return n2;
    }

    public static String a(URL uRL) {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string);
            stringBuilder.append('\r');
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}

