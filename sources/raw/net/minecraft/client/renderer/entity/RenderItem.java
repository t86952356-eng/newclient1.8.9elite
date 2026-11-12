/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import hackclient.rise.a;
import hackclient.rise.agg;
import hackclient.rise.akg;
import hackclient.rise.fm;
import hackclient.rise.go;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.BlockStoneSlabNew$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.BlockWall$EnumType;
import net.minecraft.client.d;
import net.minecraft.client.entity.c;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import net.minecraft.client.renderer.entity.RenderItem$1;
import net.minecraft.client.renderer.entity.RenderItem$2;
import net.minecraft.client.renderer.entity.RenderItem$3;
import net.minecraft.client.renderer.entity.RenderItem$4;
import net.minecraft.client.renderer.entity.RenderItem$5;
import net.minecraft.client.renderer.entity.RenderItem$6;
import net.minecraft.client.renderer.entity.RenderItem$7;
import net.minecraft.client.renderer.entity.RenderItem$8;
import net.minecraft.client.renderer.entity.RenderItem$9;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.crash.i;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.bd;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.util.an;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.minecraft.util.db;
import net.optifine.ae;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.s;
import net.optifine.shaders.ah;
import net.optifine.shaders.aj;

public class RenderItem
implements IResourceManagerReloadListener {
    public static final cm bVh = new cm("textures/misc/enchanted_item_glint.png");
    private boolean bVi = true;
    public float zLevel;
    private final ItemModelMesher bVj;
    public final TextureManager bVk;
    public boolean bVl = false;
    public ModelManager bhN = null;
    private boolean bVm = false;
    private boolean bVn = false;
    private r bVo;

    public RenderItem(TextureManager textureManager, ModelManager modelManager) {
        this.bVk = textureManager;
        this.bhN = modelManager;
        this.bVj = g.eqc.aDA() ? (ItemModelMesher)g.b(g.eqc, modelManager) : new ItemModelMesher(modelManager);
        this.Nu();
    }

    public void ar(boolean bl2) {
        this.bVi = bl2;
    }

    public ItemModelMesher Ns() {
        return this.bVj;
    }

    protected void a(net.minecraft.item.d d2, int n2, String string) {
        this.bVj.a(d2, n2, new ModelResourceLocation(string, "inventory"));
    }

    protected void a(Block block, int n2, String string) {
        this.a(net.minecraft.item.d.I(block), n2, string);
    }

    private void a(Block block, String string) {
        this.a(block, 0, string);
    }

    private void a(net.minecraft.item.d d2, String string) {
        this.a(d2, 0, string);
    }

    private void a(IBakedModel iBakedModel, co co2) {
        this.a(iBakedModel, -1, co2);
    }

    public void a(IBakedModel iBakedModel, int n2) {
        this.a(iBakedModel, n2, null);
    }

    private void a(IBakedModel iBakedModel, int n2, co co2) {
        boolean bl2;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        boolean bl3 = d.AZ().Bu().Oz();
        boolean bl4 = bl2 = net.minecraft.src.a.LE() && bl3;
        if (bl2) {
            worldRenderer.d(av.dxV);
        }
        worldRenderer.a(7, DefaultVertexFormats.cbw);
        for (ao ao2 : ao.dwD) {
            this.a(worldRenderer, iBakedModel.p(ao2), n2, co2);
        }
        this.a(worldRenderer, iBakedModel.Qk(), n2, co2);
        tessellator.pZ();
        if (bl2) {
            worldRenderer.d(null);
            GlStateManager.Kb();
        }
    }

    public void a(co co2, IBakedModel iBakedModel) {
        this.a(co2, iBakedModel, -1);
    }

    public void a(co co2, IBakedModel iBakedModel, int n2) {
        if (co2 != null) {
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            if (iBakedModel.Ql()) {
                GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.j(-0.5f, -0.5f, -0.5f);
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.JS();
                TileEntityItemStackRenderer.caN.S(co2);
            } else {
                GlStateManager.j(-0.5f, -0.5f, -0.5f);
                if (net.minecraft.src.a.aoT()) {
                    iBakedModel = ae.a(co2, iBakedModel, null, false);
                }
                this.bVm = false;
                this.a(iBakedModel, n2, co2);
                if (this.bVm) {
                    float f2 = OpenGlHelper.bNq;
                    float f3 = OpenGlHelper.bNr;
                    OpenGlHelper.a(OpenGlHelper.bMJ, 240.0f, f3);
                    this.bVn = true;
                    this.a(iBakedModel, co2);
                    this.bVn = false;
                    OpenGlHelper.a(OpenGlHelper.bMJ, f2, f3);
                }
                boolean bl2 = !net.minecraft.src.a.aoT() || !ae.a(this, co2, iBakedModel);
                boolean bl3 = co2.aeo();
                fm fm2 = new fm(bl3, bl2, co2, iBakedModel);
                a.a.e().d(fm2);
                bl3 = fm2.dt();
                bl2 = fm2.du();
                if (bl3 && bl2 && !fm2.isCancelled()) {
                    this.b(iBakedModel);
                }
            }
            GlStateManager.JW();
        }
    }

    public void b(IBakedModel iBakedModel) {
        if (RendererLivingEntity.bXc) {
            return;
        }
        if (!(net.minecraft.src.a.aoT() && !ae.aAP() || net.minecraft.src.a.aoG() && ah.eye)) {
            GlStateManager.an(false);
            GlStateManager.cJ(514);
            GlStateManager.JA();
            GlStateManager.P(768, 1);
            this.bVk.a(bVh);
            if (net.minecraft.src.a.aoG() && !this.bVl) {
                aj.aHi();
            }
            GlStateManager.cR(5890);
            GlStateManager.JV();
            GlStateManager.i(8.0f, 8.0f, 8.0f);
            float f2 = (float)(d.Bj() % 3000L) / 3000.0f / 8.0f;
            GlStateManager.j(f2, 0.0f, 0.0f);
            GlStateManager.d(-50.0f, 0.0f, 0.0f, 1.0f);
            this.a(iBakedModel, -8372020);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(8.0f, 8.0f, 8.0f);
            float f3 = (float)(d.Bj() % 4873L) / 4873.0f / 8.0f;
            GlStateManager.j(-f3, 0.0f, 0.0f);
            GlStateManager.d(10.0f, 0.0f, 0.0f, 1.0f);
            this.a(iBakedModel, -8372020);
            GlStateManager.JW();
            GlStateManager.cR(5888);
            GlStateManager.P(770, 771);
            GlStateManager.Jz();
            GlStateManager.cJ(515);
            GlStateManager.an(true);
            this.bVk.a(TextureMap.bZE);
            if (net.minecraft.src.a.aoG() && !this.bVl) {
                aj.aHj();
            }
        }
    }

    private void a(WorldRenderer worldRenderer, BakedQuad bakedQuad) {
        db db2 = bakedQuad.LS().asM();
        worldRenderer.m(db2.wt(), db2.wu(), db2.wx());
    }

    private void a(WorldRenderer worldRenderer, BakedQuad bakedQuad, int n2) {
        if (this.bVn) {
            if (bakedQuad.Mc() == null) {
                return;
            }
            bakedQuad = bakedQuad.Mc();
        } else if (bakedQuad.Mc() != null) {
            this.bVm = true;
        }
        if (worldRenderer.LE()) {
            worldRenderer.c(bakedQuad.LT());
        } else {
            worldRenderer.c(bakedQuad.LP());
        }
        worldRenderer.b(bakedQuad.LO());
        if (g.epU.aDA() && g.epU.F(bakedQuad)) {
            RenderItem.b(worldRenderer, bakedQuad, n2);
        } else {
            worldRenderer.dm(n2);
        }
        this.a(worldRenderer, bakedQuad);
    }

    private void a(WorldRenderer worldRenderer, List<BakedQuad> list, int n2, co co2) {
        boolean bl2 = n2 == -1 && co2 != null;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            BakedQuad bakedQuad = list.get(i2);
            int n4 = n2;
            if (bl2 && bakedQuad.LQ()) {
                n4 = co2.bP().e(co2, bakedQuad.LR());
                if (net.minecraft.src.a.aow()) {
                    n4 = s.b(co2, bakedQuad.LR(), n4);
                }
                if (EntityRenderer.bIR) {
                    n4 = TextureUtil.dM(n4);
                }
                n4 |= 0xFF000000;
            }
            this.a(worldRenderer, bakedQuad, n4);
        }
    }

    public boolean Q(co co2) {
        IBakedModel iBakedModel = this.bVj.M(co2);
        return iBakedModel != null && iBakedModel.Ms();
    }

    private void R(co co2) {
        IBakedModel iBakedModel = this.bVj.M(co2);
        net.minecraft.item.d d2 = co2.bP();
        if (d2 != null) {
            boolean bl2 = iBakedModel.Ms();
            if (!bl2) {
                GlStateManager.i(2.0f, 2.0f, 2.0f);
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public void a(co co2, ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        if (co2 != null) {
            IBakedModel iBakedModel = this.bVj.M(co2);
            this.a(co2, iBakedModel, itemCameraTransforms$TransformType);
        }
    }

    public void a(co co2, r r2, ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        if (co2 != null && r2 != null) {
            IBakedModel iBakedModel = this.bVj.M(co2);
            this.bVo = r2;
            if (r2 instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)r2;
                net.minecraft.item.d d2 = co2.bP();
                ModelResourceLocation modelResourceLocation = null;
                if (d2 == Items.cQV && a2.cIE != null) {
                    modelResourceLocation = new ModelResourceLocation("fishing_rod_cast", "inventory");
                } else if (d2 == Items.cPj && a2.abF() != null) {
                    int n2 = co2.aeh() - a2.abG();
                    if (n2 >= 18) {
                        modelResourceLocation = new ModelResourceLocation("bow_pulling_2", "inventory");
                    } else if (n2 > 13) {
                        modelResourceLocation = new ModelResourceLocation("bow_pulling_1", "inventory");
                    } else if (n2 > 0) {
                        modelResourceLocation = new ModelResourceLocation("bow_pulling_0", "inventory");
                    }
                } else if (g.epu.aDA()) {
                    modelResourceLocation = (ModelResourceLocation)g.g(d2, g.epu, co2, a2, a2.abG());
                }
                if (modelResourceLocation != null) {
                    iBakedModel = this.bVj.IV().a(modelResourceLocation);
                    if (net.minecraft.src.a.aoT()) {
                        iBakedModel = ae.a(co2, iBakedModel, modelResourceLocation, true);
                    }
                }
            }
            this.a(co2, iBakedModel, itemCameraTransforms$TransformType);
        }
    }

    protected void a(co co2, IBakedModel iBakedModel, ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        this.bVk.a(TextureMap.bZE);
        this.bVk.k(TextureMap.bZE).f(false, false);
        this.R(co2);
        GlStateManager.JS();
        GlStateManager.e(516, 0.1f);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.JV();
        if (g.eoY.aDA()) {
            iBakedModel = (IBakedModel)g.g(g.eoY, new Object[]{iBakedModel, itemCameraTransforms$TransformType});
        } else {
            net.minecraft.entity.player.a a2;
            co co3;
            ItemCameraTransforms itemCameraTransforms = iBakedModel.Qn();
            itemCameraTransforms.a(itemCameraTransforms$TransformType);
            if (this.a(itemCameraTransforms.b(itemCameraTransforms$TransformType))) {
                GlStateManager.cL(1028);
            }
            if (itemCameraTransforms$TransformType == ItemCameraTransforms$TransformType.bRm && this.bVo instanceof net.minecraft.entity.player.a && (co3 = (a2 = (net.minecraft.entity.player.a)this.bVo).Vk()) != null) {
                c c2 = d.AZ().bgK;
                if (this.bVo == c2) {
                    if (co3.bP() instanceof cp && (a2.abG() > 0 || a.a.g().c(go.class).isEnabled() && !((akg)a.a.g().c(go.class).lV.wD()).getName().equals("None") && a.a.g().c(go.class).jE != null && a.a.g().c(go.class).eX() || c2.abK())) {
                        this.Nt();
                    }
                } else if (a2.abG() > 0 && co3.aei() == net.minecraft.item.a.cUz) {
                    this.Nt();
                }
            }
        }
        this.a(co2, iBakedModel);
        GlStateManager.cL(1029);
        GlStateManager.JW();
        GlStateManager.JT();
        GlStateManager.tR();
        this.bVk.a(TextureMap.bZE);
        this.bVk.k(TextureMap.bZE).NI();
    }

    private void Nt() {
        GlStateManager.j(-0.15f, -0.2f, 0.0f);
        GlStateManager.d(70.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.j(0.119f, 0.2f, -0.024f);
    }

    private boolean a(ItemTransformVec3f itemTransformVec3f) {
        return itemTransformVec3f.bRJ.x < 0.0f ^ itemTransformVec3f.bRJ.y < 0.0f ^ itemTransformVec3f.bRJ.z < 0.0f;
    }

    public void a(co co2, double d2, double d3) {
        this.a(co2, -1, d2, d3);
    }

    public void a(co co2, int n2, double d2, double d3) {
        this.bVl = true;
        IBakedModel iBakedModel = this.bVj.M(co2);
        GlStateManager.JV();
        this.bVk.a(TextureMap.bZE);
        this.bVk.k(TextureMap.bZE).f(false, false);
        GlStateManager.JS();
        GlStateManager.tL();
        GlStateManager.e(516, 0.0f);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(d2, d3, iBakedModel.Ms());
        if (g.eoY.aDA()) {
            iBakedModel = (IBakedModel)g.g(g.eoY, new Object[]{iBakedModel, ItemCameraTransforms$TransformType.bRp});
        } else {
            iBakedModel.Qn().a(ItemCameraTransforms$TransformType.bRp);
        }
        this.a(co2, iBakedModel, n2);
        GlStateManager.Jy();
        GlStateManager.JT();
        GlStateManager.JA();
        GlStateManager.JW();
        this.bVk.a(TextureMap.bZE);
        this.bVk.k(TextureMap.bZE).NI();
        this.bVl = false;
    }

    private void a(double d2, double d3, boolean bl2) {
        GlStateManager.j((float)d2, (float)d3, 100.0f + this.zLevel);
        GlStateManager.j(8.0f, 8.0f, 0.0f);
        GlStateManager.i(1.0f, 1.0f, -1.0f);
        GlStateManager.i(0.5f, 0.5f, 0.5f);
        if (bl2) {
            GlStateManager.i(40.0f, 40.0f, 40.0f);
            GlStateManager.d(210.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(-135.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.Jz();
        } else {
            GlStateManager.i(64.0f, 64.0f, 64.0f);
            GlStateManager.d(180.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.JA();
        }
    }

    public void b(co co2, double d2, double d3) {
        this.b(co2, -1, d2, d3);
    }

    public void b(co co2, int n2, double d2, double d3) {
        if (co2 != null && co2.bP() != null) {
            this.zLevel += 50.0f;
            try {
                this.a(co2, n2, d2, d3);
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Rendering item");
                i i2 = a2.dY("Item being rendered");
                i2.a("Item Type", new RenderItem$1(this, co2));
                i2.a("Item Aux", new RenderItem$2(this, co2));
                i2.a("Item NBT", new RenderItem$3(this, co2));
                i2.a("Item Foil", new RenderItem$4(this, co2));
                throw new cl(a2);
            }
            this.zLevel -= 50.0f;
        }
    }

    public void a(agg agg2, co co2, int n2, int n3) {
        this.a(agg2, co2, n2, n3, null);
    }

    public void a(agg agg2, co co2, int n2, int n3, String string) {
        if (co2 != null) {
            if (co2.cWZ != 1 || string != null) {
                Object object;
                Object object2 = object = string == null ? String.valueOf(co2.cWZ) : string;
                if (string == null && co2.cWZ < 1) {
                    object = String.valueOf((Object)an.dvX) + String.valueOf(co2.cWZ);
                }
                GlStateManager.JA();
                GlStateManager.JD();
                GlStateManager.tR();
                agg2.b((String)object, n2 + 19 - 2 - agg2.bQ((String)object), n3 + 6 + 3, 0xFFFFFF);
                GlStateManager.Jz();
                GlStateManager.JE();
                GlStateManager.tQ();
            }
            if (l.bc(co2)) {
                int n4;
                int n5 = (int)Math.round(13.0 - (double)co2.aef() * 13.0 / (double)co2.adt());
                int n6 = (int)Math.round(255.0 - (double)co2.aef() * 255.0 / (double)co2.adt());
                if (g.ept.aDA()) {
                    double d2 = g.e(co2.bP(), g.ept, co2);
                    n5 = (int)Math.round(13.0 - d2 * 13.0);
                    n6 = (int)Math.round(255.0 - d2 * 255.0);
                }
                GlStateManager.JA();
                GlStateManager.JD();
                GlStateManager.JO();
                GlStateManager.Jy();
                GlStateManager.tR();
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                this.a(worldRenderer, n2 + 2, n3 + 13, 13, 2, 0, 0, 0, 255);
                this.a(worldRenderer, n2 + 2, n3 + 13, 12, 1, (255 - n6) / 4, 64, 0, 255);
                int n7 = 255 - n6;
                int n8 = n6;
                int n9 = 0;
                if (net.minecraft.src.a.aow() && (n4 = s.ja(n6)) >= 0) {
                    n7 = n4 >> 16 & 0xFF;
                    n8 = n4 >> 8 & 0xFF;
                    n9 = n4 & 0xFF;
                }
                this.a(worldRenderer, n2 + 2, n3 + 13, n5, 1, n7, n8, n9, 255);
                GlStateManager.tQ();
                GlStateManager.tL();
                GlStateManager.JN();
                GlStateManager.Jz();
                GlStateManager.JE();
            }
        }
    }

    private void a(WorldRenderer worldRenderer, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        worldRenderer.a(7, DefaultVertexFormats.cbF);
        worldRenderer.F(n2 + 0, n3 + 0, 0.0).s(n6, n7, n8, n9).Lx();
        worldRenderer.F(n2 + 0, n3 + n5, 0.0).s(n6, n7, n8, n9).Lx();
        worldRenderer.F(n2 + n4, n3 + n5, 0.0).s(n6, n7, n8, n9).Lx();
        worldRenderer.F(n2 + n4, n3 + 0, 0.0).s(n6, n7, n8, n9).Lx();
        Tessellator.Li().pZ();
    }

    private void Nu() {
        this.a(Blocks.cOh, "anvil_intact");
        this.a(Blocks.cOh, 1, "anvil_slightly_damaged");
        this.a(Blocks.cOh, 2, "anvil_very_damaged");
        this.a(Blocks.cOA, b.cUR.yc(), "black_carpet");
        this.a(Blocks.cOA, b.cUN.yc(), "blue_carpet");
        this.a(Blocks.cOA, b.cUO.yc(), "brown_carpet");
        this.a(Blocks.cOA, b.cUL.yc(), "cyan_carpet");
        this.a(Blocks.cOA, b.cUJ.yc(), "gray_carpet");
        this.a(Blocks.cOA, b.cUP.yc(), "green_carpet");
        this.a(Blocks.cOA, b.cUF.yc(), "light_blue_carpet");
        this.a(Blocks.cOA, b.cUH.yc(), "lime_carpet");
        this.a(Blocks.cOA, b.cUE.yc(), "magenta_carpet");
        this.a(Blocks.cOA, b.cUD.yc(), "orange_carpet");
        this.a(Blocks.cOA, b.cUI.yc(), "pink_carpet");
        this.a(Blocks.cOA, b.cUM.yc(), "purple_carpet");
        this.a(Blocks.cOA, b.cUQ.yc(), "red_carpet");
        this.a(Blocks.cOA, b.cUK.yc(), "silver_carpet");
        this.a(Blocks.cOA, b.cUC.yc(), "white_carpet");
        this.a(Blocks.cOA, b.cUG.yc(), "yellow_carpet");
        this.a(Blocks.cOb, BlockWall$EnumType.bdq.yc(), "mossy_cobblestone_wall");
        this.a(Blocks.cOb, BlockWall$EnumType.bdp.yc(), "cobblestone_wall");
        this.a(Blocks.cLf, BlockDirt$DirtType.aTF.yc(), "coarse_dirt");
        this.a(Blocks.cLf, BlockDirt$DirtType.aTE.yc(), "dirt");
        this.a(Blocks.cLf, BlockDirt$DirtType.aTG.yc(), "podzol");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUk.yi(), "double_fern");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUj.yi(), "double_grass");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUm.yi(), "paeonia");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUl.yi(), "double_rose");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUh.yi(), "sunflower");
        this.a(Blocks.cOH, BlockDoublePlant$EnumPlantType.aUi.yi(), "syringa");
        this.a(Blocks.cLv, BlockPlanks$EnumType.aXL.yc(), "birch_leaves");
        this.a(Blocks.cLv, BlockPlanks$EnumType.aXM.yc(), "jungle_leaves");
        this.a(Blocks.cLv, BlockPlanks$EnumType.aXJ.yc(), "oak_leaves");
        this.a(Blocks.cLv, BlockPlanks$EnumType.aXK.yc(), "spruce_leaves");
        this.a(Blocks.cLw, BlockPlanks$EnumType.aXN.yc() - 4, "acacia_leaves");
        this.a(Blocks.cLw, BlockPlanks$EnumType.aXO.yc() - 4, "dark_oak_leaves");
        this.a(Blocks.cLt, BlockPlanks$EnumType.aXL.yc(), "birch_log");
        this.a(Blocks.cLt, BlockPlanks$EnumType.aXM.yc(), "jungle_log");
        this.a(Blocks.cLt, BlockPlanks$EnumType.aXJ.yc(), "oak_log");
        this.a(Blocks.cLt, BlockPlanks$EnumType.aXK.yc(), "spruce_log");
        this.a(Blocks.cLu, BlockPlanks$EnumType.aXN.yc() - 4, "acacia_log");
        this.a(Blocks.cLu, BlockPlanks$EnumType.aXO.yc() - 4, "dark_oak_log");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.baC.yc(), "chiseled_brick_monster_egg");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.bay.yc(), "cobblestone_monster_egg");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.baB.yc(), "cracked_brick_monster_egg");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.baA.yc(), "mossy_brick_monster_egg");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.bax.yc(), "stone_monster_egg");
        this.a(Blocks.cNg, BlockSilverfish$EnumType.baz.yc(), "stone_brick_monster_egg");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXN.yc(), "acacia_planks");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXL.yc(), "birch_planks");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXO.yc(), "dark_oak_planks");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXM.yc(), "jungle_planks");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXJ.yc(), "oak_planks");
        this.a(Blocks.cLh, BlockPlanks$EnumType.aXK.yc(), "spruce_planks");
        this.a(Blocks.cOK, BlockPrismarine$EnumType.aYq.yc(), "prismarine_bricks");
        this.a(Blocks.cOK, BlockPrismarine$EnumType.aYr.yc(), "dark_prismarine");
        this.a(Blocks.cOK, BlockPrismarine$EnumType.aYp.yc(), "prismarine");
        this.a(Blocks.cOs, BlockQuartz$EnumType.aYF.yc(), "chiseled_quartz_block");
        this.a(Blocks.cOs, BlockQuartz$EnumType.aYE.yc(), "quartz_block");
        this.a(Blocks.cOs, BlockQuartz$EnumType.aYG.yc(), "quartz_column");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVd.yi(), "allium");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVc.yi(), "blue_orchid");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVe.yi(), "houstonia");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVg.yi(), "orange_tulip");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVj.yi(), "oxeye_daisy");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVi.yi(), "pink_tulip");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVb.yi(), "poppy");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVf.yi(), "red_tulip");
        this.a(Blocks.cLQ, BlockFlower$EnumFlowerType.aVh.yi(), "white_tulip");
        this.a(Blocks.cLo, BlockSand$EnumType.bad.yc(), "red_sand");
        this.a(Blocks.cLo, BlockSand$EnumType.bac.yc(), "sand");
        this.a(Blocks.cLC, BlockSandStone$EnumType.bam.yc(), "chiseled_sandstone");
        this.a(Blocks.cLC, BlockSandStone$EnumType.bal.yc(), "sandstone");
        this.a(Blocks.cLC, BlockSandStone$EnumType.ban.yc(), "smooth_sandstone");
        this.a(Blocks.cOO, BlockRedSandstone$EnumType.aZs.yc(), "chiseled_red_sandstone");
        this.a(Blocks.cOO, BlockRedSandstone$EnumType.aZr.yc(), "red_sandstone");
        this.a(Blocks.cOO, BlockRedSandstone$EnumType.aZt.yc(), "smooth_red_sandstone");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXN.yc(), "acacia_sapling");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXL.yc(), "birch_sapling");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXO.yc(), "dark_oak_sapling");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXM.yc(), "jungle_sapling");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXJ.yc(), "oak_sapling");
        this.a(Blocks.cLi, BlockPlanks$EnumType.aXK.yc(), "spruce_sapling");
        this.a(Blocks.cLx, 0, "sponge");
        this.a(Blocks.cLx, 1, "sponge_wet");
        this.a(Blocks.cOI, b.cUR.yc(), "black_stained_glass");
        this.a(Blocks.cOI, b.cUN.yc(), "blue_stained_glass");
        this.a(Blocks.cOI, b.cUO.yc(), "brown_stained_glass");
        this.a(Blocks.cOI, b.cUL.yc(), "cyan_stained_glass");
        this.a(Blocks.cOI, b.cUJ.yc(), "gray_stained_glass");
        this.a(Blocks.cOI, b.cUP.yc(), "green_stained_glass");
        this.a(Blocks.cOI, b.cUF.yc(), "light_blue_stained_glass");
        this.a(Blocks.cOI, b.cUH.yc(), "lime_stained_glass");
        this.a(Blocks.cOI, b.cUE.yc(), "magenta_stained_glass");
        this.a(Blocks.cOI, b.cUD.yc(), "orange_stained_glass");
        this.a(Blocks.cOI, b.cUI.yc(), "pink_stained_glass");
        this.a(Blocks.cOI, b.cUM.yc(), "purple_stained_glass");
        this.a(Blocks.cOI, b.cUQ.yc(), "red_stained_glass");
        this.a(Blocks.cOI, b.cUK.yc(), "silver_stained_glass");
        this.a(Blocks.cOI, b.cUC.yc(), "white_stained_glass");
        this.a(Blocks.cOI, b.cUG.yc(), "yellow_stained_glass");
        this.a(Blocks.cOJ, b.cUR.yc(), "black_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUN.yc(), "blue_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUO.yc(), "brown_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUL.yc(), "cyan_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUJ.yc(), "gray_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUP.yc(), "green_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUF.yc(), "light_blue_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUH.yc(), "lime_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUE.yc(), "magenta_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUD.yc(), "orange_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUI.yc(), "pink_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUM.yc(), "purple_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUQ.yc(), "red_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUK.yc(), "silver_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUC.yc(), "white_stained_glass_pane");
        this.a(Blocks.cOJ, b.cUG.yc(), "yellow_stained_glass_pane");
        this.a(Blocks.cOw, b.cUR.yc(), "black_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUN.yc(), "blue_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUO.yc(), "brown_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUL.yc(), "cyan_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUJ.yc(), "gray_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUP.yc(), "green_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUF.yc(), "light_blue_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUH.yc(), "lime_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUE.yc(), "magenta_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUD.yc(), "orange_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUI.yc(), "pink_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUM.yc(), "purple_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUQ.yc(), "red_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUK.yc(), "silver_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUC.yc(), "white_stained_hardened_clay");
        this.a(Blocks.cOw, b.cUG.yc(), "yellow_stained_hardened_clay");
        this.a(Blocks.cLd, BlockStone$EnumType.bbC.yc(), "andesite");
        this.a(Blocks.cLd, BlockStone$EnumType.bbD.yc(), "andesite_smooth");
        this.a(Blocks.cLd, BlockStone$EnumType.bbA.yc(), "diorite");
        this.a(Blocks.cLd, BlockStone$EnumType.bbB.yc(), "diorite_smooth");
        this.a(Blocks.cLd, BlockStone$EnumType.bby.yc(), "granite");
        this.a(Blocks.cLd, BlockStone$EnumType.bbz.yc(), "granite_smooth");
        this.a(Blocks.cLd, BlockStone$EnumType.bbx.yc(), "stone");
        this.a(Blocks.cNh, BlockStoneBrick$EnumType.bbR.yc(), "cracked_stonebrick");
        this.a(Blocks.cNh, BlockStoneBrick$EnumType.bbP.yc(), "stonebrick");
        this.a(Blocks.cNh, BlockStoneBrick$EnumType.bbS.yc(), "chiseled_stonebrick");
        this.a(Blocks.cNh, BlockStoneBrick$EnumType.bbQ.yc(), "mossy_stonebrick");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bce.yc(), "brick_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bcd.yc(), "cobblestone_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bcc.yc(), "old_wood_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bcg.yc(), "nether_brick_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bch.yc(), "quartz_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bcb.yc(), "sandstone_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bcf.yc(), "stone_brick_slab");
        this.a(Blocks.cLW, BlockStoneSlab$EnumType.bca.yc(), "stone_slab");
        this.a(Blocks.cOR, BlockStoneSlabNew$EnumType.bcq.yc(), "red_sandstone_slab");
        this.a(Blocks.cLJ, BlockTallGrass$EnumType.bcy.yi(), "dead_bush");
        this.a(Blocks.cLJ, BlockTallGrass$EnumType.bcA.yi(), "fern");
        this.a(Blocks.cLJ, BlockTallGrass$EnumType.bcz.yi(), "tall_grass");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXN.yc(), "acacia_slab");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXL.yc(), "birch_slab");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXO.yc(), "dark_oak_slab");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXM.yc(), "jungle_slab");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXJ.yc(), "oak_slab");
        this.a(Blocks.cNO, BlockPlanks$EnumType.aXK.yc(), "spruce_slab");
        this.a(Blocks.cLN, b.cUR.yc(), "black_wool");
        this.a(Blocks.cLN, b.cUN.yc(), "blue_wool");
        this.a(Blocks.cLN, b.cUO.yc(), "brown_wool");
        this.a(Blocks.cLN, b.cUL.yc(), "cyan_wool");
        this.a(Blocks.cLN, b.cUJ.yc(), "gray_wool");
        this.a(Blocks.cLN, b.cUP.yc(), "green_wool");
        this.a(Blocks.cLN, b.cUF.yc(), "light_blue_wool");
        this.a(Blocks.cLN, b.cUH.yc(), "lime_wool");
        this.a(Blocks.cLN, b.cUE.yc(), "magenta_wool");
        this.a(Blocks.cLN, b.cUD.yc(), "orange_wool");
        this.a(Blocks.cLN, b.cUI.yc(), "pink_wool");
        this.a(Blocks.cLN, b.cUM.yc(), "purple_wool");
        this.a(Blocks.cLN, b.cUQ.yc(), "red_wool");
        this.a(Blocks.cLN, b.cUK.yc(), "silver_wool");
        this.a(Blocks.cLN, b.cUC.yc(), "white_wool");
        this.a(Blocks.cLN, b.cUG.yc(), "yellow_wool");
        this.a(Blocks.cOE, "acacia_stairs");
        this.a(Blocks.cOu, "activator_rail");
        this.a(Blocks.cOa, "beacon");
        this.a(Blocks.cLj, "bedrock");
        this.a(Blocks.cNX, "birch_stairs");
        this.a(Blocks.cLZ, "bookshelf");
        this.a(Blocks.cLX, "brick_block");
        this.a(Blocks.cLX, "brick_block");
        this.a(Blocks.cNw, "brick_stairs");
        this.a(Blocks.cLR, "brown_mushroom");
        this.a(Blocks.cMM, "cactus");
        this.a(Blocks.cMN, "clay");
        this.a(Blocks.cOC, "coal_block");
        this.a(Blocks.cLs, "coal_ore");
        this.a(Blocks.cLg, "cobblestone");
        this.a(Blocks.cMk, "crafting_table");
        this.a(Blocks.cOF, "dark_oak_stairs");
        this.a(Blocks.cOnn, "daylight_detector");
        this.a(Blocks.cLK, "dead_bush");
        this.a(Blocks.cLG, "detector_rail");
        this.a(Blocks.cMj, "diamond_block");
        this.a(Blocks.cMi, "diamond_ore");
        this.a(Blocks.cLB, "dispenser");
        this.a(Blocks.cOv, "dropper");
        this.a(Blocks.cNV, "emerald_block");
        this.a(Blocks.cNR, "emerald_ore");
        this.a(Blocks.cNE, "enchanting_table");
        this.a(Blocks.cNI, "end_portal_frame");
        this.a(Blocks.cNJ, "end_stone");
        this.a(Blocks.cMQ, "oak_fence");
        this.a(Blocks.cMR, "spruce_fence");
        this.a(Blocks.cMS, "birch_fence");
        this.a(Blocks.cMT, "jungle_fence");
        this.a(Blocks.cMU, "dark_oak_fence");
        this.a(Blocks.cMV, "acacia_fence");
        this.a(Blocks.cNq, "oak_fence_gate");
        this.a(Blocks.cNr, "spruce_fence_gate");
        this.a(Blocks.cNs, "birch_fence_gate");
        this.a(Blocks.cNt, "jungle_fence_gate");
        this.a(Blocks.cNu, "dark_oak_fence_gate");
        this.a(Blocks.cNv, "acacia_fence_gate");
        this.a(Blocks.cMn, "furnace");
        this.a(Blocks.cLy, "glass");
        this.a(Blocks.cNl, "glass_pane");
        this.a(Blocks.cMZ, "glowstone");
        this.a(Blocks.cLF, "golden_rail");
        this.a(Blocks.cLT, "gold_block");
        this.a(Blocks.cLq, "gold_ore");
        this.a(Blocks.cLe, "grass");
        this.a(Blocks.cLp, "gravel");
        this.a(Blocks.cOB, "hardened_clay");
        this.a(Blocks.cOz, "hay_block");
        this.a(Blocks.cOk, "heavy_weighted_pressure_plate");
        this.a(Blocks.cOr, "hopper");
        this.a(Blocks.cMK, "ice");
        this.a(Blocks.cNk, "iron_bars");
        this.a(Blocks.cLU, "iron_block");
        this.a(Blocks.cLr, "iron_ore");
        this.a(Blocks.cOy, "iron_trapdoor");
        this.a(Blocks.cMP, "jukebox");
        this.a(Blocks.cNY, "jungle_stairs");
        this.a(Blocks.cMw, "ladder");
        this.a(Blocks.cLA, "lapis_block");
        this.a(Blocks.cLz, "lapis_ore");
        this.a(Blocks.cMA, "lever");
        this.a(Blocks.cOj, "light_weighted_pressure_plate");
        this.a(Blocks.cNb, "lit_pumpkin");
        this.a(Blocks.cNm, "melon_block");
        this.a(Blocks.cMa, "mossy_cobblestone");
        this.a(Blocks.cNy, "mycelium");
        this.a(Blocks.cMX, "netherrack");
        this.a(Blocks.cNA, "nether_brick");
        this.a(Blocks.cNB, "nether_brick_fence");
        this.a(Blocks.cNC, "nether_brick_stairs");
        this.a(Blocks.cLD, "noteblock");
        this.a(Blocks.cMf, "oak_stairs");
        this.a(Blocks.cMb, "obsidian");
        this.a(Blocks.cOD, "packed_ice");
        this.a(Blocks.cLL, "piston");
        this.a(Blocks.cMW, "pumpkin");
        this.a(Blocks.cOq, "quartz_ore");
        this.a(Blocks.cOt, "quartz_stairs");
        this.a(Blocks.cMx, "rail");
        this.a(Blocks.cOp, "redstone_block");
        this.a(Blocks.cNL, "redstone_lamp");
        this.a(Blocks.cME, "redstone_ore");
        this.a(Blocks.cMH, "redstone_torch");
        this.a(Blocks.cLS, "red_mushroom");
        this.a(Blocks.cNQ, "sandstone_stairs");
        this.a(Blocks.cOP, "red_sandstone_stairs");
        this.a(Blocks.cOL, "sea_lantern");
        this.a(Blocks.cOG, "slime");
        this.a(Blocks.cML, "snow");
        this.a(Blocks.cMJ, "snow_layer");
        this.a(Blocks.cMY, "soul_sand");
        this.a(Blocks.cNW, "spruce_stairs");
        this.a(Blocks.cLH, "sticky_piston");
        this.a(Blocks.cNx, "stone_brick_stairs");
        this.a(Blocks.cMI, "stone_button");
        this.a(Blocks.cMB, "stone_pressure_plate");
        this.a(Blocks.cMy, "stone_stairs");
        this.a(Blocks.cLY, "tnt");
        this.a(Blocks.cMc, "torch");
        this.a(Blocks.cNf, "trapdoor");
        this.a(Blocks.cNT, "tripwire_hook");
        this.a(Blocks.cNp, "vine");
        this.a(Blocks.cNz, "waterlily");
        this.a(Blocks.cLI, "web");
        this.a(Blocks.cOf, "wooden_button");
        this.a(Blocks.cMD, "wooden_pressure_plate");
        this.a(Blocks.cLP, BlockFlower$EnumFlowerType.aVa.yi(), "dandelion");
        this.a(Blocks.cMg, "chest");
        this.a(Blocks.cOi, "trapped_chest");
        this.a(Blocks.cNS, "ender_chest");
        this.a(Items.cPe, "iron_shovel");
        this.a(Items.cPf, "iron_pickaxe");
        this.a(Items.cPg, "iron_axe");
        this.a(Items.cPh, "flint_and_steel");
        this.a(Items.cPi, "apple");
        this.a(Items.cPj, 0, "bow");
        this.a(Items.cPj, 1, "bow_pulling_0");
        this.a(Items.cPj, 2, "bow_pulling_1");
        this.a(Items.cPj, 3, "bow_pulling_2");
        this.a(Items.cPk, "arrow");
        this.a(Items.cPl, 0, "coal");
        this.a(Items.cPl, 1, "charcoal");
        this.a(Items.cPm, "diamond");
        this.a(Items.cPn, "iron_ingot");
        this.a(Items.cPo, "gold_ingot");
        this.a(Items.cPp, "iron_sword");
        this.a(Items.cPq, "wooden_sword");
        this.a(Items.cPr, "wooden_shovel");
        this.a(Items.cPs, "wooden_pickaxe");
        this.a(Items.cPt, "wooden_axe");
        this.a(Items.cPu, "stone_sword");
        this.a(Items.cPv, "stone_shovel");
        this.a(Items.cPw, "stone_pickaxe");
        this.a(Items.cPx, "stone_axe");
        this.a(Items.cPy, "diamond_sword");
        this.a(Items.cPz, "diamond_shovel");
        this.a(Items.cPA, "diamond_pickaxe");
        this.a(Items.cPB, "diamond_axe");
        this.a(Items.cPC, "stick");
        this.a(Items.cPD, "bowl");
        this.a(Items.cPE, "mushroom_stew");
        this.a(Items.cPF, "golden_sword");
        this.a(Items.cPG, "golden_shovel");
        this.a(Items.cPH, "golden_pickaxe");
        this.a(Items.cPI, "golden_axe");
        this.a(Items.cPJ, "string");
        this.a(Items.cPK, "feather");
        this.a(Items.cPL, "gunpowder");
        this.a(Items.cPM, "wooden_hoe");
        this.a(Items.cPN, "stone_hoe");
        this.a(Items.cPO, "iron_hoe");
        this.a(Items.cPP, "diamond_hoe");
        this.a(Items.cPQ, "golden_hoe");
        this.a(Items.cPR, "wheat_seeds");
        this.a(Items.cPS, "wheat");
        this.a(Items.cPT, "bread");
        this.a(Items.cPU, "leather_helmet");
        this.a(Items.cPV, "leather_chestplate");
        this.a(Items.cPW, "leather_leggings");
        this.a(Items.cPX, "leather_boots");
        this.a(Items.cPY, "chainmail_helmet");
        this.a(Items.cPZ, "chainmail_chestplate");
        this.a(Items.cQa, "chainmail_leggings");
        this.a(Items.cQb, "chainmail_boots");
        this.a(Items.cQc, "iron_helmet");
        this.a(Items.cQd, "iron_chestplate");
        this.a(Items.cQe, "iron_leggings");
        this.a(Items.cQf, "iron_boots");
        this.a(Items.cQg, "diamond_helmet");
        this.a(Items.cQh, "diamond_chestplate");
        this.a(Items.cQi, "diamond_leggings");
        this.a(Items.cQj, "diamond_boots");
        this.a(Items.cQk, "golden_helmet");
        this.a(Items.cQl, "golden_chestplate");
        this.a(Items.cQm, "golden_leggings");
        this.a(Items.cQn, "golden_boots");
        this.a(Items.cQo, "flint");
        this.a(Items.cQp, "porkchop");
        this.a(Items.cQq, "cooked_porkchop");
        this.a(Items.cQr, "painting");
        this.a(Items.cQs, "golden_apple");
        this.a(Items.cQs, 1, "golden_apple");
        this.a(Items.cQt, "sign");
        this.a(Items.cQu, "oak_door");
        this.a(Items.cQv, "spruce_door");
        this.a(Items.cQw, "birch_door");
        this.a(Items.cQx, "jungle_door");
        this.a(Items.cQy, "acacia_door");
        this.a(Items.cQz, "dark_oak_door");
        this.a(Items.cQA, "bucket");
        this.a(Items.cQB, "water_bucket");
        this.a(Items.cQC, "lava_bucket");
        this.a(Items.cQD, "minecart");
        this.a(Items.cQE, "saddle");
        this.a(Items.cQF, "iron_door");
        this.a(Items.cQG, "redstone");
        this.a(Items.cQH, "snowball");
        this.a(Items.cQI, "boat");
        this.a(Items.cQJ, "leather");
        this.a(Items.cQK, "milk_bucket");
        this.a(Items.cQL, "brick");
        this.a(Items.cQM, "clay_ball");
        this.a(Items.cQN, "reeds");
        this.a(Items.cQO, "paper");
        this.a(Items.cQP, "book");
        this.a(Items.cQQ, "slime_ball");
        this.a(Items.cQR, "chest_minecart");
        this.a(Items.cQS, "furnace_minecart");
        this.a(Items.cQT, "egg");
        this.a(Items.cQU, "compass");
        this.a(Items.cQV, "fishing_rod");
        this.a(Items.cQV, 1, "fishing_rod_cast");
        this.a(Items.cQW, "clock");
        this.a(Items.cQX, "glowstone_dust");
        this.a(Items.cQY, bd.cWe.yc(), "cod");
        this.a(Items.cQY, bd.cWf.yc(), "salmon");
        this.a(Items.cQY, bd.cWg.yc(), "clownfish");
        this.a(Items.cQY, bd.cWh.yc(), "pufferfish");
        this.a(Items.cQZ, bd.cWe.yc(), "cooked_cod");
        this.a(Items.cQZ, bd.cWf.yc(), "cooked_salmon");
        this.a(Items.cRa, b.cUR.ado(), "dye_black");
        this.a(Items.cRa, b.cUQ.ado(), "dye_red");
        this.a(Items.cRa, b.cUP.ado(), "dye_green");
        this.a(Items.cRa, b.cUO.ado(), "dye_brown");
        this.a(Items.cRa, b.cUN.ado(), "dye_blue");
        this.a(Items.cRa, b.cUM.ado(), "dye_purple");
        this.a(Items.cRa, b.cUL.ado(), "dye_cyan");
        this.a(Items.cRa, b.cUK.ado(), "dye_silver");
        this.a(Items.cRa, b.cUJ.ado(), "dye_gray");
        this.a(Items.cRa, b.cUI.ado(), "dye_pink");
        this.a(Items.cRa, b.cUH.ado(), "dye_lime");
        this.a(Items.cRa, b.cUG.ado(), "dye_yellow");
        this.a(Items.cRa, b.cUF.ado(), "dye_light_blue");
        this.a(Items.cRa, b.cUE.ado(), "dye_magenta");
        this.a(Items.cRa, b.cUD.ado(), "dye_orange");
        this.a(Items.cRa, b.cUC.ado(), "dye_white");
        this.a(Items.cRb, "bone");
        this.a(Items.cRc, "sugar");
        this.a(Items.cRd, "cake");
        this.a(Items.cRe, "bed");
        this.a(Items.cRf, "repeater");
        this.a(Items.cRg, "cookie");
        this.a(Items.cRi, "shears");
        this.a(Items.cRj, "melon");
        this.a(Items.cRk, "pumpkin_seeds");
        this.a(Items.cRl, "melon_seeds");
        this.a(Items.cRm, "beef");
        this.a(Items.cRn, "cooked_beef");
        this.a(Items.cRo, "chicken");
        this.a(Items.cRp, "cooked_chicken");
        this.a(Items.cRs, "rabbit");
        this.a(Items.cRt, "cooked_rabbit");
        this.a(Items.cRq, "mutton");
        this.a(Items.cRr, "cooked_mutton");
        this.a(Items.cRv, "rabbit_foot");
        this.a(Items.cRw, "rabbit_hide");
        this.a(Items.cRu, "rabbit_stew");
        this.a(Items.cRx, "rotten_flesh");
        this.a(Items.cRy, "ender_pearl");
        this.a(Items.cRz, "blaze_rod");
        this.a(Items.cRA, "ghast_tear");
        this.a(Items.cRB, "gold_nugget");
        this.a(Items.cRC, "nether_wart");
        this.bVj.a((net.minecraft.item.d)Items.cRD, new RenderItem$5(this));
        this.a(Items.cRE, "glass_bottle");
        this.a(Items.cRF, "spider_eye");
        this.a(Items.cRG, "fermented_spider_eye");
        this.a(Items.cRH, "blaze_powder");
        this.a(Items.cRI, "magma_cream");
        this.a(Items.cRJ, "brewing_stand");
        this.a(Items.cRK, "cauldron");
        this.a(Items.cRL, "ender_eye");
        this.a(Items.cRM, "speckled_melon");
        this.bVj.a(Items.cRN, new RenderItem$6(this));
        this.a(Items.cRO, "experience_bottle");
        this.a(Items.cRP, "fire_charge");
        this.a(Items.cRQ, "writable_book");
        this.a(Items.cRS, "emerald");
        this.a(Items.cRT, "item_frame");
        this.a(Items.cRU, "flower_pot");
        this.a(Items.cRV, "carrot");
        this.a(Items.cRW, "potato");
        this.a(Items.cRX, "baked_potato");
        this.a(Items.cRY, "poisonous_potato");
        this.a(Items.cRZ, "map");
        this.a(Items.cSa, "golden_carrot");
        this.a(Items.cSb, 0, "skull_skeleton");
        this.a(Items.cSb, 1, "skull_wither");
        this.a(Items.cSb, 2, "skull_zombie");
        this.a(Items.cSb, 3, "skull_char");
        this.a(Items.cSb, 4, "skull_creeper");
        this.a(Items.cSc, "carrot_on_a_stick");
        this.a(Items.cSd, "nether_star");
        this.a(Items.cSe, "pumpkin_pie");
        this.a(Items.cSg, "firework_charge");
        this.a(Items.cSi, "comparator");
        this.a(Items.cSj, "netherbrick");
        this.a(Items.cSk, "quartz");
        this.a(Items.cSl, "tnt_minecart");
        this.a(Items.cSm, "hopper_minecart");
        this.a(Items.cSn, "armor_stand");
        this.a(Items.cSo, "iron_horse_armor");
        this.a(Items.cSp, "golden_horse_armor");
        this.a(Items.cSq, "diamond_horse_armor");
        this.a(Items.cSr, "lead");
        this.a(Items.cSs, "name_tag");
        this.bVj.a(Items.cSI, new RenderItem$7(this));
        this.a(Items.cSu, "record_13");
        this.a(Items.cSv, "record_cat");
        this.a(Items.cSw, "record_blocks");
        this.a(Items.cSx, "record_chirp");
        this.a(Items.cSy, "record_far");
        this.a(Items.cSz, "record_mall");
        this.a(Items.cSA, "record_mellohi");
        this.a(Items.cSB, "record_stal");
        this.a(Items.cSC, "record_strad");
        this.a(Items.cSD, "record_ward");
        this.a(Items.cSE, "record_11");
        this.a(Items.cSF, "record_wait");
        this.a(Items.cSG, "prismarine_shard");
        this.a(Items.cSH, "prismarine_crystals");
        this.bVj.a((net.minecraft.item.d)Items.cSh, new RenderItem$8(this));
        this.bVj.a((net.minecraft.item.d)Items.cRh, new RenderItem$9(this));
        this.a(Blocks.cNZ, "command_block");
        this.a(Items.cSf, "fireworks");
        this.a(Items.cSt, "command_block_minecart");
        this.a(Blocks.cOx, "barrier");
        this.a(Blocks.cMe, "mob_spawner");
        this.a(Items.cRR, "written_book");
        this.a(Blocks.cNi, BlockHugeMushroom$EnumType.aWm.yc(), "brown_mushroom_block");
        this.a(Blocks.cNj, BlockHugeMushroom$EnumType.aWm.yc(), "red_mushroom_block");
        this.a(Blocks.cNK, "dragon_egg");
        if (g.eqw.aDA()) {
            g.g(g.eqw, this.bVj);
        }
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        this.bVj.Kk();
    }

    public static void b(WorldRenderer worldRenderer, BakedQuad bakedQuad, int n2) {
        float f2 = n2 & 0xFF;
        float f3 = n2 >>> 8 & 0xFF;
        float f4 = n2 >>> 16 & 0xFF;
        float f5 = n2 >>> 24 & 0xFF;
        int[] nArray = bakedQuad.LP();
        int n3 = nArray.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = nArray[3 + n3 * i2];
            float f6 = n4 & 0xFF;
            float f7 = n4 >>> 8 & 0xFF;
            float f8 = n4 >>> 16 & 0xFF;
            float f9 = n4 >>> 24 & 0xFF;
            int n5 = Math.min(255, (int)(f2 * f6 / 255.0f));
            int n6 = Math.min(255, (int)(f3 * f7 / 255.0f));
            int n7 = Math.min(255, (int)(f4 * f8 / 255.0f));
            int n8 = Math.min(255, (int)(f5 * f9 / 255.0f));
            worldRenderer.b(worldRenderer.dl(4 - i2), n5, n6, n7, n8);
        }
    }
}

