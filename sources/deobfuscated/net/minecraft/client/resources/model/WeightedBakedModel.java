/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import java.util.List;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.WeightedBakedModel$MyWeighedRandomItem;
import net.minecraft.util.ao;
import net.minecraft.util.de;

public class WeightedBakedModel
implements IBakedModel {
    private final int cga;
    private final List<WeightedBakedModel$MyWeighedRandomItem> cgb;
    private final IBakedModel cgc;

    public WeightedBakedModel(List<WeightedBakedModel$MyWeighedRandomItem> list) {
        this.cgb = list;
        this.cga = de.f(list);
        this.cgc = list.get((int)0).cge;
    }

    @Override
    public List<BakedQuad> p(ao ao2) {
        return this.cgc.p(ao2);
    }

    @Override
    public List<BakedQuad> Qk() {
        return this.cgc.Qk();
    }

    @Override
    public boolean Mr() {
        return this.cgc.Mr();
    }

    @Override
    public boolean Ms() {
        return this.cgc.Ms();
    }

    @Override
    public boolean Ql() {
        return this.cgc.Ql();
    }

    @Override
    public TextureAtlasSprite Qm() {
        return this.cgc.Qm();
    }

    @Override
    public ItemCameraTransforms Qn() {
        return this.cgc.Qn();
    }

    public IBakedModel u(long l2) {
        return de.a(this.cgb, (int)(Math.abs((int)((int)l2 >> 16)) % this.cga)).cge;
    }
}

