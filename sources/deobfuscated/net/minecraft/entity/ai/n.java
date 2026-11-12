/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.ai.av;
import net.minecraft.entity.ai.m;
import net.minecraft.entity.r;

class n
implements Predicate<r> {
    final /* synthetic */ m cxA;

    n(m m2) {
        this.cxA = m2;
    }

    public boolean W(r r2) {
        double d2 = this.cxA.WN();
        if (r2.isSneaking()) {
            d2 *= (double)0.8f;
        }
        return !r2.isInvisible() && !((double)r2.S(this.cxA.cxv) > d2) && av.a(this.cxA.cxv, r2, false, true);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.W((r)object);
    }
}

