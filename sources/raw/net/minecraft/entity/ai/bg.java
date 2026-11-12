/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.p;

public class bg {
    private final p cAn;
    protected boolean cuU;

    public bg(p p2) {
        this.cAn = p2;
    }

    public void Xb() {
        this.cuU = true;
    }

    public void Xc() {
        this.cAn.aK(this.cuU);
        this.cuU = false;
    }
}

