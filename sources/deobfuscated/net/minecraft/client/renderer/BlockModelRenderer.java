/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.util.BitSet;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockModelRenderer$AmbientOcclusionFace;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.crash.i;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.util.db;
import net.minecraft.world.l;
import net.optifine.b;
import net.optifine.model.c;
import net.optifine.render.g;
import net.optifine.s;
import net.optifine.shaders.ah;
import net.optifine.shaders.z;

public class BlockModelRenderer {
    private static float bHw = 0.2f;
    private static boolean bHx = false;
    private static final av[] bHy = new av[]{av.dxX, av.dxW, av.dxY};
    final Tessellator bHz = Tessellator.Li();
    final WorldRenderer bHA = this.bHz.Lj();

    public BlockModelRenderer() {
        if (net.optifine.reflect.g.epz.aDA()) {
            net.optifine.reflect.g.a(net.optifine.reflect.g.epz, (Object)false);
        }
    }

    public boolean a(l l2, IBakedModel iBakedModel, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer) {
        Block block = iBlockState.df();
        block.c(l2, b2);
        return this.a(l2, iBakedModel, iBlockState, b2, worldRenderer, true);
    }

    public boolean a(l l2, IBakedModel iBakedModel, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2) {
        boolean bl3 = Minecraft.AX() && iBlockState.df().wZ() == 0 && iBakedModel.Mr();
        try {
            boolean bl4;
            if (a.aoG()) {
                z.b(iBlockState, b2, l2, worldRenderer);
            }
            g g2 = worldRenderer.b(iBlockState, b2);
            iBakedModel = net.optifine.model.a.a(iBakedModel, iBlockState, g2);
            boolean bl5 = bl4 = bl3 ? this.b(l2, iBakedModel, iBlockState, b2, worldRenderer, bl2) : this.c(l2, iBakedModel, iBlockState, b2, worldRenderer, bl2);
            if (bl4) {
                this.a(l2, iBakedModel, iBlockState, b2, worldRenderer, bl2, 0L, g2, bl3);
            }
            if (a.aoG()) {
                z.e(worldRenderer);
            }
            return bl4;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Tesselating block model");
            i i2 = a2.dY("Block model being tesselated");
            i.a(i2, b2, iBlockState);
            i2.b("Using AO", bl3);
            throw new cl(a2);
        }
    }

    public boolean a(l l2, IBakedModel iBakedModel, Block block, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2) {
        IBlockState iBlockState = l2.L(b2);
        return this.b(l2, iBakedModel, iBlockState, b2, worldRenderer, bl2);
    }

    private boolean b(l l2, IBakedModel iBakedModel, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2) {
        boolean bl3 = false;
        Block block = iBlockState.df();
        g g2 = worldRenderer.b(iBlockState, b2);
        av av2 = worldRenderer.xo();
        for (ao ao2 : ao.dwD) {
            List<BakedQuad> list = iBakedModel.p(ao2);
            if (list.isEmpty()) continue;
            net.minecraft.util.b b3 = b2.x(ao2);
            if (bl2 && !block.a(l2, b3, ao2)) continue;
            list = net.optifine.model.a.a(list, l2, iBlockState, b2, ao2, av2, 0L, g2);
            this.a(l2, iBlockState, b2, worldRenderer, list, g2);
            bl3 = true;
        }
        Object object = iBakedModel.Qk();
        if (object.size() > 0) {
            object = net.optifine.model.a.a((List<BakedQuad>)object, l2, iBlockState, b2, null, av2, 0L, g2);
            this.a(l2, iBlockState, b2, worldRenderer, (List<BakedQuad>)object, g2);
            bl3 = true;
        }
        return bl3;
    }

    public boolean b(l l2, IBakedModel iBakedModel, Block block, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2) {
        IBlockState iBlockState = l2.L(b2);
        return this.c(l2, iBakedModel, iBlockState, b2, worldRenderer, bl2);
    }

    public boolean c(l l2, IBakedModel iBakedModel, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2) {
        boolean bl3 = false;
        Block block = iBlockState.df();
        g g2 = worldRenderer.b(iBlockState, b2);
        av av2 = worldRenderer.xo();
        for (ao ao2 : ao.dwD) {
            List<BakedQuad> list = iBakedModel.p(ao2);
            if (list.isEmpty()) continue;
            net.minecraft.util.b b3 = b2.x(ao2);
            if (bl2 && !block.a(l2, b3, ao2)) continue;
            int n2 = block.b(l2, b3);
            list = net.optifine.model.a.a(list, l2, iBlockState, b2, ao2, av2, 0L, g2);
            this.a(l2, iBlockState, b2, ao2, n2, false, worldRenderer, list, g2);
            bl3 = true;
        }
        Object object = iBakedModel.Qk();
        if (object.size() > 0) {
            object = net.optifine.model.a.a((List<BakedQuad>)object, l2, iBlockState, b2, null, av2, 0L, g2);
            this.a(l2, iBlockState, b2, null, -1, true, worldRenderer, (List<BakedQuad>)object, g2);
            bl3 = true;
        }
        return bl3;
    }

    private void a(l l2, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer, List<BakedQuad> list, g g2) {
        Block block = iBlockState.df();
        float[] fArray = g2.aDV();
        BitSet bitSet = g2.aDW();
        BlockModelRenderer$AmbientOcclusionFace blockModelRenderer$AmbientOcclusionFace = g2.aDX();
        double d2 = b2.wt();
        double d3 = b2.wu();
        double d4 = b2.wx();
        Block$EnumOffsetType block$EnumOffsetType = block.xN();
        if (block$EnumOffsetType != Block$EnumOffsetType.aSJ) {
            long l3 = bt.g(b2);
            d2 += ((double)((float)(l3 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l3 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (block$EnumOffsetType == Block$EnumOffsetType.aSL) {
                d3 += ((double)((float)(l3 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        for (BakedQuad bakedQuad : list) {
            this.a(block, bakedQuad.LP(), bakedQuad.LS(), fArray, bitSet);
            blockModelRenderer$AmbientOcclusionFace.a(l2, block, b2, bakedQuad.LS(), fArray, bitSet);
            if (bakedQuad.LO().bYv) {
                blockModelRenderer$AmbientOcclusionFace.IQ();
            }
            if (worldRenderer.LE()) {
                worldRenderer.c(bakedQuad.LT());
            } else {
                worldRenderer.c(bakedQuad.LP());
            }
            worldRenderer.b(bakedQuad.LO());
            worldRenderer.q(blockModelRenderer$AmbientOcclusionFace.bHD[0], blockModelRenderer$AmbientOcclusionFace.bHD[1], blockModelRenderer$AmbientOcclusionFace.bHD[2], blockModelRenderer$AmbientOcclusionFace.bHD[3]);
            int n2 = s.a(bakedQuad, iBlockState, l2, b2, g2);
            if (!bakedQuad.LQ() && n2 == -1) {
                if (bHx) {
                    worldRenderer.c(1.0f, 1.0f, 1.0f, blockModelRenderer$AmbientOcclusionFace.bHC[0], 4);
                    worldRenderer.c(1.0f, 1.0f, 1.0f, blockModelRenderer$AmbientOcclusionFace.bHC[1], 3);
                    worldRenderer.c(1.0f, 1.0f, 1.0f, blockModelRenderer$AmbientOcclusionFace.bHC[2], 2);
                    worldRenderer.c(1.0f, 1.0f, 1.0f, blockModelRenderer$AmbientOcclusionFace.bHC[3], 1);
                } else {
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[0], blockModelRenderer$AmbientOcclusionFace.bHC[0], blockModelRenderer$AmbientOcclusionFace.bHC[0], 4);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[1], blockModelRenderer$AmbientOcclusionFace.bHC[1], blockModelRenderer$AmbientOcclusionFace.bHC[1], 3);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[2], blockModelRenderer$AmbientOcclusionFace.bHC[2], blockModelRenderer$AmbientOcclusionFace.bHC[2], 2);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[3], blockModelRenderer$AmbientOcclusionFace.bHC[3], blockModelRenderer$AmbientOcclusionFace.bHC[3], 1);
                }
            } else {
                int n3 = n2 != -1 ? n2 : block.a(l2, b2, bakedQuad.LR());
                if (EntityRenderer.bIR) {
                    n3 = TextureUtil.dM(n3);
                }
                float f2 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n3 & 0xFF) / 255.0f;
                if (bHx) {
                    worldRenderer.c(f2, f3, f4, blockModelRenderer$AmbientOcclusionFace.bHC[0], 4);
                    worldRenderer.c(f2, f3, f4, blockModelRenderer$AmbientOcclusionFace.bHC[1], 3);
                    worldRenderer.c(f2, f3, f4, blockModelRenderer$AmbientOcclusionFace.bHC[2], 2);
                    worldRenderer.c(f2, f3, f4, blockModelRenderer$AmbientOcclusionFace.bHC[3], 1);
                } else {
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[0] * f2, blockModelRenderer$AmbientOcclusionFace.bHC[0] * f3, blockModelRenderer$AmbientOcclusionFace.bHC[0] * f4, 4);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[1] * f2, blockModelRenderer$AmbientOcclusionFace.bHC[1] * f3, blockModelRenderer$AmbientOcclusionFace.bHC[1] * f4, 3);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[2] * f2, blockModelRenderer$AmbientOcclusionFace.bHC[2] * f3, blockModelRenderer$AmbientOcclusionFace.bHC[2] * f4, 2);
                    worldRenderer.a(blockModelRenderer$AmbientOcclusionFace.bHC[3] * f2, blockModelRenderer$AmbientOcclusionFace.bHC[3] * f3, blockModelRenderer$AmbientOcclusionFace.bHC[3] * f4, 1);
                }
            }
            worldRenderer.E(d2, d3, d4);
        }
    }

    private void a(Block block, int[] nArray, ao ao2, float[] fArray, BitSet bitSet) {
        int n2;
        float f2 = 32.0f;
        float f3 = 32.0f;
        float f4 = 32.0f;
        float f5 = -32.0f;
        float f6 = -32.0f;
        float f7 = -32.0f;
        int n3 = nArray.length / 4;
        for (n2 = 0; n2 < 4; ++n2) {
            float f8 = Float.intBitsToFloat(nArray[n2 * n3]);
            float f9 = Float.intBitsToFloat(nArray[n2 * n3 + 1]);
            float f10 = Float.intBitsToFloat(nArray[n2 * n3 + 2]);
            f2 = Math.min(f2, f8);
            f3 = Math.min(f3, f9);
            f4 = Math.min(f4, f10);
            f5 = Math.max(f5, f8);
            f6 = Math.max(f6, f9);
            f7 = Math.max(f7, f10);
        }
        if (fArray != null) {
            fArray[ao.dwu.OY()] = f2;
            fArray[ao.dwv.OY()] = f5;
            fArray[ao.dwq.OY()] = f3;
            fArray[ao.dwr.OY()] = f6;
            fArray[ao.dws.OY()] = f4;
            fArray[ao.dwt.OY()] = f7;
            n2 = ao.dwD.length;
            fArray[ao.dwu.OY() + n2] = 1.0f - f2;
            fArray[ao.dwv.OY() + n2] = 1.0f - f5;
            fArray[ao.dwq.OY() + n2] = 1.0f - f3;
            fArray[ao.dwr.OY() + n2] = 1.0f - f6;
            fArray[ao.dws.OY() + n2] = 1.0f - f4;
            fArray[ao.dwt.OY() + n2] = 1.0f - f7;
        }
        switch (ao2) {
            case dwq: {
                bitSet.set(1, f2 >= 1.0E-4f || f4 >= 1.0E-4f || f5 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f3 < 1.0E-4f || block.xf()) && f3 == f6);
                break;
            }
            case dwr: {
                bitSet.set(1, f2 >= 1.0E-4f || f4 >= 1.0E-4f || f5 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f6 > 0.9999f || block.xf()) && f3 == f6);
                break;
            }
            case dws: {
                bitSet.set(1, f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, (f4 < 1.0E-4f || block.xf()) && f4 == f7);
                break;
            }
            case dwt: {
                bitSet.set(1, f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f);
                bitSet.set(0, (f7 > 0.9999f || block.xf()) && f4 == f7);
                break;
            }
            case dwu: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f2 < 1.0E-4f || block.xf()) && f2 == f5);
                break;
            }
            case dwv: {
                bitSet.set(1, f3 >= 1.0E-4f || f4 >= 1.0E-4f || f6 <= 0.9999f || f7 <= 0.9999f);
                bitSet.set(0, (f5 > 0.9999f || block.xf()) && f2 == f5);
            }
        }
    }

    private void a(l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, int n2, boolean bl2, WorldRenderer worldRenderer, List<BakedQuad> list, g g2) {
        Block block = iBlockState.df();
        BitSet bitSet = g2.aDW();
        double d2 = b2.wt();
        double d3 = b2.wu();
        double d4 = b2.wx();
        Block$EnumOffsetType block$EnumOffsetType = block.xN();
        if (block$EnumOffsetType != Block$EnumOffsetType.aSJ) {
            int n3 = b2.wt();
            int n4 = b2.wx();
            long l3 = (long)n3 * 3129871L ^ (long)n4 * 116129781L;
            l3 = l3 * l3 * 42317861L + l3 * 11L;
            d2 += ((double)((float)(l3 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d4 += ((double)((float)(l3 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (block$EnumOffsetType == Block$EnumOffsetType.aSL) {
                d3 += ((double)((float)(l3 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        for (BakedQuad bakedQuad : list) {
            if (bl2) {
                this.a(block, bakedQuad.LP(), bakedQuad.LS(), null, bitSet);
                int n5 = n2 = bitSet.get(0) ? block.b(l2, b2.x(bakedQuad.LS())) : block.b(l2, b2);
            }
            if (bakedQuad.LO().bYv) {
                n2 |= 0xF0;
            }
            if (worldRenderer.LE()) {
                worldRenderer.c(bakedQuad.LT());
            } else {
                worldRenderer.c(bakedQuad.LP());
            }
            worldRenderer.b(bakedQuad.LO());
            worldRenderer.q(n2, n2, n2, n2);
            int n6 = s.a(bakedQuad, iBlockState, l2, b2, g2);
            if (bakedQuad.LQ() || n6 != -1) {
                int n7 = n6 != -1 ? n6 : block.a(l2, b2, bakedQuad.LR());
                if (EntityRenderer.bIR) {
                    n7 = TextureUtil.dM(n7);
                }
                float f2 = (float)(n7 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n7 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n7 & 0xFF) / 255.0f;
                worldRenderer.a(f2, f3, f4, 4);
                worldRenderer.a(f2, f3, f4, 3);
                worldRenderer.a(f2, f3, f4, 2);
                worldRenderer.a(f2, f3, f4, 1);
            }
            worldRenderer.E(d2, d3, d4);
        }
    }

    public void a(IBakedModel iBakedModel, float f2, float f3, float f4, float f5) {
        for (ao ao2 : ao.dwD) {
            this.a(f2, f3, f4, f5, iBakedModel.p(ao2));
        }
        this.a(f2, f3, f4, f5, iBakedModel.Qk());
    }

    public void a(IBakedModel iBakedModel, IBlockState iBlockState, float f2, boolean bl2) {
        Block block = iBlockState.df();
        block.xx();
        GlStateManager.d(90.0f, 0.0f, 1.0f, 0.0f);
        int n2 = block.e(block.g(iBlockState));
        if (EntityRenderer.bIR) {
            n2 = TextureUtil.dM(n2);
        }
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        if (!bl2) {
            GlStateManager.e(f2, f2, f2, 1.0f);
        }
        this.a(iBakedModel, f2, f3, f4, f5);
    }

    private void a(float f2, float f3, float f4, float f5, List<BakedQuad> list) {
        for (BakedQuad bakedQuad : list) {
            this.bHA.a(7, DefaultVertexFormats.cbw);
            this.bHA.c(bakedQuad.LP());
            this.bHA.b(bakedQuad.LO());
            if (bakedQuad.LQ()) {
                this.bHA.o(f3 * f2, f4 * f2, f5 * f2);
            } else {
                this.bHA.o(f2, f2, f2);
            }
            db db2 = bakedQuad.LS().asM();
            this.bHA.m(db2.wt(), db2.wu(), db2.wx());
            this.bHz.pZ();
        }
    }

    public static float ak(float f2) {
        return f2 == 0.2f ? bHw : f2;
    }

    public static void IP() {
        bHw = 1.0f - a.anN() * 0.8f;
        bHx = a.aoG() && ah.aFs();
    }

    private void a(l l2, IBakedModel iBakedModel, IBlockState iBlockState, net.minecraft.util.b b2, WorldRenderer worldRenderer, boolean bl2, long l3, g g2, boolean bl3) {
        if (g2.aEg()) {
            for (av av2 : bHy) {
                c c2 = g2.k(av2);
                if (c2.size() <= 0) continue;
                RegionRenderCacheBuilder regionRenderCacheBuilder = g2.MG();
                if (regionRenderCacheBuilder != null) {
                    WorldRenderer worldRenderer2 = regionRenderCacheBuilder.b(av2);
                    if (!worldRenderer2.LH()) {
                        worldRenderer2.a(7, DefaultVertexFormats.cbv);
                        worldRenderer2.G(worldRenderer.LI(), worldRenderer.LJ(), worldRenderer.LK());
                    }
                    for (int i2 = 0; i2 < c2.size(); ++i2) {
                        BakedQuad bakedQuad = c2.jz(i2);
                        List<BakedQuad> list = c2.c(bakedQuad);
                        IBlockState iBlockState2 = c2.is(i2);
                        if (bakedQuad.Mc() != null) {
                            c2.a(bakedQuad.Mc(), iBlockState2);
                        }
                        g2.c(iBlockState2, b2);
                        if (bl3) {
                            this.a(l2, iBlockState2, b2, worldRenderer2, list, g2);
                            continue;
                        }
                        int n2 = iBlockState2.df().b(l2, b2.x(bakedQuad.LS()));
                        this.a(l2, iBlockState2, b2, bakedQuad.LS(), n2, false, worldRenderer2, list, g2);
                    }
                }
                c2.clear();
            }
        }
        if (a.aol() && !g2.aDY() && b.a(l2, iBlockState, b2)) {
            IBakedModel iBakedModel2 = b.aAa();
            IBlockState iBlockState3 = b.aAb();
            this.a(l2, iBakedModel2, iBlockState3, b2, worldRenderer, bl2);
        }
    }
}

