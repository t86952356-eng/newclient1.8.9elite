/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.resources.model;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BreakingFour;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.SimpleBakedModel;
import net.minecraft.util.ao;

public class SimpleBakedModel$Builder {
    private final List<BakedQuad> cfU = Lists.newArrayList();
    private final List<List<BakedQuad>> cfV = Lists.newArrayListWithCapacity((int)6);
    private final boolean cfW;
    private TextureAtlasSprite cfX;
    private final boolean cfY;
    private final ItemCameraTransforms cfZ;

    public SimpleBakedModel$Builder(ModelBlock modelBlock) {
        this(modelBlock.Mr(), modelBlock.Ms(), modelBlock.Mw());
    }

    public SimpleBakedModel$Builder(IBakedModel iBakedModel, TextureAtlasSprite textureAtlasSprite) {
        this(iBakedModel.Mr(), iBakedModel.Ms(), iBakedModel.Qn());
        this.cfX = iBakedModel.Qm();
        for (ao ao2 : ao.values()) {
            this.a(iBakedModel, textureAtlasSprite, ao2);
        }
        this.a(iBakedModel, textureAtlasSprite);
    }

    private void a(IBakedModel iBakedModel, TextureAtlasSprite textureAtlasSprite, ao ao2) {
        for (BakedQuad bakedQuad : iBakedModel.p(ao2)) {
            this.a(ao2, new BreakingFour(bakedQuad, textureAtlasSprite));
        }
    }

    private void a(IBakedModel iBakedModel, TextureAtlasSprite textureAtlasSprite) {
        for (BakedQuad bakedQuad : iBakedModel.Qk()) {
            this.a(new BreakingFour(bakedQuad, textureAtlasSprite));
        }
    }

    private SimpleBakedModel$Builder(boolean bl2, boolean bl3, ItemCameraTransforms itemCameraTransforms) {
        for (ao ao2 : ao.values()) {
            this.cfV.add(Lists.newArrayList());
        }
        this.cfW = bl2;
        this.cfY = bl3;
        this.cfZ = itemCameraTransforms;
    }

    public SimpleBakedModel$Builder a(ao ao2, BakedQuad bakedQuad) {
        this.cfV.get(ao2.ordinal()).add(bakedQuad);
        return this;
    }

    public SimpleBakedModel$Builder a(BakedQuad bakedQuad) {
        this.cfU.add(bakedQuad);
        return this;
    }

    public SimpleBakedModel$Builder i(TextureAtlasSprite textureAtlasSprite) {
        this.cfX = textureAtlasSprite;
        return this;
    }

    public IBakedModel QF() {
        if (this.cfX == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new SimpleBakedModel(this.cfU, this.cfV, this.cfW, this.cfY, this.cfX, this.cfZ);
    }
}

