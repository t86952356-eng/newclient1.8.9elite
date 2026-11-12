/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public final class cb
extends Enum<cb> {
    public static final /* enum */ cb gG = new cb("Off");
    public static final /* enum */ cb gH = new cb("Rise");
    public static final /* enum */ cb gI = new cb("Traditional");
    public static final /* enum */ cb gJ = new cb("Backwards Sprint");
    final String gK;
    private static final /* synthetic */ cb[] gL;

    public static cb[] values() {
        return (cb[])gL.clone();
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(cb.class, string);
    }

    public String toString() {
        return this.gK;
    }

    @Generated
    private cb(String string2) {
        this.gK = string2;
    }

    private static /* synthetic */ cb[] cd() {
        return new cb[]{gG, gH, gI, gJ};
    }

    static {
        gL = cb.cd();
    }
}

