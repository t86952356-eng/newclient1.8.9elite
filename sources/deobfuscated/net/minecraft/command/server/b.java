/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command.server;

import com.google.common.base.Predicate;
import net.minecraft.command.server.a;
import net.minecraft.entity.player.e;
import net.minecraft.stats.f;

class b
implements Predicate<net.minecraft.stats.a> {
    final /* synthetic */ e coP;
    final /* synthetic */ f coQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    b(a a2, e e2, f f2) {
        this.coP = e2;
        this.coQ = f2;
    }

    public boolean c(net.minecraft.stats.a a2) {
        return this.coP.acv().d(a2) && a2 != this.coQ;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.c((net.minecraft.stats.a)object);
    }
}

