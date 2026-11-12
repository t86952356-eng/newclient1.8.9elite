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

public class SimpleBakedModel
implements IBakedModel {
    protected final List<BakedQuad> cfO;
    protected final List<List<BakedQuad>> cfP;
    protected final boolean cfQ;
    protected final boolean cfR;
    protected final TextureAtlasSprite cfS;
    protected final ItemCameraTransforms cfT;

    public SimpleBakedModel(List<BakedQuad> list, List<List<BakedQuad>> list2, boolean bl2, boolean bl3, TextureAtlasSprite textureAtlasSprite, ItemCameraTransforms itemCameraTransforms) {
        this.cfO = list;
        this.cfP = list2;
        this.cfQ = bl2;
        this.cfR = bl3;
        this.cfS = textureAtlasSprite;
        this.cfT = itemCameraTransforms;
    }

    @Override
    public List<BakedQuad> p(ao ao2) {
        return this.cfP.get(ao2.ordinal());
    }

    @Override
    public List<BakedQuad> Qk() {
        return this.cfO;
    }

    @Override
    public boolean Mr() {
        return this.cfQ;
    }

    @Override
    public boolean Ms() {
        return this.cfR;
    }

    @Override
    public boolean Ql() {
        return false;
    }

    @Override
    public TextureAtlasSprite Qm() {
        return this.cfS;
    }

    @Override
    public ItemCameraTransforms Qn() {
        return this.cfT;
    }
}

