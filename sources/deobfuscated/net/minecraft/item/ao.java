/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.af;
import net.minecraft.item.co;

public class ao
extends af {
    private final Block cVZ;
    private String[] cWa;

    public ao(Block block, boolean bl2) {
        super(block);
        this.cVZ = block;
        if (bl2) {
            this.fW(0);
            this.bM(true);
        }
    }

    @Override
    public int e(co co2, int n2) {
        return this.cVZ.e(this.cVZ.aM(co2.yc()));
    }

    @Override
    public int fV(int n2) {
        return n2;
    }

    public ao j(String[] stringArray) {
        this.cWa = stringArray;
        return this;
    }

    @Override
    public String ao(co co2) {
        if (this.cWa == null) {
            return super.ao(co2);
        }
        int n2 = co2.yc();
        return n2 >= 0 && n2 < this.cWa.length ? super.ao(co2) + "." + this.cWa[n2] : super.ao(co2);
    }
}

