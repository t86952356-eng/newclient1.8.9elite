/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import net.minecraft.nbt.k;

public class j {
    public static final j cYm = new k(0L);
    private final long cYn;
    private long cYo;

    public j(long l2) {
        this.cYn = l2;
    }

    public void v(long l2) {
        this.cYo += l2 / 8L;
        if (this.cYo > this.cYn) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.cYo + "bytes where max allowed: " + this.cYn);
        }
    }
}

