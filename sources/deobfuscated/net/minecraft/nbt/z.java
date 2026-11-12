/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;

public class z
extends g {
    private String cYE;

    public z() {
        this.cYE = "";
    }

    public z(String string) {
        this.cYE = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.cYE);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(288L);
        this.cYE = dataInput.readUTF();
        j2.v(16 * this.cYE.length());
    }

    @Override
    public byte aeF() {
        return 8;
    }

    @Override
    public String toString() {
        return "\"" + this.cYE.replace("\"", "\\\"") + "\"";
    }

    @Override
    public g aeG() {
        return new z(this.cYE);
    }

    @Override
    public boolean aeH() {
        return this.cYE.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        z z2 = (z)object;
        return this.cYE == null && z2.cYE == null || this.cYE != null && this.cYE.equals(z2.cYE);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYE.hashCode();
    }

    @Override
    public String aeI() {
        return this.cYE;
    }
}

