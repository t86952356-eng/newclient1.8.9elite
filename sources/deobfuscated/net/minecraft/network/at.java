/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.network;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.network.ao;
import net.minecraft.network.ap;
import net.minecraft.network.ar;
import net.minecraft.util.ba;
import net.minecraft.util.bn;

public class at
implements JsonDeserializer<ao>,
JsonSerializer<ao> {
    public ao q(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = bn.e(jsonElement, "status");
        ao ao2 = new ao();
        if (jsonObject.has("description")) {
            ao2.k((ba)jsonDeserializationContext.deserialize(jsonObject.get("description"), ba.class));
        }
        if (jsonObject.has("players")) {
            ao2.a((ar)jsonDeserializationContext.deserialize(jsonObject.get("players"), ar.class));
        }
        if (jsonObject.has("version")) {
            ao2.a((ap)jsonDeserializationContext.deserialize(jsonObject.get("version"), ap.class));
        }
        if (jsonObject.has("favicon")) {
            ao2.eU(bn.m(jsonObject, "favicon"));
        }
        return ao2;
    }

    public JsonElement a(ao ao2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (ao2.afB() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)ao2.afB()));
        }
        if (ao2.afC() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)ao2.afC()));
        }
        if (ao2.afD() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)ao2.afD()));
        }
        if (ao2.afE() != null) {
            jsonObject.addProperty("favicon", ao2.afE());
        }
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.q(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ao)object, type, jsonSerializationContext);
    }
}

