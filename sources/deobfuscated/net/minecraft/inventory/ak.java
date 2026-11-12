/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;

public class ak {
    private final int cUi;
    public final ab cUj;
    public int cUk;
    public int cUl;
    public int cUm;

    public ak(ab ab2, int n2, int n3, int n4) {
        this.cUj = ab2;
        this.cUi = n2;
        this.cUl = n3;
        this.cUm = n4;
    }

    public void a(co co2, co co3) {
        int n2;
        if (co2 != null && co3 != null && co2.bP() == co3.bP() && (n2 = co3.cWZ - co2.cWZ) > 0) {
            this.d(co2, n2);
        }
    }

    protected void d(co co2, int n2) {
    }

    protected void al(co co2) {
    }

    public void a(a a2, co co2) {
        this.GK();
    }

    public boolean H(co co2) {
        return true;
    }

    public co ls() {
        return this.cUj.fi(this.cUi);
    }

    public boolean GJ() {
        return this.ls() != null;
    }

    public void I(co co2) {
        this.cUj.g(this.cUi, co2);
        this.GK();
    }

    public void GK() {
        this.cUj.Lw();
    }

    public int GL() {
        return this.cUj.YJ();
    }

    public int J(co co2) {
        return this.GL();
    }

    public String GM() {
        return null;
    }

    public co cf(int n2) {
        return this.cUj.ap(this.cUi, n2);
    }

    public boolean a(ab ab2, int n2) {
        return ab2 == this.cUj && n2 == this.cUi;
    }

    public boolean G(a a2) {
        return true;
    }

    public boolean adh() {
        return true;
    }
}

