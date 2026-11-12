/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockLeaves;
import net.minecraft.item.af;
import net.minecraft.item.co;

public class bm
extends af {
    private final BlockLeaves cWD;

    public bm(BlockLeaves blockLeaves) {
        super(blockLeaves);
        this.cWD = blockLeaves;
        this.fW(0);
        this.bM(true);
    }

    @Override
    public int fV(int n2) {
        return n2 | 4;
    }

    @Override
    public int e(co co2, int n2) {
        return this.cWD.e(this.cWD.aM(co2.yc()));
    }

    @Override
    public String ao(co co2) {
        return super.xB() + "." + this.cWD.aZ(co2.yc()).xB();
    }
}

