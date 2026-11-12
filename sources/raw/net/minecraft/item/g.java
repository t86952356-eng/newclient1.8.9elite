/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.item;

import com.google.common.base.Function;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.item.co;

class g
implements Function<co, String> {
    g() {
    }

    public String ax(co co2) {
        return BlockFlower$EnumFlowerType.a(BlockFlower$EnumFlowerColor.aUY, co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

