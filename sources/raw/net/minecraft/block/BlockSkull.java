/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSkull$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.entity.boss.d;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.aj;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.util.db;
import net.minecraft.world.f;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockSkull
extends BlockContainer {
    public static final PropertyDirection baI = PropertyDirection.ct("facing");
    public static final PropertyBool baJ = PropertyBool.cs("nodrop");
    private static final Predicate<BlockWorldState> baK = new BlockSkull$1();
    private BlockPattern baL;
    private BlockPattern baM;

    protected BlockSkull() {
        super(Material.beE);
        this.h(this.aSG.zS().a(baI, ao.dws).a(baJ, false));
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }

    @Override
    public String xA() {
        return cr.gm("tile.skull.skeleton.name");
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        switch (l2.L(b2).b(baI)) {
            default: {
                this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case dws: {
                this.a(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case dwt: {
                this.a(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case dwu: {
                this.a(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case dwv: {
                this.a(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
            }
        }
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        return super.a(w2, b2, iBlockState);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(baI, r2.Uq()).a(baJ, false);
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new aj();
    }

    @Override
    public net.minecraft.item.d e(w w2, b b2) {
        return Items.cSb;
    }

    @Override
    public int f(w w2, b b2) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        return d2 instanceof aj ? ((aj)d2).aqT() : super.f(w2, b2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        if (a2.cIt.cJM) {
            iBlockState = iBlockState.a(baJ, true);
            w2.a(b2, iBlockState, 4);
        }
        super.a(w2, b2, iBlockState, a2);
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        if (!w2.dDw) {
            net.minecraft.tileentity.d d2;
            if (!iBlockState.b(baJ).booleanValue() && (d2 = w2.K(b2)) instanceof aj) {
                aj aj2 = (aj)d2;
                co co2 = new co(Items.cSb, 1, this.f(w2, b2));
                if (aj2.aqT() == 3 && aj2.aqR() != null) {
                    co2.u(new n());
                    n n2 = new n();
                    aa.a(n2, aj2.aqR());
                    co2.aek().b("SkullOwner", n2);
                }
                BlockSkull.a(w2, b2, co2);
            }
            super.d(w2, b2, iBlockState);
        }
    }

    @Override
    public net.minecraft.item.d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cSb;
    }

    public boolean b(w w2, b b2, co co2) {
        return co2.yc() == 1 && b2.wu() >= 2 && w2.agm() != f.dBR && !w2.dDw && this.zc().Y(w2, b2) != null;
    }

    public void a(w w2, b b2, aj aj2) {
        BlockPattern blockPattern;
        BlockPattern$PatternHelper blockPattern$PatternHelper;
        if (aj2.aqT() == 1 && b2.wu() >= 2 && w2.agm() != f.dBR && !w2.dDw && (blockPattern$PatternHelper = (blockPattern = this.zd()).Y(w2, b2)) != null) {
            int n2;
            Object object;
            int n3;
            for (n3 = 0; n3 < 3; ++n3) {
                BlockWorldState blockWorldState = blockPattern$PatternHelper.n(n3, 0, 0);
                w2.a(blockWorldState.Ab(), blockWorldState.yU().a(baJ, true), 2);
            }
            for (n3 = 0; n3 < blockPattern.Ad(); ++n3) {
                for (int i2 = 0; i2 < blockPattern.Ac(); ++i2) {
                    object = blockPattern$PatternHelper.n(n3, i2, 0);
                    w2.a(((BlockWorldState)object).Ab(), Blocks.cLc.xM(), 2);
                }
            }
            b b3 = blockPattern$PatternHelper.n(1, 0, 0).Ab();
            d d2 = new d(w2);
            object = blockPattern$PatternHelper.n(1, 2, 0).Ab();
            d2.b((double)((db)object).wt() + 0.5, (double)((db)object).wu() + 0.55, (double)((db)object).wx() + 0.5, blockPattern$PatternHelper.Af().asL() == ap.dwH ? 0.0f : 90.0f, 0.0f);
            d2.cuF = blockPattern$PatternHelper.Af().asL() == ap.dwH ? 0.0f : 90.0f;
            d2.XI();
            for (net.minecraft.entity.player.a a2 : w2.a(net.minecraft.entity.player.a.class, d2.Us().ad(50.0, 50.0, 50.0))) {
                a2.a(net.minecraft.stats.b.dph);
            }
            w2.G(d2);
            for (n2 = 0; n2 < 120; ++n2) {
                w2.a(as.dxB, (double)b3.wt() + w2.dDk.nextDouble(), (double)(b3.wu() - 2) + w2.dDk.nextDouble() * 3.9, (double)b3.wx() + w2.dDk.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (n2 = 0; n2 < blockPattern.Ad(); ++n2) {
                for (int i3 = 0; i3 < blockPattern.Ac(); ++i3) {
                    BlockWorldState blockWorldState = blockPattern$PatternHelper.n(n2, i3, 0);
                    w2.b(blockWorldState.Ab(), Blocks.cLc);
                }
            }
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baI, ao.hy(n2 & 7)).a(baJ, (n2 & 8) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(baI).OY();
        if (iBlockState.b(baJ).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baI, baJ);
    }

    protected BlockPattern zc() {
        if (this.baL == null) {
            this.baL = FactoryBlockPattern.Aj().g("   ", "###", "~#~").a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cMY))).a('~', BlockWorldState.a(BlockStateHelper.y(Blocks.cLc))).Ak();
        }
        return this.baL;
    }

    protected BlockPattern zd() {
        if (this.baM == null) {
            this.baM = FactoryBlockPattern.Aj().g("^^^", "###", "~#~").a('#', BlockWorldState.a(BlockStateHelper.y(Blocks.cMY))).a('^', baK).a('~', BlockWorldState.a(BlockStateHelper.y(Blocks.cLc))).Ak();
        }
        return this.baM;
    }
}

