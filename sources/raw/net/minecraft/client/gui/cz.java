/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.util.bt;

public class cz {
    private final double bue;
    private final double buf;
    private int bug;
    private int buh;
    private int bui;

    public cz(d d2) {
        int n2;
        this.bug = d2.bgz;
        this.buh = d2.bgA;
        this.bui = 1;
        boolean bl2 = d2.Ay();
        int n3 = n2 = d2.aIY == null ? 2 : d2.aIY.chY;
        if (n2 == 0) {
            n2 = 1000;
        }
        while (this.bui < n2 && this.bug / (this.bui + 1) >= 320 && this.buh / (this.bui + 1) >= 240) {
            ++this.bui;
        }
        if (bl2 && this.bui % 2 != 0 && this.bui != 1) {
            --this.bui;
        }
        this.bue = (double)this.bug / (double)this.bui;
        this.buf = (double)this.buh / (double)this.bui;
        this.bug = bt.aI(this.bue);
        this.buh = bt.aI(this.buf);
    }

    public int getScaledWidth() {
        return this.bug;
    }

    public int getScaledHeight() {
        return this.buh;
    }

    public double Gq() {
        return this.bue;
    }

    public double Gr() {
        return this.buf;
    }

    public int getScaleFactor() {
        return this.bui;
    }
}

