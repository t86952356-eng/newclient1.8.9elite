/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.List;
import java.util.UUID;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ah;
import net.minecraft.entity.ai.a;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.projectile.f;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.potion.d;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class at
extends aa
implements ah {
    private static final UUID cFl = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final net.minecraft.entity.ai.attributes.a cFm = new net.minecraft.entity.ai.attributes.a(cFl, "Drinking speed penalty", -0.25, 0).aM(false);
    private static final net.minecraft.item.d[] cFn = new net.minecraft.item.d[]{Items.cQX, Items.cRc, Items.cQG, Items.cRF, Items.cRE, Items.cPL, Items.cPC, Items.cPC};
    private int cFo;

    public at(w w2) {
        super(w2);
        this.o(0.6f, 1.95f);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, new a(this, 1.0, 60, 10.0f));
        this.ctS.a(2, new bd(this, 1.0));
        this.ctS.a(3, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(3, new z(this));
        this.ctT.a(1, new v((j)this, false, new Class[0]));
        this.ctT.a(2, new ag<net.minecraft.entity.player.a>((j)this, net.minecraft.entity.player.a.class, true));
    }

    @Override
    protected void IA() {
        super.IA();
        this.Tp().a(21, (byte)0);
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

    public void bi(boolean bl2) {
        this.Tp().b(21, (byte)(bl2 ? 1 : 0));
    }

    public boolean ZM() {
        return this.Tp().el(21) == 1;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(26.0);
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    public void Dn() {
        if (!this.baU.dDw) {
            if (this.ZM()) {
                if (this.cFo-- <= 0) {
                    List<d> list;
                    this.bi(false);
                    co co2 = this.Vk();
                    this.c(0, (co)null);
                    if (co2 != null && co2.bP() == Items.cRD && (list = Items.cRD.aH(co2)) != null) {
                        for (d d2 : list) {
                            this.b(new d(d2));
                        }
                    }
                    this.a(aj.cwp).d(cFm);
                }
            } else {
                int n2 = -1;
                if (this.ta.nextFloat() < 0.15f && this.c(Material.bev) && !this.a(net.minecraft.potion.a.dgI)) {
                    n2 = 8237;
                } else if (this.ta.nextFloat() < 0.15f && this.isBurning() && !this.a(net.minecraft.potion.a.dgH)) {
                    n2 = 16307;
                } else if (this.ta.nextFloat() < 0.05f && this.getHealth() < this.getMaxHealth()) {
                    n2 = 16341;
                } else if (this.ta.nextFloat() < 0.25f && this.UW() != null && !this.a(net.minecraft.potion.a.dgw) && this.UW().T((c)this) > 121.0) {
                    n2 = 16274;
                } else if (this.ta.nextFloat() < 0.25f && this.UW() != null && !this.a(net.minecraft.potion.a.dgw) && this.UW().T((c)this) > 121.0) {
                    n2 = 16274;
                }
                if (n2 > -1) {
                    this.c(0, new co(Items.cRD, 1, n2));
                    this.cFo = this.Vk().aeh();
                    this.bi(true);
                    e e2 = this.a(aj.cwp);
                    e2.d(cFm);
                    e2.c(cFm);
                }
            }
            if (this.ta.nextFloat() < 7.5E-4f) {
                this.baU.a((c)this, (byte)15);
            }
        }
        super.Dn();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 15) {
            for (int i2 = 0; i2 < this.ta.nextInt(35) + 10; ++i2) {
                this.baU.a(as.dxn, this.gW + this.ta.nextGaussian() * (double)0.13f, this.Us().dtL + 0.5 + this.ta.nextGaussian() * (double)0.13f, this.gY + this.ta.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected float d(ad ad2, float f2) {
        f2 = super.d(ad2, f2);
        if (ad2.dk() == this) {
            f2 = 0.0f;
        }
        if (ad2.aso()) {
            f2 = (float)((double)f2 * 0.15);
        }
        return f2;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(3) + 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = this.ta.nextInt(3);
            net.minecraft.item.d d2 = cFn[this.ta.nextInt(cFn.length)];
            if (n2 > 0) {
                n4 += this.ta.nextInt(n2 + 1);
            }
            for (int i3 = 0; i3 < n4; ++i3) {
                this.d(d2, 1);
            }
        }
    }

    @Override
    public void g(r r2, float f2) {
        if (!this.ZM()) {
            f f3 = new f(this.baU, (r)this, 32732);
            double d2 = r2.gX + (double)r2.getEyeHeight() - (double)1.1f;
            f3.pm -= -20.0f;
            double d3 = r2.gW + r2.ud - this.gW;
            double d4 = d2 - this.gX;
            double d5 = r2.gY + r2.uf - this.gY;
            float f4 = bt.aD(d3 * d3 + d5 * d5);
            if (f4 >= 8.0f && !r2.a(net.minecraft.potion.a.dgx)) {
                f3.fL(32698);
            } else if (r2.getHealth() >= 8.0f && !r2.a(net.minecraft.potion.a.dgO)) {
                f3.fL(32660);
            } else if (f4 <= 3.0f && !r2.a(net.minecraft.potion.a.dgN) && this.ta.nextFloat() < 0.25f) {
                f3.fL(32696);
            }
            f3.c(d3, d4 + (double)(f4 * 0.2f), d5, 0.75f, 8.0f);
            this.baU.G(f3);
        }
    }

    @Override
    public float getEyeHeight() {
        return 1.62f;
    }
}

