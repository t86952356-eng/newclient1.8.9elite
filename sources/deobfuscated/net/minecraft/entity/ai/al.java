/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.k;
import net.minecraft.entity.p;

public class al
extends k {
    boolean czd;
    int cze;

    public al(p p2, boolean bl2) {
        super(p2);
        this.cxk = p2;
        this.czd = bl2;
    }

    @Override
    public boolean WD() {
        return this.czd && this.cze > 0 && super.WD();
    }

    @Override
    public void WG() {
        this.cze = 20;
        this.cxm.a(this.cxk.baU, this.cxl, true);
    }

    @Override
    public void WE() {
        if (this.czd) {
            this.cxm.a(this.cxk.baU, this.cxl, false);
        }
    }

    @Override
    public void WF() {
        --this.cze;
        super.WF();
    }
}

