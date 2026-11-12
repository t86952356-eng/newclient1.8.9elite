/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;

public class l
extends h {
    private byte cYp;

    l() {
    }

    public l(byte by2) {
        this.cYp = by2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeByte(this.cYp);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(72L);
        this.cYp = dataInput.readByte();
    }

    @Override
    public byte aeF() {
        return 1;
    }

    @Override
    public String toString() {
        return this.cYp + "b";
    }

    @Override
    public g aeG() {
        return new l(this.cYp);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            l l2 = (l)object;
            return this.cYp == l2.cYp;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYp;
    }

    @Override
    public long aeJ() {
        return this.cYp;
    }

    @Override
    public int aeK() {
        return this.cYp;
    }

    @Override
    public short aeL() {
        return this.cYp;
    }

    @Override
    public byte aeM() {
        return this.cYp;
    }

    @Override
    public double aeN() {
        return this.cYp;
    }

    @Override
    public float aeO() {
        return this.cYp;
    }
}

