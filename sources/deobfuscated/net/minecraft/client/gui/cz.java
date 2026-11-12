/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.util.bt;

public class cz {
    private final double bue;
    private final double buf;
    private int scaledWidth;
    private int scaledHeight;
    private int scaleFactor;

    public cz(Minecraft minecraft) {
        int n2;
        this.scaledWidth = minecraft.bgz;
        this.scaledHeight = minecraft.bgA;
        this.scaleFactor = 1;
        boolean bl2 = minecraft.Ay();
        int n3 = n2 = minecraft.aIY == null ? 2 : minecraft.aIY.chY;
        if (n2 == 0) {
            n2 = 1000;
        }
        while (this.scaleFactor < n2 && this.scaledWidth / (this.scaleFactor + 1) >= 320 && this.scaledHeight / (this.scaleFactor + 1) >= 240) {
            ++this.scaleFactor;
        }
        if (bl2 && this.scaleFactor % 2 != 0 && this.scaleFactor != 1) {
            --this.scaleFactor;
        }
        this.bue = (double)this.scaledWidth / (double)this.scaleFactor;
        this.buf = (double)this.scaledHeight / (double)this.scaleFactor;
        this.scaledWidth = bt.aI(this.bue);
        this.scaledHeight = bt.aI(this.buf);
    }

    public int getScaledWidth() {
        return this.scaledWidth;
    }

    public int getScaledHeight() {
        return this.scaledHeight;
    }

    public double Gq() {
        return this.bue;
    }

    public double Gr() {
        return this.buf;
    }

    public int getScaleFactor() {
        return this.scaleFactor;
    }
}

