/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.boss;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.entity.z;

class e
implements Predicate<c> {
    e() {
    }

    public boolean B(c c2) {
        return c2 instanceof r && ((r)c2).VY() != z.cvU;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

