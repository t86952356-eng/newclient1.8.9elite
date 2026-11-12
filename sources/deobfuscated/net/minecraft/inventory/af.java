/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.b;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class af
implements ab {
    private final co[] cTU;
    private final int width;
    private final int height;
    private final b cTX;

    public af(b b2, int n2, int n3) {
        int n4 = n2 * n3;
        this.cTU = new co[n4];
        this.cTX = b2;
        this.width = n2;
        this.height = n3;
    }

    @Override
    public int YI() {
        return this.cTU.length;
    }

    @Override
    public co fi(int n2) {
        return n2 >= this.YI() ? null : this.cTU[n2];
    }

    public co as(int n2, int n3) {
        return n2 >= 0 && n2 < this.width && n3 >= 0 && n3 <= this.height ? this.fi(n2 + n3 * this.width) : null;
    }

    @Override
    public String xU() {
        return "container.crafting";
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
    public co fj(int n2) {
        if (this.cTU[n2] != null) {
            co co2 = this.cTU[n2];
            this.cTU[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.cTU[n2] != null) {
            if (this.cTU[n2].cWZ <= n3) {
                co co2 = this.cTU[n2];
                this.cTU[n2] = null;
                this.cTX.b(this);
                return co2;
            }
            co co3 = this.cTU[n2].ge(n3);
            if (this.cTU[n2].cWZ == 0) {
                this.cTU[n2] = null;
            }
            this.cTX.b(this);
            return co3;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.cTU[n2] = co2;
        this.cTX.b(this);
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
        for (int i2 = 0; i2 < this.cTU.length; ++i2) {
            this.cTU[i2] = null;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}

