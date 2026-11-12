/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.co;

class wo {
    private final co amE;
    private final String amF;
    private final String amG;
    private final double amH;
    private final double amI;
    private final MapColor amJ;
    private final akd amK;
    private final boolean amL;
    private final boolean amM;

    wo(co co2, double d2, MapColor mapColor, akd akd2, boolean bl2, boolean bl3) {
        this.amE = co2;
        this.amL = bl2;
        this.amM = bl3;
        this.amF = bl3 ? "Not Protected" : (bl2 ? "Incomplete" : co2.getDisplayName());
        this.amH = d2;
        this.amI = Math.sqrt(d2);
        this.amJ = mapColor;
        this.amK = akd2;
        this.amG = wo.t(this.amI);
    }

    private static String t(double d2) {
        double d3 = (double)Math.round(d2 * 10.0) / 10.0;
        return d3 + "m";
    }

    public co ls() {
        return this.amE;
    }

    public String lt() {
        return this.amF;
    }

    public double ll() {
        return this.amH;
    }

    public double lu() {
        return this.amI;
    }

    public MapColor lv() {
        return this.amJ;
    }

    public akd lw() {
        return this.amK;
    }

    public boolean lx() {
        return this.amL;
    }

    public boolean ly() {
        return this.amM;
    }

    public String lz() {
        return this.amG;
    }
}

