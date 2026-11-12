/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aeh
extends Enum<aeh> {
    public static final /* enum */ aeh aEV = new aeh();
    public static final /* enum */ aeh aEW = new aeh();
    public static final /* enum */ aeh aEX = new aeh();
    public static final /* enum */ aeh aEY = new aeh();
    public static final /* enum */ aeh aEZ = new aeh();
    private static final /* synthetic */ aeh[] aFa;

    public static aeh[] values() {
        return (aeh[])aFa.clone();
    }

    public static aeh valueOf(String string) {
        return Enum.valueOf(aeh.class, string);
    }

    private static /* synthetic */ aeh[] sm() {
        return new aeh[]{aEV, aEW, aEX, aEY, aEZ};
    }

    static {
        aFa = aeh.sm();
    }
}

