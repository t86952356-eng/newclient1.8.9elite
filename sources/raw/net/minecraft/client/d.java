/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.Validate
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.OpenGLException
 *  org.lwjgl.opengl.PixelFormat
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.ViaMCP;
import de.florianmichael.viamcp.fixes.AttackOrder;
import hackclient.rise.adq;
import hackclient.rise.adu;
import hackclient.rise.afl;
import hackclient.rise.agg;
import hackclient.rise.ahd;
import hackclient.rise.ait;
import hackclient.rise.bu;
import hackclient.rise.dh;
import hackclient.rise.di;
import hackclient.rise.dr;
import hackclient.rise.dw;
import hackclient.rise.dx;
import hackclient.rise.ea;
import hackclient.rise.eq;
import hackclient.rise.ew;
import hackclient.rise.fe;
import hackclient.rise.fl;
import hackclient.rise.xc;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.MusicTicker;
import net.minecraft.client.audio.MusicTicker$MusicType;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.b;
import net.minecraft.client.e;
import net.minecraft.client.entity.c;
import net.minecraft.client.gui.aa;
import net.minecraft.client.gui.an;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.ci;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.gui.x;
import net.minecraft.client.gui.z;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.network.f;
import net.minecraft.client.network.h;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.FoliageColorReloadListener;
import net.minecraft.client.resources.GrassColorReloadListener;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.resources.ResourceIndex;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository$Entry;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.AnimationMetadataSectionSerializer;
import net.minecraft.client.resources.data.FontMetadataSection;
import net.minecraft.client.resources.data.FontMetadataSectionSerializer;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.client.resources.data.LanguageMetadataSectionSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.client.resources.data.PackMetadataSectionSerializer;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.client.resources.data.TextureMetadataSectionSerializer;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.shader.a;
import net.minecraft.crash.i;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.t;
import net.minecraft.entity.m;
import net.minecraft.entity.player.g;
import net.minecraft.entity.r;
import net.minecraft.init.Bootstrap;
import net.minecraft.init.Items;
import net.minecraft.item.af;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.ax;
import net.minecraft.util.bh;
import net.minecraft.util.bt;
import net.minecraft.util.bz;
import net.minecraft.util.cb;
import net.minecraft.util.cd;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.minecraft.util.co;
import net.minecraft.util.cp;
import net.minecraft.util.cv;
import net.minecraft.util.cy;
import net.minecraft.world.ad;
import net.minecraft.world.ae;
import net.minecraft.world.storage.o;
import net.optifine.au;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class d
implements ahd,
net.minecraft.profiler.a,
bh {
    private static final Logger bgj = LogManager.getLogger();
    private static final cm bgk = new cm("textures/gui/title/mojang.png");
    public static final boolean bgl = cy.atP() == net.minecraft.util.cz.dAD;
    public boolean bgm = false;
    public static byte[] bgn = new byte[0xA00000];
    private static final List<DisplayMode> bgo = Lists.newArrayList((Object[])new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
    private final File bgp;
    private final PropertyMap bgq;
    private final PropertyMap bgr;
    private net.minecraft.client.multiplayer.f bgs;
    public TextureManager aIK;
    private static d bgt;
    public net.minecraft.client.multiplayer.d bgu;
    private boolean bgv;
    private boolean bgw = false;
    private boolean bgx;
    private net.minecraft.crash.a bgy;
    public int bgz;
    public int bgA;
    private boolean bgB = false;
    public cv bgC = new cv(20.0f);
    public List<Runnable> bgD = new ArrayList<Runnable>();
    private final net.minecraft.profiler.b bgE = new net.minecraft.profiler.b("client", this, MinecraftServer.alN());
    public j bgF;
    public RenderGlobal bgG;
    private RenderManager bgH;
    private RenderItem bgI;
    private ItemRenderer bgJ;
    public c bgK;
    public net.minecraft.entity.c bgL;
    public net.minecraft.entity.c bgM;
    public net.minecraft.client.particle.c bgN;
    public cp bgO;
    private boolean bgP;
    public agg fontRendererObj;
    public agg bgQ;
    public bp bgR;
    public net.minecraft.client.c bgS;
    public EntityRenderer bgT;
    public rip.vantage.commons.util.time.a bgU = new rip.vantage.commons.util.time.a();
    public int bgV;
    private int bgW;
    private int bgX;
    public IntegratedServer bgY;
    public net.minecraft.client.gui.achievement.a bgZ;
    public z bha;
    public boolean bhb;
    public ce bhc;
    public rip.vantage.commons.util.time.a bhd = new rip.vantage.commons.util.time.a();
    public net.minecraft.client.settings.a aIY;
    public cb bhe;
    public final File bhf;
    private final File bhg;
    private final String bhh;
    private final Proxy bhi;
    private net.minecraft.world.storage.c bhj;
    private static int bhk;
    public int bhl;
    private String fc;
    private int bhm;
    public boolean bhn;
    long bgf = d.Bj();
    private int bho;
    public final ax bhp = new ax();
    long bhq = System.nanoTime();
    private final long bhr = System.currentTimeMillis();
    private final boolean bhs;
    private final boolean bht;
    private net.minecraft.network.r bhu;
    public boolean bhv;
    public final net.minecraft.profiler.d bhw = new net.minecraft.profiler.d();
    private long bhx = -1L;
    private IReloadableResourceManager bhy;
    private final IMetadataSerializer bhz = new IMetadataSerializer();
    private final List<IResourcePack> bhA = Lists.newArrayList();
    private final DefaultResourcePack bhB;
    private ResourcePackRepository bhC;
    private LanguageManager bhD;
    private a bhE;
    private TextureMap bhF;
    private SoundHandler bhG;
    private MusicTicker bhH;
    private cm bhI;
    private final MinecraftSessionService bhJ;
    private SkinManager bhK;
    private final Queue<FutureTask<?>> bhL = Queues.newArrayDeque();
    private final Thread bhM = Thread.currentThread();
    private ModelManager bhN;
    private BlockRendererDispatcher bhO;
    volatile boolean bhP = true;
    public String bhQ = "";
    public boolean bhR = true;
    long bhS = d.Bj();
    int bhT;
    long bhU = -1L;
    private String bhV = "root";
    public cz jY;

    public d(net.minecraft.client.main.a a2) {
        bgt = this;
        this.bhf = a2.bxM.bxT;
        this.bhg = a2.bxM.bxV;
        this.bgp = a2.bxM.bxU;
        this.bhh = a2.bxN.bxY;
        this.bgq = a2.bxK.byc;
        this.bgr = a2.bxK.byd;
        this.bhB = new DefaultResourcePack(new ResourceIndex(a2.bxM.bxV, a2.bxM.bxW).Pu());
        this.bhi = a2.bxK.bye == null ? Proxy.NO_PROXY : a2.bxK.bye;
        this.bhJ = new YggdrasilAuthenticationService(a2.bxK.bye, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.bgO = a2.bxK.byb;
        bgj.info("Setting user: " + this.bgO.bX());
        bgj.info("(Session ID is " + this.bgO.atD() + ")");
        this.bht = a2.bxN.bxX;
        this.bgz = a2.bxL.bxP > 0 ? a2.bxL.bxP : 1;
        this.bgA = a2.bxL.bxQ > 0 ? a2.bxL.bxQ : 1;
        this.bgW = a2.bxL.bxP;
        this.bgX = a2.bxL.bxQ;
        this.bgv = a2.bxL.bxR;
        this.bhs = d.Av();
        this.bgY = new IntegratedServer(this);
        this.jY = new cz(this);
        if (a2.bxO.bxZ != null) {
            this.fc = a2.bxO.bxZ;
            this.bhm = a2.bxO.bya;
        }
        ImageIO.setUseCache(false);
        Bootstrap.a();
    }

    private String Ap() {
        Map<String, String> map = System.getenv();
        if (map.containsKey("COMPUTERNAME")) {
            return map.get("COMPUTERNAME");
        }
        return map.getOrDefault("HOSTNAME", "Unknown Computer");
    }

    List t(String string, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < string.length(); i2 += n2) {
            arrayList.add(string.substring(i2, Math.min(i2 + n2, string.length())));
        }
        return arrayList;
    }

    public void cy(String string) {
    }

    public void run() {
        block15: {
            this.bhP = true;
            try {
                this.Aq();
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Initializing game");
                a2.dY("Initialization");
                this.b(this.c(a2));
                return;
            }
            try {
                while (this.bhP) {
                    if (!this.bgx || this.bgy == null) {
                        try {
                            this.AD();
                        }
                        catch (OutOfMemoryError outOfMemoryError) {
                            this.AI();
                            this.a(new an());
                            System.gc();
                        }
                        continue;
                    }
                    this.cy(this.bgy.SI());
                    this.b(this.bgy);
                }
            }
            catch (bz bz2) {
                break block15;
            }
            catch (cl cl2) {
                this.c(cl2.atz());
                this.AI();
                bgj.fatal("Reported exception thrown!", (Throwable)cl2);
                this.b(cl2.atz());
                break block15;
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a3 = this.c(new net.minecraft.crash.a("Unexpected error", throwable));
                this.cy(a3.SI());
                this.AI();
                bgj.fatal("Unreported exception thrown!", throwable);
                this.b(a3);
                break block15;
            }
            finally {
                this.AC();
            }
            return;
        }
    }

    private void Aq() {
        this.aIY = new net.minecraft.client.settings.a(this, this.bhf);
        this.bhA.add(this.bhB);
        this.Ax();
        if (this.aIY.cgQ > 0 && this.aIY.cgP > 0) {
            this.bgz = this.aIY.cgP;
            this.bgA = this.aIY.cgQ;
        }
        bgj.info("LWJGL Version: " + Sys.getVersion());
        this.Au();
        this.At();
        this.As();
        OpenGlHelper.Kq();
        this.bhE = new a(this.bgz, this.bgA, true);
        this.bhE.i(0.0f, 0.0f, 0.0f, 0.0f);
        this.Ar();
        this.bhC = new ResourcePackRepository(this.bgp, new File(this.bhf, "server-resource-packs"), this.bhB, this.bhz, this.aIY);
        this.bhy = new SimpleReloadableResourceManager(this.bhz);
        this.bhD = new LanguageManager(this.bhz, this.aIY.cia);
        this.bhy.a(this.bhD);
        this.Az();
        this.aIK = new TextureManager(this.bhy);
        this.bhy.a(this.aIK);
        this.a(this.aIK);
        this.bhK = new SkinManager(this.aIK, new File(this.bhg, "skins"), this.bhJ);
        this.bhj = new net.minecraft.world.chunk.storage.b(new File(this.bhf, "saves"));
        this.bhG = new SoundHandler(this.bhy, this.aIY);
        this.bhy.a(this.bhG);
        this.bhH = new MusicTicker(this);
        this.fontRendererObj = new agg(this.aIY, new cm("textures/font/ascii.png"), this.aIK, false);
        if (this.aIY.cia != null) {
            this.fontRendererObj.C(this.Ay());
            this.fontRendererObj.D(this.bhD.Pq());
        }
        this.bgQ = new agg(this.aIY, new cm("textures/font/ascii_sga.png"), this.aIK, false);
        this.bhy.a(this.fontRendererObj);
        this.bhy.a(this.bgQ);
        this.bhy.a(new GrassColorReloadListener());
        this.bhy.a(new FoliageColorReloadListener());
        net.minecraft.stats.b.doE.a((String string) -> {
            try {
                return String.format(string, net.minecraft.client.settings.a.dY(this.aIY.cht.cO()));
            }
            catch (Exception exception) {
                return "Error: " + exception.getLocalizedMessage();
            }
        });
        this.bhe = new cb();
        this.cz("Pre startup");
        GlStateManager.JN();
        GlStateManager.cP(7425);
        GlStateManager.ak(1.0);
        GlStateManager.JE();
        GlStateManager.cJ(515);
        GlStateManager.tL();
        GlStateManager.e(516, 0.1f);
        GlStateManager.cL(1029);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        GlStateManager.cR(5888);
        this.cz("Startup");
        this.bhF = new TextureMap("textures");
        this.bhF.dK(this.aIY.bZj);
        this.aIK.a(TextureMap.bZE, this.bhF);
        this.aIK.a(TextureMap.bZE);
        this.bhF.e(false, this.aIY.bZj > 0);
        this.bhN = new ModelManager(this.bhF);
        this.bhy.a(this.bhN);
        this.bgI = new RenderItem(this.aIK, this.bhN);
        this.bgH = new RenderManager(this.aIK, this.bgI);
        this.bgJ = new ItemRenderer(this);
        this.bhy.a(this.bgI);
        this.bgT = new EntityRenderer(this, this.bhy);
        this.bhy.a(this.bgT);
        this.bhO = new BlockRendererDispatcher(this.bhN.IY(), this.aIY);
        this.bhy.a(this.bhO);
        this.bgG = new RenderGlobal(this);
        this.bhy.a(this.bgG);
        this.bgZ = new net.minecraft.client.gui.achievement.a(this);
        GlStateManager.i(0, 0, this.bgz, this.bgA);
        this.bgN = new net.minecraft.client.particle.c(this.bgF, this.aIK);
        this.cz("Post startup");
        this.bha = new z(this);
        if (this.fc != null) {
            this.a(new net.minecraft.client.multiplayer.b(new adq(), this, this.fc, this.bhm));
        } else {
            this.a(new adq());
        }
        this.aIK.l(this.bhI);
        this.bhI = null;
        this.bgS = new net.minecraft.client.c(this);
        if (this.aIY.cgF && !this.bgv) {
            this.AP();
        }
        hackclient.rise.a.a.init();
        try {
            Display.setVSyncEnabled((boolean)this.aIY.cgG);
        }
        catch (OpenGLException openGLException) {
            this.aIY.cgG = false;
            this.aIY.QK();
        }
        this.bgG.KC();
    }

    private void Ar() {
        this.bhz.a(new TextureMetadataSectionSerializer(), TextureMetadataSection.class);
        this.bhz.a(new FontMetadataSectionSerializer(), FontMetadataSection.class);
        this.bhz.a(new AnimationMetadataSectionSerializer(), AnimationMetadataSection.class);
        this.bhz.a(new PackMetadataSectionSerializer(), PackMetadataSection.class);
        this.bhz.a(new LanguageMetadataSectionSerializer(), LanguageMetadataSection.class);
    }

    private void As() {
        Display.setResizable((boolean)true);
        Display.setTitle((String)("Initializing " + hackclient.rise.a.b + "..."));
        try {
            Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException lWJGLException) {
            bgj.error("Couldn't set pixel format", (Throwable)lWJGLException);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (this.bgv) {
                this.AA();
            }
            Display.create();
        }
    }

    private void At() {
        if (this.bgv) {
            Display.setFullscreen((boolean)true);
            DisplayMode displayMode = Display.getDisplayMode();
            this.bgz = Math.max(1, displayMode.getWidth());
            this.bgA = Math.max(1, displayMode.getHeight());
        } else {
            Display.setDisplayMode((DisplayMode)new DisplayMode(this.bgz, this.bgA));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Au() {
        net.minecraft.util.cz cz2 = cy.atP();
        if (cz2 != net.minecraft.util.cz.dAD) {
            InputStream inputStream;
            InputStream inputStream2;
            block5: {
                inputStream2 = null;
                inputStream = null;
                try {
                    inputStream2 = this.bhB.t(new cm("icons/icon_16x16.png"));
                    inputStream = this.bhB.t(new cm("icons/icon_32x32.png"));
                    if (inputStream2 == null || inputStream == null) break block5;
                    Display.setIcon((ByteBuffer[])new ByteBuffer[]{this.b(inputStream2), this.b(inputStream)});
                }
                catch (IOException iOException) {
                    try {
                        bgj.error("Couldn't set icon", (Throwable)iOException);
                    }
                    catch (Throwable throwable) {
                        IOUtils.closeQuietly(inputStream2);
                        IOUtils.closeQuietly(inputStream);
                        throw throwable;
                    }
                    IOUtils.closeQuietly((InputStream)inputStream2);
                    IOUtils.closeQuietly(inputStream);
                }
            }
            IOUtils.closeQuietly((InputStream)inputStream2);
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    private static boolean Av() {
        String[] stringArray;
        for (String string : stringArray = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"}) {
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return true;
        }
        return false;
    }

    public a Aw() {
        return this.bhE;
    }

    public String getVersion() {
        return this.bhh;
    }

    private void Ax() {
        e e2 = new e(this, "Timer hack thread");
        e2.setDaemon(true);
        e2.start();
    }

    public void a(net.minecraft.crash.a a2) {
        this.bgx = true;
        this.bgy = a2;
    }

    public void b(net.minecraft.crash.a a2) {
        try {
            hackclient.rise.a.a.b();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        File file = new File(d.AZ().bhf, "crash-reports");
        File file2 = new File(file, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        Bootstrap.ep(a2.SI());
        if (a2.sZ() != null) {
            Bootstrap.ep("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf(a2.sZ()));
            System.exit(-1);
        } else if (a2.g(file2)) {
            Bootstrap.ep("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(-1);
        } else {
            Bootstrap.ep("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public boolean Ay() {
        return this.bhD != null && this.aIY != null && (this.bhD.Pp() || this.aIY.cib);
    }

    public void Az() {
        ArrayList arrayList = Lists.newArrayList(this.bhA);
        for (ResourcePackRepository$Entry resourcePackRepository$Entry : this.bhC.PJ()) {
            arrayList.add(resourcePackRepository$Entry.PQ());
        }
        if (this.bhC.PM() != null) {
            arrayList.add(this.bhC.PM());
        }
        try {
            this.bhy.v(arrayList);
        }
        catch (RuntimeException runtimeException) {
            bgj.info("Caught error stitching, removing all assigned resourcepacks", (Throwable)runtimeException);
            arrayList.clear();
            arrayList.addAll(this.bhA);
            this.bhC.y(Collections.emptyList());
            this.bhy.v(arrayList);
            this.aIY.ccK.clear();
            this.aIY.cgy.clear();
            this.aIY.QK();
        }
        this.bhD.w(arrayList);
        if (this.bgG != null) {
            this.bgG.KI();
        }
    }

    private ByteBuffer b(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] nArray = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * nArray.length);
        for (int n2 : nArray) {
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    private void AA() {
        HashSet hashSet = Sets.newHashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        DisplayMode displayMode = Display.getDesktopDisplayMode();
        if (!hashSet.contains(displayMode) && cy.atP() == net.minecraft.util.cz.dAD) {
            block0: for (DisplayMode displayMode2 : bgo) {
                boolean bl2 = true;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() || displayMode3.getHeight() != displayMode2.getHeight()) continue;
                    bl2 = false;
                    break;
                }
                if (bl2) continue;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() / 2 || displayMode3.getHeight() != displayMode2.getHeight() / 2) continue;
                    displayMode = displayMode3;
                    continue block0;
                }
            }
        }
        Display.setDisplayMode((DisplayMode)displayMode);
        this.bgz = displayMode.getWidth();
        this.bgA = displayMode.getHeight();
    }

    private void a(TextureManager textureManager) {
        cz cz2 = this.jY;
        int n2 = cz2.getScaleFactor();
        a a2 = new a(cz2.getScaledWidth() * n2, cz2.getScaledHeight() * n2, true);
        a2.az(false);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        GlStateManager.e(0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), 0.0, 1000.0, 3000.0);
        GlStateManager.cR(5888);
        GlStateManager.JU();
        GlStateManager.j(0.0f, 0.0f, -2000.0f);
        GlStateManager.JA();
        GlStateManager.JG();
        GlStateManager.JD();
        GlStateManager.JN();
        ait.e(Color.WHITE);
        ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        ait.a(new cm("rise/images/splash.png"), (double)cz2.getScaledWidth() / 2.0 - 75.0, (double)cz2.getScaledHeight() / 2.0 - 25.0, 150.0, 50.0);
        GlStateManager.JA();
        GlStateManager.JG();
        a2.Ro();
        a2.ak(cz2.getScaledWidth() * n2, cz2.getScaledHeight() * n2);
        GlStateManager.tL();
        GlStateManager.e(516, 0.1f);
        this.AE();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        WorldRenderer worldRenderer = Tessellator.Li().Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(n2, n3 + n7, 0.0).r((float)n4 * 0.00390625f, (float)(n5 + n7) * 0.00390625f).s(n8, n9, n10, n11).Lx();
        worldRenderer.F(n2 + n6, n3 + n7, 0.0).r((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).s(n8, n9, n10, n11).Lx();
        worldRenderer.F(n2 + n6, n3, 0.0).r((float)(n4 + n6) * 0.00390625f, (float)n5 * 0.00390625f).s(n8, n9, n10, n11).Lx();
        worldRenderer.F(n2, n3, 0.0).r((float)n4 * 0.00390625f, (float)n5 * 0.00390625f).s(n8, n9, n10, n11).Lx();
        Tessellator.Li().pZ();
    }

    public net.minecraft.world.storage.c AB() {
        return this.bhj;
    }

    public void a(bp bp2) {
        if (this.bgR != null) {
            this.bgR.onGuiClosed();
        }
        if (bp2 == null && this.bgF == null) {
            bp2 = new adu();
        } else if (bp2 == null && this.bgK.getHealth() <= 0.0f) {
            bp2 = new x();
        }
        if (bp2 instanceof adu) {
            this.aIY.bJS = false;
            this.bha.Ey().ER();
        }
        this.bgR = bp2;
        if (bp2 != null) {
            this.AL();
            int n2 = this.jY.getScaledWidth();
            int n3 = this.jY.getScaledHeight();
            bp2.setWorldAndResolution(this, n2, n3);
            this.bhb = false;
        } else {
            this.bhG.CC();
            this.AK();
        }
    }

    private void cz(String string) {
        int n2;
        if (this.bgw && (n2 = GL11.glGetError()) != 0) {
            String string2 = GLU.gluErrorString((int)n2);
            bgj.error("########## GL ERROR ##########");
            bgj.error("@ " + string);
            bgj.error(n2 + ": " + string2);
        }
    }

    public void AC() {
        try {
            bgj.info("Stopping!");
            try {
                hackclient.rise.a.a.b();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                this.a((j)null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.bhG.CB();
        }
        finally {
            Display.destroy();
            if (!this.bgx) {
                System.exit(0);
            }
        }
        System.gc();
    }

    private void AD() {
        long l2 = System.nanoTime();
        this.bhw.eY("root");
        if (Display.isCreated() && Display.isCloseRequested()) {
            this.AJ();
        }
        if (this.bgP && this.bgF != null) {
            float f2 = this.bgC.bWY;
            this.bgC.atM();
            this.bgC.bWY = f2;
        } else {
            this.bgC.atM();
        }
        this.bhw.eY("scheduledExecutables");
        try {
            while (!this.bhL.isEmpty()) {
                cy.a(this.bhL.poll(), bgj);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.bhw.ajv();
        long l3 = System.nanoTime();
        this.bhw.eY("tick");
        au.ecL.rJ();
        for (int i2 = 0; i2 < this.bgC.In; ++i2) {
            this.bgC.dAp = 1.0f;
            fe fe2 = new fe();
            hackclient.rise.a.a.e().d(fe2);
            if (fe2.isCancelled()) continue;
            this.AS();
        }
        au.ecL.vX();
        if (this.bhd.T(5000L)) {
            this.bhd.aX();
            hackclient.rise.a.a.e().d(new ew());
        }
        this.bhw.fa("preRenderErrors");
        long l4 = System.nanoTime() - l3;
        this.cz("Pre render");
        this.bhw.fa("sound");
        this.bhG.b(this.bgK, this.bgC.bWY);
        this.bhw.ajv();
        this.bhw.eY("render");
        GlStateManager.JV();
        GlStateManager.cQ(16640);
        this.bhE.az(true);
        this.bhw.eY("display");
        GlStateManager.JN();
        this.bhw.ajv();
        if (!this.bhb) {
            this.bhw.fa("gameRenderer");
            this.bgT.a(this.bgC.bWY, l2);
            this.bhw.ajv();
        }
        this.bhw.ajv();
        if (this.aIY.bJS && this.aIY.chQ && !this.aIY.chO) {
            if (!this.bhw.dhU) {
                this.bhw.aju();
            }
            this.bhw.dhU = true;
            this.l(l4);
        } else {
            this.bhw.dhU = false;
            this.bhU = System.nanoTime();
        }
        this.bhE.Ro();
        GlStateManager.JW();
        GlStateManager.JV();
        this.bhE.ak(this.bgz, this.bgA);
        GlStateManager.JW();
        this.bhw.eY("root");
        this.AE();
        Thread.yield();
        this.cz("Post render");
        ++this.bhT;
        this.bgP = this.isSingleplayer() && this.bgR != null && this.bgR.doesGuiPauseGame() && !this.bgY.amb();
        long l5 = System.nanoTime();
        this.bhp.z(l5 - this.bhq);
        this.bhq = l5;
        while (d.Bj() >= this.bhS + 1000L) {
            bhk = this.bhT;
            if (this.aIY.bJS) {
                Object[] objectArray = new Object[8];
                objectArray[0] = bhk;
                objectArray[1] = RenderChunk.bTp;
                objectArray[2] = RenderChunk.bTp != 1 ? "s" : "";
                objectArray[3] = (float)this.aIY.cgv == net.minecraft.client.settings.c.cjR.QZ() ? "inf" : Integer.valueOf(this.aIY.cgv);
                objectArray[4] = this.aIY.cgG ? " vsync" : "";
                Object object = objectArray[5] = this.aIY.aWD ? "" : " fast";
                objectArray[6] = this.aIY.cgw == 0 ? "" : (this.aIY.cgw == 1 ? " fast-clouds" : " fancy-clouds");
                objectArray[7] = OpenGlHelper.Kv() ? " vbo" : "";
                this.bhQ = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", objectArray);
            }
            RenderChunk.bTp = 0;
            this.bhS += 1000L;
            this.bhT = 0;
            this.bgE.ajo();
            if (this.bgE.ajq()) continue;
            this.bgE.ajl();
        }
        if (this.AH()) {
            this.bhw.eY("fpslimit_wait");
            Display.sync((int)this.AG());
            this.bhw.ajv();
        }
        this.bhw.ajv();
    }

    public void AE() {
        this.bhw.eY("display_update");
        Display.update();
        this.bhw.ajv();
        this.AF();
    }

    protected void AF() {
        if (!this.bgv && Display.wasResized()) {
            int n2 = this.bgz;
            int n3 = this.bgA;
            this.bgz = Display.getWidth();
            this.bgA = Display.getHeight();
            if (this.bgz != n2 || this.bgA != n3) {
                if (this.bgz <= 0) {
                    this.bgz = 1;
                }
                if (this.bgA <= 0) {
                    this.bgA = 1;
                }
                this.q(this.bgz, this.bgA);
            }
        }
    }

    public int AG() {
        return Display.isActive() ? (this.bgF == null && this.bgR != null ? 23423 : this.aIY.cgv) : 120;
    }

    public boolean AH() {
        return (float)this.AG() < net.minecraft.client.settings.c.cjR.QZ();
    }

    public void AI() {
        try {
            bgn = new byte[0];
            this.bgG.KQ();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.a((j)null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    private void bw(int n2) {
        List<net.minecraft.profiler.e> list = this.bhw.eZ(this.bhV);
        if (list != null && !list.isEmpty()) {
            net.minecraft.profiler.e e2 = list.remove(0);
            if (n2 == 0) {
                int n3;
                if (e2.dil.length() > 0 && (n3 = this.bhV.lastIndexOf(".")) >= 0) {
                    this.bhV = this.bhV.substring(0, n3);
                }
            } else if (--n2 < list.size() && !list.get((int)n2).dil.equals("unspecified")) {
                if (this.bhV.length() > 0) {
                    this.bhV = this.bhV + ".";
                }
                this.bhV = this.bhV + list.get((int)n2).dil;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(long l2) {
        try {
            if (this.bhw.dhU) {
                void var13_18;
                int n2;
                int n3;
                List<net.minecraft.profiler.e> list = this.bhw.eZ(this.bhV);
                net.minecraft.profiler.e e2 = list.remove(0);
                GlStateManager.cQ(256);
                GlStateManager.cR(5889);
                GlStateManager.JB();
                GlStateManager.JU();
                GlStateManager.e(0.0, this.bgz, this.bgA, 0.0, 1000.0, 3000.0);
                GlStateManager.cR(5888);
                GlStateManager.JU();
                GlStateManager.j(0.0f, 0.0f, -2000.0f);
                GL11.glLineWidth((float)1.0f);
                GlStateManager.JO();
                Tessellator tessellator = Tessellator.Li();
                WorldRenderer worldRenderer = tessellator.Lj();
                int n4 = 160;
                int n5 = this.bgz - 160 - 10;
                int n6 = this.bgA - 320;
                GlStateManager.tQ();
                worldRenderer.a(7, DefaultVertexFormats.cbF);
                worldRenderer.F((float)n5 - 176.0f, (float)n6 - 96.0f - 16.0f, 0.0).s(200, 0, 0, 0).Lx();
                worldRenderer.F((float)n5 - 176.0f, n6 + 320, 0.0).s(200, 0, 0, 0).Lx();
                worldRenderer.F((float)n5 + 176.0f, n6 + 320, 0.0).s(200, 0, 0, 0).Lx();
                worldRenderer.F((float)n5 + 176.0f, (float)n6 - 96.0f - 16.0f, 0.0).s(200, 0, 0, 0).Lx();
                tessellator.pZ();
                GlStateManager.tR();
                double d2 = 0.0;
                for (net.minecraft.profiler.e object2 : list) {
                    float f2;
                    float f3;
                    float f4;
                    int n7;
                    n3 = bt.aF(object2.dij / 4.0) + 1;
                    worldRenderer.a(6, DefaultVertexFormats.cbF);
                    n2 = object2.ajx();
                    int n8 = n2 >> 16 & 0xFF;
                    int n9 = n2 >> 8 & 0xFF;
                    int n10 = n2 & 0xFF;
                    worldRenderer.F(n5, n6, 0.0).s(n8, n9, n10, 255).Lx();
                    for (n7 = n3; n7 >= 0; --n7) {
                        f4 = (float)((d2 + object2.dij * (double)n7 / (double)n3) * Math.PI * 2.0 / 100.0);
                        f3 = bt.bx(f4) * 160.0f;
                        f2 = bt.bB(f4) * 160.0f * 0.5f;
                        worldRenderer.F((float)n5 + f3, (float)n6 - f2, 0.0).s(n8, n9, n10, 255).Lx();
                    }
                    tessellator.pZ();
                    worldRenderer.a(5, DefaultVertexFormats.cbF);
                    for (n7 = n3; n7 >= 0; --n7) {
                        f4 = (float)((d2 + object2.dij * (double)n7 / (double)n3) * Math.PI * 2.0 / 100.0);
                        f3 = bt.bx(f4) * 160.0f;
                        f2 = bt.bB(f4) * 160.0f * 0.5f;
                        worldRenderer.F((float)n5 + f3, (float)n6 - f2, 0.0).s(n8 >> 1, n9 >> 1, n10 >> 1, 255).Lx();
                        worldRenderer.F((float)n5 + f3, (float)n6 - f2 + 10.0f, 0.0).s(n8 >> 1, n9 >> 1, n10 >> 1, 255).Lx();
                    }
                    tessellator.pZ();
                    d2 += object2.dij;
                }
                DecimalFormat decimalFormat = new DecimalFormat("##0.00");
                GlStateManager.JN();
                String string = "";
                if (!e2.dil.equals("unspecified")) {
                    String string2 = string + "[0] ";
                }
                if (e2.dil.length() == 0) {
                    String string3 = (String)var13_15 + "ROOT ";
                } else {
                    String string4 = (String)var13_15 + e2.dil + " ";
                }
                n3 = 0xFFFFFF;
                this.fontRendererObj.b((String)var13_18, n5 - 160, n6 - 80 - 16, 0xFFFFFF);
                String string5 = decimalFormat.format(e2.dik) + "%";
                this.fontRendererObj.b(string5, n5 + 160 - this.fontRendererObj.bQ(string5), n6 - 80 - 16, 0xFFFFFF);
                for (n2 = 0; n2 < list.size(); ++n2) {
                    net.minecraft.profiler.e e3 = list.get(n2);
                    Object object = "";
                    object = e3.dil.equals("unspecified") ? (String)object + "[?] " : (String)object + "[" + (n2 + 1) + "] ";
                    object = (String)object + e3.dil;
                    this.fontRendererObj.b((String)object, n5 - 160, n6 + 80 + n2 * 8 + 20, e3.ajx());
                    object = decimalFormat.format(e3.dij) + "%";
                    this.fontRendererObj.b((String)object, n5 + 160 - 50 - this.fontRendererObj.bQ((String)object), n6 + 80 + n2 * 8 + 20, e3.ajx());
                    object = decimalFormat.format(e3.dik) + "%";
                    this.fontRendererObj.b((String)object, n5 + 160 - this.fontRendererObj.bQ((String)object), n6 + 80 + n2 * 8 + 20, e3.ajx());
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void AJ() {
        try {
            hackclient.rise.a.a.b();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.bhP = false;
    }

    public void AK() {
        if (Display.isActive() && !this.bhn) {
            this.bhn = true;
            this.bhe.ats();
            this.a((bp)null);
            this.bgV = 10000;
        }
    }

    public void AL() {
        if (this.bhn) {
            net.minecraft.client.settings.d.Rb();
            this.bhn = false;
            this.bhe.att();
        }
    }

    public void AM() {
        if (this.bgR == null) {
            this.a(new aa());
            if (this.isSingleplayer() && !this.bgY.amb()) {
                this.bhG.Cz();
            }
        }
    }

    private void Q(boolean bl2) {
        if (!bl2) {
            this.bgV = 0;
        }
        if (this.bgV <= 0 && !this.bgK.isUsingItem()) {
            if (bl2 && this.bhc != null && this.bhc.dzu == cf.dzy) {
                net.minecraft.util.b b2 = this.bhc.dg();
                if (this.bgF.L(b2).df().xb() != Material.beo && this.bgu.f(b2, this.bhc.dzv)) {
                    this.bgN.g(b2, this.bhc.dzv);
                    this.bgK.swingItem();
                }
            } else {
                this.bgu.Hq();
            }
        }
        hackclient.rise.a.a.e().d(new dw());
    }

    public void AN() {
        this.d(true, true);
    }

    public void d(boolean bl2, boolean bl3) {
        if (this.bgV <= 0) {
            Object object;
            if (bl3) {
                object = new dr();
                hackclient.rise.a.a.e().d((di)object);
                if (((dh)object).isCancelled()) {
                    return;
                }
                if (this.bhc != null && this.bhc.dzu == cf.dzz && this.bhc.dzw instanceof r) {
                    eq eq2 = new eq((r)this.bhc.dzw);
                    hackclient.rise.a.a.e().d(eq2);
                    if (eq2.isCancelled()) {
                        return;
                    }
                }
            }
            if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() < ProtocolVersion.v1_8.getVersion()) {
                AttackOrder.sendConditionalSwing(this.bhc);
            }
            if (this.bhc == null) {
                bgj.error("Null returned as 'hitResult', this shouldn't happen!");
                if (this.bgu.Hw()) {
                    this.bgV = 10;
                }
            } else {
                switch (this.bhc.dzu) {
                    case dzz: {
                        AttackOrder.sendFixedAttack(this.bgK, this.bhc.dzw);
                        break;
                    }
                    case dzy: {
                        object = this.bhc.dg();
                        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= ProtocolVersion.v1_8.getVersion()) {
                            this.bgK.swingItem();
                        }
                        if (this.bgF.L((net.minecraft.util.b)object).df().xb() != Material.beo) {
                            this.bgu.e((net.minecraft.util.b)object, this.bhc.dzv);
                            break;
                        }
                    }
                    case dzx: {
                        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= ProtocolVersion.v1_8.getVersion()) {
                            this.bgK.swingItem();
                        }
                    }
                    default: {
                        if (!this.bgu.Hw()) break;
                        this.bgV = 10;
                    }
                }
                if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() > ProtocolVersion.v1_8.getVersion()) {
                    AttackOrder.sendConditionalSwing(this.bhc);
                }
            }
        }
    }

    public void AO() {
        ea ea2 = new ea();
        hackclient.rise.a.a.e().d(ea2);
        if (ea2.isCancelled()) {
            return;
        }
        if (!this.bgu.HB()) {
            Object object;
            this.bhl = 4;
            boolean bl2 = true;
            hackclient.rise.a.a.h().b(bu.class);
            net.minecraft.item.co co2 = bu.bO();
            if (this.bhc == null) {
                bgj.warn("Null returned as 'hitResult', this shouldn't happen!");
            } else {
                switch (this.bhc.dzu) {
                    case dzz: {
                        if (this.bgu.a((net.minecraft.entity.player.a)this.bgK, this.bhc.dzw, this.bhc)) {
                            bl2 = false;
                            break;
                        }
                        if (!this.bgu.b(this.bgK, this.bhc.dzw)) break;
                        bl2 = false;
                        break;
                    }
                    case dzy: {
                        int n2;
                        object = this.bhc.dg();
                        if (this.bgF.L((net.minecraft.util.b)object).df().xb() == Material.beo) break;
                        int n3 = n2 = co2 != null ? co2.cWZ : 0;
                        if (this.bgu.a(this.bgK, this.bgF, co2, (net.minecraft.util.b)object, this.bhc.dzv, this.bhc.daS)) {
                            bl2 = false;
                            this.bgK.swingItem();
                        }
                        if (co2 == null) {
                            return;
                        }
                        if (co2.cWZ == 0) {
                            net.minecraft.item.co[] coArray = this.bgK.cHV.cJC;
                            hackclient.rise.a.a.h().b(bu.class);
                            coArray[bu.bQ()] = null;
                            break;
                        }
                        if (co2.cWZ == n2 && !this.bgu.Hx()) break;
                        this.bgT.bgJ.Ko();
                    }
                }
            }
            if (bl2) {
                hackclient.rise.a.a.h().b(bu.class);
                object = bu.bO();
                if (object != null && this.bgu.a((net.minecraft.entity.player.a)this.bgK, this.bgF, (net.minecraft.item.co)object)) {
                    this.bgT.bgJ.Kp();
                }
            }
        }
    }

    public void AP() {
        try {
            this.aIY.cgF = this.bgv = !this.bgv;
            if (this.bgv) {
                this.AA();
                this.bgz = Display.getDisplayMode().getWidth();
                this.bgA = Display.getDisplayMode().getHeight();
            } else {
                Display.setDisplayMode((DisplayMode)new DisplayMode(this.bgW, this.bgX));
                this.bgz = this.bgW;
                this.bgA = this.bgX;
            }
            if (this.bgz <= 0) {
                this.bgz = 1;
            }
            if (this.bgA <= 0) {
                this.bgA = 1;
            }
            if (this.bgR != null) {
                this.q(this.bgz, this.bgA);
            } else {
                this.AQ();
            }
            Display.setFullscreen((boolean)this.bgv);
            Display.setVSyncEnabled((boolean)this.aIY.cgG);
            this.AE();
        }
        catch (Exception exception) {
            bgj.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    private void q(int n2, int n3) {
        this.bgz = Math.max(1, n2);
        this.bgA = Math.max(1, n3);
        if (this.bgR != null) {
            cz cz2 = new cz(this);
            this.bgR.onResize(this, cz2.getScaledWidth(), cz2.getScaledHeight());
        }
        this.bgS = new net.minecraft.client.c(this);
        this.AQ();
    }

    private void AQ() {
        this.bhE.ai(this.bgz, this.bgA);
        if (this.bgT != null) {
            this.bgT.L(this.bgz, this.bgA);
        }
        hackclient.rise.a.a.e().d(new fl(this.bgz, this.bgA));
    }

    public MusicTicker AR() {
        return this.bhH;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void AS() {
        int n2;
        Object object;
        this.jY = new cz(this);
        if (ViaMCP.INSTANCE != null && ViaMCP.INSTANCE.user != null) {
            try {
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundConfigurationPackets1_20_2.CUSTOM_PAYLOAD, (UserConnection)ViaMCP.INSTANCE.user);
                packetWrapper.write(Types.STRING, (Object)"minecraft:brand");
                packetWrapper.write(Types.STRING, (Object)"vanilla");
                packetWrapper.sendToServer(Protocol1_20_3To1_20_2.class);
                object = d.AZ();
                packetWrapper = PacketWrapper.create((PacketType)ServerboundConfigurationPackets1_20_2.CLIENT_INFORMATION, (UserConnection)ViaMCP.INSTANCE.user);
                packetWrapper.write(Types.STRING, (Object)((d)object).aIY.cia.toLowerCase());
                packetWrapper.write((Type)Types.BYTE, (Object)((byte)((d)object).aIY.bOt));
                packetWrapper.write((Type)Types.VAR_INT, (Object)((d)object).aIY.cgz.ordinal());
                packetWrapper.write((Type)Types.BOOLEAN, (Object)((d)object).aIY.cgA);
                n2 = 0;
                for (net.minecraft.entity.player.f f2 : ((d)object).aIY.QM()) {
                    n2 |= f2.acz();
                }
                packetWrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)n2));
                packetWrapper.write((Type)Types.VAR_INT, (Object)1);
                packetWrapper.write((Type)Types.BOOLEAN, (Object)true);
                packetWrapper.write((Type)Types.BOOLEAN, (Object)true);
                packetWrapper.sendToServer(Protocol1_20_3To1_20_2.class);
            }
            catch (Exception exception) {
                bgj.debug("ViaVersion packet transformation failed (expected during connection setup): " + exception.getMessage());
            }
            finally {
                ViaMCP.INSTANCE.user = null;
            }
        }
        if (this.bgK != null) {
            this.bgK.He = this.bgK.ud;
            this.bgK.Hf = this.bgK.ue;
            this.bgK.Hg = this.bgK.uf;
            this.bgK.im = this.bgK.aO;
            this.bgK.pr = this.bgK.pp;
            this.bgK.pp = this.bgK.pq = this.bgK.pl;
        }
        if (this.bhl > 0) {
            --this.bhl;
        }
        if (!this.bgP) {
            aNC.execute(() -> this.bha.Ex());
        }
        this.bgT.al(1.0f);
        this.bhw.eY("gameMode");
        if (!this.bgP && this.bgF != null) {
            this.bgu.Hs();
        }
        if (!this.bgP) {
            this.aIK.tick();
        }
        if (this.bgR == null && this.bgK != null) {
            if (this.bgK.getHealth() <= 0.0f) {
                this.a((bp)null);
            } else if (this.bgK.Wg() && this.bgF != null) {
                this.a(new ci());
            }
        } else if (this.bgR != null && this.bgR instanceof ci && !this.bgK.Wg()) {
            this.a((bp)null);
        }
        if (this.bgR != null) {
            this.bgV = 10000;
        }
        if (this.bgR != null) {
            try {
                this.bgR.handleInput();
            }
            catch (Throwable throwable) {
                object = net.minecraft.crash.a.a(throwable, "Updating screen events");
                i i2 = ((net.minecraft.crash.a)object).dY("Affected screen");
                i2.a("Screen name", () -> this.bgR.getClass().getCanonicalName());
                throw new cl((net.minecraft.crash.a)object);
            }
            if (this.bgR != null) {
                try {
                    this.bgR.updateScreen();
                }
                catch (Throwable throwable) {
                    object = net.minecraft.crash.a.a(throwable, "Ticking screen");
                    i i3 = ((net.minecraft.crash.a)object).dY("Affected screen");
                    i3.a("Screen name", () -> this.bgR.getClass().getCanonicalName());
                    throw new cl((net.minecraft.crash.a)object);
                }
            }
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() > ProtocolVersion.v1_8.getVersion()) {
            // empty if block
        }
        if (this.bgR == null || this.bgR.allowUserInput) {
            int n3;
            this.bhw.fa("mouse");
            while (Mouse.next()) {
                long l2;
                int n4 = Mouse.getEventButton();
                net.minecraft.client.settings.d.k(n4 - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    if (this.bgK.CZ() && n4 == 2) {
                        this.bha.EB().Ga();
                    } else {
                        net.minecraft.client.settings.d.ea(n4 - 100);
                    }
                }
                if ((l2 = d.Bj() - this.bgf) > 200L) continue;
                int n5 = Mouse.getEventDWheel();
                if (n5 != 0) {
                    if (this.bgK.CZ()) {
                        int n6 = n5 = n5 < 0 ? -1 : 1;
                        if (this.bha.EB().FZ()) {
                            this.bha.EB().bP(-n5);
                        } else {
                            float f3 = bt.I(this.bgK.cIt.getFlySpeed() + (float)n5 * 0.005f, 0.0f, 0.2f);
                            this.bgK.cIt.bt(f3);
                        }
                    } else {
                        this.bgK.cHV.fI(n5);
                    }
                }
                if (this.bgR == null) {
                    if (this.bhn || !Mouse.getEventButtonState()) continue;
                    this.AK();
                    continue;
                }
                this.bgR.handleMouseInput();
            }
            if (this.bgV > 0) {
                --this.bgV;
            }
            this.bhw.fa("keyboard");
            while (Keyboard.next()) {
                int n7;
                int n8 = n7 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
                if (this.bgm) {
                    boolean bl2 = true;
                    if (n7 == this.aIY.chm.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.cho.cO();
                    }
                    if (n7 == this.aIY.cho.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.chm.cO();
                    }
                    if (n7 == this.aIY.chn.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.chp.cO();
                    }
                    if (n7 == this.aIY.chp.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.chn.cO();
                    }
                    if (n7 == this.aIY.chr.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.chq.cO();
                    }
                    if (n7 == this.aIY.chq.cO() && bl2) {
                        bl2 = false;
                        n7 = this.aIY.chr.cO();
                    }
                }
                net.minecraft.client.settings.d.k(n7, Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    net.minecraft.client.settings.d.ea(n7);
                }
                if (this.bhx > 0L) {
                    if (d.Bj() - this.bhx >= 6000L) {
                        throw new cl(new net.minecraft.crash.a("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown((int)46) || !Keyboard.isKeyDown((int)61)) {
                        this.bhx = -1L;
                    }
                } else if (Keyboard.isKeyDown((int)46) && Keyboard.isKeyDown((int)61)) {
                    this.bhx = d.Bj();
                }
                this.Bz();
                if (!Keyboard.getEventKeyState()) continue;
                object = new dx(n7, Keyboard.getEventCharacter(), this.bgR);
                hackclient.rise.a.a.e().d((di)object);
                if (((dh)object).isCancelled()) continue;
                if (n7 == 62 && this.bgT != null) {
                    this.bgT.Je();
                }
                if (this.bgR != null) {
                    this.bgR.handleKeyboardInput();
                } else {
                    switch (n7) {
                        case 1: {
                            this.AM();
                            break;
                        }
                        case 32: {
                            if (!Keyboard.isKeyDown((int)61) || this.bha == null) break;
                            this.bha.Ey().ER();
                            break;
                        }
                        case 20: 
                        case 31: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.Az();
                            break;
                        }
                        case 33: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.aIY.a(net.minecraft.client.settings.c.cjO, bp.isShiftKeyDown() ? -1 : 1);
                            break;
                        }
                        case 30: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.bgG.KI();
                            break;
                        }
                        case 35: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.aIY.cgL = !this.aIY.cgL;
                            this.aIY.QK();
                            break;
                        }
                        case 48: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.bgH.at(!this.bgH.Nw());
                            break;
                        }
                        case 25: {
                            if (!Keyboard.isKeyDown((int)61)) break;
                            this.aIY.cgM = !this.aIY.cgM;
                            this.aIY.QK();
                            break;
                        }
                        case 59: {
                            this.aIY.chO = !this.aIY.chO;
                            break;
                        }
                        case 61: {
                            this.aIY.bJS = !this.aIY.bJS;
                            this.aIY.chQ = bp.isShiftKeyDown();
                            this.aIY.chR = bp.isAltKeyDown();
                        }
                    }
                    if (this.aIY.chC.Rg() && !hackclient.rise.a.a.g().c(xc.class).isEnabled()) {
                        ++this.aIY.chP;
                        if (this.aIY.chP > 2) {
                            this.aIY.chP = 0;
                        }
                        if (this.aIY.chP == 0) {
                            this.bgT.K(this.BC());
                        } else if (this.aIY.chP == 1) {
                            this.bgT.K(null);
                        }
                        this.bgG.KR();
                    }
                    if (this.aIY.chD.Rg()) {
                        boolean bl3 = this.aIY.chT = !this.aIY.chT;
                    }
                }
                if (!this.aIY.bJS || !this.aIY.chQ) continue;
                if (n7 == 11) {
                    this.bw(0);
                }
                for (n2 = 0; n2 < 9; ++n2) {
                    if (n7 != 2 + n2) continue;
                    this.bw(n2 + 1);
                }
            }
            for (n3 = 0; n3 < 9; ++n3) {
                if (!this.aIY.chK[n3].Rg()) continue;
                if (this.bgK.CZ()) {
                    this.bha.EB().bO(n3);
                    continue;
                }
                this.bgK.cHV.cJE = n3;
            }
            int n9 = n3 = this.aIY.cgz != net.minecraft.entity.player.c.cIJ ? 1 : 0;
            while (this.aIY.cht.Rg()) {
                if (this.bgu.Dz()) {
                    this.bgK.Dv();
                    continue;
                }
                this.AU().u(new net.minecraft.network.play.client.z(net.minecraft.network.play.client.aa.dbR));
                this.a(new q(this.bgK));
            }
            while (this.aIY.chv.Rg()) {
                if (this.bgK.CZ()) continue;
                this.bgK.V(bp.isCtrlKeyDown());
            }
            if (n3 != 0) {
                while (this.aIY.chy.Rg()) {
                    this.a(new net.minecraft.client.gui.f());
                }
                if (this.bgR == null) {
                    if (this.aIY.chA.Rg()) {
                        this.a(new net.minecraft.client.gui.f("/"));
                    } else if (Keyboard.isKeyDown((int)52)) {
                        this.a(new net.minecraft.client.gui.f("."));
                    }
                }
            }
            if (this.bgK.isUsingItem()) {
                if (!this.aIY.chu.Re()) {
                    this.bgu.l(this.bgK);
                }
            } else {
                while (this.aIY.chw.Rg()) {
                    this.AN();
                }
                while (this.aIY.chu.Rg()) {
                    this.AO();
                }
                while (this.aIY.chx.Rg()) {
                    this.AY();
                }
            }
            if (this.aIY.chu.Re() && this.bhl == 0 && !this.bgK.isUsingItem()) {
                this.AO();
            }
            this.Q(this.bgR == null && this.aIY.chw.Re() && this.bhn);
        }
        if (this.bgF != null) {
            if (this.bgK != null) {
                ++this.bho;
                if (this.bho == 30) {
                    this.bho = 0;
                    this.bgF.aB(this.bgK);
                }
            }
            this.bhw.fa("gameRenderer");
            if (!this.bgP) {
                aNC.execute(() -> this.bgT.Jg());
            }
            this.bhw.fa("levelRenderer");
            this.bhw.fa("level");
            if (!this.bgP) {
                this.bgF.avu();
            }
        } else if (this.bgT.Jc()) {
            this.bgT.Jd();
        }
        if (!this.bgP) {
            aNC.execute(() -> {
                this.bhH.jA();
                this.bhG.jA();
            });
        }
        if (this.bgF != null) {
            if (!this.bgP) {
                this.bgF.j(this.bgF.agm() != net.minecraft.world.f.dBR, true);
                try {
                    this.bgF.tick();
                }
                catch (Throwable throwable) {
                    object = net.minecraft.crash.a.a(throwable, "Exception in world tick");
                    if (this.bgF == null) {
                        i i4 = ((net.minecraft.crash.a)object).dY("Affected level");
                        i4.b("Problem", "Level is null!");
                    } else {
                        this.bgF.d((net.minecraft.crash.a)object);
                    }
                    throw new cl((net.minecraft.crash.a)object);
                }
            }
            this.bhw.fa("animateTick");
            this.bhw.fa("particles");
            if (!this.bgP) {
                aNC.execute(() -> this.bgN.It());
            }
        } else if (this.bhu != null) {
            this.bhw.fa("pendingConnection");
            this.bhu.afa();
        }
        this.bhw.ajv();
        this.bgf = d.Bj();
        if (this.bgD.size() != 0) {
            afl.b("Schedules:" + this.bgD.size(), new Object[0]);
        }
        this.bgD.forEach(Runnable::run);
        this.bgD.clear();
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2) && this.bgK != null && this.bgF != null && Via.getManager().getConnectionManager() != null && !Via.getManager().getConnectionManager().getConnections().isEmpty()) {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.CLIENT_TICK_END, null, (UserConnection)((UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next()));
            packetWrapper.sendToServer(Protocol1_21_2To1_21.class);
        }
    }

    public void a(String string, String string2, net.minecraft.world.an an2) {
        Object object;
        rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.community.f("Singleplayer").aJz());
        this.a((j)null);
        System.gc();
        net.minecraft.world.storage.d d2 = this.bhj.q(string, false);
        o o2 = d2.azx();
        if (o2 == null && an2 != null) {
            o2 = new o(an2, string);
            d2.b(o2);
        }
        if (an2 == null) {
            an2 = new net.minecraft.world.an(o2);
        }
        try {
            this.bgY = new IntegratedServer(this, string, string2, an2);
            this.bgY.alc();
            this.bhv = true;
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Starting integrated server");
            i i2 = a2.dY("Starting integrated server");
            i2.b("Level ID", string);
            i2.b("Level Name", string2);
            throw new cl(a2);
        }
        this.bgS.cv(I18n.a("menu.loadingLevel", new Object[0]));
        while (!this.bgY.alG()) {
            object = this.bgY.akO();
            if (object != null) {
                this.bgS.cx(I18n.a((String)object, new Object[0]));
            } else {
                this.bgS.cx("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.a((bp)null);
        object = this.bgY.alF().afp();
        net.minecraft.network.r r2 = net.minecraft.network.r.a((SocketAddress)object);
        r2.b(new f(r2, this, null));
        r2.B(new net.minecraft.network.handshake.client.a(47, object.toString(), 0, net.minecraft.network.a.cYI));
        r2.B(new net.minecraft.network.login.client.a(this.Bl().afK()));
        this.bhu = r2;
    }

    public void a(j j2) {
        this.a(j2, "");
    }

    public void a(j j2, String string) {
        if (j2 == null) {
            h h2 = this.AU();
            if (h2 != null) {
                h2.hu();
            }
            if (this.bgY != null && this.bgY.alh()) {
                this.bgY.akW();
                this.bgY.ama();
            }
            this.bgY = null;
            this.bgZ.Gz();
            this.bgT.Jp().Go();
        }
        this.bgL = null;
        this.bhu = null;
        if (this.bgS != null) {
            this.bgS.cu(string);
            this.bgS.cx("");
        }
        if (j2 == null && this.bgF != null) {
            this.bhC.PN();
            this.bha.ED();
            this.b((net.minecraft.client.multiplayer.f)null);
            this.bhv = false;
        }
        this.bhG.CA();
        this.bgF = j2;
        if (j2 != null) {
            if (this.bgG != null) {
                this.bgG.b(j2);
            }
            if (this.bgN != null) {
                this.bgN.d(j2);
            }
            if (this.bgK == null) {
                this.bgK = this.bgu.a(j2, new net.minecraft.stats.m());
                this.bgu.k(this.bgK);
            }
            this.bgK.Ts();
            j2.G(this.bgK);
            this.bgK.bkr = new cd(this.aIY);
            this.bgu.j(this.bgK);
            this.bgL = this.bgK;
        } else {
            this.bhj.axV();
            this.bgK = null;
        }
        System.gc();
        this.bgf = 0L;
    }

    public void bx(int n2) {
        this.bgF.avq();
        this.bgF.HS();
        int n3 = 0;
        String string = null;
        if (this.bgK != null) {
            n3 = this.bgK.getEntityId();
            this.bgF.H(this.bgK);
            string = this.bgK.Dw();
        }
        this.bgL = null;
        c c2 = this.bgK;
        this.bgK = this.bgu.a(this.bgF, this.bgK == null ? new net.minecraft.stats.m() : this.bgK.Dx());
        this.bgK.Tp().B(c2.Tp().Ti());
        this.bgK.csP = n2;
        this.bgL = this.bgK;
        this.bgK.Ts();
        this.bgK.cF(string);
        this.bgF.G(this.bgK);
        this.bgu.k(this.bgK);
        this.bgK.bkr = new cd(this.aIY);
        this.bgK.eu(n3);
        this.bgu.j(this.bgK);
        this.bgK.bK(c2.acd());
        if (this.bgR instanceof x) {
            this.a((bp)null);
        }
    }

    public final boolean AT() {
        return this.bht;
    }

    public h AU() {
        return this.bgK != null ? this.bgK.bkd : null;
    }

    public static boolean AV() {
        return bgt == null || !d.bgt.aIY.chO;
    }

    public static boolean AW() {
        return bgt != null && d.bgt.aIY.aWD;
    }

    public static boolean AX() {
        return bgt != null && d.bgt.aIY.cgx != 0;
    }

    private void AY() {
        if (this.bhc != null) {
            net.minecraft.item.d d2;
            Object object;
            Object object2;
            boolean bl2 = this.bgK.cIt.cJM;
            int n2 = 0;
            boolean bl3 = false;
            net.minecraft.tileentity.d d3 = null;
            if (this.bhc.dzu == cf.dzy) {
                object2 = this.bhc.dg();
                object = this.bgF.L((net.minecraft.util.b)object2).df();
                if (((Block)object).xb() == Material.beo) {
                    return;
                }
                d2 = ((Block)object).e(this.bgF, (net.minecraft.util.b)object2);
                if (d2 == null) {
                    return;
                }
                if (bl2 && bp.isCtrlKeyDown()) {
                    d3 = this.bgF.K((net.minecraft.util.b)object2);
                }
                Block block = d2 instanceof af && !((Block)object).xH() ? Block.f(d2) : object;
                n2 = block.f(this.bgF, (net.minecraft.util.b)object2);
                bl3 = d2.ads();
            } else {
                if (this.bhc.dzu != cf.dzz || this.bhc.dzw == null || !bl2) {
                    return;
                }
                if (this.bhc.dzw instanceof t) {
                    d2 = Items.cQr;
                } else if (this.bhc.dzw instanceof m) {
                    d2 = Items.cSr;
                } else if (this.bhc.dzw instanceof net.minecraft.entity.item.j) {
                    object2 = (net.minecraft.entity.item.j)this.bhc.dzw;
                    object = ((net.minecraft.entity.item.j)object2).Yt();
                    if (object == null) {
                        d2 = Items.cRT;
                    } else {
                        d2 = ((net.minecraft.item.co)object).bP();
                        n2 = ((net.minecraft.item.co)object).yc();
                        bl3 = true;
                    }
                } else if (this.bhc.dzw instanceof k) {
                    object2 = (k)this.bhc.dzw;
                    switch (((k)object2).Wm()) {
                        case cCI: {
                            d2 = Items.cQS;
                            break;
                        }
                        case cCH: {
                            d2 = Items.cQR;
                            break;
                        }
                        case cCJ: {
                            d2 = Items.cSl;
                            break;
                        }
                        case cCL: {
                            d2 = Items.cSm;
                            break;
                        }
                        case cCM: {
                            d2 = Items.cSt;
                            break;
                        }
                        default: {
                            d2 = Items.cQD;
                            break;
                        }
                    }
                } else if (this.bhc.dzw instanceof net.minecraft.entity.item.b) {
                    d2 = Items.cQI;
                } else if (this.bhc.dzw instanceof net.minecraft.entity.item.a) {
                    d2 = Items.cSn;
                } else {
                    d2 = Items.cRN;
                    n2 = net.minecraft.entity.n.ac(this.bhc.dzw);
                    bl3 = true;
                    if (!net.minecraft.entity.n.ctF.containsKey(n2)) {
                        return;
                    }
                }
            }
            object2 = this.bgK.cHV;
            if (d3 == null) {
                ((g)object2).a(d2, n2, bl3, bl2);
            } else {
                object = this.a(d2, n2, d3);
                ((g)object2).g(((g)object2).cJE, (net.minecraft.item.co)object);
            }
            if (bl2) {
                int n3 = this.bgK.cHX.cSK.size() - 9 + ((g)object2).cJE;
                this.bgu.a(((g)object2).fi(((g)object2).cJE), n3);
            }
        }
    }

    private net.minecraft.item.co a(net.minecraft.item.d d2, int n2, net.minecraft.tileentity.d d3) {
        net.minecraft.item.co co2 = new net.minecraft.item.co(d2, 1, n2);
        n n3 = new n();
        d3.b(n3);
        if (d2 == Items.cSb && n3.eD("Owner")) {
            n n4 = n3.eN("Owner");
            n n5 = new n();
            n5.b("SkullOwner", n4);
            co2.u(n5);
        } else {
            co2.a("BlockEntityTag", n3);
            n n6 = new n();
            v v2 = new v();
            v2.a(new net.minecraft.nbt.z("(+NBT)"));
            n6.b("Lore", v2);
            co2.a("display", n6);
        }
        return co2;
    }

    public net.minecraft.crash.a c(net.minecraft.crash.a a2) {
        a2.SJ().a("Launched Version", () -> this.bhh);
        a2.SJ().a("LWJGL", Sys::getVersion);
        a2.SJ().a("OpenGL", () -> GL11.glGetString((int)7937) + " GL version " + GL11.glGetString((int)7938) + ", " + GL11.glGetString((int)7936));
        a2.SJ().a("GL Caps", OpenGlHelper::Ks);
        a2.SJ().a("Using VBOs", () -> this.aIY.cgH ? "Yes" : "No");
        a2.SJ().a("Is Modded", () -> {
            String string = b.An();
            return !string.equals("vanilla") ? "Definitely; Client brand changed to '" + string + "'" : (d.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
        });
        a2.SJ().a("Type", () -> "Client (map_client.txt)");
        a2.SJ().a("Resource Packs", () -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : this.aIY.ccK) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string);
                if (!this.aIY.cgy.contains(string)) continue;
                stringBuilder.append(" (incompatible)");
            }
            return stringBuilder.toString();
        });
        a2.SJ().a("Current Language", () -> this.bhD.Pr().toString());
        a2.SJ().a("Profiler Position", () -> this.bhw.dhU ? this.bhw.ajw() : "N/A (disabled)");
        a2.SJ().a("CPU", OpenGlHelper::Kz);
        if (this.bgF != null) {
            this.bgF.d(a2);
        }
        return a2;
    }

    public static d AZ() {
        return bgt;
    }

    public ListenableFuture<Object> Ba() {
        return this.f(this::Az);
    }

    @Override
    public void a(net.minecraft.profiler.b b2) {
        b2.c("fps", bhk);
        b2.c("vsync_enabled", this.aIY.cgG);
        b2.c("display_frequency", Display.getDisplayMode().getFrequency());
        b2.c("display_type", this.bgv ? "fullscreen" : "windowed");
        b2.c("run_time", (MinecraftServer.alN() - b2.ajt()) / 60L * 1000L);
        b2.c("current_action", this.Bb());
        String string = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
        b2.c("endianness", string);
        b2.c("resource_packs", this.bhC.PJ().size());
        int n2 = 0;
        for (ResourcePackRepository$Entry resourcePackRepository$Entry : this.bhC.PJ()) {
            b2.c("resource_pack[" + n2++ + "]", resourcePackRepository$Entry.Pm());
        }
        if (this.bgY != null && this.bgY.Bi() != null) {
            b2.c("snooper_partner", this.bgY.Bi().ajs());
        }
    }

    private String Bb() {
        return this.bgY != null ? (this.bgY.amb() ? "hosting_lan" : "singleplayer") : (this.bgs != null ? (this.bgs.HG() ? "playing_lan" : "multiplayer") : "out_of_game");
    }

    @Override
    public void b(net.minecraft.profiler.b b2) {
        b2.d("opengl_version", GL11.glGetString((int)7938));
        b2.d("opengl_vendor", GL11.glGetString((int)7936));
        b2.d("client_brand", b.An());
        b2.d("launched_version", this.bhh);
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        b2.d("gl_caps[ARB_arrays_of_arrays]", contextCapabilities.GL_ARB_arrays_of_arrays);
        b2.d("gl_caps[ARB_base_instance]", contextCapabilities.GL_ARB_base_instance);
        b2.d("gl_caps[ARB_blend_func_extended]", contextCapabilities.GL_ARB_blend_func_extended);
        b2.d("gl_caps[ARB_clear_buffer_object]", contextCapabilities.GL_ARB_clear_buffer_object);
        b2.d("gl_caps[ARB_color_buffer_float]", contextCapabilities.GL_ARB_color_buffer_float);
        b2.d("gl_caps[ARB_compatibility]", contextCapabilities.GL_ARB_compatibility);
        b2.d("gl_caps[ARB_compressed_texture_pixel_storage]", contextCapabilities.GL_ARB_compressed_texture_pixel_storage);
        b2.d("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        b2.d("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        b2.d("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        b2.d("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        b2.d("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        b2.d("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        b2.d("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        b2.d("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        b2.d("gl_caps[ARB_depth_clamp]", contextCapabilities.GL_ARB_depth_clamp);
        b2.d("gl_caps[ARB_depth_texture]", contextCapabilities.GL_ARB_depth_texture);
        b2.d("gl_caps[ARB_draw_buffers]", contextCapabilities.GL_ARB_draw_buffers);
        b2.d("gl_caps[ARB_draw_buffers_blend]", contextCapabilities.GL_ARB_draw_buffers_blend);
        b2.d("gl_caps[ARB_draw_elements_base_vertex]", contextCapabilities.GL_ARB_draw_elements_base_vertex);
        b2.d("gl_caps[ARB_draw_indirect]", contextCapabilities.GL_ARB_draw_indirect);
        b2.d("gl_caps[ARB_draw_instanced]", contextCapabilities.GL_ARB_draw_instanced);
        b2.d("gl_caps[ARB_explicit_attrib_location]", contextCapabilities.GL_ARB_explicit_attrib_location);
        b2.d("gl_caps[ARB_explicit_uniform_location]", contextCapabilities.GL_ARB_explicit_uniform_location);
        b2.d("gl_caps[ARB_fragment_layer_viewport]", contextCapabilities.GL_ARB_fragment_layer_viewport);
        b2.d("gl_caps[ARB_fragment_program]", contextCapabilities.GL_ARB_fragment_program);
        b2.d("gl_caps[ARB_fragment_shader]", contextCapabilities.GL_ARB_fragment_shader);
        b2.d("gl_caps[ARB_fragment_program_shadow]", contextCapabilities.GL_ARB_fragment_program_shadow);
        b2.d("gl_caps[ARB_framebuffer_object]", contextCapabilities.GL_ARB_framebuffer_object);
        b2.d("gl_caps[ARB_framebuffer_sRGB]", contextCapabilities.GL_ARB_framebuffer_sRGB);
        b2.d("gl_caps[ARB_geometry_shader4]", contextCapabilities.GL_ARB_geometry_shader4);
        b2.d("gl_caps[ARB_gpu_shader5]", contextCapabilities.GL_ARB_gpu_shader5);
        b2.d("gl_caps[ARB_half_float_pixel]", contextCapabilities.GL_ARB_half_float_pixel);
        b2.d("gl_caps[ARB_half_float_vertex]", contextCapabilities.GL_ARB_half_float_vertex);
        b2.d("gl_caps[ARB_instanced_arrays]", contextCapabilities.GL_ARB_instanced_arrays);
        b2.d("gl_caps[ARB_map_buffer_alignment]", contextCapabilities.GL_ARB_map_buffer_alignment);
        b2.d("gl_caps[ARB_map_buffer_range]", contextCapabilities.GL_ARB_map_buffer_range);
        b2.d("gl_caps[ARB_multisample]", contextCapabilities.GL_ARB_multisample);
        b2.d("gl_caps[ARB_multitexture]", contextCapabilities.GL_ARB_multitexture);
        b2.d("gl_caps[ARB_occlusion_query2]", contextCapabilities.GL_ARB_occlusion_query2);
        b2.d("gl_caps[ARB_pixel_buffer_object]", contextCapabilities.GL_ARB_pixel_buffer_object);
        b2.d("gl_caps[ARB_seamless_cube_map]", contextCapabilities.GL_ARB_seamless_cube_map);
        b2.d("gl_caps[ARB_shader_objects]", contextCapabilities.GL_ARB_shader_objects);
        b2.d("gl_caps[ARB_shader_stencil_export]", contextCapabilities.GL_ARB_shader_stencil_export);
        b2.d("gl_caps[ARB_shader_texture_lod]", contextCapabilities.GL_ARB_shader_texture_lod);
        b2.d("gl_caps[ARB_shadow]", contextCapabilities.GL_ARB_shadow);
        b2.d("gl_caps[ARB_shadow_ambient]", contextCapabilities.GL_ARB_shadow_ambient);
        b2.d("gl_caps[ARB_stencil_texturing]", contextCapabilities.GL_ARB_stencil_texturing);
        b2.d("gl_caps[ARB_sync]", contextCapabilities.GL_ARB_sync);
        b2.d("gl_caps[ARB_tessellation_shader]", contextCapabilities.GL_ARB_tessellation_shader);
        b2.d("gl_caps[ARB_texture_border_clamp]", contextCapabilities.GL_ARB_texture_border_clamp);
        b2.d("gl_caps[ARB_texture_buffer_object]", contextCapabilities.GL_ARB_texture_buffer_object);
        b2.d("gl_caps[ARB_texture_cube_map]", contextCapabilities.GL_ARB_texture_cube_map);
        b2.d("gl_caps[ARB_texture_cube_map_array]", contextCapabilities.GL_ARB_texture_cube_map_array);
        b2.d("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities.GL_ARB_texture_non_power_of_two);
        b2.d("gl_caps[ARB_uniform_buffer_object]", contextCapabilities.GL_ARB_uniform_buffer_object);
        b2.d("gl_caps[ARB_vertex_blend]", contextCapabilities.GL_ARB_vertex_blend);
        b2.d("gl_caps[ARB_vertex_buffer_object]", contextCapabilities.GL_ARB_vertex_buffer_object);
        b2.d("gl_caps[ARB_vertex_program]", contextCapabilities.GL_ARB_vertex_program);
        b2.d("gl_caps[ARB_vertex_shader]", contextCapabilities.GL_ARB_vertex_shader);
        b2.d("gl_caps[EXT_bindable_uniform]", contextCapabilities.GL_EXT_bindable_uniform);
        b2.d("gl_caps[EXT_blend_equation_separate]", contextCapabilities.GL_EXT_blend_equation_separate);
        b2.d("gl_caps[EXT_blend_func_separate]", contextCapabilities.GL_EXT_blend_func_separate);
        b2.d("gl_caps[EXT_blend_minmax]", contextCapabilities.GL_EXT_blend_minmax);
        b2.d("gl_caps[EXT_blend_subtract]", contextCapabilities.GL_EXT_blend_subtract);
        b2.d("gl_caps[EXT_draw_instanced]", contextCapabilities.GL_EXT_draw_instanced);
        b2.d("gl_caps[EXT_framebuffer_multisample]", contextCapabilities.GL_EXT_framebuffer_multisample);
        b2.d("gl_caps[EXT_framebuffer_object]", contextCapabilities.GL_EXT_framebuffer_object);
        b2.d("gl_caps[EXT_framebuffer_sRGB]", contextCapabilities.GL_EXT_framebuffer_sRGB);
        b2.d("gl_caps[EXT_geometry_shader4]", contextCapabilities.GL_EXT_geometry_shader4);
        b2.d("gl_caps[EXT_gpu_program_parameters]", contextCapabilities.GL_EXT_gpu_program_parameters);
        b2.d("gl_caps[EXT_gpu_shader4]", contextCapabilities.GL_EXT_gpu_shader4);
        b2.d("gl_caps[EXT_multi_draw_arrays]", contextCapabilities.GL_EXT_multi_draw_arrays);
        b2.d("gl_caps[EXT_packed_depth_stencil]", contextCapabilities.GL_EXT_packed_depth_stencil);
        b2.d("gl_caps[EXT_paletted_texture]", contextCapabilities.GL_EXT_paletted_texture);
        b2.d("gl_caps[EXT_rescale_normal]", contextCapabilities.GL_EXT_rescale_normal);
        b2.d("gl_caps[EXT_separate_shader_objects]", contextCapabilities.GL_EXT_separate_shader_objects);
        b2.d("gl_caps[EXT_shader_image_load_store]", contextCapabilities.GL_EXT_shader_image_load_store);
        b2.d("gl_caps[EXT_shadow_funcs]", contextCapabilities.GL_EXT_shadow_funcs);
        b2.d("gl_caps[EXT_shared_texture_palette]", contextCapabilities.GL_EXT_shared_texture_palette);
        b2.d("gl_caps[EXT_stencil_clear_tag]", contextCapabilities.GL_EXT_stencil_clear_tag);
        b2.d("gl_caps[EXT_stencil_two_side]", contextCapabilities.GL_EXT_stencil_two_side);
        b2.d("gl_caps[EXT_stencil_wrap]", contextCapabilities.GL_EXT_stencil_wrap);
        b2.d("gl_caps[EXT_texture_3d]", contextCapabilities.GL_EXT_texture_3d);
        b2.d("gl_caps[EXT_texture_array]", contextCapabilities.GL_EXT_texture_array);
        b2.d("gl_caps[EXT_texture_buffer_object]", contextCapabilities.GL_EXT_texture_buffer_object);
        b2.d("gl_caps[EXT_texture_integer]", contextCapabilities.GL_EXT_texture_integer);
        b2.d("gl_caps[EXT_texture_lod_bias]", contextCapabilities.GL_EXT_texture_lod_bias);
        b2.d("gl_caps[EXT_texture_sRGB]", contextCapabilities.GL_EXT_texture_sRGB);
        b2.d("gl_caps[EXT_vertex_shader]", contextCapabilities.GL_EXT_vertex_shader);
        b2.d("gl_caps[EXT_vertex_weighting]", contextCapabilities.GL_EXT_vertex_weighting);
        b2.d("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger((int)35658));
        GL11.glGetError();
        b2.d("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger((int)35657));
        GL11.glGetError();
        b2.d("gl_caps[gl_max_vertex_attribs]", GL11.glGetInteger((int)34921));
        GL11.glGetError();
        b2.d("gl_caps[gl_max_vertex_texture_image_units]", GL11.glGetInteger((int)35660));
        GL11.glGetError();
        b2.d("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)34930));
        GL11.glGetError();
        b2.d("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)35071));
        GL11.glGetError();
        b2.d("gl_max_texture_size", d.Bc());
    }

    public static int Bc() {
        for (int i2 = 16384; i2 > 0; i2 >>= 1) {
            GL11.glTexImage2D((int)32868, (int)0, (int)6408, (int)i2, (int)i2, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            int n2 = GL11.glGetTexLevelParameteri((int)32868, (int)0, (int)4096);
            if (n2 == 0) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public boolean Bd() {
        return this.aIY.cgE;
    }

    public void b(net.minecraft.client.multiplayer.f f2) {
        this.bgs = f2;
    }

    public net.minecraft.client.multiplayer.f Be() {
        return this.bgs;
    }

    public boolean Bf() {
        return this.bhv;
    }

    public boolean isSingleplayer() {
        return this.bhv && this.bgY != null;
    }

    public IntegratedServer Bg() {
        return this.bgY;
    }

    public static void Bh() {
        IntegratedServer integratedServer;
        if (bgt != null && (integratedServer = bgt.Bg()) != null) {
            integratedServer.stopServer();
        }
    }

    public net.minecraft.profiler.b Bi() {
        return this.bgE;
    }

    public static long Bj() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }

    public boolean Bk() {
        return this.bgv;
    }

    public cp Bl() {
        return this.bgO;
    }

    public void a(cp cp2) {
        this.bgO = cp2;
    }

    public cv Bm() {
        return this.bgC;
    }

    public PropertyMap Bn() {
        return this.bgq;
    }

    public PropertyMap Bo() {
        if (this.bgr.isEmpty()) {
            GameProfile gameProfile = this.BA().fillProfileProperties(this.bgO.afK(), false);
            this.bgr.putAll((Multimap)gameProfile.getProperties());
        }
        return this.bgr;
    }

    public Proxy Bp() {
        return this.bhi;
    }

    public TextureManager Bq() {
        return this.aIK;
    }

    public IResourceManager Br() {
        return this.bhy;
    }

    public ResourcePackRepository Bs() {
        return this.bhC;
    }

    public LanguageManager Bt() {
        return this.bhD;
    }

    public TextureMap Bu() {
        return this.bhF;
    }

    public boolean Bv() {
        return this.bhs;
    }

    public boolean Bw() {
        return this.bgP;
    }

    public SoundHandler Bx() {
        return this.bhG;
    }

    public MusicTicker$MusicType By() {
        return this.bgK != null ? (this.bgK.baU.dDl instanceof ae ? MusicTicker$MusicType.bit : (this.bgK.baU.dDl instanceof ad ? (net.minecraft.entity.boss.a.cAY != null && net.minecraft.entity.boss.a.cAX > 0 ? MusicTicker$MusicType.biu : MusicTicker$MusicType.biv) : (this.bgK.cIt.cJM && this.bgK.cIt.cJL ? MusicTicker$MusicType.bir : MusicTicker$MusicType.biq))) : MusicTicker$MusicType.bip;
    }

    public void Bz() {
        int n2;
        int n3 = n2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
        if (!(n2 == 0 || Keyboard.isRepeatEvent() || this.bgR instanceof net.minecraft.client.gui.j && ((net.minecraft.client.gui.j)this.bgR).sk > d.Bj() - 20L || !Keyboard.getEventKeyState())) {
            if (n2 == this.aIY.chE.cO()) {
                this.AP();
            } else if (n2 == this.aIY.chB.cO()) {
                this.bha.Ey().c(co.a(this.bhf, this.bgz, this.bgA, this.bhE));
            }
        }
    }

    public MinecraftSessionService BA() {
        return this.bhJ;
    }

    public SkinManager BB() {
        return this.bhK;
    }

    public net.minecraft.entity.c BC() {
        return this.bgL;
    }

    public void C(net.minecraft.entity.c c2) {
        this.bgL = c2;
        this.bgT.K(c2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <V> ListenableFuture<V> a(Callable<V> callable) {
        Validate.notNull(callable);
        if (!this.BD()) {
            ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(callable);
            Queue<FutureTask<?>> queue = this.bhL;
            synchronized (queue) {
                this.bhL.add((FutureTask<?>)listenableFutureTask);
                return listenableFutureTask;
            }
        }
        try {
            return Futures.immediateFuture(callable.call());
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    @Override
    public ListenableFuture<Object> f(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.a(Executors.callable(runnable));
    }

    @Override
    public boolean BD() {
        return Thread.currentThread() == this.bhM;
    }

    public BlockRendererDispatcher BE() {
        return this.bhO;
    }

    public RenderManager BF() {
        return this.bgH;
    }

    public RenderItem BG() {
        return this.bgI;
    }

    public ItemRenderer BH() {
        return this.bgJ;
    }

    public static int BI() {
        return bhk;
    }

    public ax BJ() {
        return this.bhp;
    }

    public static Map<String, String> BK() {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", d.AZ().Bl().bX());
        hashMap.put("X-Minecraft-UUID", d.AZ().Bl().getPlayerID());
        hashMap.put("X-Minecraft-Version", "1.8.9");
        return hashMap;
    }

    public boolean BL() {
        return this.bgB;
    }

    public void R(boolean bl2) {
        this.bgB = bl2;
    }

    public long BM() {
        return this.bhr;
    }

    public void BN() {
        if (this.bgF == null) {
            return;
        }
        rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.community.f("Main menu").aJz());
        boolean bl2 = this.Bf();
        this.bgF.HP();
        this.a((j)null);
        if (bl2) {
            this.a(new adu());
        } else {
            this.a(new aq(new adu()));
        }
    }
}

