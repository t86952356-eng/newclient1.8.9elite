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
import net.minecraft.server.management.UserListOpsEntry;

public class UserListOps
extends UserList<GameProfile, UserListOpsEntry> {
    public UserListOps(File file) {
        super(file);
    }

    @Override
    protected UserListEntry<GameProfile> y(JsonObject jsonObject) {
        return new UserListOpsEntry(jsonObject);
    }

    @Override
    public String[] amD() {
        String[] stringArray = new String[this.amF().size()];
        int n2 = 0;
        for (UserListOpsEntry userListOpsEntry : this.amF().values()) {
            stringArray[n2++] = ((GameProfile)userListOpsEntry.wD()).getName();
        }
        return stringArray;
    }

    public boolean q(GameProfile gameProfile) {
        UserListOpsEntry userListOpsEntry = (UserListOpsEntry)this.r(gameProfile);
        return userListOpsEntry != null && userListOpsEntry.amI();
    }

    protected String p(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile fJ(String string) {
        for (UserListOpsEntry userListOpsEntry : this.amF().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)userListOpsEntry.wD()).getName())) continue;
            return (GameProfile)userListOpsEntry.wD();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String t(Object object) {
        return this.p((GameProfile)object);
    }
}

