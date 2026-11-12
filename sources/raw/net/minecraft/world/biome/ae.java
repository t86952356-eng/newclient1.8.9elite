/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.z;
import net.minecraft.world.chunk.f;
import net.minecraft.world.w;

public class ae
extends z {
    public ae(int n2, j j2) {
        super(n2, j2);
        this.dHh.dFB = 2;
        this.dHh.dFC = 2;
        this.dHh.dFD = 5;
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        this.dGZ = Blocks.cLe.xM();
        this.dHa = Blocks.cLf.xM();
        if (d2 > 1.75) {
            this.dGZ = Blocks.cLd.xM();
            this.dHa = Blocks.cLd.xM();
        } else if (d2 > -0.5) {
            this.dGZ = Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTF);
        }
        this.b(w2, random, f2, n2, n3, d2);
    }

    @Override
    public void a(w w2, Random random, b b2) {
        this.dHh.a(w2, random, this, b2);
    }
}

