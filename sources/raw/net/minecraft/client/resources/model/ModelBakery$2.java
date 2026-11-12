/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import java.util.Set;
import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.util.cm;

class ModelBakery$2
implements IIconCreator {
    final /* synthetic */ Set cfl;
    final /* synthetic */ ModelBakery cfm;

    ModelBakery$2() {
        this.cfm = var1_1;
        this.cfl = var2_2;
    }

    @Override
    public void a(TextureMap textureMap) {
        for (cm cm2 : this.cfl) {
            TextureAtlasSprite textureAtlasSprite = textureMap.n(cm2);
            this.cfm.ceV.put(cm2, textureAtlasSprite);
        }
    }
}

