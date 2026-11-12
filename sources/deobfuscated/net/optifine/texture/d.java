/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.texture;

public final class d
extends Enum<d> {
    public static final /* enum */ d eMn = new d(3552);
    public static final /* enum */ d eMo = new d(3553);
    public static final /* enum */ d eMp = new d(32879);
    public static final /* enum */ d eMq = new d(34037);
    private final int id;
    private static final /* synthetic */ d[] eMs;

    public static d[] values() {
        return (d[])eMs.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private d(int n3) {
        this.id = n3;
    }

    public int getId() {
        return this.id;
    }

    private static /* synthetic */ d[] aIX() {
        return new d[]{eMn, eMo, eMp, eMq};
    }

    static {
        eMs = d.aIX();
    }
}

