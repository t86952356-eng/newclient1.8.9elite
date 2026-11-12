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
import java.io.File;
import net.minecraft.server.management.UserList;
import net.minecraft.server.management.UserListEntry;
import net.minecraft.server.management.UserListWhitelistEntry;

public class UserListWhitelist
extends UserList<GameProfile, UserListWhitelistEntry> {
    public UserListWhitelist(File file) {
        super(file);
    }

    @Override
    protected UserListEntry<GameProfile> y(JsonObject jsonObject) {
        return new UserListWhitelistEntry(jsonObject);
    }

    @Override
    public String[] amD() {
        String[] stringArray = new String[this.amF().size()];
        int n2 = 0;
        for (UserListWhitelistEntry userListWhitelistEntry : this.amF().values()) {
            stringArray[n2++] = ((GameProfile)userListWhitelistEntry.wD()).getName();
        }
        return stringArray;
    }

    protected String p(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile fK(String string) {
        for (UserListWhitelistEntry userListWhitelistEntry : this.amF().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)userListWhitelistEntry.wD()).getName())) continue;
            return (GameProfile)userListWhitelistEntry.wD();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String t(Object object) {
        return this.p((GameProfile)object);
    }
}

