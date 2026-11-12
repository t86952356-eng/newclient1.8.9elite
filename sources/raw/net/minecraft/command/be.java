/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.n;

class be
implements Predicate<c> {
    final /* synthetic */ String coy;
    final /* synthetic */ boolean coz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    be(String string, boolean bl2) {
        this.coy = string;
        this.coz = bl2;
    }

    public boolean B(c c2) {
        return n.a(c2, this.coy) != this.coz;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

