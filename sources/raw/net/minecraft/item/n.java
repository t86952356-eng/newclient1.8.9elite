/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.item.co;

class n
implements Function<co, String> {
    n() {
    }

    public String ax(co co2) {
        return BlockDirt$DirtType.aP(co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

