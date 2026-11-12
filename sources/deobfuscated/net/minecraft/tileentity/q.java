/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;

public class q
extends d {
    private int dsK;

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.B("OutputSignal", this.dsK);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dsK = n2.eG("OutputSignal");
    }

    public int aqv() {
        return this.dsK;
    }

    public void hm(int n2) {
        this.dsK = n2;
    }
}

