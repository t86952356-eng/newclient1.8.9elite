/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package net.minecraft.block.state;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;

public interface IBlockState {
    public Collection<IProperty> zU();

    public <T extends Comparable<T>> T b(IProperty<T> var1);

    public <T extends Comparable<T>, V extends T> IBlockState a(IProperty<T> var1, V var2);

    public <T extends Comparable<T>> IBlockState c(IProperty<T> var1);

    public ImmutableMap<IProperty, Comparable> zV();

    public Block df();
}

