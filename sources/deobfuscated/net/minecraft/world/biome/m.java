/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.entity.p;
import net.minecraft.util.df;

public class m
extends df {
    public Class<? extends p> bUo;
    public int dHv;
    public int dHw;

    public m(Class<? extends p> clazz, int n2, int n3, int n4) {
        super(n2);
        this.bUo = clazz;
        this.dHv = n3;
        this.dHw = n4;
    }

    public String toString() {
        return this.bUo.getSimpleName() + "*(" + this.dHv + "-" + this.dHw + "):" + this.dAR;
    }
}

