/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.network;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.network.o;
import net.minecraft.client.resources.SkinManager$SkinAvailableCallback;
import net.minecraft.util.cm;

class p
implements SkinManager$SkinAvailableCallback {
    final /* synthetic */ o bFu;

    p(o o2) {
        this.bFu = o2;
    }

    @Override
    public void a(MinecraftProfileTexture.Type type, cm cm2, MinecraftProfileTexture minecraftProfileTexture) {
        switch (type) {
            case SKIN: {
                this.bFu.bFl = cm2;
                this.bFu.bFn = minecraftProfileTexture.getMetadata("model");
                if (this.bFu.bFn != null) break;
                this.bFu.bFn = "default";
                break;
            }
            case CAPE: {
                this.bFu.bFm = cm2;
            }
        }
    }
}

