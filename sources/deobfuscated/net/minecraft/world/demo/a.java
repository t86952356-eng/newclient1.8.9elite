/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.demo;

import net.minecraft.item.co;
import net.minecraft.network.play.server.av;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.t;
import net.minecraft.world.w;

public class a
extends ItemInWorldManager {
    private boolean dJZ;
    private boolean dKa;
    private int dKb;
    private int dKc;

    public a(w w2) {
        super(w2);
    }

    @Override
    public void ami() {
        super.ami();
        ++this.dKc;
        long l2 = this.cxM.getTotalWorldTime();
        long l3 = l2 / 24000L + 1L;
        if (!this.dJZ && this.dKc > 20) {
            this.dJZ = true;
            this.dlK.cIX.B(new av(5, 0.0f));
        }
        boolean bl2 = this.dKa = l2 > 120500L;
        if (this.dKa) {
            ++this.dKb;
        }
        if (l2 % 24000L == 500L) {
            if (l3 <= 6L) {
                this.dlK.a(new t("demo.day." + l3, new Object[0]));
            }
        } else if (l3 == 1L) {
            if (l2 == 100L) {
                this.dlK.cIX.B(new av(5, 101.0f));
            } else if (l2 == 175L) {
                this.dlK.cIX.B(new av(5, 102.0f));
            } else if (l2 == 250L) {
                this.dlK.cIX.B(new av(5, 103.0f));
            }
        } else if (l3 == 5L && l2 % 24000L == 22000L) {
            this.dlK.a(new t("demo.day.warning", new Object[0]));
        }
    }

    private void aye() {
        if (this.dKb > 100) {
            this.dlK.a(new t("demo.reminder", new Object[0]));
            this.dKb = 0;
        }
    }

    @Override
    public void h(b b2, ao ao2) {
        if (this.dKa) {
            this.aye();
        } else {
            super.h(b2, ao2);
        }
    }

    @Override
    public void am(b b2) {
        if (!this.dKa) {
            super.am(b2);
        }
    }

    @Override
    public boolean ao(b b2) {
        return !this.dKa && super.ao(b2);
    }

    @Override
    public boolean b(net.minecraft.entity.player.a a2, w w2, co co2) {
        if (this.dKa) {
            this.aye();
            return false;
        }
        return super.b(a2, w2, co2);
    }

    @Override
    public boolean a(net.minecraft.entity.player.a a2, w w2, co co2, b b2, ao ao2, float f2, float f3, float f4) {
        if (this.dKa) {
            this.aye();
            return false;
        }
        return super.a(a2, w2, co2, b2, ao2, f2, f3, f4);
    }
}

