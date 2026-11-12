/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.resources;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import net.minecraft.client.d;
import net.minecraft.client.resources.SkinManager;

class SkinManager$1
extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> {
    SkinManager$1(SkinManager skinManager) {
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> d(GameProfile gameProfile) {
        return d.AZ().BA().getTextures(gameProfile, false);
    }

    public /* synthetic */ Object load(Object object) {
        return this.d((GameProfile)object);
    }
}

