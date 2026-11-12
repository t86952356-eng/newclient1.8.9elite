/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.r;

class s
implements Predicate<c> {
    s(r r2) {
    }

    public boolean B(c c2) {
        return c2.IE();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

