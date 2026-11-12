/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.bn;
import net.minecraft.util.bt;
import org.lwjgl.util.vector.Vector3f;

class BlockPart$Deserializer
implements JsonDeserializer<BlockPart> {
    BlockPart$Deserializer() {
    }

    public BlockPart c(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = this.l(jsonObject);
        Vector3f vector3f2 = this.k(jsonObject);
        BlockPartRotation blockPartRotation = this.h(jsonObject);
        Map<ao, BlockPartFace> map = this.a(jsonDeserializationContext, jsonObject);
        if (jsonObject.has("shade") && !bn.i(jsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        boolean bl2 = bn.a(jsonObject, "shade", true);
        return new BlockPart(vector3f, vector3f2, map, blockPartRotation, bl2);
    }

    private BlockPartRotation h(JsonObject jsonObject) {
        BlockPartRotation blockPartRotation = null;
        if (jsonObject.has("rotation")) {
            JsonObject jsonObject2 = bn.q(jsonObject, "rotation");
            Vector3f vector3f = this.g(jsonObject2, "origin");
            vector3f.scale(0.0625f);
            ap ap2 = this.j(jsonObject2);
            float f2 = this.i(jsonObject2);
            boolean bl2 = bn.a(jsonObject2, "rescale", false);
            blockPartRotation = new BlockPartRotation(vector3f, ap2, f2, bl2);
        }
        return blockPartRotation;
    }

    private float i(JsonObject jsonObject) {
        float f2 = bn.o(jsonObject, "angle");
        if (f2 != 0.0f && bt.bz(f2) != 22.5f && bt.bz(f2) != 45.0f) {
            throw new JsonParseException("Invalid rotation " + f2 + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return f2;
    }

    private ap j(JsonObject jsonObject) {
        String string = bn.m(jsonObject, "axis");
        ap ap2 = ap.gh(string.toLowerCase());
        if (ap2 == null) {
            throw new JsonParseException("Invalid rotation axis: " + string);
        }
        return ap2;
    }

    private Map<ao, BlockPartFace> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<ao, BlockPartFace> map = this.b(jsonDeserializationContext, jsonObject);
        if (map.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return map;
    }

    private Map<ao, BlockPartFace> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = Maps.newEnumMap(ao.class);
        JsonObject jsonObject2 = bn.q(jsonObject, "faces");
        for (Map.Entry entry : jsonObject2.entrySet()) {
            ao ao2 = this.dg((String)entry.getKey());
            enumMap.put(ao2, (BlockPartFace)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), BlockPartFace.class));
        }
        return enumMap;
    }

    private ao dg(String string) {
        ao ao2 = ao.gg(string);
        if (ao2 == null) {
            throw new JsonParseException("Unknown facing: " + string);
        }
        return ao2;
    }

    private Vector3f k(JsonObject jsonObject) {
        Vector3f vector3f = this.g(jsonObject, "to");
        if (vector3f.x >= -16.0f && vector3f.y >= -16.0f && vector3f.z >= -16.0f && vector3f.x <= 32.0f && vector3f.y <= 32.0f && vector3f.z <= 32.0f) {
            return vector3f;
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + String.valueOf(vector3f));
    }

    private Vector3f l(JsonObject jsonObject) {
        Vector3f vector3f = this.g(jsonObject, "from");
        if (vector3f.x >= -16.0f && vector3f.y >= -16.0f && vector3f.z >= -16.0f && vector3f.x <= 32.0f && vector3f.y <= 32.0f && vector3f.z <= 32.0f) {
            return vector3f;
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + String.valueOf(vector3f));
    }

    private Vector3f g(JsonObject jsonObject, String string) {
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
        return this.c(jsonElement, type, jsonDeserializationContext);
    }
}

