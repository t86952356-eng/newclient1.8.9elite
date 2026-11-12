/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockStateHelper
implements Predicate<IBlockState> {
    private final BlockState bfW;
    private final Map<IProperty, Predicate> bfX = Maps.newHashMap();

    private BlockStateHelper(BlockState blockState) {
        this.bfW = blockState;
    }

    public static BlockStateHelper y(Block block) {
        return new BlockStateHelper(block.xL());
    }

    public boolean o(IBlockState iBlockState) {
        if (iBlockState != null && iBlockState.df().equals(this.bfW.df())) {
            for (Map.Entry<IProperty, Predicate> entry : this.bfX.entrySet()) {
                Object t2 = iBlockState.b(entry.getKey());
                if (entry.getValue().apply(t2)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public <V extends Comparable<V>> BlockStateHelper a(IProperty<V> iProperty, Predicate<? extends V> predicate) {
        if (!this.bfW.zT().contains(iProperty)) {
            throw new IllegalArgumentException(String.valueOf(this.bfW) + " cannot support property " + String.valueOf(iProperty));
        }
        this.bfX.put(iProperty, predicate);
        return this;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.o((IBlockState)object);
    }
}

