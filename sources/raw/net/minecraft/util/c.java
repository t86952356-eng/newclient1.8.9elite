/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Iterator;
import net.minecraft.util.b;
import net.minecraft.util.d;

class c
implements Iterable<b> {
    final /* synthetic */ b dtW;
    final /* synthetic */ b dtX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    c(b b2, b b3) {
        this.dtW = b2;
        this.dtX = b3;
    }

    @Override
    public Iterator<b> iterator() {
        return new d(this);
    }
}

