/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

public final class cb
extends Enum<cb> {
    public static final /* enum */ cb dfG = new cb();
    public static final /* enum */ cb dfH = new cb();
    public static final /* enum */ cb dfI = new cb();
    public static final /* enum */ cb dfJ = new cb();
    public static final /* enum */ cb dfK = new cb();
    private static final /* synthetic */ cb[] dfL;

    public static cb[] values() {
        return (cb[])dfL.clone();
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(cb.class, string);
    }

    public static cb eV(String string) {
        for (cb cb2 : cb.values()) {
            if (!cb2.name().equalsIgnoreCase(string)) continue;
            return cb2;
        }
        return dfG;
    }

    public static String[] air() {
        String[] stringArray = new String[cb.values().length];
        int n2 = 0;
        for (cb cb2 : cb.values()) {
            stringArray[n2++] = cb2.name().toLowerCase();
        }
        return stringArray;
    }

    private static /* synthetic */ cb[] ais() {
        return new cb[]{dfG, dfH, dfI, dfJ, dfK};
    }

    static {
        dfL = cb.ais();
    }
}

