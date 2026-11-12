/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.util.ao;

class BlockRedstoneComparator$1
implements Predicate<c> {
    final /* synthetic */ ao aZB;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    BlockRedstoneComparator$1() {
        void var2_-1;
        this.aZB = var2_-1;
    }

    public boolean B(c c2) {
        return c2 != null && c2.Uq() == this.aZB;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

