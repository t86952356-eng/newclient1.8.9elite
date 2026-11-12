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
import java.util.Date;
import java.util.UUID;
import net.minecraft.server.management.BanEntry;

public class UserListBansEntry
extends BanEntry<GameProfile> {
    public UserListBansEntry(GameProfile gameProfile) {
        this(gameProfile, (Date)null, (String)null, (Date)null, (String)null);
    }

    public UserListBansEntry(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super(gameProfile, date2, string, date2, string2);
    }

    public UserListBansEntry(JsonObject jsonObject) {
        super(UserListBansEntry.A(jsonObject), jsonObject);
    }

    @Override
    protected void x(JsonObject jsonObject) {
        if (this.wD() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.wD()).getId() == null ? "" : ((GameProfile)this.wD()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.wD()).getName());
            super.x(jsonObject);
        }
    }

    private static GameProfile A(JsonObject jsonObject) {
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

