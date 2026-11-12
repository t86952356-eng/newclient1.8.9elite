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

public class UserListOpsEntry
extends UserListEntry<GameProfile> {
    private final int dng;
    private final boolean dnh;

    public UserListOpsEntry(GameProfile gameProfile, int n2, boolean bl2) {
        super(gameProfile);
        this.dng = n2;
        this.dnh = bl2;
    }

    public UserListOpsEntry(JsonObject jsonObject) {
        super(UserListOpsEntry.B(jsonObject), jsonObject);
        this.dng = jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0;
        this.dnh = jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean();
    }

    public int amH() {
        return this.dng;
    }

    public boolean amI() {
        return this.dnh;
    }

    @Override
    protected void x(JsonObject jsonObject) {
        if (this.wD() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.wD()).getId() == null ? "" : ((GameProfile)this.wD()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.wD()).getName());
            super.x(jsonObject);
            jsonObject.addProperty("level", (Number)this.dng);
            jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.dnh));
        }
    }

    private static GameProfile B(JsonObject jsonObject) {
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

