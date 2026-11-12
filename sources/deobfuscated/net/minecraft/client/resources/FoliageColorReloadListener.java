/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.io.IOException;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.cm;
import net.minecraft.world.c;

public class FoliageColorReloadListener
implements IResourceManagerReloadListener {
    private static final cm ccR = new cm("textures/colormap/foliage.png");

    @Override
    public void a(IResourceManager iResourceManager) {
        try {
            c.l(TextureUtil.c(iResourceManager, ccR));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

