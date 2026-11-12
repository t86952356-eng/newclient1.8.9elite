/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ae;
import net.minecraft.client.model.ag;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.r;

public class ai
extends ae {
    private float bCd;

    public ai() {
        super(12, 0.0f);
        this.bzg = new ag(this, 0, 0);
        this.bzg.a(-3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        this.bzg.g(0.0f, 6.0f, -8.0f);
        this.bzh = new ag(this, 28, 8);
        this.bzh.a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        this.bzh.g(0.0f, 5.0f, 2.0f);
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        super.a(r2, f2, f3, f4);
        this.bzg.bBD = 6.0f + ((u)r2).bo(f4) * 9.0f;
        this.bCd = ((u)r2).bp(f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bzg.bBF = this.bCd;
    }
}

