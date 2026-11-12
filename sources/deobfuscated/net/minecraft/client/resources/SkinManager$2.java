/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.resources;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.resources.SkinManager$SkinAvailableCallback;
import net.minecraft.util.cm;

class SkinManager$2
implements IImageBuffer {
    final /* synthetic */ IImageBuffer cej;
    final /* synthetic */ SkinManager$SkinAvailableCallback cek;
    final /* synthetic */ MinecraftProfileTexture.Type cel;
    final /* synthetic */ cm cem;
    final /* synthetic */ MinecraftProfileTexture cen;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    SkinManager$2() {
        void var6_-1;
        void var5_-1;
        void var4_-1;
        void var3_-1;
        void var2_-1;
        this.cej = var2_-1;
        this.cek = var3_-1;
        this.cel = var4_-1;
        this.cem = var5_-1;
        this.cen = var6_-1;
    }

    @Override
    public BufferedImage d(BufferedImage bufferedImage) {
        if (this.cej != null) {
            bufferedImage = this.cej.d(bufferedImage);
        }
        return bufferedImage;
    }

    @Override
    public void Ki() {
        if (this.cej != null) {
            this.cej.Ki();
        }
        if (this.cek != null) {
            this.cek.a(this.cel, this.cem, this.cen);
        }
    }
}

