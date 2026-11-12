/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.player.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.util.ba;
import net.minecraft.world.m;

public class b
implements m {
    private final String bHj;
    private final ba bHk;

    public b(String string, ba ba2) {
        this.bHj = string;
        this.bHk = ba2;
    }

    @Override
    public net.minecraft.inventory.b a(g g2, a a2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String xU() {
        return this.bHk.arq();
    }

    @Override
    public boolean xV() {
        return true;
    }

    @Override
    public String xX() {
        return this.bHj;
    }

    @Override
    public ba xW() {
        return this.bHk;
    }
}

