/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.util;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;

class al
implements Predicate<c> {
    al() {
    }

    public boolean B(c c2) {
        return !(c2 instanceof a) || !((a)c2).CZ();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

