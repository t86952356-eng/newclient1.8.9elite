/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.util.b;

public class BlockEventData {
    private final b aUxx;
    private final Block aUy;
    private final int aUz;
    private final int aUA;

    public BlockEventData(b b2, Block block, int n2, int n3) {
        this.aUxx = b2;
        this.aUz = n2;
        this.aUA = n3;
        this.aUy = block;
    }

    public b yl() {
        return this.aUxx;
    }

    public int yn() {
        return this.aUz;
    }

    public int yo() {
        return this.aUA;
    }

    public Block df() {
        return this.aUy;
    }

    public boolean equals(Object object) {
        if (!(object instanceof BlockEventData)) {
            return false;
        }
        BlockEventData blockEventData = (BlockEventData)object;
        return this.aUxx.equals(blockEventData.aUxx) && this.aUz == blockEventData.aUz && this.aUA == blockEventData.aUA && this.aUy == blockEventData.aUy;
    }

    public String toString() {
        return "TE(" + String.valueOf(this.aUxx) + ")," + this.aUz + "," + this.aUA + "," + String.valueOf(this.aUy);
    }
}

