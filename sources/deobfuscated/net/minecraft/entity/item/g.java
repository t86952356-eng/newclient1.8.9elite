/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.item;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.i;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.w;

public class g
extends c {
    private IBlockState cCj;
    public int cCk;
    public boolean cCl = true;
    private boolean cCm;
    private boolean cCn;
    private int cCo = 40;
    private float cCp = 2.0f;
    public n cCq;

    public g(w w2) {
        super(w2);
    }

    public g(w w2, double d2, double d3, double d4, IBlockState iBlockState) {
        super(w2);
        this.cCj = iBlockState;
        this.crz = true;
        this.o(0.98f, 0.98f);
        this.setPosition(d2, d3, d4);
        this.ud = 0.0;
        this.ue = 0.0;
        this.uf = 0.0;
        this.crF = d2;
        this.crG = d3;
        this.crH = d4;
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void IA() {
    }

    @Override
    public boolean TO() {
        return !this.csb;
    }

    @Override
    public void Dm() {
        Block block = this.cCj.df();
        if (block.xb() == Material.beo) {
            this.Tt();
        } else {
            b b2;
            this.crF = this.gW;
            this.crG = this.gX;
            this.crH = this.gY;
            if (this.cCk++ == 0) {
                b2 = new b(this);
                if (this.baU.L(b2).df() == block) {
                    this.baU.aL(b2);
                } else if (!this.baU.dDw) {
                    this.Tt();
                    return;
                }
            }
            this.ue -= (double)0.04f;
            this.y(this.ud, this.ue, this.uf);
            this.ud *= (double)0.98f;
            this.ue *= (double)0.98f;
            this.uf *= (double)0.98f;
            if (!this.baU.dDw) {
                b2 = new b(this);
                if (this.aO) {
                    this.ud *= (double)0.7f;
                    this.uf *= (double)0.7f;
                    this.ue *= -0.5;
                    if (this.baU.L(b2).df() != Blocks.cLO) {
                        this.Tt();
                        if (!this.cCm) {
                            if (this.baU.a(block, b2, true, net.minecraft.util.ao.dwr, null, null) && !BlockFalling.C(this.baU, b2.aqY()) && this.baU.a(b2, this.cCj, 3)) {
                                d d2;
                                if (block instanceof BlockFalling) {
                                    ((BlockFalling)block).i(this.baU, b2);
                                }
                                if (this.cCq != null && block instanceof ITileEntityProvider && (d2 = this.baU.K(b2)) != null) {
                                    n n2 = new n();
                                    d2.b(n2);
                                    for (String string : this.cCq.aeQ()) {
                                        net.minecraft.nbt.g g2 = this.cCq.eB(string);
                                        if (string.equals("x") || string.equals("y") || string.equals("z")) continue;
                                        n2.b(string, g2.aeG());
                                    }
                                    d2.a(n2);
                                    d2.Lw();
                                }
                            } else if (this.cCl && this.baU.Si().gw("doEntityDrops")) {
                                this.a(new co(block, 1, block.d(this.cCj)), 0.0f);
                            }
                        }
                    }
                } else if (this.cCk > 100 && !this.baU.dDw && (b2.wu() < 1 || b2.wu() > 256) || this.cCk > 600) {
                    if (this.cCl && this.baU.Si().gw("doEntityDrops")) {
                        this.a(new co(block, 1, block.d(this.cCj)), 0.0f);
                    }
                    this.Tt();
                }
            }
        }
    }

    @Override
    public void q(float f2, float f3) {
        int n2;
        Block block = this.cCj.df();
        if (this.cCn && (n2 = bt.bM(f2 - 1.0f)) > 0) {
            ArrayList arrayList = Lists.newArrayList(this.baU.b(this, this.Us()));
            boolean bl2 = block == Blocks.cOh;
            ad ad2 = bl2 ? ad.dvo : ad.dvp;
            for (c c2 : arrayList) {
                c2.a(ad2, (float)Math.min(bt.bL((float)n2 * this.cCp), this.cCo));
            }
            if (bl2 && (double)this.ta.nextFloat() < (double)0.05f + (double)n2 * 0.05) {
                int n3 = this.cCj.b(BlockAnvil.aSS);
                if (++n3 > 2) {
                    this.cCm = true;
                } else {
                    this.cCj = this.cCj.a(BlockAnvil.aSS, n3);
                }
            }
        }
    }

    @Override
    protected void d(n n2) {
        Block block = this.cCj != null ? this.cCj.df() : Blocks.cLc;
        cm cm2 = (cm)Block.aRV.y(block);
        n2.R("Block", cm2 == null ? "" : cm2.toString());
        n2.a("Data", (byte)block.c(this.cCj));
        n2.a("Time", (byte)this.cCk);
        n2.o("DropItem", this.cCl);
        n2.o("HurtEntities", this.cCn);
        n2.a("FallHurtAmount", this.cCp);
        n2.B("FallHurtMax", this.cCo);
        if (this.cCq != null) {
            n2.b("TileEntityData", this.cCq);
        }
    }

    @Override
    protected void e(n n2) {
        int n3 = n2.eE("Data") & 0xFF;
        this.cCj = n2.C("Block", 8) ? Block.cq(n2.eK("Block")).aM(n3) : (n2.C("TileID", 99) ? Block.aK(n2.eG("TileID")).aM(n3) : Block.aK(n2.eE("Tile") & 0xFF).aM(n3));
        this.cCk = n2.eE("Time") & 0xFF;
        Block block = this.cCj.df();
        if (n2.C("HurtEntities", 99)) {
            this.cCn = n2.eO("HurtEntities");
            this.cCp = n2.eI("FallHurtAmount");
            this.cCo = n2.eG("FallHurtMax");
        } else if (block == Blocks.cOh) {
            this.cCn = true;
        }
        if (n2.C("DropItem", 99)) {
            this.cCl = n2.eO("DropItem");
        }
        if (n2.C("TileEntityData", 10)) {
            this.cCq = n2.eN("TileEntityData");
        }
        if (block == null || block.xb() == Material.beo) {
            this.cCj = Blocks.cLo.xM();
        }
    }

    public w Yg() {
        return this.baU;
    }

    public void aV(boolean bl2) {
        this.cCn = bl2;
    }

    @Override
    public boolean Uk() {
        return false;
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        if (this.cCj != null) {
            Block block = this.cCj.df();
            i2.b("Immitating block ID", Block.i(block));
            i2.b("Immitating block data", block.c(this.cCj));
        }
    }

    public IBlockState Yh() {
        return this.cCj;
    }
}

