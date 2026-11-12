/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;

class bj
implements Predicate<c> {
    final /* synthetic */ String coG;
    final /* synthetic */ boolean coH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bj(String string, boolean bl2) {
        this.coG = string;
        this.coH = bl2;
    }

    public boolean B(c c2) {
        return c2.xU().equals(this.coG) != this.coH;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

