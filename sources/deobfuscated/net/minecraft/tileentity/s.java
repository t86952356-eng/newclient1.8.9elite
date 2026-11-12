/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.Random;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.b;
import net.minecraft.inventory.i;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.aa;

public class s
extends aa
implements ab {
    private static final Random dsL = new Random();
    private co[] dsM = new co[9];
    protected String coX;

    @Override
    public int YI() {
        return 9;
    }

    @Override
    public co fi(int n2) {
        return this.dsM[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.dsM[n2] != null) {
            if (this.dsM[n2].cWZ <= n3) {
                co co2 = this.dsM[n2];
                this.dsM[n2] = null;
                this.Lw();
                return co2;
            }
            co co3 = this.dsM[n2].ge(n3);
            if (this.dsM[n2].cWZ == 0) {
                this.dsM[n2] = null;
            }
            this.Lw();
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.dsM[n2] != null) {
            co co2 = this.dsM[n2];
            this.dsM[n2] = null;
            return co2;
        }
        return null;
    }

    public int aqw() {
        int n2 = -1;
        int n3 = 1;
        for (int i2 = 0; i2 < this.dsM.length; ++i2) {
            if (this.dsM[i2] == null || dsL.nextInt(n3++) != 0) continue;
            n2 = i2;
        }
        return n2;
    }

    @Override
    public void g(int n2, co co2) {
        this.dsM[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
        this.Lw();
    }

    public int aU(co co2) {
        for (int i2 = 0; i2 < this.dsM.length; ++i2) {
            if (this.dsM[i2] != null && this.dsM[i2].bP() != null) continue;
            this.g(i2, co2);
            return i2;
        }
        return -1;
    }

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.dispenser";
    }

    public void es(String string) {
        this.coX = string;
    }

    @Override
    public boolean xV() {
        return this.coX != null;
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        v v2 = n2.D("Items", 10);
        this.dsM = new co[this.YI()];
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            int n4 = n3.eE("Slot") & 0xFF;
            if (n4 < 0 || n4 >= this.dsM.length) continue;
            this.dsM[n4] = co.s(n3);
        }
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        v v2 = new v();
        for (int i2 = 0; i2 < this.dsM.length; ++i2) {
            if (this.dsM[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.dsM[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
        if (this.xV()) {
            n2.R("CustomName", this.coX);
        }
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public boolean v(a a2) {
        return this.baU.K(this.aZf) == this && a2.M((double)this.aZf.wt() + 0.5, (double)this.aZf.wu() + 0.5, (double)this.aZf.wx() + 0.5) <= 64.0;
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
    public String xX() {
        return "minecraft:dispenser";
    }

    @Override
    public b a(g g2, a a2) {
        return new i(g2, this);
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
        for (int i2 = 0; i2 < this.dsM.length; ++i2) {
            this.dsM[i2] = null;
        }
    }
}

