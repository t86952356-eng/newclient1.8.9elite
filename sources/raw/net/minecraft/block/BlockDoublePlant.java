/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoublePlant$EnumBlockHalf;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.biome.c;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockDoublePlant
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockDoublePlant$EnumPlantType> aUb = PropertyEnum.c("variant", BlockDoublePlant$EnumPlantType.class);
    public static final PropertyEnum<BlockDoublePlant$EnumBlockHalf> aUc = PropertyEnum.c("half", BlockDoublePlant$EnumBlockHalf.class);
    public static final PropertyEnum<ao> aUd = BlockDirectional.aTB;

    public BlockDoublePlant() {
        super(Material.bez);
        this.h(this.aSG.zS().a(aUb, BlockDoublePlant$EnumPlantType.aUh).a(aUc, BlockDoublePlant$EnumBlockHalf.aUf).a(aUd, ao.dws));
        this.L(0.0f);
        this.a(aSb);
        this.cr("doublePlant");
    }

    @Override
    public void c(l l2, b b2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public BlockDoublePlant$EnumPlantType h(l l2, b b2) {
        IBlockState iBlockState = l2.L(b2);
        if (iBlockState.df() == this) {
            iBlockState = this.a(iBlockState, l2, b2);
            return iBlockState.b(aUb);
        }
        return BlockDoublePlant$EnumPlantType.aUk;
    }

    @Override
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && w2.aG(b2.aqX());
    }

    @Override
    public boolean a(w w2, b b2) {
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() != this) {
            return true;
        }
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = this.a(iBlockState, (l)w2, b2).b(aUb);
        return blockDoublePlant$EnumPlantType == BlockDoublePlant$EnumPlantType.aUk || blockDoublePlant$EnumPlantType == BlockDoublePlant$EnumPlantType.aUj;
    }

    @Override
    protected void e(w w2, b b2, IBlockState iBlockState) {
        if (!this.f(w2, b2, iBlockState)) {
            BlockDoublePlant blockDoublePlant;
            boolean bl2 = iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe;
            b b3 = bl2 ? b2 : b2.aqX();
            b b4 = bl2 ? b2.aqY() : b2;
            BlockDoublePlant blockDoublePlant2 = bl2 ? this : w2.L(b3).df();
            Block block = blockDoublePlant = bl2 ? w2.L(b4).df() : this;
            if (blockDoublePlant2 == this) {
                w2.a(b3, Blocks.cLc.xM(), 2);
            }
            if (blockDoublePlant == this) {
                w2.a(b4, Blocks.cLc.xM(), 3);
                if (!bl2) {
                    this.a(w2, b4, iBlockState, 0);
                }
            }
        }
    }

    @Override
    public boolean f(w w2, b b2, IBlockState iBlockState) {
        if (iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe) {
            return w2.L(b2.aqY()).df() == this;
        }
        IBlockState iBlockState2 = w2.L(b2.aqX());
        return iBlockState2.df() == this && super.f(w2, b2, iBlockState2);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        if (iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe) {
            return null;
        }
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = iBlockState.b(aUb);
        return blockDoublePlant$EnumPlantType == BlockDoublePlant$EnumPlantType.aUk ? null : (blockDoublePlant$EnumPlantType == BlockDoublePlant$EnumPlantType.aUj ? (random.nextInt(8) == 0 ? Items.cPR : null) : d.I(this));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aUc) != BlockDoublePlant$EnumBlockHalf.aUe && iBlockState.b(aUb) != BlockDoublePlant$EnumPlantType.aUj ? iBlockState.b(aUb).yi() : 0;
    }

    @Override
    public int a(l l2, b b2, int n2) {
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = this.h(l2, b2);
        return blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUj && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUk ? 0xFFFFFF : c.w(l2, b2);
    }

    public void a(w w2, b b2, BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType, int n2) {
        w2.a(b2, this.xM().a(aUc, BlockDoublePlant$EnumBlockHalf.aUf).a(aUb, blockDoublePlant$EnumPlantType), n2);
        w2.a(b2.aqX(), this.xM().a(aUc, BlockDoublePlant$EnumBlockHalf.aUe), n2);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        w2.a(b2.aqX(), this.xM().a(aUc, BlockDoublePlant$EnumBlockHalf.aUe), 2);
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (w2.dDw || a2.abO() == null || a2.abO().bP() != Items.cRi || iBlockState.b(aUc) != BlockDoublePlant$EnumBlockHalf.aUf || !this.c(w2, b2, iBlockState, a2)) {
            super.a(w2, a2, b2, iBlockState, d2);
        }
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        if (iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe) {
            if (w2.L(b2.aqY()).df() == this) {
                if (!a2.cIt.cJM) {
                    IBlockState iBlockState2 = w2.L(b2.aqY());
                    BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = iBlockState2.b(aUb);
                    if (blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUk && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUj) {
                        w2.c(b2.aqY(), true);
                    } else if (!w2.dDw) {
                        if (a2.abO() != null && a2.abO().bP() == Items.cRi) {
                            this.c(w2, b2, iBlockState2, a2);
                            w2.aL(b2.aqY());
                        } else {
                            w2.c(b2.aqY(), true);
                        }
                    } else {
                        w2.aL(b2.aqY());
                    }
                } else {
                    w2.aL(b2.aqY());
                }
            }
        } else if (a2.cIt.cJM && w2.L(b2.aqX()).df() == this) {
            w2.a(b2.aqX(), Blocks.cLc.xM(), 2);
        }
        super.a(w2, b2, iBlockState, a2);
    }

    private boolean c(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = iBlockState.b(aUb);
        if (blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUk && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUj) {
            return false;
        }
        a2.a(n.dqC[Block.i(this)]);
        int n2 = (blockDoublePlant$EnumPlantType == BlockDoublePlant$EnumPlantType.aUj ? BlockTallGrass$EnumType.bcz : BlockTallGrass$EnumType.bcA).yi();
        BlockDoublePlant.a(w2, b2, new co(Blocks.cLJ, 2, n2));
        return true;
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType : BlockDoublePlant$EnumPlantType.values()) {
            list.add(new co(d2, 1, blockDoublePlant$EnumPlantType.yi()));
        }
    }

    @Override
    public int f(w w2, b b2) {
        return this.h((l)w2, b2).yi();
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, boolean bl2) {
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = this.h((l)w2, b2);
        return blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUj && blockDoublePlant$EnumPlantType != BlockDoublePlant$EnumPlantType.aUk;
    }

    @Override
    public boolean a(w w2, Random random, b b2, IBlockState iBlockState) {
        return true;
    }

    @Override
    public void b(w w2, Random random, b b2, IBlockState iBlockState) {
        BlockDoublePlant.a(w2, b2, new co(this, 1, this.h((l)w2, b2).yi()));
    }

    @Override
    public IBlockState aM(int n2) {
        return (n2 & 8) > 0 ? this.xM().a(aUc, BlockDoublePlant$EnumBlockHalf.aUe) : this.xM().a(aUc, BlockDoublePlant$EnumBlockHalf.aUf).a(aUb, BlockDoublePlant$EnumPlantType.aW(n2 & 7));
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        IBlockState iBlockState2;
        if (iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe && (iBlockState2 = l2.L(b2.aqY())).df() == this) {
            iBlockState = iBlockState.a(aUb, iBlockState2.b(aUb));
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aUc) == BlockDoublePlant$EnumBlockHalf.aUe ? 8 | iBlockState.b(aUd).asA() : iBlockState.b(aUb).yi();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUc, aUb, aUd);
    }

    @Override
    public Block$EnumOffsetType xN() {
        return Block$EnumOffsetType.aSK;
    }
}

