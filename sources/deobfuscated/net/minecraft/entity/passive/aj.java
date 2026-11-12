/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.passive;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.passive.u;

class aj
implements Predicate<c> {
    aj(ai ai2) {
    }

    public boolean B(c c2) {
        return c2 instanceof u || c2 instanceof l;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

