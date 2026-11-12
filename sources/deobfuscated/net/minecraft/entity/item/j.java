/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.item;

import net.minecraft.entity.c;
import net.minecraft.entity.l;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.bo;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.storage.f;
import net.minecraft.world.w;

public class j
extends l {
    private float cCv = 1.0f;

    public j(w w2) {
        super(w2);
    }

    public j(w w2, b b2, ao ao2) {
        super(w2, b2);
        this.t(ao2);
    }

    @Override
    protected void IA() {
        this.Tp().am(8, 5);
        this.Tp().a(9, (byte)0);
    }

    @Override
    public float TX() {
        return 0.0f;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (!ad2.arZ() && this.Yt() != null) {
            if (!this.baU.dDw) {
                this.b(ad2.dk(), false);
                this.ab((co)null);
            }
            return true;
        }
        return super.a(ad2, f2);
    }

    @Override
    public int UL() {
        return 12;
    }

    @Override
    public int UM() {
        return 12;
    }

    @Override
    public boolean an(double d2) {
        double d3 = 16.0;
        return d2 < (d3 = d3 * 64.0 * this.cry) * d3;
    }

    @Override
    public void ab(c c2) {
        this.b(c2, true);
    }

    public void b(c c2, boolean bl2) {
        if (this.baU.Si().gw("doEntityDrops")) {
            co co2 = this.Yt();
            if (c2 instanceof a) {
                a a2 = (a)c2;
                if (a2.cIt.cJM) {
                    this.aa(co2);
                    return;
                }
            }
            if (bl2) {
                this.a(new co(Items.cRT), 0.0f);
            }
            if (co2 != null && this.ta.nextFloat() < this.cCv) {
                co2 = co2.aeg();
                this.aa(co2);
                this.a(co2, 0.0f);
            }
        }
    }

    private void aa(co co2) {
        if (co2 != null) {
            if (co2.bP() == Items.cRh) {
                f f2 = ((bo)co2.bP()).a(co2, this.baU);
                f2.dTo.remove("frame-" + this.getEntityId());
            }
            co2.d(null);
        }
    }

    public co Yt() {
        return this.Tp().eq(8);
    }

    public void ab(co co2) {
        this.c(co2, true);
    }

    private void c(co co2, boolean bl2) {
        if (co2 != null) {
            co2 = co2.aeg();
            co2.cWZ = 1;
            co2.d(this);
        }
        this.Tp().b(8, co2);
        this.Tp().et(8);
        if (bl2 && this.ctx != null) {
            this.baU.f(this.ctx, Blocks.cLc);
        }
    }

    public int Yu() {
        return this.Tp().el(9);
    }

    public void fd(int n2) {
        this.n(n2, true);
    }

    private void n(int n2, boolean bl2) {
        this.Tp().b(9, (byte)(n2 % 8));
        if (bl2 && this.ctx != null) {
            this.baU.f(this.ctx, Blocks.cLc);
        }
    }

    @Override
    public void d(n n2) {
        if (this.Yt() != null) {
            n2.b("Item", this.Yt().t(new n()));
            n2.a("ItemRotation", (byte)this.Yu());
            n2.a("ItemDropChance", this.cCv);
        }
        super.d(n2);
    }

    @Override
    public void e(n n2) {
        n n3 = n2.eN("Item");
        if (n3 != null && !n3.aeH()) {
            this.c(co.s(n3), false);
            this.n(n2.eE("ItemRotation"), false);
            if (n2.C("ItemDropChance", 99)) {
                this.cCv = n2.eI("ItemDropChance");
            }
            if (n2.eD("Direction")) {
                this.n(this.Yu() * 2, false);
            }
        }
        super.e(n2);
    }

    @Override
    public boolean o(a a2) {
        if (this.Yt() == null) {
            co co2 = a2.Vk();
            if (co2 != null && !this.baU.dDw) {
                this.ab(co2);
                if (!a2.cIt.cJM && --co2.cWZ <= 0) {
                    a2.cHV.g(a2.cHV.cJE, null);
                }
            }
        } else if (!this.baU.dDw) {
            this.fd(this.Yu() + 1);
        }
        return true;
    }

    public int Yv() {
        return this.Yt() == null ? 0 : this.Yu() % 8 + 1;
    }
}

