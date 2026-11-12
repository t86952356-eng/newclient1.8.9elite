/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.src.a;
import net.optifine.http.c;
import net.optifine.http.e;
import net.optifine.http.f;
import net.optifine.http.h;
import net.optifine.http.j;
import net.optifine.http.k;

public class d {
    private static final Map ekp = new HashMap();
    public static final String ekq = "User-Agent";
    public static final String ekr = "Host";
    public static final String eks = "Accept";
    public static final String ekt = "Location";
    public static final String eku = "Keep-Alive";
    public static final String ekv = "Connection";
    public static final String ekw = "keep-alive";
    public static final String ekx = "Transfer-Encoding";
    public static final String eky = "chunked";

    public static void a(String string, c c2) {
        d.a(string, c2, Proxy.NO_PROXY);
    }

    public static void a(String string, c c2, Proxy proxy) {
        j j2 = d.a(string, proxy);
        h h2 = new h(j2, c2);
        d.a(h2);
    }

    public static j a(String string, Proxy proxy) {
        URL uRL = new URL(string);
        if (!uRL.getProtocol().equals("http")) {
            throw new IOException("Only protocol http is supported: " + String.valueOf(uRL));
        }
        String string2 = uRL.getFile();
        String string3 = uRL.getHost();
        int n2 = uRL.getPort();
        if (n2 <= 0) {
            n2 = 80;
        }
        String string4 = "GET";
        String string5 = "HTTP/1.1";
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(ekq, "Java/" + System.getProperty("java.version"));
        linkedHashMap.put(ekr, string3);
        linkedHashMap.put(eks, "text/html, image/gif, image/png");
        linkedHashMap.put(ekv, ekw);
        byte[] byArray = new byte[]{};
        j j2 = new j(string3, n2, proxy, "GET", string2, "HTTP/1.1", linkedHashMap, byArray);
        return j2;
    }

    public static void a(h h2) {
        j j2 = h2.aCX();
        f f2 = d.a(j2.ajZ(), j2.getPort(), j2.Bp());
        while (!f2.b(h2)) {
            d.a(j2.ajZ(), j2.getPort(), j2.Bp(), f2);
            f2 = d.a(j2.ajZ(), j2.getPort(), j2.Bp());
        }
    }

    private static synchronized f a(String string, int n2, Proxy proxy) {
        String string2 = d.b(string, n2, proxy);
        f f2 = (f)ekp.get(string2);
        if (f2 == null) {
            f2 = new f(string, n2, proxy);
            ekp.put(string2, f2);
        }
        return f2;
    }

    private static synchronized void a(String string, int n2, Proxy proxy, f f2) {
        String string2 = d.b(string, n2, proxy);
        f f3 = (f)ekp.get(string2);
        if (f3 == f2) {
            ekp.remove(string2);
        }
    }

    private static String b(String string, int n2, Proxy proxy) {
        String string2 = string + ":" + n2 + "-" + String.valueOf(proxy);
        return string2;
    }

    public static byte[] io(String string) {
        return d.b(string, Proxy.NO_PROXY);
    }

    public static byte[] b(String string, Proxy proxy) {
        if (string.startsWith("file:")) {
            URL uRL = new URL(string);
            InputStream inputStream = uRL.openStream();
            byte[] byArray = a.i(inputStream);
            return byArray;
        }
        j j2 = d.a(string, proxy);
        k k2 = d.a(j2);
        if (k2.aDe() / 100 != 2) {
            throw new IOException("HTTP response: " + k2.aDe());
        }
        return k2.aDc();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static k a(j j2) {
        HashMap hashMap = new HashMap();
        String string = "Response";
        String string2 = "Exception";
        e e2 = new e(hashMap);
        HashMap hashMap2 = hashMap;
        synchronized (hashMap2) {
            h h2 = new h(j2, e2);
            d.a(h2);
            try {
                hashMap.wait();
            }
            catch (InterruptedException interruptedException) {
                throw new InterruptedIOException("Interrupted");
            }
            Exception exception = (Exception)hashMap.get("Exception");
            if (exception != null) {
                if (exception instanceof IOException) {
                    throw (IOException)exception;
                }
                if (exception instanceof RuntimeException) {
                    throw (RuntimeException)exception;
                }
                throw new RuntimeException(exception.getMessage(), exception);
            }
            k k2 = (k)hashMap.get("Response");
            if (k2 == null) {
                throw new IOException("Response is null");
            }
            return k2;
        }
    }

    public static boolean aCP() {
        for (Object v2 : ekp.values()) {
            f f2 = (f)v2;
            if (!f2.aCP()) continue;
            return true;
        }
        return false;
    }
}

