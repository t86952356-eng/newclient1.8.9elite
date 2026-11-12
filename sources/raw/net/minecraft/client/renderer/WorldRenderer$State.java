/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class WorldRenderer$State {
    private final int[] bQn;
    private final VertexFormat bQo;
    private TextureAtlasSprite[] bQp;

    public WorldRenderer$State(WorldRenderer worldRenderer, int[] nArray, VertexFormat vertexFormat, TextureAtlasSprite[] textureAtlasSpriteArray) {
        this.bQn = nArray;
        this.bQo = vertexFormat;
        this.bQp = textureAtlasSpriteArray;
    }

    public int[] LN() {
        return this.bQn;
    }

    public int LC() {
        return this.bQn.length / this.bQo.OS();
    }

    public VertexFormat LB() {
        return this.bQo;
    }
}

