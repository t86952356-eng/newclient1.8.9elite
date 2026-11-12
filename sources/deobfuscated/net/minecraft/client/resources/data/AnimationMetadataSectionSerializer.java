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
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.resources.data;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.BaseMetadataSectionSerializer;
import net.minecraft.util.bn;
import org.apache.commons.lang3.Validate;

public class AnimationMetadataSectionSerializer
extends BaseMetadataSectionSerializer<AnimationMetadataSection>
implements JsonSerializer<AnimationMetadataSection> {
    public AnimationMetadataSection j(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        JsonObject jsonObject = bn.e(jsonElement, "metadata section");
        int n3 = bn.a(jsonObject, "frametime", 1);
        if (n3 != 1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n3, (String)"Invalid default frame time");
        }
        if (jsonObject.has("frames")) {
            try {
                JsonArray jsonArray = bn.r(jsonObject, "frames");
                for (n2 = 0; n2 < jsonArray.size(); ++n2) {
                    JsonElement jsonElement2 = jsonArray.get(n2);
                    AnimationFrame animationFrame = this.a(n2, jsonElement2);
                    if (animationFrame == null) continue;
                    arrayList.add(animationFrame);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + String.valueOf(jsonObject.get("frames")), (Throwable)classCastException);
            }
        }
        int n4 = bn.a(jsonObject, "width", -1);
        n2 = bn.a(jsonObject, "height", -1);
        if (n4 != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n4, (String)"Invalid width");
        }
        if (n2 != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n2, (String)"Invalid height");
        }
        boolean bl2 = bn.a(jsonObject, "interpolate", false);
        return new AnimationMetadataSection(arrayList, n4, n2, n3, bl2);
    }

    private AnimationFrame a(int n2, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new AnimationFrame(bn.d(jsonElement, "frames[" + n2 + "]"));
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = bn.e(jsonElement, "frames[" + n2 + "]");
            int n3 = bn.a(jsonObject, "time", -1);
            if (jsonObject.has("time")) {
                Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n3, (String)"Invalid frame time");
            }
            int n4 = bn.p(jsonObject, "index");
            Validate.inclusiveBetween((long)0L, (long)Integer.MAX_VALUE, (long)n4, (String)"Invalid frame index");
            return new AnimationFrame(n4, n3);
        }
        return null;
    }

    public JsonElement a(AnimationMetadataSection animationMetadataSection, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", (Number)animationMetadataSection.PW());
        if (animationMetadataSection.PZ() != -1) {
            jsonObject.addProperty("width", (Number)animationMetadataSection.PZ());
        }
        if (animationMetadataSection.PY() != -1) {
            jsonObject.addProperty("height", (Number)animationMetadataSection.PY());
        }
        if (animationMetadataSection.Of() > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i2 = 0; i2 < animationMetadataSection.Of(); ++i2) {
                if (animationMetadataSection.dW(i2)) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("index", (Number)animationMetadataSection.dX(i2));
                    jsonObject2.addProperty("time", (Number)animationMetadataSection.dV(i2));
                    jsonArray.add((JsonElement)jsonObject2);
                    continue;
                }
                jsonArray.add((JsonElement)new JsonPrimitive((Number)animationMetadataSection.dX(i2)));
            }
            jsonObject.add("frames", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    @Override
    public String Qc() {
        return "animation";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.j(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((AnimationMetadataSection)object, type, jsonSerializationContext);
    }
}

