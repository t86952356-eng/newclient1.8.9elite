/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class l
extends e {
    private static final Predicate<IBlockState> cxq = BlockStateHelper.y(Blocks.cLJ).a(BlockTallGrass.bcx, Predicates.equalTo((Object)BlockTallGrass$EnumType.bcz));
    private final p cxr;
    private final w cxs;
    int cxt;

    public l(p p2) {
        this.cxr = p2;
        this.cxs = p2.baU;
        this.eO(7);
    }

    @Override
    public boolean WC() {
        if (this.cxr.VB().nextInt(this.cxr.Uz() ? 50 : 1000) != 0) {
            return false;
        }
        b b2 = new b(this.cxr.gW, this.cxr.gX, this.cxr.gY);
        return cxq.apply((Object)this.cxs.L(b2)) || this.cxs.L(b2.aqY()).df() == Blocks.cLe;
    }

    @Override
    public void WG() {
        this.cxt = 40;
        this.cxs.a((c)this.cxr, (byte)10);
        this.cxr.UU().aiL();
    }

    @Override
    public void WE() {
        this.cxt = 0;
    }

    @Override
    public boolean WD() {
        return this.cxt > 0;
    }

    public int WM() {
        return this.cxt;
    }

    @Override
    public void WF() {
        this.cxt = Math.max(0, this.cxt - 1);
        if (this.cxt == 4) {
            b b2 = new b(this.cxr.gW, this.cxr.gX, this.cxr.gY);
            if (cxq.apply((Object)this.cxs.L(b2))) {
                if (this.cxs.Si().gw("mobGriefing")) {
                    this.cxs.c(b2, false);
                }
                this.cxr.UX();
            } else {
                b b3 = b2.aqY();
                if (this.cxs.L(b3).df() == Blocks.cLe) {
                    if (this.cxs.Si().gw("mobGriefing")) {
                        this.cxs.e(2001, b3, Block.i(Blocks.cLe));
                        this.cxs.a(b3, Blocks.cLf.xM(), 2);
                    }
                    this.cxr.UX();
                }
            }
        }
    }
}

