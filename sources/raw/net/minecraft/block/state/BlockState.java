/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.base.Objects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState$StateImplementation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.bs;
import net.minecraft.util.h;

public class BlockState {
    private static final Joiner bfq = Joiner.on((String)", ");
    private static final Function<IProperty, String> bfr = iProperty -> iProperty == null ? "<NULL>" : iProperty.getName();
    private final Block bfs;
    private final ImmutableList<IProperty> bft;
    private final ImmutableList<IBlockState> bfu;

    public BlockState(Block block, IProperty ... iPropertyArray) {
        this.bfs = block;
        Arrays.sort(iPropertyArray, Comparator.comparing(IProperty::getName));
        this.bft = ImmutableList.copyOf((Object[])iPropertyArray);
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (List<Comparable> object : h.a(this.zR())) {
            Map<IProperty, Comparable> map = bs.a(this.bft, object);
            BlockState$StateImplementation blockState$StateImplementation = new BlockState$StateImplementation(block, (ImmutableMap<IProperty, Comparable>)ImmutableMap.copyOf(map));
            linkedHashMap.put(map, blockState$StateImplementation);
            arrayList.add(blockState$StateImplementation);
        }
        for (BlockState$StateImplementation blockState$StateImplementation : arrayList) {
            blockState$StateImplementation.d(linkedHashMap);
        }
        this.bfu = ImmutableList.copyOf((Collection)arrayList);
    }

    public ImmutableList<IBlockState> zQ() {
        return this.bfu;
    }

    private List<Iterable<Comparable>> zR() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.bft.size(); ++i2) {
            arrayList.add(((IProperty)this.bft.get(i2)).zL());
        }
        return arrayList;
    }

    public IBlockState zS() {
        return (IBlockState)this.bfu.get(0);
    }

    public Block df() {
        return this.bfs;
    }

    public Collection<IProperty> zT() {
        return this.bft;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("block", Block.aRV.y(this.bfs)).add("properties", this.bft.stream().map(arg_0 -> bfr.apply(arg_0)).collect(Collectors.toList())).toString();
    }
}

