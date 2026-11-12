/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockFlowerPot$EnumFlowerType;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.entity.monster.at;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.d;
import net.minecraft.world.gen.structure.w;

public class g
extends d {
    private boolean dPX;

    public g() {
    }

    public g(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 7, 9);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Witch", this.dPX);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dPX = n2.eO("Witch");
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        int n4;
        if (!this.a(w2, w3, 0)) {
            return false;
        }
        this.a(w2, w3, 1, 1, 1, 5, 1, 7, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 1, 4, 2, 5, 4, 7, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 2, 1, 0, 4, 1, 0, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 2, 2, 2, 3, 3, 2, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 1, 2, 3, 1, 3, 6, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 5, 2, 3, 5, 3, 6, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 2, 2, 7, 4, 3, 7, Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), Blocks.cLh.aM(BlockPlanks$EnumType.aXK.yc()), false);
        this.a(w2, w3, 1, 0, 2, 1, 3, 2, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 5, 0, 2, 5, 3, 2, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 1, 0, 7, 1, 3, 7, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, w3, 5, 0, 7, 5, 3, 7, Blocks.cLt.xM(), Blocks.cLt.xM(), false);
        this.a(w2, Blocks.cMQ.xM(), 2, 3, 2, w3);
        this.a(w2, Blocks.cMQ.xM(), 3, 3, 7, w3);
        this.a(w2, Blocks.cLc.xM(), 1, 3, 4, w3);
        this.a(w2, Blocks.cLc.xM(), 5, 3, 4, w3);
        this.a(w2, Blocks.cLc.xM(), 5, 3, 5, w3);
        this.a(w2, Blocks.cOc.xM().a(BlockFlowerPot.aVs, BlockFlowerPot$EnumFlowerType.aVM), 1, 3, 5, w3);
        this.a(w2, Blocks.cMk.xM(), 3, 2, 6, w3);
        this.a(w2, Blocks.cNG.xM(), 4, 2, 6, w3);
        this.a(w2, Blocks.cMQ.xM(), 1, 2, 1, w3);
        this.a(w2, Blocks.cMQ.xM(), 5, 2, 1, w3);
        int n5 = this.g(Blocks.cMf, 3);
        int n6 = this.g(Blocks.cMf, 1);
        int n7 = this.g(Blocks.cMf, 0);
        int n8 = this.g(Blocks.cMf, 2);
        this.a(w2, w3, 0, 4, 1, 6, 4, 1, Blocks.cNW.aM(n5), Blocks.cNW.aM(n5), false);
        this.a(w2, w3, 0, 4, 2, 0, 4, 7, Blocks.cNW.aM(n7), Blocks.cNW.aM(n7), false);
        this.a(w2, w3, 6, 4, 2, 6, 4, 7, Blocks.cNW.aM(n6), Blocks.cNW.aM(n6), false);
        this.a(w2, w3, 0, 4, 8, 6, 4, 8, Blocks.cNW.aM(n8), Blocks.cNW.aM(n8), false);
        for (n4 = 2; n4 <= 7; n4 += 5) {
            for (n3 = 1; n3 <= 5; n3 += 4) {
                this.b(w2, Blocks.cLt.xM(), n3, -1, n4, w3);
            }
        }
        if (!this.dPX && w3.k(new b(n4 = this.bn(2, 5), n3 = this.iH(2), n2 = this.bo(2, 5)))) {
            this.dPX = true;
            at at2 = new at(w2);
            at2.b((double)n4 + 0.5, (double)n3, (double)n2 + 0.5, 0.0f, 0.0f);
            at2.a(w2.bg(new b(n4, n3, n2)), null);
            w2.G(at2);
        }
        return true;
    }
}

