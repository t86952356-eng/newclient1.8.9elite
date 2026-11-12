/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.bt;

public class w
extends c {
    public int cDK;
    public int cDL;
    public int cCs;
    private int cDM = 5;
    private int cDN;
    private a cDO;
    private int cDP;

    public w(net.minecraft.world.w w2, double d2, double d3, double d4, int n2) {
        super(w2);
        this.o(0.5f, 0.5f);
        this.setPosition(d2, d3, d4);
        this.pl = (float)(Math.random() * 360.0);
        this.ud = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.ue = (float)(Math.random() * 0.2) * 2.0f;
        this.uf = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.cDN = n2;
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    public w(net.minecraft.world.w w2) {
        super(w2);
        this.o(0.25f, 0.25f);
    }

    @Override
    protected void IA() {
    }

    @Override
    public int af(float f2) {
        float f3 = 0.5f;
        f3 = bt.I(f3, 0.0f, 1.0f);
        int n2 = super.af(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void Dm() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        super.Dm();
        if (this.cCs > 0) {
            --this.cCs;
        }
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        this.ue -= (double)0.03f;
        if (this.baU.L(new b(this)).df().xb() == Material.bew) {
            this.ue = 0.2f;
            this.ud = (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f;
            this.uf = (this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f;
            this.a("random.fizz", 0.4f, 2.0f + this.ta.nextFloat() * 0.4f);
        }
        this.x(this.gW, (this.Us().dtI + this.Us().dtL) / 2.0, this.gY);
        double d7 = 8.0;
        if (this.cDP < this.cDK - 20 + this.getEntityId() % 100) {
            if (this.cDO == null || this.cDO.T(this) > 64.0) {
                this.cDO = this.baU.f(this, 8.0);
            }
            this.cDP = this.cDK;
        }
        if (this.cDO != null && this.cDO.CZ()) {
            this.cDO = null;
        }
        if (this.cDO != null && (d6 = 1.0 - (d5 = Math.sqrt((d4 = (this.cDO.gW - this.gW) / 8.0) * d4 + (d3 = (this.cDO.gX + (double)this.cDO.getEyeHeight() - this.gX) / 8.0) * d3 + (d2 = (this.cDO.gY - this.gY) / 8.0) * d2))) > 0.0) {
            d6 *= d6;
            this.ud += d4 / d5 * d6 * 0.1;
            this.ue += d3 / d5 * d6 * 0.1;
            this.uf += d2 / d5 * d6 * 0.1;
        }
        this.y(this.ud, this.ue, this.uf);
        float f2 = 0.98f;
        if (this.aO) {
            f2 = this.baU.L((b)new b((int)bt.aF((double)this.gW), (int)(bt.aF((double)this.Us().dtI) - 1), (int)bt.aF((double)this.gY))).df().aSF * 0.98f;
        }
        this.ud *= (double)f2;
        this.ue *= (double)0.98f;
        this.uf *= (double)f2;
        if (this.aO) {
            this.ue *= (double)-0.9f;
        }
        ++this.cDK;
        ++this.cDL;
        if (this.cDL >= 6000) {
            this.Tt();
        }
    }

    @Override
    public boolean TH() {
        return this.baU.a(this.Us(), Material.bev, this, 0.014);
    }

    @Override
    protected void ew(int n2) {
        this.a(ad.dvb, (float)n2);
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        this.TM();
        this.cDM = (int)((float)this.cDM - f2);
        if (this.cDM <= 0) {
            this.Tt();
        }
        return false;
    }

    @Override
    public void d(n n2) {
        n2.a("Health", (short)((byte)this.cDM));
        n2.a("Age", (short)this.cDL);
        n2.a("Value", (short)this.cDN);
    }

    @Override
    public void e(n n2) {
        this.cDM = n2.eF("Health") & 0xFF;
        this.cDL = n2.eF("Age");
        this.cDN = n2.eF("Value");
    }

    @Override
    public void n(a a2) {
        if (!this.baU.dDw && this.cCs == 0 && a2.cId == 0) {
            a2.cId = 2;
            this.baU.a((c)a2, "random.orb", 0.1f, 0.5f * ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.7f + 1.8f));
            a2.c(this, 1);
            a2.fE(this.cDN);
            this.Tt();
        }
    }

    public int YX() {
        return this.cDN;
    }

    public int YY() {
        return this.cDN >= 2477 ? 10 : (this.cDN >= 1237 ? 9 : (this.cDN >= 617 ? 8 : (this.cDN >= 307 ? 7 : (this.cDN >= 149 ? 6 : (this.cDN >= 73 ? 5 : (this.cDN >= 37 ? 4 : (this.cDN >= 17 ? 3 : (this.cDN >= 7 ? 2 : (this.cDN >= 3 ? 1 : 0)))))))));
    }

    public static int fl(int n2) {
        return n2 >= 2477 ? 2477 : (n2 >= 1237 ? 1237 : (n2 >= 617 ? 617 : (n2 >= 307 ? 307 : (n2 >= 149 ? 149 : (n2 >= 73 ? 73 : (n2 >= 37 ? 37 : (n2 >= 17 ? 17 : (n2 >= 7 ? 7 : (n2 >= 3 ? 3 : 1)))))))));
    }

    @Override
    public boolean IC() {
        return false;
    }
}

