/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockVine;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.gen.feature.s;
import net.minecraft.world.w;

public class x
extends s {
    public x(boolean bl2, int n2, int n3, IBlockState iBlockState, IBlockState iBlockState2) {
        super(bl2, n2, n3, iBlockState, iBlockState2);
    }

    @Override
    public boolean b(w w2, Random random, b b2) {
        int n2;
        int n3 = this.m(random);
        if (!this.a(w2, random, b2, n3)) {
            return false;
        }
        this.j(w2, b2.hq(n3), 2);
        for (n2 = b2.wu() + n3 - 2 - random.nextInt(4); n2 > b2.wu() + n3 / 2; n2 -= 2 + random.nextInt(4)) {
            int n4;
            float f2 = random.nextFloat() * (float)Math.PI * 2.0f;
            int n5 = b2.wt() + (int)(0.5f + bt.bB(f2) * 4.0f);
            int n6 = b2.wx() + (int)(0.5f + bt.bx(f2) * 4.0f);
            for (n4 = 0; n4 < 5; ++n4) {
                n5 = b2.wt() + (int)(1.5f + bt.bB(f2) * (float)n4);
                n6 = b2.wx() + (int)(1.5f + bt.bx(f2) * (float)n4);
                this.N(w2, new b(n5, n2 - 3 + n4 / 2, n6), this.dOz);
            }
            n4 = 1 + random.nextInt(2);
            int n7 = n2;
            for (int i2 = n2 - n4; i2 <= n7; ++i2) {
                int n8 = i2 - n7;
                this.i(w2, new b(n5, i2, n6), 1 - n8);
            }
        }
        for (n2 = 0; n2 < n3; ++n2) {
            b b3;
            b b4;
            b b5 = b2.hq(n2);
            if (this.L(w2.L(b5).df())) {
                this.N(w2, b5, this.dOz);
                if (n2 > 0) {
                    this.a(w2, random, b5.arb(), BlockVine.bde);
                    this.a(w2, random, b5.aqZ(), BlockVine.bdf);
                }
            }
            if (n2 >= n3 - 1) continue;
            b b6 = b5.arc();
            if (this.L(w2.L(b6).df())) {
                this.N(w2, b6, this.dOz);
                if (n2 > 0) {
                    this.a(w2, random, b6.arc(), BlockVine.bdg);
                    this.a(w2, random, b6.aqZ(), BlockVine.bdf);
                }
            }
            if (this.L(w2.L(b4 = b5.ara().arc()).df())) {
                this.N(w2, b4, this.dOz);
                if (n2 > 0) {
                    this.a(w2, random, b4.arc(), BlockVine.bdg);
                    this.a(w2, random, b4.ara(), BlockVine.bdd);
                }
            }
            if (!this.L(w2.L(b3 = b5.ara()).df())) continue;
            this.N(w2, b3, this.dOz);
            if (n2 <= 0) continue;
            this.a(w2, random, b3.arb(), BlockVine.bde);
            this.a(w2, random, b3.ara(), BlockVine.bdd);
        }
        return true;
    }

    private void a(w w2, Random random, b b2, PropertyBool propertyBool) {
        if (random.nextInt(3) > 0 && w2.aG(b2)) {
            this.N(w2, b2, Blocks.cNp.xM().a(propertyBool, true));
        }
    }

    private void j(w w2, b b2, int n2) {
        int n3 = 2;
        for (int i2 = -2; i2 <= 0; ++i2) {
            this.h(w2, b2.hq(i2), n2 + 1 - i2);
        }
    }
}

