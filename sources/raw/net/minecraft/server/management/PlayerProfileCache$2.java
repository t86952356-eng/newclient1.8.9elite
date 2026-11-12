/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net.minecraft.server.management;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

class PlayerProfileCache$2
implements ProfileLookupCallback {
    final /* synthetic */ GameProfile[] dmt;

    PlayerProfileCache$2(GameProfile[] gameProfileArray) {
        this.dmt = gameProfileArray;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.dmt[0] = gameProfile;
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.dmt[0] = null;
    }
}

