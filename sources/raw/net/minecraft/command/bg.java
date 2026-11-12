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

class bg
implements Predicate<c> {
    final /* synthetic */ int coC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bg(int n2) {
        this.coC = n2;
    }

    public boolean B(c c2) {
        if (!(c2 instanceof e)) {
            return false;
        }
        e e2 = (e)c2;
        return e2.cIZ.If().awE() == this.coC;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

