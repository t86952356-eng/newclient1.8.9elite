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
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.server.management;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.management.PlayerProfileCache$ProfileEntry;

class PlayerProfileCache$Serializer
implements JsonDeserializer<PlayerProfileCache$ProfileEntry>,
JsonSerializer<PlayerProfileCache$ProfileEntry> {
    final /* synthetic */ PlayerProfileCache dmw;

    private PlayerProfileCache$Serializer(PlayerProfileCache playerProfileCache) {
        this.dmw = playerProfileCache;
    }

    public JsonElement a(PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", playerProfileCache$ProfileEntry.Ie().getName());
        UUID uUID = playerProfileCache$ProfileEntry.Ie().getId();
        jsonObject.addProperty("uuid", uUID == null ? "" : uUID.toString());
        jsonObject.addProperty("expiresOn", PlayerProfileCache.dml.format(playerProfileCache$ProfileEntry.amn()));
        return jsonObject;
    }

    public PlayerProfileCache$ProfileEntry r(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = jsonObject.get("name");
            JsonElement jsonElement3 = jsonObject.get("uuid");
            JsonElement jsonElement4 = jsonObject.get("expiresOn");
            if (jsonElement2 != null && jsonElement3 != null) {
                String string = jsonElement3.getAsString();
                String string2 = jsonElement2.getAsString();
                Date date = null;
                if (jsonElement4 != null) {
                    try {
                        date = PlayerProfileCache.dml.parse(jsonElement4.getAsString());
                    }
                    catch (ParseException parseException) {
                        date = null;
                    }
                }
                if (string2 != null && string != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    PlayerProfileCache playerProfileCache = this.dmw;
                    Objects.requireNonNull(playerProfileCache);
                    PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = new PlayerProfileCache$ProfileEntry(playerProfileCache, new GameProfile(uUID, string2), date);
                    return playerProfileCache$ProfileEntry;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.r(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((PlayerProfileCache$ProfileEntry)object, type, jsonSerializationContext);
    }
}

