/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 */
package net.minecraft.block.state;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;

class BlockState$StateImplementation
extends BlockStateBase {
    private final Block bfv;
    private final ImmutableMap<IProperty, Comparable> bfw;
    private ImmutableTable<IProperty, Comparable, IBlockState> bfx;

    private BlockState$StateImplementation(Block block, ImmutableMap<IProperty, Comparable> immutableMap) {
        this.bfv = block;
        this.bfw = immutableMap;
    }

    @Override
    public Collection<IProperty> zU() {
        return Collections.unmodifiableCollection(this.bfw.keySet());
    }

    @Override
    public <T extends Comparable<T>> T b(IProperty<T> iProperty) {
        if (!this.bfw.containsKey(iProperty)) {
            throw new IllegalArgumentException("Cannot get property " + String.valueOf(iProperty) + " as it does not exist in " + String.valueOf(this.bfv.xL()));
        }
        return (T)((Comparable)iProperty.zM().cast(this.bfw.get(iProperty)));
    }

    @Override
    public <T extends Comparable<T>, V extends T> IBlockState a(IProperty<T> iProperty, V v2) {
        if (!this.bfw.containsKey(iProperty)) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf(iProperty) + " as it does not exist in " + String.valueOf(this.bfv.xL()));
        }
        if (!iProperty.zL().contains(v2)) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf(iProperty) + " to " + String.valueOf(v2) + " on block " + String.valueOf(Block.aRV.y(this.bfv)) + ", it is not an allowed value");
        }
        return this.bfw.get(iProperty) == v2 ? this : (IBlockState)this.bfx.get(iProperty, v2);
    }

    @Override
    public ImmutableMap<IProperty, Comparable> zV() {
        return this.bfw;
    }

    @Override
    public Block df() {
        return this.bfv;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return this.bfw.hashCode();
    }

    public void d(Map<Map<IProperty, Comparable>, BlockState$StateImplementation> map) {
        if (this.bfx != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (IProperty iProperty : this.bfw.keySet()) {
            for (Object t2 : iProperty.zL()) {
                if (t2 == this.bfw.get((Object)iProperty)) continue;
                hashBasedTable.put((Object)iProperty, (Object)((Comparable)t2), (Object)map.get(this.b(iProperty, (Comparable)t2)));
            }
        }
        this.bfx = ImmutableTable.copyOf((Table)hashBasedTable);
    }

    private Map<IProperty, Comparable> b(IProperty iProperty, Comparable comparable) {
        HashMap hashMap = Maps.newHashMap(this.bfw);
        hashMap.put(iProperty, comparable);
        return hashMap;
    }
}

