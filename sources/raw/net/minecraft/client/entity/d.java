/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.entity;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class d
extends Record {
    private final boolean bkE;
    private final boolean bkF;
    private final boolean bkG;
    private final boolean bkH;
    private final boolean bkI;
    private final boolean bkJ;
    private final boolean bkK;

    public d(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        this.bkE = bl2;
        this.bkF = bl3;
        this.bkG = bl4;
        this.bkH = bl5;
        this.bkI = bl6;
        this.bkJ = bl7;
        this.bkK = bl8;
    }

    public byte DE() {
        byte by2 = 0;
        if (this.bkE) {
            by2 = (byte)(by2 | 1);
        }
        if (this.bkF) {
            by2 = (byte)(by2 | 2);
        }
        if (this.bkG) {
            by2 = (byte)(by2 | 4);
        }
        if (this.bkH) {
            by2 = (byte)(by2 | 8);
        }
        if (this.bkI) {
            by2 = (byte)(by2 | 0x10);
        }
        if (this.bkJ) {
            by2 = (byte)(by2 | 0x20);
        }
        if (this.bkK) {
            by2 = (byte)(by2 | 0x40);
        }
        return by2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "forward;backward;left;right;jump;sneak;sprint", "bkE", "bkF", "bkG", "bkH", "bkI", "bkJ", "bkK"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "forward;backward;left;right;jump;sneak;sprint", "bkE", "bkF", "bkG", "bkH", "bkI", "bkJ", "bkK"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "forward;backward;left;right;jump;sneak;sprint", "bkE", "bkF", "bkG", "bkH", "bkI", "bkJ", "bkK"}, this, object);
    }

    public boolean DF() {
        return this.bkE;
    }

    public boolean DG() {
        return this.bkF;
    }

    public boolean DH() {
        return this.bkG;
    }

    public boolean DI() {
        return this.bkH;
    }

    public boolean DJ() {
        return this.bkI;
    }

    public boolean DK() {
        return this.bkJ;
    }

    public boolean DL() {
        return this.bkK;
    }
}

