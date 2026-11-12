/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.Iterator;
import net.minecraft.util.b;
import net.optifine.f;

class e
implements Iterable {
    final /* synthetic */ b dVA;
    final /* synthetic */ b dVB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    e(b b2, b b3) {
        this.dVA = b2;
        this.dVB = b3;
    }

    public Iterator iterator() {
        return new f(this);
    }
}

