/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variants;
import net.minecraft.util.bn;

public class ModelBlockDefinition$Deserializer
implements JsonDeserializer<ModelBlockDefinition> {
    public ModelBlockDefinition h(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<ModelBlockDefinition$Variants> list = this.d(jsonDeserializationContext, jsonObject);
        return new ModelBlockDefinition((Collection<ModelBlockDefinition$Variants>)list);
    }

    protected List<ModelBlockDefinition$Variants> d(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        JsonObject jsonObject2 = bn.q(jsonObject, "variants");
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry entry : jsonObject2.entrySet()) {
            arrayList.add(this.a(jsonDeserializationContext, entry));
        }
        return arrayList;
    }

    protected ModelBlockDefinition$Variants a(JsonDeserializationContext jsonDeserializationContext, Map.Entry<String, JsonElement> entry) {
        String string = entry.getKey();
        ArrayList arrayList = Lists.newArrayList();
        JsonElement jsonElement = entry.getValue();
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                arrayList.add((ModelBlockDefinition$Variant)jsonDeserializationContext.deserialize(jsonElement2, ModelBlockDefinition$Variant.class));
            }
        } else {
            arrayList.add((ModelBlockDefinition$Variant)jsonDeserializationContext.deserialize(jsonElement, ModelBlockDefinition$Variant.class));
        }
        return new ModelBlockDefinition$Variants(string, arrayList);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.h(jsonElement, type, jsonDeserializationContext);
    }
}

