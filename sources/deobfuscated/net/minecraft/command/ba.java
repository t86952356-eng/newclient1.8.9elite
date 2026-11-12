/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;

class ba
implements Predicate<c> {
    ba() {
    }

    public boolean B(c c2) {
        return c2 instanceof a;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

