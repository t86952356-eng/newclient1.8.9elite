/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.border;

public final class a
extends Enum<a> {
    public static final /* enum */ a dIq = new a(4259712);
    public static final /* enum */ a dIr = new a(0xFF3030);
    public static final /* enum */ a dIs = new a(2138367);
    private final int dIt;
    private static final /* synthetic */ a[] dIu;

    public static a[] values() {
        return (a[])dIu.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(int n3) {
        this.dIt = n3;
    }

    public int awE() {
        return this.dIt;
    }

    private static /* synthetic */ a[] axk() {
        return new a[]{dIq, dIr, dIs};
    }

    static {
        dIu = a.axk();
    }
}

