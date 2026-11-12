/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
package net.minecraft.util;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.y;

class z
implements Iterable<S> {
    final /* synthetic */ Class duK;
    final /* synthetic */ y duL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    z(y y2, Class clazz) {
        this.duL = y2;
        this.duK = clazz;
    }

    @Override
    public Iterator<S> iterator() {
        List list = this.duL.duG.get(this.duL.p(this.duK));
        if (list == null) {
            return Iterators.emptyIterator();
        }
        Iterator iterator = list.iterator();
        return Iterators.filter(iterator, (Class)this.duK);
    }
}

