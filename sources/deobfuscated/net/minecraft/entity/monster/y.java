/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.j;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.monster.x;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

class y
implements Predicate<T> {
    final /* synthetic */ Predicate cEG;
    final /* synthetic */ j cEH;
    final /* synthetic */ x cEI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    y(x x2, Predicate predicate, j j2) {
        this.cEI = x2;
        this.cEG = predicate;
        this.cEH = j2;
    }

    public boolean W(T t2) {
        if (this.cEG != null && !this.cEG.apply(t2)) {
            return false;
        }
        if (t2 instanceof d) {
            return false;
        }
        if (t2 instanceof a) {
            double d2 = x.a(this.cEI);
            if (((c)t2).isSneaking()) {
                d2 *= (double)0.8f;
            }
            if (((c)t2).isInvisible()) {
                float f2 = ((a)t2).abN();
                if (f2 < 0.1f) {
                    f2 = 0.1f;
                }
                d2 *= (double)(0.7f * f2);
            }
            if ((double)((c)t2).S(this.cEH) > d2) {
                return false;
            }
        }
        return x.a(this.cEI, t2, false);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.W((r)object);
    }
}

