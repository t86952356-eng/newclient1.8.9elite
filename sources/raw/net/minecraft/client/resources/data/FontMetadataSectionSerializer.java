/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.resources.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.client.resources.data.BaseMetadataSectionSerializer;
import net.minecraft.client.resources.data.FontMetadataSection;
import net.minecraft.util.bn;
import org.apache.commons.lang3.Validate;

public class FontMetadataSectionSerializer
extends BaseMetadataSectionSerializer<FontMetadataSection> {
    public FontMetadataSection k(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] fArray = new float[256];
        float[] fArray2 = new float[256];
        float[] fArray3 = new float[256];
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (jsonObject.has("characters")) {
            if (!jsonObject.get("characters").isJsonObject()) {
                throw new JsonParseException("Invalid font->characters: expected object, was " + String.valueOf(jsonObject.get("characters")));
            }
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("characters");
            if (jsonObject2.has("default")) {
                if (!jsonObject2.get("default").isJsonObject()) {
                    throw new JsonParseException("Invalid font->characters->default: expected object, was " + String.valueOf(jsonObject2.get("default")));
                }
                JsonObject jsonObject3 = jsonObject2.getAsJsonObject("default");
                f2 = bn.a(jsonObject3, "width", f2);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f2, (String)"Invalid default width");
                f3 = bn.a(jsonObject3, "spacing", f3);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f3, (String)"Invalid default spacing");
                f4 = bn.a(jsonObject3, "left", f3);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f4, (String)"Invalid default left");
            }
            for (int i2 = 0; i2 < 256; ++i2) {
                JsonElement jsonElement2 = jsonObject2.get(Integer.toString(i2));
                float f5 = f2;
                float f6 = f3;
                float f7 = f4;
                if (jsonElement2 != null) {
                    JsonObject jsonObject4 = bn.e(jsonElement2, "characters[" + i2 + "]");
                    f5 = bn.a(jsonObject4, "width", f2);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f5, (String)"Invalid width");
                    f6 = bn.a(jsonObject4, "spacing", f3);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f6, (String)"Invalid spacing");
                    f7 = bn.a(jsonObject4, "left", f4);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f7, (String)"Invalid left");
                }
                fArray[i2] = f5;
                fArray2[i2] = f6;
                fArray3[i2] = f7;
            }
        }
        return new FontMetadataSection(fArray, fArray3, fArray2);
    }

    @Override
    public String Qc() {
        return "font";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.k(jsonElement, type, jsonDeserializationContext);
    }
}

