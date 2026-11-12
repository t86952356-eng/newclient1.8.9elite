/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.l;
import net.optifine.render.g;
import net.optifine.s;
import net.optifine.shaders.z;

public class BlockFluidRenderer {
    private final TextureAtlasSprite[] bHu = new TextureAtlasSprite[2];
    private final TextureAtlasSprite[] bHv = new TextureAtlasSprite[2];

    public BlockFluidRenderer() {
        this.IO();
    }

    protected void IO() {
        TextureMap textureMap = d.AZ().Bu();
        this.bHu[0] = textureMap.dq("minecraft:blocks/lava_still");
        this.bHu[1] = textureMap.dq("minecraft:blocks/lava_flow");
        this.bHv[0] = textureMap.dq("minecraft:blocks/water_still");
        this.bHv[1] = textureMap.dq("minecraft:blocks/water_flow");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(l l2, IBlockState iBlockState, b b2, WorldRenderer worldRenderer) {
        boolean bl2;
        try {
            if (a.aoG()) {
                z.b(iBlockState, b2, l2, worldRenderer);
            }
            BlockLiquid blockLiquid = (BlockLiquid)iBlockState.df();
            blockLiquid.c(l2, b2);
            TextureAtlasSprite[] textureAtlasSpriteArray = blockLiquid.xb() == Material.bew ? this.bHu : this.bHv;
            g g2 = worldRenderer.b(iBlockState, b2);
            int n2 = s.a(l2, iBlockState, b2, g2);
            float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n2 & 0xFF) / 255.0f;
            boolean bl3 = blockLiquid.a(l2, b2.aqX(), ao.dwr);
            boolean bl4 = blockLiquid.a(l2, b2.aqY(), ao.dwq);
            boolean[] blArray = g2.aEa();
            blArray[0] = blockLiquid.a(l2, b2.aqZ(), ao.dws);
            blArray[1] = blockLiquid.a(l2, b2.ara(), ao.dwt);
            blArray[2] = blockLiquid.a(l2, b2.arb(), ao.dwu);
            blArray[3] = blockLiquid.a(l2, b2.arc(), ao.dwv);
            if (bl3 || bl4 || blArray[0] || blArray[1] || blArray[2] || blArray[3]) {
                int n3;
                float f5;
                float f6;
                float f7;
                float f8;
                float f9;
                int n4 = 0;
                float f10 = 0.5f;
                float f11 = 1.0f;
                float f12 = 0.8f;
                float f13 = 0.6f;
                Material material = blockLiquid.xb();
                float f14 = this.b(l2, b2, material);
                float f15 = this.b(l2, b2.ara(), material);
                float f16 = this.b(l2, b2.arc().ara(), material);
                float f17 = this.b(l2, b2.arc(), material);
                double d2 = b2.wt();
                double d3 = b2.wu();
                double d4 = b2.wx();
                float f18 = 0.001f;
                if (bl3) {
                    float f19;
                    float f20;
                    float f21;
                    float f22;
                    float f23;
                    n4 = 1;
                    TextureAtlasSprite textureAtlasSprite = textureAtlasSpriteArray[0];
                    f9 = (float)BlockLiquid.a(l2, b2, material);
                    if (f9 > -999.0f) {
                        textureAtlasSprite = textureAtlasSpriteArray[1];
                    }
                    worldRenderer.c(textureAtlasSprite);
                    f14 -= 0.001f;
                    f15 -= 0.001f;
                    f16 -= 0.001f;
                    f17 -= 0.001f;
                    if (f9 < -999.0f) {
                        f8 = textureAtlasSprite.al(0.0);
                        f23 = textureAtlasSprite.am(0.0);
                        f7 = f8;
                        f6 = textureAtlasSprite.am(16.0);
                        f22 = textureAtlasSprite.al(16.0);
                        f21 = f6;
                        f20 = f22;
                        f19 = f23;
                    } else {
                        float f24 = bt.bx(f9) * 0.25f;
                        float f25 = bt.bB(f9) * 0.25f;
                        float f26 = 8.0f;
                        f8 = textureAtlasSprite.al(8.0f + (-f25 - f24) * 16.0f);
                        f23 = textureAtlasSprite.am(8.0f + (-f25 + f24) * 16.0f);
                        f7 = textureAtlasSprite.al(8.0f + (-f25 + f24) * 16.0f);
                        f6 = textureAtlasSprite.am(8.0f + (f25 + f24) * 16.0f);
                        f22 = textureAtlasSprite.al(8.0f + (f25 + f24) * 16.0f);
                        f21 = textureAtlasSprite.am(8.0f + (f25 - f24) * 16.0f);
                        f20 = textureAtlasSprite.al(8.0f + (f25 - f24) * 16.0f);
                        f19 = textureAtlasSprite.am(8.0f + (-f25 - f24) * 16.0f);
                    }
                    int n5 = blockLiquid.b(l2, b2);
                    int n6 = n5 >> 16 & 0xFFFF;
                    int n7 = n5 & 0xFFFF;
                    float f27 = 1.0f * f2;
                    float f28 = 1.0f * f3;
                    f5 = 1.0f * f4;
                    worldRenderer.F(d2 + 0.0, d3 + (double)f14, d4 + 0.0).g(f27, f28, f5, 1.0f).r(f8, f23).aa(n6, n7).Lx();
                    worldRenderer.F(d2 + 0.0, d3 + (double)f15, d4 + 1.0).g(f27, f28, f5, 1.0f).r(f7, f6).aa(n6, n7).Lx();
                    worldRenderer.F(d2 + 1.0, d3 + (double)f16, d4 + 1.0).g(f27, f28, f5, 1.0f).r(f22, f21).aa(n6, n7).Lx();
                    worldRenderer.F(d2 + 1.0, d3 + (double)f17, d4 + 0.0).g(f27, f28, f5, 1.0f).r(f20, f19).aa(n6, n7).Lx();
                    if (blockLiquid.m(l2, b2.aqX())) {
                        worldRenderer.F(d2 + 0.0, d3 + (double)f14, d4 + 0.0).g(f27, f28, f5, 1.0f).r(f8, f23).aa(n6, n7).Lx();
                        worldRenderer.F(d2 + 1.0, d3 + (double)f17, d4 + 0.0).g(f27, f28, f5, 1.0f).r(f20, f19).aa(n6, n7).Lx();
                        worldRenderer.F(d2 + 1.0, d3 + (double)f16, d4 + 1.0).g(f27, f28, f5, 1.0f).r(f22, f21).aa(n6, n7).Lx();
                        worldRenderer.F(d2 + 0.0, d3 + (double)f15, d4 + 1.0).g(f27, f28, f5, 1.0f).r(f7, f6).aa(n6, n7).Lx();
                    }
                }
                if (bl4) {
                    worldRenderer.c(textureAtlasSpriteArray[0]);
                    float f29 = textureAtlasSpriteArray[0].NY();
                    f9 = textureAtlasSpriteArray[0].NZ();
                    f8 = textureAtlasSpriteArray[0].Oa();
                    f7 = textureAtlasSpriteArray[0].Ob();
                    int n8 = blockLiquid.b(l2, b2.aqY());
                    int n9 = n8 >> 16 & 0xFFFF;
                    int n10 = n8 & 0xFFFF;
                    f6 = FaceBakery.l(ao.dwq);
                    worldRenderer.F(d2, d3, d4 + 1.0).g(f2 * f6, f3 * f6, f4 * f6, 1.0f).r(f29, f7).aa(n9, n10).Lx();
                    worldRenderer.F(d2, d3, d4).g(f2 * f6, f3 * f6, f4 * f6, 1.0f).r(f29, f8).aa(n9, n10).Lx();
                    worldRenderer.F(d2 + 1.0, d3, d4).g(f2 * f6, f3 * f6, f4 * f6, 1.0f).r(f9, f8).aa(n9, n10).Lx();
                    worldRenderer.F(d2 + 1.0, d3, d4 + 1.0).g(f2 * f6, f3 * f6, f4 * f6, 1.0f).r(f9, f7).aa(n9, n10).Lx();
                    n4 = 1;
                }
                for (n3 = 0; n3 < 4; ++n3) {
                    double d5;
                    double d6;
                    double d7;
                    double d8;
                    float f30;
                    float f31;
                    int n11 = 0;
                    int n12 = 0;
                    if (n3 == 0) {
                        --n12;
                    }
                    if (n3 == 1) {
                        ++n12;
                    }
                    if (n3 == 2) {
                        --n11;
                    }
                    if (n3 == 3) {
                        ++n11;
                    }
                    b b3 = b2.C(n11, 0, n12);
                    TextureAtlasSprite textureAtlasSprite = textureAtlasSpriteArray[1];
                    worldRenderer.c(textureAtlasSprite);
                    if (!blArray[n3]) continue;
                    if (n3 == 0) {
                        f31 = f14;
                        f30 = f17;
                        d8 = d2;
                        d7 = d2 + 1.0;
                        d6 = d4 + (double)0.001f;
                        d5 = d4 + (double)0.001f;
                    } else if (n3 == 1) {
                        f31 = f16;
                        f30 = f15;
                        d8 = d2 + 1.0;
                        d7 = d2;
                        d6 = d4 + 1.0 - (double)0.001f;
                        d5 = d4 + 1.0 - (double)0.001f;
                    } else if (n3 == 2) {
                        f31 = f15;
                        f30 = f14;
                        d8 = d2 + (double)0.001f;
                        d7 = d2 + (double)0.001f;
                        d6 = d4 + 1.0;
                        d5 = d4;
                    } else {
                        f31 = f17;
                        f30 = f16;
                        d8 = d2 + 1.0 - (double)0.001f;
                        d7 = d2 + 1.0 - (double)0.001f;
                        d6 = d4;
                        d5 = d4 + 1.0;
                    }
                    n4 = 1;
                    f5 = textureAtlasSprite.al(0.0);
                    float f32 = textureAtlasSprite.al(8.0);
                    float f33 = textureAtlasSprite.am((1.0f - f31) * 16.0f * 0.5f);
                    float f34 = textureAtlasSprite.am((1.0f - f30) * 16.0f * 0.5f);
                    float f35 = textureAtlasSprite.am(8.0);
                    int n13 = blockLiquid.b(l2, b3);
                    int n14 = n13 >> 16 & 0xFFFF;
                    int n15 = n13 & 0xFFFF;
                    float f36 = n3 < 2 ? FaceBakery.l(ao.dws) : FaceBakery.l(ao.dwu);
                    float f37 = 1.0f * f36 * f2;
                    float f38 = 1.0f * f36 * f3;
                    float f39 = 1.0f * f36 * f4;
                    worldRenderer.F(d8, d3 + (double)f31, d6).g(f37, f38, f39, 1.0f).r(f5, f33).aa(n14, n15).Lx();
                    worldRenderer.F(d7, d3 + (double)f30, d5).g(f37, f38, f39, 1.0f).r(f32, f34).aa(n14, n15).Lx();
                    worldRenderer.F(d7, d3 + 0.0, d5).g(f37, f38, f39, 1.0f).r(f32, f35).aa(n14, n15).Lx();
                    worldRenderer.F(d8, d3 + 0.0, d6).g(f37, f38, f39, 1.0f).r(f5, f35).aa(n14, n15).Lx();
                    worldRenderer.F(d8, d3 + 0.0, d6).g(f37, f38, f39, 1.0f).r(f5, f35).aa(n14, n15).Lx();
                    worldRenderer.F(d7, d3 + 0.0, d5).g(f37, f38, f39, 1.0f).r(f32, f35).aa(n14, n15).Lx();
                    worldRenderer.F(d7, d3 + (double)f30, d5).g(f37, f38, f39, 1.0f).r(f32, f34).aa(n14, n15).Lx();
                    worldRenderer.F(d8, d3 + (double)f31, d6).g(f37, f38, f39, 1.0f).r(f5, f33).aa(n14, n15).Lx();
                }
                worldRenderer.c((TextureAtlasSprite)null);
                int n16 = n3 = n4;
                return n16 != 0;
            }
            bl2 = false;
        }
        finally {
            if (a.aoG()) {
                z.e(worldRenderer);
            }
        }
        return bl2;
    }

    private float b(l l2, b b2, Material material) {
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            b b3 = b2.C(-(i2 & 1), 0, -(i2 >> 1 & 1));
            if (l2.L(b3.aqX()).df().xb() == material) {
                return 1.0f;
            }
            IBlockState iBlockState = l2.L(b3);
            Material material2 = iBlockState.df().xb();
            if (material2 != material) {
                if (material2.zw()) continue;
                f2 += 1.0f;
                ++n2;
                continue;
            }
            int n3 = iBlockState.b(BlockLiquid.aWV);
            if (n3 >= 8 || n3 == 0) {
                f2 += BlockLiquid.bb(n3) * 10.0f;
                n2 += 10;
            }
            f2 += BlockLiquid.bb(n3);
            ++n2;
        }
        return 1.0f - f2 / (float)n2;
    }
}

