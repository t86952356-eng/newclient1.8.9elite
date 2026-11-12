/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import java.util.Collections;
import net.minecraft.entity.ai.ai;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.ai.p;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.scoreboard.l;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o
extends net.minecraft.entity.ai.e {
    private static final Logger cxB = LogManager.getLogger();
    private final net.minecraft.entity.p cxC;
    private final Predicate<c> cxD;
    private final ai cxE;
    private r cxF;

    public o(net.minecraft.entity.p p2) {
        this.cxC = p2;
        if (p2 instanceof j) {
            cxB.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.cxD = new p(this);
        this.cxE = new ai(p2);
    }

    @Override
    public boolean WC() {
        double d2 = this.WO();
        Predicate<c> predicate = this.cxC.baU.a(a.class, this.cxC.Us().ad(d2, 4.0, d2), this.cxD);
        Collections.sort(predicate, this.cxE);
        if (predicate.isEmpty()) {
            return false;
        }
        this.cxF = (r)predicate.get(0);
        return true;
    }

    @Override
    public boolean WD() {
        r r2 = this.cxC.UW();
        if (r2 == null) {
            return false;
        }
        if (!r2.TS()) {
            return false;
        }
        if (r2 instanceof a && ((a)r2).cIt.cJJ) {
            return false;
        }
        l l2 = this.cxC.Vw();
        l l3 = r2.Vw();
        if (l2 != null && l3 == l2) {
            return false;
        }
        double d2 = this.WO();
        return !(this.cxC.T((c)r2) > d2 * d2 || r2 instanceof net.minecraft.entity.player.e && ((net.minecraft.entity.player.e)r2).cIZ.amh());
    }

    @Override
    public void WG() {
        this.cxC.S(this.cxF);
        super.WG();
    }

    @Override
    public void WE() {
        this.cxC.S(null);
        super.WG();
    }

    protected double WO() {
        e e2 = this.cxC.a(aj.cwn);
        return e2 == null ? 16.0 : e2.XB();
    }
}

