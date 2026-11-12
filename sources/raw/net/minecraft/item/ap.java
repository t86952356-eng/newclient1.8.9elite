/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoor$EnumDoorHalf;
import net.minecraft.block.BlockDoor$EnumHingePosition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class ap
extends d {
    private final Block cWb;

    public ap(Block block) {
        this.cWb = block;
        this.d(a.cpz);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 != ao.dwr) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (!block.a(w2, b2)) {
            b2 = b2.x(ao2);
        }
        if (!a2.a(b2, ao2, co2)) {
            return false;
        }
        if (!this.cWb.d(w2, b2)) {
            return false;
        }
        ap.a(w2, b2, ao.aC(a2.pl), this.cWb);
        --co2.cWZ;
        return true;
    }

    public static void a(w w2, b b2, ao ao2, Block block) {
        b b3 = b2.x(ao2.asD());
        b b4 = b2.x(ao2.asG());
        int n2 = (w2.L(b4).df().xd() ? 1 : 0) + (w2.L(b4.aqX()).df().xd() ? 1 : 0);
        int n3 = (w2.L(b3).df().xd() ? 1 : 0) + (w2.L(b3.aqX()).df().xd() ? 1 : 0);
        boolean bl2 = w2.L(b4).df() == block || w2.L(b4.aqX()).df() == block;
        boolean bl3 = w2.L(b3).df() == block || w2.L(b3.aqX()).df() == block;
        boolean bl4 = bl2 && !bl3 || n3 > n2;
        b b5 = b2.aqX();
        IBlockState iBlockState = block.xM().a(BlockDoor.aTQ, ao2).a(BlockDoor.aTS, bl4 ? BlockDoor$EnumHingePosition.aTZ : BlockDoor$EnumHingePosition.aTY);
        w2.a(b2, iBlockState.a(BlockDoor.aTU, BlockDoor$EnumDoorHalf.aTW), 2);
        w2.a(b5, iBlockState.a(BlockDoor.aTU, BlockDoor$EnumDoorHalf.aTV), 2);
        w2.c(b2, block);
        w2.c(b5, block);
    }
}

