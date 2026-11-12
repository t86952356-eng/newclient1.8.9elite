/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.world.w;
import org.apache.commons.lang3.Validate;

public abstract class l
extends c {
    private int ctw;
    protected b ctx;
    public ao cty;

    public l(w w2) {
        super(w2);
        this.o(0.5f, 0.5f);
    }

    public l(w w2, b b2) {
        this(w2);
        this.ctx = b2;
    }

    @Override
    protected void IA() {
    }

    protected void t(ao ao2) {
        Validate.notNull((Object)ao2);
        Validate.isTrue((boolean)ao2.asL().asP());
        this.cty = ao2;
        this.crM = this.pl = (float)(this.cty.asA() * 90);
        this.UJ();
    }

    private void UJ() {
        if (this.cty != null) {
            double d2 = (double)this.ctx.wt() + 0.5;
            double d3 = (double)this.ctx.wu() + 0.5;
            double d4 = (double)this.ctx.wx() + 0.5;
            double d5 = 0.46875;
            double d6 = this.eD(this.UL());
            double d7 = this.eD(this.UM());
            d2 -= (double)this.cty.asH() * 0.46875;
            d4 -= (double)this.cty.asJ() * 0.46875;
            ao ao2 = this.cty.asG();
            this.gW = d2 += d6 * (double)ao2.asH();
            this.gX = d3 += d7;
            this.gY = d4 += d6 * (double)ao2.asJ();
            double d8 = this.UL();
            double d9 = this.UM();
            double d10 = this.UL();
            if (this.cty.asL() == net.minecraft.util.ap.dwJ) {
                d10 = 1.0;
            } else {
                d8 = 1.0;
            }
            this.n(new net.minecraft.util.a(d2 - (d8 /= 32.0), d3 - (d9 /= 32.0), d4 - (d10 /= 32.0), d2 + d8, d3 + d9, d4 + d10));
        }
    }

    private double eD(int n2) {
        return n2 % 32 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        if (this.ctw++ == 100 && !this.baU.dDw) {
            this.ctw = 0;
            if (!this.csb && !this.UK()) {
                this.Tt();
                this.ab((c)null);
            }
        }
    }

    public boolean UK() {
        if (!this.baU.a((c)this, this.Us()).isEmpty()) {
            return false;
        }
        int n2 = Math.max(1, this.UL() / 16);
        int n3 = Math.max(1, this.UM() / 16);
        b b2 = this.ctx.x(this.cty.asC());
        ao ao2 = this.cty.asG();
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                b b3 = b2.d(ao2, i2).hq(i3);
                Block block = this.baU.L(b3).df();
                if (block.xb().zw() || BlockRedstoneDiode.r(block)) continue;
                return false;
            }
        }
        for (c c2 : this.baU.b(this, this.Us())) {
            if (!(c2 instanceof l)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean TO() {
        return true;
    }

    @Override
    public boolean X(c c2) {
        return c2 instanceof a && this.a(ad.L((a)c2), 0.0f);
    }

    @Override
    public ao Uq() {
        return this.cty;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (!this.csb && !this.baU.dDw) {
            this.Tt();
            this.TM();
            this.ab(ad2.dk());
        }
        return true;
    }

    @Override
    public void y(double d2, double d3, double d4) {
        if (!this.baU.dDw && !this.csb && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.Tt();
            this.ab((c)null);
        }
    }

    @Override
    public void N(double d2, double d3, double d4) {
        if (!this.baU.dDw && !this.csb && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.Tt();
            this.ab((c)null);
        }
    }

    @Override
    public void d(n n2) {
        n2.a("Facing", (byte)this.cty.asA());
        n2.B("TileX", this.UN().wt());
        n2.B("TileY", this.UN().wu());
        n2.B("TileZ", this.UN().wx());
    }

    @Override
    public void e(n n2) {
        ao ao2;
        this.ctx = new b(n2.eG("TileX"), n2.eG("TileY"), n2.eG("TileZ"));
        if (n2.C("Direction", 99)) {
            ao2 = net.minecraft.util.ao.hz(n2.eE("Direction"));
            this.ctx = this.ctx.x(ao2);
        } else {
            ao2 = n2.C("Facing", 99) ? net.minecraft.util.ao.hz(n2.eE("Facing")) : net.minecraft.util.ao.hz(n2.eE("Dir"));
        }
        this.t(ao2);
    }

    public abstract int UL();

    public abstract int UM();

    public abstract void ab(c var1);

    @Override
    protected boolean TP() {
        return false;
    }

    @Override
    public void setPosition(double d2, double d3, double d4) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        b b2 = this.ctx;
        this.ctx = new b(d2, d3, d4);
        if (!this.ctx.equals(b2)) {
            this.UJ();
            this.csL = true;
        }
    }

    public b UN() {
        return this.ctx;
    }
}

