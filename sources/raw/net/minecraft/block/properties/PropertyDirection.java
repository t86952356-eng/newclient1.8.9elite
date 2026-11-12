/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 */
package net.minecraft.block.properties;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.ao;

public class PropertyDirection
extends PropertyEnum<ao> {
    protected PropertyDirection(String string, Collection<ao> collection) {
        super(string, ao.class, collection);
    }

    public static PropertyDirection ct(String string) {
        return PropertyDirection.a(string, (Predicate<ao>)Predicates.alwaysTrue());
    }

    public static PropertyDirection a(String string, Predicate<ao> predicate) {
        return PropertyDirection.a(string, Collections2.filter((Collection)Lists.newArrayList((Object[])ao.values()), predicate));
    }

    public static PropertyDirection a(String string, Collection<ao> collection) {
        return new PropertyDirection(string, collection);
    }
}

