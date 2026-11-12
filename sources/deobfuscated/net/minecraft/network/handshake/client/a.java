/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.handshake.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;

public class a
implements aj<net.minecraft.network.handshake.a> {
    private int daI;
    private String dx;
    private int dy;
    private net.minecraft.network.a daJ;

    public a() {
    }

    public a(int n2, String string, int n3, net.minecraft.network.a a2) {
        this.daI = n2;
        this.dx = string;
        this.dy = n3;
        this.daJ = a2;
    }

    @Override
    public void a(ak ak2) {
        this.daI = ak2.afw();
        this.dx = ak2.gs(255);
        this.dy = ak2.readUnsignedShort();
        this.daJ = net.minecraft.network.a.go(ak2.afw());
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.daI);
        ak2.eS(this.dx);
        ak2.writeShort(this.dy);
        ak2.gr(this.daJ.getId());
    }

    @Override
    public void a(net.minecraft.network.handshake.a a2) {
        a2.a(this);
    }

    public net.minecraft.network.a afI() {
        return this.daJ;
    }

    public int afJ() {
        return this.daI;
    }
}

