/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.b;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.v;
import net.minecraft.entity.aj;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.player.a;
import net.minecraft.entity.z;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.as;
import net.minecraft.world.w;

public class j
extends aa {
    private int bGR = 0;
    private boolean cEj = false;

    public j(w w2) {
        super(w2);
        this.ctM = 3;
        this.o(0.4f, 0.3f);
        this.ctS.a(1, new au(this));
        this.ctS.a(2, new b(this, a.class, 1.0, false));
        this.ctS.a(3, new bd(this, 1.0));
        this.ctS.a(7, new be(this, a.class, 8.0f));
        this.ctS.a(8, new net.minecraft.entity.ai.z(this));
        this.ctT.a(1, new v((net.minecraft.entity.j)this, true, new Class[0]));
        this.ctT.a(2, new ag<a>((net.minecraft.entity.j)this, a.class, true));
    }

    @Override
    public float getEyeHeight() {
        return 0.1f;
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(8.0);
        this.a(aj.cwp).ap(0.25);
        this.a(aj.cwq).ap(2.0);
    }

    @Override
    protected boolean Iz() {
        return false;
    }

    @Override
    protected String Vb() {
        return "mob.silverfish.say";
    }

    @Override
    protected String VN() {
        return "mob.silverfish.hit";
    }

    @Override
    protected String VO() {
        return "mob.silverfish.kill";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.silverfish.step", 0.15f, 1.0f);
    }

    @Override
    protected d Vc() {
        return null;
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.bGR = n2.eG("Lifetime");
        this.cEj = n2.eO("PlayerSpawned");
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.B("Lifetime", this.bGR);
        n2.o("PlayerSpawned", this.cEj);
    }

    @Override
    public void Dm() {
        this.cuF = this.pl;
        super.Dm();
    }

    public boolean Zj() {
        return this.cEj;
    }

    public void bb(boolean bl2) {
        this.cEj = bl2;
    }

    @Override
    public void Dn() {
        super.Dn();
        if (this.baU.dDw) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.baU.a(as.dxu, this.gW + (this.ta.nextDouble() - 0.5) * (double)this.width, this.gX + this.ta.nextDouble() * (double)this.height, this.gY + (this.ta.nextDouble() - 0.5) * (double)this.width, (this.ta.nextDouble() - 0.5) * 2.0, -this.ta.nextDouble(), (this.ta.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        } else {
            if (!this.Vo()) {
                ++this.bGR;
            }
            if (this.bGR >= 2400) {
                this.Tt();
            }
        }
    }

    @Override
    protected boolean Za() {
        return true;
    }

    @Override
    public boolean UB() {
        if (super.UB()) {
            a a2 = this.baU.f(this, 5.0);
            return a2 == null;
        }
        return false;
    }

    @Override
    public z VY() {
        return z.cvV;
    }
}

