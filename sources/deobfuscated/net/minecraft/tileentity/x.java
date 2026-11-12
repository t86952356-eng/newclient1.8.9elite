/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bf;
import net.minecraft.tileentity.d;
import net.minecraft.util.cm;

public class x
extends d {
    private net.minecraft.item.d dsX;
    private int dsY;

    public x() {
    }

    public x(net.minecraft.item.d d2, int n2) {
        this.dsX = d2;
        this.dsY = n2;
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        cm cm2 = net.minecraft.item.d.cVi.y(this.dsX);
        n2.R("Item", cm2 == null ? "" : cm2.toString());
        n2.B("Data", this.dsY);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dsX = n2.C("Item", 8) ? net.minecraft.item.d.et(n2.eK("Item")) : net.minecraft.item.d.fT(n2.eG("Item"));
        this.dsY = n2.eG("Data");
    }

    @Override
    public aj apQ() {
        n n2 = new n();
        this.b(n2);
        n2.eP("Item");
        n2.B("Item", net.minecraft.item.d.p(this.dsX));
        return new bf(this.aZf, 5, n2);
    }

    public void f(net.minecraft.item.d d2, int n2) {
        this.dsX = d2;
        this.dsY = n2;
    }

    public net.minecraft.item.d aqz() {
        return this.dsX;
    }

    public int aqA() {
        return this.dsY;
    }
}

