/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import java.util.UUID;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ac;
import net.minecraft.entity.monster.ad;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.world.f;
import net.minecraft.world.w;

public class ab
extends au {
    private static final UUID cEJ = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final a cEK = new a(cEJ, "Attacking speed boost", 0.05, 0).aM(false);
    private int cEL;
    private int cEM;
    private UUID cEN;

    public ab(w w2) {
        super(w2);
        this.csC = true;
    }

    @Override
    public void T(r r2) {
        super.T(r2);
        if (r2 != null) {
            this.cEN = r2.Ul();
        }
    }

    @Override
    protected void ZE() {
        this.ctT.a(1, new ac(this));
        this.ctT.a(2, new ad(this));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(cFp).ap(0.0);
        this.a(aj.cwp).ap(0.23f);
        this.a(aj.cwq).ap(5.0);
    }

    @Override
    public void Dm() {
        super.Dm();
    }

    @Override
    protected void Vf() {
        e e2 = this.a(aj.cwp);
        if (this.ZF()) {
            if (!this.Uz() && !e2.b(cEK)) {
                e2.c(cEK);
            }
            --this.cEL;
        } else if (e2.b(cEK)) {
            e2.d(cEK);
        }
        if (this.cEM > 0 && --this.cEM == 0) {
            this.a("mob.zombiepig.zpigangry", this.VZ() * 2.0f, ((this.ta.nextFloat() - this.ta.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.cEL > 0 && this.cEN != null && this.VC() == null) {
            net.minecraft.entity.player.a a2 = this.baU.n(this.cEN);
            this.T(a2);
            this.cuJ = a2;
            this.cuK = this.VD();
        }
        super.Vf();
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
    public void d(n n2) {
        super.d(n2);
        n2.a("Anger", (short)this.cEL);
        if (this.cEN != null) {
            n2.R("HurtBy", this.cEN.toString());
        } else {
            n2.R("HurtBy", "");
        }
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.cEL = n2.eF("Anger");
        String string = n2.eK("HurtBy");
        if (string.length() > 0) {
            this.cEN = UUID.fromString(string);
            net.minecraft.entity.player.a a2 = this.baU.n(this.cEN);
            this.T(a2);
            if (a2 != null) {
                this.cuJ = a2;
                this.cuK = this.VD();
            }
        }
    }

    @Override
    public boolean a(net.minecraft.util.ad ad2, float f2) {
        if (this.a(ad2)) {
            return false;
        }
        c c2 = ad2.dk();
        if (c2 instanceof net.minecraft.entity.player.a) {
            this.an(c2);
        }
        return super.a(ad2, f2);
    }

    private void an(c c2) {
        this.cEL = 400 + this.ta.nextInt(400);
        this.cEM = this.ta.nextInt(40);
        if (c2 instanceof r) {
            this.T((r)c2);
        }
    }

    public boolean ZF() {
        return this.cEL > 0;
    }

    @Override
    protected String Vb() {
        return "mob.zombiepig.zpig";
    }

    @Override
    protected String VN() {
        return "mob.zombiepig.zpighurt";
    }

    @Override
    protected String VO() {
        return "mob.zombiepig.zpigdeath";
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3;
        int n4 = this.ta.nextInt(2 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cRx, 1);
        }
        n4 = this.ta.nextInt(2 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.d(Items.cRB, 1);
        }
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        return false;
    }

    @Override
    protected void VP() {
        this.d(Items.cPo, 1);
    }

    @Override
    protected void a(net.minecraft.world.e e2) {
        this.c(0, new co(Items.cPF));
    }

    @Override
    public net.minecraft.entity.ab a(net.minecraft.world.e e2, net.minecraft.entity.ab ab2) {
        super.a(e2, ab2);
        this.bl(false);
        return ab2;
    }
}

