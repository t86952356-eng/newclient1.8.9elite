/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public final class aq
extends Enum<aq> {
    public static final /* enum */ aq dwO = new aq(1, "Towards positive");
    public static final /* enum */ aq dwP = new aq(-1, "Towards negative");
    private final int dwQ;
    private final String dwR;
    private static final /* synthetic */ aq[] dwS;

    public static aq[] values() {
        return (aq[])dwS.clone();
    }

    public static aq valueOf(String string) {
        return Enum.valueOf(aq.class, string);
    }

    private aq(int n3, String string2) {
        this.dwQ = n3;
        this.dwR = string2;
    }

    public int asS() {
        return this.dwQ;
    }

    public String toString() {
        return this.dwR;
    }

    private static /* synthetic */ aq[] asT() {
        return new aq[]{dwO, dwP};
    }

    static {
        dwS = aq.asT();
    }
}

