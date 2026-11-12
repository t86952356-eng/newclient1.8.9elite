/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

public final class o
extends Enum<o> {
    public static final /* enum */ o dbp = new o();
    public static final /* enum */ o dbq = new o();
    public static final /* enum */ o dbr = new o();
    public static final /* enum */ o dbs = new o();
    public static final /* enum */ o dbt = new o();
    public static final /* enum */ o dbu = new o();
    public static final /* enum */ o dbv = new o();
    private static final /* synthetic */ o[] dbw;

    public static o[] values() {
        return (o[])dbw.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static /* synthetic */ o[] agc() {
        return new o[]{dbp, dbq, dbr, dbs, dbt, dbu, dbv};
    }

    static {
        dbw = o.agc();
    }
}

