/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import java.util.concurrent.Callable;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

class TextureMap$1
implements Callable<String> {
    final /* synthetic */ TextureAtlasSprite bZX;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    TextureMap$1() {
        void var2_-1;
        this.bZX = var2_-1;
    }

    public String HV() {
        return this.bZX.Oc();
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

