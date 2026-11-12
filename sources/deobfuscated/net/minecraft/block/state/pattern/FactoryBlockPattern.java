/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.pattern.BlockPattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class FactoryBlockPattern {
    private static final Joiner bfY = Joiner.on((String)",");
    private final List<String[]> bfZ = Lists.newArrayList();
    private final Map<Character, Predicate<BlockWorldState>> bga = Maps.newHashMap();
    private int bgb;
    private int bgc;

    private FactoryBlockPattern() {
        this.bga.put(Character.valueOf(' '), (Predicate<BlockWorldState>)Predicates.alwaysTrue());
    }

    public FactoryBlockPattern g(String ... stringArray) {
        if (!ArrayUtils.isEmpty((Object[])stringArray) && !StringUtils.isEmpty((CharSequence)stringArray[0])) {
            if (this.bfZ.isEmpty()) {
                this.bgb = stringArray.length;
                this.bgc = stringArray[0].length();
            }
            if (stringArray.length != this.bgb) {
                throw new IllegalArgumentException("Expected aisle with height of " + this.bgb + ", but was given one with a height of " + stringArray.length + ")");
            }
            for (String string : stringArray) {
                if (string.length() != this.bgc) {
                    throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.bgc + ", found one with " + string.length() + ")");
                }
                for (char c2 : string.toCharArray()) {
                    if (this.bga.containsKey(Character.valueOf(c2))) continue;
                    this.bga.put(Character.valueOf(c2), null);
                }
            }
            this.bfZ.add(stringArray);
            return this;
        }
        throw new IllegalArgumentException("Empty pattern for aisle");
    }

    public static FactoryBlockPattern Aj() {
        return new FactoryBlockPattern();
    }

    public FactoryBlockPattern a(char c2, Predicate<BlockWorldState> predicate) {
        this.bga.put(Character.valueOf(c2), predicate);
        return this;
    }

    public BlockPattern Ak() {
        return new BlockPattern(this.Al());
    }

    private Predicate<BlockWorldState>[][][] Al() {
        this.Am();
        Predicate[][][] predicateArray = (Predicate[][][])Array.newInstance(Predicate.class, this.bfZ.size(), this.bgb, this.bgc);
        for (int i2 = 0; i2 < this.bfZ.size(); ++i2) {
            for (int i3 = 0; i3 < this.bgb; ++i3) {
                for (int i4 = 0; i4 < this.bgc; ++i4) {
                    predicateArray[i2][i3][i4] = this.bga.get(Character.valueOf(this.bfZ.get(i2)[i3].charAt(i4)));
                }
            }
        }
        return predicateArray;
    }

    private void Am() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<Character, Predicate<BlockWorldState>> entry : this.bga.entrySet()) {
            if (entry.getValue() != null) continue;
            arrayList.add(entry.getKey());
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + bfY.join((Iterable)arrayList) + " are missing");
        }
    }
}

