/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.client.resources.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.client.resources.data.BaseMetadataSectionSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.util.ba;
import net.minecraft.util.bn;

public class PackMetadataSectionSerializer
extends BaseMetadataSectionSerializer<PackMetadataSection>
implements JsonSerializer<PackMetadataSection> {
    public PackMetadataSection m(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        ba ba2 = (ba)jsonDeserializationContext.deserialize(jsonObject.get("description"), ba.class);
        if (ba2 == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        int n2 = bn.p(jsonObject, "pack_format");
        return new PackMetadataSection(ba2, n2);
    }

    public JsonElement a(PackMetadataSection packMetadataSection, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", (Number)packMetadataSection.Qg());
        jsonObject.add("description", jsonSerializationContext.serialize((Object)packMetadataSection.Qf()));
        return jsonObject;
    }

    @Override
    public String Qc() {
        return "pack";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.m(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((PackMetadataSection)object, type, jsonSerializationContext);
    }
}

