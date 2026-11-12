/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.network;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;
import net.minecraft.network.ar;
import net.minecraft.util.bn;

public class as
implements JsonDeserializer<ar>,
JsonSerializer<ar> {
    public ar p(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonArray;
        JsonObject jsonObject = bn.e(jsonElement, "players");
        ar ar2 = new ar(bn.p(jsonObject, "max"), bn.p(jsonObject, "online"));
        if (bn.j(jsonObject, "sample") && (jsonArray = bn.r(jsonObject, "sample")).size() > 0) {
            GameProfile[] gameProfileArray = new GameProfile[jsonArray.size()];
            for (int i2 = 0; i2 < gameProfileArray.length; ++i2) {
                JsonObject jsonObject2 = bn.e(jsonArray.get(i2), "player[" + i2 + "]");
                String string = bn.m(jsonObject2, "id");
                gameProfileArray[i2] = new GameProfile(UUID.fromString(string), bn.m(jsonObject2, "name"));
            }
            ar2.a(gameProfileArray);
        }
        return ar2;
    }

    public JsonElement a(ar ar2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)ar2.getMaxPlayers());
        jsonObject.addProperty("online", (Number)ar2.afG());
        if (ar2.afH() != null && ar2.afH().length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i2 = 0; i2 < ar2.afH().length; ++i2) {
                JsonObject jsonObject2 = new JsonObject();
                UUID uUID = ar2.afH()[i2].getId();
                jsonObject2.addProperty("id", uUID == null ? "" : uUID.toString());
                jsonObject2.addProperty("name", ar2.afH()[i2].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.p(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ar)object, type, jsonSerializationContext);
    }
}

