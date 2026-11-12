/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableTable
 */
package net.minecraft.block.state;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.cm;

public abstract class BlockStateBase
implements IBlockState {
    private static final Joiner bfy = Joiner.on((char)',');
    private static final Function<Map.Entry<IProperty, Comparable>, String> bfz = entry -> {
        if (entry == null) {
            return "<NULL>";
        }
        IProperty iProperty = (IProperty)entry.getKey();
        return iProperty.getName() + "=" + iProperty.a((Comparable)entry.getValue());
    };
    private int bfA = -1;
    private int bfB = -1;
    private int aTI = -1;
    private cm bfC = null;

    public int zW() {
        if (this.bfA < 0) {
            this.bfA = Block.i(this.df());
        }
        return this.bfA;
    }

    public int zX() {
        if (this.bfB < 0) {
            this.bfB = Block.a(this);
        }
        return this.bfB;
    }

    public int yc() {
        if (this.aTI < 0) {
            this.aTI = this.df().c(this);
        }
        return this.aTI;
    }

    public cm zY() {
        if (this.bfC == null) {
            this.bfC = (cm)Block.aRV.y(this.df());
        }
        return this.bfC;
    }

    public ImmutableTable<IProperty<?>, Comparable<?>, IBlockState> zZ() {
        return null;
    }

    @Override
    public <T extends Comparable<T>> IBlockState c(IProperty<T> iProperty) {
        return this.a(iProperty, (Comparable)BlockStateBase.a(iProperty.zL(), this.b(iProperty)));
    }

    protected static <T> T a(Collection<T> collection, T t2) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(t2)) continue;
            if (iterator.hasNext()) {
                return iterator.next();
            }
            return collection.iterator().next();
        }
        return iterator.next();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Block.aRV.y(this.df()));
        if (!this.zV().isEmpty()) {
            stringBuilder.append("[");
            bfy.appendTo(stringBuilder, (Iterable)this.zV().entrySet().stream().map(arg_0 -> bfz.apply(arg_0)).collect(Collectors.toList()));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

