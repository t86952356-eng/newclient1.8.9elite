/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.item.b;
import net.minecraft.src.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.optifine.shaders.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LayeredColorMaskTexture
extends AbstractTexture {
    private static final Logger bYm = LogManager.getLogger();
    private final cm bYn;
    private final List<String> bYo;
    private final List<b> bYp;

    public LayeredColorMaskTexture(cm cm2, List<String> list, List<b> list2) {
        this.bYn = cm2;
        this.bYo = list;
        this.bYp = list2;
    }

    @Override
    public void b(IResourceManager iResourceManager) {
        BufferedImage bufferedImage;
        this.NJ();
        try {
            BufferedImage bufferedImage2 = TextureUtil.d(iResourceManager.v(this.bYn).getInputStream());
            int n2 = bufferedImage2.getType();
            if (n2 == 0) {
                n2 = 6;
            }
            bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), n2);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.drawImage(bufferedImage2, 0, 0, null);
            for (int i2 = 0; i2 < 17 && i2 < this.bYo.size() && i2 < this.bYp.size(); ++i2) {
                InputStream inputStream;
                BufferedImage bufferedImage3;
                String string = this.bYo.get(i2);
                MapColor mapColor = this.bYp.get(i2).lv();
                if (string == null || (bufferedImage3 = TextureUtil.d(inputStream = iResourceManager.v(new cm(string)).getInputStream())).getWidth() != bufferedImage.getWidth() || bufferedImage3.getHeight() != bufferedImage.getHeight() || bufferedImage3.getType() != 6) continue;
                for (int i3 = 0; i3 < bufferedImage3.getHeight(); ++i3) {
                    for (int i4 = 0; i4 < bufferedImage3.getWidth(); ++i4) {
                        int n3 = bufferedImage3.getRGB(i4, i3);
                        if ((n3 & 0xFF000000) == 0) continue;
                        int n4 = (n3 & 0xFF0000) << 8 & 0xFF000000;
                        int n5 = bufferedImage2.getRGB(i4, i3);
                        int n6 = bt.aI(n5, mapColor.bem) & 0xFFFFFF;
                        bufferedImage3.setRGB(i4, i3, n4 | n6);
                    }
                }
                bufferedImage.getGraphics().drawImage(bufferedImage3, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            bYm.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        if (a.aoG()) {
            ak.a(this.Ll(), bufferedImage, false, false, iResourceManager, this.bYn, this.NK());
        } else {
            TextureUtil.a(this.Ll(), bufferedImage);
        }
    }
}

