/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.settings;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

class b
implements ParameterizedType {
    b() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class};
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

