/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ai;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.as;
import net.minecraft.world.f;
import net.minecraft.world.w;

public class z
extends ai {
    public z(w w2) {
        super(w2);
        this.csC = true;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwp).ap(0.2f);
    }

    @Override
    public boolean UB() {
        return this.baU.agm() != f.dBR;
    }

    @Override
    public boolean Vh() {
        return this.baU.a(this.Us(), (c)this) && this.baU.a((c)this, this.Us()).isEmpty() && !this.baU.u(this.Us());
    }

    @Override
    public int VQ() {
        return this.ZJ() * 3;
    }

    @Override
    public int af(float f2) {
        return 0xF000F0;
    }

    @Override
    public float ag(float f2) {
        return 1.0f;
    }

    @Override
    protected as Zw() {
        return as.dxw;
    }

    @Override
    protected ai Zx() {
        return new z(this.baU);
    }

    @Override
    protected d Vc() {
        return Items.cRI;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        d d2 = this.Vc();
        if (d2 != null && this.ZJ() > 1) {
            int n3 = this.ta.nextInt(4) - 2;
            if (n2 > 0) {
                n3 += this.ta.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d(d2, 1);
            }
        }
    }

    @Override
    public boolean isBurning() {
        return false;
    }

    @Override
    protected int Zy() {
        return super.Zy() * 4;
    }

    @Override
    protected void Zz() {
        this.cEV *= 0.9f;
    }

    @Override
    protected void jump() {
        this.ue = 0.42f + (float)this.ZJ() * 0.1f;
        this.csL = true;
    }

    @Override
    protected void We() {
        this.ue = 0.22f + (float)this.ZJ() * 0.05f;
        this.csL = true;
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    protected boolean ZA() {
        return true;
    }

    @Override
    protected int ZB() {
        return super.ZB() + 2;
    }

    @Override
    protected String ZC() {
        return this.ZJ() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
    }

    @Override
    protected boolean ZD() {
        return true;
    }
}

