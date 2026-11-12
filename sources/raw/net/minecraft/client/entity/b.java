/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.d;
import net.minecraft.client.entity.a;
import net.minecraft.item.co;
import net.minecraft.util.ad;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class b
extends a {
    private boolean bjW;
    private int bjX;
    private double bjY;
    private double bjZ;
    private double bka;
    private double bkb;
    private double bkc;

    public b(w w2, GameProfile gameProfile) {
        super(w2, gameProfile);
        this.cso = 0.0f;
        this.csp = true;
        this.cIo = 0.25f;
        this.cry = 10.0;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return true;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.bjY = d2;
        this.bjZ = d3;
        this.bka = d4;
        this.bkb = f2;
        this.bkc = f3;
        this.bjX = n2;
    }

    @Override
    public void Dm() {
        this.cIo = 0.0f;
        super.Dm();
        this.cux = this.cuy;
        double d2 = this.gW - this.crF;
        double d3 = this.gY - this.crH;
        float f2 = bt.aD(d2 * d2 + d3 * d3) * 4.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.cuy += (f2 - this.cuy) * 0.4f;
        this.cuz += this.cuy;
        if (!this.bjW && this.isEating() && this.cHV.cJC[this.cHV.cJE] != null) {
            co co2 = this.cHV.cJC[this.cHV.cJE];
            this.c(this.cHV.cJC[this.cHV.cJE], co2.bP().aq(co2));
            this.bjW = true;
        } else if (this.bjW && !this.isEating()) {
            this.abJ();
            this.bjW = false;
        }
    }

    @Override
    public void Dn() {
        if (this.bjX > 0) {
            double d2;
            double d3 = this.gW + (this.bjY - this.gW) / (double)this.bjX;
            double d4 = this.gX + (this.bjZ - this.gX) / (double)this.bjX;
            double d5 = this.gY + (this.bka - this.gY) / (double)this.bjX;
            for (d2 = this.bkb - (double)this.pl; d2 < -180.0; d2 += 360.0) {
            }
            while (d2 >= 180.0) {
                d2 -= 360.0;
            }
            this.pl = (float)((double)this.pl + d2 / (double)this.bjX);
            this.pm = (float)((double)this.pm + (this.bkc - (double)this.pm) / (double)this.bjX);
            --this.bjX;
            this.setPosition(d3, d4, d5);
            this.setRotation(this.pl, this.pm);
        }
        this.cIb = this.cIc;
        this.VW();
        float f2 = bt.aD(this.ud * this.ud + this.uf * this.uf);
        float f3 = (float)Math.atan(-this.ue * (double)0.2f) * 15.0f;
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.aO || this.getHealth() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.aO || this.getHealth() <= 0.0f) {
            f3 = 0.0f;
        }
        this.cIc += (f2 - this.cIc) * 0.4f;
        this.cuC += (f3 - this.cuC) * 0.8f;
    }

    @Override
    public void c(int n2, co co2) {
        if (n2 == 0) {
            this.cHV.cJC[this.cHV.cJE] = co2;
        } else {
            this.cHV.cJD[n2 - 1] = co2;
        }
    }

    @Override
    public void a(ba ba2) {
        d.AZ().bha.Ey().c(ba2);
    }

    @Override
    public boolean c(int n2, String string) {
        return false;
    }

    @Override
    public net.minecraft.util.b yl() {
        return new net.minecraft.util.b(this.gW + 0.5, this.gX + 0.5, this.gY + 0.5);
    }
}

