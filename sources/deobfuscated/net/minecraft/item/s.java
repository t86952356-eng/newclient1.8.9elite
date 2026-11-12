/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.item.co;

class s
implements Function<co, String> {
    s() {
    }

    public String ax(co co2) {
        return BlockPlanks$EnumType.bd(co2.yc() + 4).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

