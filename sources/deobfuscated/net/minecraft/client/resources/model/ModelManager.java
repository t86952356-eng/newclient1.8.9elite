/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.bf;

public class ModelManager
implements IResourceManagerReloadListener {
    private bf<ModelResourceLocation, IBakedModel> cfn;
    private final TextureMap cfo;
    private final BlockModelShapes cfp;
    private IBakedModel cfq;

    public ModelManager(TextureMap textureMap) {
        this.cfo = textureMap;
        this.cfp = new BlockModelShapes(this);
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        ModelBakery modelBakery = new ModelBakery(iResourceManager, this.cfo, this.cfp);
        this.cfn = modelBakery.Qo();
        this.cfq = this.cfn.w(ModelBakery.ceR);
        this.cfp.IW();
    }

    public IBakedModel a(ModelResourceLocation modelResourceLocation) {
        if (modelResourceLocation == null) {
            return this.cfq;
        }
        IBakedModel iBakedModel = this.cfn.w(modelResourceLocation);
        return iBakedModel == null ? this.cfq : iBakedModel;
    }

    public IBakedModel QA() {
        return this.cfq;
    }

    public TextureMap QB() {
        return this.cfo;
    }

    public BlockModelShapes IY() {
        return this.cfp;
    }
}

