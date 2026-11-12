/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.structure.aa;

class f
extends aa {
    private f() {
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        this.dQM = random.nextFloat() < 0.4f ? Blocks.cLg.xM() : Blocks.cMa.xM();
    }
}

