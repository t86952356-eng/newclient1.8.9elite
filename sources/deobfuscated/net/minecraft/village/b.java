/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.village;

import java.util.ArrayList;
import net.minecraft.item.co;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.network.ak;
import net.minecraft.village.a;

public class b
extends ArrayList<a> {
    public b() {
    }

    public b(n n2) {
        this.H(n2);
    }

    public a a(co co2, co co3, int n2) {
        if (n2 > 0 && n2 < this.size()) {
            a a2 = (a)this.get(n2);
            return !this.h(co2, a2.atY()) || (co3 != null || a2.aua()) && (!a2.aua() || !this.h(co3, a2.atZ())) || co2.cWZ < a2.atY().cWZ || a2.aua() && co3.cWZ < a2.atZ().cWZ ? null : a2;
        }
        for (int i2 = 0; i2 < this.size(); ++i2) {
            a a3 = (a)this.get(i2);
            if (!this.h(co2, a3.atY()) || co2.cWZ < a3.atY().cWZ || (a3.aua() || co3 != null) && (!a3.aua() || !this.h(co3, a3.atZ()) || co3.cWZ < a3.atZ().cWZ)) continue;
            return a3;
        }
        return null;
    }

    private boolean h(co co2, co co3) {
        return co.e(co2, co3) && (!co3.aej() || co2.aej() && aa.a(co3.aek(), co2.aek(), false));
    }

    public void f(ak ak2) {
        ak2.writeByte((byte)(this.size() & 0xFF));
        for (int i2 = 0; i2 < this.size(); ++i2) {
            a a2 = (a)this.get(i2);
            ak2.aO(a2.atY());
            ak2.aO(a2.aub());
            co co2 = a2.atZ();
            ak2.writeBoolean(co2 != null);
            if (co2 != null) {
                ak2.aO(co2);
            }
            ak2.writeBoolean(a2.auf());
            ak2.writeInt(a2.auc());
            ak2.writeInt(a2.aud());
        }
    }

    public static b g(ak ak2) {
        b b2 = new b();
        int n2 = ak2.readByte() & 0xFF;
        for (int i2 = 0; i2 < n2; ++i2) {
            co co2 = ak2.afA();
            co co3 = ak2.afA();
            co co4 = null;
            if (ak2.readBoolean()) {
                co4 = ak2.afA();
            }
            boolean bl2 = ak2.readBoolean();
            int n3 = ak2.readInt();
            int n4 = ak2.readInt();
            a a2 = new a(co2, co4, co3, n3, n4);
            if (bl2) {
                a2.aug();
            }
            b2.add(a2);
        }
        return b2;
    }

    public void H(n n2) {
        v v2 = n2.D("Recipes", 10);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            this.add(new a(n3));
        }
    }

    public n auj() {
        n n2 = new n();
        v v2 = new v();
        for (int i2 = 0; i2 < this.size(); ++i2) {
            a a2 = (a)this.get(i2);
            v2.a(a2.aui());
        }
        n2.b("Recipes", v2);
        return n2;
    }
}

