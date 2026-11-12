/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.util.Map;
import net.optifine.http.l;
import net.optifine.http.n;

public class b
extends Thread {
    private final String ekl;
    private final Map ekm;
    private final byte[] ekn;
    private final n eko;

    public b(String string, Map map, byte[] byArray, n n2) {
        this.ekl = string;
        this.ekm = map;
        this.ekn = byArray;
        this.eko = n2;
    }

    @Override
    public void run() {
        try {
            l.a(this.ekl, this.ekm, this.ekn);
            this.eko.a(this.ekl, this.ekn, null);
        }
        catch (Exception exception) {
            this.eko.a(this.ekl, this.ekn, exception);
        }
    }

    public String aCL() {
        return this.ekl;
    }

    public byte[] aCN() {
        return this.ekn;
    }

    public n aCO() {
        return this.eko;
    }
}

