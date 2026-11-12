/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

final class yn
extends Enum<yn> {
    public static final /* enum */ yn asH = new yn();
    public static final /* enum */ yn asI = new yn();
    public static final /* enum */ yn asJ = new yn();
    public static final /* enum */ yn asK = new yn();
    public static final /* enum */ yn asL = new yn();
    public static final /* enum */ yn asM = new yn();
    private static final /* synthetic */ yn[] asN;

    public static yn[] values() {
        return (yn[])asN.clone();
    }

    public static yn valueOf(String string) {
        return Enum.valueOf(yn.class, string);
    }

    private static /* synthetic */ yn[] nB() {
        return new yn[]{asH, asI, asJ, asK, asL, asM};
    }

    static {
        asN = yn.nB();
    }
}

