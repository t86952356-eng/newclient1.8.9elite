/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.awt.Color;

public final class abz
extends Enum<abz> {
    public static final /* enum */ abz aAa = new abz(23, 26, 33, 254);
    public static final /* enum */ abz aAb = new abz(18, 20, 25);
    public static final /* enum */ abz aAc = new abz(255, 255, 255);
    public static final /* enum */ abz aAd = new abz(255, 255, 255, 220);
    public static final /* enum */ abz aAe = new abz(255, 255, 255, 130);
    public static final /* enum */ abz aAf = new abz(0, 0, 0, 50);
    private final Color aAg;
    private static final /* synthetic */ abz[] aAh;

    public static abz[] values() {
        return (abz[])aAh.clone();
    }

    public static abz valueOf(String string) {
        return Enum.valueOf(abz.class, string);
    }

    private abz(int n3, int n4, int n5, int n6) {
        this.aAg = new Color(n3, n4, n5, n6);
    }

    private abz(int n3, int n4, int n5) {
        this.aAg = new Color(n3, n4, n5, 255);
    }

    public Color ql() {
        return this.aAg;
    }

    public int qm() {
        return this.aAg.getRGB();
    }

    public Color V(int n2) {
        return new Color(n2, this.aAg.getGreen(), this.aAg.getBlue(), this.aAg.getAlpha());
    }

    public Color W(int n2) {
        return new Color(this.aAg.getRed(), n2, this.aAg.getBlue(), this.aAg.getAlpha());
    }

    public Color X(int n2) {
        return new Color(this.aAg.getRed(), this.aAg.getGreen(), n2, this.aAg.getAlpha());
    }

    public Color Y(int n2) {
        return new Color(this.aAg.getRed(), this.aAg.getGreen(), this.aAg.getBlue(), n2);
    }

    public int Z(int n2) {
        return this.Y(n2).getRGB();
    }

    private static /* synthetic */ abz[] qn() {
        return new abz[]{aAa, aAb, aAc, aAd, aAe, aAf};
    }

    static {
        aAh = abz.qn();
    }
}

