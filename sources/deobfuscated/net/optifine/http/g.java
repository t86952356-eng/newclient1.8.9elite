/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import net.minecraft.src.a;
import net.optifine.http.f;
import net.optifine.http.h;
import net.optifine.http.k;

public class g
extends Thread {
    private f ekR = null;
    private static final Charset ekS = StandardCharsets.US_ASCII;
    private static final String ekT = "Content-Length";
    private static final char ekU = '\r';
    private static final char ekV = '\n';

    public g(f f2) {
        super("HttpPipelineReceiver");
        this.ekR = f2;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            h h2 = null;
            try {
                h2 = this.ekR.aCS();
                InputStream inputStream = this.ekR.getInputStream();
                k k2 = this.l(inputStream);
                this.ekR.a(h2, k2);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Exception exception) {
                this.ekR.b(h2, exception);
            }
        }
    }

    private k l(InputStream inputStream) {
        String string = this.n(inputStream);
        String[] stringArray = a.V(string, " ");
        if (stringArray.length < 3) {
            throw new IOException("Invalid status line: " + string);
        }
        String string2 = stringArray[0];
        int n2 = a.x(stringArray[1], 0);
        String string3 = stringArray[2];
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        while (true) {
            String string4;
            String string5;
            String string6;
            if ((string6 = this.n(inputStream)).length() <= 0) {
                byte[] byArray = null;
                string5 = (String)linkedHashMap.get(ekT);
                if (string5 != null) {
                    int n3 = a.x(string5, -1);
                    if (n3 > 0) {
                        byArray = new byte[n3];
                        this.a(byArray, inputStream);
                    }
                } else {
                    string4 = (String)linkedHashMap.get("Transfer-Encoding");
                    if (a.a((Object)string4, (Object)"chunked")) {
                        byArray = this.m(inputStream);
                    }
                }
                return new k(n2, string, linkedHashMap, byArray);
            }
            int n4 = string6.indexOf(":");
            if (n4 <= 0) continue;
            string5 = string6.substring(0, n4).trim();
            string4 = string6.substring(n4 + 1).trim();
            linkedHashMap.put(string5, string4);
        }
    }

    private byte[] m(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            String string = this.n(inputStream);
            String[] stringArray = a.V(string, "; ");
            n2 = Integer.parseInt(stringArray[0], 16);
            byte[] byArray = new byte[n2];
            this.a(byArray, inputStream);
            byteArrayOutputStream.write(byArray);
            this.n(inputStream);
        } while (n2 != 0);
        return byteArrayOutputStream.toByteArray();
    }

    private void a(byte[] byArray, InputStream inputStream) {
        int n2;
        for (int i2 = 0; i2 < byArray.length; i2 += n2) {
            n2 = inputStream.read(byArray, i2, byArray.length - i2);
            if (n2 >= 0) continue;
            throw new EOFException();
        }
    }

    private String n(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n3 = -1;
        boolean bl2 = false;
        while ((n2 = inputStream.read()) >= 0) {
            byteArrayOutputStream.write(n2);
            if (n3 == 13 && n2 == 10) {
                bl2 = true;
                break;
            }
            n3 = n2;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        String string = new String(byArray, ekS);
        if (bl2) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }
}

