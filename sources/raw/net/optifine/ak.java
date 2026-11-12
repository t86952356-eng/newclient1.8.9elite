/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Properties;
import net.minecraft.util.cm;
import net.optifine.config.a;

public class ak {
    private final String ebw;
    private final cm[] ebx;
    private int biW = 1;
    private int eby = 64;
    private int ebz = 3;
    private int ebA = 3;
    private int ebB = -2130706433;
    private int ebC = 0xFFFFFF;
    private int ebD = 0;
    private int ebE = Integer.MIN_VALUE;

    public ak(String string, Properties properties) {
        a a2 = new a("CustomPanorama");
        this.ebw = string;
        this.ebx = new cm[6];
        for (int i2 = 0; i2 < this.ebx.length; ++i2) {
            this.ebx[i2] = new cm(string + "/panorama_" + i2 + ".png");
        }
        this.biW = a2.x(properties.getProperty("weight"), 1);
        this.eby = a2.x(properties.getProperty("blur1"), 64);
        this.ebz = a2.x(properties.getProperty("blur2"), 3);
        this.ebA = a2.x(properties.getProperty("blur3"), 3);
        this.ebB = a.O(properties.getProperty("overlay1.top"), -2130706433);
        this.ebC = a.O(properties.getProperty("overlay1.bottom"), 0xFFFFFF);
        this.ebD = a.O(properties.getProperty("overlay2.top"), 0);
        this.ebE = a.O(properties.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
    }

    public cm[] aAU() {
        return this.ebx;
    }

    public int Cl() {
        return this.biW;
    }

    public int aAV() {
        return this.eby;
    }

    public int aAW() {
        return this.ebz;
    }

    public int aAX() {
        return this.ebA;
    }

    public int aAY() {
        return this.ebB;
    }

    public int aAZ() {
        return this.ebC;
    }

    public int aBa() {
        return this.ebD;
    }

    public int aBb() {
        return this.ebE;
    }

    public String toString() {
        return this.ebw + ", weight: " + this.biW + ", blur: " + this.eby + " " + this.ebz + " " + this.ebA + ", overlay: " + this.ebB + " " + this.ebC + " " + this.ebD + " " + this.ebE;
    }
}

