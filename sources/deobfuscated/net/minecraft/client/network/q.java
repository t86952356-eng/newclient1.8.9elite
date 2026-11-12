/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.network;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;

class q {
    static final /* synthetic */ int[] bFv;

    static {
        bFv = new int[MinecraftProfileTexture.Type.values().length];
        try {
            q.bFv[MinecraftProfileTexture.Type.SKIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            q.bFv[MinecraftProfileTexture.Type.CAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

