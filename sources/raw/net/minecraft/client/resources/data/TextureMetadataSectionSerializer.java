/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.resources.data;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.minecraft.client.resources.data.BaseMetadataSectionSerializer;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.util.bn;

public class TextureMetadataSectionSerializer
extends BaseMetadataSectionSerializer<TextureMetadataSection> {
    public TextureMetadataSection n(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        boolean bl2 = bn.a(jsonObject, "blur", false);
        boolean bl3 = bn.a(jsonObject, "clamp", false);
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("mipmaps")) {
            try {
                JsonArray jsonArray = jsonObject.getAsJsonArray("mipmaps");
                for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                    JsonElement jsonElement2 = jsonArray.get(i2);
                    if (jsonElement2.isJsonPrimitive()) {
                        try {
                            arrayList.add(jsonElement2.getAsInt());
                            continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new JsonParseException("Invalid texture->mipmap->" + i2 + ": expected number, was " + String.valueOf(jsonElement2), (Throwable)numberFormatException);
                        }
                    }
                    if (!jsonElement2.isJsonObject()) continue;
                    throw new JsonParseException("Invalid texture->mipmap->" + i2 + ": expected number, was " + String.valueOf(jsonElement2));
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + String.valueOf(jsonObject.get("mipmaps")), (Throwable)classCastException);
            }
        }
        return new TextureMetadataSection(bl2, bl3, arrayList);
    }

    @Override
    public String Qc() {
        return "texture";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.n(jsonElement, type, jsonDeserializationContext);
    }
}

