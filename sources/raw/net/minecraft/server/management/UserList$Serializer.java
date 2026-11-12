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
package net.minecraft.server.management;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.server.management.UserList;
import net.minecraft.server.management.UserListEntry;

class UserList$Serializer
implements JsonDeserializer<UserListEntry<K>>,
JsonSerializer<UserListEntry<K>> {
    final /* synthetic */ UserList dne;

    private UserList$Serializer(UserList userList) {
        this.dne = userList;
    }

    public JsonElement a(UserListEntry<K> userListEntry, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        userListEntry.x(jsonObject);
        return jsonObject;
    }

    public UserListEntry<K> s(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            UserListEntry userListEntry = this.dne.y(jsonObject);
            return userListEntry;
        }
        return null;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.s(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((UserListEntry)object, type, jsonSerializationContext);
    }
}

