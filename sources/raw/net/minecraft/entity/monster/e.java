/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.entity.monster;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.f;
import net.minecraft.entity.monster.g;
import net.minecraft.entity.monster.h;
import net.minecraft.entity.monster.i;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.af;
import net.minecraft.util.as;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class e
extends aa {
    private static final UUID cEa = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final a cEb = new a(cEa, "Attacking speed boost", 0.15f, 0).aM(false);
    private static final Set<Block> cEc = Sets.newIdentityHashSet();
    private boolean cEd;

    public e(w w2) {
        super(w2);
        this.o(0.6f, 2.9f);
        this.cso = 1.0f;
        this.ctS.a(0, new au(this));
        this.ctS.a(2, new b(this, 1.0, false));
        this.ctS.a(7, new bd(this, 1.0));
        this.ctS.a(8, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(8, new z(this));
        this.ctS.a(10, new h(this));
        this.ctS.a(11, new i(this));
        this.ctT.a(1, new v((j)this, false, new Class[0]));
        this.ctT.a(2, new g(this));
        this.ctT.a(3, new ag<net.minecraft.entity.monster.j>(this, net.minecraft.entity.monster.j.class, 10, true, false, new f(this)));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(40.0);
        this.a(aj.cwp).ap(0.3f);
        this.a(aj.cwq).ap(7.0);
        this.a(aj.cwn).ap(64.0);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Short(0));
        this.csD.a(17, new Byte(0));
        this.csD.a(18, new Byte(0));
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        IBlockState iBlockState = this.Zh();
        n2.a("carried", (short)Block.i(iBlockState.df()));
        n2.a("carriedData", (short)iBlockState.df().c(iBlockState));
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        IBlockState iBlockState = n2.C("carried", 8) ? Block.cq(n2.eK("carried")).aM(n2.eF("carriedData") & 0xFFFF) : Block.aK(n2.eF("carried")).aM(n2.eF("carriedData") & 0xFFFF);
        this.E(iBlockState);
    }

    private boolean y(net.minecraft.entity.player.a a2) {
        co co2 = a2.cHV.cJD[3];
        if (co2 != null && co2.bP() == d.I(Blocks.cMW)) {
            return false;
        }
        da da2 = a2.O(1.0f).atR();
        da da3 = new da(this.gW - a2.gW, this.Us().dtI + (double)(this.height / 2.0f) - (a2.gX + (double)a2.getEyeHeight()), this.gY - a2.gY);
        double d2 = da3.atS();
        double d3 = da2.t(da3 = da3.atR());
        return d3 > 1.0 - 0.025 / d2 && a2.ai(this);
    }

    @Override
    public float getEyeHeight() {
        return 2.55f;
    }

    @Override
    public void Dn() {
        if (this.baU.dDw) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.baU.a(as.dxu, this.gW + (this.ta.nextDouble() - 0.5) * (double)this.width, this.gX + this.ta.nextDouble() * (double)this.height - 0.25, this.gY + (this.ta.nextDouble() - 0.5) * (double)this.width, (this.ta.nextDouble() - 0.5) * 2.0, -this.ta.nextDouble(), (this.ta.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        this.cuU = false;
        super.Dn();
    }

    @Override
    protected void Vf() {
        float f2;
        if (this.TG()) {
            this.a(ad.dvg, 1.0f);
        }
        if (this.Zi() && !this.cEd && this.ta.nextInt(100) == 0) {
            this.ba(false);
        }
        if (this.baU.avr() && (f2 = this.ag(1.0f)) > 0.5f && this.baU.aM(new net.minecraft.util.b(this)) && this.ta.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f) {
            this.S(null);
            this.ba(false);
            this.cEd = false;
            this.Zg();
        }
        super.Vf();
    }

    protected boolean Zg() {
        double d2 = this.gW + (this.ta.nextDouble() - 0.5) * 64.0;
        double d3 = this.gX + (double)(this.ta.nextInt(64) - 32);
        double d4 = this.gY + (this.ta.nextDouble() - 0.5) * 64.0;
        return this.S(d2, d3, d4);
    }

    protected boolean am(c c2) {
        da da2 = new da(this.gW - c2.gW, this.Us().dtI + (double)(this.height / 2.0f) - c2.gX + (double)c2.getEyeHeight(), this.gY - c2.gY);
        da2 = da2.atR();
        double d2 = 16.0;
        double d3 = this.gW + (this.ta.nextDouble() - 0.5) * 8.0 - da2.dAG * 16.0;
        double d4 = this.gX + (double)(this.ta.nextInt(16) - 8) - da2.dAH * 16.0;
        double d5 = this.gY + (this.ta.nextDouble() - 0.5) * 8.0 - da2.dAI * 16.0;
        return this.S(d3, d4, d5);
    }

    protected boolean S(double d2, double d3, double d4) {
        int n2;
        double d5 = this.gW;
        double d6 = this.gX;
        double d7 = this.gY;
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        boolean bl2 = false;
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.gW, this.gX, this.gY);
        if (this.baU.aJ(b2)) {
            n2 = 0;
            while (n2 == 0 && b2.wu() > 0) {
                net.minecraft.util.b b3 = b2.aqY();
                Block block = this.baU.L(b3).df();
                if (block.xb().zy()) {
                    n2 = 1;
                    continue;
                }
                this.gX -= 1.0;
                b2 = b3;
            }
            if (n2 != 0) {
                super.Q(this.gW, this.gX, this.gY);
                if (this.baU.a((c)this, this.Us()).isEmpty() && !this.baU.u(this.Us())) {
                    bl2 = true;
                }
            }
        }
        if (!bl2) {
            this.setPosition(d5, d6, d7);
            return false;
        }
        n2 = 128;
        for (int i2 = 0; i2 < 128; ++i2) {
            double d8 = (double)i2 / 127.0;
            float f2 = (this.ta.nextFloat() - 0.5f) * 0.2f;
            float f3 = (this.ta.nextFloat() - 0.5f) * 0.2f;
            float f4 = (this.ta.nextFloat() - 0.5f) * 0.2f;
            double d9 = d5 + (this.gW - d5) * d8 + (this.ta.nextDouble() - 0.5) * (double)this.width * 2.0;
            double d10 = d6 + (this.gX - d6) * d8 + this.ta.nextDouble() * (double)this.height;
            double d11 = d7 + (this.gY - d7) * d8 + (this.ta.nextDouble() - 0.5) * (double)this.width * 2.0;
            this.baU.a(as.dxu, d9, d10, d11, (double)f2, (double)f3, (double)f4, new int[0]);
        }
        this.baU.a(d5, d6, d7, "mob.endermen.portal", 1.0f, 1.0f);
        this.a("mob.endermen.portal", 1.0f, 1.0f);
        return true;
    }

    @Override
    protected String Vb() {
        return this.Zi() ? "mob.endermen.scream" : "mob.endermen.idle";
    }

    @Override
    protected String VN() {
        return "mob.endermen.hit";
    }

    @Override
    protected String VO() {
        return "mob.endermen.death";
    }

    @Override
    protected d Vc() {
        return Items.cRy;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        d d2 = this.Vc();
        if (d2 != null) {
            int n3 = this.ta.nextInt(2 + n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d(d2, 1);
            }
        }
    }

    public void E(IBlockState iBlockState) {
        this.csD.b(16, (short)(Block.a(iBlockState) & 0xFFFF));
    }

    public IBlockState Zh() {
        return Block.aL(this.csD.em(16) & 0xFFFF);
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (ad2.dk() == null || !(ad2.dk() instanceof net.minecraft.entity.monster.j)) {
            if (!this.baU.dDw) {
                this.ba(true);
            }
            if (ad2 instanceof af && ad2.dk() instanceof net.minecraft.entity.player.a) {
                if (ad2.dk() instanceof net.minecraft.entity.player.e && ((net.minecraft.entity.player.e)ad2.dk()).cIZ.amh()) {
                    this.ba(false);
                } else {
                    this.cEd = true;
                }
            }
            if (ad2 instanceof net.minecraft.util.ag) {
                this.cEd = false;
                for (int i2 = 0; i2 < 64; ++i2) {
                    if (!this.Zg()) continue;
                    return true;
                }
                return false;
            }
        }
        boolean bl2 = super.a(ad2, f2);
        if (ad2.asb() && this.ta.nextInt(10) != 0) {
            this.Zg();
        }
        return bl2;
    }

    public boolean Zi() {
        return this.csD.el(18) > 0;
    }

    public void ba(boolean bl2) {
        this.csD.b(18, (byte)(bl2 ? 1 : 0));
    }

    static {
        cEc.add(Blocks.cLe);
        cEc.add(Blocks.cLf);
        cEc.add(Blocks.cLo);
        cEc.add(Blocks.cLp);
        cEc.add(Blocks.cLP);
        cEc.add(Blocks.cLQ);
        cEc.add(Blocks.cLR);
        cEc.add(Blocks.cLS);
        cEc.add(Blocks.cLY);
        cEc.add(Blocks.cMM);
        cEc.add(Blocks.cMN);
        cEc.add(Blocks.cMW);
        cEc.add(Blocks.cNm);
        cEc.add(Blocks.cNy);
    }
}

