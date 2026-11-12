/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.ad;
import net.minecraft.world.f;

class t
extends e {
    private final net.minecraft.entity.monster.r cEB;
    private int qH;

    public t(net.minecraft.entity.monster.r r2) {
        this.cEB = r2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        r r2 = this.cEB.UW();
        return r2 != null && r2.TS();
    }

    @Override
    public boolean WD() {
        return super.WD() && (this.cEB.Zo() || this.cEB.T((c)this.cEB.UW()) > 9.0);
    }

    @Override
    public void WG() {
        this.qH = -10;
        this.cEB.UU().aiL();
        this.cEB.UR().b(this.cEB.UW(), 90.0f, 90.0f);
        this.cEB.csL = true;
    }

    @Override
    public void WE() {
        this.cEB.fo(0);
        this.cEB.S(null);
        this.cEB.cEz.Xa();
    }

    @Override
    public void WF() {
        r r2 = this.cEB.UW();
        this.cEB.UU().aiL();
        this.cEB.UR().b(r2, 90.0f, 90.0f);
        if (!this.cEB.ai(r2)) {
            this.cEB.S(null);
        } else {
            ++this.qH;
            if (this.qH == 0) {
                this.cEB.fo(this.cEB.UW().getEntityId());
                this.cEB.baU.a((c)this.cEB, (byte)21);
            } else if (this.qH >= this.cEB.Zn()) {
                float f2 = 1.0f;
                if (this.cEB.baU.agm() == f.dBU) {
                    f2 += 2.0f;
                }
                if (this.cEB.Zo()) {
                    f2 += 2.0f;
                }
                r2.a(ad.d(this.cEB, this.cEB), f2);
                r2.a(ad.ac(this.cEB), (float)this.cEB.a(aj.cwq).XB());
                this.cEB.S(null);
            } else if (this.qH < 60 || this.qH % 20 == 0) {
                // empty if block
            }
            super.WF();
        }
    }
}

