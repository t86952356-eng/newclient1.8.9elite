/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.src.a;
import net.optifine.http.c;
import net.optifine.http.d;
import net.optifine.http.g;
import net.optifine.http.h;
import net.optifine.http.i;
import net.optifine.http.j;
import net.optifine.http.k;

public class f {
    private String diW = null;
    private int dy = 0;
    private Proxy bhi = Proxy.NO_PROXY;
    private final List<h> ekA = new LinkedList<h>();
    private final List<h> ekB = new LinkedList<h>();
    private Socket ekC = null;
    private InputStream ekD = null;
    private OutputStream ekE = null;
    private i ekF = null;
    private g ekG = null;
    private int ekH = 0;
    private boolean ekI = false;
    private long ekJ = 5000L;
    private int ekK = 1000;
    private long ekL = System.currentTimeMillis();
    private boolean ekM = false;
    private static final String ekN = "\n";
    public static final int ekO = 5000;
    public static final int ekP = 5000;
    private static final Pattern ekQ = Pattern.compile("^[a-zA-Z]+://.*");

    public f(String string, int n2) {
        this(string, n2, Proxy.NO_PROXY);
    }

    public f(String string, int n2, Proxy proxy) {
        this.diW = string;
        this.dy = n2;
        this.bhi = proxy;
        this.ekF = new i(this);
        this.ekF.start();
        this.ekG = new g(this);
        this.ekG.start();
    }

    public synchronized boolean b(h h2) {
        if (this.aCV()) {
            return false;
        }
        this.a(h2, this.ekA);
        this.a(h2, this.ekB);
        ++this.ekH;
        return true;
    }

    private void a(h h2, List<h> list) {
        list.add(h2);
        this.notifyAll();
    }

    public synchronized void a(Socket socket) {
        if (!this.ekM) {
            if (this.ekC != null) {
                throw new IllegalArgumentException("Already connected");
            }
            this.ekC = socket;
            this.ekC.setTcpNoDelay(true);
            this.ekD = this.ekC.getInputStream();
            this.ekE = new BufferedOutputStream(this.ekC.getOutputStream());
            this.aCU();
            this.notifyAll();
        }
    }

    public synchronized OutputStream aCQ() {
        while (this.ekE == null) {
            this.aCT();
            this.wait(1000L);
        }
        return this.ekE;
    }

    public synchronized InputStream getInputStream() {
        while (this.ekD == null) {
            this.aCT();
            this.wait(1000L);
        }
        return this.ekD;
    }

    public synchronized h aCR() {
        if (this.ekB.size() <= 0 && this.ekE != null) {
            this.ekE.flush();
        }
        return this.a(this.ekB, true);
    }

    public synchronized h aCS() {
        return this.a(this.ekA, false);
    }

    private h a(List<h> list, boolean bl2) {
        while (list.size() <= 0) {
            this.aCT();
            this.wait(1000L);
        }
        this.aCU();
        if (bl2) {
            return list.remove(0);
        }
        return list.get(0);
    }

    private void aCT() {
        if (this.ekC != null) {
            long l2;
            long l3 = this.ekJ;
            if (this.ekA.size() > 0) {
                l3 = 5000L;
            }
            if ((l2 = System.currentTimeMillis()) > this.ekL + l3) {
                this.b(new InterruptedException("Timeout " + l3));
            }
        }
    }

    private void aCU() {
        this.ekL = System.currentTimeMillis();
    }

    public synchronized void c(h h2) {
        if (!this.ekM) {
            this.aCU();
        }
    }

    public synchronized void a(h h2, k k2) {
        if (!this.ekM) {
            this.ekI = true;
            this.aCU();
            if (this.ekA.size() > 0 && this.ekA.get(0) == h2) {
                this.ekA.remove(0);
                h2.cM(true);
                String string = k2.ip("Location");
                if (k2.aDe() / 100 == 3 && string != null && h2.aCX().aDd() < 5) {
                    try {
                        string = this.a(string, h2.aCX());
                        j j2 = d.a(string, h2.aCX().Bp());
                        j2.jy(h2.aCX().aDd() + 1);
                        h h3 = new h(j2, h2.aCY());
                        d.a(h3);
                    }
                    catch (IOException iOException) {
                        h2.aCY().a(h2.aCX(), iOException);
                    }
                } else {
                    c c2 = h2.aCY();
                    c2.a(h2.aCX(), k2);
                }
                this.a(k2);
            } else {
                throw new IllegalArgumentException("Response out of order: " + String.valueOf(h2));
            }
        }
    }

    private String a(String string, j j2) {
        if (ekQ.matcher(string).matches()) {
            return string;
        }
        if (string.startsWith("//")) {
            return "http:" + string;
        }
        Object object = j2.ajZ();
        if (j2.getPort() != 80) {
            object = (String)object + ":" + j2.getPort();
        }
        if (string.startsWith("/")) {
            return "http://" + (String)object + string;
        }
        String string2 = j2.uT();
        int n2 = string2.lastIndexOf("/");
        return n2 >= 0 ? "http://" + (String)object + string2.substring(0, n2 + 1) + string : "http://" + (String)object + "/" + string;
    }

    private void a(k k2) {
        String string;
        String string2 = k2.ip("Connection");
        if (string2 != null && !string2.equalsIgnoreCase("keep-alive")) {
            this.b(new EOFException("Connection not keep-alive"));
        }
        if ((string = k2.ip("Keep-Alive")) != null) {
            String[] stringArray = a.V(string, ",;");
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                int n2;
                String string3 = stringArray[i2];
                String[] stringArray2 = this.b(string3, '=');
                if (stringArray2.length < 2) continue;
                if (stringArray2[0].equals("timeout") && (n2 = a.x(stringArray2[1], -1)) > 0) {
                    this.ekJ = n2 * 1000;
                }
                if (!stringArray2[0].equals("max") || (n2 = a.x(stringArray2[1], -1)) <= 0) continue;
                this.ekK = n2;
            }
        }
    }

    private String[] b(String string, char c2) {
        int n2 = string.indexOf(c2);
        if (n2 < 0) {
            return new String[]{string};
        }
        String string2 = string.substring(0, n2);
        String string3 = string.substring(n2 + 1);
        return new String[]{string2, string3};
    }

    public synchronized void a(h h2, Exception exception) {
        this.b(exception);
    }

    public synchronized void b(h h2, Exception exception) {
        this.b(exception);
    }

    private synchronized void b(Exception exception) {
        if (!this.ekM) {
            this.ekM = true;
            this.c(exception);
            if (this.ekF != null) {
                this.ekF.interrupt();
            }
            if (this.ekG != null) {
                this.ekG.interrupt();
            }
            try {
                if (this.ekC != null) {
                    this.ekC.close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.ekC = null;
            this.ekD = null;
            this.ekE = null;
        }
    }

    private void c(Exception exception) {
        if (this.ekA.size() > 0) {
            h h2;
            if (!this.ekI) {
                h2 = this.ekA.remove(0);
                h2.aCY().a(h2.aCX(), exception);
                h2.cM(true);
            }
            while (this.ekA.size() > 0) {
                h2 = this.ekA.remove(0);
                d.a(h2);
            }
        }
    }

    public synchronized boolean aCV() {
        return this.ekM || this.ekH >= this.ekK;
    }

    public int aCW() {
        return this.ekH;
    }

    public synchronized boolean aCP() {
        return this.ekA.size() > 0;
    }

    public String ajZ() {
        return this.diW;
    }

    public int getPort() {
        return this.dy;
    }

    public Proxy Bp() {
        return this.bhi;
    }
}

