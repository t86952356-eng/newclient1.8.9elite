/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.player.e;
import net.minecraft.init.Items;
import net.minecraft.item.aa;
import net.minecraft.item.ad;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.stats.n;
import net.minecraft.tileentity.h;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class BlockCauldron
extends Block {
    public static final PropertyInteger aTr = PropertyInteger.e("level", 0, 3);

    public BlockCauldron() {
        super(Material.bet, MapColor.bdN);
        this.h(this.aSG.zS().a(aTr, 0));
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2, List<a> list, c c2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        float f2 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, 0.125f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.125f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.875f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.a(0.0f, 0.0f, 0.875f, 1.0f, 1.0f, 1.0f);
        super.a(w2, b2, iBlockState, a2, list, c2);
        this.xx();
    }

    @Override
    public void xx() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, c c2) {
        int n2 = iBlockState.b(aTr);
        float f2 = (float)b2.wu() + (6.0f + (float)(3 * n2)) / 16.0f;
        if (!w2.dDw && c2.isBurning() && n2 > 0 && c2.Us().dtI <= (double)f2) {
            c2.Tx();
            this.c(w2, b2, iBlockState, n2 - 1);
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        Object object;
        if (w2.dDw) {
            return true;
        }
        co co2 = a2.cHV.acE();
        if (co2 == null) {
            return true;
        }
        int n2 = iBlockState.b(aTr);
        d d2 = co2.bP();
        if (d2 == Items.cQB) {
            if (n2 < 3) {
                if (!a2.cIt.cJM) {
                    a2.cHV.g(a2.cHV.cJE, new co(Items.cQA));
                }
                a2.a(n.dqj);
                this.c(w2, b2, iBlockState, 3);
            }
            return true;
        }
        if (d2 == Items.cRE) {
            if (n2 > 0) {
                if (!a2.cIt.cJM) {
                    co co3 = new co(Items.cRD, 1, 0);
                    if (!a2.cHV.ah(co3)) {
                        w2.G(new i(w2, (double)b2.wt() + 0.5, (double)b2.wu() + 1.5, (double)b2.wx() + 0.5, co3));
                    } else if (a2 instanceof e) {
                        ((e)a2).d(a2.cHX);
                    }
                    a2.a(n.dqk);
                    --co2.cWZ;
                    if (co2.cWZ <= 0) {
                        a2.cHV.g(a2.cHV.cJE, null);
                    }
                }
                this.c(w2, b2, iBlockState, n2 - 1);
            }
            return true;
        }
        if (n2 > 0 && d2 instanceof y && ((y)(object = (y)d2)).adN() == aa.cVL && ((y)object).ay(co2)) {
            ((y)object).aA(co2);
            this.c(w2, b2, iBlockState, n2 - 1);
            a2.a(n.dql);
            return true;
        }
        if (n2 > 0 && d2 instanceof ad && h.aS(co2) > 0) {
            object = co2.aeg();
            ((co)object).cWZ = 1;
            h.aT((co)object);
            if (co2.cWZ <= 1 && !a2.cIt.cJM) {
                a2.cHV.g(a2.cHV.cJE, (co)object);
            } else {
                if (!a2.cHV.ah((co)object)) {
                    w2.G(new i(w2, (double)b2.wt() + 0.5, (double)b2.wu() + 1.5, (double)b2.wx() + 0.5, (co)object));
                } else if (a2 instanceof e) {
                    ((e)a2).d(a2.cHX);
                }
                a2.a(n.dqm);
                if (!a2.cIt.cJM) {
                    --co2.cWZ;
                }
            }
            if (!a2.cIt.cJM) {
                this.c(w2, b2, iBlockState, n2 - 1);
            }
            return true;
        }
        return false;
    }

    public void c(w w2, b b2, IBlockState iBlockState, int n2) {
        w2.a(b2, iBlockState.a(aTr, bt.F(n2, 0, 3)), 2);
        w2.f(b2, this);
    }

    @Override
    public void g(w w2, b b2) {
        IBlockState iBlockState;
        if (w2.dDk.nextInt(20) == 1 && (iBlockState = w2.L(b2)).b(aTr) < 3) {
            w2.a(b2, iBlockState.c(aTr), 2);
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cRK;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRK;
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        return w2.L(b2).b(aTr);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTr, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTr);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTr);
    }
}

