/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.resources.data;

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import net.minecraft.client.resources.Language;
import net.minecraft.client.resources.data.BaseMetadataSectionSerializer;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.util.bn;

public class LanguageMetadataSectionSerializer
extends BaseMetadataSectionSerializer<LanguageMetadataSection> {
    public LanguageMetadataSection l(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashSet hashSet = Sets.newHashSet();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = (String)entry.getKey();
            JsonObject jsonObject2 = bn.e((JsonElement)entry.getValue(), "language");
            String string2 = bn.m(jsonObject2, "region");
            String string3 = bn.m(jsonObject2, "name");
            boolean bl2 = bn.a(jsonObject2, "bidirectional", false);
            if (string2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->region: empty value");
            }
            if (string3.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->name: empty value");
            }
            if (hashSet.add(new Language(string, string2, string3, bl2))) continue;
            throw new JsonParseException("Duplicate language->'" + string + "' defined");
        }
        return new LanguageMetadataSection(hashSet);
    }

    @Override
    public String Qc() {
        return "language";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.l(jsonElement, type, jsonDeserializationContext);
    }
}

