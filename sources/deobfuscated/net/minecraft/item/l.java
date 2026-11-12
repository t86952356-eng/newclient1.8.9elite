/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.item.co;

class l
implements Function<co, String> {
    l() {
    }

    public String ax(co co2) {
        return BlockPrismarine$EnumType.be(co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

