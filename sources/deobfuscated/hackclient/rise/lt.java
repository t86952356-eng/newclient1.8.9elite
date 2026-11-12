/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

final class lt
extends Enum<lt> {
    public static final /* enum */ lt CJ = new lt();
    public static final /* enum */ lt CK = new lt();
    public static final /* enum */ lt CL = new lt();
    public static final /* enum */ lt CM = new lt();
    private static final /* synthetic */ lt[] CN;

    public static lt[] values() {
        return (lt[])CN.clone();
    }

    public static lt valueOf(String string) {
        return Enum.valueOf(lt.class, string);
    }

    private static /* synthetic */ lt[] gZ() {
        return new lt[]{CJ, CK, CL, CM};
    }

    static {
        CN = lt.gZ();
    }
}

