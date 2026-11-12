/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.av;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.r;

public class an
extends av {
    y czi;
    r czj;
    private int czk;

    public an(y y2) {
        super(y2, false);
        this.czi = y2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (!this.czi.abl()) {
            return false;
        }
        r r2 = this.czi.abn();
        if (r2 == null) {
            return false;
        }
        this.czj = r2.VE();
        int n2 = r2.VF();
        return n2 != this.czk && this.a(this.czj, false) && this.czi.b(this.czj, r2);
    }

    @Override
    public void WG() {
        this.czA.S(this.czj);
        r r2 = this.czi.abn();
        if (r2 != null) {
            this.czk = r2.VF();
        }
        super.WG();
    }
}

