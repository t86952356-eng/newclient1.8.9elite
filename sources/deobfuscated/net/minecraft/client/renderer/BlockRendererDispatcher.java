/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockFluidRenderer;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.ChestRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.SimpleBakedModel$Builder;
import net.minecraft.client.resources.model.WeightedBakedModel;
import net.minecraft.client.settings.a;
import net.minecraft.crash.i;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.world.ap;
import net.minecraft.world.l;

public class BlockRendererDispatcher
implements IResourceManagerReloadListener {
    private final BlockModelShapes bIx;
    private final a bIy;
    private final BlockModelRenderer bIz = new BlockModelRenderer();
    private final ChestRenderer bIA = new ChestRenderer();
    private final BlockFluidRenderer bIB = new BlockFluidRenderer();

    public BlockRendererDispatcher(BlockModelShapes blockModelShapes, a a2) {
        this.bIx = blockModelShapes;
        this.bIy = a2;
    }

    public BlockModelShapes IY() {
        return this.bIx;
    }

    public void a(IBlockState iBlockState, b b2, TextureAtlasSprite textureAtlasSprite, l l2) {
        Block block = iBlockState.df();
        int n2 = block.xg();
        if (n2 == 3) {
            iBlockState = block.a(iBlockState, l2, b2);
            IBakedModel iBakedModel = this.bIx.B(iBlockState);
            IBakedModel iBakedModel2 = new SimpleBakedModel$Builder(iBakedModel, textureAtlasSprite).QF();
            this.bIz.a(l2, iBakedModel2, iBlockState, b2, Tessellator.Li().Lj());
        }
    }

    public boolean a(IBlockState iBlockState, b b2, l l2, WorldRenderer worldRenderer) {
        try {
            int n2 = iBlockState.df().xg();
            if (n2 == -1) {
                return false;
            }
            switch (n2) {
                case 1: {
                    return this.bIB.a(l2, iBlockState, b2, worldRenderer);
                }
                case 2: {
                    return false;
                }
                case 3: {
                    IBakedModel iBakedModel = this.b(iBlockState, l2, b2);
                    return this.bIz.a(l2, iBakedModel, iBlockState, b2, worldRenderer);
                }
            }
            return false;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Tesselating block in world");
            i i2 = a2.dY("Block being tesselated");
            i.a(i2, b2, iBlockState.df(), iBlockState.df().c(iBlockState));
            throw new cl(a2);
        }
    }

    public BlockModelRenderer IZ() {
        return this.bIz;
    }

    private IBakedModel a(IBlockState iBlockState, b b2) {
        IBakedModel iBakedModel = this.bIx.B(iBlockState);
        if (b2 != null && this.bIy.cgI && iBakedModel instanceof WeightedBakedModel) {
            iBakedModel = ((WeightedBakedModel)iBakedModel).u(bt.g(b2));
        }
        return iBakedModel;
    }

    public IBakedModel b(IBlockState iBlockState, l l2, b b2) {
        Block block = iBlockState.df();
        if (l2.agn() != ap.dEI) {
            try {
                iBlockState = block.a(iBlockState, l2, b2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        IBakedModel iBakedModel = this.bIx.B(iBlockState);
        if (b2 != null && this.bIy.cgI && iBakedModel instanceof WeightedBakedModel) {
            iBakedModel = ((WeightedBakedModel)iBakedModel).u(bt.g(b2));
        }
        return iBakedModel;
    }

    public void a(IBlockState iBlockState, float f2) {
        int n2 = iBlockState.df().xg();
        if (n2 != -1) {
            switch (n2) {
                default: {
                    break;
                }
                case 2: {
                    this.bIA.a(iBlockState.df(), f2);
                    break;
                }
                case 3: {
                    IBakedModel iBakedModel = this.a(iBlockState, null);
                    this.bIz.a(iBakedModel, iBlockState, f2, true);
                }
            }
        }
    }

    public boolean f(Block block, int n2) {
        if (block == null) {
            return false;
        }
        int n3 = block.xg();
        return n3 != 3 && n3 == 2;
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        this.bIB.IO();
    }
}

