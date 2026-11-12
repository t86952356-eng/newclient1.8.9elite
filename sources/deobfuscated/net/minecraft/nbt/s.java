/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;
import net.minecraft.util.bt;

public class s
extends h {
    private float cYv;

    s() {
    }

    public s(float f2) {
        this.cYv = f2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeFloat(this.cYv);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(96L);
        this.cYv = dataInput.readFloat();
    }

    @Override
    public byte aeF() {
        return 5;
    }

    @Override
    public String toString() {
        return this.cYv + "f";
    }

    @Override
    public g aeG() {
        return new s(this.cYv);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            s s2 = (s)object;
            return this.cYv == s2.cYv;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.cYv);
    }

    @Override
    public long aeJ() {
        return (long)this.cYv;
    }

    @Override
    public int aeK() {
        return bt.bL(this.cYv);
    }

    @Override
    public short aeL() {
        return (short)(bt.bL(this.cYv) & 0xFFFF);
    }

    @Override
    public byte aeM() {
        return (byte)(bt.bL(this.cYv) & 0xFF);
    }

    @Override
    public double aeN() {
        return this.cYv;
    }

    @Override
    public float aeO() {
        return this.cYv;
    }
}

