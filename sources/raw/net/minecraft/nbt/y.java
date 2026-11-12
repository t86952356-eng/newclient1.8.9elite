/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;

public class y
extends h {
    private short cYD;

    public y() {
    }

    public y(short s2) {
        this.cYD = s2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.cYD);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(80L);
        this.cYD = dataInput.readShort();
    }

    @Override
    public byte aeF() {
        return 2;
    }

    @Override
    public String toString() {
        return this.cYD + "s";
    }

    @Override
    public g aeG() {
        return new y(this.cYD);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            y y2 = (y)object;
            return this.cYD == y2.cYD;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYD;
    }

    @Override
    public long aeJ() {
        return this.cYD;
    }

    @Override
    public int aeK() {
        return this.cYD;
    }

    @Override
    public short aeL() {
        return this.cYD;
    }

    @Override
    public byte aeM() {
        return (byte)(this.cYD & 0xFF);
    }

    @Override
    public double aeN() {
        return this.cYD;
    }

    @Override
    public float aeO() {
        return this.cYD;
    }
}

