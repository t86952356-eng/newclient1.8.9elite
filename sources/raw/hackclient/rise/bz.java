/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public final class bz
extends Enum<bz> {
    public static final /* enum */ bz gw = new bz("b");
    public static final /* enum */ bz gx = new bz("a");
    public static final /* enum */ bz gy = new bz("c");
    public static final /* enum */ bz gz = new bz("b");
    private final String gA;
    private static final /* synthetic */ bz[] gB;

    public static bz[] values() {
        return (bz[])gB.clone();
    }

    public static bz valueOf(String string) {
        return Enum.valueOf(bz.class, string);
    }

    private bz(String string2) {
        this.gA = string2;
    }

    @Generated
    public String bU() {
        return this.gA;
    }

    private static /* synthetic */ bz[] cc() {
        return new bz[]{gw, gx, gy, gz};
    }

    static {
        gB = bz.cc();
    }
}

