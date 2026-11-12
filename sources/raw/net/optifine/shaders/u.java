/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

public final class u
extends Enum<u> {
    public static final /* enum */ u evO = new u("");
    public static final /* enum */ u evP = new u("shadow");
    public static final /* enum */ u evQ = new u("gbuffers");
    public static final /* enum */ u evR = new u("deferred");
    public static final /* enum */ u evS = new u("composite");
    private final String evT;
    private static final /* synthetic */ u[] evU;

    public static u[] values() {
        return (u[])evU.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private u(String string2) {
        this.evT = string2;
    }

    public String getName() {
        return this.evT;
    }

    private static /* synthetic */ u[] aEP() {
        return new u[]{evO, evP, evQ, evR, evS};
    }

    static {
        evU = u.aEP();
    }
}

