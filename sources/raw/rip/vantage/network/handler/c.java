/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.websocket.ClientEndpoint
 *  javax.websocket.OnMessage
 *  javax.websocket.OnOpen
 *  javax.websocket.Session
 *  javax.websocket.WebSocketContainer
 *  nl.hidden.Hidden0
 *  org.json.JSONObject
 */
package rip.vantage.network.handler;

import java.net.URI;
import java.security.SecureRandom;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.HttpsURLConnection;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import nl.Loader;
import nl.hidden.Hidden0;
import org.json.JSONObject;
import rip.vantage.network.handler.a;

@ClientEndpoint(configurator=a.class)
public class c {
    private rip.vantage.network.core.a eSn;
    private Session eSo;
    public static rip.vantage.commons.util.time.a eSp;
    private static volatile boolean eSq;
    private static volatile long eSr;
    private static volatile long eSs;
    private static volatile long eSt;
    private static final SecureRandom eSu;
    private volatile byte[] eSv = null;
    private volatile byte[] eSw = null;
    private volatile boolean eSx = false;
    private volatile CountDownLatch eSy = new CountDownLatch(1);
    private static final long eSz = 2000L;
    private static volatile boolean eSA;

    @OnOpen
    public native void a(Session var1);

    @OnMessage
    public native void kl(String var1);

    public native void aLd();

    public native void connect();

    private native URI aLe();

    private native void b(URI var1);

    private native void aLf();

    private native void km(String var1);

    private native boolean kn(String var1);

    private native void aLg();

    public native void sendMessage(String var1);

    public native void o(byte[] var1);

    private native boolean b(JSONObject var1);

    private native void aLh();

    public native void close();

    public native Session aLi();

    public static native boolean aLj();

    private static native void aLk();

    private static native boolean aLl();

    private native void aLm();

    public static native long aLn();

    public static native long aLo();

    public static native void aLp();

    private static native /* synthetic */ void aLq();

    private native /* synthetic */ void a(boolean var1, byte[] var2, byte[] var3);

    private native /* synthetic */ void a(boolean var1, byte[] var2, String var3);

    private static native /* synthetic */ void b(HttpsURLConnection var0);

    private native /* synthetic */ void a(WebSocketContainer var1);

    private native /* synthetic */ void b(WebSocketContainer var1);

    private static native /* synthetic */ void ko(String var0);

    private native /* synthetic */ void aLr();

    static {
        Loader.registerNativesForClass(0, c.class);
        Hidden0.special_clinit_0_320(c.class);
    }
}

