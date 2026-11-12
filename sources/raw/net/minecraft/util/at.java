/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 */
package net.minecraft.util;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;
import net.minecraft.util.au;

public class at
implements TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class clazz = typeToken.getRawType();
        if (!clazz.isEnum()) {
            return null;
        }
        HashMap hashMap = Maps.newHashMap();
        for (Object t2 : clazz.getEnumConstants()) {
            hashMap.put(this.v(t2), t2);
        }
        return new au(this, hashMap);
    }

    private String v(Object object) {
        return object instanceof Enum ? ((Enum)object).name().toLowerCase(Locale.US) : object.toString().toLowerCase(Locale.US);
    }
}

