/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.m;
import net.minecraft.entity.item.o;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.b;
import net.minecraft.inventory.h;
import net.minecraft.item.d;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.world.w;

public class n
extends o {
    public n(w w2) {
        super(w2);
    }

    public n(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public void c(ad ad2) {
        super.c(ad2);
        if (this.baU.Si().gw("doEntityDrops")) {
            this.a(d.I(Blocks.cMg), 1, 0.0f);
        }
    }

    @Override
    public int YI() {
        return 27;
    }

    @Override
    public m Wm() {
        return m.cCH;
    }

    @Override
    public IBlockState Wn() {
        return Blocks.cMg.xM().a(BlockChest.aTs, net.minecraft.util.ao.dws);
    }

    @Override
    public int YE() {
        return 8;
    }

    @Override
    public String xX() {
        return "minecraft:chest";
    }

    @Override
    public b a(g g2, a a2) {
        return new h(g2, this, a2);
    }
}

