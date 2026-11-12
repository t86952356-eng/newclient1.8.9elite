/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.src.a;

public class l {
    private static String elm = null;
    public static final String eln = "http://s.optifine.net";
    public static final String elo = "http://optifine.net";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] io(String string) {
        byte[] byArray;
        HttpURLConnection httpURLConnection = null;
        try {
            int n2;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(Minecraft.getMinecraft().Bp());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                if (httpURLConnection.getErrorStream() != null) {
                    a.i(httpURLConnection.getErrorStream());
                }
                throw new IOException("HTTP response: " + httpURLConnection.getResponseCode());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] byArray2 = new byte[httpURLConnection.getContentLength()];
            int n3 = 0;
            do {
                if ((n2 = inputStream.read(byArray2, n3, byArray2.length - n3)) >= 0) continue;
                throw new IOException("Input stream closed: " + string);
            } while ((n3 += n2) < byArray2.length);
            byArray = byArray2;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(String string, Map map, byte[] byArray) {
        String string2;
        HttpURLConnection httpURLConnection = null;
        try {
            String string3;
            Object object;
            Object object2;
            Object object32;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(Minecraft.getMinecraft().Bp());
            httpURLConnection.setRequestMethod("POST");
            if (map != null) {
                for (Object object32 : map.keySet()) {
                    object2 = (String)object32;
                    object = String.valueOf(map.get(object2));
                    httpURLConnection.setRequestProperty((String)object2, (String)object);
                }
            }
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            httpURLConnection.setRequestProperty("Content-Length", "" + byArray.length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(byArray);
            outputStream.flush();
            outputStream.close();
            object32 = httpURLConnection.getInputStream();
            object2 = new InputStreamReader((InputStream)object32, StandardCharsets.US_ASCII);
            object = new BufferedReader((Reader)object2);
            StringBuffer stringBuffer = new StringBuffer();
            while ((string3 = ((BufferedReader)object).readLine()) != null) {
                stringBuffer.append(string3);
                stringBuffer.append('\r');
            }
            ((BufferedReader)object).close();
            string2 = stringBuffer.toString();
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return string2;
    }

    public static synchronized String aDg() {
        if (elm == null) {
            try {
                boolean bl2 = a.p(System.getProperty("player.models.local"), false);
                if (bl2) {
                    File file = Minecraft.getMinecraft().bhf;
                    File file2 = new File(file, "playermodels");
                    elm = file2.toURI().toURL().toExternalForm();
                }
            }
            catch (Exception exception) {
                a.warn(exception.getClass().getName() + ": " + exception.getMessage());
            }
            if (elm == null) {
                elm = eln;
            }
        }
        return elm;
    }
}

