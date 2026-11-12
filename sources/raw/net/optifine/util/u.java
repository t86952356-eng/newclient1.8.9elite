/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.Iterator;
import net.optifine.util.t;
import net.optifine.util.v;

class u
implements Iterator<v<T>> {
    v<T> eul;
    final /* synthetic */ t eMV;

    u(t t2) {
        this.eMV = t2;
        this.eul = this.eMV.aJg();
    }

    @Override
    public boolean hasNext() {
        return this.eul != null;
    }

    public v<T> aJi() {
        v v2 = this.eul;
        if (this.eul != null) {
            this.eul = this.eul.eMY;
        }
        return v2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override
    public /* synthetic */ Object next() {
        return this.aJi();
    }
}

