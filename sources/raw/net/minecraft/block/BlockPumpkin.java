/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPumpkin$1;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.creativetab.a;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.db;

public class BlockPumpkin
extends BlockDirectional {
    private BlockPattern aYx;
    private BlockPattern aYy;
    private BlockPattern aYz;
    private BlockPattern aYA;
    private static final Predicate<IBlockState> aYB = new BlockPumpkin$1();

    protected BlockPumpkin() {
        super(Material.beQ, MapColor.bdR);
        this.h(this.aSG.zS().a(aTB, ao.dws));
        this.O(true);
        this.a(a.cpx);
    }

    @Override
    public void c(net.minecraft.world.w w2, b b2, IBlockState iBlockState) {
        super.c(w2, b2, iBlockState);
        this.O(w2, b2);
    }

    public boolean N(net.minecraft.world.w w2, b b2) {
        return this.yK().Y(w2, b2) != null || this.yM().Y(w2, b2) != null;
    }

    private void O(net.minecraft.world.w w2, b b2) {
        block9: {
            int n2;
            BlockPattern$PatternHelper blockPattern$PatternHelper;
            block8: {
                int n3;
                Object object;
                blockPattern$PatternHelper = this.yL().Y(w2, b2);
                if (blockPattern$PatternHelper == null) break block8;
                for (int i2 = 0; i2 < this.yL().Ac(); ++i2) {
                    object = blockPattern$PatternHelper.n(0, i2, 0);
                    w2.a(((BlockWorldState)object).Ab(), Blocks.cLc.xM(), 2);
                }
                net.minecraft.entity.monster.ao ao2 = new net.minecraft.entity.monster.ao(w2);
                object = blockPattern$PatternHelper.n(0, 2, 0).Ab();
                ao2.b((double)((db)object).wt() + 0.5, (double)((db)object).wu() + 0.05, (double)((db)object).wx() + 0.5, 0.0f, 0.0f);
                w2.G(ao2);
                for (n3 = 0; n3 < 120; ++n3) {
                    w2.a(as.dxC, (double)((db)object).wt() + w2.dDk.nextDouble(), (double)((db)object).wu() + w2.dDk.nextDouble() * 2.5, (double)((db)object).wx() + w2.dDk.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
                for (n3 = 0; n3 < this.yL().Ac(); ++n3) {
                    BlockWorldState blockWorldState = blockPattern$PatternHelper.n(0, n3, 0);
                    w2.b(blockWorldState.Ab(), Blocks.cLc);
                }
                break block9;
            }
            blockPattern$PatternHelper = this.yN().Y(w2, b2);
            if (blockPattern$PatternHelper == null) break block9;
            for (int i3 = 0; i3 < this.yN().Ad(); ++i3) {
                for (int i4 = 0; i4 < this.yN().Ac(); ++i4) {
                    w2.a(blockPattern$PatternHelper.n(i3, i4, 0).Ab(), Blocks.cLc.xM(), 2);
                }
            }
            b b3 = blockPattern$PatternHelper.n(1, 2, 0).Ab();
            w w3 = new w(w2);
            w3.bg(true);
            w3.b((double)b3.wt() + 0.5, (double)b3.wu() + 0.05, (double)b3.wx() + 0.5, 0.0f, 0.0f);
            w2.G(w3);
            for (n2 = 0; n2 < 120; ++n2) {
                w2.a(as.dxB, (double)b3.wt() + w2.dDk.nextDouble(), (double)b3.wu() + w2.dDk.nextDouble() * 3.9, (double)b3.wx() + w2.dDk.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (n2 = 0; n2 < this.yN().Ad(); ++n2) {
                for (int i5 = 0; i5 < this.yN().Ac(); ++i5) {
                    BlockWorldState blockWorldState = blockPattern$PatternHelper.n(n2, i5, 0);
                    w2.b(blockWorldState.Ab(), Blocks.cLc);
                }
            }
        }
    }

    @Override
    public boolean d(net.minecraft.world.w w2, b b2) {
        return w2.L((b)b2).df().aSD.zE() && net.minecraft.world.w.v(w2, b2.aqY());
    }

    @Override
    public IBlockState a(net.minecraft.world.w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTB, r2.Uq().asC());
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTB, ao.hz(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTB).asA();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB);
    }

    protected BlockPattern yK() {
        if (this.aYx == null) {
            this.aYx = FactoryBlockPattern.Aj().g(" ", "#", "#").a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cML))).Ak();
        }
        return this.aYx;
    }

    protected BlockPattern yL() {
        if (this.aYy == null) {
            this.aYy = FactoryBlockPattern.Aj().g("^", "#", "#").a('^', BlockWorldState.a(aYB)).a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cML))).Ak();
        }
        return this.aYy;
    }

    protected BlockPattern yM() {
        if (this.aYz == null) {
            this.aYz = FactoryBlockPattern.Aj().g("~ ~", "###", "~#~").a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cLU))).a('~', BlockWorldState.a(BlockStateHelper.y(Blocks.cLc))).Ak();
        }
        return this.aYz;
    }

    protected BlockPattern yN() {
        if (this.aYA == null) {
            this.aYA = FactoryBlockPattern.Aj().g("~^~", "###", "~#~").a('^', BlockWorldState.a(aYB)).a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cLU))).a('~', BlockWorldState.a(BlockStateHelper.y(Blocks.cLc))).Ak();
        }
        return this.aYA;
    }
}

