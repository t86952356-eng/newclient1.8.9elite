/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;

class ItemCameraTransforms$Deserializer
implements JsonDeserializer<ItemCameraTransforms> {
    ItemCameraTransforms$Deserializer() {
    }

    public ItemCameraTransforms e(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        ItemTransformVec3f itemTransformVec3f = this.a(jsonDeserializationContext, jsonObject, "thirdperson");
        ItemTransformVec3f itemTransformVec3f2 = this.a(jsonDeserializationContext, jsonObject, "firstperson");
        ItemTransformVec3f itemTransformVec3f3 = this.a(jsonDeserializationContext, jsonObject, "head");
        ItemTransformVec3f itemTransformVec3f4 = this.a(jsonDeserializationContext, jsonObject, "gui");
        ItemTransformVec3f itemTransformVec3f5 = this.a(jsonDeserializationContext, jsonObject, "ground");
        ItemTransformVec3f itemTransformVec3f6 = this.a(jsonDeserializationContext, jsonObject, "fixed");
        return new ItemCameraTransforms(itemTransformVec3f, itemTransformVec3f2, itemTransformVec3f3, itemTransformVec3f4, itemTransformVec3f5, itemTransformVec3f6);
    }

    private ItemTransformVec3f a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? (ItemTransformVec3f)jsonDeserializationContext.deserialize(jsonObject.get(string), ItemTransformVec3f.class) : ItemTransformVec3f.bRG;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.e(jsonElement, type, jsonDeserializationContext);
    }
}

