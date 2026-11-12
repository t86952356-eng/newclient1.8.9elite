/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class o
implements aj<a> {
    private int dcC;
    private int entityID;

    public o() {
    }

    public o(int n2, int n3) {
        this.dcC = n2;
        this.entityID = n3;
    }

    @Override
    public void a(ak ak2) {
        this.dcC = ak2.afw();
        this.entityID = ak2.afw();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.dcC);
        ak2.gr(this.entityID);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int agA() {
        return this.dcC;
    }

    public int getEntityID() {
        return this.entityID;
    }
}

