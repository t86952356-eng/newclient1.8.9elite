/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.ac;
import net.minecraft.entity.ai.ae;
import net.minecraft.entity.ai.af;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.y;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.q;
import net.minecraft.entity.monster.x;
import net.minecraft.entity.p;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.pathfinding.f;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.util.bt;

public class w
extends q {
    private int cEE;
    net.minecraft.village.c cAd;
    private int cEm;
    private int cEF;

    public w(net.minecraft.world.w w2) {
        super(w2);
        this.o(1.4f, 2.9f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(1, new b(this, 1.0, true));
        this.ctS.a(2, new af(this, 0.9, 32.0f));
        this.ctS.a(3, new ac(this, 0.6, true));
        this.ctS.a(4, new ae(this, 1.0));
        this.ctS.a(5, new y(this));
        this.ctS.a(6, new bd(this, 0.6));
        this.ctS.a(7, new be(this, a.class, 6.0f));
        this.ctS.a(8, new z(this));
        this.ctT.a(1, new net.minecraft.entity.ai.j(this));
        this.ctT.a(2, new v((j)this, false, new Class[0]));
        this.ctT.a(3, new x<c>(this, p.class, 10, false, true, aw.cFz));
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)0);
    }

    @Override
    protected void Vf() {
        if (--this.cEE <= 0) {
            this.cEE = 70 + this.ta.nextInt(50);
            this.cAd = this.baU.avS().e(new net.minecraft.util.b(this), 32);
            if (this.cAd == null) {
                this.UG();
            } else {
                net.minecraft.util.b b2 = this.cAd.aum();
                this.c(b2, (int)((float)this.cAd.aun() * 0.6f));
            }
        }
        super.Vf();
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(100.0);
        this.a(aj.cwp).ap(0.25);
    }

    @Override
    protected int eI(int n2) {
        return n2;
    }

    @Override
    protected void ah(c c2) {
        if (c2 instanceof aw && !(c2 instanceof d) && this.VB().nextInt(20) == 0) {
            this.S((r)c2);
        }
        super.ah(c2);
    }

    @Override
    public void Dn() {
        int n2;
        int n3;
        int n4;
        IBlockState iBlockState;
        Block block;
        super.Dn();
        if (this.cEm > 0) {
            --this.cEm;
        }
        if (this.cEF > 0) {
            --this.cEF;
        }
        if (this.ud * this.ud + this.uf * this.uf > 2.500000277905201E-7 && this.ta.nextInt(5) == 0 && (block = (iBlockState = this.baU.L(new net.minecraft.util.b(n4 = bt.aF(this.gW), n3 = bt.aF(this.gX - (double)0.2f), n2 = bt.aF(this.gY)))).df()).xb() != Material.beo) {
            this.baU.a(as.dxH, this.gW + ((double)this.ta.nextFloat() - 0.5) * (double)this.width, this.Us().dtI + 0.1, this.gY + ((double)this.ta.nextFloat() - 0.5) * (double)this.width, 4.0 * ((double)this.ta.nextFloat() - 0.5), 0.5, ((double)this.ta.nextFloat() - 0.5) * 4.0, Block.a(iBlockState));
        }
    }

    @Override
    public boolean i(Class<? extends r> clazz) {
        return (!this.Zv() || !a.class.isAssignableFrom(clazz)) && clazz != d.class && super.i(clazz);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("PlayerCreated", this.Zv());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.bg(n2.eO("PlayerCreated"));
    }

    @Override
    public boolean ag(c c2) {
        this.cEm = 10;
        this.baU.a((c)this, (byte)4);
        boolean bl2 = c2.a(ad.ac(this), (float)(7 + this.ta.nextInt(15)));
        if (bl2) {
            c2.ue += (double)0.4f;
            this.c(this, c2);
        }
        this.a("mob.irongolem.throw", 1.0f, 1.0f);
        return bl2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 4) {
            this.cEm = 10;
            this.a("mob.irongolem.throw", 1.0f, 1.0f);
        } else if (by2 == 11) {
            this.cEF = 400;
        } else {
            super.a(by2);
        }
    }

    public net.minecraft.village.c Zs() {
        return this.cAd;
    }

    public int Zt() {
        return this.cEm;
    }

    public void bf(boolean bl2) {
        this.cEF = bl2 ? 400 : 0;
        this.baU.a((c)this, (byte)11);
    }

    @Override
    protected String VN() {
        return "mob.irongolem.hit";
    }

    @Override
    protected String VO() {
        return "mob.irongolem.death";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.irongolem.walk", 1.0f, 1.0f);
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4 = this.ta.nextInt(3);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(net.minecraft.item.d.I(Blocks.cLQ), 1, (float)BlockFlower$EnumFlowerType.aVb.yi());
        }
        n3 = 3 + this.ta.nextInt(3);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.d(Items.cPn, 1);
        }
    }

    public int Zu() {
        return this.cEF;
    }

    public boolean Zv() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void bg(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 1));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void b(ad ad2) {
        if (!this.Zv() && this.cuJ != null && this.cAd != null) {
            this.cAd.H(this.cuJ.xU(), -5);
        }
        super.b(ad2);
    }
}

