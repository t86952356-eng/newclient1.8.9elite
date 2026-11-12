/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.util.LinkedHashMap;
import java.util.Map;

public class k {
    private int elk = 0;
    private String ell = null;
    private Map<String, String> ekm = new LinkedHashMap<String, String>();
    private byte[] eld = null;

    public k(int n2, String string, Map map, byte[] byArray) {
        this.elk = n2;
        this.ell = string;
        this.ekm = map;
        this.eld = byArray;
    }

    public int aDe() {
        return this.elk;
    }

    public String aDf() {
        return this.ell;
    }

    public Map aDb() {
        return this.ekm;
    }

    public String ip(String string) {
        return this.ekm.get(string);
    }

    public byte[] aDc() {
        return this.eld;
    }
}

