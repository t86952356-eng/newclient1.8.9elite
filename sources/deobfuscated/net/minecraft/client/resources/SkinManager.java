/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
package net.minecraft.client.resources;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.resources.SkinManager$1;
import net.minecraft.client.resources.SkinManager$2;
import net.minecraft.client.resources.SkinManager$3;
import net.minecraft.client.resources.SkinManager$SkinAvailableCallback;
import net.minecraft.util.cm;
import rise.util.InstanceAccess;

public class SkinManager
implements InstanceAccess {
    private static final ExecutorService cee = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    private final TextureManager cef;
    private final File ceg;
    private final MinecraftSessionService ceh;
    private final LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> cei;

    public SkinManager(TextureManager textureManager, File file, MinecraftSessionService minecraftSessionService) {
        this.cef = textureManager;
        this.ceg = file;
        this.ceh = minecraftSessionService;
        this.cei = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new SkinManager$1(this));
    }

    public cm a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return this.a(minecraftProfileTexture, type, null);
    }

    public cm a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, SkinManager$SkinAvailableCallback skinManager$SkinAvailableCallback) {
        cm cm2 = new cm("skins/" + minecraftProfileTexture.getHash());
        ITextureObject iTextureObject = this.cef.k(cm2);
        if (iTextureObject != null) {
            if (skinManager$SkinAvailableCallback != null) {
                skinManager$SkinAvailableCallback.a(type, cm2, minecraftProfileTexture);
            }
        } else {
            File file = new File(this.ceg, minecraftProfileTexture.getHash().length() > 2 ? minecraftProfileTexture.getHash().substring(0, 2) : "xx");
            File file2 = new File(file, minecraftProfileTexture.getHash());
            ImageBufferDownload imageBufferDownload = type == MinecraftProfileTexture.Type.SKIN ? new ImageBufferDownload() : null;
            ThreadDownloadImageData threadDownloadImageData = new ThreadDownloadImageData(file2, minecraftProfileTexture.getUrl(), DefaultPlayerSkin.Pg(), new SkinManager$2(this, (IImageBuffer)imageBufferDownload, skinManager$SkinAvailableCallback, type, cm2, minecraftProfileTexture));
            this.cef.a(cm2, threadDownloadImageData);
        }
        return cm2;
    }

    public void a(GameProfile gameProfile, SkinManager$SkinAvailableCallback skinManager$SkinAvailableCallback, boolean bl2) {
        cee.submit(new SkinManager$3(this, gameProfile, bl2, skinManager$SkinAvailableCallback));
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> c(GameProfile gameProfile) {
        return (Map)this.cei.getUnchecked((Object)gameProfile);
    }
}

