/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.util.bn;

class BlockFaceUV$Deserializer
implements JsonDeserializer<BlockFaceUV> {
    BlockFaceUV$Deserializer() {
    }

    public BlockFaceUV b(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] fArray = this.g(jsonObject);
        int n2 = this.f(jsonObject);
        return new BlockFaceUV(fArray, n2);
    }

    protected int f(JsonObject jsonObject) {
        int n2 = bn.a(jsonObject, "rotation", 0);
        if (n2 >= 0 && n2 % 90 == 0 && n2 / 90 <= 3) {
            return n2;
        }
        throw new JsonParseException("Invalid rotation " + n2 + " found, only 0/90/180/270 allowed");
    }

    private float[] g(JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        JsonArray jsonArray = bn.r(jsonObject, "uv");
        if (jsonArray.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
        }
        float[] fArray = new float[4];
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            fArray[i2] = bn.c(jsonArray.get(i2), "uv[" + i2 + "]");
        }
        return fArray;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.b(jsonElement, type, jsonDeserializationContext);
    }
}

