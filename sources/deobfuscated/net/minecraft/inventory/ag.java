/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.entity.player.a;
import net.minecraft.inventory.ad;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.w;

public class ag
extends ad {
    private w cTY;

    public ag() {
        super("container.enderchest", false, 27);
    }

    public void a(w w2) {
        this.cTY = w2;
    }

    public void c(v v2) {
        int n2;
        for (n2 = 0; n2 < this.YI(); ++n2) {
            this.g(n2, null);
        }
        for (n2 = 0; n2 < v2.aeS(); ++n2) {
            n n3 = v2.gi(n2);
            int n4 = n3.eE("Slot") & 0xFF;
            if (n4 < 0 || n4 >= this.YI()) continue;
            this.g(n4, co.s(n3));
        }
    }

    public v adk() {
        v v2 = new v();
        for (int i2 = 0; i2 < this.YI(); ++i2) {
            co co2 = this.fi(i2);
            if (co2 == null) continue;
            n n2 = new n();
            n2.a("Slot", (byte)i2);
            co2.t(n2);
            v2.a(n2);
        }
        return v2;
    }

    @Override
    public boolean v(a a2) {
        return (this.cTY == null || this.cTY.I(a2)) && super.v(a2);
    }

    @Override
    public void w(a a2) {
        if (this.cTY != null) {
            this.cTY.aqx();
        }
        super.w(a2);
    }

    @Override
    public void x(a a2) {
        if (this.cTY != null) {
            this.cTY.aqy();
        }
        super.x(a2);
        this.cTY = null;
    }
}

