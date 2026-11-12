/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ae;
import net.minecraft.client.model.ag;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.r;

public class ah
extends ae {
    private float bCd;

    public ah() {
        super(12, 0.0f);
        this.bzg = new ag(this, 0, 0);
        this.bzg.a(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
        this.bzg.g(0.0f, 6.0f, -8.0f);
        this.bzh = new ag(this, 28, 8);
        this.bzh.a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
        this.bzh.g(0.0f, 5.0f, 2.0f);
        float f2 = 0.5f;
        this.bzp = new ag(this, 0, 16);
        this.bzp.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.5f);
        this.bzp.g(-3.0f, 12.0f, 7.0f);
        this.bzq = new ag(this, 0, 16);
        this.bzq.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.5f);
        this.bzq.g(3.0f, 12.0f, 7.0f);
        this.bzr = new ag(this, 0, 16);
        this.bzr.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.5f);
        this.bzr.g(-3.0f, 12.0f, -5.0f);
        this.bzs = new ag(this, 0, 16);
        this.bzs.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.5f);
        this.bzs.g(3.0f, 12.0f, -5.0f);
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

