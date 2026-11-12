/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import java.util.List;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.ao;

public class BuiltInModel
implements IBakedModel {
    private final ItemCameraTransforms ceO;

    public BuiltInModel(ItemCameraTransforms itemCameraTransforms) {
        this.ceO = itemCameraTransforms;
    }

    @Override
    public List<BakedQuad> p(ao ao2) {
        return null;
    }

    @Override
    public List<BakedQuad> Qk() {
        return null;
    }

    @Override
    public boolean Mr() {
        return false;
    }

    @Override
    public boolean Ms() {
        return true;
    }

    @Override
    public boolean Ql() {
        return true;
    }

    @Override
    public TextureAtlasSprite Qm() {
        return null;
    }

    @Override
    public ItemCameraTransforms Qn() {
        return this.ceO;
    }
}

