/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.d;
import net.minecraft.util.da;
import net.minecraft.world.w;

public class c
implements aj<b> {
    private int crw;
    private d daR;
    public da daS;

    public c() {
    }

    public c(net.minecraft.entity.c c2, d d2) {
        this.crw = c2.getEntityId();
        this.daR = d2;
    }

    public c(net.minecraft.entity.c c2, da da2) {
        this(c2, d.daV);
        this.daS = da2;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.daR = ak2.k(d.class);
        if (this.daR == d.daV) {
            this.daS = new da(ak2.readFloat(), ak2.readFloat(), ak2.readFloat());
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.b(this.daR);
        if (this.daR == d.daV) {
            ak2.writeFloat((float)this.daS.dAG);
            ak2.writeFloat((float)this.daS.dAH);
            ak2.writeFloat((float)this.daS.dAI);
        }
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.entity.c j(w w2) {
        return w2.cn(this.crw);
    }

    public d afQ() {
        return this.daR;
    }

    public da kI() {
        return this.daS;
    }
}

