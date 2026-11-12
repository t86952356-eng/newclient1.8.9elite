/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.util.concurrent.Callable;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

class TextureMap$2
implements Callable<String> {
    final /* synthetic */ TextureAtlasSprite bZY;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    TextureMap$2() {
        void var2_-1;
        this.bZY = var2_-1;
    }

    public String HV() {
        return this.bZY.NW() + " x " + this.bZY.NX();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

