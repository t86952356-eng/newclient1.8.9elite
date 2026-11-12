/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.item.co;

class m
implements Function<co, String> {
    m() {
    }

    public String ax(co co2) {
        return BlockRedSandstone$EnumType.bh(co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

