/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.o;

public class n
implements aj<b> {
    private int dbm;
    private o dbn;
    private int auxData;

    public n() {
    }

    public n(c c2, o o2) {
        this(c2, o2, 0);
    }

    public n(c c2, o o2, int n2) {
        this.dbm = c2.getEntityId();
        this.dbn = o2;
        this.auxData = n2;
    }

    @Override
    public void a(ak ak2) {
        this.dbm = ak2.afw();
        this.dbn = ak2.k(o.class);
        this.auxData = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dbm);
        ak2.b(this.dbn);
        ak2.gr(this.auxData);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public o agb() {
        return this.dbn;
    }

    public int getAuxData() {
        return this.auxData;
    }
}

