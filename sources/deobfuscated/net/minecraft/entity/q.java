/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

public final class q
extends Enum<q> {
    public static final /* enum */ q cuf = new q();
    public static final /* enum */ q cug = new q();
    public static final /* enum */ q cuh = new q();
    private static final /* synthetic */ q[] cui;

    public static q[] values() {
        return (q[])cui.clone();
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private static /* synthetic */ q[] Vx() {
        return new q[]{cuf, cug, cuh};
    }

    static {
        cui = q.Vx();
    }
}

