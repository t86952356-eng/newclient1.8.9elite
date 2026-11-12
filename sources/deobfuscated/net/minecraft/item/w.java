/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.bt;

public class w
extends bt {
    public w(Block block) {
        super(block, block, new String[]{"intact", "slightlyDamaged", "veryDamaged"});
    }

    @Override
    public int fV(int n2) {
        return n2 << 2;
    }
}

