/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockTNT;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

class Bootstrap$12
extends a {
    private boolean cOX = true;

    Bootstrap$12() {
    }

    @Override
    protected co b(e e2, co co2) {
        b b2;
        w w2 = e2.de();
        if (w2.aG(b2 = e2.dg().x(BlockDispenser.aQ(e2.zg())))) {
            w2.d(b2, Blocks.cMd.xM());
            if (co2.d(1, w2.dDk)) {
                co2.cWZ = 0;
            }
        } else if (w2.L(b2).df() == Blocks.cLY) {
            Blocks.cLY.b(w2, b2, Blocks.cLY.xM().a(BlockTNT.bcw, true));
            w2.aL(b2);
        } else {
            this.cOX = false;
        }
        return co2;
    }

    @Override
    protected void b(e e2) {
        if (this.cOX) {
            e2.de().e(1000, e2.dg(), 0);
        } else {
            e2.de().e(1001, e2.dg(), 0);
        }
    }
}

