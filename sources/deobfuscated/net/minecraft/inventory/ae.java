/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class ae
implements ab {
    private final co[] cTT = new co[1];

    @Override
    public int YI() {
        return 1;
    }

    @Override
    public co fi(int n2) {
        return this.cTT[0];
    }

    @Override
    public String xU() {
        return "Result";
    }

    @Override
    public boolean xV() {
        return false;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.cTT[0] != null) {
            co co2 = this.cTT[0];
            this.cTT[0] = null;
            return co2;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.cTT[0] != null) {
            co co2 = this.cTT[0];
            this.cTT[0] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.cTT[0] = co2;
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public void Lw() {
    }

    @Override
    public boolean v(a a2) {
        return true;
    }

    @Override
    public void w(a a2) {
    }

    @Override
    public void x(a a2) {
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
    public void clear() {
        for (int i2 = 0; i2 < this.cTT.length; ++i2) {
            this.cTT[i2] = null;
        }
    }
}

