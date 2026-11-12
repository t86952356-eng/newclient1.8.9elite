/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;

public class u
extends g {
    private int[] cYx;

    u() {
    }

    public u(int[] nArray) {
        this.cYx = nArray;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.cYx.length);
        for (int i2 = 0; i2 < this.cYx.length; ++i2) {
            dataOutput.writeInt(this.cYx[i2]);
        }
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(192L);
        int n3 = dataInput.readInt();
        j2.v(32 * n3);
        this.cYx = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.cYx[i2] = dataInput.readInt();
        }
    }

    @Override
    public byte aeF() {
        return 11;
    }

    @Override
    public String toString() {
        Object object = "[";
        for (int n2 : this.cYx) {
            object = (String)object + n2 + ",";
        }
        return (String)object + "]";
    }

    @Override
    public g aeG() {
        int[] nArray = new int[this.cYx.length];
        System.arraycopy(this.cYx, 0, nArray, 0, this.cYx.length);
        return new u(nArray);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && Arrays.equals(this.cYx, ((u)object).cYx);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.cYx);
    }

    public int[] aeR() {
        return this.cYx;
    }
}

