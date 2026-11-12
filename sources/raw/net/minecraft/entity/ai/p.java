/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.ai.av;
import net.minecraft.entity.ai.o;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

class p
implements Predicate<c> {
    final /* synthetic */ o cxG;

    p(o o2) {
        this.cxG = o2;
    }

    public boolean B(c c2) {
        if (!(c2 instanceof a)) {
            return false;
        }
        if (((a)c2).cIt.cJJ) {
            return false;
        }
        double d2 = this.cxG.WO();
        if (c2.isSneaking()) {
            d2 *= (double)0.8f;
        }
        if (c2.isInvisible()) {
            float f2 = ((a)c2).abN();
            if (f2 < 0.1f) {
                f2 = 0.1f;
            }
            d2 *= (double)(0.7f * f2);
        }
        return !((double)c2.S(this.cxG.cxC) > d2) && av.a(this.cxG.cxC, (r)c2, false, true);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

