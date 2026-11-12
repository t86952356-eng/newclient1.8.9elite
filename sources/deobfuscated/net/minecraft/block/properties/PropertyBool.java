/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package net.minecraft.block.properties;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.minecraft.block.properties.PropertyHelper;

public class PropertyBool
extends PropertyHelper<Boolean> {
    private final ImmutableSet<Boolean> bfe = ImmutableSet.of((Object)true, (Object)false);

    protected PropertyBool(String string) {
        super(string, Boolean.class);
    }

    @Override
    public Collection<Boolean> zL() {
        return this.bfe;
    }

    public static PropertyBool cs(String string) {
        return new PropertyBool(string);
    }

    public String d(Boolean bl2) {
        return bl2.toString();
    }

    @Override
    public /* synthetic */ String a(Comparable comparable) {
        return this.d((Boolean)comparable);
    }
}

