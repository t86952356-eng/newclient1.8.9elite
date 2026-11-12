/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

final class q
extends Enum<q> {
    public static final /* enum */ q cGH = new q(0.0f, 0.0f, 30, 1);
    public static final /* enum */ q cGI = new q(0.8f, 0.2f, 20, 10);
    public static final /* enum */ q cGJ = new q(1.0f, 0.45f, 14, 14);
    public static final /* enum */ q cGK = new q(1.75f, 0.4f, 1, 8);
    public static final /* enum */ q cGL = new q(2.0f, 0.7f, 7, 8);
    private final float cGM;
    private final float cGN;
    private final int duration;
    private final int cGP;
    private static final /* synthetic */ q[] cGQ;

    public static q[] values() {
        return (q[])cGQ.clone();
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private q(float f2, float f3, int n3, int n4) {
        this.cGM = f2;
        this.cGN = f3;
        this.duration = n3;
        this.cGP = n4;
    }

    public float abc() {
        return this.cGM;
    }

    public float abd() {
        return this.cGN;
    }

    public int getDuration() {
        return this.duration;
    }

    public int abe() {
        return this.cGP;
    }

    private static /* synthetic */ q[] abf() {
        return new q[]{cGH, cGI, cGJ, cGK, cGL};
    }

    static {
        cGQ = q.abf();
    }
}

