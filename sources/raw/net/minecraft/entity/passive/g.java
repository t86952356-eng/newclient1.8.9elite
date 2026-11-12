/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.passive;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;

class g
implements Predicate<c> {
    g() {
    }

    public boolean B(c c2) {
        return c2 instanceof f && ((f)c2).aai();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

