/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.y;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.t;
import net.minecraft.world.m;
import net.minecraft.world.w;

public class BlockWorkbench$InterfaceCraftingTable
implements m {
    private final w bdz;
    private final b bdA;

    public BlockWorkbench$InterfaceCraftingTable(w w2, b b2) {
        this.bdz = w2;
        this.bdA = b2;
    }

    @Override
    public String xU() {
        return null;
    }

    @Override
    public boolean xV() {
        return false;
    }

    @Override
    public ba xW() {
        return new t(Blocks.cMk.xB() + ".name", new Object[0]);
    }

    @Override
    public net.minecraft.inventory.b a(g g2, a a2) {
        return new y(g2, this.bdz, this.bdA);
    }

    @Override
    public String xX() {
        return "minecraft:crafting_table";
    }
}

