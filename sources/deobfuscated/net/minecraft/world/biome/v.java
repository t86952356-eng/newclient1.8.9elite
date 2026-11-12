/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.l;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.aa;
import net.minecraft.world.gen.feature.aj;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;

public class v
extends j {
    private final ao dHG = new aa(Blocks.cNg.xM().a(BlockSilverfish.baw, BlockSilverfish$EnumType.bax), 9);
    private final aj dHH = new aj(false);
    private final int dHI = 0;
    private final int dHJ = 1;
    private final int dHK = 2;
    private int dHL = this.dHI;

    protected v(int n2, boolean bl2) {
        super(n2);
        if (bl2) {
            this.dHh.dFB = 3;
            this.dHL = this.dHJ;
        }
    }

    @Override
    public a j(Random random) {
        return random.nextInt(3) > 0 ? this.dHH : super.j(random);
    }

    @Override
    public void a(w w2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        super.a(w2, random, b2);
        int n5 = 3 + random.nextInt(6);
        for (n4 = 0; n4 < n5; ++n4) {
            int n6;
            n3 = random.nextInt(16);
            b b3 = b2.C(n3, n2 = random.nextInt(28) + 4, n6 = random.nextInt(16));
            if (w2.L(b3).df() != Blocks.cLd) continue;
            w2.a(b3, Blocks.cNR.xM(), 2);
        }
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16);
            n3 = random.nextInt(64);
            n2 = random.nextInt(16);
            this.dHG.b(w2, random, b2.C(n4, n3, n2));
        }
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        this.dGZ = Blocks.cLe.xM();
        this.dHa = Blocks.cLf.xM();
        if ((d2 < -1.0 || d2 > 2.0) && this.dHL == this.dHK) {
            this.dGZ = Blocks.cLp.xM();
            this.dHa = Blocks.cLp.xM();
        } else if (d2 > 1.0 && this.dHL != this.dHJ) {
            this.dGZ = Blocks.cLd.xM();
            this.dHa = Blocks.cLd.xM();
        }
        this.b(w2, random, f2, n2, n3, d2);
    }

    private v c(j j2) {
        this.dHL = this.dHK;
        this.s(j2.lp, true);
        this.gE(j2.dGX + " M");
        this.a(new l(j2.dHc, j2.dHd));
        this.B(j2.dHe, j2.dHf);
        return this;
    }

    @Override
    protected j in(int n2) {
        return new v(n2, false).c(this);
    }
}

