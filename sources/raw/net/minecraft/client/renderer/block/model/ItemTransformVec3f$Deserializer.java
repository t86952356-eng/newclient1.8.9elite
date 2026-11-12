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
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import net.minecraft.util.bn;
import net.minecraft.util.bt;
import org.lwjgl.util.vector.Vector3f;

class ItemTransformVec3f$Deserializer
implements JsonDeserializer<ItemTransformVec3f> {
    private static final Vector3f bRK = new Vector3f(0.0f, 0.0f, 0.0f);
    private static final Vector3f bRL = new Vector3f(0.0f, 0.0f, 0.0f);
    private static final Vector3f bRM = new Vector3f(1.0f, 1.0f, 1.0f);

    ItemTransformVec3f$Deserializer() {
    }

    public ItemTransformVec3f f(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = this.a(jsonObject, "rotation", bRK);
        Vector3f vector3f2 = this.a(jsonObject, "translation", bRL);
        vector3f2.scale(0.0625f);
        vector3f2.x = bt.I(vector3f2.x, -1.5f, 1.5f);
        vector3f2.y = bt.I(vector3f2.y, -1.5f, 1.5f);
        vector3f2.z = bt.I(vector3f2.z, -1.5f, 1.5f);
        Vector3f vector3f3 = this.a(jsonObject, "scale", bRM);
        vector3f3.x = bt.I(vector3f3.x, -4.0f, 4.0f);
        vector3f3.y = bt.I(vector3f3.y, -4.0f, 4.0f);
        vector3f3.z = bt.I(vector3f3.z, -4.0f, 4.0f);
        return new ItemTransformVec3f(vector3f, vector3f2, vector3f3);
    }

    private Vector3f a(JsonObject jsonObject, String string, Vector3f vector3f) {
        if (!jsonObject.has(string)) {
            return vector3f;
        }
        JsonArray jsonArray = bn.r(jsonObject, string);
        if (jsonArray.size() != 3) {
            throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
        }
        float[] fArray = new float[3];
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            fArray[i2] = bn.c(jsonArray.get(i2), string + "[" + i2 + "]");
        }
        return new Vector3f(fArray[0], fArray[1], fArray[2]);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.f(jsonElement, type, jsonDeserializationContext);
    }
}

