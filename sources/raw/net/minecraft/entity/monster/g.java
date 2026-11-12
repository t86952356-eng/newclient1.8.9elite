/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import java.util.Collections;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.e;
import net.minecraft.entity.player.a;

class g
extends ag {
    private a bij;
    private int cEe;
    private int cEf;
    private final e cEg;

    public g(e e2) {
        super((j)e2, a.class, true);
        this.cEg = e2;
    }

    @Override
    public boolean WC() {
        double d2 = this.WV();
        Predicate predicate = this.czA.baU.a(a.class, this.czA.Us().ad(d2, 4.0, d2), this.cyW);
        Collections.sort(predicate, this.cyV);
        if (predicate.isEmpty()) {
            return false;
        }
        this.bij = (a)predicate.get(0);
        return true;
    }

    @Override
    public void WG() {
        this.cEe = 5;
        this.cEf = 0;
    }

    @Override
    public void WE() {
        this.bij = null;
        this.cEg.ba(false);
        net.minecraft.entity.ai.attributes.e e2 = this.cEg.a(aj.cwp);
        e2.d(e.cEb);
        super.WE();
    }

    @Override
    public boolean WD() {
        if (this.bij != null) {
            if (!this.cEg.y(this.bij)) {
                return false;
            }
            this.cEg.cEd = true;
            this.cEg.a(this.bij, 10.0f, 10.0f);
            return true;
        }
        return super.WD();
    }

    @Override
    public void WF() {
        if (this.bij != null) {
            if (--this.cEe <= 0) {
                this.qX = this.bij;
                this.bij = null;
                super.WG();
                this.cEg.a("mob.endermen.stare", 1.0f, 1.0f);
                this.cEg.ba(true);
                net.minecraft.entity.ai.attributes.e e2 = this.cEg.a(aj.cwp);
                e2.c(e.cEb);
            }
        } else {
            if (this.qX != null) {
                if (this.qX instanceof a && this.cEg.y((a)this.qX)) {
                    if (this.qX.T((c)this.cEg) < 16.0) {
                        this.cEg.Zg();
                    }
                    this.cEf = 0;
                } else if (this.qX.T((c)this.cEg) > 256.0 && this.cEf++ >= 30 && this.cEg.am(this.qX)) {
                    this.cEf = 0;
                }
            }
            super.WF();
        }
    }
}

