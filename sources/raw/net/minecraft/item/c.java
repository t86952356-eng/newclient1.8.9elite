/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.util.an;

public final class c
extends Enum<c> {
    public static final /* enum */ c cVb = new c(an.dwa, "Common");
    public static final /* enum */ c cVc = new c(an.dvZ, "Uncommon");
    public static final /* enum */ c cVd = new c(an.dvW, "Rare");
    public static final /* enum */ c cVe = new c(an.dvY, "Epic");
    public final an cVf;
    public final String cVg;
    private static final /* synthetic */ c[] cVh;

    public static c[] values() {
        return (c[])cVh.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(an an2, String string2) {
        this.cVf = an2;
        this.cVg = string2;
    }

    private static /* synthetic */ c[] adq() {
        return new c[]{cVb, cVc, cVd, cVe};
    }

    static {
        cVh = c.adq();
    }
}

