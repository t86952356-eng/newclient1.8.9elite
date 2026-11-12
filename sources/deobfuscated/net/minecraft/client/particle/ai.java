/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.c;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.a;
import net.minecraft.world.w;

public class ai
extends ae {
    private final int bGo = 160;
    private boolean bGp;
    private boolean bGq;
    private final c bGr;
    private float bGs;
    private float bGt;
    private float bGu;
    private boolean bGv;

    public ai(w w2, double d2, double d3, double d4, double d5, double d6, double d7, c c2) {
        super(w2, d2, d3, d4);
        this.ud = d5;
        this.ue = d6;
        this.uf = d7;
        this.bGr = c2;
        this.bGe *= 0.75f;
        this.bGd = 48 + this.ta.nextInt(12);
        this.csp = false;
    }

    public void al(boolean bl2) {
        this.bGp = bl2;
    }

    public void am(boolean bl2) {
        this.bGq = bl2;
    }

    public void cu(int n2) {
        float f2 = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        float f3 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        float f4 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        float f5 = 1.0f;
        this.h(f2 * 1.0f, f3 * 1.0f, f4 * 1.0f);
    }

    public void cv(int n2) {
        this.bGs = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.bGt = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.bGu = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.bGv = true;
    }

    @Override
    public a ID() {
        return null;
    }

    @Override
    public boolean IE() {
        return false;
    }

    @Override
    public void a(WorldRenderer worldRenderer, net.minecraft.entity.c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!this.bGq || this.bGc < this.bGd / 3 || (this.bGc + this.bGd) / 3 % 2 == 0) {
            super.a(worldRenderer, c2, f2, f3, f4, f5, f6, f7);
        }
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.bGc++ >= this.bGd) {
            this.Tt();
        }
        if (this.bGc > this.bGd / 2) {
            this.aj(1.0f - ((float)this.bGc - (float)(this.bGd / 2)) / (float)this.bGd);
            if (this.bGv) {
                this.bGg += (this.bGs - this.bGg) * 0.2f;
                this.bGh += (this.bGt - this.bGh) * 0.2f;
                this.bGi += (this.bGu - this.bGi) * 0.2f;
            }
        }
        this.ct(this.bGo + (7 - this.bGc * 8 / this.bGd));
        this.ue -= 0.004;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.91f;
        this.ue *= (double)0.91f;
        this.uf *= (double)0.91f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
        }
        if (this.bGp && this.bGc < this.bGd / 2 && (this.bGc + this.bGd) % 2 == 0) {
            ai ai2 = new ai(this.baU, this.gW, this.gX, this.gY, 0.0, 0.0, 0.0, this.bGr);
            ai2.aj(0.99f);
            ai2.h(this.bGg, this.bGh, this.bGi);
            ai2.bGc = ai2.bGd / 2;
            if (this.bGv) {
                ai2.bGv = true;
                ai2.bGs = this.bGs;
                ai2.bGt = this.bGt;
                ai2.bGu = this.bGu;
            }
            ai2.bGq = this.bGq;
            this.bGr.a(ai2);
        }
    }

    @Override
    public int af(float f2) {
        return 0xF000F0;
    }

    @Override
    public float ag(float f2) {
        return 1.0f;
    }
}

