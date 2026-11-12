/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDropper;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelShapes$1;
import net.minecraft.client.renderer.BlockModelShapes$2;
import net.minecraft.client.renderer.BlockModelShapes$3;
import net.minecraft.client.renderer.BlockModelShapes$4;
import net.minecraft.client.renderer.BlockModelShapes$5;
import net.minecraft.client.renderer.BlockModelShapes$6;
import net.minecraft.client.renderer.BlockModelShapes$7;
import net.minecraft.client.renderer.block.statemap.BlockStateMapper;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap$Builder;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;

public class BlockModelShapes {
    private final Map<IBlockState, IBakedModel> bIt = Maps.newIdentityHashMap();
    private final BlockStateMapper bIu = new BlockStateMapper();
    private final ModelManager bIv;

    public BlockModelShapes(ModelManager modelManager) {
        this.bIv = modelManager;
        this.IX();
    }

    public BlockStateMapper IU() {
        return this.bIu;
    }

    public TextureAtlasSprite A(IBlockState iBlockState) {
        Block block = iBlockState.df();
        IBakedModel iBakedModel = this.B(iBlockState);
        if (iBakedModel == null || iBakedModel == this.bIv.QA()) {
            if (block == Blocks.cMz || block == Blocks.cMp || block == Blocks.cMg || block == Blocks.cOi || block == Blocks.cOM || block == Blocks.cONN) {
                return this.bIv.QB().dq("minecraft:blocks/planks_oak");
            }
            if (block == Blocks.cNS) {
                return this.bIv.QB().dq("minecraft:blocks/obsidian");
            }
            if (block == Blocks.cLm || block == Blocks.cLn) {
                return this.bIv.QB().dq("minecraft:blocks/lava_still");
            }
            if (block == Blocks.cLk || block == Blocks.cLl) {
                return this.bIv.QB().dq("minecraft:blocks/water_still");
            }
            if (block == Blocks.cOg) {
                return this.bIv.QB().dq("minecraft:blocks/soul_sand");
            }
            if (block == Blocks.cOx) {
                return this.bIv.QB().dq("minecraft:items/barrier");
            }
        }
        if (iBakedModel == null) {
            iBakedModel = this.bIv.QA();
        }
        return iBakedModel.Qm();
    }

    public IBakedModel B(IBlockState iBlockState) {
        IBakedModel iBakedModel = this.bIt.get(iBlockState);
        if (iBakedModel == null) {
            iBakedModel = this.bIv.QA();
        }
        return iBakedModel;
    }

    public ModelManager IV() {
        return this.bIv;
    }

    public void IW() {
        this.bIt.clear();
        for (Map.Entry<IBlockState, ModelResourceLocation> entry : this.bIu.MB().entrySet()) {
            this.bIt.put(entry.getKey(), this.bIv.a(entry.getValue()));
        }
    }

    public void a(Block block, IStateMapper iStateMapper) {
        this.bIu.b(block, iStateMapper);
    }

    public void a(Block ... blockArray) {
        this.bIu.a(blockArray);
    }

    private void IX() {
        this.a(Blocks.cLc, Blocks.cLk, Blocks.cLl, Blocks.cLm, Blocks.cLn, Blocks.cLO, Blocks.cMg, Blocks.cNS, Blocks.cOi, Blocks.cMp, Blocks.cOg, Blocks.cNH, Blocks.cOx, Blocks.cMz, Blocks.cONN, Blocks.cOM);
        this.a(Blocks.cLd, new StateMap$Builder().d(BlockStone.bbw).MC());
        this.a(Blocks.cOK, new StateMap$Builder().d(BlockPrismarine.aYl).MC());
        this.a((Block)Blocks.cLv, new StateMap$Builder().d(BlockOldLeaf.aXl).dn("_leaves").a(BlockLeaves.aWz, BlockLeaves.aWy).MC());
        this.a((Block)Blocks.cLw, new StateMap$Builder().d(BlockNewLeaf.aXg).dn("_leaves").a(BlockLeaves.aWz, BlockLeaves.aWy).MC());
        this.a((Block)Blocks.cMM, new StateMap$Builder().a(BlockCactus.aTo).MC());
        this.a((Block)Blocks.cMO, new StateMap$Builder().a(BlockReed.aZZ).MC());
        this.a(Blocks.cMP, new StateMap$Builder().a(BlockJukebox.aWt).MC());
        this.a(Blocks.cNZ, new StateMap$Builder().a(BlockCommandBlock.aTx).MC());
        this.a(Blocks.cOb, new StateMap$Builder().d(BlockWall.bdo).dn("_wall").MC());
        this.a((Block)Blocks.cOH, new StateMap$Builder().d(BlockDoublePlant.aUb).a(BlockDoublePlant.aUd).MC());
        this.a(Blocks.cNq, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNr, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNs, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNt, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNu, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNv, new StateMap$Builder().a(BlockFenceGate.aUJ).MC());
        this.a(Blocks.cNU, new StateMap$Builder().a(BlockTripWire.bcS, BlockTripWire.bcP).MC());
        this.a((Block)Blocks.cNN, new StateMap$Builder().d(BlockPlanks.aXI).dn("_double_slab").MC());
        this.a((Block)Blocks.cNO, new StateMap$Builder().d(BlockPlanks.aXI).dn("_slab").MC());
        this.a(Blocks.cLY, new StateMap$Builder().a(BlockTNT.bcw).MC());
        this.a((Block)Blocks.cMd, new StateMap$Builder().a(BlockFire.aUL).MC());
        this.a((Block)Blocks.cMh, new StateMap$Builder().a(BlockRedstoneWire.aZR).MC());
        this.a(Blocks.cMq, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMr, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMs, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMt, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMu, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMv, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cMC, new StateMap$Builder().a(BlockDoor.aTT).MC());
        this.a(Blocks.cLN, new StateMap$Builder().d(BlockColored.aTw).dn("_wool").MC());
        this.a(Blocks.cOA, new StateMap$Builder().d(BlockColored.aTw).dn("_carpet").MC());
        this.a(Blocks.cOw, new StateMap$Builder().d(BlockColored.aTw).dn("_stained_hardened_clay").MC());
        this.a((Block)Blocks.cOJ, new StateMap$Builder().d(BlockColored.aTw).dn("_stained_glass_pane").MC());
        this.a((Block)Blocks.cOI, new StateMap$Builder().d(BlockColored.aTw).dn("_stained_glass").MC());
        this.a(Blocks.cLC, new StateMap$Builder().d(BlockSandStone.bak).MC());
        this.a(Blocks.cOO, new StateMap$Builder().d(BlockRedSandstone.aZq).MC());
        this.a((Block)Blocks.cLJ, new StateMap$Builder().d(BlockTallGrass.bcx).MC());
        this.a(Blocks.cLE, new StateMap$Builder().a(BlockBed.aTd).MC());
        this.a((Block)Blocks.cLP, new StateMap$Builder().d(Blocks.cLP.yq()).MC());
        this.a((Block)Blocks.cLQ, new StateMap$Builder().d(Blocks.cLQ.yq()).MC());
        this.a((Block)Blocks.cLW, new StateMap$Builder().d(BlockStoneSlab.bbZ).dn("_slab").MC());
        this.a((Block)Blocks.cOR, new StateMap$Builder().d(BlockStoneSlabNew.bcp).dn("_slab").MC());
        this.a(Blocks.cNg, new StateMap$Builder().d(BlockSilverfish.baw).dn("_monster_egg").MC());
        this.a(Blocks.cNh, new StateMap$Builder().d(BlockStoneBrick.bbK).MC());
        this.a(Blocks.cLB, new StateMap$Builder().a(BlockDispenser.aTO).MC());
        this.a(Blocks.cOv, new StateMap$Builder().a(BlockDropper.aTO).MC());
        this.a(Blocks.cLt, new StateMap$Builder().d(BlockOldLog.aXm).dn("_log").MC());
        this.a(Blocks.cLu, new StateMap$Builder().d(BlockNewLog.aXh).dn("_log").MC());
        this.a(Blocks.cLh, new StateMap$Builder().d(BlockPlanks.aXI).dn("_planks").MC());
        this.a(Blocks.cLi, new StateMap$Builder().d(BlockSapling.bat).dn("_sapling").MC());
        this.a((Block)Blocks.cLo, new StateMap$Builder().d(BlockSand.bab).MC());
        this.a((Block)Blocks.cOr, new StateMap$Builder().a(BlockHopper.aVZ).MC());
        this.a(Blocks.cOc, new StateMap$Builder().a(BlockFlowerPot.aVr).MC());
        this.a(Blocks.cOs, new BlockModelShapes$1(this));
        this.a((Block)Blocks.cLK, new BlockModelShapes$2(this));
        this.a(Blocks.cNn, new BlockModelShapes$3(this));
        this.a(Blocks.cNo, new BlockModelShapes$4(this));
        this.a(Blocks.cLf, new BlockModelShapes$5(this));
        this.a((Block)Blocks.cLV, new BlockModelShapes$6(this));
        this.a((Block)Blocks.cOQ, new BlockModelShapes$7(this));
    }
}

