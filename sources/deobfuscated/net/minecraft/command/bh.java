/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.scoreboard.l;

class bh
implements Predicate<c> {
    final /* synthetic */ String coD;
    final /* synthetic */ boolean coE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bh(String string, boolean bl2) {
        this.coD = string;
        this.coE = bl2;
    }

    public boolean B(c c2) {
        if (!(c2 instanceof r)) {
            return false;
        }
        r r2 = (r)c2;
        l l2 = r2.Vw();
        String string = l2 == null ? "" : l2.akq();
        return string.equals(this.coD) != this.coE;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

