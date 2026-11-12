/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 */
package net.minecraft.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.Map;
import net.minecraft.util.at;
import net.minecraft.util.ba;
import net.minecraft.util.bn;
import net.minecraft.util.n;
import net.minecraft.util.o;
import net.minecraft.util.p;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.util.v;
import net.minecraft.util.x;

public class bb
implements JsonDeserializer<ba>,
JsonSerializer<ba> {
    private static final Gson dys;

    public ba u(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String string;
        p p2;
        if (jsonElement.isJsonPrimitive()) {
            return new s(jsonElement.getAsString());
        }
        if (!jsonElement.isJsonObject()) {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                ba ba2 = null;
                for (JsonElement jsonElement2 : jsonArray) {
                    ba ba3 = this.u(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                    if (ba2 == null) {
                        ba2 = ba3;
                        continue;
                    }
                    ba2.n(ba3);
                }
                return ba2;
            }
            throw new JsonParseException("Don't know how to turn " + String.valueOf(jsonElement) + " into a Component");
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has("text")) {
            p2 = new s(jsonObject.get("text").getAsString());
        } else if (jsonObject.has("translate")) {
            string = jsonObject.get("translate").getAsString();
            if (jsonObject.has("with")) {
                JsonArray jsonArray = jsonObject.getAsJsonArray("with");
                Object[] objectArray = new Object[jsonArray.size()];
                for (int i2 = 0; i2 < objectArray.length; ++i2) {
                    s s2;
                    objectArray[i2] = this.u(jsonArray.get(i2), type, jsonDeserializationContext);
                    if (!(objectArray[i2] instanceof s) || !(s2 = (s)objectArray[i2]).arp().isEmpty() || !s2.aro().isEmpty()) continue;
                    objectArray[i2] = s2.arr();
                }
                p2 = new t(string, objectArray);
            } else {
                p2 = new t(string, new Object[0]);
            }
        } else if (jsonObject.has("score")) {
            string = jsonObject.getAsJsonObject("score");
            if (!string.has("name") || !string.has("objective")) {
                throw new JsonParseException("A score component needs a least a name and an objective");
            }
            p2 = new n(bn.m((JsonObject)string, "name"), bn.m((JsonObject)string, "objective"));
            if (string.has("value")) {
                ((n)p2).cp(bn.m((JsonObject)string, "value"));
            }
        } else {
            if (!jsonObject.has("selector")) {
                throw new JsonParseException("Don't know how to turn " + String.valueOf(jsonElement) + " into a Component");
            }
            p2 = new o(bn.m(jsonObject, "selector"));
        }
        if (jsonObject.has("extra")) {
            string = jsonObject.getAsJsonArray("extra");
            if (string.size() <= 0) {
                throw new JsonParseException("Unexpected empty array of components");
            }
            for (int i3 = 0; i3 < string.size(); ++i3) {
                p2.n(this.u(string.get(i3), type, jsonDeserializationContext));
            }
        }
        p2.a((v)jsonDeserializationContext.deserialize(jsonElement, v.class));
        return p2;
    }

    private void a(v v2, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)v2);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }

    public JsonElement a(ba ba2, Type type, JsonSerializationContext jsonSerializationContext) {
        Object object;
        if (ba2 instanceof s && ba2.arp().isEmpty() && ba2.aro().isEmpty()) {
            return new JsonPrimitive(((s)ba2).arr());
        }
        JsonObject jsonObject = new JsonObject();
        if (!ba2.arp().isEmpty()) {
            this.a(ba2.arp(), jsonObject, jsonSerializationContext);
        }
        if (!ba2.aro().isEmpty()) {
            object = new JsonArray();
            for (ba objectArray : ba2.aro()) {
                object.add(this.a(objectArray, objectArray.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)object);
        }
        if (ba2 instanceof s) {
            jsonObject.addProperty("text", ((s)ba2).arr());
        } else if (ba2 instanceof t) {
            object = (t)ba2;
            jsonObject.addProperty("translate", ((t)object).SM());
            if (((t)object).aru() != null && ((t)object).aru().length > 0) {
                var6_6 = new JsonArray();
                for (Object object2 : ((t)object).aru()) {
                    if (object2 instanceof ba) {
                        var6_6.add(this.a((ba)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    var6_6.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                }
                jsonObject.add("with", (JsonElement)var6_6);
            }
        } else if (ba2 instanceof n) {
            object = (n)ba2;
            var6_6 = new JsonObject();
            var6_6.addProperty("name", ((n)object).getName());
            var6_6.addProperty("objective", ((n)object).ari());
            var6_6.addProperty("value", ((n)object).arj());
            jsonObject.add("score", (JsonElement)var6_6);
        } else {
            if (!(ba2 instanceof o)) {
                throw new IllegalArgumentException("Don't know how to serialize " + String.valueOf(ba2) + " as a Component");
            }
            object = (o)ba2;
            jsonObject.addProperty("selector", ((o)object).arm());
        }
        return jsonObject;
    }

    public static String q(ba ba2) {
        return dys.toJson((Object)ba2);
    }

    public static ba gi(String string) {
        return (ba)dys.fromJson(string, ba.class);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.u(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ba)object, type, jsonSerializationContext);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(ba.class, (Object)new bb());
        gsonBuilder.registerTypeHierarchyAdapter(v.class, (Object)new x());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new at());
        dys = gsonBuilder.create();
    }
}

