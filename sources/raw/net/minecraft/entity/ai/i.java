/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.r;

public class i
extends e {
    d cxg;
    r cxh;

    public i(d d2) {
        this.cxg = d2;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        r r2 = this.cxg.UW();
        return this.cxg.Zc() > 0 || r2 != null && this.cxg.T((c)r2) < 9.0;
    }

    @Override
    public void WG() {
        this.cxg.UU().aiL();
        this.cxh = this.cxg.UW();
    }

    @Override
    public void WE() {
        this.cxh = null;
    }

    @Override
    public void WF() {
        if (this.cxh == null) {
            this.cxg.fm(-1);
        } else if (this.cxg.T((c)this.cxh) > 49.0) {
            this.cxg.fm(-1);
        } else if (!this.cxg.UV().al(this.cxh)) {
            this.cxg.fm(-1);
        } else {
            this.cxg.fm(1);
        }
    }
}

