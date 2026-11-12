/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import net.optifine.http.f;
import net.optifine.http.h;
import net.optifine.http.j;

public class i
extends Thread {
    private f ekR = null;
    private static final String ekZ = "\r\n";
    private static final Charset ela = StandardCharsets.US_ASCII;

    public i(f f2) {
        super("HttpPipelineSender");
        this.ekR = f2;
    }

    @Override
    public void run() {
        h h2 = null;
        try {
            this.connect();
            while (!Thread.interrupted()) {
                h2 = this.ekR.aCR();
                j j2 = h2.aCX();
                OutputStream outputStream = this.ekR.aCQ();
                this.a(j2, outputStream);
                this.ekR.c(h2);
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            this.ekR.a(h2, exception);
        }
    }

    private void connect() {
        String string = this.ekR.ajZ();
        int n2 = this.ekR.getPort();
        Proxy proxy = this.ekR.Bp();
        Socket socket = new Socket(proxy);
        socket.connect(new InetSocketAddress(string, n2), 5000);
        this.ekR.a(socket);
    }

    private void a(j j2, OutputStream outputStream) {
        this.a(outputStream, j2.aCZ() + " " + j2.uT() + " " + j2.aDa() + ekZ);
        Map<String, String> map = j2.aDb();
        for (String string : map.keySet()) {
            String string2 = j2.aDb().get(string);
            this.a(outputStream, string + ": " + string2 + ekZ);
        }
        this.a(outputStream, ekZ);
    }

    private void a(OutputStream outputStream, String string) {
        byte[] byArray = string.getBytes(ela);
        outputStream.write(byArray);
    }
}

