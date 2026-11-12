/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.world;

import com.google.common.base.Predicate;
import net.minecraft.entity.r;
import net.minecraft.world.ai;

class aj
implements Predicate<r> {
    final /* synthetic */ ai dEm;

    aj(ai ai2) {
        this.dEm = ai2;
    }

    public boolean W(r r2) {
        return r2 != null && r2.TS() && this.dEm.aM(r2.yl());
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.W((r)object);
    }
}

