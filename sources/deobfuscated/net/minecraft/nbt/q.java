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

public class q
extends h {
    private double cYu;

    q() {
    }

    public q(double d2) {
        this.cYu = d2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeDouble(this.cYu);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(128L);
        this.cYu = dataInput.readDouble();
    }

    @Override
    public byte aeF() {
        return 6;
    }

    @Override
    public String toString() {
        return this.cYu + "d";
    }

    @Override
    public g aeG() {
        return new q(this.cYu);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            q q2 = (q)object;
            return this.cYu == q2.cYu;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.cYu);
        return super.hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public long aeJ() {
        return (long)Math.floor(this.cYu);
    }

    @Override
    public int aeK() {
        return bt.aF(this.cYu);
    }

    @Override
    public short aeL() {
        return (short)(bt.aF(this.cYu) & 0xFFFF);
    }

    @Override
    public byte aeM() {
        return (byte)(bt.aF(this.cYu) & 0xFF);
    }

    @Override
    public double aeN() {
        return this.cYu;
    }

    @Override
    public float aeO() {
        return (float)this.cYu;
    }
}

