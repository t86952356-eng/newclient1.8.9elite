/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

public final class ad
extends Enum<ad> {
    public static final /* enum */ ad cof = new ad(0, "SuccessCount");
    public static final /* enum */ ad cog = new ad(1, "AffectedBlocks");
    public static final /* enum */ ad coh = new ad(2, "AffectedEntities");
    public static final /* enum */ ad coi = new ad(3, "AffectedItems");
    public static final /* enum */ ad coj = new ad(4, "QueryResult");
    final int cok;
    final String col;
    private static final /* synthetic */ ad[] com;

    public static ad[] values() {
        return (ad[])com.clone();
    }

    public static ad valueOf(String string) {
        return Enum.valueOf(ad.class, string);
    }

    private ad(int n3, String string2) {
        this.cok = n3;
        this.col = string2;
    }

    public int Sm() {
        return this.cok;
    }

    public String Sn() {
        return this.col;
    }

    public static String[] So() {
        String[] stringArray = new String[ad.values().length];
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            stringArray[n2++] = ad2.Sn();
        }
        return stringArray;
    }

    public static ad dS(String string) {
        for (ad ad2 : ad.values()) {
            if (!ad2.Sn().equals(string)) continue;
            return ad2;
        }
        return null;
    }

    private static /* synthetic */ ad[] Sp() {
        return new ad[]{cof, cog, coh, coi, coj};
    }

    static {
        com = ad.Sp();
    }
}

