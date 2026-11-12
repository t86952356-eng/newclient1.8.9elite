/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;

class ai
implements Predicate<c> {
    ai() {
    }

    public boolean B(c c2) {
        return c2.TS();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

