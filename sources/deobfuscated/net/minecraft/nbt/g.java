/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.nbt.j;
import net.minecraft.nbt.l;
import net.minecraft.nbt.m;
import net.minecraft.nbt.n;
import net.minecraft.nbt.q;
import net.minecraft.nbt.r;
import net.minecraft.nbt.s;
import net.minecraft.nbt.t;
import net.minecraft.nbt.u;
import net.minecraft.nbt.v;
import net.minecraft.nbt.w;
import net.minecraft.nbt.x;
import net.minecraft.nbt.y;
import net.minecraft.nbt.z;

public abstract class g {
    public static final String[] cXY = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]", "LONG[]"};
    public static final int cXZ = 0;
    public static final int cYa = 1;
    public static final int cYb = 2;
    public static final int cYc = 3;
    public static final int cYd = 4;
    public static final int cYe = 5;
    public static final int cYf = 6;
    public static final int cYg = 7;
    public static final int cYh = 8;
    public static final int cYi = 9;
    public static final int cYj = 10;
    public static final int cYk = 11;
    public static final int cYl = 12;

    abstract void a(DataOutput var1);

    abstract void b(DataInput var1, int var2, j var3);

    public abstract String toString();

    public abstract byte aeF();

    protected static g b(byte by2) {
        switch (by2) {
            case 0: {
                return new r();
            }
            case 1: {
                return new l();
            }
            case 2: {
                return new y();
            }
            case 3: {
                return new t();
            }
            case 4: {
                return new w();
            }
            case 5: {
                return new s();
            }
            case 6: {
                return new q();
            }
            case 7: {
                return new m();
            }
            case 8: {
                return new z();
            }
            case 9: {
                return new v();
            }
            case 10: {
                return new n();
            }
            case 11: {
                return new u();
            }
            case 12: {
                return new x();
            }
        }
        return null;
    }

    public abstract g aeG();

    public boolean aeH() {
        return false;
    }

    public boolean equals(Object object) {
        return object instanceof g && this.aeF() == ((g)object).aeF();
    }

    public int hashCode() {
        return this.aeF();
    }

    protected String aeI() {
        return this.toString();
    }
}

