/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.block.Block;
import net.minecraft.util.b;

public class s
implements Comparable<s> {
    private static long dCA;
    private final Block dCB;
    public final b dCC;
    public long dCD;
    public int hH;
    private final long dCE = dCA++;

    public s(b b2, Block block) {
        this.dCC = b2;
        this.dCB = block;
    }

    public boolean equals(Object object) {
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        return this.dCC.equals(s2.dCC) && Block.c(this.dCB, s2.dCB);
    }

    public int hashCode() {
        return this.dCC.hashCode();
    }

    public s G(long l2) {
        this.dCD = l2;
        return this;
    }

    public void ic(int n2) {
        this.hH = n2;
    }

    public int a(s s2) {
        return this.dCD < s2.dCD ? -1 : (this.dCD > s2.dCD ? 1 : (this.hH != s2.hH ? this.hH - s2.hH : (this.dCE < s2.dCE ? -1 : (this.dCE > s2.dCE ? 1 : 0))));
    }

    public String toString() {
        return Block.i(this.dCB) + ": " + String.valueOf(this.dCC) + ", " + this.dCD + ", " + this.hH + ", " + this.dCE;
    }

    public Block df() {
        return this.dCB;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((s)object);
    }
}

