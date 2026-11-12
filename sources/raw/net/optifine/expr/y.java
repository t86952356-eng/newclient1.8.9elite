/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

public final class y
extends Enum<y> {
    public static final /* enum */ y ejn = new y("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:.");
    public static final /* enum */ y ejo = new y("0123456789", "0123456789.");
    public static final /* enum */ y ejp = new y("+-*/%!&|<>=", "&|=");
    public static final /* enum */ y ejq = new y(",");
    public static final /* enum */ y ejr = new y("(");
    public static final /* enum */ y ejs = new y(")");
    private final String ejt;
    private final String eju;
    public static final y[] ejv;
    private static final /* synthetic */ y[] ejw;

    public static y[] values() {
        return (y[])ejw.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private y(String string2) {
        this(string2, "");
    }

    private y(String string2, String string3) {
        this.ejt = string2;
        this.eju = string3;
    }

    public String aCG() {
        return this.ejt;
    }

    public String aCH() {
        return this.eju;
    }

    public static y p(char c2) {
        for (int i2 = 0; i2 < ejv.length; ++i2) {
            y y2 = ejv[i2];
            if (y2.aCG().indexOf(c2) < 0) continue;
            return y2;
        }
        return null;
    }

    public boolean q(char c2) {
        return this.eju.indexOf(c2) >= 0;
    }

    private static /* synthetic */ y[] aCI() {
        return new y[]{ejn, ejo, ejp, ejq, ejr, ejs};
    }

    static {
        ejw = y.aCI();
        ejv = y.values();
    }
}

