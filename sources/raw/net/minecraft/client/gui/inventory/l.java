/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.j;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.item.co;

class l
extends ak {
    private final ak bwT;

    public l(j j2, ak ak2, int n2) {
        super(ak2.cUj, n2, 0, 0);
        this.bwT = ak2;
    }

    @Override
    public void a(a a2, co co2) {
        this.bwT.a(a2, co2);
    }

    @Override
    public boolean H(co co2) {
        return this.bwT.H(co2);
    }

    @Override
    public co ls() {
        return this.bwT.ls();
    }

    @Override
    public boolean GJ() {
        return this.bwT.GJ();
    }

    @Override
    public void I(co co2) {
        this.bwT.I(co2);
    }

    @Override
    public void GK() {
        this.bwT.GK();
    }

    @Override
    public int GL() {
        return this.bwT.GL();
    }

    @Override
    public int J(co co2) {
        return this.bwT.J(co2);
    }

    @Override
    public String GM() {
        return this.bwT.GM();
    }

    @Override
    public co cf(int n2) {
        return this.bwT.cf(n2);
    }

    @Override
    public boolean a(ab ab2, int n2) {
        return this.bwT.a(ab2, n2);
    }
}

