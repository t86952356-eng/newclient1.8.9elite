/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.command.az;
import net.minecraft.entity.c;

class bb
implements Predicate<c> {
    final /* synthetic */ int cou;
    final /* synthetic */ int cov;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bb(int n2, int n3) {
        this.cou = n2;
        this.cov = n3;
    }

    public boolean B(c c2) {
        int n2 = az.ee((int)Math.floor(c2.pm));
        return this.cou > this.cov ? n2 >= this.cou || n2 <= this.cov : n2 >= this.cou && n2 <= this.cov;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

