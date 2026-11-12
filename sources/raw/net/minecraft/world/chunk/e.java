/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk;

public final class e
extends Enum<e> {
    public static final /* enum */ e dJf = new e();
    public static final /* enum */ e dJg = new e();
    public static final /* enum */ e dJh = new e();
    private static final /* synthetic */ e[] dJi;

    public static e[] values() {
        return (e[])dJi.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static /* synthetic */ e[] axP() {
        return new e[]{dJf, dJg, dJh};
    }

    static {
        dJi = e.axP();
    }
}

