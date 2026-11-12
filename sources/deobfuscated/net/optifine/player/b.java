/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.cm;
import net.optifine.player.a;

public class b {
    private static final Pattern elV = Pattern.compile("[a-zA-Z0-9_]+");

    public static void g(net.minecraft.client.entity.a a2) {
        String string = a2.Dh();
        if (string != null && !string.isEmpty() && !string.contains("\u0000") && elV.matcher(string).matches()) {
            Object object;
            String string2 = "http://s.optifine.net/capes/" + string + ".png";
            cm cm2 = new cm("capeof/" + string);
            TextureManager textureManager = Minecraft.getMinecraft().Bq();
            ITextureObject iTextureObject = textureManager.k(cm2);
            if (iTextureObject != null && iTextureObject instanceof ThreadDownloadImageData) {
                object = (ThreadDownloadImageData)iTextureObject;
                if (((ThreadDownloadImageData)object).bPE != null) {
                    if (((ThreadDownloadImageData)object).bPE.booleanValue()) {
                        a2.f(cm2);
                        if (((ThreadDownloadImageData)object).Lq() instanceof a) {
                            a a3 = (a)((ThreadDownloadImageData)object).Lq();
                            a2.U(a3.Dk());
                        }
                    }
                    return;
                }
            }
            object = new a(a2, cm2);
            ThreadDownloadImageData threadDownloadImageData = new ThreadDownloadImageData(null, string2, null, (IImageBuffer)object);
            threadDownloadImageData.bPF = true;
            textureManager.a(cm2, threadDownloadImageData);
        }
    }

    public static BufferedImage f(BufferedImage bufferedImage) {
        int n2;
        int n3 = 64;
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        for (n2 = 32; n3 < n4 || n2 < n5; n3 *= 2, n2 *= 2) {
        }
        BufferedImage bufferedImage2 = new BufferedImage(n3, n2, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static boolean a(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        return bufferedImage.getWidth() > bufferedImage2.getHeight();
    }

    public static void h(net.minecraft.client.entity.a a2) {
        String string = a2.Dh();
        cm cm2 = new cm("capeof/" + string);
        TextureManager textureManager = net.minecraft.src.a.Bq();
        ITextureObject iTextureObject = textureManager.k(cm2);
        if (iTextureObject instanceof SimpleTexture) {
            SimpleTexture simpleTexture = (SimpleTexture)iTextureObject;
            simpleTexture.NJ();
            textureManager.l(cm2);
        }
        a2.f(null);
        a2.U(false);
        b.g(a2);
    }
}

