/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockFlowerPot$EnumFlowerType;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.tileentity.x;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockFlowerPot
extends BlockContainer {
    public static final PropertyInteger aVr = PropertyInteger.e("legacy_data", 0, 15);
    public static final PropertyEnum<BlockFlowerPot$EnumFlowerType> aVs = PropertyEnum.c("contents", BlockFlowerPot$EnumFlowerType.class);

    public BlockFlowerPot() {
        super(Material.beE);
        this.h(this.aSG.zS().a(aVs, BlockFlowerPot$EnumFlowerType.aVv).a(aVr, 0));
        this.xx();
    }

    @Override
    public String xA() {
        return cr.gm("item.flowerPot.name");
    }

    @Override
    public void xx() {
        float f2 = 0.375f;
        float f3 = 0.1875f;
        this.a(0.3125f, 0.0f, 0.3125f, 0.6875f, 0.375f, 0.6875f);
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public int a(l l2, b b2, int n2) {
        d d2;
        net.minecraft.tileentity.d d3 = l2.K(b2);
        if (d3 instanceof x && (d2 = ((x)d3).aqz()) instanceof af) {
            return Block.f(d2).a(l2, b2, n2);
        }
        return 0xFFFFFF;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() instanceof af) {
            x x2 = this.I(w2, b2);
            if (x2 == null) {
                return false;
            }
            if (x2.aqz() != null) {
                return false;
            }
            Block block = Block.f(co2.bP());
            if (!this.e(block, co2.yc())) {
                return false;
            }
            x2.f(co2.bP(), co2.yc());
            x2.Lw();
            w2.P(b2);
            a2.a(n.dqu);
            if (!a2.cIt.cJM && --co2.cWZ <= 0) {
                a2.cHV.g(a2.cHV.cJE, null);
            }
            return true;
        }
        return false;
    }

    private boolean e(Block block, int n2) {
        return block == Blocks.cLP || block == Blocks.cLQ || block == Blocks.cMM || block == Blocks.cLR || block == Blocks.cLS || block == Blocks.cLi || block == Blocks.cLK || block == Blocks.cLJ && n2 == BlockTallGrass$EnumType.bcA.yi();
    }

    @Override
    public d e(w w2, b b2) {
        x x2 = this.I(w2, b2);
        return x2 != null && x2.aqz() != null ? x2.aqz() : Items.cRU;
    }

    @Override
    public int f(w w2, b b2) {
        x x2 = this.I(w2, b2);
        return x2 != null && x2.aqz() != null ? x2.aqA() : 0;
    }

    @Override
    public boolean xH() {
        return true;
    }

    @Override
    public boolean d(w w2, b b2) {
        return super.d(w2, b2) && w.v(w2, b2.aqY());
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w.v(w2, b2.aqY())) {
            this.a(w2, b2, iBlockState, 0);
            w2.aL(b2);
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        x x2 = this.I(w2, b2);
        if (x2 != null && x2.aqz() != null) {
            BlockFlowerPot.a(w2, b2, new co(x2.aqz(), 1, x2.aqA()));
        }
        super.d(w2, b2, iBlockState);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2) {
        x x2;
        super.a(w2, b2, iBlockState, a2);
        if (a2.cIt.cJM && (x2 = this.I(w2, b2)) != null) {
            x2.f(null, 0);
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cRU;
    }

    private x I(w w2, b b2) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        return d2 instanceof x ? (x)d2 : null;
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        Block block = null;
        int n3 = 0;
        switch (n2) {
            case 1: {
                block = Blocks.cLQ;
                n3 = BlockFlower$EnumFlowerType.aVb.yi();
                break;
            }
            case 2: {
                block = Blocks.cLP;
                break;
            }
            case 3: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXJ.yc();
                break;
            }
            case 4: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXK.yc();
                break;
            }
            case 5: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXL.yc();
                break;
            }
            case 6: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXM.yc();
                break;
            }
            case 7: {
                block = Blocks.cLS;
                break;
            }
            case 8: {
                block = Blocks.cLR;
                break;
            }
            case 9: {
                block = Blocks.cMM;
                break;
            }
            case 10: {
                block = Blocks.cLK;
                break;
            }
            case 11: {
                block = Blocks.cLJ;
                n3 = BlockTallGrass$EnumType.bcA.yi();
                break;
            }
            case 12: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXN.yc();
                break;
            }
            case 13: {
                block = Blocks.cLi;
                n3 = BlockPlanks$EnumType.aXO.yc();
            }
        }
        return new x(d.I(block), n3);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aVs, aVr);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aVr);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        x x2;
        d d2;
        BlockFlowerPot$EnumFlowerType blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVv;
        net.minecraft.tileentity.d d3 = l2.K(b2);
        if (d3 instanceof x && (d2 = (x2 = (x)d3).aqz()) instanceof af) {
            int n2 = x2.aqA();
            Block block = Block.f(d2);
            if (block == Blocks.cLi) {
                switch (BlockPlanks$EnumType.bd(n2)) {
                    case aXJ: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVG;
                        break;
                    }
                    case aXK: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVH;
                        break;
                    }
                    case aXL: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVI;
                        break;
                    }
                    case aXM: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVJ;
                        break;
                    }
                    case aXN: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVK;
                        break;
                    }
                    case aXO: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVL;
                        break;
                    }
                    default: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVv;
                        break;
                    }
                }
            } else if (block == Blocks.cLJ) {
                switch (n2) {
                    case 0: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVO;
                        break;
                    }
                    case 2: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVP;
                        break;
                    }
                    default: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVv;
                        break;
                    }
                }
            } else if (block == Blocks.cLP) {
                blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVF;
            } else if (block == Blocks.cLQ) {
                switch (BlockFlower$EnumFlowerType.a(BlockFlower$EnumFlowerColor.aUY, n2)) {
                    case aVb: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVw;
                        break;
                    }
                    case aVc: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVx;
                        break;
                    }
                    case aVd: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVy;
                        break;
                    }
                    case aVe: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVz;
                        break;
                    }
                    case aVf: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVA;
                        break;
                    }
                    case aVg: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVB;
                        break;
                    }
                    case aVh: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVC;
                        break;
                    }
                    case aVi: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVD;
                        break;
                    }
                    case aVj: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVE;
                        break;
                    }
                    default: {
                        blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVv;
                        break;
                    }
                }
            } else if (block == Blocks.cLS) {
                blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVM;
            } else if (block == Blocks.cLR) {
                blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVN;
            } else if (block == Blocks.cLK) {
                blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVO;
            } else if (block == Blocks.cMM) {
                blockFlowerPot$EnumFlowerType = BlockFlowerPot$EnumFlowerType.aVQ;
            }
        }
        return iBlockState.a(aVs, blockFlowerPot$EnumFlowerType);
    }

    @Override
    public av xo() {
        return av.dxX;
    }
}

