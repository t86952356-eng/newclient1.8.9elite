/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.resources.IResourceManager;
import net.optifine.shaders.ak;

public class h
extends AbstractTexture {
    public h() {
        this.b(null);
    }

    @Override
    public void b(IResourceManager iResourceManager) {
        int[] nArray = ak.bP(1, -1);
        ak.a(this.NK(), nArray, 1, 1, false, false);
    }
}

