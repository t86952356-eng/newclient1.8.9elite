/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.io.IOException;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.cm;
import net.minecraft.world.d;

public class GrassColorReloadListener
implements IResourceManagerReloadListener {
    private static final cm ccS = new cm("textures/colormap/grass.png");

    @Override
    public void a(IResourceManager iResourceManager) {
        try {
            d.m(TextureUtil.c(iResourceManager, ccS));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

