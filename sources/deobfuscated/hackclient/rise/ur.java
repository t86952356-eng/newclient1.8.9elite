/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

final class ur
extends Enum<ur> {
    public static final /* enum */ ur aiX = new ur();
    public static final /* enum */ ur aiY = new ur();
    public static final /* enum */ ur aiZ = new ur();
    public static final /* enum */ ur aja = new ur();
    public static final /* enum */ ur ajb = new ur();
    public static final /* enum */ ur ajc = new ur();
    private static final /* synthetic */ ur[] ajd;

    public static ur[] values() {
        return (ur[])ajd.clone();
    }

    public static ur valueOf(String string) {
        return Enum.valueOf(ur.class, string);
    }

    private static /* synthetic */ ur[] kQ() {
        return new ur[]{aiX, aiY, aiZ, aja, ajb, ajc};
    }

    static {
        ajd = ur.kQ();
    }
}

