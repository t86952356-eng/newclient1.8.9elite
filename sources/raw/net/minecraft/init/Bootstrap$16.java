/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

class Bootstrap$16
extends a {
    private boolean cPa = true;

    Bootstrap$16() {
    }

    @Override
    protected co b(e e2, co co2) {
        w w2 = e2.de();
        b b2 = e2.dg().x(BlockDispenser.aQ(e2.zg()));
        BlockPumpkin blockPumpkin = (BlockPumpkin)Blocks.cMW;
        if (w2.aG(b2) && blockPumpkin.N(w2, b2)) {
            if (!w2.dDw) {
                w2.a(b2, blockPumpkin.xM(), 3);
            }
            --co2.cWZ;
        } else {
            this.cPa = false;
        }
        return co2;
    }

    @Override
    protected void b(e e2) {
        if (this.cPa) {
            e2.de().e(1000, e2.dg(), 0);
        } else {
            e2.de().e(1001, e2.dg(), 0);
        }
    }
}

