/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;

public class r
extends g {
    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(64L);
    }

    @Override
    void a(DataOutput dataOutput) {
    }

    @Override
    public byte aeF() {
        return 0;
    }

    @Override
    public String toString() {
        return "END";
    }

    @Override
    public g aeG() {
        return new r();
    }
}

