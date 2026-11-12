/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.item.co;

class bu
implements Function<co, String> {
    final /* synthetic */ String[] cWJ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bu(String[] stringArray) {
        this.cWJ = stringArray;
    }

    public String ax(co co2) {
        int n2 = co2.yc();
        if (n2 < 0 || n2 >= this.cWJ.length) {
            n2 = 0;
        }
        return this.cWJ[n2];
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

