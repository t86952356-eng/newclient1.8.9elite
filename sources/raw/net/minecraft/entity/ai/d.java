/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;

class d
implements Predicate<c> {
    final /* synthetic */ net.minecraft.entity.ai.c cwR;

    d(net.minecraft.entity.ai.c c2) {
        this.cwR = c2;
    }

    public boolean B(c c2) {
        return c2.TS() && this.cwR.cwJ.UV().al(c2);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

