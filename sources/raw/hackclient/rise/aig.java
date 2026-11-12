/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aig
extends Enum<aig> {
    public static final /* enum */ aig aOR = new aig();
    public static final /* enum */ aig aOS = new aig();
    public static final /* enum */ aig aOT = new aig();
    public static final /* enum */ aig aOU = new aig();
    public static final /* enum */ aig aOV = new aig();
    public static final /* enum */ aig aOW = new aig();
    public static final /* enum */ aig aOX = new aig();
    private static final /* synthetic */ aig[] aOY;

    public static aig[] values() {
        return (aig[])aOY.clone();
    }

    public static aig valueOf(String string) {
        return Enum.valueOf(aig.class, string);
    }

    private static /* synthetic */ aig[] vr() {
        return new aig[]{aOR, aOS, aOT, aOU, aOV, aOW, aOX};
    }

    static {
        aOY = aig.vr();
    }
}

