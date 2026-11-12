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
import net.minecraft.entity.ai.n;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m
extends net.minecraft.entity.ai.e {
    private static final Logger cxu = LogManager.getLogger();
    private final p cxv;
    private final Predicate<r> cxw;
    private final ai cxx;
    private r cxy;
    private final Class<? extends r> cxz;

    public m(p p2, Class<? extends r> clazz) {
        this.cxv = p2;
        this.cxz = clazz;
        if (p2 instanceof j) {
            cxu.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.cxw = new n(this);
        this.cxx = new ai(p2);
    }

    @Override
    public boolean WC() {
        double d2 = this.WN();
        Predicate<r> predicate = this.cxv.baU.a(this.cxz, this.cxv.Us().ad(d2, 4.0, d2), this.cxw);
        Collections.sort(predicate, this.cxx);
        if (predicate.isEmpty()) {
            return false;
        }
        this.cxy = (r)predicate.get(0);
        return true;
    }

    @Override
    public boolean WD() {
        r r2 = this.cxv.UW();
        if (r2 == null) {
            return false;
        }
        if (!r2.TS()) {
            return false;
        }
        double d2 = this.WN();
        return !(this.cxv.T((c)r2) > d2 * d2 || r2 instanceof net.minecraft.entity.player.e && ((net.minecraft.entity.player.e)r2).cIZ.amh());
    }

    @Override
    public void WG() {
        this.cxv.S(this.cxy);
        super.WG();
    }

    @Override
    public void WE() {
        this.cxv.S(null);
        super.WG();
    }

    protected double WN() {
        e e2 = this.cxv.a(aj.cwn);
        return e2 == null ? 16.0 : e2.XB();
    }
}

