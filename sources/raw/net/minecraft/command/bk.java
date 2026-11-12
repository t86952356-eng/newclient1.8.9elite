/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.util.b;

class bk
implements Predicate<c> {
    final /* synthetic */ b coI;
    final /* synthetic */ int coJ;
    final /* synthetic */ int coK;
    final /* synthetic */ int coL;
    final /* synthetic */ int coM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bk(b b2, int n2, int n3, int n4, int n5) {
        this.coI = b2;
        this.coJ = n2;
        this.coK = n3;
        this.coL = n4;
        this.coM = n5;
    }

    public boolean B(c c2) {
        int n2 = (int)c2.ab(this.coI);
        return !(this.coJ >= 0 && n2 < this.coK || this.coL >= 0 && n2 > this.coM);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

