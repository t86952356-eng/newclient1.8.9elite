/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.texture;

public final class c
extends Enum<c> {
    public static final /* enum */ c eLR = new c(5120);
    public static final /* enum */ c eLS = new c(5122);
    public static final /* enum */ c eLT = new c(5124);
    public static final /* enum */ c eLU = new c(5131);
    public static final /* enum */ c eLV = new c(5126);
    public static final /* enum */ c eLW = new c(5121);
    public static final /* enum */ c eLX = new c(32818);
    public static final /* enum */ c eLY = new c(33634);
    public static final /* enum */ c eLZ = new c(5123);
    public static final /* enum */ c eMa = new c(33635);
    public static final /* enum */ c eMb = new c(33636);
    public static final /* enum */ c eMc = new c(32819);
    public static final /* enum */ c eMd = new c(33637);
    public static final /* enum */ c eMe = new c(32820);
    public static final /* enum */ c eMf = new c(33638);
    public static final /* enum */ c eMg = new c(5125);
    public static final /* enum */ c eMh = new c(32821);
    public static final /* enum */ c eMi = new c(33639);
    public static final /* enum */ c eMj = new c(32822);
    public static final /* enum */ c eMk = new c(33640);
    private final int eMl;
    private static final /* synthetic */ c[] eMm;

    public static c[] values() {
        return (c[])eMm.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n3) {
        this.eMl = n3;
    }

    public int getId() {
        return this.eMl;
    }

    private static /* synthetic */ c[] aIW() {
        return new c[]{eLR, eLS, eLT, eLU, eLV, eLW, eLX, eLY, eLZ, eMa, eMb, eMc, eMd, eMe, eMf, eMg, eMh, eMi, eMj, eMk};
    }

    static {
        eMm = c.aIW();
    }
}

