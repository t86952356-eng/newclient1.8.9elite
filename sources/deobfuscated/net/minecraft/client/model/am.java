/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;

public class am
extends d {
    public ag bCl;

    public am() {
        this(0, 35, 64, 64);
    }

    public am(int n2, int n3, int n4, int n5) {
        this.bys = n4;
        this.byt = n5;
        this.bCl = new ag(this, n2, n3);
        this.bCl.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.bCl.g(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCl.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCl.bBG = f5 / 57.295776f;
        this.bCl.bBF = f6 / 57.295776f;
    }
}

