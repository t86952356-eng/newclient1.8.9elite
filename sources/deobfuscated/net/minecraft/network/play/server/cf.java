/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.c;
import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.world.w;

public class cf
implements aj<a> {
    private int crw;
    private n dfN;

    public cf() {
    }

    public cf(int n2, n n3) {
        this.crw = n2;
        this.dfN = n3;
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.dfN = ak2.afz();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.y(this.dfN);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public n aek() {
        return this.dfN;
    }

    public c l(w w2) {
        return w2.cn(this.crw);
    }
}

