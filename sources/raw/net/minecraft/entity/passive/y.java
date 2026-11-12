/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.passive;

import java.util.UUID;
import net.minecraft.entity.ad;
import net.minecraft.entity.ai.at;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.player.e;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.scoreboard.l;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.util.as;
import net.minecraft.world.w;

public abstract class y
extends b
implements ad {
    protected at cHo = new at(this);

    public y(w w2) {
        super(w2);
        this.aaP();
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, (byte)0);
        this.csD.a(17, "");
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        if (this.Wz() == null) {
            n2.R("OwnerUUID", "");
        } else {
            n2.R("OwnerUUID", this.Wz());
        }
        n2.o("Sitting", this.abm());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        String string = "";
        if (n2.C("OwnerUUID", 8)) {
            string = n2.eK("OwnerUUID");
        } else {
            String string2 = n2.eK("Owner");
            string = PreYggdrasilConverter.fF(string2);
        }
        if (string.length() > 0) {
            this.ek(string);
            this.by(true);
        }
        this.cHo.aL(n2.eO("Sitting"));
        this.aL(n2.eO("Sitting"));
    }

    protected void bC(boolean bl2) {
        as as2 = as.dxE;
        if (!bl2) {
            as2 = as.dxh;
        }
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.ta.nextGaussian() * 0.02;
            double d3 = this.ta.nextGaussian() * 0.02;
            double d4 = this.ta.nextGaussian() * 0.02;
            this.baU.a(as2, this.gW + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, this.gX + 0.5 + (double)(this.ta.nextFloat() * this.height), this.gY + (double)(this.ta.nextFloat() * this.width * 2.0f) - (double)this.width, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.bC(true);
        } else if (by2 == 6) {
            this.bC(false);
        } else {
            super.a(by2);
        }
    }

    public boolean abl() {
        return (this.csD.el(16) & 4) != 0;
    }

    public void by(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 4));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFB));
        }
        this.aaP();
    }

    protected void aaP() {
    }

    public boolean abm() {
        return (this.csD.el(16) & 1) != 0;
    }

    public void aL(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 1));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public String Wz() {
        return this.csD.ep(17);
    }

    public void ek(String string) {
        this.csD.b(17, string);
    }

    public r abn() {
        try {
            UUID uUID = UUID.fromString(this.Wz());
            return uUID == null ? null : this.baU.n(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public boolean Z(r r2) {
        return r2 == this.abn();
    }

    public at abo() {
        return this.cHo;
    }

    public boolean b(r r2, r r3) {
        return true;
    }

    @Override
    public l Vw() {
        r r2;
        if (this.abl() && (r2 = this.abn()) != null) {
            return r2.Vw();
        }
        return super.Vw();
    }

    @Override
    public boolean U(r r2) {
        if (this.abl()) {
            r r3 = this.abn();
            if (r2 == r3) {
                return true;
            }
            if (r3 != null) {
                return r3.U(r2);
            }
        }
        return super.U(r2);
    }

    @Override
    public void b(net.minecraft.util.ad ad2) {
        if (!this.baU.dDw && this.baU.Si().gw("showDeathMessages") && this.xV() && this.abn() instanceof e) {
            this.abn().a(this.VR().arP());
        }
        super.b(ad2);
    }

    @Override
    public /* synthetic */ c WA() {
        return this.abn();
    }
}

