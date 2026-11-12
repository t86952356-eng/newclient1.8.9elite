/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.ae;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.monster.b;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.ad;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class a
extends aa {
    private float cDQ = 0.5f;
    private int cDR;

    public a(w w2) {
        super(w2);
        this.csC = true;
        this.ctM = 10;
        this.ctS.a(4, new b(this));
        this.ctS.a(5, new ae(this, 1.0));
        this.ctS.a(7, new bd(this, 1.0));
        this.ctS.a(8, new be(this, net.minecraft.entity.player.a.class, 8.0f));
        this.ctS.a(8, new z(this));
        this.ctT.a(1, new v((j)this, true, new Class[0]));
        this.ctT.a(2, new ag<net.minecraft.entity.player.a>((j)this, net.minecraft.entity.player.a.class, true));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwq).ap(6.0);
        this.a(aj.cwp).ap(0.23f);
        this.a(aj.cwn).ap(48.0);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Byte(0));
    }

    @Override
    protected String Vb() {
        return "mob.blaze.breathe";
    }

    @Override
    protected String VN() {
        return "mob.blaze.hit";
    }

    @Override
    protected String VO() {
        return "mob.blaze.death";
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
    public void Dn() {
        if (!this.aO && this.ue < 0.0) {
            this.ue *= 0.6;
        }
        if (this.baU.dDw) {
            if (this.ta.nextInt(24) == 0 && !this.TE()) {
                this.baU.a(this.gW + 0.5, this.gX + 0.5, this.gY + 0.5, "fire.fire", 1.0f + this.ta.nextFloat(), this.ta.nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i2 = 0; i2 < 2; ++i2) {
                this.baU.a(as.dxi, this.gW + (this.ta.nextDouble() - 0.5) * (double)this.width, this.gX + this.ta.nextDouble() * (double)this.height, this.gY + (this.ta.nextDouble() - 0.5) * (double)this.width, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        super.Dn();
    }

    @Override
    protected void Vf() {
        r r2;
        if (this.TG()) {
            this.a(ad.dvg, 1.0f);
        }
        --this.cDR;
        if (this.cDR <= 0) {
            this.cDR = 100;
            this.cDQ = 0.5f + (float)this.ta.nextGaussian() * 3.0f;
        }
        if ((r2 = this.UW()) != null && r2.gX + (double)r2.getEyeHeight() > this.gX + (double)this.getEyeHeight() + (double)this.cDQ) {
            this.ue += ((double)0.3f - this.ue) * (double)0.3f;
            this.csL = true;
        }
        super.Vf();
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    protected d Vc() {
        return Items.cRz;
    }

    @Override
    public boolean isBurning() {
        return this.YZ();
    }

    @Override
    protected void a(boolean bl2, int n2) {
        if (bl2) {
            int n3 = this.ta.nextInt(2 + n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d(Items.cRz, 1);
            }
        }
    }

    public boolean YZ() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void aZ(boolean bl2) {
        byte by2 = this.csD.el(16);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.csD.b(16, by2);
    }

    @Override
    protected boolean Za() {
        return true;
    }
}

