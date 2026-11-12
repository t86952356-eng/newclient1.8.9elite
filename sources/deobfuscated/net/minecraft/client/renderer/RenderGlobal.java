/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonSyntaxException
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import hackclient.rise.di;
import hackclient.rise.eu;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.particle.ae;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.ChunkRenderContainer;
import net.minecraft.client.renderer.DestroyBlockProgress;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal$1;
import net.minecraft.client.renderer.RenderGlobal$ContainerLocalRenderInformation;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderList;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VboRenderList;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.renderer.chunk.ListChunkFactory;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.chunk.VboChunkFactory;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.shader.e;
import net.minecraft.crash.i;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ar;
import net.minecraft.item.bz;
import net.minecraft.tileentity.m;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.bq;
import net.minecraft.util.bt;
import net.minecraft.util.bu;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.util.db;
import net.minecraft.util.dd;
import net.minecraft.util.y;
import net.minecraft.world.ac;
import net.minecraft.world.chunk.h;
import net.minecraft.world.l;
import net.minecraft.world.o;
import net.minecraft.world.w;
import net.optifine.au;
import net.optifine.bd;
import net.optifine.bi;
import net.optifine.model.b;
import net.optifine.render.c;
import net.optifine.render.d;
import net.optifine.render.g;
import net.optifine.s;
import net.optifine.shaders.ah;
import net.optifine.shaders.aj;
import net.optifine.shaders.al;
import net.optifine.util.ag;
import net.optifine.util.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.util.InstanceAccess;

public class RenderGlobal
implements InstanceAccess,
IResourceManagerReloadListener,
o {
    private static final Logger bNG = LogManager.getLogger();
    private static final cm bNH = new cm("textures/environment/moon_phases.png");
    private static final cm bNI = new cm("textures/environment/sun.png");
    private static final cm bNJ = new cm("textures/environment/clouds.png");
    private static final cm bNK = new cm("textures/environment/end_sky.png");
    private static final cm bNL = new cm("textures/misc/forcefield.png");
    public final Minecraft bNM;
    private final TextureManager bNN;
    private final RenderManager bNO;
    private j bgF;
    private Set<RenderChunk> bNP = Sets.newLinkedHashSet();
    private List<RenderGlobal$ContainerLocalRenderInformation> bNQ = Lists.newArrayListWithCapacity((int)69696);
    private final Set<net.minecraft.tileentity.d> bNR = Sets.newHashSet();
    private ViewFrustum bNS;
    private int bNT = -1;
    private int bNU = -1;
    private int bNV = -1;
    private final VertexFormat bNW;
    private VertexBuffer bNX;
    private VertexBuffer bNY;
    private VertexBuffer bNZ;
    private int bOa;
    public final Map<Integer, DestroyBlockProgress> bOb = Maps.newHashMap();
    private final Map<net.minecraft.util.b, ISound> bOc = Maps.newHashMap();
    private final TextureAtlasSprite[] bOd = new TextureAtlasSprite[10];
    private net.minecraft.client.shader.a bOe;
    private net.minecraft.client.shader.d bOf;
    private double bOg = Double.MIN_VALUE;
    private double bOh = Double.MIN_VALUE;
    private double bOi = Double.MIN_VALUE;
    private int bOj = Integer.MIN_VALUE;
    private int bOk = Integer.MIN_VALUE;
    private int bOl = Integer.MIN_VALUE;
    private double bOm = Double.MIN_VALUE;
    private double bOn = Double.MIN_VALUE;
    private double bOo = Double.MIN_VALUE;
    private double bOp = Double.MIN_VALUE;
    private double bOq = Double.MIN_VALUE;
    private final ChunkRenderDispatcher bOr = new ChunkRenderDispatcher();
    private ChunkRenderContainer bOs;
    private int bOt = -1;
    private int bOu = 2;
    private int bOv;
    private int bOw;
    private int bOx;
    private boolean bOy = false;
    private ClippingHelper bOz;
    private final Vector4f[] bOA = new Vector4f[8];
    private final dd bOB = new dd();
    private boolean bOC = false;
    IRenderChunkFactory bOD;
    private double bOE;
    private double bOF;
    private double bOG;
    public boolean bOH = true;
    private final d bOI;
    public net.minecraft.entity.c bOJ;
    public Set bOK = new LinkedHashSet();
    public Set bOL = new LinkedHashSet();
    private final Deque bOM = new ArrayDeque();
    private List bON = new ArrayList(1024);
    private List bOO = new ArrayList(1024);
    private final List bOP = new ArrayList(1024);
    private final List bOQ = new ArrayList(1024);
    private final List bOR = new ArrayList(1024);
    private final List bOS = new ArrayList(1024);
    private final List bOT = new ArrayList(1024);
    private final List bOU = new ArrayList(1024);
    private int bOV = 0;
    private int bOW = 0;
    private static final Set bOX = Collections.unmodifiableSet(new HashSet<ao>(Arrays.asList(ao.dwD)));
    private int bOY;
    private h bOZ = null;
    private bq bPa = null;
    private int bPb = 0;
    private final g bPc = new g(Blocks.cLc.xM(), new net.minecraft.util.b(0, 0, 0));
    public boolean bPd = false;
    public boolean bPe = false;
    private boolean bPf = false;
    private static int bPg = 0;
    private a bPh = new a();

    public RenderGlobal(Minecraft minecraft) {
        this.bOI = new d(minecraft);
        this.bNM = minecraft;
        this.bNO = minecraft.BF();
        this.bNN = minecraft.Bq();
        this.bNN.a(bNL);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GlStateManager.ap(0);
        this.KB();
        this.bOC = OpenGlHelper.Kv();
        if (this.bOC) {
            this.bOs = new VboRenderList();
            this.bOD = new VboChunkFactory();
        } else {
            this.bOs = new RenderList();
            this.bOD = new ListChunkFactory();
        }
        this.bNW = new VertexFormat();
        this.bNW.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3));
        this.KH();
        this.KG();
        this.KF();
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        this.KB();
    }

    private void KB() {
        TextureMap textureMap = this.bNM.Bu();
        for (int i2 = 0; i2 < this.bOd.length; ++i2) {
            this.bOd[i2] = textureMap.dq("minecraft:blocks/destroy_stage_" + i2);
        }
    }

    public void KC() {
        if (OpenGlHelper.bNi) {
            if (e.Rx() == null) {
                e.Rw();
            }
            cm cm2 = new cm("shaders/post/entity_outline.json");
            try {
                this.bOf = new net.minecraft.client.shader.d(this.bNM.Bq(), this.bNM.Br(), this.bNM.Aw(), cm2);
                this.bOf.al(this.bNM.bgz, this.bNM.bgA);
                this.bOe = this.bOf.dC("final");
            }
            catch (IOException iOException) {
                bNG.warn("Failed to load shader: " + String.valueOf(cm2), (Throwable)iOException);
                this.bOf = null;
                this.bOe = null;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                bNG.warn("Failed to load shader: " + String.valueOf(cm2), (Throwable)jsonSyntaxException);
                this.bOf = null;
                this.bOe = null;
            }
        } else {
            this.bOf = null;
            this.bOe = null;
        }
    }

    public void KD() {
        if (this.KE()) {
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 0, 1);
            this.bOe.c(this.bNM.bgz, this.bNM.bgA, false);
            GlStateManager.tR();
        }
    }

    protected boolean KE() {
        return !net.minecraft.src.a.aoE() && !net.minecraft.src.a.aoG() && !net.minecraft.src.a.aoi() && this.bOe != null && this.bOf != null && this.bNM.bgK != null && this.bNM.bgK.CZ() && this.bNM.aIY.chF.Re();
    }

    private void KF() {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        if (this.bNZ != null) {
            this.bNZ.OK();
        }
        if (this.bNV >= 0) {
            GLAllocation.cD(this.bNV);
            this.bNV = -1;
        }
        if (this.bOC) {
            this.bNZ = new VertexBuffer(this.bNW);
            this.a(worldRenderer, -16.0f, true);
            worldRenderer.Lz();
            worldRenderer.aX();
            this.bNZ.a(worldRenderer.LA());
        } else {
            this.bNV = GLAllocation.cC(1);
            GL11.glNewList((int)this.bNV, (int)4864);
            this.a(worldRenderer, -16.0f, true);
            tessellator.pZ();
            GL11.glEndList();
        }
    }

    private void KG() {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        if (this.bNY != null) {
            this.bNY.OK();
        }
        if (this.bNU >= 0) {
            GLAllocation.cD(this.bNU);
            this.bNU = -1;
        }
        if (this.bOC) {
            this.bNY = new VertexBuffer(this.bNW);
            this.a(worldRenderer, 16.0f, false);
            worldRenderer.Lz();
            worldRenderer.aX();
            this.bNY.a(worldRenderer.LA());
        } else {
            this.bNU = GLAllocation.cC(1);
            GL11.glNewList((int)this.bNU, (int)4864);
            this.a(worldRenderer, 16.0f, false);
            tessellator.pZ();
            GL11.glEndList();
        }
    }

    private void a(WorldRenderer worldRenderer, float f2, boolean bl2) {
        int n2 = 64;
        int n3 = 6;
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        int n4 = (this.bOV / 64 + 1) * 64 + 64;
        for (int i2 = -n4; i2 <= n4; i2 += 64) {
            for (int i3 = -n4; i3 <= n4; i3 += 64) {
                float f3 = i2;
                float f4 = i2 + 64;
                if (bl2) {
                    f4 = i2;
                    f3 = i2 + 64;
                }
                worldRenderer.F(f3, f2, i3).Lx();
                worldRenderer.F(f4, f2, i3).Lx();
                worldRenderer.F(f4, f2, i3 + 64).Lx();
                worldRenderer.F(f3, f2, i3 + 64).Lx();
            }
        }
    }

    private void KH() {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        if (this.bNX != null) {
            this.bNX.OK();
        }
        if (this.bNT >= 0) {
            GLAllocation.cD(this.bNT);
            this.bNT = -1;
        }
        if (this.bOC) {
            this.bNX = new VertexBuffer(this.bNW);
            this.a(worldRenderer);
            worldRenderer.Lz();
            worldRenderer.aX();
            this.bNX.a(worldRenderer.LA());
        } else {
            this.bNT = GLAllocation.cC(1);
            GlStateManager.JV();
            GL11.glNewList((int)this.bNT, (int)4864);
            this.a(worldRenderer);
            tessellator.pZ();
            GL11.glEndList();
            GlStateManager.JW();
        }
    }

    private void a(WorldRenderer worldRenderer) {
        Random random = new Random(10842L);
        worldRenderer.a(7, DefaultVertexFormats.cbE);
        for (int i2 = 0; i2 < 1500; ++i2) {
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = random.nextFloat() * 2.0f - 1.0f;
            double d5 = 0.15f + random.nextFloat() * 0.1f;
            double d6 = d2 * d2 + d3 * d3 + d4 * d4;
            if (!(d6 < 1.0) || !(d6 > 0.01)) continue;
            d6 = 1.0 / Math.sqrt(d6);
            double d7 = (d2 *= d6) * 100.0;
            double d8 = (d3 *= d6) * 100.0;
            double d9 = (d4 *= d6) * 100.0;
            double d10 = Math.atan2(d2, d4);
            double d11 = Math.sin(d10);
            double d12 = Math.cos(d10);
            double d13 = Math.atan2(Math.sqrt(d2 * d2 + d4 * d4), d3);
            double d14 = Math.sin(d13);
            double d15 = Math.cos(d13);
            double d16 = random.nextDouble() * Math.PI * 2.0;
            double d17 = Math.sin(d16);
            double d18 = Math.cos(d16);
            for (int i3 = 0; i3 < 4; ++i3) {
                double d19 = 0.0;
                double d20 = (double)((i3 & 2) - 1) * d5;
                double d21 = (double)((i3 + 1 & 2) - 1) * d5;
                double d22 = 0.0;
                double d23 = d20 * d18 - d21 * d17;
                double d24 = d21 * d18 + d20 * d17;
                double d25 = d23 * d14 + 0.0 * d15;
                double d26 = 0.0 * d14 - d23 * d15;
                double d27 = d26 * d11 - d24 * d12;
                double d28 = d24 * d11 + d26 * d12;
                worldRenderer.F(d7 + d27, d8 + d25, d9 + d28).Lx();
            }
        }
    }

    public void b(j j2) {
        if (this.bgF != null) {
            this.bgF.b(this);
        }
        this.bOg = Double.MIN_VALUE;
        this.bOh = Double.MIN_VALUE;
        this.bOi = Double.MIN_VALUE;
        this.bOj = Integer.MIN_VALUE;
        this.bOk = Integer.MIN_VALUE;
        this.bOl = Integer.MIN_VALUE;
        this.bNO.e(j2);
        this.bgF = j2;
        if (net.minecraft.src.a.apa()) {
            net.optifine.ao.clear();
        }
        c.aX();
        this.bOZ = null;
        this.bPa = null;
        this.bPc.c(null, null);
        ah.u(this.bgF);
        if (j2 != null) {
            j2.a(this);
            this.KI();
        } else {
            this.bNP.clear();
            this.Lb();
            if (this.bNS != null) {
                this.bNS.Ls();
            }
            this.bNS = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void KI() {
        if (this.bgF != null) {
            this.bOH = true;
            Blocks.cLv.P(net.minecraft.src.a.ant());
            Blocks.cLw.P(net.minecraft.src.a.ant());
            BlockModelRenderer.IP();
            if (net.minecraft.src.a.apa()) {
                net.optifine.ao.clear();
            }
            bi.jA();
            this.bOt = this.bNM.aIY.bOt;
            this.bOV = this.bOt * 16;
            this.bOW = this.bOV * this.bOV;
            boolean bl2 = this.bOC;
            this.bOC = OpenGlHelper.Kv();
            if (bl2 && !this.bOC) {
                this.bOs = new RenderList();
                this.bOD = new ListChunkFactory();
            } else if (!bl2 && this.bOC) {
                this.bOs = new VboRenderList();
                this.bOD = new VboChunkFactory();
            }
            this.KH();
            this.KG();
            this.KF();
            if (this.bNS != null) {
                this.bNS.Ls();
            }
            this.KJ();
            Object object = this.bNR;
            synchronized (object) {
                this.bNR.clear();
            }
            this.bNS = new ViewFrustum(this.bgF, this.bNM.aIY.bOt, this, this.bOD);
            if (this.bgF != null && (object = this.bNM.BC()) != null) {
                this.bNS.q(((net.minecraft.entity.c)object).gW, ((net.minecraft.entity.c)object).gY);
            }
            this.bOu = 2;
        }
        if (this.bNM.bgK == null) {
            this.bPf = true;
        }
    }

    protected void KJ() {
        this.bNP.clear();
        this.bOr.KJ();
    }

    public void Z(int n2, int n3) {
        if (OpenGlHelper.bNi && this.bOf != null) {
            this.bOf.al(n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void a(net.minecraft.entity.c c2, ICamera iCamera, float f2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public String KK() {
        int n2 = this.bNS.bPN.length;
        int n3 = 0;
        for (RenderGlobal$ContainerLocalRenderInformation renderGlobal$ContainerLocalRenderInformation : this.bNQ) {
            CompiledChunk compiledChunk = renderGlobal$ContainerLocalRenderInformation.bPm.bSt;
            if (compiledChunk == CompiledChunk.bTe || compiledChunk.isEmpty()) continue;
            ++n3;
        }
        return String.format("C: %d/%d %sD: %d, %s", n3, n2, this.bNM.bhR ? "(s) " : "", this.bOt, this.bOr.MM());
    }

    public String KL() {
        return "E: " + this.bOw + "/" + this.bOv + ", B: " + this.bOx + ", I: " + (this.bOv - this.bOx - this.bOw) + ", " + net.minecraft.src.a.amM();
    }

    public void a(net.minecraft.entity.c c2, double d2, ICamera iCamera, int n2, boolean bl2) {
        Object object;
        Object object2;
        Set<RenderChunk> set;
        ICamera iCamera2 = iCamera;
        if (this.bNM.aIY.bOt != this.bOt) {
            this.KI();
        }
        this.bgF.dDt.eY("camera");
        double d3 = c2.gW - this.bOg;
        double d4 = c2.gX - this.bOh;
        double d5 = c2.gY - this.bOi;
        if (this.bOj != c2.csH || this.bOk != c2.csI || this.bOl != c2.csJ || d3 * d3 + d4 * d4 + d5 * d5 > 16.0) {
            this.bOg = c2.gW;
            this.bOh = c2.gX;
            this.bOi = c2.gY;
            this.bOj = c2.csH;
            this.bOk = c2.csI;
            this.bOl = c2.csJ;
            this.bNS.q(c2.gW, c2.gY);
        }
        if (net.minecraft.src.a.apa()) {
            net.optifine.ao.a(this);
        }
        this.bgF.dDt.fa("renderlistcamera");
        double d6 = c2.csh + (c2.gW - c2.csh) * d2;
        double d7 = c2.csi + (c2.gX - c2.csi) * d2;
        double d8 = c2.csj + (c2.gY - c2.csj) * d2;
        this.bOs.A(d6, d7, d8);
        this.bgF.dDt.fa("cull");
        au.ecP.rJ();
        this.bNM.bhw.fa("culling");
        net.minecraft.util.b b2 = new net.minecraft.util.b(d6, d7 + (double)c2.getEyeHeight(), d8);
        RenderChunk renderChunk = this.bNS.R(b2);
        new net.minecraft.util.b(bt.aF(d6 / 16.0) * 16, bt.aF(d7 / 16.0) * 16, bt.aF(d8 / 16.0) * 16);
        this.bOH = this.bOH || !this.bNP.isEmpty() || c2.gW != this.bOm || c2.gX != this.bOn || c2.gY != this.bOo || (double)c2.pm != this.bOp || (double)c2.pl != this.bOq;
        this.bOm = c2.gW;
        this.bOn = c2.gX;
        this.bOo = c2.gY;
        this.bOp = c2.pm;
        this.bOq = c2.pl;
        boolean bl3 = this.bOz != null;
        this.bNM.bhw.fa("update");
        this.bPh.aX();
        int n3 = this.KY();
        if (n3 != this.bPb) {
            this.bPb = n3;
            this.bOH = true;
        }
        int n4 = 256;
        if (!c.kM()) {
            this.bOH = true;
        }
        if (!bl3 && this.bOH && net.minecraft.src.a.Bf()) {
            n4 = c.a(this.bgF, c2, this.bOt);
        }
        RenderChunk renderChunk2 = this.bNS.R(new net.minecraft.util.b(c2.gW, c2.gX, c2.gY));
        if (ah.eye) {
            this.bNQ = this.bOS;
            this.bON = this.bOT;
            this.bOO = this.bOU;
            if (!bl3 && this.bOH) {
                this.Lb();
                if (renderChunk2 != null && renderChunk2.yl().wu() > n4) {
                    this.bON.add(renderChunk2.Ne());
                }
                set = al.a(this.bgF, d2, c2, this.bOt, this.bNS);
                while (set.hasNext()) {
                    RenderChunk renderChunk3 = (RenderChunk)set.next();
                    if (renderChunk3 == null || renderChunk3.yl().wu() > n4) continue;
                    RenderGlobal$ContainerLocalRenderInformation renderGlobal$ContainerLocalRenderInformation = renderChunk3.Ne();
                    if (!renderChunk3.bSt.isEmpty() || renderChunk3.Na()) {
                        this.bNQ.add(renderGlobal$ContainerLocalRenderInformation);
                    }
                    if (f.d(renderChunk3.Nc())) {
                        this.bON.add(renderGlobal$ContainerLocalRenderInformation);
                    }
                    if (renderChunk3.MF().MR().size() <= 0) continue;
                    this.bOO.add(renderGlobal$ContainerLocalRenderInformation);
                }
            }
        } else {
            this.bNQ = this.bOP;
            this.bON = this.bOQ;
            this.bOO = this.bOR;
        }
        if (!bl3 && this.bOH && !ah.eye) {
            Object object3;
            Object object4;
            int n5;
            this.bOH = false;
            this.Lb();
            this.bOM.clear();
            set = this.bOM;
            boolean bl4 = this.bNM.bhR;
            if (renderChunk != null && renderChunk.yl().wu() <= n4) {
                n5 = 0;
                object2 = new RenderGlobal$ContainerLocalRenderInformation(renderChunk, null, 0);
                object = bOX;
                if (object.size() == 1) {
                    object4 = this.b(c2, d2);
                    object3 = ao.H(((Vector3f)object4).x, ((Vector3f)object4).y, ((Vector3f)object4).z).asC();
                    object.remove(object3);
                }
                if (object.isEmpty()) {
                    n5 = 1;
                }
                if (n5 != 0 && !bl2) {
                    this.bNQ.add((RenderGlobal$ContainerLocalRenderInformation)object2);
                } else {
                    if (bl2 && this.bgF.L(b2).df().xk()) {
                        bl4 = false;
                    }
                    renderChunk.dt(n2);
                    set.add((RenderChunk)object2);
                }
            } else {
                int n6 = n5 = b2.wu() > 0 ? Math.min(n4, 248) : 8;
                if (renderChunk2 != null) {
                    this.bON.add(renderChunk2.Ne());
                }
                for (int i2 = -this.bOt; i2 <= this.bOt; ++i2) {
                    for (int i3 = -this.bOt; i3 <= this.bOt; ++i3) {
                        object4 = this.bNS.R(new net.minecraft.util.b((i2 << 4) + 8, n5, (i3 << 4) + 8));
                        if (object4 == null || !((RenderChunk)object4).a(iCamera2, n2)) continue;
                        ((RenderChunk)object4).dt(n2);
                        object3 = ((RenderChunk)object4).Ne();
                        ((RenderGlobal$ContainerLocalRenderInformation)object3).a(null, 0);
                        set.add((RenderChunk)object3);
                    }
                }
            }
            this.bNM.bhw.eY("iteration");
            n5 = net.minecraft.src.a.ank() ? 1 : 0;
            while (!set.isEmpty()) {
                object2 = (RenderGlobal$ContainerLocalRenderInformation)set.poll();
                object = ((RenderGlobal$ContainerLocalRenderInformation)object2).bPm;
                object4 = ((RenderGlobal$ContainerLocalRenderInformation)object2).aWT;
                object3 = ((RenderChunk)object).bSt;
                if (!((CompiledChunk)object3).isEmpty() || ((RenderChunk)object).Na()) {
                    this.bNQ.add((RenderGlobal$ContainerLocalRenderInformation)object2);
                }
                if (f.d(((RenderChunk)object).Nc())) {
                    this.bON.add(object2);
                }
                if (((CompiledChunk)object3).MR().size() > 0) {
                    this.bOO.add(object2);
                }
                boolean bl5 = bl4;
                int n7 = n4;
                for (ao ao2 : bl5 ? c.jB(((RenderGlobal$ContainerLocalRenderInformation)object2).bPn) : ao.dwD) {
                    RenderChunk renderChunk4;
                    if (bl5 && object4 != null && !((CompiledChunk)object3).b(((ao)object4).asC(), ao2) || (renderChunk4 = this.a(b2, (RenderChunk)object, ao2, n5 != 0, n7)) == null || !renderChunk4.dt(n2) || !renderChunk4.a(iCamera2, n2)) continue;
                    int n8 = ((RenderGlobal$ContainerLocalRenderInformation)object2).bPn | 1 << ao2.ordinal();
                    RenderGlobal$ContainerLocalRenderInformation renderGlobal$ContainerLocalRenderInformation = renderChunk4.Ne();
                    renderGlobal$ContainerLocalRenderInformation.a(ao2, n8);
                    set.add((RenderChunk)((Object)renderGlobal$ContainerLocalRenderInformation));
                }
            }
            this.bNM.bhw.ajv();
        }
        this.bNM.bhw.fa("captureFrustum");
        if (this.bOy) {
            this.D(d6, d7, d8);
            this.bOy = false;
        }
        au.ecP.vX();
        if (ah.eye) {
            ah.aGA();
        } else {
            this.bNM.bhw.fa("rebuildNear");
            this.bOr.MP();
            set = this.bNP;
            this.bNP = Sets.newLinkedHashSet();
            au.ecO.rJ();
            for (RenderGlobal$ContainerLocalRenderInformation renderGlobal$ContainerLocalRenderInformation : this.bNQ) {
                boolean bl6;
                object2 = renderGlobal$ContainerLocalRenderInformation.bPm;
                if (!((RenderChunk)object2).Na() && !set.contains(object2)) continue;
                this.bOH = true;
                object = ((RenderChunk)object2).yl();
                boolean bl7 = bl6 = b2.am(((db)object).wt() + 8, ((db)object).wu() + 8, ((db)object).wx() + 8) < 768.0;
                if (!bl6) {
                    this.bNP.add((RenderChunk)object2);
                    continue;
                }
                if (!((RenderChunk)object2).HU()) {
                    this.bOL.add(object2);
                    continue;
                }
                this.bNM.bhw.eY("build near");
                this.bOr.d((RenderChunk)object2);
                ((RenderChunk)object2).ap(false);
                this.bNM.bhw.ajv();
            }
            au.ecO.vX();
            this.bNP.addAll(set);
            this.bNM.bhw.ajv();
        }
    }

    private boolean a(net.minecraft.util.b b2, RenderChunk renderChunk) {
        net.minecraft.util.b b3 = renderChunk.yl();
        return bt.hN(b2.wt() - b3.wt()) <= 16 && bt.hN(b2.wu() - b3.wu()) <= 16 && bt.hN(b2.wx() - b3.wx()) <= 16;
    }

    private Set<ao> O(net.minecraft.util.b b2) {
        VisGraph visGraph = new VisGraph();
        net.minecraft.util.b b3 = new net.minecraft.util.b(b2.wt() >> 4 << 4, b2.wu() >> 4 << 4, b2.wx() >> 4 << 4);
        net.minecraft.world.chunk.a a2 = this.bgF.aK(b3);
        for (net.minecraft.util.g g2 : net.minecraft.util.b.c(b3, b3.C(15, 15, 15))) {
            if (!a2.bp(g2).xk()) continue;
            visGraph.W(g2);
        }
        return visGraph.Y(b2);
    }

    private RenderChunk a(net.minecraft.util.b b2, RenderChunk renderChunk, ao ao2, boolean bl2, int n2) {
        RenderChunk renderChunk2 = renderChunk.o(ao2);
        if (renderChunk2 == null) {
            return null;
        }
        if (renderChunk2.yl().wu() > n2) {
            return null;
        }
        if (bl2) {
            int n3;
            net.minecraft.util.b b3 = renderChunk2.yl();
            int n4 = b2.wt() - b3.wt();
            int n5 = n4 * n4 + (n3 = b2.wx() - b3.wx()) * n3;
            if (n5 > this.bOW) {
                return null;
            }
        }
        return renderChunk2;
    }

    private void D(double d2, double d3, double d4) {
        this.bOz = new ClippingHelperImpl();
        ((ClippingHelperImpl)this.bOz).init();
        bu bu2 = new bu(this.bOz.bTZ);
        bu2.transpose();
        bu bu3 = new bu(this.bOz.bTY);
        bu3.transpose();
        bu bu4 = new bu();
        bu.mul((Matrix4f)bu3, (Matrix4f)bu2, (Matrix4f)bu4);
        bu4.invert();
        this.bOB.dAO = d2;
        this.bOB.dAP = d3;
        this.bOB.dAQ = d4;
        this.bOA[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.bOA[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.bOA[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.bOA[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.bOA[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.bOA[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.bOA[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.bOA[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < 8; ++i2) {
            bu.transform((Matrix4f)bu4, (Vector4f)this.bOA[i2], (Vector4f)this.bOA[i2]);
            this.bOA[i2].x /= this.bOA[i2].w;
            this.bOA[i2].y /= this.bOA[i2].w;
            this.bOA[i2].z /= this.bOA[i2].w;
            this.bOA[i2].w = 1.0f;
        }
    }

    protected Vector3f b(net.minecraft.entity.c c2, double d2) {
        float f2 = (float)((double)c2.crO + (double)(c2.pm - c2.crO) * d2);
        float f3 = (float)((double)c2.crM + (double)(c2.pl - c2.crM) * d2);
        if (Minecraft.getMinecraft().aIY.chP == 2) {
            f2 += 180.0f;
        }
        float f4 = bt.bB(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = bt.bx(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -bt.bB(-f2 * ((float)Math.PI / 180));
        float f7 = bt.bx(-f2 * ((float)Math.PI / 180));
        return new Vector3f(f5 * f6, f7, f4 * f6);
    }

    public int a(av av2, double d2, int n2, net.minecraft.entity.c c2) {
        int n3;
        double d3;
        double d4;
        double d5;
        RenderHelper.Lf();
        if (av2 == av.dxY && !ah.eye && (d5 = c2.gW - this.bOE) * d5 + (d4 = c2.gX - this.bOF) * d4 + (d3 = c2.gY - this.bOG) * d3 > 1.0) {
            this.bOE = c2.gW;
            this.bOF = c2.gX;
            this.bOG = c2.gY;
            int n4 = 0;
            this.bOK.clear();
            for (RenderGlobal$ContainerLocalRenderInformation renderGlobal$ContainerLocalRenderInformation : this.bNQ) {
                if (!renderGlobal$ContainerLocalRenderInformation.bPm.bSt.h(av2) || n4++ >= 15) continue;
                this.bOK.add(renderGlobal$ContainerLocalRenderInformation.bPm);
            }
        }
        int n5 = 0;
        boolean bl2 = av2 == av.dxY;
        int n6 = bl2 ? this.bNQ.size() - 1 : 0;
        int n7 = bl2 ? -1 : this.bNQ.size();
        int n8 = bl2 ? -1 : 1;
        for (n3 = n6; n3 != n7; n3 += n8) {
            RenderChunk renderChunk = this.bNQ.get((int)n3).bPm;
            if (renderChunk.MF().f(av2)) continue;
            ++n5;
            this.bOs.a(renderChunk, av2);
        }
        if (n5 != 0) {
            if (net.minecraft.src.a.anj() && this.bNM.bgT.bJT) {
                GlStateManager.JG();
            }
            n3 = 0;
            try {
                float f2;
                Class<?> clazz = Class.forName("hackclient.rise.yd");
                if (((Boolean)clazz.getMethod("mB", new Class[0]).invoke(null, new Object[0])).booleanValue() && (f2 = ((Float)clazz.getMethod("getWorldOpacity", new Class[0]).invoke(null, new Object[0])).floatValue()) < 1.0f) {
                    GlStateManager.tQ();
                    GlStateManager.h(1, 771, 1, 771);
                    GlStateManager.e(f2, f2, f2, 1.0f);
                    n3 = 1;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.c(av2);
            if (n3 != 0) {
                GlStateManager.JX();
                GlStateManager.tR();
            }
        }
        return n5;
    }

    private void c(av av2) {
        this.bNM.bgT.Jk();
        if (OpenGlHelper.Kv()) {
            GL11.glEnableClientState((int)32884);
            OpenGlHelper.df(OpenGlHelper.bMI);
            GL11.glEnableClientState((int)32888);
            OpenGlHelper.df(OpenGlHelper.bMJ);
            GL11.glEnableClientState((int)32888);
            OpenGlHelper.df(OpenGlHelper.bMI);
            GL11.glEnableClientState((int)32886);
        }
        if (net.minecraft.src.a.aoG()) {
            aj.m(av2);
        }
        this.bOs.a(av2);
        if (net.minecraft.src.a.aoG()) {
            aj.n(av2);
        }
        if (OpenGlHelper.Kv()) {
            for (VertexFormatElement vertexFormatElement : DefaultVertexFormats.cbv.Mp()) {
                VertexFormatElement$EnumUsage vertexFormatElement$EnumUsage = vertexFormatElement.OW();
                int n2 = vertexFormatElement.OY();
                switch (vertexFormatElement$EnumUsage) {
                    case ccu: {
                        GL11.glDisableClientState((int)32884);
                        break;
                    }
                    case ccx: {
                        OpenGlHelper.df(OpenGlHelper.bMI + n2);
                        GL11.glDisableClientState((int)32888);
                        OpenGlHelper.df(OpenGlHelper.bMI);
                        break;
                    }
                    case ccw: {
                        GL11.glDisableClientState((int)32886);
                        GlStateManager.JX();
                    }
                }
            }
        }
        this.bNM.bgT.Jj();
    }

    private void a(Iterator<DestroyBlockProgress> iterator) {
        while (iterator.hasNext()) {
            DestroyBlockProgress destroyBlockProgress = iterator.next();
            int n2 = destroyBlockProgress.Jb();
            if (this.bOa - n2 <= 400) continue;
            iterator.remove();
        }
    }

    public void KM() {
        if (net.minecraft.src.a.aoG() && Keyboard.isKeyDown((int)61) && Keyboard.isKeyDown((int)19)) {
            ah.aFx();
            ah.aEZ();
        }
        ++this.bOa;
        if (this.bOa % 20 == 0) {
            this.a(this.bOb.values().iterator());
        }
    }

    private void KN() {
        if (net.minecraft.src.a.anV()) {
            GlStateManager.JG();
            GlStateManager.Jy();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            RenderHelper.Lf();
            GlStateManager.an(false);
            this.bNN.a(bNK);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            for (int i2 = 0; i2 < 6; ++i2) {
                GlStateManager.JV();
                if (i2 == 1) {
                    GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i2 == 2) {
                    GlStateManager.d(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i2 == 3) {
                    GlStateManager.d(180.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i2 == 4) {
                    GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
                }
                if (i2 == 5) {
                    GlStateManager.d(-90.0f, 0.0f, 0.0f, 1.0f);
                }
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                int n2 = 40;
                int n3 = 40;
                int n4 = 40;
                if (net.minecraft.src.a.aow()) {
                    da da2 = new da((double)n2 / 255.0, (double)n3 / 255.0, (double)n4 / 255.0);
                    da2 = s.b(da2, this.bgF, this.bNM.BC(), 0.0f);
                    n2 = (int)(da2.dAG * 255.0);
                    n3 = (int)(da2.dAH * 255.0);
                    n4 = (int)(da2.dAI * 255.0);
                }
                worldRenderer.F(-100.0, -100.0, -100.0).r(0.0, 0.0).s(n2, n3, n4, 255).Lx();
                worldRenderer.F(-100.0, -100.0, 100.0).r(0.0, 16.0).s(n2, n3, n4, 255).Lx();
                worldRenderer.F(100.0, -100.0, 100.0).r(16.0, 16.0).s(n2, n3, n4, 255).Lx();
                worldRenderer.F(100.0, -100.0, -100.0).r(16.0, 0.0).s(n2, n3, n4, 255).Lx();
                tessellator.pZ();
                GlStateManager.JW();
            }
            GlStateManager.an(true);
            GlStateManager.JN();
            GlStateManager.tL();
            GlStateManager.tR();
        }
    }

    public void d(float f2, int n2) {
        ac ac2;
        Object object;
        if (net.optifine.reflect.g.epP.aDA() && (object = net.optifine.reflect.g.g(ac2 = this.bNM.bgF.dDl, net.optifine.reflect.g.epP, new Object[0])) != null) {
            net.optifine.reflect.g.a(object, net.optifine.reflect.g.eqa, Float.valueOf(f2), this.bgF, this.bNM);
            return;
        }
        if (this.bNM.bgF.dDl.getDimensionId() == 1) {
            this.KN();
        } else if (this.bNM.bgF.dDl.avW()) {
            float f3;
            float f4;
            int n3;
            float f5;
            float f6;
            float f7;
            GlStateManager.JO();
            boolean bl2 = net.minecraft.src.a.aoG();
            if (bl2) {
                ah.JO();
            }
            object = this.bgF.i(this.bNM.BC(), f2);
            object = s.a((da)object, (l)this.bNM.bgF, this.bNM.BC().gW, this.bNM.BC().gX + 1.0, this.bNM.BC().gY);
            if (bl2) {
                ah.C((da)object);
            }
            float f8 = (float)((da)object).dAG;
            float f9 = (float)((da)object).dAH;
            float f10 = (float)((da)object).dAI;
            if (n2 != 2) {
                float f11 = (f8 * 30.0f + f9 * 59.0f + f10 * 11.0f) / 100.0f;
                float f12 = (f8 * 30.0f + f9 * 70.0f) / 100.0f;
                float f13 = (f8 * 30.0f + f10 * 70.0f) / 100.0f;
                f8 = f11;
                f9 = f12;
                f10 = f13;
            }
            GlStateManager.k(f8, f9, f10);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            GlStateManager.an(false);
            GlStateManager.JF();
            if (bl2) {
                ah.JF();
            }
            GlStateManager.k(f8, f9, f10);
            if (bl2) {
                ah.aFT();
            }
            if (net.minecraft.src.a.anV()) {
                if (this.bOC) {
                    this.bNY.OI();
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    this.bNY.dO(7);
                    this.bNY.OJ();
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManager.cU(this.bNU);
                }
            }
            GlStateManager.JG();
            if (bl2) {
                ah.JG();
            }
            GlStateManager.Jy();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            RenderHelper.Lf();
            float[] fArray = this.bgF.dDl.z(this.bgF.bT(f2), f2);
            if (fArray != null && net.minecraft.src.a.anW()) {
                float f14;
                GlStateManager.JO();
                if (bl2) {
                    ah.JO();
                }
                GlStateManager.cP(7425);
                GlStateManager.JV();
                GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(bt.bx(this.bgF.bU(f2)) < 0.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
                f7 = fArray[0];
                f6 = fArray[1];
                float f15 = fArray[2];
                if (n2 != 2) {
                    float f16 = (f7 * 30.0f + f6 * 59.0f + f15 * 11.0f) / 100.0f;
                    f14 = (f7 * 30.0f + f6 * 70.0f) / 100.0f;
                    f5 = (f7 * 30.0f + f15 * 70.0f) / 100.0f;
                    f7 = f16;
                    f6 = f14;
                    f15 = f5;
                }
                worldRenderer.a(6, DefaultVertexFormats.cbF);
                worldRenderer.F(0.0, 100.0, 0.0).g(f7, f6, f15, fArray[3]).Lx();
                for (n3 = 0; n3 <= 16; ++n3) {
                    f14 = (float)n3 * (float)Math.PI * 2.0f / 16.0f;
                    f5 = bt.bx(f14);
                    f4 = bt.bB(f14);
                    worldRenderer.F(f5 * 120.0f, f4 * 120.0f, -f4 * 40.0f * fArray[3]).g(fArray[0], fArray[1], fArray[2], 0.0f).Lx();
                }
                tessellator.pZ();
                GlStateManager.JW();
                GlStateManager.cP(7424);
            }
            GlStateManager.JN();
            if (bl2) {
                ah.JN();
            }
            GlStateManager.h(770, 1, 1, 0);
            GlStateManager.JV();
            f7 = 1.0f - this.bgF.ca(f2);
            GlStateManager.e(1.0f, 1.0f, 1.0f, f7);
            GlStateManager.d(-90.0f, 0.0f, 1.0f, 0.0f);
            net.optifine.al.a(this.bgF, this.bNN, f2);
            if (bl2) {
                ah.aFG();
            }
            GlStateManager.d(this.bgF.bT(f2) * 360.0f, 1.0f, 0.0f, 0.0f);
            if (bl2) {
                ah.aFH();
            }
            f6 = 30.0f;
            if (net.minecraft.src.a.anX()) {
                this.bNN.a(bNI);
                worldRenderer.a(7, DefaultVertexFormats.cbG);
                worldRenderer.F(-f6, 100.0, -f6).r(0.0, 0.0).Lx();
                worldRenderer.F(f6, 100.0, -f6).r(1.0, 0.0).Lx();
                worldRenderer.F(f6, 100.0, f6).r(1.0, 1.0).Lx();
                worldRenderer.F(-f6, 100.0, f6).r(0.0, 1.0).Lx();
                tessellator.pZ();
            }
            f6 = 20.0f;
            if (net.minecraft.src.a.anY()) {
                this.bNN.a(bNH);
                int n4 = this.bgF.avs();
                n3 = n4 % 4;
                int n5 = n4 / 4 % 2;
                f5 = (float)n3 / 4.0f;
                f4 = (float)n5 / 2.0f;
                float f17 = (float)(n3 + 1) / 4.0f;
                float f18 = (float)(n5 + 1) / 2.0f;
                worldRenderer.a(7, DefaultVertexFormats.cbG);
                worldRenderer.F(-f6, -100.0, f6).r(f17, f18).Lx();
                worldRenderer.F(f6, -100.0, f6).r(f5, f18).Lx();
                worldRenderer.F(f6, -100.0, -f6).r(f5, f4).Lx();
                worldRenderer.F(-f6, -100.0, -f6).r(f17, f4).Lx();
                tessellator.pZ();
            }
            GlStateManager.JO();
            if (bl2) {
                ah.JO();
            }
            if ((f3 = this.bgF.bX(f2) * f7) > 0.0f && net.minecraft.src.a.aoa() && !net.optifine.al.r(this.bgF)) {
                GlStateManager.e(f3, f3, f3, f3);
                if (this.bOC) {
                    this.bNX.OI();
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    this.bNX.dO(7);
                    this.bNX.OJ();
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManager.cU(this.bNT);
                }
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.tR();
            GlStateManager.tL();
            GlStateManager.JF();
            if (bl2) {
                ah.JF();
            }
            GlStateManager.JW();
            GlStateManager.JO();
            if (bl2) {
                ah.JO();
            }
            GlStateManager.k(0.0f, 0.0f, 0.0f);
            double d2 = this.bNM.bgK.aQ((float)f2).dAH - this.bgF.avN();
            if (d2 < 0.0) {
                GlStateManager.JV();
                GlStateManager.j(0.0f, 12.0f, 0.0f);
                if (this.bOC) {
                    this.bNZ.OI();
                    GL11.glEnableClientState((int)32884);
                    GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                    this.bNZ.dO(7);
                    this.bNZ.OJ();
                    GL11.glDisableClientState((int)32884);
                } else {
                    GlStateManager.cU(this.bNV);
                }
                GlStateManager.JW();
                f5 = -((float)(d2 + 65.0));
                worldRenderer.a(7, DefaultVertexFormats.cbF);
                worldRenderer.F(-1.0, f5, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, f5, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, f5, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, f5, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, f5, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, f5, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, f5, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, f5, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(-1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(1.0, -1.0, -1.0).s(0, 0, 0, 255).Lx();
                tessellator.pZ();
            }
            if (this.bgF.dDl.avZ()) {
                GlStateManager.k(f8 * 0.2f + 0.04f, f9 * 0.2f + 0.04f, f10 * 0.6f + 0.1f);
            } else {
                GlStateManager.k(f8, f9, f10);
            }
            if (this.bNM.aIY.bOt <= 4) {
                GlStateManager.k(this.bNM.bgT.bJC, this.bNM.bgT.bJD, this.bNM.bgT.bJE);
            }
            GlStateManager.JV();
            GlStateManager.j(0.0f, -((float)(d2 - 16.0)), 0.0f);
            if (net.minecraft.src.a.anV()) {
                if (this.bOC) {
                    this.bNZ.OI();
                    GlStateManager.cT(32884);
                    GlStateManager.j(3, 5126, 12, 0);
                    this.bNZ.dO(7);
                    this.bNZ.OJ();
                    GlStateManager.cS(32884);
                } else {
                    GlStateManager.cU(this.bNV);
                }
            }
            GlStateManager.JW();
            GlStateManager.JN();
            if (bl2) {
                ah.JN();
            }
            GlStateManager.an(true);
        }
    }

    public void e(float f2, int n2) {
        if (!net.minecraft.src.a.anr()) {
            ac ac2;
            Object object;
            if (net.optifine.reflect.g.epO.aDA() && (object = net.optifine.reflect.g.g(ac2 = this.bNM.bgF.dDl, net.optifine.reflect.g.epO, new Object[0])) != null) {
                net.optifine.reflect.g.a(object, net.optifine.reflect.g.eqa, Float.valueOf(f2), this.bgF, this.bNM);
                return;
            }
            if (this.bNM.bgF.dDl.avW()) {
                if (net.minecraft.src.a.aoG()) {
                    ah.aFX();
                }
                if (net.minecraft.src.a.anq()) {
                    this.f(f2, n2);
                } else {
                    GlStateManager.JI();
                    float f3 = (float)(this.bNM.BC().csi + (this.bNM.BC().gX - this.bNM.BC().csi) * (double)f2);
                    int n3 = 32;
                    int n4 = 8;
                    Tessellator tessellator = Tessellator.Li();
                    WorldRenderer worldRenderer = tessellator.Lj();
                    this.bNN.a(bNJ);
                    GlStateManager.tQ();
                    GlStateManager.h(770, 771, 1, 0);
                    da da2 = this.bgF.bV(f2);
                    float f4 = (float)da2.dAG;
                    float f5 = (float)da2.dAH;
                    float f6 = (float)da2.dAI;
                    this.bOI.a(false, this.bOa, f2, da2);
                    if (this.bOI.aDK()) {
                        float f7;
                        this.bOI.aDL();
                        if (n2 != 2) {
                            f7 = (f4 * 30.0f + f5 * 59.0f + f6 * 11.0f) / 100.0f;
                            float f8 = (f4 * 30.0f + f5 * 70.0f) / 100.0f;
                            float f9 = (f4 * 30.0f + f6 * 70.0f) / 100.0f;
                            f4 = f7;
                            f5 = f8;
                            f6 = f9;
                        }
                        f7 = 4.8828125E-4f;
                        double d2 = (float)this.bOa + f2;
                        double d3 = this.bNM.BC().crF + (this.bNM.BC().gW - this.bNM.BC().crF) * (double)f2 + d2 * (double)0.03f;
                        double d4 = this.bNM.BC().crH + (this.bNM.BC().gY - this.bNM.BC().crH) * (double)f2;
                        int n5 = bt.aF(d3 / 2048.0);
                        int n6 = bt.aF(d4 / 2048.0);
                        float f10 = this.bgF.dDl.avY() - f3 + 0.33f;
                        f10 += this.bNM.aIY.cip * 128.0f;
                        float f11 = (float)((d3 -= (double)(n5 * 2048)) * 4.8828125E-4);
                        float f12 = (float)((d4 -= (double)(n6 * 2048)) * 4.8828125E-4);
                        worldRenderer.a(7, DefaultVertexFormats.cbI);
                        for (int i2 = -256; i2 < 256; i2 += 32) {
                            for (int i3 = -256; i3 < 256; i3 += 32) {
                                worldRenderer.F(i2 + 0, f10, i3 + 32).r((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).g(f4, f5, f6, 0.8f).Lx();
                                worldRenderer.F(i2 + 32, f10, i3 + 32).r((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 32) * 4.8828125E-4f + f12).g(f4, f5, f6, 0.8f).Lx();
                                worldRenderer.F(i2 + 32, f10, i3 + 0).r((float)(i2 + 32) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).g(f4, f5, f6, 0.8f).Lx();
                                worldRenderer.F(i2 + 0, f10, i3 + 0).r((float)(i2 + 0) * 4.8828125E-4f + f11, (float)(i3 + 0) * 4.8828125E-4f + f12).g(f4, f5, f6, 0.8f).Lx();
                            }
                        }
                        tessellator.pZ();
                        this.bOI.aDM();
                    }
                    this.bOI.aDN();
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.tR();
                    GlStateManager.JH();
                }
                if (net.minecraft.src.a.aoG()) {
                    ah.aFY();
                }
            }
        }
    }

    public boolean a(double d2, double d3, double d4, float f2) {
        return false;
    }

    private void f(float f2, int n2) {
        int n3;
        float f3;
        float f4;
        float f5;
        GlStateManager.JI();
        float f6 = (float)(this.bNM.BC().csi + (this.bNM.BC().gX - this.bNM.BC().csi) * (double)f2);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        float f7 = 12.0f;
        float f8 = 4.0f;
        double d2 = (float)this.bOa + f2;
        double d3 = (this.bNM.BC().crF + (this.bNM.BC().gW - this.bNM.BC().crF) * (double)f2 + d2 * (double)0.03f) / 12.0;
        double d4 = (this.bNM.BC().crH + (this.bNM.BC().gY - this.bNM.BC().crH) * (double)f2) / 12.0 + (double)0.33f;
        float f9 = this.bgF.dDl.avY() - f6 + 0.33f;
        f9 += this.bNM.aIY.cip * 128.0f;
        int n4 = bt.aF(d3 / 2048.0);
        int n5 = bt.aF(d4 / 2048.0);
        d3 -= (double)(n4 * 2048);
        d4 -= (double)(n5 * 2048);
        this.bNN.a(bNJ);
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        da da2 = this.bgF.bV(f2);
        float f10 = (float)da2.dAG;
        float f11 = (float)da2.dAH;
        float f12 = (float)da2.dAI;
        this.bOI.a(true, this.bOa, f2, da2);
        if (n2 != 2) {
            f5 = (f10 * 30.0f + f11 * 59.0f + f12 * 11.0f) / 100.0f;
            f4 = (f10 * 30.0f + f11 * 70.0f) / 100.0f;
            f3 = (f10 * 30.0f + f12 * 70.0f) / 100.0f;
            f10 = f5;
            f11 = f4;
            f12 = f3;
        }
        f5 = f10 * 0.9f;
        f4 = f11 * 0.9f;
        f3 = f12 * 0.9f;
        float f13 = f10 * 0.7f;
        float f14 = f11 * 0.7f;
        float f15 = f12 * 0.7f;
        float f16 = f10 * 0.8f;
        float f17 = f11 * 0.8f;
        float f18 = f12 * 0.8f;
        float f19 = 0.00390625f;
        float f20 = (float)bt.aF(d3) * 0.00390625f;
        float f21 = (float)bt.aF(d4) * 0.00390625f;
        float f22 = (float)(d3 - (double)bt.aF(d3));
        float f23 = (float)(d4 - (double)bt.aF(d4));
        int n6 = 8;
        int n7 = 4;
        float f24 = 9.765625E-4f;
        GlStateManager.i(12.0f, 1.0f, 12.0f);
        for (n3 = 0; n3 < 2; ++n3) {
            if (n3 == 0) {
                GlStateManager.a(false, false, false, false);
            } else {
                switch (n2) {
                    case 0: {
                        GlStateManager.a(false, true, true, true);
                        break;
                    }
                    case 1: {
                        GlStateManager.a(true, false, false, true);
                        break;
                    }
                    case 2: {
                        GlStateManager.a(true, true, true, true);
                    }
                }
            }
            this.bOI.aDN();
        }
        if (this.bOI.aDK()) {
            this.bOI.aDL();
            for (n3 = -3; n3 <= 4; ++n3) {
                for (int i2 = -3; i2 <= 4; ++i2) {
                    int n8;
                    worldRenderer.a(7, DefaultVertexFormats.cbL);
                    float f25 = n3 * 8;
                    float f26 = i2 * 8;
                    float f27 = f25 - f22;
                    float f28 = f26 - f23;
                    if (f9 > -5.0f) {
                        worldRenderer.F(f27 + 0.0f, f9 + 0.0f, f28 + 8.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f13, f14, f15, 0.8f).n(0.0f, -1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 8.0f, f9 + 0.0f, f28 + 8.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f13, f14, f15, 0.8f).n(0.0f, -1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 8.0f, f9 + 0.0f, f28 + 0.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f13, f14, f15, 0.8f).n(0.0f, -1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 0.0f, f9 + 0.0f, f28 + 0.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f13, f14, f15, 0.8f).n(0.0f, -1.0f, 0.0f).Lx();
                    }
                    if (f9 <= 5.0f) {
                        worldRenderer.F(f27 + 0.0f, f9 + 4.0f - 9.765625E-4f, f28 + 8.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f10, f11, f12, 0.8f).n(0.0f, 1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 8.0f, f9 + 4.0f - 9.765625E-4f, f28 + 8.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f10, f11, f12, 0.8f).n(0.0f, 1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 8.0f, f9 + 4.0f - 9.765625E-4f, f28 + 0.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f10, f11, f12, 0.8f).n(0.0f, 1.0f, 0.0f).Lx();
                        worldRenderer.F(f27 + 0.0f, f9 + 4.0f - 9.765625E-4f, f28 + 0.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f10, f11, f12, 0.8f).n(0.0f, 1.0f, 0.0f).Lx();
                    }
                    if (n3 > -1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            worldRenderer.F(f27 + (float)n8 + 0.0f, f9 + 0.0f, f28 + 8.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(-1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 0.0f, f9 + 4.0f, f28 + 8.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(-1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 0.0f, f9 + 4.0f, f28 + 0.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(-1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 0.0f, f9 + 0.0f, f28 + 0.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(-1.0f, 0.0f, 0.0f).Lx();
                        }
                    }
                    if (n3 <= 1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            worldRenderer.F(f27 + (float)n8 + 1.0f - 9.765625E-4f, f9 + 0.0f, f28 + 8.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 1.0f - 9.765625E-4f, f9 + 4.0f, f28 + 8.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 8.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 1.0f - 9.765625E-4f, f9 + 4.0f, f28 + 0.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(1.0f, 0.0f, 0.0f).Lx();
                            worldRenderer.F(f27 + (float)n8 + 1.0f - 9.765625E-4f, f9 + 0.0f, f28 + 0.0f).r((f25 + (float)n8 + 0.5f) * 0.00390625f + f20, (f26 + 0.0f) * 0.00390625f + f21).g(f5, f4, f3, 0.8f).n(1.0f, 0.0f, 0.0f).Lx();
                        }
                    }
                    if (i2 > -1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            worldRenderer.F(f27 + 0.0f, f9 + 4.0f, f28 + (float)n8 + 0.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, -1.0f).Lx();
                            worldRenderer.F(f27 + 8.0f, f9 + 4.0f, f28 + (float)n8 + 0.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, -1.0f).Lx();
                            worldRenderer.F(f27 + 8.0f, f9 + 0.0f, f28 + (float)n8 + 0.0f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, -1.0f).Lx();
                            worldRenderer.F(f27 + 0.0f, f9 + 0.0f, f28 + (float)n8 + 0.0f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, -1.0f).Lx();
                        }
                    }
                    if (i2 <= 1) {
                        for (n8 = 0; n8 < 8; ++n8) {
                            worldRenderer.F(f27 + 0.0f, f9 + 4.0f, f28 + (float)n8 + 1.0f - 9.765625E-4f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, 1.0f).Lx();
                            worldRenderer.F(f27 + 8.0f, f9 + 4.0f, f28 + (float)n8 + 1.0f - 9.765625E-4f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, 1.0f).Lx();
                            worldRenderer.F(f27 + 8.0f, f9 + 0.0f, f28 + (float)n8 + 1.0f - 9.765625E-4f).r((f25 + 8.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, 1.0f).Lx();
                            worldRenderer.F(f27 + 0.0f, f9 + 0.0f, f28 + (float)n8 + 1.0f - 9.765625E-4f).r((f25 + 0.0f) * 0.00390625f + f20, (f26 + (float)n8 + 0.5f) * 0.00390625f + f21).g(f16, f17, f18, 0.8f).n(0.0f, 0.0f, 1.0f).Lx();
                        }
                    }
                    tessellator.pZ();
                }
            }
            this.bOI.aDM();
        }
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.tR();
        GlStateManager.JH();
    }

    public void s(long l2) {
        RenderChunk renderChunk;
        Iterator iterator;
        l2 = (long)((double)l2 + 1.0E8);
        this.bOH |= this.bOr.t(l2);
        if (this.bOL.size() > 0) {
            iterator = this.bOL.iterator();
            while (iterator.hasNext() && this.bOr.c(renderChunk = (RenderChunk)iterator.next())) {
                renderChunk.ap(false);
                iterator.remove();
                this.bNP.remove(renderChunk);
                this.bOK.remove(renderChunk);
            }
        }
        if (this.bOK.size() > 0 && (iterator = this.bOK.iterator()).hasNext() && this.bOr.e(renderChunk = (RenderChunk)iterator.next())) {
            iterator.remove();
        }
        double d2 = 0.0;
        int n2 = net.minecraft.src.a.anm();
        if (!this.bNP.isEmpty()) {
            RenderChunk renderChunk2;
            boolean bl2;
            boolean bl3;
            Iterator<RenderChunk> iterator2 = this.bNP.iterator();
            while (iterator2.hasNext() && (bl3 = (bl2 = (renderChunk2 = iterator2.next()).Nd()) ? this.bOr.d(renderChunk2) : this.bOr.c(renderChunk2))) {
                double d3;
                renderChunk2.ap(false);
                iterator2.remove();
                if (bl2 || !((d2 += (d3 = 2.0 * ag.g(renderChunk2))) > (double)n2)) continue;
                break;
            }
        }
    }

    public void d(net.minecraft.entity.c c2, float f2) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        net.minecraft.world.border.c c3 = this.bgF.Sv();
        double d2 = this.bNM.aIY.bOt * 16;
        if (c2.gW >= c3.axo() - d2 || c2.gW <= c3.axm() + d2 || c2.gY >= c3.axp() - d2 || c2.gY <= c3.axn() + d2) {
            float f3;
            double d3;
            double d4;
            float f4;
            double d5 = 1.0 - c3.aD(c2) / d2;
            d5 = Math.pow(d5, 4.0);
            double d6 = c2.csh + (c2.gW - c2.csh) * (double)f2;
            double d7 = c2.csi + (c2.gX - c2.csi) * (double)f2;
            double d8 = c2.csj + (c2.gY - c2.csj) * (double)f2;
            GlStateManager.tQ();
            GlStateManager.h(770, 1, 1, 0);
            this.bNN.a(bNL);
            GlStateManager.an(false);
            GlStateManager.JV();
            int n2 = c3.axl().awE();
            float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n2 & 0xFF) / 255.0f;
            GlStateManager.e(f5, f6, f7, (float)d5);
            GlStateManager.k(-3.0f, -3.0f);
            GlStateManager.JJ();
            GlStateManager.e(516, 0.1f);
            GlStateManager.tL();
            GlStateManager.JI();
            float f8 = (float)(Minecraft.Bj() % 3000L) / 3000.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 128.0f;
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            worldRenderer.G(-d6, -d7, -d8);
            double d9 = Math.max((double)bt.aF(d8 - d2), c3.axn());
            double d10 = Math.min((double)bt.aI(d8 + d2), c3.axp());
            if (d6 > c3.axo() - d2) {
                f4 = 0.0f;
                d4 = d9;
                while (d4 < d10) {
                    d3 = Math.min(1.0, d10 - d4);
                    f3 = (float)d3 * 0.5f;
                    worldRenderer.F(c3.axo(), 256.0, d4).r(f8 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(c3.axo(), 256.0, d4 + d3).r(f8 + f3 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(c3.axo(), 0.0, d4 + d3).r(f8 + f3 + f4, f8 + 128.0f).Lx();
                    worldRenderer.F(c3.axo(), 0.0, d4).r(f8 + f4, f8 + 128.0f).Lx();
                    d4 += 1.0;
                    f4 += 0.5f;
                }
            }
            if (d6 < c3.axm() + d2) {
                f4 = 0.0f;
                d4 = d9;
                while (d4 < d10) {
                    d3 = Math.min(1.0, d10 - d4);
                    f3 = (float)d3 * 0.5f;
                    worldRenderer.F(c3.axm(), 256.0, d4).r(f8 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(c3.axm(), 256.0, d4 + d3).r(f8 + f3 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(c3.axm(), 0.0, d4 + d3).r(f8 + f3 + f4, f8 + 128.0f).Lx();
                    worldRenderer.F(c3.axm(), 0.0, d4).r(f8 + f4, f8 + 128.0f).Lx();
                    d4 += 1.0;
                    f4 += 0.5f;
                }
            }
            d9 = Math.max((double)bt.aF(d6 - d2), c3.axm());
            d10 = Math.min((double)bt.aI(d6 + d2), c3.axo());
            if (d8 > c3.axp() - d2) {
                f4 = 0.0f;
                d4 = d9;
                while (d4 < d10) {
                    d3 = Math.min(1.0, d10 - d4);
                    f3 = (float)d3 * 0.5f;
                    worldRenderer.F(d4, 256.0, c3.axp()).r(f8 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(d4 + d3, 256.0, c3.axp()).r(f8 + f3 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(d4 + d3, 0.0, c3.axp()).r(f8 + f3 + f4, f8 + 128.0f).Lx();
                    worldRenderer.F(d4, 0.0, c3.axp()).r(f8 + f4, f8 + 128.0f).Lx();
                    d4 += 1.0;
                    f4 += 0.5f;
                }
            }
            if (d8 < c3.axn() + d2) {
                f4 = 0.0f;
                d4 = d9;
                while (d4 < d10) {
                    d3 = Math.min(1.0, d10 - d4);
                    f3 = (float)d3 * 0.5f;
                    worldRenderer.F(d4, 256.0, c3.axn()).r(f8 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(d4 + d3, 256.0, c3.axn()).r(f8 + f3 + f4, f8 + 0.0f).Lx();
                    worldRenderer.F(d4 + d3, 0.0, c3.axn()).r(f8 + f3 + f4, f8 + 128.0f).Lx();
                    worldRenderer.F(d4, 0.0, c3.axn()).r(f8 + f4, f8 + 128.0f).Lx();
                    d4 += 1.0;
                    f4 += 0.5f;
                }
            }
            tessellator.pZ();
            worldRenderer.G(0.0, 0.0, 0.0);
            GlStateManager.JH();
            GlStateManager.Jy();
            GlStateManager.k(0.0f, 0.0f);
            GlStateManager.JK();
            GlStateManager.tL();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.tR();
            GlStateManager.JW();
            GlStateManager.an(true);
        }
    }

    private void KO() {
        GlStateManager.h(774, 768, 1, 0);
        GlStateManager.tQ();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 0.5f);
        GlStateManager.k(-1.0f, -10.0f);
        GlStateManager.JJ();
        GlStateManager.e(516, 0.1f);
        GlStateManager.tL();
        GlStateManager.JV();
        if (net.minecraft.src.a.aoG()) {
            aj.aHa();
        }
    }

    private void KP() {
        GlStateManager.Jy();
        GlStateManager.k(0.0f, 0.0f);
        GlStateManager.JK();
        GlStateManager.tL();
        GlStateManager.an(true);
        GlStateManager.JW();
        if (net.minecraft.src.a.aoG()) {
            aj.aHb();
        }
    }

    public void a(Tessellator tessellator, WorldRenderer worldRenderer, net.minecraft.entity.c c2, float f2) {
        double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
        double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
        double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
        if (!this.bOb.isEmpty()) {
            this.bNN.a(TextureMap.bZE);
            this.KO();
            worldRenderer.a(7, DefaultVertexFormats.cbv);
            worldRenderer.G(-d2, -d3, -d4);
            worldRenderer.Lw();
            Iterator<DestroyBlockProgress> iterator = this.bOb.values().iterator();
            while (iterator.hasNext()) {
                boolean bl2;
                DestroyBlockProgress destroyBlockProgress = iterator.next();
                net.minecraft.util.b b2 = destroyBlockProgress.yl();
                double d5 = (double)b2.wt() - d2;
                double d6 = (double)b2.wu() - d3;
                double d7 = (double)b2.wx() - d4;
                Block block = this.bgF.L(b2).df();
                if (net.optifine.reflect.g.epD.aDA()) {
                    net.minecraft.tileentity.d d8;
                    boolean bl3;
                    boolean bl4 = bl3 = block instanceof BlockChest || block instanceof BlockEnderChest || block instanceof BlockSign || block instanceof BlockSkull;
                    if (!bl3 && (d8 = this.bgF.K(b2)) != null) {
                        bl3 = net.optifine.reflect.g.b((Object)d8, net.optifine.reflect.g.epD, new Object[0]);
                    }
                    bl2 = !bl3;
                } else {
                    boolean bl5 = bl2 = !(block instanceof BlockChest) && !(block instanceof BlockEnderChest) && !(block instanceof BlockSign) && !(block instanceof BlockSkull);
                }
                if (!bl2) continue;
                if (d5 * d5 + d6 * d6 + d7 * d7 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                IBlockState iBlockState = this.bgF.L(b2);
                if (iBlockState.df().xb() == Material.beo) continue;
                int n2 = destroyBlockProgress.Ja();
                TextureAtlasSprite textureAtlasSprite = this.bOd[n2];
                BlockRendererDispatcher blockRendererDispatcher = this.bNM.BE();
                blockRendererDispatcher.a(iBlockState, b2, textureAtlasSprite, this.bgF);
            }
            tessellator.pZ();
            worldRenderer.G(0.0, 0.0, 0.0);
            this.KP();
        }
    }

    public void a(net.minecraft.entity.player.a a2, ce ce2, int n2, float f2) {
        if (n2 == 0 && ce2.dzu == cf.dzy) {
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.e(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth((float)2.0f);
            GlStateManager.JO();
            if (net.minecraft.src.a.aoG()) {
                ah.JO();
            }
            GlStateManager.an(false);
            float f3 = 0.002f;
            net.minecraft.util.b b2 = ce2.dg();
            Block block = this.bgF.L(b2).df();
            if (block.xb() != Material.beo && this.bgF.Sv().bm(b2)) {
                block.c((l)this.bgF, b2);
                double d2 = a2.csh + (a2.gW - a2.csh) * (double)f2;
                double d3 = a2.csi + (a2.gX - a2.csi) * (double)f2;
                double d4 = a2.csj + (a2.gY - a2.csj) * (double)f2;
                net.minecraft.util.a a3 = block.c(this.bgF, b2);
                Block$EnumOffsetType block$EnumOffsetType = block.xN();
                if (block$EnumOffsetType != Block$EnumOffsetType.aSJ) {
                    a3 = b.a(a3, block$EnumOffsetType, b2);
                }
                RenderGlobal.j(a3.ad(0.002f, 0.002f, 0.002f).ae(-d2, -d3, -d4));
            }
            GlStateManager.an(true);
            GlStateManager.JN();
            if (net.minecraft.src.a.aoG()) {
                ah.JN();
            }
            GlStateManager.tR();
        }
    }

    public static void j(net.minecraft.util.a a2) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(3, DefaultVertexFormats.cbE);
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).Lx();
        tessellator.pZ();
        worldRenderer.a(3, DefaultVertexFormats.cbE);
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).Lx();
        tessellator.pZ();
        worldRenderer.a(1, DefaultVertexFormats.cbE);
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).Lx();
        tessellator.pZ();
    }

    public static void a(net.minecraft.util.a a2, int n2, int n3, int n4, int n5) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(3, DefaultVertexFormats.cbF);
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).s(n2, n3, n4, n5).Lx();
        tessellator.pZ();
        worldRenderer.a(3, DefaultVertexFormats.cbF);
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).s(n2, n3, n4, n5).Lx();
        tessellator.pZ();
        worldRenderer.a(1, DefaultVertexFormats.cbF);
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtJ).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtI, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtK, a2.dtL, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtI, a2.dtM).s(n2, n3, n4, n5).Lx();
        worldRenderer.F(a2.dtH, a2.dtL, a2.dtM).s(n2, n3, n4, n5).Lx();
        tessellator.pZ();
    }

    private void e(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bNS.e(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void P(net.minecraft.util.b b2) {
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        this.e(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1);
    }

    @Override
    public void Q(net.minecraft.util.b b2) {
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        this.e(n2 - 1, n3 - 1, n4 - 1, n2 + 1, n3 + 1, n4 + 1);
    }

    @Override
    public void f(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.e(n2 - 1, n3 - 1, n4 - 1, n5 + 1, n6 + 1, n7 + 1);
    }

    @Override
    public void a(String string, net.minecraft.util.b b2) {
        ISound iSound = this.bOc.get(b2);
        if (iSound != null) {
            this.bNM.Bx().b(iSound);
            this.bOc.remove(b2);
        }
        if (string != null) {
            bz bz2 = bz.ex(string);
            if (bz2 != null) {
                this.bNM.bha.cL(bz2.aea());
            }
            PositionedSoundRecord positionedSoundRecord = PositionedSoundRecord.a(new cm(string), b2.wt(), b2.wu(), b2.wx());
            this.bOc.put(b2, positionedSoundRecord);
            this.bNM.Bx().a(positionedSoundRecord);
        }
    }

    @Override
    public void a(String string, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(net.minecraft.entity.player.a a2, String string, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        try {
            this.b(n2, bl2, d2, d3, d4, d5, d6, d7, nArray);
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Exception while adding particle");
            i i2 = a2.dY("Particle being added");
            i2.b("ID", n2);
            if (nArray != null) {
                i2.b("Parameters", nArray);
            }
            i2.a("Position", new RenderGlobal$1(this, d2, d3, d4));
        }
    }

    private void a(as as2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        this.a(as2.asY(), as2.ata(), d2, d3, d4, d5, d6, d7, nArray);
    }

    private ae b(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        if (this.bNM != null && this.bNM.BC() != null && this.bNM.bgN != null) {
            int n3 = this.bNM.aIY.chZ;
            if (n3 == 1 && this.bgF.dDk.nextInt(3) == 0) {
                n3 = 2;
            }
            double d8 = this.bNM.BC().gW - d2;
            double d9 = this.bNM.BC().gX - d3;
            double d10 = this.bNM.BC().gY - d4;
            if (n2 == as.dwY.asY() && !net.minecraft.src.a.anE()) {
                return null;
            }
            if (n2 == as.dwX.asY() && !net.minecraft.src.a.anE()) {
                return null;
            }
            if (n2 == as.dwW.asY() && !net.minecraft.src.a.anE()) {
                return null;
            }
            if (n2 == as.dxd.asY() && !net.minecraft.src.a.anI()) {
                return null;
            }
            if (n2 == as.dxe.asY() && !net.minecraft.src.a.anH()) {
                return null;
            }
            if (n2 == as.dxh.asY() && !net.minecraft.src.a.anG()) {
                return null;
            }
            if (n2 == as.dxi.asY() && !net.minecraft.src.a.anG()) {
                return null;
            }
            if (n2 == as.dxl.asY() && !net.minecraft.src.a.anL()) {
                return null;
            }
            if (n2 == as.dxm.asY() && !net.minecraft.src.a.anL()) {
                return null;
            }
            if (n2 == as.dxj.asY() && !net.minecraft.src.a.anL()) {
                return null;
            }
            if (n2 == as.dxk.asY() && !net.minecraft.src.a.anL()) {
                return null;
            }
            if (n2 == as.dxn.asY() && !net.minecraft.src.a.anL()) {
                return null;
            }
            if (n2 == as.dxu.asY() && !net.minecraft.src.a.anK()) {
                return null;
            }
            if (n2 == as.dxw.asY() && !net.minecraft.src.a.anF()) {
                return null;
            }
            if (n2 == as.dxA.asY() && !net.minecraft.src.a.anD()) {
                return null;
            }
            if (n2 == as.dxo.asY() && !net.minecraft.src.a.aok()) {
                return null;
            }
            if (n2 == as.dxp.asY() && !net.minecraft.src.a.aok()) {
                return null;
            }
            if (n2 == as.dwZ.asY() && !net.minecraft.src.a.anM()) {
                return null;
            }
            if (!bl2) {
                double d11 = 1024.0;
                if (n2 == as.dxf.asY()) {
                    d11 = 38416.0;
                }
                if (d8 * d8 + d9 * d9 + d10 * d10 > d11) {
                    return null;
                }
                if (n3 > 1) {
                    return null;
                }
            }
            ae ae2 = this.bNM.bgN.a(n2, d2, d3, d4, d5, d6, d7, nArray);
            if (n2 == as.dxa.asY()) {
                s.a(ae2, this.bgF, d2, d3, d4, this.bPc);
            }
            if (n2 == as.dxb.asY()) {
                s.a(ae2, this.bgF, d2, d3, d4, this.bPc);
            }
            if (n2 == as.dxJ.asY()) {
                s.a(ae2, this.bgF, d2, d3, d4, this.bPc);
            }
            if (n2 == as.dxs.asY()) {
                s.f(ae2);
            }
            if (n2 == as.dxu.asY()) {
                s.e(ae2);
            }
            if (n2 == as.dxA.asY()) {
                s.a(ae2, (l)this.bgF, d2, d3, d4);
            }
            return ae2;
        }
        return null;
    }

    @Override
    public void I(net.minecraft.entity.c c2) {
        bd.a(c2, (w)this.bgF);
        if (net.minecraft.src.a.apa()) {
            net.optifine.ao.a(c2, this);
        }
    }

    @Override
    public void J(net.minecraft.entity.c c2) {
        bd.b(c2, this.bgF);
        if (net.minecraft.src.a.apa()) {
            net.optifine.ao.b(c2, this);
        }
    }

    public void KQ() {
    }

    @Override
    public void a(int n2, net.minecraft.util.b b2, int n3) {
        switch (n2) {
            case 1013: 
            case 1018: {
                if (this.bNM.BC() == null) break;
                double d2 = (double)b2.wt() - this.bNM.BC().gW;
                double d3 = (double)b2.wu() - this.bNM.BC().gX;
                double d4 = (double)b2.wx() - this.bNM.BC().gY;
                double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = this.bNM.BC().gW;
                double d7 = this.bNM.BC().gX;
                double d8 = this.bNM.BC().gY;
                if (d5 > 0.0) {
                    d6 += d2 / d5 * 2.0;
                    d7 += d3 / d5 * 2.0;
                    d8 += d4 / d5 * 2.0;
                }
                if (n2 == 1013) {
                    this.bgF.a(d6, d7, d8, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                this.bgF.a(d6, d7, d8, "mob.enderdragon.end", 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(net.minecraft.entity.player.a a2, int n2, net.minecraft.util.b b2, int n3) {
        Random random = this.bgF.dDk;
        switch (n2) {
            case 1000: {
                this.bgF.a(b2, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.bgF.a(b2, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.bgF.a(b2, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                this.bgF.a(b2, "random.door_open", 1.0f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.bgF.a(b2, "random.fizz", 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1005: {
                if (net.minecraft.item.d.fT(n3) instanceof bz) {
                    this.bgF.a(b2, "records." + ((bz)net.minecraft.item.d.fT((int)n3)).cWO);
                    break;
                }
                this.bgF.a(b2, (String)null);
                break;
            }
            case 1006: {
                this.bgF.a(b2, "random.door_close", 1.0f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.bgF.a(b2, "mob.ghast.charge", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.bgF.a(b2, "mob.ghast.fireball", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.bgF.a(b2, "mob.ghast.fireball", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.bgF.a(b2, "mob.zombie.wood", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.bgF.a(b2, "mob.zombie.metal", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.bgF.a(b2, "mob.zombie.woodbreak", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.bgF.a(b2, "mob.wither.shoot", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.bgF.a(b2, "mob.bat.takeoff", 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.bgF.a(b2, "mob.zombie.infect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.bgF.a(b2, "mob.zombie.unfect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.bgF.a(b2, "random.anvil_break", 1.0f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.bgF.a(b2, "random.anvil_use", 1.0f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.bgF.a(b2, "random.anvil_land", 0.3f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int n4 = n3 % 3 - 1;
                int n5 = n3 / 3 % 3 - 1;
                double d2 = (double)b2.wt() + (double)n4 * 0.6 + 0.5;
                double d3 = (double)b2.wu() + 0.5;
                double d4 = (double)b2.wx() + (double)n5 * 0.6 + 0.5;
                for (int i2 = 0; i2 < 10; ++i2) {
                    double d5 = random.nextDouble() * 0.2 + 0.01;
                    double d6 = d2 + (double)n4 * 0.01 + (random.nextDouble() - 0.5) * (double)n5 * 0.5;
                    double d7 = d3 + (random.nextDouble() - 0.5) * 0.5;
                    double d8 = d4 + (double)n5 * 0.01 + (random.nextDouble() - 0.5) * (double)n4 * 0.5;
                    double d9 = (double)n4 * d5 + random.nextGaussian() * 0.01;
                    double d10 = -0.03 + random.nextGaussian() * 0.01;
                    double d11 = (double)n5 * d5 + random.nextGaussian() * 0.01;
                    this.a(as.dxh, d6, d7, d8, d9, d10, d11, new int[0]);
                }
                return;
            }
            case 2001: {
                Block block = Block.aK(n3 & 0xFFF);
                if (block.xb() != Material.beo) {
                    this.bNM.Bx().a(new PositionedSoundRecord(new cm(block.aSB.xP()), (block.aSB.getVolume() + 1.0f) / 2.0f, block.aSB.xT() * 0.8f, (float)b2.wt() + 0.5f, (float)b2.wu() + 0.5f, (float)b2.wx() + 0.5f));
                }
                this.bNM.bgN.b(b2, block.aM(n3 >> 12 & 0xFF));
                break;
            }
            case 2002: {
                int n6;
                double d12 = b2.wt();
                double d13 = b2.wu();
                double d14 = b2.wx();
                for (n6 = 0; n6 < 8; ++n6) {
                    this.a(as.dxG, d12, d13, d14, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, net.minecraft.item.d.p(Items.cRD), n3);
                }
                n6 = Items.cRD.gc(n3);
                float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n6 & 0xFF) / 255.0f;
                as as2 = as.dxj;
                if (Items.cRD.gd(n3)) {
                    as2 = as.dxk;
                }
                for (int i3 = 0; i3 < 100; ++i3) {
                    double d15 = random.nextDouble() * 4.0;
                    double d16 = random.nextDouble() * Math.PI * 2.0;
                    double d17 = Math.cos(d16) * d15;
                    double d18 = 0.01 + random.nextDouble() * 0.5;
                    double d19 = Math.sin(d16) * d15;
                    ae ae2 = this.b(as2.asY(), as2.ata(), d12 + d17 * 0.1, d13 + 0.3, d14 + d19 * 0.1, d17, d18, d19, new int[0]);
                    if (ae2 == null) continue;
                    float f5 = 0.75f + random.nextFloat() * 0.25f;
                    ae2.h(f2 * f5, f3 * f5, f4 * f5);
                    ae2.ah((float)d15);
                }
                this.bgF.a(b2, "game.potion.smash", 1.0f, this.bgF.dDk.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                double d20 = (double)b2.wt() + 0.5;
                double d21 = b2.wu();
                double d22 = (double)b2.wx() + 0.5;
                for (int i4 = 0; i4 < 8; ++i4) {
                    this.a(as.dxG, d20, d21, d22, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15, net.minecraft.item.d.p(Items.cRL));
                }
                for (double d23 = 0.0; d23 < Math.PI * 2; d23 += 0.15707963267948966) {
                    this.a(as.dxu, d20 + Math.cos(d23) * 5.0, d21 - 0.4, d22 + Math.sin(d23) * 5.0, Math.cos(d23) * -5.0, 0.0, Math.sin(d23) * -5.0, new int[0]);
                    this.a(as.dxu, d20 + Math.cos(d23) * 5.0, d21 - 0.4, d22 + Math.sin(d23) * 5.0, Math.cos(d23) * -7.0, 0.0, Math.sin(d23) * -7.0, new int[0]);
                }
                return;
            }
            case 2004: {
                for (int i5 = 0; i5 < 20; ++i5) {
                    double d24 = (double)b2.wt() + 0.5 + ((double)this.bgF.dDk.nextFloat() - 0.5) * 2.0;
                    double d25 = (double)b2.wu() + 0.5 + ((double)this.bgF.dDk.nextFloat() - 0.5) * 2.0;
                    double d26 = (double)b2.wx() + 0.5 + ((double)this.bgF.dDk.nextFloat() - 0.5) * 2.0;
                    this.bgF.a(as.dxh, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                    this.bgF.a(as.dxw, d24, d25, d26, 0.0, 0.0, 0.0, new int[0]);
                }
                return;
            }
            case 2005: {
                ar.e(this.bgF, b2, n3);
            }
        }
    }

    @Override
    public void b(int n2, net.minecraft.util.b b2, int n3) {
        if (n3 >= 0 && n3 < 10) {
            Object object;
            if (this.bNM.bhc != null && this.bNM.bhc.dzu.equals((Object)cf.dzy) && this.bNM.bhc.dg().equals(b2)) {
                object = new eu(this.bNM.bgK, this.bNM.bgK.baU, b2);
                Client.a.e().d((di)object);
            }
            if ((object = this.bOb.get(n2)) == null || ((DestroyBlockProgress)object).yl().wt() != b2.wt() || ((DestroyBlockProgress)object).yl().wu() != b2.wu() || ((DestroyBlockProgress)object).yl().wx() != b2.wx()) {
                object = new DestroyBlockProgress(n2, b2);
                this.bOb.put(n2, (DestroyBlockProgress)object);
            }
            ((DestroyBlockProgress)object).cy(n3);
            ((DestroyBlockProgress)object).cz(this.bOa);
        } else {
            this.bOb.remove(n2);
        }
    }

    @Override
    public void c(int n2, net.minecraft.util.b b2, int n3) {
        if (n3 >= 0 && n3 < 10) {
            DestroyBlockProgress destroyBlockProgress = this.bOb.get(n2);
            if (destroyBlockProgress == null || destroyBlockProgress.yl().wt() != b2.wt() || destroyBlockProgress.yl().wu() != b2.wu() || destroyBlockProgress.yl().wx() != b2.wx()) {
                destroyBlockProgress = new DestroyBlockProgress(n2, b2);
                this.bOb.put(n2, destroyBlockProgress);
            }
            destroyBlockProgress.cy(n3);
            destroyBlockProgress.cz(this.bOa);
        } else {
            this.bOb.remove(n2);
        }
    }

    public void KR() {
        this.bOH = true;
    }

    public boolean KS() {
        return this.bNP.isEmpty() && this.bOr.MQ();
    }

    public void KT() {
        this.bOI.aX();
    }

    public int KU() {
        return this.bNS.bPN.length;
    }

    public int KV() {
        return this.bNQ.size();
    }

    public int KW() {
        return this.bOw;
    }

    public int KX() {
        return this.bOY;
    }

    public int KY() {
        if (this.bgF == null) {
            return 0;
        }
        h h2 = this.bgF.avF();
        if (h2 == null) {
            return 0;
        }
        if (h2 != this.bOZ) {
            this.bOZ = h2;
            this.bPa = (bq)net.optifine.reflect.g.a(h2, net.optifine.reflect.g.eqV);
        }
        return this.bPa == null ? 0 : this.bPa.atn();
    }

    public int KZ() {
        return this.bNP.size();
    }

    public RenderChunk R(net.minecraft.util.b b2) {
        return this.bNS.R(b2);
    }

    public j La() {
        return this.bgF;
    }

    private void Lb() {
        if (bPg > 0) {
            this.bNQ = new ArrayList<RenderGlobal$ContainerLocalRenderInformation>(this.bNQ.size() + 16);
            this.bON = new ArrayList(this.bON.size() + 16);
            this.bOO = new ArrayList(this.bOO.size() + 16);
        } else {
            this.bNQ.clear();
            this.bON.clear();
            this.bOO.clear();
        }
    }

    public void Lc() {
        if (this.bPf) {
            this.KI();
            this.bPf = false;
        }
    }

    public void Ld() {
        if (this.bOr != null) {
            this.bOr.Ld();
        }
    }

    public void Le() {
        if (this.bOr != null) {
            this.bOr.Le();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Collection<net.minecraft.tileentity.d> collection, Collection<net.minecraft.tileentity.d> collection2) {
        Set<net.minecraft.tileentity.d> set = this.bNR;
        synchronized (set) {
            this.bNR.removeAll(collection);
            this.bNR.addAll(collection2);
        }
    }
}

