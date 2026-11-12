/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.command;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.entity.c;
import net.minecraft.util.b;

class bd
implements Comparator<c> {
    final /* synthetic */ b cox;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bd(b b2) {
        this.cox = b2;
    }

    public int b(c c2, c c3) {
        return ComparisonChain.start().compare(c2.aa(this.cox), c3.aa(this.cox)).result();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((c)object, (c)object2);
    }
}

