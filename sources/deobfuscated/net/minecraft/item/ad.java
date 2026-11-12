/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockWallSign;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.i;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class ad
extends af {
    public ad() {
        super(Blocks.cOM);
        this.cVn = 16;
        this.d(a.cpy);
        this.bM(true);
        this.fW(0);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, net.minecraft.util.b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 == ao.dwq) {
            return false;
        }
        if (!w2.L(b2).df().xb().zw()) {
            return false;
        }
        if (!a2.a(b2 = b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (!Blocks.cOM.d(w2, b2)) {
            return false;
        }
        if (w2.dDw) {
            return true;
        }
        if (ao2 == ao.dwr) {
            int n2 = bt.aF((double)((a2.pl + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            w2.a(b2, Blocks.cOM.xM().a(BlockStandingSign.bbs, n2), 3);
        } else {
            w2.a(b2, Blocks.cONN.xM().a(BlockWallSign.bdw, ao2), 3);
        }
        --co2.cWZ;
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof h) {
            ((h)d2).aQ(co2);
        }
        return true;
    }

    @Override
    public String at(co co2) {
        Object object = "item.banner.";
        b b2 = this.aB(co2);
        object = (String)object + b2.xB() + ".name";
        return cr.gm((String)object);
    }

    @Override
    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
        n n2 = co2.j("BlockEntityTag", false);
        if (n2 != null && n2.eD("Patterns")) {
            v v2 = n2.D("Patterns", 10);
            for (int i2 = 0; i2 < v2.aeS() && i2 < 6; ++i2) {
                n n3 = v2.gi(i2);
                b b2 = b.fR(n3.eG("Color"));
                i i3 = i.fX(n3.eK("Pattern"));
                if (i3 == null) continue;
                list.add(cr.gm("item.banner." + i3.aqc() + "." + b2.xB()));
            }
        }
    }

    @Override
    public int e(co co2, int n2) {
        if (n2 == 0) {
            return 0xFFFFFF;
        }
        b b2 = this.aB(co2);
        return b2.lv().bem;
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        for (b b2 : b.values()) {
            n n2 = new n();
            h.a(n2, b2.ado(), null);
            n n3 = new n();
            n3.b("BlockEntityTag", n2);
            co co2 = new co(d2, 1, b2.ado());
            co2.u(n3);
            list.add(co2);
        }
    }

    @Override
    public a adD() {
        return a.cpy;
    }

    private b aB(co co2) {
        n n2 = co2.j("BlockEntityTag", false);
        b b2 = null;
        b2 = n2 != null && n2.eD("Base") ? b.fR(n2.eG("Base")) : b.fR(co2.yc());
        return b2;
    }
}

