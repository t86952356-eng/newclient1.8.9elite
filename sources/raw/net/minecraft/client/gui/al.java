/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

final class al
extends Enum<al> {
    public static final /* enum */ al boK = new al(0, 146);
    public static final /* enum */ al boL = new al(0, 166);
    public static final /* enum */ al boM = new al(0, 186);
    public static final /* enum */ al boN = new al(20, 146);
    public static final /* enum */ al boO = new al(20, 166);
    public static final /* enum */ al boP = new al(20, 186);
    private final int boQ;
    private final int boR;
    private static final /* synthetic */ al[] boS;

    public static al[] values() {
        return (al[])boS.clone();
    }

    public static al valueOf(String string) {
        return Enum.valueOf(al.class, string);
    }

    private al(int n3, int n4) {
        this.boQ = n3;
        this.boR = n4;
    }

    public int EH() {
        return this.boQ;
    }

    public int EI() {
        return this.boR;
    }

    private static /* synthetic */ al[] EJ() {
        return new al[]{boK, boL, boM, boN, boO, boP};
    }

    static {
        boS = al.EJ();
    }
}

