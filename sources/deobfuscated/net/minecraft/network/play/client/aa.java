/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

public final class aa
extends Enum<aa> {
    public static final /* enum */ aa dbP = new aa();
    public static final /* enum */ aa dbQ = new aa();
    public static final /* enum */ aa dbR = new aa();
    private static final /* synthetic */ aa[] dbS;

    public static aa[] values() {
        return (aa[])dbS.clone();
    }

    public static aa valueOf(String string) {
        return Enum.valueOf(aa.class, string);
    }

    private static /* synthetic */ aa[] agi() {
        return new aa[]{dbP, dbQ, dbR};
    }

    static {
        dbS = aa.agi();
    }
}

