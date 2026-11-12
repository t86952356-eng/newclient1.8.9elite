/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLever$EnumOrientation;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.world.l;

public class b {
    private static IBakedModel dUZ = null;

    public static void jA() {
        dUZ = a.AZ().BE().IY().B(Blocks.cMJ.xM());
    }

    public static IBakedModel aAa() {
        return dUZ;
    }

    public static IBlockState aAb() {
        return Blocks.cMJ.xM();
    }

    public static boolean a(l l2, IBlockState iBlockState, net.minecraft.util.b b2) {
        Block block = iBlockState.df();
        return b.a(block, iBlockState) && b.z(l2, b2);
    }

    private static boolean z(l l2, net.minecraft.util.b b2) {
        Block block = Blocks.cMJ;
        return (l2.L(b2.aqZ()).df() == block || l2.L(b2.ara()).df() == block || l2.L(b2.arb()).df() == block || l2.L(b2.arc()).df() == block) && l2.L(b2.aqY()).df().xk();
    }

    private static boolean a(Block block, IBlockState iBlockState) {
        if (block.xf()) {
            return false;
        }
        if (block.xk()) {
            return false;
        }
        if (block instanceof BlockSnow) {
            return false;
        }
        if (!(block instanceof BlockDoublePlant || block instanceof BlockFlower || block instanceof BlockMushroom || block instanceof BlockSapling || block instanceof BlockTallGrass)) {
            if (!(block instanceof BlockFence || block instanceof BlockFenceGate || block instanceof BlockFlowerPot || block instanceof BlockPane || block instanceof BlockReed || block instanceof BlockWall)) {
                if (block instanceof BlockRedstoneTorch && iBlockState.b(BlockTorch.bcF) == ao.dwr) {
                    return true;
                }
                if (block instanceof BlockLever) {
                    BlockLever$EnumOrientation blockLever$EnumOrientation = iBlockState.b(BlockLever.aWE);
                    return blockLever$EnumOrientation == BlockLever$EnumOrientation.aWO || blockLever$EnumOrientation == BlockLever$EnumOrientation.aWN;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}

