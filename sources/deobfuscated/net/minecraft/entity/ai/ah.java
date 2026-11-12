/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

class ah
implements Predicate<T> {
    final /* synthetic */ Predicate cyX;
    final /* synthetic */ ag cyY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ah(ag ag2, Predicate predicate) {
        this.cyY = ag2;
        this.cyX = predicate;
    }

    public boolean W(T t2) {
        if (this.cyX != null && !this.cyX.apply(t2)) {
            return false;
        }
        if (t2 instanceof a) {
            double d2 = this.cyY.WV();
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
            if ((double)((c)t2).S(this.cyY.czA) > d2) {
                return false;
            }
        }
        return this.cyY.a((r)t2, false);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.W((r)object);
    }
}

