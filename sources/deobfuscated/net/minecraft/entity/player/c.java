/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

public final class c
extends Enum<c> {
    public static final /* enum */ c cIH = new c(0, "options.chat.visibility.full");
    public static final /* enum */ c cII = new c(1, "options.chat.visibility.system");
    public static final /* enum */ c cIJ = new c(2, "options.chat.visibility.hidden");
    private static final c[] cIK;
    private final int cIL;
    private final String cIM;
    private static final /* synthetic */ c[] cIN;

    public static c[] values() {
        return (c[])cIN.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n3, String string2) {
        this.cIL = n3;
        this.cIM = string2;
    }

    public int ace() {
        return this.cIL;
    }

    public static c fH(int n2) {
        return cIK[n2 % cIK.length];
    }

    public String acf() {
        return this.cIM;
    }

    private static /* synthetic */ c[] acg() {
        return new c[]{cIH, cII, cIJ};
    }

    static {
        cIN = c.acg();
        cIK = new c[c.values().length];
        c[] cArray = c.values();
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            c c2;
            c.cIK[c2.cIL] = c2 = cArray[i2];
        }
    }
}

