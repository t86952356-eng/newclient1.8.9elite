/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.entity.boss.b;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.h;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.feature.ag;
import net.minecraft.world.gen.feature.ao;

public class i
extends h {
    protected ao dFN = new ag(Blocks.cNJ);

    @Override
    protected void a(j j2) {
        this.awS();
        if (this.dFc.nextInt(5) == 0) {
            int n2 = this.dFc.nextInt(16) + 8;
            int n3 = this.dFc.nextInt(16) + 8;
            this.dFN.b(this.dFb, this.dFc, this.dFb.aT(this.dFd.C(n2, 0, n3)));
        }
        if (this.dFd.wt() == 0 && this.dFd.wx() == 0) {
            b b2 = new b(this.dFb);
            b2.b(0.0, 128.0, 0.0, this.dFc.nextFloat() * 360.0f, 0.0f);
            this.dFb.G(b2);
        }
    }
}

