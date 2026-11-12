/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.event.c;
import net.minecraft.event.d;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.v;

public class x
implements JsonDeserializer<v>,
JsonSerializer<v> {
    public v t(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            Object object;
            b b2;
            JsonPrimitive jsonPrimitive;
            JsonObject jsonObject;
            v v2 = new v();
            JsonObject jsonObject2 = jsonElement.getAsJsonObject();
            if (jsonObject2 == null) {
                return null;
            }
            if (jsonObject2.has("bold")) {
                v2.duw = jsonObject2.get("bold").getAsBoolean();
            }
            if (jsonObject2.has("italic")) {
                v2.dux = jsonObject2.get("italic").getAsBoolean();
            }
            if (jsonObject2.has("underlined")) {
                v2.duy = jsonObject2.get("underlined").getAsBoolean();
            }
            if (jsonObject2.has("strikethrough")) {
                v2.duz = jsonObject2.get("strikethrough").getAsBoolean();
            }
            if (jsonObject2.has("obfuscated")) {
                v2.duA = jsonObject2.get("obfuscated").getAsBoolean();
            }
            if (jsonObject2.has("color")) {
                v2.duv = (an)((Object)jsonDeserializationContext.deserialize(jsonObject2.get("color"), an.class));
            }
            if (jsonObject2.has("insertion")) {
                v2.duD = jsonObject2.get("insertion").getAsString();
            }
            if (jsonObject2.has("clickEvent") && (jsonObject = jsonObject2.getAsJsonObject("clickEvent")) != null) {
                String string;
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                b2 = jsonPrimitive == null ? null : b.em(jsonPrimitive.getAsString());
                object = jsonObject.getAsJsonPrimitive("value");
                String string2 = string = object == null ? null : object.getAsString();
                if (b2 != null && string != null && b2.acT()) {
                    v2.duB = new a(b2, string);
                }
            }
            if (jsonObject2.has("hoverEvent") && (jsonObject = jsonObject2.getAsJsonObject("hoverEvent")) != null) {
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                b2 = jsonPrimitive == null ? null : d.en(jsonPrimitive.getAsString());
                object = (ba)jsonDeserializationContext.deserialize(jsonObject.get("value"), ba.class);
                if (b2 != null && object != null && ((d)((Object)b2)).acT()) {
                    v2.duC = new c((d)((Object)b2), (ba)object);
                }
            }
            return v2;
        }
        return null;
    }

    public JsonElement a(v v2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        if (v2.isEmpty()) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        if (v2.duw != null) {
            jsonObject2.addProperty("bold", v2.duw);
        }
        if (v2.dux != null) {
            jsonObject2.addProperty("italic", v2.dux);
        }
        if (v2.duy != null) {
            jsonObject2.addProperty("underlined", v2.duy);
        }
        if (v2.duz != null) {
            jsonObject2.addProperty("strikethrough", v2.duz);
        }
        if (v2.duA != null) {
            jsonObject2.addProperty("obfuscated", v2.duA);
        }
        if (v2.duv != null) {
            jsonObject2.add("color", jsonSerializationContext.serialize((Object)v2.duv));
        }
        if (v2.duD != null) {
            jsonObject2.add("insertion", jsonSerializationContext.serialize((Object)v2.duD));
        }
        if (v2.duB != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", v2.duB.acS().acU());
            jsonObject.addProperty("value", v2.duB.SN());
            jsonObject2.add("clickEvent", (JsonElement)jsonObject);
        }
        if (v2.duC != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", v2.duC.acW().acU());
            jsonObject.add("value", jsonSerializationContext.serialize((Object)v2.duC.acX()));
            jsonObject2.add("hoverEvent", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.t(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((v)object, type, jsonSerializationContext);
    }
}

