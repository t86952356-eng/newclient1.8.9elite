/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.w;

public class bx
implements aj<a> {
    public int crw;

    public bx() {
    }

    public bx(c c2) {
        this.crw = c2.getEntityId();
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public c l(w w2) {
        return w2.cn(this.crw);
    }
}

