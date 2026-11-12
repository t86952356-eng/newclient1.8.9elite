/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.block.BlockFence;
import net.minecraft.entity.c;
import net.minecraft.entity.l;
import net.minecraft.entity.p;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class m
extends l {
    public m(w w2) {
        super(w2);
    }

    public m(w w2, b b2) {
        super(w2, b2);
        this.setPosition((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5);
        float f2 = 0.125f;
        float f3 = 0.1875f;
        float f4 = 0.25f;
        this.n(new net.minecraft.util.a(this.gW - 0.1875, this.gX - 0.25 + 0.125, this.gY - 0.1875, this.gW + 0.1875, this.gX + 0.25 + 0.125, this.gY + 0.1875));
    }

    @Override
    protected void IA() {
        super.IA();
    }

    @Override
    public void t(ao ao2) {
    }

    @Override
    public int UL() {
        return 9;
    }

    @Override
    public int UM() {
        return 9;
    }

    @Override
    public float getEyeHeight() {
        return -0.0625f;
    }

    @Override
    public boolean an(double d2) {
        return d2 < 1024.0;
    }

    @Override
    public void ab(c c2) {
    }

    @Override
    public boolean k(n n2) {
        return false;
    }

    @Override
    public void d(n n2) {
    }

    @Override
    public void e(n n2) {
    }

    @Override
    public boolean o(a a2) {
        double d2;
        co co2 = a2.Vk();
        boolean bl2 = false;
        if (co2 != null && co2.bP() == Items.cSr && !this.baU.dDw) {
            d2 = 7.0;
            for (p p2 : this.baU.a(p.class, new net.minecraft.util.a(this.gW - 7.0, this.gX - 7.0, this.gY - 7.0, this.gW + 7.0, this.gX + 7.0, this.gY + 7.0))) {
                if (!p2.Vq() || p2.Vr() != a2) continue;
                p2.a(this, true);
                bl2 = true;
            }
        }
        if (!this.baU.dDw && !bl2) {
            this.Tt();
            if (a2.cIt.cJM) {
                d2 = 7.0;
                for (p p2 : this.baU.a(p.class, new net.minecraft.util.a(this.gW - 7.0, this.gX - 7.0, this.gY - 7.0, this.gW + 7.0, this.gX + 7.0, this.gY + 7.0))) {
                    if (!p2.Vq() || p2.Vr() != this) continue;
                    p2.h(true, false);
                }
            }
        }
        return true;
    }

    @Override
    public boolean UK() {
        return this.baU.L(this.ctx).df() instanceof BlockFence;
    }

    public static m Z(w w2, b b2) {
        m m2 = new m(w2, b2);
        m2.crD = true;
        w2.G(m2);
        return m2;
    }

    public static m aa(w w2, b b2) {
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        for (m m2 : w2.a(m.class, new net.minecraft.util.a((double)n2 - 1.0, (double)n3 - 1.0, (double)n4 - 1.0, (double)n2 + 1.0, (double)n3 + 1.0, (double)n4 + 1.0))) {
            if (!m2.UN().equals(b2)) continue;
            return m2;
        }
        return null;
    }
}

