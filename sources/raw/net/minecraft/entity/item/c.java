/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class c
extends net.minecraft.entity.c {
    public int cCe;
    public int cCf;

    public c(w w2) {
        super(w2);
        this.crz = true;
        this.o(2.0f, 2.0f);
        this.cCf = 5;
        this.cCe = this.ta.nextInt(100000);
    }

    public c(w w2, double d2, double d3, double d4) {
        this(w2);
        this.setPosition(d2, d3, d4);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected void IA() {
        this.csD.a(8, this.cCf);
    }

    @Override
    public void Dm() {
        this.crF = this.gW;
        this.crG = this.gX;
        this.crH = this.gY;
        ++this.cCe;
        this.csD.b(8, this.cCf);
        int n2 = bt.aF(this.gW);
        int n3 = bt.aF(this.gX);
        int n4 = bt.aF(this.gY);
        if (this.baU.dDl instanceof net.minecraft.world.ad && this.baU.L(new b(n2, n3, n4)).df() != Blocks.cMd) {
            this.baU.d(new b(n2, n3, n4), Blocks.cMd.xM());
        }
    }

    @Override
    protected void d(n n2) {
    }

    @Override
    protected void e(n n2) {
    }

    @Override
    public boolean TO() {
        return true;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (!this.csb && !this.baU.dDw) {
            this.cCf = 0;
            if (this.cCf <= 0) {
                this.Tt();
                if (!this.baU.dDw) {
                    this.baU.a(null, this.gW, this.gX, this.gY, 6.0f, true);
                }
            }
        }
        return true;
    }
}

