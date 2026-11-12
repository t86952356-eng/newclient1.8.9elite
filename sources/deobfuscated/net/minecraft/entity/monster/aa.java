/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.enchantment.l;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.r;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.f;
import net.minecraft.world.g;
import net.minecraft.world.w;

public abstract class aa
extends j
implements aw {
    public aa(w w2) {
        super(w2);
        this.ctM = 5;
    }

    @Override
    public void Dn() {
        this.VW();
        float f2 = this.ag(1.0f);
        if (f2 > 0.5f) {
            this.cuM += 2;
        }
        super.Dn();
    }

    @Override
    public void Dm() {
        super.Dm();
        if (!this.baU.dDw && this.baU.agm() == f.dBR) {
            this.Tt();
        }
    }

    @Override
    protected String TC() {
        return "game.hostile.swim";
    }

    @Override
    protected String TL() {
        return "game.hostile.swim.splash";
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (super.a(ad2, f2)) {
            c c2 = ad2.dk();
            return true;
        }
        return false;
    }

    @Override
    protected String VN() {
        return "game.hostile.hurt";
    }

    @Override
    protected String VO() {
        return "game.hostile.die";
    }

    @Override
    protected String eM(int n2) {
        return n2 > 4 ? "game.hostile.hurt.fall.big" : "game.hostile.hurt.fall.small";
    }

    @Override
    public boolean ag(c c2) {
        boolean bl2;
        float f2 = (float)this.a(aj.cwq).XB();
        int n2 = 0;
        if (c2 instanceof r) {
            f2 += l.b(this.Vk(), ((r)c2).VY());
            n2 += l.I(this);
        }
        if (bl2 = c2.a(ad.ac(this), f2)) {
            int n3;
            if (n2 > 0) {
                c2.N(-bt.bx(this.pl * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, bt.bB(this.pl * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                this.ud *= 0.6;
                this.uf *= 0.6;
            }
            if ((n3 = l.J(this)) > 0) {
                c2.ev(n3 * 4);
            }
            this.c(this, c2);
        }
        return bl2;
    }

    @Override
    public float ad(b b2) {
        return 0.5f - this.baU.aR(b2);
    }

    protected boolean Za() {
        b b2 = new b(this.gW, this.Us().dtI, this.gY);
        if (this.baU.b(g.dBZ, b2) > this.ta.nextInt(32)) {
            return false;
        }
        int n2 = this.baU.aP(b2);
        if (this.baU.avJ()) {
            int n3 = this.baU.avP();
            this.baU.ie(10);
            n2 = this.baU.aP(b2);
            this.baU.ie(n3);
        }
        return n2 <= this.ta.nextInt(8);
    }

    @Override
    public boolean UB() {
        return this.baU.agm() != f.dBR && this.Za() && super.UB();
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.VX().c(aj.cwq);
    }

    @Override
    protected boolean VA() {
        return true;
    }
}

