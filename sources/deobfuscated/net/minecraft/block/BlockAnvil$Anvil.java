/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.v;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.t;
import net.minecraft.world.m;
import net.minecraft.world.w;

public class BlockAnvil$Anvil
implements m {
    private final w aST;
    private final b aSU;

    public BlockAnvil$Anvil(w w2, b b2) {
        this.aST = w2;
        this.aSU = b2;
    }

    @Override
    public String xU() {
        return "anvil";
    }

    @Override
    public boolean xV() {
        return false;
    }

    @Override
    public ba xW() {
        return new t(Blocks.cOh.xB() + ".name", new Object[0]);
    }

    @Override
    public net.minecraft.inventory.b a(g g2, a a2) {
        return new v(g2, this.aST, this.aSU, a2);
    }

    @Override
    public String xX() {
        return "minecraft:anvil";
    }
}

