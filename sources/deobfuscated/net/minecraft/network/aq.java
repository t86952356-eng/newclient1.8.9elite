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
import net.minecraft.network.ap;
import net.minecraft.util.bn;

public class aq
implements JsonDeserializer<ap>,
JsonSerializer<ap> {
    public ap o(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = bn.e(jsonElement, "version");
        return new ap(bn.m(jsonObject, "name"), bn.p(jsonObject, "protocol"));
    }

    public JsonElement a(ap ap2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", ap2.getName());
        jsonObject.addProperty("protocol", (Number)ap2.afF());
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.o(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ap)object, type, jsonSerializationContext);
    }
}

