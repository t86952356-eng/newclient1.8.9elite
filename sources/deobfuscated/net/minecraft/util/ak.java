/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.inventory.ab;

class ak
implements Predicate<c> {
    ak() {
    }

    public boolean B(c c2) {
        return c2 instanceof ab && c2.TS();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

