/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.util.da;

public class ax {
    public da bCZ;
    public float bDa;
    public float bDb;

    public ax(float f2, float f3, float f4, float f5, float f6) {
        this(new da(f2, f3, f4), f5, f6);
    }

    public ax j(float f2, float f3) {
        return new ax(this, f2, f3);
    }

    public ax(ax ax2, float f2, float f3) {
        this.bCZ = ax2.bCZ;
        this.bDa = f2;
        this.bDb = f3;
    }

    public ax(da da2, float f2, float f3) {
        this.bCZ = da2;
        this.bDa = f2;
        this.bDb = f3;
    }
}

