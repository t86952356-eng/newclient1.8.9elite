/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class l
implements aj<a> {
    private int dcv;
    private b dcw;

    public l() {
    }

    public l(net.minecraft.entity.player.a a2, b b2) {
        this.dcv = a2.getEntityId();
        this.dcw = b2;
    }

    @Override
    public void a(ak ak2) {
        this.dcv = ak2.afw();
        this.dcw = ak2.afu();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dcv);
        ak2.ak(this.dcw);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public net.minecraft.entity.player.a k(w w2) {
        return (net.minecraft.entity.player.a)w2.cn(this.dcv);
    }

    public b agu() {
        return this.dcw;
    }
}

