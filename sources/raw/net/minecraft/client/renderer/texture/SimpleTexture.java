/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.aq;
import net.optifine.shaders.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleTexture
extends AbstractTexture {
    private static final Logger bYs = LogManager.getLogger();
    protected final cm bYt;
    public cm bYu;
    public boolean bYv;

    public SimpleTexture(cm cm2) {
        this.bYt = cm2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(IResourceManager iResourceManager) {
        this.NJ();
        try (InputStream inputStream = null;){
            IResource iResource = iResourceManager.v(this.bYt);
            inputStream = iResource.getInputStream();
            BufferedImage bufferedImage = TextureUtil.d(inputStream);
            boolean bl2 = false;
            boolean bl3 = false;
            if (iResource.Pl()) {
                try {
                    TextureMetadataSection textureMetadataSection = (TextureMetadataSection)iResource.dx("texture");
                    if (textureMetadataSection != null) {
                        bl2 = textureMetadataSection.Qh();
                        bl3 = textureMetadataSection.Qi();
                    }
                }
                catch (RuntimeException runtimeException) {
                    bYs.warn("Failed reading metadata of: " + String.valueOf(this.bYt), (Throwable)runtimeException);
                }
            }
            if (a.aoG()) {
                ak.a(this.Ll(), bufferedImage, bl2, bl3, iResourceManager, this.bYt, this.NK());
            } else {
                TextureUtil.a(this.Ll(), bufferedImage, bl2, bl3);
            }
            if (aq.bd()) {
                aq.a(this.bYt, this);
            }
        }
    }
}

