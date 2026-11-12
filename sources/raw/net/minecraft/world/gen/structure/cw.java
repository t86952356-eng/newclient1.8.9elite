/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

public final class cw
extends Enum<cw> {
    public static final /* enum */ cw dSu = new cw();
    public static final /* enum */ cw dSv = new cw();
    public static final /* enum */ cw dSw = new cw();
    public static final /* enum */ cw dSx = new cw();
    private static final /* synthetic */ cw[] dSy;

    public static cw[] values() {
        return (cw[])dSy.clone();
    }

    public static cw valueOf(String string) {
        return Enum.valueOf(cw.class, string);
    }

    private static /* synthetic */ cw[] azj() {
        return new cw[]{dSu, dSv, dSw, dSx};
    }

    static {
        dSy = cw.azj();
    }
}

