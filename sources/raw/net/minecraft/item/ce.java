/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ce
extends d {
    private final Block cWS;
    private final Block cWT;

    public ce(Block block, Block block2) {
        this.cWS = block;
        this.cWT = block2;
        this.d(a.cpH);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 != ao.dwr) {
            return false;
        }
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        if (w2.L(b2).df() == this.cWT && w2.aG(b2.aqX())) {
            w2.d(b2.aqX(), this.cWS.xM());
            --co2.cWZ;
            return true;
        }
        return false;
    }
}

