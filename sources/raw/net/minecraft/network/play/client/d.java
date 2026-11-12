/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

public final class d
extends Enum<d> {
    public static final /* enum */ d daT = new d();
    public static final /* enum */ d daU = new d();
    public static final /* enum */ d daV = new d();
    private static final /* synthetic */ d[] daW;

    public static d[] values() {
        return (d[])daW.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static /* synthetic */ d[] afR() {
        return new d[]{daT, daU, daV};
    }

    static {
        daW = d.afR();
    }
}

