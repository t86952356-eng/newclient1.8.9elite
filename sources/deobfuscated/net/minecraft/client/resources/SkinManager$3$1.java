/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.resources;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import net.minecraft.client.resources.SkinManager$3;

class SkinManager$3$1
implements Runnable {
    final /* synthetic */ Map ces;
    final /* synthetic */ SkinManager$3 cet;

    SkinManager$3$1() {
        this.cet = var1_1;
        this.ces = var2_2;
    }

    @Override
    public void run() {
        if (this.ces.containsKey(MinecraftProfileTexture.Type.SKIN)) {
            this.cet.cer.a((MinecraftProfileTexture)this.ces.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, this.cet.ceq);
        }
        if (this.ces.containsKey(MinecraftProfileTexture.Type.CAPE)) {
            this.cet.cer.a((MinecraftProfileTexture)this.ces.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.cet.ceq);
        }
    }
}

