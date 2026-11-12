/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.List;
import net.minecraft.entity.b;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ad
implements aj<a> {
    private int crw;
    private List<b> ddc;

    public ad() {
    }

    public ad(int n2, net.minecraft.entity.a a2, boolean bl2) {
        this.crw = n2;
        this.ddc = bl2 ? a2.Ti() : a2.Th();
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.ddc = net.minecraft.entity.a.d(ak2);
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        net.minecraft.entity.a.a(this.ddc, ak2);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public List<b> agX() {
        return this.ddc;
    }

    public int getEntityId() {
        return this.crw;
    }
}

