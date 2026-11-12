/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.af;
import net.minecraft.item.b;
import net.minecraft.item.co;

public class am
extends af {
    public am(Block block) {
        super(block);
        this.fW(0);
        this.bM(true);
    }

    @Override
    public int fV(int n2) {
        return n2;
    }

    @Override
    public String ao(co co2) {
        return super.xB() + "." + b.fS(co2.yc()).xB();
    }
}

