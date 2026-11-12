/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Iterator;
import net.minecraft.util.b;
import net.minecraft.util.f;
import net.minecraft.util.g;

class e
implements Iterable<g> {
    final /* synthetic */ b dua;
    final /* synthetic */ b dub;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    e(b b2, b b3) {
        this.dua = b2;
        this.dub = b3;
    }

    @Override
    public Iterator<g> iterator() {
        return new f(this);
    }
}

