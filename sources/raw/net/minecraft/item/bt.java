/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.item.af;
import net.minecraft.item.bu;
import net.minecraft.item.co;

public class bt
extends af {
    protected final Block cWH;
    protected final Function<co, String> cWI;

    public bt(Block block, Block block2, Function<co, String> function) {
        super(block);
        this.cWH = block2;
        this.cWI = function;
        this.fW(0);
        this.bM(true);
    }

    public bt(Block block, Block block2, String[] stringArray) {
        this(block, block2, new bu(stringArray));
    }

    @Override
    public int fV(int n2) {
        return n2;
    }

    @Override
    public String ao(co co2) {
        return super.xB() + "." + (String)this.cWI.apply((Object)co2);
    }
}

