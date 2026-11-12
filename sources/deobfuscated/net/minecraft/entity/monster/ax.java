/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aw;

class ax
implements Predicate<c> {
    ax() {
    }

    public boolean B(c c2) {
        return c2 instanceof aw;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

