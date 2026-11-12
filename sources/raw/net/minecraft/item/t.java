/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.item.co;

class t
implements Function<co, String> {
    t() {
    }

    public String ax(co co2) {
        return (co2.yc() & 1) == 1 ? "wet" : "dry";
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

