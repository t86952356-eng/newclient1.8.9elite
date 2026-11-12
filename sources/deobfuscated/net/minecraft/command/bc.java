/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import net.minecraft.entity.c;
import net.minecraft.util.a;

class bc
implements Predicate<c> {
    final /* synthetic */ a cow;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bc(a a2) {
        this.cow = a2;
    }

    public boolean B(c c2) {
        return c2.gW >= this.cow.dtH && c2.gX >= this.cow.dtI && c2.gY >= this.cow.dtJ && c2.gW < this.cow.dtK && c2.gX < this.cow.dtL && c2.gY < this.cow.dtM;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

