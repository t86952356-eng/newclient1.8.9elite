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

public class w
extends ao {
    private final Block dOF;

    public w(Block block) {
        this.dOF = block;
    }

    @Override
    public boolean b(net.minecraft.world.w w2, Random random, b b2) {
        if (w2.L(b2.aqX()).df() != Blocks.cLd) {
            return false;
        }
        if (w2.L(b2.aqY()).df() != Blocks.cLd) {
            return false;
        }
        if (w2.L(b2).df().xb() != Material.beo && w2.L(b2).df() != Blocks.cLd) {
            return false;
        }
        int n2 = 0;
        if (w2.L(b2.arb()).df() == Blocks.cLd) {
            ++n2;
        }
        if (w2.L(b2.arc()).df() == Blocks.cLd) {
            ++n2;
        }
        if (w2.L(b2.aqZ()).df() == Blocks.cLd) {
            ++n2;
        }
        if (w2.L(b2.ara()).df() == Blocks.cLd) {
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
        if (n2 == 3 && n3 == 1) {
            w2.a(b2, this.dOF.xM(), 2);
            w2.a(this.dOF, b2, random);
        }
        return true;
    }
}

