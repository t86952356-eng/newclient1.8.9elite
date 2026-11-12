/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LayeredTexture
extends AbstractTexture {
    private static final Logger bYq = LogManager.getLogger();
    public final List<String> bYr;
    private cm bCa;

    public LayeredTexture(String ... stringArray) {
        this.bYr = Lists.newArrayList((Object[])stringArray);
        if (stringArray.length > 0 && stringArray[0] != null) {
            this.bCa = new cm(stringArray[0]);
        }
    }

    @Override
    public void b(IResourceManager iResourceManager) {
        this.NJ();
        BufferedImage bufferedImage = null;
        try {
            for (String string : this.bYr) {
                if (string == null) continue;
                InputStream inputStream = iResourceManager.v(new cm(string)).getInputStream();
                BufferedImage bufferedImage2 = TextureUtil.d(inputStream);
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            bYq.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        if (a.aoG()) {
            ak.a(this.Ll(), bufferedImage, false, false, iResourceManager, this.bCa, this.NK());
        } else {
            TextureUtil.a(this.Ll(), bufferedImage);
        }
    }
}

