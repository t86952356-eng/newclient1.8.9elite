/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

final class ab
extends Enum<ab> {
    public static final /* enum */ ab eac = new ab();
    public static final /* enum */ ab ead = new ab();
    public static final /* enum */ ab eae = new ab();
    public static final /* enum */ ab eaf = new ab();
    public static final /* enum */ ab eag = new ab();
    public static final /* enum */ ab eah = new ab();
    private static final /* synthetic */ ab[] eai;

    public static ab[] values() {
        return (ab[])eai.clone();
    }

    public static ab valueOf(String string) {
        return Enum.valueOf(ab.class, string);
    }

    private static /* synthetic */ ab[] aAE() {
        return new ab[]{eac, ead, eae, eaf, eag, eah};
    }

    static {
        eai = ab.aAE();
    }
}

