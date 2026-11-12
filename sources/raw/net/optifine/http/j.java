/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class j {
    private String diW = null;
    private int dy = 0;
    private Proxy bhi = Proxy.NO_PROXY;
    private String elb = null;
    private String aNK = null;
    private String elc = null;
    private Map<String, String> ekm = new LinkedHashMap<String, String>();
    private byte[] eld = null;
    private int ele = 0;
    public static final String elf = "GET";
    public static final String elg = "HEAD";
    public static final String elh = "POST";
    public static final String eli = "HTTP/1.0";
    public static final String elj = "HTTP/1.1";

    public j(String string, int n2, Proxy proxy, String string2, String string3, String string4, Map<String, String> map, byte[] byArray) {
        this.diW = string;
        this.dy = n2;
        this.bhi = proxy;
        this.elb = string2;
        this.aNK = string3;
        this.elc = string4;
        this.ekm = map;
        this.eld = byArray;
    }

    public String ajZ() {
        return this.diW;
    }

    public int getPort() {
        return this.dy;
    }

    public String aCZ() {
        return this.elb;
    }

    public String uT() {
        return this.aNK;
    }

    public String aDa() {
        return this.elc;
    }

    public Map<String, String> aDb() {
        return this.ekm;
    }

    public byte[] aDc() {
        return this.eld;
    }

    public int aDd() {
        return this.ele;
    }

    public void jy(int n2) {
        this.ele = n2;
    }

    public Proxy Bp() {
        return this.bhi;
    }
}

