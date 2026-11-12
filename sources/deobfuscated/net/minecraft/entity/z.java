/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

public final class z
extends Enum<z> {
    public static final /* enum */ z cvT = new z();
    public static final /* enum */ z cvU = new z();
    public static final /* enum */ z cvV = new z();
    private static final /* synthetic */ z[] cvW;

    public static z[] values() {
        return (z[])cvW.clone();
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    private static /* synthetic */ z[] Wt() {
        return new z[]{cvT, cvU, cvV};
    }

    static {
        cvW = z.Wt();
    }
}

