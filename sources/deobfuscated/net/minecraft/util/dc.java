/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class dc {
    private final byte dAK;
    private final byte dAL;
    private final byte dAM;
    private final byte dAN;

    public dc(byte by2, byte by3, byte by4, byte by5) {
        this.dAK = by2;
        this.dAL = by3;
        this.dAM = by4;
        this.dAN = by5;
    }

    public dc(dc dc2) {
        this.dAK = dc2.dAK;
        this.dAL = dc2.dAL;
        this.dAM = dc2.dAM;
        this.dAN = dc2.dAN;
    }

    public byte atT() {
        return this.dAK;
    }

    public byte atU() {
        return this.dAL;
    }

    public byte atV() {
        return this.dAM;
    }

    public byte atW() {
        return this.dAN;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dc)) {
            return false;
        }
        dc dc2 = (dc)object;
        return this.dAK == dc2.dAK && this.dAN == dc2.dAN && this.dAL == dc2.dAL && this.dAM == dc2.dAM;
    }

    public int hashCode() {
        int n2 = this.dAK;
        n2 = 31 * n2 + this.dAL;
        n2 = 31 * n2 + this.dAM;
        n2 = 31 * n2 + this.dAN;
        return n2;
    }
}

