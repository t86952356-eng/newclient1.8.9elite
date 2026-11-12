/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.entity.n;
import net.minecraft.entity.o;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.tileentity.ab;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class bs
extends d {
    public bs() {
        this.bM(true);
        this.d(a.cpB);
    }

    @Override
    public String at(co co2) {
        Object object = cr.gm(this.xB() + ".name").trim();
        String string = n.eF(co2.yc());
        if (string != null) {
            object = (String)object + " " + cr.gm("entity." + string + ".name");
        }
        return object;
    }

    @Override
    public int e(co co2, int n2) {
        o o2 = n.ctF.get(co2.yc());
        return o2 != null ? (n2 == 0 ? o2.ctH : o2.ctI) : 0xFFFFFF;
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        c c2;
        net.minecraft.tileentity.d d2;
        if (w2.dDw) {
            return true;
        }
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == Blocks.cMe && (d2 = w2.K(b2)) instanceof ab) {
            net.minecraft.tileentity.b b3 = ((ab)d2).aqI();
            b3.fW(n.eF(co2.yc()));
            d2.Lw();
            w2.P(b2);
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
            return true;
        }
        b2 = b2.x(ao2);
        double d3 = 0.0;
        if (ao2 == ao.dwr && iBlockState instanceof BlockFence) {
            d3 = 0.5;
        }
        if ((c2 = bs.a(w2, co2.yc(), (double)b2.wt() + 0.5, (double)b2.wu() + d3, (double)b2.wx() + 0.5)) != null) {
            if (c2 instanceof r && co2.aen()) {
                c2.ec(co2.getDisplayName());
            }
            if (!a2.cIt.cJM) {
                --co2.cWZ;
            }
        }
        return true;
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        if (w2.dDw) {
            return co2;
        }
        ce ce2 = this.a(w2, a2, true);
        if (ce2 == null) {
            return co2;
        }
        if (ce2.dzu == cf.dzy) {
            c c2;
            b b2 = ce2.dg();
            if (!w2.a(a2, b2)) {
                return co2;
            }
            if (!a2.a(b2, ce2.dzv, co2)) {
                return co2;
            }
            if (w2.L(b2).df() instanceof BlockLiquid && (c2 = bs.a(w2, co2.yc(), (double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5)) != null) {
                if (c2 instanceof r && co2.aen()) {
                    c2.ec(co2.getDisplayName());
                }
                if (!a2.cIt.cJM) {
                    --co2.cWZ;
                }
                a2.a(net.minecraft.stats.n.dqE[d.p(this)]);
            }
        }
        return co2;
    }

    public static c a(w w2, int n2, double d2, double d3, double d4) {
        if (!n.ctF.containsKey(n2)) {
            return null;
        }
        c c2 = null;
        for (int i2 = 0; i2 < 1; ++i2) {
            c2 = n.a(n2, w2);
            if (!(c2 instanceof r)) continue;
            p p2 = (p)c2;
            c2.b(d2, d3, d4, bt.bN(w2.dDk.nextFloat() * 360.0f), 0.0f);
            p2.pn = p2.pl;
            p2.cuF = p2.pl;
            p2.a(w2.bg(new b(p2)), null);
            w2.G(c2);
            p2.UZ();
        }
        return c2;
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        for (o o2 : n.ctF.values()) {
            list.add(new co(d2, 1, o2.ctG));
        }
    }
}

