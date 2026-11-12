/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.server.management;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.server.management.UserListEntry;

public class UserListWhitelistEntry
extends UserListEntry<GameProfile> {
    public UserListWhitelistEntry(GameProfile gameProfile) {
        super(gameProfile);
    }

    public UserListWhitelistEntry(JsonObject jsonObject) {
        super(UserListWhitelistEntry.C(jsonObject), jsonObject);
    }

    @Override
    protected void x(JsonObject jsonObject) {
        if (this.wD() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.wD()).getId() == null ? "" : ((GameProfile)this.wD()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.wD()).getName());
            super.x(jsonObject);
        }
    }

    private static GameProfile C(JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            UUID uUID;
            String string = jsonObject.get("uuid").getAsString();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }
}

