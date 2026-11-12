/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.monster;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.r;
import net.minecraft.entity.player.e;

class s
implements Predicate<e> {
    final /* synthetic */ r cEA;

    s(r r2) {
        this.cEA = r2;
    }

    public boolean i(e e2) {
        return this.cEA.T((c)e2) < 2500.0 && e2.cIZ.amg();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.i((e)object);
    }
}

