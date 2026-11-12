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
import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PreYggdrasilConverter;

class PreYggdrasilConverter$2
implements ProfileLookupCallback {
    final /* synthetic */ MinecraftServer dmC;
    final /* synthetic */ List dmD;

    PreYggdrasilConverter$2() {
        this.dmC = var1_1;
        this.dmD = var2_2;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.dmC.alS().f(gameProfile);
        this.dmD.add(gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        PreYggdrasilConverter.dmx.warn("Could not lookup user whitelist entry for " + gameProfile.getName(), (Throwable)exception);
    }
}

