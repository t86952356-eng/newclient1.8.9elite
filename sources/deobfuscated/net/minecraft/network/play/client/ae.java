/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

public final class ae
extends Enum<ae> {
    public static final /* enum */ ae dbW = new ae();
    public static final /* enum */ ae dbX = new ae();
    public static final /* enum */ ae dbY = new ae();
    public static final /* enum */ ae dbZ = new ae();
    private static final /* synthetic */ ae[] dca;

    public static ae[] values() {
        return (ae[])dca.clone();
    }

    public static ae valueOf(String string) {
        return Enum.valueOf(ae.class, string);
    }

    private static /* synthetic */ ae[] agk() {
        return new ae[]{dbW, dbX, dbY, dbZ};
    }

    static {
        dca = ae.agk();
    }
}

