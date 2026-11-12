/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.block.properties;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import net.minecraft.block.properties.PropertyHelper;
import net.minecraft.util.bg;

public class PropertyEnum<T extends Enum<T>>
extends PropertyHelper<T> {
    private final ImmutableSet<T> bff;
    private final Map<String, T> bfg = Maps.newHashMap();

    protected PropertyEnum(String string, Class<T> clazz, Collection<T> collection) {
        super(string, clazz);
        this.bff = ImmutableSet.copyOf(collection);
        for (Enum enum_ : collection) {
            String string2 = ((bg)((Object)enum_)).getName();
            if (this.bfg.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.bfg.put(string2, enum_);
        }
    }

    @Override
    public Collection<T> zL() {
        return this.bff;
    }

    @Override
    public String a(T t2) {
        return ((bg)t2).getName();
    }

    public static <T extends Enum<T>> PropertyEnum<T> c(String string, Class<T> clazz) {
        return PropertyEnum.a(string, clazz, Predicates.alwaysTrue());
    }

    public static <T extends Enum<T>> PropertyEnum<T> a(String string, Class<T> clazz, Predicate<T> predicate) {
        return PropertyEnum.a(string, clazz, Collections2.filter((Collection)Lists.newArrayList((Object[])((Enum[])clazz.getEnumConstants())), predicate));
    }

    public static <T extends Enum<T>> PropertyEnum<T> a(String string, Class<T> clazz, T ... TArray) {
        return PropertyEnum.a(string, clazz, Lists.newArrayList((Object[])TArray));
    }

    public static <T extends Enum<T>> PropertyEnum<T> a(String string, Class<T> clazz, Collection<T> collection) {
        return new PropertyEnum<T>(string, clazz, collection);
    }
}

