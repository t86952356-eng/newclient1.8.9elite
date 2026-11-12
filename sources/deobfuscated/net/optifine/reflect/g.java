/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.vecmath.Matrix4f
 */
package net.optifine.reflect;

import com.google.common.base.Optional;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.vecmath.Matrix4f;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.p;
import net.minecraft.client.model.af;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.aj;
import net.minecraft.client.model.ak;
import net.minecraft.client.model.am;
import net.minecraft.client.model.an;
import net.minecraft.client.model.aq;
import net.minecraft.client.model.as;
import net.minecraft.client.model.at;
import net.minecraft.client.model.au;
import net.minecraft.client.model.c;
import net.minecraft.client.model.d;
import net.minecraft.client.model.o;
import net.minecraft.client.model.q;
import net.minecraft.client.model.s;
import net.minecraft.client.model.t;
import net.minecraft.client.model.v;
import net.minecraft.client.multiplayer.a;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderLeashKnot;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.tileentity.RenderEnderCrystal;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.client.renderer.tileentity.RenderWitherSkull;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.entity.aa;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ad;
import net.minecraft.tileentity.l;
import net.minecraft.tileentity.u;
import net.minecraft.tileentity.y;
import net.minecraft.util.av;
import net.minecraft.util.bq;
import net.minecraft.util.cm;
import net.minecraft.world.ac;
import net.minecraft.world.w;
import net.optifine.reflect.e;
import net.optifine.reflect.h;
import net.optifine.reflect.i;
import net.optifine.reflect.j;
import net.optifine.reflect.k;
import net.optifine.reflect.m;

public class g {
    private static final boolean enh = g.iu("*** Reflector Forge ***");
    public static h eni = new h("mods.betterfoliage.client.BetterFoliageClient");
    public static h enj = new h("net.minecraftforge.fml.common.asm.transformers.BlamingTransformer");
    public static m enk = new m(enj, "onCrash");
    public static h enl = new h("net.minecraftforge.event.world.ChunkWatchEvent$UnWatch");
    public static i enm = new i(enl, new Class[]{net.minecraft.world.b.class, net.minecraft.entity.player.e.class});
    public static h enn = new h("net.minecraftforge.fml.relauncher.CoreModManager");
    public static m eno = new m(enn, "onCrash");
    public static h enp = new h("net.minecraftforge.common.DimensionManager");
    public static m enq = new m(enp, "createProviderFor");
    public static m enr = new m(enp, "getStaticDimensionIDs");
    public static h ens = new h("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
    public static i ent = new i(ens, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
    public static h enu = new h("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
    public static i env = new i(enu, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
    public static h enw = new h("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
    public static i enx = new i(enw, new Class[]{EntityRenderer.class, net.minecraft.entity.c.class, Block.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
    public static j eny = new j(enw, "yaw");
    public static j enz = new j(enw, "pitch");
    public static j enA = new j(enw, "roll");
    public static h enB = new h("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
    public static i enC = new i(enB, new Class[]{EntityRenderer.class, net.minecraft.entity.c.class, Block.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
    public static j enD = new j(enB, "red");
    public static j enE = new j(enB, "green");
    public static j enF = new j(enB, "blue");
    public static h enG = new h("net.minecraftforge.fml.common.eventhandler.Event");
    public static m enH = new m(enG, "isCanceled");
    public static h enI = new h("net.minecraftforge.fml.common.eventhandler.EventBus");
    public static m enJ = new m(enI, "post");
    public static h enK = new h("net.minecraftforge.fml.common.eventhandler.Event$Result");
    public static j enL = new j(enK, "DENY");
    public static j enM = new j(enK, "ALLOW");
    public static j enN = new j(enK, "DEFAULT");
    public static h enO = new h("net.minecraftforge.common.property.ExtendedBlockState");
    public static i enP = new i(enO, new Class[]{Block.class, IProperty[].class, net.minecraftforge.common.property.a[].class});
    public static h enQ = new h("net.minecraftforge.fml.client.FMLClientHandler");
    public static m enR = new m(enQ, "instance");
    public static m enS = new m(enQ, "handleLoadingScreen");
    public static m enT = new m(enQ, "isLoading");
    public static m enU = new m(enQ, "trackBrokenTexture");
    public static m enV = new m(enQ, "trackMissingTexture");
    public static h enW = new h("net.minecraftforge.fml.common.FMLCommonHandler");
    public static m enX = new m(enW, "callFuture");
    public static m enY = new m(enW, "enhanceCrashReport");
    public static m enZ = new m(enW, "getBrandings");
    public static m eoa = new m(enW, "handleServerAboutToStart");
    public static m eob = new m(enW, "handleServerStarting");
    public static m eoc = new m(enW, "instance");
    public static h eod = new h(net.minecraft.world.biome.j.class);
    public static m eoe = new m(eod, "getWaterColorMultiplier");
    public static h eof = new h(Block.class);
    public static m eog = new m(eof, "addDestroyEffects");
    public static m eoh = new m(eof, "addHitEffects");
    public static m eoi = new m(eof, "canCreatureSpawn");
    public static m eoj = new m(eof, "canRenderInLayer", new Class[]{av.class});
    public static m eok = new m(eof, "doesSideBlockRendering");
    public static m eol = new m(eof, "getBedDirection");
    public static m eom = new m(eof, "getExtendedState");
    public static m eon = new m(eof, "getLightOpacity", new Class[]{net.minecraft.world.l.class, net.minecraft.util.b.class});
    public static m eoo = new m(eof, "getLightValue", new Class[]{net.minecraft.world.l.class, net.minecraft.util.b.class});
    public static m eop = new m(eof, "hasTileEntity", new Class[]{IBlockState.class});
    public static m eoq = new m(eof, "isAir");
    public static m eor = new m(eof, "isBed");
    public static m eos = new m(eof, "isBedFoot");
    public static m eot = new m(eof, "isSideSolid");
    public static h eou = new h(net.minecraft.world.a.class);
    public static m eov = new m(eou, "isSideSolid");
    public static h eow = new h(net.minecraft.entity.c.class);
    public static m eox = new m(eow, "canRiderInteract");
    public static j eoy = new j(eow, "captureDrops");
    public static j eoz = new j(eow, "capturedDrops");
    public static m eoA = new m(eow, "shouldRenderInPass");
    public static m eoB = new m(eow, "shouldRiderSit");
    public static h eoC = new h("net.minecraftforge.event.ForgeEventFactory");
    public static m eoD = new m(eoC, "canEntityDespawn");
    public static m eoE = new m(eoC, "canEntitySpawn");
    public static m eoF = new m(eoC, "doSpecialSpawn", new Class[]{net.minecraft.entity.p.class, w.class, Float.TYPE, Float.TYPE, Float.TYPE});
    public static m eoG = new m(eoC, "getMaxSpawnPackSize");
    public static m eoH = new m(eoC, "renderBlockOverlay");
    public static m eoI = new m(eoC, "renderFireOverlay");
    public static m eoJ = new m(eoC, "renderWaterOverlay");
    public static h eoK = new h("net.minecraftforge.common.ForgeHooks");
    public static m eoL = new m(eoK, "onLivingAttack");
    public static m eoM = new m(eoK, "onLivingDeath");
    public static m eoN = new m(eoK, "onLivingDrops");
    public static m eoO = new m(eoK, "onLivingFall");
    public static m eoP = new m(eoK, "onLivingHurt");
    public static m eoQ = new m(eoK, "onLivingJump");
    public static m eoR = new m(eoK, "onLivingSetAttackTarget");
    public static m eoS = new m(eoK, "onLivingUpdate");
    public static h eoT = new h("net.minecraftforge.client.ForgeHooksClient");
    public static m eoU = new m(eoT, "applyTransform", new Class[]{Matrix4f.class, Optional.class});
    public static m eoV = new m(eoT, "dispatchRenderLast");
    public static m eoW = new m(eoT, "drawScreen");
    public static m eoX = new m(eoT, "fillNormal");
    public static m eoY = new m(eoT, "handleCameraTransforms");
    public static m eoZ = new m(eoT, "getArmorModel");
    public static m epa = new m(eoT, "getArmorTexture");
    public static m epb = new m(eoT, "getFogDensity");
    public static m epc = new m(eoT, "getFOVModifier");
    public static m epd = new m(eoT, "getMatrix", new Class[]{ModelRotation.class});
    public static m epe = new m(eoT, "getOffsetFOV");
    public static m epf = new m(eoT, "loadEntityShader");
    public static m epg = new m(eoT, "onDrawBlockHighlight");
    public static m eph = new m(eoT, "onFogRender");
    public static m epi = new m(eoT, "onTextureStitchedPre");
    public static m epj = new m(eoT, "onTextureStitchedPost");
    public static m epk = new m(eoT, "orientBedCamera");
    public static m epl = new m(eoT, "putQuadColor");
    public static m epm = new m(eoT, "renderFirstPersonHand");
    public static m epn = new m(eoT, "renderMainMenu");
    public static m epo = new m(eoT, "setRenderLayer");
    public static m epp = new m(eoT, "setRenderPass");
    public static m epq = new m(eoT, "transform");
    public static h epr = new h(net.minecraft.item.d.class);
    public static j eps = new j(epr, "delegate");
    public static m ept = new m(epr, "getDurabilityForDisplay");
    public static m epu = new m(epr, "getModel");
    public static m epv = new m(epr, "onEntitySwing");
    public static m epw = new m(epr, "shouldCauseReequipAnimation");
    public static m epx = new m(epr, "showDurabilityBar");
    public static h epy = new h("net.minecraftforge.common.ForgeModContainer");
    public static j epz = new j(epy, "forgeLightPipelineEnabled");
    public static h epA = new h(net.minecraft.potion.d.class);
    public static m epB = new m(epA, "isCurativeItem");
    public static h epC = new h(net.minecraft.tileentity.d.class);
    public static m epD = new m(epC, "canRenderBreaking");
    public static m epE = new m(epC, "getRenderBoundingBox");
    public static m epF = new m(epC, "hasFastRenderer");
    public static m epG = new m(epC, "shouldRenderInPass");
    public static h epH = new h(VertexFormatElement$EnumUsage.class);
    public static m epI = new m(epH, "preDraw");
    public static m epJ = new m(epH, "postDraw");
    public static h epK = new h(w.class);
    public static m epL = new m(epK, "countEntities", new Class[]{aa.class, Boolean.TYPE});
    public static m epM = new m(epK, "getPerWorldStorage");
    public static h epN = new h(ac.class);
    public static m epO = new m(epN, "getCloudRenderer");
    public static m epP = new m(epN, "getSkyRenderer");
    public static m epQ = new m(epN, "getWeatherRenderer");
    public static m epR = new m(epN, "getSaveFolder");
    public static h epS = new h("net.minecraftforge.fml.client.GuiModList");
    public static i epT = new i(epS, new Class[]{GuiScreen.class});
    public static h epU = new h("net.minecraftforge.client.model.IColoredBakedQuad");
    public static h epV = new h("net.minecraftforge.common.property.IExtendedBlockState");
    public static m epW = new m(epV, "getClean");
    public static h epX = new h("net.minecraftforge.client.model.IModel");
    public static m epY = new m(epX, "getTextures");
    public static h epZ = new h("net.minecraftforge.client.IRenderHandler");
    public static m eqa = new m(epZ, "render");
    public static h eqb = new h("net.minecraftforge.client.ItemModelMesherForge");
    public static i eqc = new i(eqb, new Class[]{ModelManager.class});
    public static h eqd = new h("net.minecraft.launchwrapper.Launch");
    public static j eqe = new j(eqd, "blackboard");
    public static h eqf = new h("net.minecraftforge.client.model.pipeline.LightUtil");
    public static j eqg = new j(eqf, "itemConsumer");
    public static m eqh = new m(eqf, "putBakedQuad");
    public static m eqi = new m(eqf, "renderQuadColor");
    public static j eqj = new j(eqf, "tessellator");
    public static h eqk = new h("net.minecraftforge.fml.common.Loader");
    public static m eql = new m(eqk, "getActiveModList");
    public static m eqm = new m(eqk, "instance");
    public static h eqn = new h("net.minecraftforge.common.MinecraftForge");
    public static j eqo = new j(eqn, "EVENT_BUS");
    public static h eqp = new h("net.minecraftforge.client.MinecraftForgeClient");
    public static m eqq = new m(eqp, "getRenderPass");
    public static m eqr = new m(eqp, "onRebuildChunk");
    public static h eqs = new h("net.minecraftforge.fml.common.ModContainer");
    public static m eqt = new m(eqs, "getModId");
    public static h equ = new h("net.minecraftforge.client.model.ModelLoader");
    public static j eqv = new j(equ, "stateModels");
    public static m eqw = new m(equ, "onRegisterItems");
    public static m eqx = new m(equ, "getInventoryVariant");
    public static j eqy = new j(equ, "textures", true);
    public static h eqz = new h("net.minecraftforge.client.model.ModelLoader$VanillaLoader", true);
    public static j eqA = new j(eqz, "instance", true);
    public static m eqB = new m(eqz, "loadModel", null, true);
    public static h eqC = new h("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
    public static j eqD = new j(eqC, "BLOCK");
    public static h eqE = new h("net.minecraftforge.fml.client.registry.RenderingRegistry");
    public static m eqF = new m(eqE, "loadEntityRenderers", new Class[]{RenderManager.class, Map.class});
    public static h eqG = new h("net.minecraftforge.client.event.RenderItemInFrameEvent");
    public static i eqH = new i(eqG, new Class[]{net.minecraft.entity.item.j.class, RenderItemFrame.class});
    public static h eqI = new h("net.minecraftforge.client.event.RenderLivingEvent$Pre");
    public static i eqJ = new i(eqI, new Class[]{r.class, RendererLivingEntity.class, Double.TYPE, Double.TYPE, Double.TYPE});
    public static h eqK = new h("net.minecraftforge.client.event.RenderLivingEvent$Post");
    public static i eqL = new i(eqK, new Class[]{r.class, RendererLivingEntity.class, Double.TYPE, Double.TYPE, Double.TYPE});
    public static h eqM = new h("net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre");
    public static i eqN = new i(eqM, new Class[]{r.class, RendererLivingEntity.class, Double.TYPE, Double.TYPE, Double.TYPE});
    public static h eqO = new h("net.minecraftforge.client.event.RenderLivingEvent$Specials$Post");
    public static i eqP = new i(eqO, new Class[]{r.class, RendererLivingEntity.class, Double.TYPE, Double.TYPE, Double.TYPE});
    public static h eqQ = new h("net.minecraftforge.fml.client.SplashProgress");
    public static h eqR = new h("net.minecraftforge.event.world.WorldEvent$Load");
    public static i eqS = new i(eqR, new Class[]{w.class});
    private static final boolean eqT = g.iu("*** Reflector Vanilla ***");
    public static h eqU = new h(a.class);
    public static j eqV = new j(eqU, bq.class);
    public static h eqW = new h(z.class);
    public static j eqX = new j(new e(z.class, new Class[0], Integer.TYPE, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, ad.class}, "EntityVillager.careerId"));
    public static j eqY = new j(new e(z.class, new Class[]{Integer.TYPE}, Integer.TYPE, new Class[]{Boolean.TYPE, Boolean.TYPE, ad.class}, "EntityVillager.careerLevel"));
    public static h eqZ = new h(b.class);
    public static j era = new j(eqZ, ab.class);
    public static h erb = new h(net.minecraft.client.gui.inventory.g.class);
    public static j erc = new j(erb, ab.class);
    public static h erd = new h(net.minecraft.client.gui.inventory.h.class);
    public static j ere = new j(erd, ab.class, 1);
    public static h erf = new h(net.minecraft.client.gui.s.class);
    public static j erg = new j(erf, net.minecraft.world.p.class);
    public static h erh = new h(p.class);
    public static j eri = new j(erh, ab.class);
    public static h erj = new h(net.minecraft.client.gui.y.class);
    public static j erk = new j(erj, ab.class, 1);
    public static h erl = new h(net.minecraft.client.gui.am.class);
    public static j erm = new j(erl, String.class);
    public static h ern = new h(Minecraft.class);
    public static j ero = new j(ern, DefaultResourcePack.class);
    public static h erp = new h(v.class);
    public static j erq = new j(erp, ag.class);
    public static h err = new h(net.minecraft.client.model.e.class);
    public static k ers = new k(err, ag.class, 6);
    public static h ert = new h(net.minecraft.client.model.g.class);
    public static j eru = new j(ert, ag.class);
    public static j erv = new j(ert, ag[].class);
    public static h erw = new h(ModelBlock.class);
    public static j erx = new j(erw, cm.class);
    public static j ery = new j(erw, Map.class);
    public static h erz = new h(o.class);
    public static k erA = new k(erz, ag.class, 12);
    public static h erB = new h(net.minecraft.client.model.p.class);
    public static k erC = new k(erB, ag.class, 3);
    public static h erD = new h(RenderEnderCrystal.class);
    public static j erE = new j(erD, d.class, 0);
    public static h erF = new h(q.class);
    public static j erG = new j(erF, ag[].class);
    public static h erH = new h(s.class);
    public static j erI = new j(erH, ag.class);
    public static j erJ = new j(erH, ag[].class);
    public static h erK = new h(t.class);
    public static j erL = new j(erK, ag.class, 0);
    public static j erM = new j(erK, ag.class, 1);
    public static j erN = new j(erK, ag[].class, 0);
    public static j erO = new j(erK, ag[].class, 1);
    public static h erP = new h(net.minecraft.client.model.u.class);
    public static k erQ = new k(erP, ag.class, 39);
    public static h erR = new h(RenderLeashKnot.class);
    public static j erS = new j(erR, net.minecraft.client.model.y.class);
    public static h erT = new h(net.minecraft.client.model.z.class);
    public static j erU = new j(erT, ag.class);
    public static j erV = new j(erT, ag[].class);
    public static h erW = new h(net.minecraft.client.model.ab.class);
    public static k erX = new k(erW, ag.class, 8);
    public static h erY = new h(af.class);
    public static k erZ = new k(erY, ag.class, 12);
    public static h esa = new h(ak.class);
    public static j esb = new j(esa, ag[].class, 0);
    public static j esc = new j(esa, ag[].class, 1);
    public static h esd = new h(an.class);
    public static k ese = new k(esd, ag.class, 4);
    public static h esf = new h(aq.class);
    public static j esg = new j(esf, ag.class);
    public static j esh = new j(esf, ag[].class);
    public static h esi = new h(as.class);
    public static j esj = new j(esi, ag.class, 0);
    public static j esk = new j(esi, ag.class, 1);
    public static h esl = new h(at.class);
    public static j esm = new j(esl, ag[].class, 0);
    public static j esn = new j(esl, ag[].class, 1);
    public static h eso = new h(au.class);
    public static j esp = new j(eso, ag.class, 6);
    public static j esq = new j(eso, ag.class, 7);
    public static h esr = new h("optifine.OptiFineClassTransformer");
    public static j ess = new j(esr, "instance");
    public static m est = new m(esr, "getOptiFineResource");
    public static h esu = new h(RenderBoat.class);
    public static j esv = new j(esu, d.class);
    public static h esw = new h(RenderMinecart.class);
    public static j esx = new j(esw, d.class);
    public static h esy = new h(RenderWitherSkull.class);
    public static j esz = new j(esy, am.class);
    public static h esA = new h(TileEntityBannerRenderer.class);
    public static j esB = new j(esA, c.class);
    public static h esC = new h(net.minecraft.tileentity.j.class);
    public static j esD = new j(esC, String.class);
    public static h esE = new h(l.class);
    public static j esF = new j(esE, String.class);
    public static h esG = new h(TileEntityChestRenderer.class);
    public static j esH = new j(esG, net.minecraft.client.model.k.class, 0);
    public static j esI = new j(esG, net.minecraft.client.model.k.class, 1);
    public static h esJ = new h(u.class);
    public static j esK = new j(esJ, String.class);
    public static h esL = new h(TileEntityEnchantmentTableRenderer.class);
    public static j esM = new j(esL, net.minecraft.client.model.i.class);
    public static h esN = new h(TileEntityEnderChestRenderer.class);
    public static j esO = new j(esN, net.minecraft.client.model.k.class);
    public static h esP = new h(y.class);
    public static j esQ = new j(esP, String.class);
    public static h esR = new h(TileEntitySignRenderer.class);
    public static j esS = new j(esR, aj.class);
    public static h esT = new h(TileEntitySkullRenderer.class);
    public static j esU = new j(esT, am.class, 0);
    public static j esV = new j(esT, am.class, 1);

    public static void a(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return;
            }
            method.invoke(null, objectArray);
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
        }
    }

    public static boolean b(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return false;
            }
            Boolean bl2 = (Boolean)method.invoke(null, objectArray);
            return bl2;
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return false;
        }
    }

    public static int c(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0;
            }
            Integer n2 = (Integer)method.invoke(null, objectArray);
            return n2;
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return 0;
        }
    }

    public static float d(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0.0f;
            }
            Float f2 = (Float)method.invoke(null, objectArray);
            return f2.floatValue();
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return 0.0f;
        }
    }

    public static double e(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0.0;
            }
            Double d2 = (Double)method.invoke(null, objectArray);
            return d2;
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return 0.0;
        }
    }

    public static String f(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return null;
            }
            String string = (String)method.invoke(null, objectArray);
            return string;
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return null;
        }
    }

    public static Object g(m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return null;
            }
            Object object = method.invoke(null, objectArray);
            return object;
        }
        catch (Throwable throwable) {
            g.a(throwable, null, m2, objectArray);
            return null;
        }
    }

    public static void a(Object object, m m2, Object ... objectArray) {
        try {
            if (object == null) {
                return;
            }
            Method method = m2.aDI();
            if (method == null) {
                return;
            }
            method.invoke(object, objectArray);
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
        }
    }

    public static boolean b(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return false;
            }
            Boolean bl2 = (Boolean)method.invoke(object, objectArray);
            return bl2;
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return false;
        }
    }

    public static int c(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0;
            }
            Integer n2 = (Integer)method.invoke(object, objectArray);
            return n2;
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return 0;
        }
    }

    public static float d(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0.0f;
            }
            Float f2 = (Float)method.invoke(object, objectArray);
            return f2.floatValue();
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return 0.0f;
        }
    }

    public static double e(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return 0.0;
            }
            Double d2 = (Double)method.invoke(object, objectArray);
            return d2;
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return 0.0;
        }
    }

    public static String f(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return null;
            }
            String string = (String)method.invoke(object, objectArray);
            return string;
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return null;
        }
    }

    public static Object g(Object object, m m2, Object ... objectArray) {
        try {
            Method method = m2.aDI();
            if (method == null) {
                return null;
            }
            Object object2 = method.invoke(object, objectArray);
            return object2;
        }
        catch (Throwable throwable) {
            g.a(throwable, object, m2, objectArray);
            return null;
        }
    }

    public static Object a(j j2) {
        return g.a(null, j2);
    }

    public static Object a(Object object, j j2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return null;
            }
            Object object2 = field.get(object);
            return object2;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static boolean a(j j2, boolean bl2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return bl2;
            }
            boolean bl3 = field.getBoolean(null);
            return bl3;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return bl2;
        }
    }

    public static boolean a(Object object, j j2, boolean bl2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return bl2;
            }
            boolean bl3 = field.getBoolean(object);
            return bl3;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return bl2;
        }
    }

    public static Object a(k k2, int n2) {
        j j2 = k2.jA(n2);
        return j2 == null ? null : g.a(j2);
    }

    public static Object a(Object object, k k2, int n2) {
        j j2 = k2.jA(n2);
        return j2 == null ? null : g.a(object, j2);
    }

    public static float a(Object object, j j2, float f2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return f2;
            }
            float f3 = field.getFloat(object);
            return f3;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return f2;
        }
    }

    public static int a(Object object, j j2, int n2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return n2;
            }
            int n3 = field.getInt(object);
            return n3;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return n2;
        }
    }

    public static long a(Object object, j j2, long l2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return l2;
            }
            long l3 = field.getLong(object);
            return l3;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return l2;
        }
    }

    public static boolean a(j j2, Object object) {
        return g.a(null, j2, object);
    }

    public static boolean a(Object object, j j2, Object object2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return false;
            }
            field.set(object, object2);
            return true;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return false;
        }
    }

    public static boolean a(j j2, int n2) {
        return g.b(null, j2, n2);
    }

    public static boolean b(Object object, j j2, int n2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return false;
            }
            field.setInt(object, n2);
            return true;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return false;
        }
    }

    public static boolean a(i i2, Object ... objectArray) {
        Object object = g.b(i2, objectArray);
        return object != null && g.E(object);
    }

    public static boolean E(Object object) {
        if (object == null) {
            return false;
        }
        Object object2 = g.a(eqo);
        if (object2 == null) {
            return false;
        }
        Object object3 = g.g(object2, enJ, object);
        if (!(object3 instanceof Boolean)) {
            return false;
        }
        Boolean bl2 = (Boolean)object3;
        return bl2;
    }

    public static Object b(i i2, Object ... objectArray) {
        Constructor constructor = i2.aDC();
        if (constructor == null) {
            return null;
        }
        try {
            Object t2 = constructor.newInstance(objectArray);
            return t2;
        }
        catch (Throwable throwable) {
            g.a(throwable, i2, objectArray);
            return null;
        }
    }

    public static boolean a(Class[] classArray, Class[] classArray2) {
        if (classArray.length != classArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 < classArray2.length; ++i2) {
            Class clazz = classArray[i2];
            Class clazz2 = classArray2[i2];
            if (clazz == clazz2) continue;
            return false;
        }
        return true;
    }

    private static void a(boolean bl2, String string, m m2, Object[] objectArray, Object object) {
        String string2 = m2.aDI().getDeclaringClass().getName();
        String string3 = m2.aDI().getName();
        String string4 = "";
        if (bl2) {
            string4 = " static";
        }
        net.minecraft.src.a.fN(string + string4 + " " + string2 + "." + string3 + "(" + net.minecraft.src.a.c(objectArray) + ") => " + String.valueOf(object));
    }

    private static void a(boolean bl2, String string, m m2, Object[] objectArray) {
        String string2 = m2.aDI().getDeclaringClass().getName();
        String string3 = m2.aDI().getName();
        String string4 = "";
        if (bl2) {
            string4 = " static";
        }
        net.minecraft.src.a.fN(string + string4 + " " + string2 + "." + string3 + "(" + net.minecraft.src.a.c(objectArray) + ")");
    }

    private static void a(boolean bl2, String string, j j2, Object object) {
        String string2 = j2.aDE().getDeclaringClass().getName();
        String string3 = j2.aDE().getName();
        String string4 = "";
        if (bl2) {
            string4 = " static";
        }
        net.minecraft.src.a.fN(string + string4 + " " + string2 + "." + string3 + " => " + String.valueOf(object));
    }

    private static void a(Throwable throwable, Object object, m m2, Object[] objectArray) {
        if (throwable instanceof InvocationTargetException) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException)throwable2;
                throw runtimeException;
            }
            throwable.printStackTrace();
        } else {
            if (throwable instanceof IllegalArgumentException) {
                net.minecraft.src.a.warn("*** IllegalArgumentException ***");
                net.minecraft.src.a.warn("Method: " + String.valueOf(m2.aDI()));
                net.minecraft.src.a.warn("Object: " + String.valueOf(object));
                net.minecraft.src.a.warn("Parameter classes: " + net.minecraft.src.a.c(g.e(objectArray)));
                net.minecraft.src.a.warn("Parameters: " + net.minecraft.src.a.c(objectArray));
            }
            net.minecraft.src.a.warn("*** Exception outside of method ***");
            net.minecraft.src.a.warn("Method deactivated: " + String.valueOf(m2.aDI()));
            m2.aDD();
            throwable.printStackTrace();
        }
    }

    private static void a(Throwable throwable, i i2, Object[] objectArray) {
        if (throwable instanceof InvocationTargetException) {
            throwable.printStackTrace();
        } else {
            if (throwable instanceof IllegalArgumentException) {
                net.minecraft.src.a.warn("*** IllegalArgumentException ***");
                net.minecraft.src.a.warn("Constructor: " + String.valueOf(i2.aDC()));
                net.minecraft.src.a.warn("Parameter classes: " + net.minecraft.src.a.c(g.e(objectArray)));
                net.minecraft.src.a.warn("Parameters: " + net.minecraft.src.a.c(objectArray));
            }
            net.minecraft.src.a.warn("*** Exception outside of constructor ***");
            net.minecraft.src.a.warn("Constructor deactivated: " + String.valueOf(i2.aDC()));
            i2.aDD();
            throwable.printStackTrace();
        }
    }

    private static Object[] e(Object[] objectArray) {
        if (objectArray == null) {
            return new Class[0];
        }
        Object[] objectArray2 = new Class[objectArray.length];
        for (int i2 = 0; i2 < objectArray2.length; ++i2) {
            Object object = objectArray[i2];
            if (object == null) continue;
            objectArray2[i2] = object.getClass();
        }
        return objectArray2;
    }

    private static j[] a(h h2, Class clazz, int n2) {
        j[] jArray = new j[n2];
        for (int i2 = 0; i2 < jArray.length; ++i2) {
            jArray[i2] = new j(h2, clazz, i2);
        }
        return jArray;
    }

    private static boolean iu(String string) {
        net.minecraft.src.a.fN(string);
        return true;
    }
}

