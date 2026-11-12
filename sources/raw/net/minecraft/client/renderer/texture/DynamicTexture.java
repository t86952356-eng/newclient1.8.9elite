/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;

public class DynamicTexture
extends AbstractTexture {
    private final int[] bYj;
    private final int bYk;
    private final int bYl;

    public DynamicTexture(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.bYj, 0, bufferedImage.getWidth());
        this.NL();
    }

    public DynamicTexture(int n2, int n3) {
        this.bYk = n2;
        this.bYl = n3;
        this.bYj = new int[n2 * n3];
        TextureUtil.x(this.Ll(), n2, n3);
    }

    @Override
    public void b(IResourceManager iResourceManager) {
    }

    public void NL() {
        TextureUtil.a(this.Ll(), this.bYj, this.bYk, this.bYl);
    }

    public int[] NM() {
        return this.bYj;
    }
}

