/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
package net.minecraft.block.properties;

import com.google.common.base.Objects;
import net.minecraft.block.properties.IProperty;

public abstract class PropertyHelper<T extends Comparable<T>>
implements IProperty<T> {
    private final Class<T> bfh;
    private final String name;

    protected PropertyHelper(String string, Class<T> clazz) {
        this.bfh = clazz;
        this.name = string;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Class<T> zM() {
        return this.bfh;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.name).add("clazz", this.bfh).add("values", this.zL()).toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            PropertyHelper propertyHelper = (PropertyHelper)object;
            return this.bfh.equals(propertyHelper.bfh) && this.name.equals(propertyHelper.name);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.bfh.hashCode() + this.name.hashCode();
    }
}

