/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.util.concurrent.Callable;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

class TextureMap$3
implements Callable<String> {
    final /* synthetic */ TextureAtlasSprite bZZ;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    TextureMap$3() {
        void var2_-1;
        this.bZZ = var2_-1;
    }

    public String HV() {
        return this.bZZ.Of() + " frames";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

