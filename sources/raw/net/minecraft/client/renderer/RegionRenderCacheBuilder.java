/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.av;

public class RegionRenderCacheBuilder {
    private final WorldRenderer[] bNF = new WorldRenderer[av.values().length];

    public RegionRenderCacheBuilder() {
        this.bNF[av.dxV.ordinal()] = new WorldRenderer(0x200000);
        this.bNF[av.dxX.ordinal()] = new WorldRenderer(131072);
        this.bNF[av.dxW.ordinal()] = new WorldRenderer(131072);
        this.bNF[av.dxY.ordinal()] = new WorldRenderer(262144);
    }

    public WorldRenderer b(av av2) {
        return this.bNF[av2.ordinal()];
    }

    public WorldRenderer di(int n2) {
        return this.bNF[n2];
    }
}

