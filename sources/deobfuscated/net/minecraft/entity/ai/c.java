/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.d;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.pathfinding.b;
import net.minecraft.util.ah;
import net.minecraft.util.da;

public class c<T extends net.minecraft.entity.c>
extends e {
    private final Predicate<net.minecraft.entity.c> cwI = new d(this);
    protected j cwJ;
    private final double cwK;
    private final double cwL;
    protected T cwM;
    private final float cwN;
    private b cwE;
    private final net.minecraft.pathfinding.d cwO;
    private final Class<T> cwP;
    private final Predicate<? super T> cwQ;

    public c(j j2, Class<T> clazz, float f2, double d2, double d3) {
        this(j2, clazz, Predicates.alwaysTrue(), f2, d2, d3);
    }

    public c(j j2, Class<T> clazz, Predicate<? super T> predicate, float f2, double d2, double d3) {
        this.cwJ = j2;
        this.cwP = clazz;
        this.cwQ = predicate;
        this.cwN = f2;
        this.cwK = d2;
        this.cwL = d3;
        this.cwO = j2.UU();
        this.eO(1);
    }

    @Override
    public boolean WC() {
        Predicate predicate = this.cwJ.baU.a(this.cwP, this.cwJ.Us().ad(this.cwN, 3.0, this.cwN), Predicates.and((Predicate[])new Predicate[]{ah.dvJ, this.cwI, this.cwQ}));
        if (predicate.isEmpty()) {
            return false;
        }
        this.cwM = (net.minecraft.entity.c)predicate.get(0);
        da da2 = bm.b(this.cwJ, 16, 7, new da(((net.minecraft.entity.c)this.cwM).gW, ((net.minecraft.entity.c)this.cwM).gX, ((net.minecraft.entity.c)this.cwM).gY));
        if (da2 == null) {
            return false;
        }
        if (((net.minecraft.entity.c)this.cwM).M(da2.dAG, da2.dAH, da2.dAI) < ((net.minecraft.entity.c)this.cwM).T(this.cwJ)) {
            return false;
        }
        this.cwE = this.cwO.V(da2.dAG, da2.dAH, da2.dAI);
        return this.cwE != null && this.cwE.m(da2);
    }

    @Override
    public boolean WD() {
        return !this.cwO.aiK();
    }

    @Override
    public void WG() {
        this.cwO.a(this.cwE, this.cwK);
    }

    @Override
    public void WE() {
        this.cwM = null;
    }

    @Override
    public void WF() {
        if (this.cwJ.T((net.minecraft.entity.c)this.cwM) < 49.0) {
            this.cwJ.UU().setSpeed(this.cwL);
        } else {
            this.cwJ.UU().setSpeed(this.cwK);
        }
    }
}

