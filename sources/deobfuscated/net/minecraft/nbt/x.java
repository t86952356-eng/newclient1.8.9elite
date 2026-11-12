/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import java.util.List;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;

public class x
extends g {
    private long[] cYC;

    public x() {
    }

    public x(long[] lArray) {
        this.cYC = lArray;
    }

    public x(List<Long> list) {
        this(x.G(list));
    }

    private static long[] G(List<Long> list) {
        long[] lArray = new long[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Long l2 = list.get(i2);
            lArray[i2] = l2 == null ? 0L : l2;
        }
        return lArray;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.cYC.length);
        for (long l2 : this.cYC) {
            dataOutput.writeLong(l2);
        }
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(192L);
        int n3 = dataInput.readInt();
        j2.v(64 * n3);
        this.cYC = new long[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.cYC[i2] = dataInput.readLong();
        }
    }

    @Override
    public byte aeF() {
        return 12;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[L;");
        for (int i2 = 0; i2 < this.cYC.length; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.cYC[i2]).append('L');
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public g aeG() {
        long[] lArray = new long[this.cYC.length];
        System.arraycopy(this.cYC, 0, lArray, 0, this.cYC.length);
        return new x(lArray);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && Arrays.equals(this.cYC, ((x)object).cYC);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.cYC);
    }

    public long[] aeU() {
        return this.cYC;
    }
}

