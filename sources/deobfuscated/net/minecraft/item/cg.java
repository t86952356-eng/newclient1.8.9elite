/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockWallSign;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.tileentity.ag;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class cg
extends d {
    public cg() {
        this.cVn = 16;
        this.d(a.cpy);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 == ao.dwq) {
            return false;
        }
        if (!w2.L(b2).df().xb().zw()) {
            return false;
        }
        if (!a2.a(b2 = b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (!Blocks.cMp.d(w2, b2)) {
            return false;
        }
        if (w2.dDw) {
            return true;
        }
        if (ao2 == ao.dwr) {
            int n2 = bt.aF((double)((a2.pl + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            w2.a(b2, Blocks.cMp.xM().a(BlockStandingSign.bbs, n2), 3);
        } else {
            w2.a(b2, Blocks.cMz.xM().a(BlockWallSign.bdw, ao2), 3);
        }
        --co2.cWZ;
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof ag && !af.a(w2, a2, b2, co2)) {
            a2.a((ag)d2);
        }
        return true;
    }
}

