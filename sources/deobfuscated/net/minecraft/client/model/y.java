/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class y
extends d {
    public ag bAN;

    public y() {
        this(0, 0, 32, 32);
    }

    public y(int n2, int n3, int n4, int n5) {
        this.bys = n4;
        this.byt = n5;
        this.bAN = new ag(this, n2, n3);
        this.bAN.a(-3.0f, -6.0f, -3.0f, 6, 8, 6, 0.0f);
        this.bAN.g(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bAN.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bAN.bBG = f5 / 57.295776f;
        this.bAN.bBF = f6 / 57.295776f;
    }
}

