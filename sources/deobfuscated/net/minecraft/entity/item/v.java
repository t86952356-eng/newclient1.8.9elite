/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class v
extends c {
    public int cDI;
    private r cDJ;

    public v(w w2) {
        super(w2);
        this.crz = true;
        this.o(0.98f, 0.98f);
    }

    public v(w w2, double d2, double d3, double d4, r r2) {
        this(w2);
        this.setPosition(d2, d3, d4);
        float f2 = (float)(Math.random() * Math.PI * 2.0);
        this.ud = -((float)Math.sin(f2)) * 0.02f;
        this.ue = 0.2f;
        this.uf = -((float)Math.cos(f2)) * 0.02f;
        this.cDI = 80;
        this.crF = d2;
        this.crG = d3;
        this.crH = d4;
        this.cDJ = r2;
    }

    @Override
    protected void IA() {
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    public boolean TO() {
        return !this.csb;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.ue -= (double)0.04f;
        this.y(this.ud, this.ue, this.uf);
        this.ud *= (double)0.98f;
        this.ue *= (double)0.98f;
        this.uf *= (double)0.98f;
        if (this.aO) {
            this.ud *= (double)0.7f;
            this.uf *= (double)0.7f;
            this.ue *= -0.5;
        }
        if (this.cDI-- <= 0) {
            this.Tt();
            if (!this.baU.dDw) {
                this.YV();
            }
        } else {
            this.TH();
            this.baU.a(as.dxh, this.gW, this.gX + 0.5, this.gY, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void YV() {
        float f2 = 4.0f;
        this.baU.a(this, this.gW, this.gX + (double)(this.height / 16.0f), this.gY, 4.0f, true);
    }

    @Override
    protected void d(n n2) {
        n2.a("Fuse", (byte)this.cDI);
    }

    @Override
    protected void e(n n2) {
        this.cDI = n2.eE("Fuse");
    }

    public r YW() {
        return this.cDJ;
    }

    @Override
    public float getEyeHeight() {
        return 0.0f;
    }
}

