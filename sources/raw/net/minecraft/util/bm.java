/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ForwardingSet
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
package net.minecraft.util;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.util.bc;

public class bm
extends ForwardingSet<String>
implements bc {
    private final Set<String> dyB = Sets.newHashSet();

    @Override
    public void e(JsonElement jsonElement) {
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                this.add(jsonElement2.getAsString());
            }
        }
    }

    @Override
    public JsonElement atk() {
        JsonArray jsonArray = new JsonArray();
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            jsonArray.add((JsonElement)new JsonPrimitive(string));
        }
        return jsonArray;
    }

    protected Set<String> delegate() {
        return this.dyB;
    }
}

