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
import net.minecraft.server.management.UserListBansEntry;
import net.minecraft.server.management.UserListEntry;

public class UserListBans
extends UserList<GameProfile, UserListBansEntry> {
    public UserListBans(File file) {
        super(file);
    }

    @Override
    protected UserListEntry<GameProfile> y(JsonObject jsonObject) {
        return new UserListBansEntry(jsonObject);
    }

    public boolean o(GameProfile gameProfile) {
        return this.u(gameProfile);
    }

    @Override
    public String[] amD() {
        String[] stringArray = new String[this.amF().size()];
        int n2 = 0;
        for (UserListBansEntry userListBansEntry : this.amF().values()) {
            stringArray[n2++] = ((GameProfile)userListBansEntry.wD()).getName();
        }
        return stringArray;
    }

    protected String p(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile fI(String string) {
        for (UserListBansEntry userListBansEntry : this.amF().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)userListBansEntry.wD()).getName())) continue;
            return (GameProfile)userListBansEntry.wD();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String t(Object object) {
        return this.p((GameProfile)object);
    }
}

