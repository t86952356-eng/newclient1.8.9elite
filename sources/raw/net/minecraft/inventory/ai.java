/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.b;
import net.minecraft.inventory.h;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.n;
import net.minecraft.world.q;

public class ai
implements n {
    private final String cUa;
    private final n cUb;
    private final n cUc;

    public ai(String string, n n2, n n3) {
        this.cUa = string;
        if (n2 == null) {
            n2 = n3;
        }
        if (n3 == null) {
            n3 = n2;
        }
        this.cUb = n2;
        this.cUc = n3;
        if (n2.IH()) {
            n3.a(n2.II());
        } else if (n3.IH()) {
            n2.a(n3.II());
        }
    }

    @Override
    public int YI() {
        return this.cUb.YI() + this.cUc.YI();
    }

    public boolean d(ab ab2) {
        return this.cUb == ab2 || this.cUc == ab2;
    }

    @Override
    public String xU() {
        return this.cUb.xV() ? this.cUb.xU() : (this.cUc.xV() ? this.cUc.xU() : this.cUa);
    }

    @Override
    public boolean xV() {
        return this.cUb.xV() || this.cUc.xV();
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public co fi(int n2) {
        return n2 >= this.cUb.YI() ? this.cUc.fi(n2 - this.cUb.YI()) : this.cUb.fi(n2);
    }

    @Override
    public co ap(int n2, int n3) {
        return n2 >= this.cUb.YI() ? this.cUc.ap(n2 - this.cUb.YI(), n3) : this.cUb.ap(n2, n3);
    }

    @Override
    public co fj(int n2) {
        return n2 >= this.cUb.YI() ? this.cUc.fj(n2 - this.cUb.YI()) : this.cUb.fj(n2);
    }

    @Override
    public void g(int n2, co co2) {
        if (n2 >= this.cUb.YI()) {
            this.cUc.g(n2 - this.cUb.YI(), co2);
        } else {
            this.cUb.g(n2, co2);
        }
    }

    @Override
    public int YJ() {
        return this.cUb.YJ();
    }

    @Override
    public void Lw() {
        this.cUb.Lw();
        this.cUc.Lw();
    }

    @Override
    public boolean v(a a2) {
        return this.cUb.v(a2) && this.cUc.v(a2);
    }

    @Override
    public void w(a a2) {
        this.cUb.w(a2);
        this.cUc.w(a2);
    }

    @Override
    public void x(a a2) {
        this.cUb.x(a2);
        this.cUc.x(a2);
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    @Override
    public int cx(int n2) {
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
    }

    @Override
    public int IG() {
        return 0;
    }

    @Override
    public boolean IH() {
        return this.cUb.IH() || this.cUc.IH();
    }

    @Override
    public void a(q q2) {
        this.cUb.a(q2);
        this.cUc.a(q2);
    }

    @Override
    public q II() {
        return this.cUb.II();
    }

    @Override
    public String xX() {
        return this.cUb.xX();
    }

    @Override
    public b a(g g2, a a2) {
        return new h(g2, this, a2);
    }

    @Override
    public void clear() {
        this.cUb.clear();
        this.cUc.clear();
    }
}

