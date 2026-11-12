/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

public final class f
extends Enum<f> {
    public static final /* enum */ f cYQ = new f();
    public static final /* enum */ f cYR = new f();
    private static final /* synthetic */ f[] cYS;

    public static f[] values() {
        return (f[])cYS.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static /* synthetic */ f[] aeX() {
        return new f[]{cYQ, cYR};
    }

    static {
        cYS = f.aeX();
    }
}

