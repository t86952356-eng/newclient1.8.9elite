/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

public final class d
extends Enum<d> {
    public static final /* enum */ d cIO = new d();
    public static final /* enum */ d cIP = new d();
    public static final /* enum */ d cIQ = new d();
    public static final /* enum */ d cIR = new d();
    public static final /* enum */ d cIS = new d();
    public static final /* enum */ d cIT = new d();
    private static final /* synthetic */ d[] cIU;

    public static d[] values() {
        return (d[])cIU.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static /* synthetic */ d[] ach() {
        return new d[]{cIO, cIP, cIQ, cIR, cIS, cIT};
    }

    static {
        cIU = d.ach();
    }
}

