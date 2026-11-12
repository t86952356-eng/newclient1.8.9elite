/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.util;

import com.google.common.base.Function;
import java.util.Arrays;
import java.util.List;

class i<T>
implements Function<Object[], List<T>> {
    private i() {
    }

    public List<T> d(Object[] objectArray) {
        return Arrays.asList(objectArray);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.d((Object[])object);
    }
}

