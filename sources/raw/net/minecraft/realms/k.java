/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.d;
import net.minecraft.client.gui.cq;

public class k {
    private final cq diU;

    public k(int n2, int n3, int n4, int n5, int n6) {
        this.diU = new cq(n2, d.AZ().fontRendererObj, n3, n4, n5, n6);
    }

    public String SN() {
        return this.diU.getText();
    }

    public void tick() {
        this.diU.Gb();
    }

    public void bY(boolean bl2) {
        this.diU.ag(bl2);
    }

    public void cp(String string) {
        this.diU.bX(string);
    }

    public void keyPressed(char c2, int n2) {
        this.diU.f(c2, n2);
    }

    public boolean Gj() {
        return this.diU.Gj();
    }

    public void mouseClicked(int n2, int n3, int n4) {
        this.diU.mouseClicked(n2, n3, n4);
    }

    public void cj() {
        this.diU.Gf();
    }

    public void at(int n2) {
        this.diU.bV(n2);
    }

    public void bZ(boolean bl2) {
        this.diU.setEnabled(bl2);
    }
}

