/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.av;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.r;

public class am
extends av {
    y czf;
    r czg;
    private int czh;

    public am(y y2) {
        super(y2, false);
        this.czf = y2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        if (!this.czf.abl()) {
            return false;
        }
        r r2 = this.czf.abn();
        if (r2 == null) {
            return false;
        }
        this.czg = r2.VC();
        int n2 = r2.VD();
        return n2 != this.czh && this.a(this.czg, false) && this.czf.b(this.czg, r2);
    }

    @Override
    public void WG() {
        this.czA.S(this.czg);
        r r2 = this.czf.abn();
        if (r2 != null) {
            this.czh = r2.VD();
        }
        super.WG();
    }
}

