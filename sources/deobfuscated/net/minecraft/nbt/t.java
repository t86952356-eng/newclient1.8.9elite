/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;

public class t
extends h {
    private int cYw;

    t() {
    }

    public t(int n2) {
        this.cYw = n2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.cYw);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(96L);
        this.cYw = dataInput.readInt();
    }

    @Override
    public byte aeF() {
        return 3;
    }

    @Override
    public String toString() {
        return "" + this.cYw;
    }

    @Override
    public g aeG() {
        return new t(this.cYw);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            t t2 = (t)object;
            return this.cYw == t2.cYw;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYw;
    }

    @Override
    public long aeJ() {
        return this.cYw;
    }

    @Override
    public int aeK() {
        return this.cYw;
    }

    @Override
    public short aeL() {
        return (short)(this.cYw & 0xFFFF);
    }

    @Override
    public byte aeM() {
        return (byte)(this.cYw & 0xFF);
    }

    @Override
    public double aeN() {
        return this.cYw;
    }

    @Override
    public float aeO() {
        return this.cYw;
    }
}

