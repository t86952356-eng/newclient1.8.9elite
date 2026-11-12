/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;

class bf
implements Predicate<c> {
    final /* synthetic */ int coA;
    final /* synthetic */ int coB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bf(int n2, int n3) {
        this.coA = n2;
        this.coB = n3;
    }

    public boolean B(c c2) {
        if (!(c2 instanceof e)) {
            return false;
        }
        e e2 = (e)c2;
        return !(this.coA > -1 && e2.cIu < this.coA || this.coB > -1 && e2.cIu > this.coB);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

