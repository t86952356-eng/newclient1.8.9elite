/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.adz;
import hackclient.rise.ais;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import lombok.Generated;
import net.minecraft.util.an;
import rise.Client;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;

public final class ady
extends Enum<ady> {
    public static final /* enum */ ady aDI = new ady("Aubergine", new Color(170, 7, 107), new Color(97, 4, 95), an.dvQ, adz.aEM, adz.aEF);
    public static final /* enum */ ady aDJ = new ady("Aqua", new Color(185, 250, 255), new Color(79, 199, 200), an.dvW, adz.aEK);
    public static final /* enum */ ady aDK = new ady("Banana", new Color(253, 236, 177), new Color(255, 255, 255), an.dvZ, adz.aEH);
    public static final /* enum */ ady aDL = new ady("Blend", new Color(71, 148, 253), new Color(71, 253, 160), an.dvW, adz.aEK, adz.aEI);
    public static final /* enum */ ady aDM = new ady("Blossom", new Color(226, 208, 249), new Color(49, 119, 115), an.dvO, adz.aEN, adz.aEO);
    public static final /* enum */ ady aDN = new ady("Bubblegum", new Color(243, 145, 216), new Color(152, 165, 243), an.dvY, adz.aEN, adz.aEM);
    public static final /* enum */ ady aDO = new ady("Candy Cane", new Color(255, 0, 0), new Color(255, 255, 255), an.dvX, adz.aEF);
    public static final /* enum */ ady aDP = new ady("Cherry", new Color(187, 55, 125), new Color(251, 211, 233), an.dvX, adz.aEF, adz.aEM, adz.aEN);
    public static final /* enum */ ady aDQ = new ady("Christmas", new Color(255, 64, 64), new Color(255, 255, 255), new Color(64, 255, 64), an.dvX, adz.aEF, adz.aEI);
    public static final /* enum */ ady aDR = new ady("Coral", new Color(244, 168, 150), new Color(52, 133, 151), an.dvO, adz.aEN, adz.aEG, adz.aEL);
    public static final /* enum */ ady aDS = new ady("Digital Horizon", new Color(95, 195, 228), new Color(229, 93, 135), an.dvW, adz.aEK, adz.aEF, adz.aEN);
    public static final /* enum */ ady aDT = new ady("Express", new Color(173, 83, 137), new Color(60, 16, 83), an.dvQ, adz.aEM, adz.aEN);
    public static final /* enum */ ady aDU = new ady("Lime Water", new Color(18, 255, 247), new Color(179, 255, 171), an.dvW, adz.aEK, adz.aEI);
    public static final /* enum */ ady aDV = new ady("Lush", new Color(168, 224, 99), new Color(86, 171, 47), an.dvV, adz.aEI, adz.aEJ);
    public static final /* enum */ ady aDW = new ady("Halogen", new Color(255, 65, 108), new Color(255, 75, 43), an.dvX, adz.aEF, adz.aEG);
    public static final /* enum */ ady aDX = new ady("Hyper", new Color(236, 110, 173), new Color(52, 148, 230), an.dvY, adz.aEN, adz.aEL, adz.aEK);
    public static final /* enum */ ady aDY = new ady("Magic", new Color(74, 0, 224), new Color(142, 45, 226), an.dvU, adz.aEL, adz.aEM);
    public static final /* enum */ ady aDZ = new ady("May", new Color(238, 79, 238), new Color(253, 219, 245), an.dvY, adz.aEN, adz.aEM);
    public static final /* enum */ ady aEa = new ady("Orange Juice", new Color(252, 74, 26), new Color(247, 183, 51), an.dvR, adz.aEG, adz.aEH);
    public static final /* enum */ ady aEb = new ady("Pastel", new Color(243, 155, 178), new Color(207, 196, 243), an.dvY, adz.aEN);
    public static final /* enum */ ady aEc = new ady("Pumpkin", new Color(241, 166, 98), new Color(255, 216, 169), new Color(227, 139, 42), an.dvR, adz.aEG);
    public static final /* enum */ ady aEd = new ady("Satin", new Color(215, 60, 67), new Color(140, 23, 39), an.dvX, adz.aEF);
    public static final /* enum */ ady aEe = new ady("Snowy Sky", new Color(1, 171, 179), new Color(234, 234, 234), new Color(18, 232, 232), an.dvW, adz.aEK, adz.aEO);
    public static final /* enum */ ady aEf = new ady("Steel Fade", new Color(66, 134, 244), new Color(55, 59, 68), an.dvU, adz.aEL, adz.aEO);
    public static final /* enum */ ady aEg = new ady("Sundae", new Color(206, 74, 126), new Color(122, 44, 77), an.dvX, adz.aEN, adz.aEM, adz.aEF);
    public static final /* enum */ ady aEh = new ady("Sunkist", new Color(242, 201, 76), new Color(242, 153, 74), an.dvZ, adz.aEH, adz.aEG);
    public static final /* enum */ ady aEi = new ady("Water", new Color(12, 232, 199), new Color(12, 163, 232), an.dvW, adz.aEK, adz.aEL);
    public static final /* enum */ ady aEj = new ady("Legacy", new Color(7393023), new Color(7393023), an.dvW, adz.aEK, adz.aEL);
    public static final /* enum */ ady aEk = new ady("Winter", Color.WHITE, Color.WHITE, an.dvS, adz.aEO, adz.aEO);
    public static final /* enum */ ady aEl = new ady("Peony", new Color(226, 208, 249), new Color(207, 171, 255), an.dvO, adz.aEN, adz.aEO);
    public static final /* enum */ ady aEm = new ady("Shadow", new Color(97, 131, 255), new Color(206, 212, 255), an.dvW, adz.aEK);
    public static final /* enum */ ady aEn = new ady("Wood", new Color(79, 109, 81), new Color(170, 139, 87), new Color(240, 235, 206), an.dvN, adz.aEJ);
    public static final /* enum */ ady aEo = new ady("Creida", new Color(-11644304).brighter().brighter(), new Color(-11644304).darker(), an.dwb, adz.aEO);
    public static final /* enum */ ady aEp = new ady("Creida Two", new Color(-6632725), new Color(-8406042).darker(), an.dwb, adz.aEO);
    public static final /* enum */ ady aEq = new ady("Gothic", new Color(31, 30, 30), new Color(196, 190, 190), an.dwb, adz.aEO);
    public static final /* enum */ ady aEr = new ady("Rue", new Color(234, 118, 176), new Color(31, 30, 30), an.dvQ, adz.aEN);
    public static final /* enum */ ady aEs = new ady("Purple", new Color(5391249), new Color(5391249).brighter(), an.dwb, new adz[0]);
    public static final /* enum */ ady aEt = new ady("Rainbow", vector2d -> ais.aB((int)((vector2d.getX() + vector2d.getY()) * 10.0)), an.dvX, new adz[0]);
    public static final /* enum */ ady aEu = new ady("Nord", new Color(143, 188, 187), new Color(163, 190, 140), new Color(236, 239, 244), an.dvW, adz.aEK, adz.aEO);
    private final String aEv;
    private Color aEw = null;
    private Color aEx = null;
    private Color aEy = null;
    private Function<Vector2d, Color> aEz;
    private final an aEA;
    private final ArrayList<adz> aEB;
    private final boolean aEC;
    static Color aED;
    private static final /* synthetic */ ady[] aEE;

    public static ady[] values() {
        return (ady[])aEE.clone();
    }

    public static ady valueOf(String string) {
        return Enum.valueOf(ady.class, string);
    }

    private ady(String string2, Color color, Color color2, an an2, adz ... adzArray) {
        this.aEv = string2;
        this.aEw = this.aEy = color;
        this.aEx = color2;
        this.aEA = an2;
        this.aEB = new ArrayList<adz>(Arrays.asList(adzArray));
        this.aEC = false;
    }

    private ady(String string2, Color color, Color color2, Color color3, an an2, adz ... adzArray) {
        this.aEv = string2;
        this.aEw = color;
        this.aEx = color2;
        this.aEy = color3;
        this.aEA = an2;
        this.aEB = new ArrayList<adz>(Arrays.asList(adzArray));
        this.aEC = true;
    }

    private ady(String string2, Function<Vector2d, Color> function, an an2, adz ... adzArray) {
        this.aEv = string2;
        this.aEz = function;
        this.aEA = an2;
        this.aEB = new ArrayList<adz>(Arrays.asList(adzArray));
        this.aEC = true;
    }

    public Color rQ() {
        return this.aEz == null ? this.aEw : this.j(new Vector2d(0.0, 0.0));
    }

    public Color rR() {
        return this.aEz == null ? this.aEx : this.j(new Vector2d(0.0, 50.0));
    }

    public Color rS() {
        return this.aEz == null ? this.aEy : this.j(new Vector2d(0.0, 100.0));
    }

    public Color j(Vector2d vector2d) {
        if (this.aEz != null) {
            return this.aEz.apply(vector2d);
        }
        if (this.aEC) {
            double d2 = this.k(vector2d);
            if (d2 <= 0.5) {
                return ais.a(this.rR(), this.rQ(), d2 * 2.0);
            }
            return ais.a(this.rS(), this.rR(), (d2 - 0.5) * 2.0);
        }
        return ais.a(this.rQ(), this.rR(), this.k(vector2d));
    }

    public Color rT() {
        return this.j(new Vector2d(0.0, 0.0));
    }

    @Deprecated
    public int pB() {
        try {
            Interface interface_ = Client.a.g().c(Interface.class);
            if (interface_ != null) {
                return (int)interface_.lU();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 4;
    }

    public float qt() {
        return 4.5f;
    }

    public Color rU() {
        return new Color(0, 0, 0, 190);
    }

    public double k(Vector2d vector2d) {
        return Math.sin((double)System.currentTimeMillis() / 600.0 + vector2d.getX() * 0.005 + vector2d.getY() * 0.06) * 0.5 + 0.5;
    }

    @Generated
    public String rV() {
        return this.aEv;
    }

    @Generated
    public Function<Vector2d, Color> rW() {
        return this.aEz;
    }

    @Generated
    public an rX() {
        return this.aEA;
    }

    @Generated
    public ArrayList<adz> rY() {
        return this.aEB;
    }

    @Generated
    public boolean rZ() {
        return this.aEC;
    }

    @Generated
    public static Color sa() {
        return aED;
    }

    @Generated
    public static void c(Color color) {
        aED = color;
    }

    private static /* synthetic */ ady[] sb() {
        return new ady[]{aDI, aDJ, aDK, aDL, aDM, aDN, aDO, aDP, aDQ, aDR, aDS, aDT, aDU, aDV, aDW, aDX, aDY, aDZ, aEa, aEb, aEc, aEd, aEe, aEf, aEg, aEh, aEi, aEj, aEk, aEl, aEm, aEn, aEo, aEp, aEq, aEr, aEs, aEt, aEu};
    }

    static {
        aEE = ady.sb();
        aED = new Color(0, 0, 0, 110);
    }
}

