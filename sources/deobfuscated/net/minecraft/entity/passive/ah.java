/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.passive.ak;
import net.minecraft.entity.player.a;
import net.minecraft.util.ad;
import net.minecraft.world.w;

public abstract class ah
extends p
implements ak {
    public ah(w w2) {
        super(w2);
    }

    @Override
    public boolean Vy() {
        return true;
    }

    @Override
    public boolean UB() {
        return true;
    }

    @Override
    public boolean Vh() {
        return this.baU.a(this.Us(), (c)this);
    }

    @Override
    public int UY() {
        return 120;
    }

    @Override
    protected boolean Vd() {
        return true;
    }

    @Override
    protected int r(a a2) {
        return 1 + this.baU.dDk.nextInt(3);
    }

    @Override
    public void Tu() {
        int n2 = this.Uc();
        super.Tu();
        if (this.TS() && !this.isInWater()) {
            this.ey(--n2);
            if (this.Uc() == -20) {
                this.ey(0);
                this.a(ad.dvg, 2.0f);
            }
        } else {
            this.ey(300);
        }
    }

    @Override
    public boolean Um() {
        return false;
    }
}

