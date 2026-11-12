/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

public final class bj
extends Enum<bj> {
    public static final /* enum */ bj dey = new bj();
    public static final /* enum */ bj dez = new bj();
    public static final /* enum */ bj deA = new bj();
    public static final /* enum */ bj deB = new bj();
    public static final /* enum */ bj deC = new bj();
    private static final /* synthetic */ bj[] deD;

    public static bj[] values() {
        return (bj[])deD.clone();
    }

    public static bj valueOf(String string) {
        return Enum.valueOf(bj.class, string);
    }

    private static /* synthetic */ bj[] ahP() {
        return new bj[]{dey, dez, deA, deB, deC};
    }

    static {
        deD = bj.ahP();
    }
}

