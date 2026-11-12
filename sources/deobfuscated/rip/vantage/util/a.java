/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.websocket.Session
 *  javax.websocket.WebSocketContainer
 *  nl.hidden.Hidden0
 *  org.json.JSONObject
 */
package rip.vantage.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import nl.Loader;
import nl.hidden.Hidden0;
import org.json.JSONObject;
import rip.vantage.util.b;
import rip.vantage.util.c;
import rise.module.Module;

public class a {
    public static native boolean a(SecurityManager var0, int var1);

    public static native boolean b(Class<?> var0, String var1, Class<?> ... var2);

    public static native void kF(int var0);

    public static native void kG(int var0);

    public static native Map<String, String> aNl();

    public static native List<String> aNm();

    public static native Class<?> kM(String var0);

    public static native Object v(Class<?> var0);

    public static native List<String> H(Object var0);

    public static native void aMY();

    public static native void k(long var0);

    public static native JSONObject kN(String var0);

    public static native InetAddress[] kO(String var0);

    public static native InetAddress kP(String var0);

    public static native HttpsURLConnection kQ(String var0);

    public static native void e(HttpsURLConnection var0);

    public static native int f(HttpsURLConnection var0);

    public static native boolean g(HttpsURLConnection var0);

    public static native boolean l(String var0, int var1, int var2);

    public static native int m(String var0, int var1, int var2);

    public static native byte[] c(Path var0);

    public static native List<String> d(Path var0);

    public static native void a(WebSocketContainer var0, Object var1, URI var2);

    public static native void b(Session var0);

    public static native byte[] t(byte[] var0);

    public static native void aNn();

    public static native void aNo();

    public static native void aNp();

    public static native void a(Object var0, Class<?> var1, Object var2);

    public static native void kR(String var0);

    public static native MessageDigest kS(String var0);

    public static native ByteArrayOutputStream aNq();

    public static native DataOutputStream a(OutputStream var0);

    public static native byte[] a(MessageDigest var0, byte[] var1);

    public static native Constructor<?>[] w(Class<?> var0);

    public static native Method[] x(Class<?> var0);

    public static native Field[] y(Class<?> var0);

    public static native Object a(Field var0, Object var1);

    public static native void a(DataOutputStream var0, boolean var1);

    public static native void a(DataOutputStream var0, int var1);

    public static native void a(DataOutputStream var0, long var1);

    public static native void a(DataOutputStream var0, double var1);

    public static native void a(DataOutputStream var0, float var1);

    public static native void a(DataOutputStream var0, byte[] var1);

    public static native String aM(String var0, String var1);

    public static native long aNr();

    public static native Process t(String ... var0);

    public static native BufferedReader o(InputStream var0);

    public static native String a(BufferedReader var0);

    public static native void c(Reader var0);

    public static native void a(Writer var0);

    public static native InputStream h(Class<?> var0, String var1);

    public static native int a(InputStream var0, byte[] var1);

    public static native void p(InputStream var0);

    public static native void e(Path var0);

    public static native BufferedWriter f(Path var0);

    public static native void a(BufferedWriter var0, String var1);

    public static native BufferedReader g(Path var0);

    public static native void a(Path var0, Path var1);

    public static native boolean h(Path var0);

    public static native void a(MessageDigest var0, byte[] var1, int var2, int var3);

    public static native String u(byte[] var0);

    public static native byte[] kT(String var0);

    public static native byte[] i(Class<?> var0, String var1);

    public static native Certificate[] h(HttpsURLConnection var0);

    public static native Method a(Class<?> var0, String var1, Class<?> ... var2);

    public static native void a(Path var0, byte[] var1);

    public static native void a(Path var0, String var1, Object var2);

    public static native void a(Path var0, Iterable<? extends CharSequence> var1);

    public static native InetAddress v(byte[] var0);

    public static native String[] n(Module var0);

    public static native Collection<StackTraceElement[]> aNs();

    public static native String u(String ... var0);

    public static native String[] v(String ... var0);

    public static native String kU(String var0);

    public static native long V(String var0, int var1);

    public static native Class<?> a(Method var0);

    public static native void a(c var0);

    public static native String aNt();

    public static native String kV(String var0);

    public static native void aN(String var0, String var1);

    public static native String aNu();

    public static native String aNv();

    public static native String aNw();

    private static native String w(byte[] var0);

    public static native String aNx();

    public static native String aNy();

    public static native String aNz();

    public static native int aoJ();

    public static native long aNA();

    public static native long aNB();

    public static native String aNC();

    public static native String aND();

    public static native String aNE();

    public static native String aNF();

    public static native int aNG();

    public static native String aNH();

    public static native int aNI();

    public static native int aNJ();

    public static native String aNK();

    public static native b aNL();

    public static native String aO(String var0, String var1);

    static {
        Hidden0.special_clinit_1_1030(a.class);
    }
}

