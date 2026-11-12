/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

public final class j
extends Enum<j> {
    public static final /* enum */ j daZ = new j();
    public static final /* enum */ j dba = new j();
    public static final /* enum */ j dbb = new j();
    public static final /* enum */ j dbc = new j();
    public static final /* enum */ j dbd = new j();
    public static final /* enum */ j dbe = new j();
    private static final /* synthetic */ j[] dbf;

    public static j[] values() {
        return (j[])dbf.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static /* synthetic */ j[] afX() {
        return new j[]{daZ, dba, dbb, dbc, dbd, dbe};
    }

    static {
        dbf = j.afX();
    }
}

