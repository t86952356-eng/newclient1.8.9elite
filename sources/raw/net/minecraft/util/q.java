/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.util;

import com.google.common.base.Function;
import java.util.Iterator;
import net.minecraft.util.ba;

class q
implements Function<ba, Iterator<ba>> {
    q() {
    }

    public Iterator<ba> o(ba ba2) {
        return ba2.iterator();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.o((ba)object);
    }
}

