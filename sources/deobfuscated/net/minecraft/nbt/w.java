/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;

public class w
extends h {
    private long cYB;

    w() {
    }

    public w(long l2) {
        this.cYB = l2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeLong(this.cYB);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(128L);
        this.cYB = dataInput.readLong();
    }

    @Override
    public byte aeF() {
        return 4;
    }

    @Override
    public String toString() {
        return this.cYB + "L";
    }

    @Override
    public g aeG() {
        return new w(this.cYB);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            w w2 = (w)object;
            return this.cYB == w2.cYB;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.cYB ^ this.cYB >>> 32);
    }

    @Override
    public long aeJ() {
        return this.cYB;
    }

    @Override
    public int aeK() {
        return (int)(this.cYB & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short aeL() {
        return (short)(this.cYB & 0xFFFFL);
    }

    @Override
    public byte aeM() {
        return (byte)(this.cYB & 0xFFL);
    }

    @Override
    public double aeN() {
        return this.cYB;
    }

    @Override
    public float aeO() {
        return this.cYB;
    }
}

