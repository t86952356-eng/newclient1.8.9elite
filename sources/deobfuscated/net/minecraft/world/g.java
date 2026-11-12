/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

public final class g
extends Enum<g> {
    public static final /* enum */ g dBZ = new g(15);
    public static final /* enum */ g dCa = new g(0);
    public final int dCb;
    private static final /* synthetic */ g[] dCc;

    public static g[] values() {
        return (g[])dCc.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private g(int n3) {
        this.dCb = n3;
    }

    private static /* synthetic */ g[] avc() {
        return new g[]{dBZ, dCa};
    }

    static {
        dCc = g.avc();
    }
}

