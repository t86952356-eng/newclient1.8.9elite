/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.a;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cd
extends bg {
    private final Block cWQ;
    private final Block cWR;

    public cd(int n2, float f2, Block block, Block block2) {
        super(n2, f2, false);
        this.cWQ = block;
        this.cWR = block2;
    }

    @Override
    public boolean a(co co2, a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 != ao.dwr) {
            return false;
        }
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (w2.L(b2).df() == this.cWR && w2.aG(b2.aqX())) {
            w2.d(b2.aqX(), this.cWQ.xM());
            --co2.cWZ;
            return true;
        }
        return false;
    }
}

