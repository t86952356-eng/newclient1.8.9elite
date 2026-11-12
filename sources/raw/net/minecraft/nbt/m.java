/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;

public class m
extends g {
    private byte[] asD;

    m() {
    }

    public m(byte[] byArray) {
        this.asD = byArray;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.asD.length);
        dataOutput.write(this.asD);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(192L);
        int n3 = dataInput.readInt();
        j2.v(8 * n3);
        this.asD = new byte[n3];
        dataInput.readFully(this.asD);
    }

    @Override
    public byte aeF() {
        return 7;
    }

    @Override
    public String toString() {
        return "[" + this.asD.length + " bytes]";
    }

    @Override
    public g aeG() {
        byte[] byArray = new byte[this.asD.length];
        System.arraycopy(this.asD, 0, byArray, 0, this.asD.length);
        return new m(byArray);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && Arrays.equals(this.asD, ((m)object).asD);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.asD);
    }

    public byte[] aeP() {
        return this.asD;
    }
}

