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

class f
implements Function<co, String> {
    f() {
    }

    public String ax(co co2) {
        return BlockFlower$EnumFlowerType.a(BlockFlower$EnumFlowerColor.aUXX, co2.yc()).xB();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.ax((co)object);
    }
}

