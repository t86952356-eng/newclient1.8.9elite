/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.bf;
import net.minecraft.client.gui.ck;

public class bh
extends bf {
    private final ck bqK;
    private final float bqL;
    private final float bqM;
    private final float bqN;

    public bh(int n2, String string, boolean bl2, ck ck2, float f2, float f3, float f4) {
        super(n2, string, bl2);
        this.bqK = ck2;
        this.bqL = f2;
        this.bqM = f3;
        this.bqN = f4;
    }

    public ck Fu() {
        return this.bqK;
    }

    public float Fv() {
        return this.bqL;
    }

    public float Fw() {
        return this.bqM;
    }

    public float Fx() {
        return this.bqN;
    }
}

