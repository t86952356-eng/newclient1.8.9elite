/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;

public final class i
extends Enum<i> {
    public static final /* enum */ i drp = new i("base", "b");
    public static final /* enum */ i drq = new i("square_bottom_left", "bl", "   ", "   ", "#  ");
    public static final /* enum */ i drr = new i("square_bottom_right", "br", "   ", "   ", "  #");
    public static final /* enum */ i drs = new i("square_top_left", "tl", "#  ", "   ", "   ");
    public static final /* enum */ i drt = new i("square_top_right", "tr", "  #", "   ", "   ");
    public static final /* enum */ i dru = new i("stripe_bottom", "bs", "   ", "   ", "###");
    public static final /* enum */ i drv = new i("stripe_top", "ts", "###", "   ", "   ");
    public static final /* enum */ i drw = new i("stripe_left", "ls", "#  ", "#  ", "#  ");
    public static final /* enum */ i drx = new i("stripe_right", "rs", "  #", "  #", "  #");
    public static final /* enum */ i dry = new i("stripe_center", "cs", " # ", " # ", " # ");
    public static final /* enum */ i drz = new i("stripe_middle", "ms", "   ", "###", "   ");
    public static final /* enum */ i drA = new i("stripe_downright", "drs", "#  ", " # ", "  #");
    public static final /* enum */ i drB = new i("stripe_downleft", "dls", "  #", " # ", "#  ");
    public static final /* enum */ i drC = new i("small_stripes", "ss", "# #", "# #", "   ");
    public static final /* enum */ i drD = new i("cross", "cr", "# #", " # ", "# #");
    public static final /* enum */ i drE = new i("straight_cross", "sc", " # ", "###", " # ");
    public static final /* enum */ i drF = new i("triangle_bottom", "bt", "   ", " # ", "# #");
    public static final /* enum */ i drG = new i("triangle_top", "tt", "# #", " # ", "   ");
    public static final /* enum */ i drH = new i("triangles_bottom", "bts", "   ", "# #", " # ");
    public static final /* enum */ i drI = new i("triangles_top", "tts", " # ", "# #", "   ");
    public static final /* enum */ i drJ = new i("diagonal_left", "ld", "## ", "#  ", "   ");
    public static final /* enum */ i drK = new i("diagonal_up_right", "rd", "   ", "  #", " ##");
    public static final /* enum */ i drL = new i("diagonal_up_left", "lud", "   ", "#  ", "## ");
    public static final /* enum */ i drM = new i("diagonal_right", "rud", " ##", "  #", "   ");
    public static final /* enum */ i drN = new i("circle", "mc", "   ", " # ", "   ");
    public static final /* enum */ i drO = new i("rhombus", "mr", " # ", "# #", " # ");
    public static final /* enum */ i drP = new i("half_vertical", "vh", "## ", "## ", "## ");
    public static final /* enum */ i drQ = new i("half_horizontal", "hh", "###", "###", "   ");
    public static final /* enum */ i drR = new i("half_vertical_right", "vhr", " ##", " ##", " ##");
    public static final /* enum */ i drS = new i("half_horizontal_bottom", "hhb", "   ", "###", "###");
    public static final /* enum */ i drT = new i("border", "bo", "###", "# #", "###");
    public static final /* enum */ i drU = new i("curly_border", "cbo", new co(Blocks.cNp));
    public static final /* enum */ i drV = new i("creeper", "cre", new co(Items.cSb, 1, 4));
    public static final /* enum */ i drW = new i("gradient", "gra", "# #", " # ", " # ");
    public static final /* enum */ i drX = new i("gradient_up", "gru", " # ", " # ", "# #");
    public static final /* enum */ i drY = new i("bricks", "bri", new co(Blocks.cLX));
    public static final /* enum */ i drZ = new i("skull", "sku", new co(Items.cSb, 1, 1));
    public static final /* enum */ i dsa = new i("flower", "flo", new co(Blocks.cLQ, 1, BlockFlower$EnumFlowerType.aVj.yi()));
    public static final /* enum */ i dsb = new i("mojang", "moj", new co(Items.cQs, 1, 1));
    private final String dsc;
    private final String dsd;
    private final String[] dse = new String[3];
    private co dsf;
    private static final /* synthetic */ i[] dsg;

    public static i[] values() {
        return (i[])dsg.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private i(String string2, String string3) {
        this.dsc = string2;
        this.dsd = string3;
    }

    private i(String string2, String string3, co co2) {
        this(string2, string3);
        this.dsf = co2;
    }

    private i(String string2, String string3, String string4, String string5, String string6) {
        this(string2, string3);
        this.dse[0] = string4;
        this.dse[1] = string5;
        this.dse[2] = string6;
    }

    public String aqc() {
        return this.dsc;
    }

    public String aqd() {
        return this.dsd;
    }

    public String[] aqe() {
        return this.dse;
    }

    public boolean aqf() {
        return this.dsf != null || this.dse[0] != null;
    }

    public boolean aqg() {
        return this.dsf != null;
    }

    public co aqh() {
        return this.dsf;
    }

    public static i fX(String string) {
        for (i i2 : i.values()) {
            if (!i2.dsd.equals(string)) continue;
            return i2;
        }
        return null;
    }

    private static /* synthetic */ i[] aqi() {
        return new i[]{drp, drq, drr, drs, drt, dru, drv, drw, drx, dry, drz, drA, drB, drC, drD, drE, drF, drG, drH, drI, drJ, drK, drL, drM, drN, drO, drP, drQ, drR, drS, drT, drU, drV, drW, drX, drY, drZ, dsa, dsb};
    }

    static {
        dsg = i.aqi();
    }
}

