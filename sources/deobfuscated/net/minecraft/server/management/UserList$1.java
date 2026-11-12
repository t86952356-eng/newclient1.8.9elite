/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.management;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import net.minecraft.server.management.UserListEntry;

class UserList$1
implements ParameterizedType {
    UserList$1() {
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{UserListEntry.class};
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

