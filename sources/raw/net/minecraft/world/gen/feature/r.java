/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class r
extends ao {
    private final Block dOw;
    private final boolean dOx;

    public r(Block block, boolean bl2) {
        this.dOw = block;
        this.dOx = bl2;
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        if (w2.L(b2.aqX()).df() != Blocks.cMX) {
            return false;
        }
        if (w2.L(b2).df().xb() != Material.beo && w2.L(b2).df() != Blocks.cMX) {
            return false;
        }
        int n2 = 0;
        if (w2.L(b2.arb()).df() == Blocks.cMX) {
            ++n2;
        }
        if (w2.L(b2.arc()).df() == Blocks.cMX) {
            ++n2;
        }
        if (w2.L(b2.aqZ()).df() == Blocks.cMX) {
            ++n2;
        }
        if (w2.L(b2.ara()).df() == Blocks.cMX) {
            ++n2;
        }
        if (w2.L(b2.aqY()).df() == Blocks.cMX) {
            ++n2;
        }
        int n3 = 0;
        if (w2.aG(b2.arb())) {
            ++n3;
        }
        if (w2.aG(b2.arc())) {
            ++n3;
        }
        if (w2.aG(b2.aqZ())) {
            ++n3;
        }
        if (w2.aG(b2.ara())) {
            ++n3;
        }
        if (w2.aG(b2.aqY())) {
            ++n3;
        }
        if (!this.dOx && n2 == 4 && n3 == 1 || n2 == 5) {
            w2.a(b2, this.dOw.xM(), 2);
            w2.a(this.dOw, b2, random);
        }
        return true;
    }
}

