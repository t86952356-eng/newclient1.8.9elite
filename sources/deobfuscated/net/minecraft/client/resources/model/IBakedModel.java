/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import java.util.List;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ao;

public interface IBakedModel {
    public List<BakedQuad> p(ao var1);

    public List<BakedQuad> Qk();

    public boolean Mr();

    public boolean Ms();

    public boolean Ql();

    public TextureAtlasSprite Qm();

    public ItemCameraTransforms Qn();
}

