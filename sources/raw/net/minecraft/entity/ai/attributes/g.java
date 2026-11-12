/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai.attributes;

import net.minecraft.entity.ai.attributes.b;
import net.minecraft.entity.ai.attributes.d;
import net.minecraft.util.bt;

public class g
extends b {
    private final double cAS;
    private final double cAT;
    private String description;

    public g(d d2, String string, double d3, double d4, double d5) {
        super(d2, string, d3);
        this.cAS = d4;
        this.cAT = d5;
        if (d4 > d5) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d3 < d4) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d3 > d5) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public g eg(String string) {
        this.description = string;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public double ao(double d2) {
        d2 = bt.ah(d2, this.cAS, this.cAT);
        return d2;
    }
}

