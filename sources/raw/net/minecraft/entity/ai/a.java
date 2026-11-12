/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ah;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class a
extends e {
    private final p cwr;
    private final ah cws;
    private r ctU;
    private int cwt = -1;
    private final double cwu;
    private int cwv;
    private final int cww;
    private final int cwx;
    private final float cwy;
    private final float cwz;

    public a(ah ah2, double d2, int n2, float f2) {
        this(ah2, d2, n2, n2, f2);
    }

    public a(ah ah2, double d2, int n2, int n3, float f2) {
        if (!(ah2 instanceof r)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.cws = ah2;
        this.cwr = (p)((Object)ah2);
        this.cwu = d2;
        this.cww = n2;
        this.cwx = n3;
        this.cwy = f2;
        this.cwz = f2 * f2;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        r r2 = this.cwr.UW();
        if (r2 == null) {
            return false;
        }
        this.ctU = r2;
        return true;
    }

    @Override
    public boolean WD() {
        return this.WC() || !this.cwr.UU().aiK();
    }

    @Override
    public void WE() {
        this.ctU = null;
        this.cwv = 0;
        this.cwt = -1;
    }

    @Override
    public void WF() {
        double d2 = this.cwr.M(this.ctU.gW, this.ctU.Us().dtI, this.ctU.gY);
        boolean bl2 = this.cwr.UV().al(this.ctU);
        this.cwv = bl2 ? ++this.cwv : 0;
        if (d2 <= (double)this.cwz && this.cwv >= 20) {
            this.cwr.UU().aiL();
        } else {
            this.cwr.UU().e(this.ctU, this.cwu);
        }
        this.cwr.UR().b(this.ctU, 30.0f, 30.0f);
        if (--this.cwt == 0) {
            if (d2 > (double)this.cwz || !bl2) {
                return;
            }
            float f2 = bt.aD(d2) / this.cwy;
            float f3 = bt.I(f2, 0.1f, 1.0f);
            this.cws.g(this.ctU, f3);
            this.cwt = bt.bL(f2 * (float)(this.cwx - this.cww) + (float)this.cww);
        } else if (this.cwt < 0) {
            float f4 = bt.aD(d2) / this.cwy;
            this.cwt = bt.bL(f4 * (float)(this.cwx - this.cww) + (float)this.cww);
        }
    }
}

