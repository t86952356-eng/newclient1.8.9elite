/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
package net.minecraft.block.properties;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.block.properties.PropertyHelper;

public class PropertyInteger
extends PropertyHelper<Integer> {
    private final ImmutableSet<Integer> bfj;

    protected PropertyInteger(String string, int n2, int n3) {
        super(string, Integer.class);
        if (n2 < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n3 <= n2) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n2 + ")");
        }
        HashSet hashSet = Sets.newHashSet();
        for (int i2 = n2; i2 <= n3; ++i2) {
            hashSet.add(i2);
        }
        this.bfj = ImmutableSet.copyOf((Collection)hashSet);
    }

    @Override
    public Collection<Integer> zL() {
        return this.bfj;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            PropertyInteger propertyInteger = (PropertyInteger)object;
            return this.bfj.equals(propertyInteger.bfj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.bfj.hashCode();
        return n2;
    }

    public static PropertyInteger e(String string, int n2, int n3) {
        return new PropertyInteger(string, n2, n3);
    }

    @Override
    public String a(Integer n2) {
        return n2.toString();
    }
}

