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

class bl
implements Predicate<c> {
    final /* synthetic */ int coNN;
    final /* synthetic */ int coO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bl(int n2, int n3) {
        this.coNN = n2;
        this.coO = n3;
    }

    public boolean B(c c2) {
        int n2 = az.ee((int)Math.floor(c2.pl));
        return this.coNN > this.coO ? n2 >= this.coNN || n2 <= this.coO : n2 >= this.coNN && n2 <= this.coO;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

