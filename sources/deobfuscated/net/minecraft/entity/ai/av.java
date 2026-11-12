/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ad;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.p;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.h;
import net.minecraft.scoreboard.l;
import net.minecraft.util.bt;
import org.apache.commons.lang3.StringUtils;

public abstract class av
extends net.minecraft.entity.ai.e {
    protected final j czA;
    protected boolean czB;
    private final boolean czC;
    private int czD;
    private int czE;
    private int czF;

    public av(j j2, boolean bl2) {
        this(j2, bl2, false);
    }

    public av(j j2, boolean bl2, boolean bl3) {
        this.czA = j2;
        this.czB = bl2;
        this.czC = bl3;
    }

    @Override
    public boolean WD() {
        r r2 = this.czA.UW();
        if (r2 == null) {
            return false;
        }
        if (!r2.TS()) {
            return false;
        }
        l l2 = this.czA.Vw();
        l l3 = r2.Vw();
        if (l2 != null && l3 == l2) {
            return false;
        }
        double d2 = this.WV();
        if (this.czA.T((c)r2) > d2 * d2) {
            return false;
        }
        if (this.czB) {
            if (this.czA.UV().al(r2)) {
                this.czF = 0;
            } else if (++this.czF > 60) {
                return false;
            }
        }
        return !(r2 instanceof a) || !((a)r2).cIt.cJJ;
    }

    protected double WV() {
        e e2 = this.czA.a(aj.cwn);
        return e2 == null ? 16.0 : e2.XB();
    }

    @Override
    public void WG() {
        this.czD = 0;
        this.czE = 0;
        this.czF = 0;
    }

    @Override
    public void WE() {
        this.czA.S(null);
    }

    public static boolean a(p p2, r r2, boolean bl2, boolean bl3) {
        if (r2 == null) {
            return false;
        }
        if (r2 == p2) {
            return false;
        }
        if (!r2.TS()) {
            return false;
        }
        if (!p2.i(r2.getClass())) {
            return false;
        }
        l l2 = p2.Vw();
        l l3 = r2.Vw();
        if (l2 != null && l3 == l2) {
            return false;
        }
        if (p2 instanceof ad && StringUtils.isNotEmpty((CharSequence)((ad)((Object)p2)).Wz())) {
            if (r2 instanceof ad && ((ad)((Object)p2)).Wz().equals(((ad)((Object)r2)).Wz())) {
                return false;
            }
            if (r2 == ((ad)((Object)p2)).WA()) {
                return false;
            }
        } else if (r2 instanceof a && !bl2 && ((a)r2).cIt.cJJ) {
            return false;
        }
        return !bl3 || p2.UV().al(r2);
    }

    protected boolean a(r r2, boolean bl2) {
        if (!av.a(this.czA, r2, bl2, this.czB)) {
            return false;
        }
        if (!this.czA.ae(new net.minecraft.util.b(r2))) {
            return false;
        }
        if (this.czC) {
            if (--this.czE <= 0) {
                this.czD = 0;
            }
            if (this.czD == 0) {
                this.czD = this.X(r2) ? 1 : 2;
            }
            return this.czD != 2;
        }
        return true;
    }

    private boolean X(r r2) {
        int n2;
        this.czE = 10 + this.czA.VB().nextInt(5);
        b b2 = this.czA.UU().au(r2);
        if (b2 == null) {
            return false;
        }
        h h2 = b2.aiC();
        if (h2 == null) {
            return false;
        }
        int n3 = h2.dgk - bt.aF(r2.gW);
        return (double)(n3 * n3 + (n2 = h2.dgm - bt.aF(r2.gY)) * n2) <= 2.25;
    }
}

