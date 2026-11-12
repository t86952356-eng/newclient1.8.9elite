/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.util.vantage;

import java.awt.Color;

public final class a
extends Enum<a> {
    public static final /* enum */ a eRT = new a("Rise", "63d0f9bc46ca6bf7ad9572b7", "\u00a7b", new Color(71, 148, 253));
    public static final /* enum */ a eRU = new a("Weed", "63d32b8e3012b50e9686dd39", "\u00a72", new Color(70, 200, 70));
    public static final /* enum */ a eRV = new a("Prestige", "", "\u00a71", new Color(79, 70, 229));
    public static final /* enum */ a eRW = new a("Monsoon", "63d106727842de723ada3bf0", "\u00a73", new Color(32, 117, 171));
    private final String eRX;
    private final String eRY;
    private final String eRZ;
    private final Color eSa;
    private static final /* synthetic */ a[] eSb;

    public static a[] values() {
        return (a[])eSb.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(String string2, String string3, String string4, Color color) {
        this.eRX = string2;
        this.eRY = string3;
        this.eRZ = string4;
        this.eSa = color;
    }

    public String getDisplayName() {
        return this.eRX;
    }

    public String aKN() {
        return this.eRY;
    }

    public String aKO() {
        return this.eRZ;
    }

    public Color nM() {
        return this.eSa;
    }

    private static /* synthetic */ a[] aKP() {
        return new a[]{eRT, eRU, eRV, eRW};
    }

    static {
        eSb = a.aKP();
    }
}

