/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.block.material.Material;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ah;
import net.minecraft.entity.passive.x;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.bt;

public class w
extends ah {
    public float cGZ;
    public float cHa;
    public float cHb;
    public float cHc;
    public float cHd;
    public float cHe;
    public float cHf;
    public float cHg;
    private float cHh;
    private float cHi;
    private float cHj;
    private float cHk;
    private float cHl;
    private float cHm;

    public w(net.minecraft.world.w w2) {
        super(w2);
        this.o(0.95f, 0.95f);
        this.ta.setSeed(1 + this.getEntityId());
        this.cHi = 1.0f / (this.ta.nextFloat() + 1.0f) * 0.2f;
        this.ctS.a(0, new x(this));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(10.0);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.5f;
    }

    @Override
    protected String Vb() {
        return null;
    }

    @Override
    protected String VN() {
        return null;
    }

    @Override
    protected String VO() {
        return null;
    }

    @Override
    protected float VZ() {
        return 0.4f;
    }

    @Override
    protected d Vc() {
        return null;
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(3 + n2) + 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(new co(Items.cRa, 1, b.cUR.ado()), 0.0f);
        }
    }

    @Override
    public boolean isInWater() {
        return this.baU.a(this.Us().ad(0.0, -0.6f, 0.0), Material.bev, this, 0.014);
    }

    @Override
    public void Dn() {
        super.Dn();
        this.cHa = this.cGZ;
        this.cHc = this.cHb;
        this.cHe = this.cHd;
        this.cHg = this.cHf;
        this.cHd += this.cHi;
        if ((double)this.cHd > Math.PI * 2) {
            if (this.baU.dDw) {
                this.cHd = (float)Math.PI * 2;
            } else {
                this.cHd = (float)((double)this.cHd - Math.PI * 2);
                if (this.ta.nextInt(10) == 0) {
                    this.cHi = 1.0f / (this.ta.nextFloat() + 1.0f) * 0.2f;
                }
                this.baU.a((c)this, (byte)19);
            }
        }
        if (this.csz) {
            float f2;
            if (this.cHd < (float)Math.PI) {
                f2 = this.cHd / (float)Math.PI;
                this.cHf = bt.bx(f2 * f2 * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f2 > 0.75) {
                    this.cHh = 1.0f;
                    this.cHj = 1.0f;
                } else {
                    this.cHj *= 0.8f;
                }
            } else {
                this.cHf = 0.0f;
                this.cHh *= 0.9f;
                this.cHj *= 0.99f;
            }
            if (!this.baU.dDw) {
                this.ud = this.cHk * this.cHh;
                this.ue = this.cHl * this.cHh;
                this.uf = this.cHm * this.cHh;
            }
            f2 = bt.aD(this.ud * this.ud + this.uf * this.uf);
            this.cuF += (-((float)bt.y(this.ud, this.uf)) * 180.0f / (float)Math.PI - this.cuF) * 0.1f;
            this.pl = this.cuF;
            this.cHb = (float)((double)this.cHb + Math.PI * (double)this.cHj * 1.5);
            this.cGZ += (-((float)bt.y(f2, this.ue)) * 180.0f / (float)Math.PI - this.cGZ) * 0.1f;
        } else {
            this.cHf = bt.bz(bt.bx(this.cHd)) * (float)Math.PI * 0.25f;
            if (!this.baU.dDw) {
                this.ud = 0.0;
                this.ue -= 0.08;
                this.ue *= (double)0.98f;
                this.uf = 0.0;
            }
            this.cGZ = (float)((double)this.cGZ + (double)(-90.0f - this.cGZ) * 0.02);
        }
    }

    @Override
    public void t(float f2, float f3) {
        this.y(this.ud, this.ue, this.uf);
    }

    @Override
    public boolean UB() {
        return this.gX > 45.0 && this.gX < (double)this.baU.avB() && super.UB();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 19) {
            this.cHd = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public void y(float f2, float f3, float f4) {
        this.cHk = f2;
        this.cHl = f3;
        this.cHm = f4;
    }

    public boolean abk() {
        return this.cHk != 0.0f || this.cHl != 0.0f || this.cHm != 0.0f;
    }
}

