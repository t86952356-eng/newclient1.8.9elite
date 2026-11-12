/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

public final class u
extends Enum<u> {
    public static final /* enum */ u cDb = new u("Kebab", 16, 16, 0, 0);
    public static final /* enum */ u cDc = new u("Aztec", 16, 16, 16, 0);
    public static final /* enum */ u cDd = new u("Alban", 16, 16, 32, 0);
    public static final /* enum */ u cDe = new u("Aztec2", 16, 16, 48, 0);
    public static final /* enum */ u cDf = new u("Bomb", 16, 16, 64, 0);
    public static final /* enum */ u cDg = new u("Plant", 16, 16, 80, 0);
    public static final /* enum */ u cDh = new u("Wasteland", 16, 16, 96, 0);
    public static final /* enum */ u cDi = new u("Pool", 32, 16, 0, 32);
    public static final /* enum */ u cDj = new u("Courbet", 32, 16, 32, 32);
    public static final /* enum */ u cDk = new u("Sea", 32, 16, 64, 32);
    public static final /* enum */ u cDl = new u("Sunset", 32, 16, 96, 32);
    public static final /* enum */ u cDm = new u("Creebet", 32, 16, 128, 32);
    public static final /* enum */ u cDn = new u("Wanderer", 16, 32, 0, 64);
    public static final /* enum */ u cDo = new u("Graham", 16, 32, 16, 64);
    public static final /* enum */ u cDp = new u("Match", 32, 32, 0, 128);
    public static final /* enum */ u cDq = new u("Bust", 32, 32, 32, 128);
    public static final /* enum */ u cDr = new u("Stage", 32, 32, 64, 128);
    public static final /* enum */ u cDs = new u("Void", 32, 32, 96, 128);
    public static final /* enum */ u cDt = new u("SkullAndRoses", 32, 32, 128, 128);
    public static final /* enum */ u cDu = new u("Wither", 32, 32, 160, 128);
    public static final /* enum */ u cDv = new u("Fighters", 64, 32, 0, 96);
    public static final /* enum */ u cDw = new u("Pointer", 64, 64, 0, 192);
    public static final /* enum */ u cDx = new u("Pigscene", 64, 64, 64, 192);
    public static final /* enum */ u cDy = new u("BurningSkull", 64, 64, 128, 192);
    public static final /* enum */ u cDz = new u("Skeleton", 64, 48, 192, 64);
    public static final /* enum */ u cDA = new u("DonkeyKong", 64, 48, 192, 112);
    public static final int cDB;
    public final String cDC;
    public final int cDD;
    public final int cDE;
    public final int cDF;
    public final int cDG;
    private static final /* synthetic */ u[] cDH;

    public static u[] values() {
        return (u[])cDH.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private u(String string2, int n3, int n4, int n5, int n6) {
        this.cDC = string2;
        this.cDD = n3;
        this.cDE = n4;
        this.cDF = n5;
        this.cDG = n6;
    }

    private static /* synthetic */ u[] YU() {
        return new u[]{cDb, cDc, cDd, cDe, cDf, cDg, cDh, cDi, cDj, cDk, cDl, cDm, cDn, cDo, cDp, cDq, cDr, cDs, cDt, cDu, cDv, cDw, cDx, cDy, cDz, cDA};
    }

    static {
        cDH = u.YU();
        cDB = "SkullAndRoses".length();
    }
}

