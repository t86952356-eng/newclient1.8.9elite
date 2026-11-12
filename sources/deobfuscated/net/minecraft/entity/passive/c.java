/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.entity.aj;
import net.minecraft.entity.passive.a;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class c
extends a {
    private b crp;

    public c(w w2) {
        super(w2);
        this.o(0.5f, 0.9f);
        this.bn(true);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Byte(0));
    }

    @Override
    protected float VZ() {
        return 0.1f;
    }

    @Override
    protected float Wa() {
        return super.Wa() * 0.95f;
    }

    @Override
    protected String Vb() {
        return this.ZV() && this.ta.nextInt(4) != 0 ? null : "mob.bat.idle";
    }

    @Override
    protected String VN() {
        return "mob.bat.hurt";
    }

    @Override
    protected String VO() {
        return "mob.bat.death";
    }

    @Override
    public boolean IE() {
        return false;
    }

    @Override
    protected void ah(net.minecraft.entity.c c2) {
    }

    @Override
    protected void Wh() {
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(6.0);
    }

    public boolean ZV() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void bn(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 1));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void Dm() {
        super.Dm();
        if (this.ZV()) {
            this.uf = 0.0;
            this.ue = 0.0;
            this.ud = 0.0;
            this.gX = (double)bt.aF(this.gX) + 1.0 - (double)this.height;
        } else {
            this.ue *= (double)0.6f;
        }
    }

    @Override
    protected void Vf() {
        super.Vf();
        b b2 = new b(this);
        b b3 = b2.aqX();
        if (this.ZV()) {
            if (!this.baU.L(b3).df().xd()) {
                this.bn(false);
                this.baU.b(null, 1015, b2, 0);
            } else {
                if (this.ta.nextInt(200) == 0) {
                    this.pn = this.ta.nextInt(360);
                }
                if (this.baU.f(this, 4.0) != null) {
                    this.bn(false);
                    this.baU.b(null, 1015, b2, 0);
                }
            }
        } else {
            if (!(this.crp == null || this.baU.aG(this.crp) && this.crp.wu() >= 1)) {
                this.crp = null;
            }
            if (this.crp == null || this.ta.nextInt(30) == 0 || this.crp.am((int)this.gW, (int)this.gX, (int)this.gY) < 4.0) {
                this.crp = new b((int)this.gW + this.ta.nextInt(7) - this.ta.nextInt(7), (int)this.gX + this.ta.nextInt(6) - 2, (int)this.gY + this.ta.nextInt(7) - this.ta.nextInt(7));
            }
            double d2 = (double)this.crp.wt() + 0.5 - this.gW;
            double d3 = (double)this.crp.wu() + 0.1 - this.gX;
            double d4 = (double)this.crp.wx() + 0.5 - this.gY;
            this.ud += (Math.signum(d2) * 0.5 - this.ud) * (double)0.1f;
            this.ue += (Math.signum(d3) * (double)0.7f - this.ue) * (double)0.1f;
            this.uf += (Math.signum(d4) * 0.5 - this.uf) * (double)0.1f;
            float f2 = (float)(bt.y(this.uf, this.ud) * 180.0 / Math.PI) - 90.0f;
            float f3 = bt.bN(f2 - this.pl);
            this.cuW = 0.5f;
            this.pl += f3;
            if (this.ta.nextInt(100) == 0 && this.baU.L(b3).df().xd()) {
                this.bn(true);
            }
        }
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    public void q(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, Block block, b b2) {
    }

    @Override
    public boolean Uj() {
        return true;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        if (!this.baU.dDw && this.ZV()) {
            this.bn(false);
        }
        return super.a(ad2, f2);
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.csD.b(16, n2.eE("BatFlags"));
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.a("BatFlags", this.csD.el(16));
    }

    @Override
    public boolean UB() {
        b b2 = new b(this.gW, this.Us().dtI, this.gY);
        if (b2.wu() >= this.baU.avB()) {
            return false;
        }
        int n2 = this.baU.aP(b2);
        int n3 = 4;
        if (this.a(this.baU.avO())) {
            n3 = 7;
        } else if (this.ta.nextBoolean()) {
            return false;
        }
        return n2 <= this.ta.nextInt(n3) && super.UB();
    }

    private boolean a(Calendar calendar) {
        return calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3;
    }

    @Override
    public float getEyeHeight() {
        return this.height / 2.0f;
    }
}

