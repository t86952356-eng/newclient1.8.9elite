/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

public final class f
extends Enum<f> {
    public static final /* enum */ f ehO = new f();
    public static final /* enum */ f ehP = new f();
    public static final /* enum */ f ehQ = new f();
    private static final /* synthetic */ f[] ehR;

    public static f[] values() {
        return (f[])ehR.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static /* synthetic */ f[] aCx() {
        return new f[]{ehO, ehP, ehQ};
    }

    static {
        ehR = f.aCx();
    }
}

