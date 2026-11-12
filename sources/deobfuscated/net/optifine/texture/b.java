/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.texture;

public final class b
extends Enum<b> {
    public static final /* enum */ b eLD = new b(6403);
    public static final /* enum */ b eLE = new b(33319);
    public static final /* enum */ b eLF = new b(6407);
    public static final /* enum */ b eLG = new b(32992);
    public static final /* enum */ b eLH = new b(6408);
    public static final /* enum */ b eLI = new b(32993);
    public static final /* enum */ b eLJ = new b(36244);
    public static final /* enum */ b eLK = new b(33320);
    public static final /* enum */ b eLL = new b(36248);
    public static final /* enum */ b eLM = new b(36250);
    public static final /* enum */ b eLN = new b(36249);
    public static final /* enum */ b eLO = new b(36251);
    private final int id;
    private static final /* synthetic */ b[] eLQ;

    public static b[] values() {
        return (b[])eLQ.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private b(int n3) {
        this.id = n3;
    }

    public int getId() {
        return this.id;
    }

    private static /* synthetic */ b[] aIV() {
        return new b[]{eLD, eLE, eLF, eLG, eLH, eLI, eLJ, eLK, eLL, eLM, eLN, eLO};
    }

    static {
        eLQ = b.aIV();
    }
}

