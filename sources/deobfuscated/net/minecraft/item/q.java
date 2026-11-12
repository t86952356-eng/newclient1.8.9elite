/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.item.co;

class q
implements Function<co, String> {
    q() {
    }

    public String ax(co co2) {
        return BlockSand$EnumType.bj(co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

