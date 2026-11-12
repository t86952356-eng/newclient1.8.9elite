/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.gson.JsonSyntaxException
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
package net.minecraft.client.renderer;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.ait;
import hackclient.rise.aiv;
import hackclient.rise.aiz;
import hackclient.rise.akg;
import hackclient.rise.fr;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.fu;
import hackclient.rise.ga;
import hackclient.rise.gi;
import hackclient.rise.lz;
import hackclient.rise.tn;
import hackclient.rise.we;
import hackclient.rise.xc;
import hackclient.rise.xg;
import hackclient.rise.xi;
import hackclient.rise.xt;
import java.awt.Color;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.gui.am;
import net.minecraft.client.gui.cx;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.f;
import net.minecraft.client.gui.r;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.crash.i;
import net.minecraft.enchantment.l;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.item.j;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.passive.b;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.ah;
import net.minecraft.util.as;
import net.minecraft.util.av;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.ca;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.util.g;
import net.minecraft.util.v;
import net.minecraft.world.ac;
import net.minecraft.world.ao;
import net.minecraft.world.w;
import net.optifine.au;
import net.optifine.bd;
import net.optifine.gui.c;
import net.optifine.s;
import net.optifine.util.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class EntityRenderer
implements aea,
IResourceManagerReloadListener {
    private static final Logger bIM = LogManager.getLogger();
    private static final cm bIN = new cm("textures/environment/rain.png");
    private static final cm bIO = new cm("textures/environment/snow.png");
    private static final cm bIP = new cm("textures/environment/snow_light.png");
    private static final cm bIQ = new cm("textures/environment/nether_particles.png");
    public static boolean bIR;
    public static int bIS;
    private final d bIT;
    private final IResourceManager bIU;
    private final Random bIV = new Random();
    private float bIW;
    public ItemRenderer bgJ;
    private final cx bIX;
    private int bIY;
    private net.minecraft.entity.c bgM;
    private ca bIZ = new ca();
    private ca bJa = new ca();
    private final float bJb = 4.0f;
    public static float bJc;
    public static float bJd;
    private float bJe = 4.0f;
    private float bJf;
    private float bJg;
    private float bJh;
    private float bJi;
    private float bJj;
    private float bJk;
    private float bJl;
    private float bJm;
    private float bJn;
    private boolean bJo;
    private final boolean bJp = true;
    private final boolean bJq = true;
    private long bhU = d.Bj();
    private long bJr;
    private final DynamicTexture bJs;
    private final int[] bJt;
    private final cm bJu;
    private boolean bJv;
    private float bJw;
    private float bJx;
    private int bJy;
    private final float[] bJz = new float[1024];
    private final float[] bJA = new float[1024];
    private final FloatBuffer bJB = GLAllocation.cG(16);
    public float bJC;
    public float bJD;
    public float bJE;
    private float bJF;
    private float bJG;
    private final int bJH = 0;
    private final boolean bJI = false;
    private final double bJJ = 1.0;
    private double bJK;
    private double bJL;
    private net.minecraft.client.shader.d bJM;
    private static final cm[] bJN;
    public static final int bJO;
    private int bJP;
    private boolean bJQ = false;
    public int asz = 0;
    private boolean Mq = false;
    private w bJR = null;
    private final boolean bJS = false;
    public boolean bJT = false;
    private float bJU = 128.0f;
    private long bJV = 0L;
    private int bJW = 0;
    private int bJX = 0;
    private int bJY = 0;
    private float bJZ = 0.0f;
    private float bKa = 0.0f;
    private final net.minecraft.client.shader.d[] bKb = new net.minecraft.client.shader.d[10];
    private boolean bKc = false;
    private rip.vantage.commons.util.time.a bKd = new rip.vantage.commons.util.time.a();
    private net.minecraft.client.shader.a aCv = new net.minecraft.client.shader.a(1, 1, false);
    private static final Tessellator bKe;
    private static final WorldRenderer bKf;

    public EntityRenderer(d d2, IResourceManager iResourceManager) {
        this.bJP = bJO;
        this.bIT = d2;
        this.bIU = iResourceManager;
        this.bgJ = d2.BH();
        this.bIX = new cx(d2.Bq());
        this.bJs = new DynamicTexture(16, 16);
        this.bJu = d2.Bq().a("lightMap", this.bJs);
        this.bJt = this.bJs.NM();
        this.bJM = null;
        for (int i2 = 0; i2 < 32; ++i2) {
            for (int i3 = 0; i3 < 32; ++i3) {
                float f2 = i3 - 16;
                float f3 = i2 - 16;
                float f4 = bt.bK(f2 * f2 + f3 * f3);
                this.bJz[i2 << 5 | i3] = -f3 / f4;
                this.bJA[i2 << 5 | i3] = f2 / f4;
            }
        }
    }

    public boolean Jc() {
        return OpenGlHelper.bNi && this.bJM != null;
    }

    public void Jd() {
        if (this.bJM != null) {
            this.bJM.Rt();
        }
        this.bJM = null;
        this.bJP = bJO;
    }

    public void Je() {
        this.bJQ = !this.bJQ;
    }

    public void K(net.minecraft.entity.c c2) {
        if (OpenGlHelper.bNi) {
            if (this.bJM != null) {
                this.bJM.Rt();
            }
            this.bJM = null;
            if (c2 instanceof net.minecraft.entity.monster.d) {
                this.h(new cm("shaders/post/creeper.json"));
            } else if (c2 instanceof ap) {
                this.h(new cm("shaders/post/spider.json"));
            } else if (c2 instanceof net.minecraft.entity.monster.e) {
                this.h(new cm("shaders/post/invert.json"));
            } else if (net.optifine.reflect.g.epf.aDA()) {
                net.optifine.reflect.g.g(net.optifine.reflect.g.epf, c2, this);
            }
        }
    }

    public void Jf() {
        if (OpenGlHelper.bNi && this.bIT.BC() instanceof net.minecraft.entity.player.a) {
            if (this.bJM != null) {
                this.bJM.Rt();
            }
            this.bJP = (this.bJP + 1) % (bJN.length + 1);
            if (this.bJP != bJO) {
                this.h(bJN[this.bJP]);
            } else {
                this.bJM = null;
            }
        }
    }

    private void h(cm cm2) {
        if (OpenGlHelper.Ky()) {
            try {
                this.bJM = new net.minecraft.client.shader.d(this.bIT.Bq(), this.bIU, this.bIT.Aw(), cm2);
                this.bJM.al(this.bIT.bgz, this.bIT.bgA);
                this.bJQ = true;
            }
            catch (JsonSyntaxException | IOException throwable) {
                bIM.warn("Failed to load shader: " + String.valueOf(cm2), throwable);
                this.bJP = bJO;
                this.bJQ = false;
            }
        }
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        if (this.bJM != null) {
            this.bJM.Rt();
        }
        this.bJM = null;
        if (this.bJP != bJO) {
            this.h(bJN[this.bJP]);
        } else {
            this.K(this.bIT.BC());
        }
    }

    public void Jg() {
        if (OpenGlHelper.bNi && net.minecraft.client.shader.e.Rx() == null) {
            net.minecraft.client.shader.e.Rw();
        }
        this.Ji();
        this.Jl();
        this.bJF = this.bJG;
        this.bJe = this.bJb;
        if (this.bIT.aIY.chT) {
            float f2 = this.bIT.aIY.cgq * 0.6f + 0.2f;
            float f3 = f2 * f2 * f2 * 8.0f;
            this.bJh = this.bIZ.y(this.bJf, 0.05f * f3);
            this.bJi = this.bJa.y(this.bJg, 0.05f * f3);
            this.bJj = 0.0f;
            this.bJf = 0.0f;
            this.bJg = 0.0f;
        } else {
            this.bJh = 0.0f;
            this.bJi = 0.0f;
            this.bIZ.aX();
            this.bJa.aX();
        }
        if (this.bIT.BC() == null) {
            this.bIT.C(this.bIT.bgK);
        }
        net.minecraft.entity.c c2 = this.bIT.BC();
        double d2 = c2.gW;
        double d3 = c2.gX + (double)c2.getEyeHeight();
        double d4 = c2.gY;
        float f4 = this.bIT.bgF.aR(new net.minecraft.util.b(d2, d3, d4));
        float f5 = (float)this.bIT.aIY.bOt / 16.0f;
        f5 = bt.I(f5, 0.0f, 1.0f);
        float f6 = f4 * (1.0f - f5) + f5;
        this.bJG += (f6 - this.bJG) * 0.1f;
        ++this.bIY;
        this.bgJ.Kn();
        this.Jn();
        this.bJn = this.bJm;
        if (net.minecraft.entity.boss.a.cAZ) {
            this.bJm += 0.05f;
            if (this.bJm > 1.0f) {
                this.bJm = 1.0f;
            }
            net.minecraft.entity.boss.a.cAZ = false;
        } else if (this.bJm > 0.0f) {
            this.bJm -= 0.0125f;
        }
    }

    public net.minecraft.client.shader.d Jh() {
        return this.bJM;
    }

    public void L(int n2, int n3) {
        if (OpenGlHelper.bNi) {
            if (this.bJM != null) {
                this.bJM.al(n2, n3);
            }
            this.bIT.bgG.Z(n2, n3);
        }
    }

    public void al(float f2) {
        net.minecraft.entity.c c2 = this.bIT.BC();
        if (c2 != null && this.bIT.bgF != null) {
            this.bIT.bhw.eY("pick");
            this.bIT.bgM = null;
            double d2 = this.bIT.bgu.Hr();
            this.bIT.bhc = c2.b(d2, f2);
            double d3 = d2;
            da da2 = c2.aQ(f2);
            boolean bl2 = false;
            double d4 = 3.0;
            float f3 = 0.0f;
            fr fr2 = new fr(d4, f3);
            a.a.e().d(fr2);
            d4 = fr2.dA();
            f3 = fr2.dB();
            if (fr2.dC() != null) {
                this.bIT.bhc = fr2.dC();
                return;
            }
            if (this.bIT.bgu.Hy()) {
                d2 = 6.0;
                d3 = 6.0;
            } else if (d2 > 3.0) {
                bl2 = true;
            }
            if (d4 > 3.0001) {
                bl2 = true;
            }
            if (this.bIT.bhc != null) {
                d3 = this.bIT.bhc.daS.x(da2);
            }
            if ((this.bIT.bhc == null || this.bIT.bhc.dzu == cf.dzx) && d4 > d3) {
                d3 = d4;
            }
            da da3 = c2.O(f2);
            double d5 = Math.max(d2, d4);
            da da4 = da2.al(da3.dAG * d5, da3.dAH * d5, da3.dAI * d5);
            this.bgM = null;
            da da5 = null;
            float f4 = 1.0f;
            List<net.minecraft.entity.c> list = this.bIT.bgF.a(c2, c2.Us().ac(da3.dAG * d5, da3.dAH * d5, da3.dAI * d5).ad(1.0, 1.0, 1.0), (Predicate<? super net.minecraft.entity.c>)Predicates.and(ah.dvJ, net.minecraft.entity.c::TO));
            double d6 = d3;
            for (net.minecraft.entity.c c3 : list) {
                double d7;
                float f5 = c3.TX() + (c2 instanceof net.minecraft.entity.player.a && !c2.isInvisible() ? f3 : 0.0f);
                net.minecraft.util.a a2 = c3.Us().ad(f5, f5, f5);
                ce ce2 = a2.c(da2, da4);
                if (a2.o(da2)) {
                    if (!(d6 >= 0.0)) continue;
                    this.bgM = c3;
                    da5 = ce2 == null ? da2 : ce2.daS;
                    d6 = 0.0;
                    continue;
                }
                if (ce2 == null || !((d7 = da2.x(ce2.daS)) < d6) && d6 != 0.0) continue;
                boolean bl3 = false;
                if (net.optifine.reflect.g.eox.aDA()) {
                    bl3 = net.optifine.reflect.g.b((Object)c3, net.optifine.reflect.g.eox, new Object[0]);
                }
                if (!bl3 && c3 == c2.crC) {
                    if (d6 != 0.0) continue;
                    this.bgM = c3;
                    da5 = ce2.daS;
                    continue;
                }
                this.bgM = c3;
                da5 = ce2.daS;
                d6 = d7;
            }
            if (this.bgM != null && bl2 && da5 != null && da2.x(da5) > d4) {
                this.bgM = null;
                this.bIT.bhc = new ce(cf.dzx, da5, null, new net.minecraft.util.b(da5));
            }
            if (this.bgM != null && (d6 < d3 || this.bIT.bhc == null)) {
                this.bIT.bhc = new ce(this.bgM, da5);
                if (this.bgM instanceof net.minecraft.entity.r || this.bgM instanceof j) {
                    this.bIT.bgM = this.bgM;
                }
            }
            this.bIT.bhw.ajv();
        }
    }

    private void Ji() {
        float f2 = 1.0f;
        if (this.bIT.BC() instanceof net.minecraft.client.entity.a) {
            net.minecraft.client.entity.a a2 = (net.minecraft.client.entity.a)this.bIT.BC();
            f2 = a2.Dg();
            tn tn2 = a.a.g().c(tn.class);
            if (tn2 != null && tn2.kx()) {
                e e2 = a2.a(aj.cwp);
                double d2 = e2.XB();
                if (!a2.isSprinting()) {
                    d2 *= 1.300000011920929;
                }
                if (a2.a(net.minecraft.potion.a.dgw)) {
                    int n2 = a2.b(net.minecraft.potion.a.dgw).ajf() + 1;
                    d2 /= 1.0 + (double)n2 * (double)0.2f;
                }
                float f3 = a2.cIt.cJK ? 1.1f : 1.0f;
                f3 = (float)((double)f3 * ((d2 / (double)a2.cIt.getWalkSpeed() + 1.0) / 2.0));
                if (a2.cIt.getWalkSpeed() == 0.0f || Float.isNaN(f3) || Float.isInfinite(f3)) {
                    f3 = 1.0f;
                }
                f2 = Math.max(f2, f3);
            }
        }
        this.bJl = this.bJk;
        this.bJk += (f2 - this.bJk) * 0.5f;
        if (this.bJk > 1.5f) {
            this.bJk = 1.5f;
        }
        if (this.bJk < 0.1f) {
            this.bJk = 0.1f;
        }
    }

    private float b(float f2, boolean bl2) {
        Block block;
        Objects.requireNonNull(this);
        net.minecraft.entity.c c2 = this.bIT.BC();
        float f3 = 70.0f;
        if (bl2) {
            f3 = this.bIT.aIY.chV;
            if (net.minecraft.src.a.aoO()) {
                f3 *= this.bJl + (this.bJk - this.bJl) * f2;
            }
        }
        boolean bl3 = false;
        if (this.bIT.bgR == null) {
            bl3 = net.minecraft.client.settings.a.a(this.bIT.aIY.cjH);
        }
        if (bl3) {
            if (!net.minecraft.src.a.doh) {
                net.minecraft.src.a.doh = true;
                this.bIT.aIY.chT = true;
                this.bIT.bgG.bOH = true;
            }
            f3 /= 4.0f;
        } else if (net.minecraft.src.a.doh) {
            net.minecraft.src.a.doh = false;
            this.bIT.aIY.chT = false;
            this.bIZ = new ca();
            this.bJa = new ca();
            this.bIT.bgG.bOH = true;
        }
        if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).getHealth() <= 0.0f) {
            float f4 = (float)((net.minecraft.entity.r)c2).cuv + f2;
            f3 /= (1.0f - 500.0f / (f4 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((block = ActiveRenderInfo.a(this.bIT.bgF, c2, f2)).xb() == Material.bev) {
            f3 = f3 * 60.0f / 70.0f;
        }
        return net.optifine.reflect.g.epc.aDA() ? net.optifine.reflect.g.d(net.optifine.reflect.g.epc, this, c2, block, Float.valueOf(f2), Float.valueOf(f3)) : f3;
    }

    private void am(float f2) {
        if (this.bIT.BC() instanceof net.minecraft.entity.r) {
            xg xg2 = a.a.g().c(xg.class);
            net.minecraft.entity.r r2 = (net.minecraft.entity.r)this.bIT.BC();
            float f3 = (float)r2.cus - f2;
            if (!xg2.isEnabled() && (!this.e(lz.class).isEnabled() || this.bIT.bgK.tR >= 10 || !((akg)this.e(lz.class).DD.wD()).getName().equals("Watchdog")) || xg2.isEnabled() && this.e(lz.class).isEnabled() && this.bIT.bgK.tR > 10 && ((akg)this.e(lz.class).DD.wD()).getName().equals("Watchdog")) {
                float f4;
                if (r2.getHealth() <= 0.0f) {
                    f4 = (float)r2.cuv + f2;
                    GlStateManager.d(40.0f - 8000.0f / (f4 + 200.0f), 0.0f, 0.0f, 1.0f);
                }
                if (f3 < 0.0f) {
                    return;
                }
                f3 /= (float)r2.cut;
                f3 = bt.bx(f3 * f3 * f3 * f3 * (float)Math.PI);
                f4 = xg2.isEnabled() ? 0.0f : r2.cuu;
                GlStateManager.d(-f4, 0.0f, 1.0f, 0.0f);
                GlStateManager.d(-f3 * 14.0f, 0.0f, 0.0f, xg2.isEnabled() ? ((Number)xg2.aoC.wD()).floatValue() : 1.0f);
                GlStateManager.d(f4, 0.0f, 1.0f, 0.0f);
            }
        }
    }

    private void an(float f2) {
        if (this.bIT.BC() instanceof net.minecraft.entity.player.a) {
            net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)this.bIT.BC();
            float f3 = a2.csd - a2.csc;
            float f4 = -(a2.csd + f3 * f2);
            float f5 = a2.cIb + (a2.cIc - a2.cIb) * f2;
            float f6 = a2.cuB + (a2.cuC - a2.cuB) * f2;
            GlStateManager.j(bt.bx(f4 * (float)Math.PI) * f5 * 0.5f, -Math.abs(bt.bB(f4 * (float)Math.PI) * f5), 0.0f);
            GlStateManager.d(bt.bx(f4 * (float)Math.PI) * f5 * 3.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.d(Math.abs(bt.bB(f4 * (float)Math.PI - 0.2f) * f5) * 5.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(f6, 1.0f, 0.0f, 0.0f);
        }
    }

    public void ao(float f2) {
        Object object;
        Object object2;
        Object object3;
        net.minecraft.entity.c c2 = this.bIT.BC();
        float f3 = c2.getEyeHeight();
        double d2 = c2.crF + (c2.gW - c2.crF) * (double)f2;
        double d3 = c2.crG + (c2.gX - c2.crG) * (double)f2 + (double)f3;
        double d4 = c2.crH + (c2.gY - c2.crH) * (double)f2;
        if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).Wg()) {
            f3 = (float)((double)f3 + 1.0);
            GlStateManager.j(0.0f, 0.3f, 0.0f);
            if (!this.bIT.aIY.chU) {
                object3 = new net.minecraft.util.b(c2);
                object2 = this.bIT.bgF.L((net.minecraft.util.b)object3);
                Block block = object2.df();
                if (net.optifine.reflect.g.epk.aDA()) {
                    net.optifine.reflect.g.a(net.optifine.reflect.g.epk, this.bIT.bgF, object3, object2, c2);
                } else if (block == Blocks.cLE) {
                    int n2 = object2.b(BlockBed.aTB).asA();
                    GlStateManager.d(n2 * 90, 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.d(c2.crM + (c2.pl - c2.crM) * f2 + 180.0f, 0.0f, -1.0f, 0.0f);
                GlStateManager.d(c2.crO + (c2.pm - c2.crO) * f2, -1.0f, 0.0f, 0.0f);
            }
        } else if (this.bIT.aIY.chP > 0) {
            double d5 = this.bJe + (this.bJb - this.bJe) * f2;
            if (this.bIT.aIY.chU) {
                GlStateManager.j(0.0f, 0.0f, (float)(-d5));
            } else {
                float f4 = c2.pl;
                float f5 = c2.pm;
                if (this.bIT.aIY.chP == 2) {
                    f5 += 180.0f;
                }
                if ((object = a.a.g().c(xt.class)) == null || !((gi)object).isEnabled()) {
                    double d6 = (double)(-bt.bx(f4 / 180.0f * (float)Math.PI) * bt.bB(f5 / 180.0f * (float)Math.PI)) * d5;
                    double d7 = (double)(bt.bB(f4 / 180.0f * (float)Math.PI) * bt.bB(f5 / 180.0f * (float)Math.PI)) * d5;
                    double d8 = (double)(-bt.bx(f5 / 180.0f * (float)Math.PI)) * d5;
                    for (int i2 = 0; i2 < 8; ++i2) {
                        double d9;
                        ce ce2;
                        float f6 = (i2 & 1) * 2 - 1;
                        float f7 = (i2 >> 1 & 1) * 2 - 1;
                        float f8 = (i2 >> 2 & 1) * 2 - 1;
                        if ((ce2 = this.bIT.bgF.d(new da(d2 + (double)(f6 *= 0.1f), d3 + (double)(f7 *= 0.1f), d4 + (double)(f8 *= 0.1f)), new da(d2 - d6 + (double)f6 + (double)f8, d3 - d8 + (double)f7, d4 - d7 + (double)f8))) == null || !((d9 = ce2.daS.x(new da(d2, d3, d4))) < d5)) continue;
                        d5 = d9;
                    }
                }
                if (this.bIT.aIY.chP == 2) {
                    GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.d(c2.pm - f5, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(c2.pl - f4, 0.0f, 1.0f, 0.0f);
                GlStateManager.j(0.0f, 0.0f, (float)(-d5));
                GlStateManager.d(f4 - c2.pl, 0.0f, 1.0f, 0.0f);
                GlStateManager.d(f5 - c2.pm, 1.0f, 0.0f, 0.0f);
            }
        } else {
            GlStateManager.j(0.0f, 0.0f, -0.1f);
        }
        if (net.optifine.reflect.g.enx.aDA()) {
            if (!this.bIT.aIY.chU) {
                float f9 = c2.crM + (c2.pl - c2.crM) * f2 + 180.0f;
                float f10 = c2.crO + (c2.pm - c2.crO) * f2;
                float f11 = 0.0f;
                if (c2 instanceof b) {
                    b b2 = (b)c2;
                    f9 = b2.cuH + (b2.pn - b2.cuH) * f2 + 180.0f;
                }
                Block block = ActiveRenderInfo.a(this.bIT.bgF, c2, f2);
                object = net.optifine.reflect.g.b(net.optifine.reflect.g.enx, this, c2, block, Float.valueOf(f2), Float.valueOf(f9), Float.valueOf(f10), Float.valueOf(f11));
                net.optifine.reflect.g.E(object);
                f11 = net.optifine.reflect.g.a(object, net.optifine.reflect.g.enA, f11);
                f10 = net.optifine.reflect.g.a(object, net.optifine.reflect.g.enz, f10);
                f9 = net.optifine.reflect.g.a(object, net.optifine.reflect.g.eny, f9);
                GlStateManager.d(f11, 0.0f, 0.0f, 1.0f);
                GlStateManager.d(f10, 1.0f, 0.0f, 0.0f);
                GlStateManager.d(f9, 0.0f, 1.0f, 0.0f);
            }
        } else if (!this.bIT.aIY.chU) {
            object3 = this.e(xc.class);
            if (object3 != null && ((gi)object3).isEnabled()) {
                GlStateManager.d(((xc)object3).Im * (float)((Boolean)((xc)object3).aoi.wD() != false ? -1 : 1), 1.0f, 0.0f, 0.0f);
            } else {
                GlStateManager.d(c2.crO + (c2.pm - c2.crO) * f2, 1.0f, 0.0f, 0.0f);
            }
            if (c2 instanceof b) {
                object2 = (b)c2;
                GlStateManager.d(((b)object2).cuH + (((b)object2).pn - ((b)object2).cuH) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            } else if (object3 != null && ((gi)object3).isEnabled()) {
                GlStateManager.d(((xc)object3).Il + 180.0f, 0.0f, 1.0f, 0.0f);
            } else {
                GlStateManager.d(c2.crM + (c2.pl - c2.crM) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        GlStateManager.j(0.0f, -f3, 0.0f);
        d2 = c2.crF + (c2.gW - c2.crF) * (double)f2;
        d3 = c2.crG + (c2.gX - c2.crG) * (double)f2 + (double)f3;
        d4 = c2.crH + (c2.gY - c2.crH) * (double)f2;
        this.bJo = this.bIT.bgG.a(d2, d3, d4, f2);
    }

    public void b(float f2, int n2) {
        float f3;
        this.bIW = this.bIT.aIY.bOt * 16;
        if (net.minecraft.src.a.anh()) {
            this.bIW *= 0.95f;
        }
        if (net.minecraft.src.a.ani()) {
            this.bIW *= 0.83f;
        }
        GlStateManager.cR(5889);
        GlStateManager.JU();
        float f4 = 0.07f;
        if (this.bIT.aIY.cgt) {
            GlStateManager.j((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
        }
        this.bJU = this.bIW * 2.0f;
        if (this.bJU < 173.0f) {
            this.bJU = 173.0f;
        }
        Project.gluPerspective((float)this.b(f2, true), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)this.bJU);
        GlStateManager.cR(5888);
        GlStateManager.JU();
        if (this.bIT.aIY.cgt) {
            GlStateManager.j((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.am(f2);
        ga ga2 = new ga(0);
        if (this.bIT.aIY.cgs && !ga2.isCancelled()) {
            this.an(f2);
        }
        if ((f3 = this.bIT.bgK.bkC + (this.bIT.bgK.bkB - this.bIT.bgK.bkC) * f2) > 0.0f) {
            int n3 = 20;
            if (this.bIT.bgK.a(net.minecraft.potion.a.dgE)) {
                n3 = 7;
            }
            float f5 = 5.0f / (f3 * f3 + 5.0f) - f3 * 0.04f;
            f5 *= f5;
            GlStateManager.d(((float)this.bIY + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
            GlStateManager.i(1.0f / f5, 1.0f, 1.0f);
            GlStateManager.d(-((float)this.bIY + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
        }
        this.ao(f2);
        Objects.requireNonNull(this);
    }

    private void c(float f2, int n2) {
        this.a(f2, n2, true, true, false);
    }

    public void a(float f2, int n2, boolean bl2, boolean bl3, boolean bl4) {
        ga ga2;
        Objects.requireNonNull(this);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        float f3 = 0.07f;
        if (this.bIT.aIY.cgt) {
            GlStateManager.j((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
        }
        if (net.minecraft.src.a.aoG()) {
            net.optifine.shaders.ah.aGs();
        }
        Project.gluPerspective((float)this.b(f2, false), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)(this.bIW * 2.0f));
        GlStateManager.cR(5888);
        GlStateManager.JU();
        if (this.bIT.aIY.cgt) {
            GlStateManager.j((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        boolean bl5 = false;
        if (bl2) {
            boolean bl6;
            GlStateManager.JV();
            this.am(f2);
            ga2 = new ga(1);
            if (this.bIT.aIY.cgs && !ga2.isCancelled()) {
                this.an(f2);
            }
            bl5 = this.bIT.BC() instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)this.bIT.BC()).Wg();
            boolean bl7 = bl6 = !net.optifine.reflect.l.b(this.bIT.bgG, f2, n2);
            if (bl6 && this.bIT.aIY.chP == 0 && !bl5 && !this.bIT.aIY.chO && !this.bIT.bgu.CZ()) {
                this.Jk();
                if (net.minecraft.src.a.aoG()) {
                    net.optifine.shaders.aj.a(this.bgJ, f2, bl4);
                } else {
                    this.bgJ.ay(f2);
                }
                this.Jj();
            }
            GlStateManager.JW();
        }
        if (!bl3) {
            return;
        }
        this.Jj();
        if (this.bIT.aIY.chP == 0 && !bl5) {
            this.bgJ.az(f2);
            this.am(f2);
        }
        ga2 = new ga(2);
        if (this.bIT.aIY.cgs && !ga2.isCancelled()) {
            this.an(f2);
        }
    }

    public void Jj() {
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JO();
        GlStateManager.cN(OpenGlHelper.bMI);
        if (net.minecraft.src.a.aoG()) {
            net.optifine.shaders.ah.Jj();
        }
    }

    public void Jk() {
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.cR(5890);
        GlStateManager.JU();
        float f2 = 0.00390625f;
        GlStateManager.i(0.00390625f, 0.00390625f, 0.00390625f);
        GlStateManager.j(8.0f, 8.0f, 8.0f);
        GlStateManager.cR(5888);
        this.bIT.Bq().a(this.bJu);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JN();
        GlStateManager.cN(OpenGlHelper.bMI);
        if (net.minecraft.src.a.aoG()) {
            net.optifine.shaders.ah.Jk();
        }
    }

    private void Jl() {
        this.bJx = (float)((double)this.bJx + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.bJx = (float)((double)this.bJx * 0.9);
        this.bJw += this.bJx - this.bJw;
        this.bJv = true;
    }

    private void ap(float f2) {
        if (this.bJv) {
            this.bIT.bhw.eY("lightTex");
            net.minecraft.client.multiplayer.j j2 = this.bIT.bgF;
            if (j2 != null) {
                if (net.minecraft.src.a.aow() && s.a(j2, this.bJw, this.bJt, this.bIT.bgK.a(net.minecraft.potion.a.dgL), f2)) {
                    this.bJs.NL();
                    this.bJv = false;
                    this.bIT.bhw.ajv();
                    return;
                }
                float f3 = j2.bS(1.0f);
                float f4 = f3 * 0.95f + 0.05f;
                for (int i2 = 0; i2 < 256; ++i2) {
                    float f5;
                    float f6;
                    float f7 = j2.dDl.awg()[i2 / 16] * f4;
                    float f8 = j2.dDl.awg()[i2 % 16] * (this.bJw * 0.1f + 1.5f);
                    if (j2.avQ() > 0) {
                        f7 = j2.dDl.awg()[i2 / 16];
                    }
                    float f9 = f7 * (f3 * 0.65f + 0.35f);
                    float f10 = f7 * (f3 * 0.65f + 0.35f);
                    float f11 = f8 * ((f8 * 0.6f + 0.4f) * 0.6f + 0.4f);
                    float f12 = f8 * (f8 * f8 * 0.6f + 0.4f);
                    float f13 = f9 + f8;
                    float f14 = f10 + f11;
                    float f15 = f7 + f12;
                    f13 = f13 * 0.96f + 0.03f;
                    f14 = f14 * 0.96f + 0.03f;
                    f15 = f15 * 0.96f + 0.03f;
                    if (this.bJm > 0.0f) {
                        f6 = this.bJn + (this.bJm - this.bJn) * f2;
                        f13 = f13 * (1.0f - f6) + f13 * 0.7f * f6;
                        f14 = f14 * (1.0f - f6) + f14 * 0.6f * f6;
                        f15 = f15 * (1.0f - f6) + f15 * 0.6f * f6;
                    }
                    if (j2.dDl.getDimensionId() == 1) {
                        f13 = 0.22f + f8 * 0.75f;
                        f14 = 0.28f + f11 * 0.75f;
                        f15 = 0.25f + f12 * 0.75f;
                    }
                    if (this.bIT.bgK.a(net.minecraft.potion.a.dgL)) {
                        f6 = this.b(this.bIT.bgK, f2);
                        f5 = 1.0f / f13;
                        if (f5 > 1.0f / f14) {
                            f5 = 1.0f / f14;
                        }
                        if (f5 > 1.0f / f15) {
                            f5 = 1.0f / f15;
                        }
                        f13 = f13 * (1.0f - f6) + f13 * f5 * f6;
                        f14 = f14 * (1.0f - f6) + f14 * f5 * f6;
                        f15 = f15 * (1.0f - f6) + f15 * f5 * f6;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (f15 > 1.0f) {
                        f15 = 1.0f;
                    }
                    f6 = this.bIT.aIY.chW;
                    f5 = 1.0f - f13;
                    float f16 = 1.0f - f14;
                    float f17 = 1.0f - f15;
                    f5 = 1.0f - f5 * f5 * f5 * f5;
                    f16 = 1.0f - f16 * f16 * f16 * f16;
                    f17 = 1.0f - f17 * f17 * f17 * f17;
                    f13 = f13 * (1.0f - f6) + f5 * f6;
                    f14 = f14 * (1.0f - f6) + f16 * f6;
                    f15 = f15 * (1.0f - f6) + f17 * f6;
                    f13 = f13 * 0.96f + 0.03f;
                    f14 = f14 * 0.96f + 0.03f;
                    f15 = f15 * 0.96f + 0.03f;
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (f15 > 1.0f) {
                        f15 = 1.0f;
                    }
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    int n2 = 255;
                    int n3 = (int)(f13 * 255.0f);
                    int n4 = (int)(f14 * 255.0f);
                    int n5 = (int)(f15 * 255.0f);
                    this.bJt[i2] = 0xFF000000 | n3 << 16 | n4 << 8 | n5;
                }
                this.bJs.NL();
                this.bJv = false;
                this.bIT.bhw.ajv();
            }
        }
    }

    public float b(net.minecraft.entity.r r2, float f2) {
        int n2 = r2.b(net.minecraft.potion.a.dgL).getDuration();
        return n2 > 200 ? 1.0f : 0.7f + bt.bx(((float)n2 - f2) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void a(float f2, long l2) {
        int n2;
        net.minecraft.src.a.bWY = f2;
        this.Jr();
        boolean bl2 = Display.isActive();
        if (!(bl2 || !this.bIT.aIY.cgM || this.bIT.aIY.cgO && Mouse.isButtonDown((int)1))) {
            if (d.Bj() - this.bhU > 500L) {
                this.bIT.AM();
            }
        } else {
            this.bhU = d.Bj();
        }
        this.bIT.bhw.eY("mouse");
        if (bl2 && d.bgl && this.bIT.bhn && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed((boolean)false);
            Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
            Mouse.setGrabbed((boolean)true);
        }
        xc xc2 = this.e(xc.class);
        if (this.bIT.bhn && bl2 && xc2 != null && !xc2.isEnabled()) {
            this.bIT.bhe.atu();
            float f3 = this.bIT.aIY.cgq * 0.6f + 0.2f;
            float f4 = f3 * f3 * f3 * 8.0f;
            float f5 = (float)((int)((float)this.bIT.bhe.dzp + bJc)) * f4;
            float f6 = (float)((int)((float)this.bIT.bhe.dzq + bJd)) * f4;
            n2 = 1;
            bJd = 0.0f;
            bJc = 0.0f;
            if (this.bIT.aIY.cgr) {
                n2 = -1;
            }
            if (this.bIT.aIY.chT) {
                this.bJf += f5;
                this.bJg += f6;
                float f7 = f2 - this.bJj;
                this.bJj = f2;
                f5 = this.bJh * f7;
                f6 = this.bJi * f7;
            } else {
                this.bJf = 0.0f;
                this.bJg = 0.0f;
            }
            this.bIT.bgK.p(f5, f6 * (float)n2);
        }
        this.bIT.bhw.ajv();
        if (!this.bIT.bhb) {
            bIR = this.bIT.aIY.cgt;
            int n3 = this.bIT.jY.getScaledWidth();
            int n4 = this.bIT.jY.getScaledHeight();
            int n5 = Mouse.getX() * n3 / this.bIT.bgz;
            int n6 = n4 - Mouse.getY() * n4 / this.bIT.bgA - 1;
            n2 = this.bIT.aIY.cgv;
            if (this.bIT.bgF != null) {
                this.bIT.bhw.eY("level");
                int n7 = Math.min(d.BI(), n2);
                n7 = Math.max(n7, 60);
                long l3 = System.nanoTime() - l2;
                long l4 = Math.max((long)(1000000000 / n7 / 4) - l3, 0L);
                this.b(f2, System.nanoTime() + l4);
                if (OpenGlHelper.bNi) {
                    this.bIT.bgG.KD();
                    if (this.bJM != null && this.bJQ) {
                        GlStateManager.cR(5890);
                        GlStateManager.JV();
                        GlStateManager.JU();
                        this.bJM.aO(f2);
                        GlStateManager.JW();
                    }
                    this.bIT.Aw().az(true);
                }
                this.bJr = System.nanoTime();
                this.bIT.bhw.fa("gui");
                this.aCv = ait.a(this.aCv);
                ++this.bIT.bha.bnU;
                if (!this.bIT.aIY.chO || this.bIT.bgR != null) {
                    this.bIT.bgT.Jo();
                    GlStateManager.e(516, 0.1f);
                    GlStateManager.h(770, 771, 1, 0);
                    GlStateManager.JV();
                    a.a.e().d(new fs(this.bIT.jY, f2));
                    GlStateManager.JW();
                    xi xi2 = this.e(xi.class);
                    boolean bl3 = xi2 == null || (Boolean)xi2.aoL.wD() != false;
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.JA();
                    GlStateManager.tL();
                    this.bIT.Aw().az(false);
                    this.aCv.Rm();
                    aiz.c(this.bIT.jY);
                    GlStateManager.ap(0);
                    if (this.bIT.aIY.cix && !this.bIT.aIY.bJS) {
                        net.minecraft.src.a.aoU();
                    }
                    if (this.bIT.aIY.bJS) {
                        au.l(this.bIT.jY);
                    }
                }
                this.bIT.bhw.ajv();
            } else {
                GlStateManager.i(0, 0, this.bIT.bgz, this.bIT.bgA);
                GlStateManager.cR(5889);
                GlStateManager.JU();
                GlStateManager.cR(5888);
                GlStateManager.JU();
                this.Jo();
                this.bJr = System.nanoTime();
                TileEntityRendererDispatcher.caV.aIK = this.bIT.Bq();
                TileEntityRendererDispatcher.caV.bov = this.bIT.fontRendererObj;
            }
            if (this.bIT.bgR != null) {
                d.AZ().bgU.aX();
                GlStateManager.cQ(256);
                try {
                    if (net.optifine.reflect.g.eoW.aDA()) {
                        net.optifine.reflect.g.a(net.optifine.reflect.g.eoW, this.bIT.bgR, n5, n6, Float.valueOf(f2));
                    } else {
                        this.bIT.bgR.drawScreen(n5, n6, f2);
                        a.a.e().d(new fu());
                    }
                }
                catch (Throwable throwable) {
                    net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Rendering screen");
                    i i2 = a2.dY("Screen render details");
                    i2.a("Screen name", () -> this.bIT.bgR.getClass().getCanonicalName());
                    i2.a("Mouse location", () -> String.format("Scaled: (%d, %d). Absolute: (%d, %d)", n5, n6, Mouse.getX(), Mouse.getY()));
                    i2.a("Screen size", () -> String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.bIT.jY.getScaledWidth(), this.bIT.jY.getScaledHeight(), this.bIT.bgz, this.bIT.bgA, this.bIT.jY.getScaleFactor()));
                    throw new cl(a2);
                }
            }
        }
        this.Js();
        this.Jq();
        au.aBz();
        if (this.bIT.aIY.ciw) {
            this.bIT.aIY.chQ = true;
        }
    }

    private boolean Jm() {
        boolean bl2;
        Objects.requireNonNull(this);
        net.minecraft.entity.c c2 = this.bIT.BC();
        boolean bl3 = bl2 = c2 instanceof net.minecraft.entity.player.a && !this.bIT.aIY.chO;
        if (bl2 && !((net.minecraft.entity.player.a)c2).cIt.cJN) {
            co co2 = ((net.minecraft.entity.player.a)c2).abO();
            if (this.bIT.bhc != null && this.bIT.bhc.dzu == cf.dzy) {
                net.minecraft.util.b b2 = this.bIT.bhc.dg();
                IBlockState iBlockState = this.bIT.bgF.L(b2);
                Block block = iBlockState.df();
                bl2 = this.bIT.bgu.HA() == ao.dEA ? net.optifine.reflect.l.K(iBlockState) && this.bIT.bgF.K(b2) instanceof ab : co2 != null && (co2.K(block) || co2.w(block));
            }
        }
        return bl2;
    }

    private void aq(float f2) {
        if (this.bIT.aIY.bJS && !this.bIT.aIY.chO && !this.bIT.bgK.acd() && !this.bIT.aIY.cgJ) {
            net.minecraft.entity.c c2 = this.bIT.BC();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GL11.glLineWidth((float)1.0f);
            GlStateManager.JO();
            GlStateManager.an(false);
            GlStateManager.JV();
            GlStateManager.cR(5888);
            GlStateManager.JU();
            this.ao(f2);
            GlStateManager.j(0.0f, c2.getEyeHeight(), 0.0f);
            RenderGlobal.a(new net.minecraft.util.a(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), 255, 0, 0, 255);
            RenderGlobal.a(new net.minecraft.util.a(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), 0, 0, 255, 255);
            RenderGlobal.a(new net.minecraft.util.a(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), 0, 255, 0, 255);
            GlStateManager.JW();
            GlStateManager.an(true);
            GlStateManager.JN();
            GlStateManager.tR();
        }
    }

    public void b(float f2, long l2) {
        this.ap(f2);
        if (this.bIT.BC() == null) {
            this.bIT.C(this.bIT.bgK);
        }
        this.al(f2);
        if (net.minecraft.src.a.aoG()) {
            net.optifine.shaders.ah.a(this.bIT, f2, l2);
        }
        GlStateManager.JE();
        GlStateManager.tL();
        GlStateManager.e(516, 0.1f);
        this.bIT.bhw.eY("center");
        if (this.bIT.aIY.cgt) {
            bIS = 0;
            GlStateManager.a(false, true, true, false);
            this.a(0, f2, l2);
            bIS = 1;
            GlStateManager.a(true, false, false, false);
            this.a(1, f2, l2);
            GlStateManager.a(true, true, true, false);
        } else {
            this.a(2, f2, l2);
        }
        this.bIT.bhw.ajv();
    }

    private void a(int n2, float f2, long l2) {
        net.minecraft.entity.player.a a2;
        boolean bl2 = net.minecraft.src.a.aoG();
        if (bl2) {
            net.optifine.shaders.ah.b(n2, f2, l2);
        }
        RenderGlobal renderGlobal = this.bIT.bgG;
        net.minecraft.client.particle.c c2 = this.bIT.bgN;
        boolean bl3 = this.Jm();
        GlStateManager.JH();
        this.bIT.bhw.fa("clear");
        if (bl2) {
            net.optifine.shaders.ah.K(0, 0, this.bIT.bgz, this.bIT.bgA);
        } else {
            GlStateManager.i(0, 0, this.bIT.bgz, this.bIT.bgA);
        }
        this.as(f2);
        GlStateManager.cQ(16640);
        if (bl2) {
            net.optifine.shaders.ah.aFF();
        }
        this.bIT.bhw.fa("camera");
        this.b(f2, n2);
        if (bl2) {
            net.optifine.shaders.ah.ci(f2);
        }
        ActiveRenderInfo.a(this.bIT.bgK, this.bIT.aIY.chP == 2);
        this.bIT.bhw.fa("frustum");
        ClippingHelper clippingHelper = ClippingHelperImpl.Ni();
        this.bIT.bhw.fa("culling");
        clippingHelper.qW = net.minecraft.src.a.aoG() && !net.optifine.shaders.ah.aFt();
        Frustum frustum = new Frustum(clippingHelper);
        net.minecraft.entity.c c3 = this.bIT.BC();
        double d2 = c3.csh + (c3.gW - c3.csh) * (double)f2;
        double d3 = c3.csi + (c3.gX - c3.csi) * (double)f2 + (double)c3.getEyeHeight();
        double d4 = c3.csj + (c3.gY - c3.csj) * (double)f2;
        if (bl2) {
            net.optifine.shaders.aj.a(frustum, d2, d3, d4);
        } else {
            frustum.setPosition(d2, d3, d4);
        }
        if ((net.minecraft.src.a.anV() || net.minecraft.src.a.anW() || net.minecraft.src.a.aoa()) && !net.optifine.shaders.ah.eye) {
            this.d(-1, f2);
            this.bIT.bhw.fa("sky");
            GlStateManager.cR(5889);
            GlStateManager.JU();
            Project.gluPerspective((float)this.b(f2, true), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)this.bJU);
            GlStateManager.cR(5888);
            if (bl2) {
                net.optifine.shaders.ah.aFR();
            }
            renderGlobal.d(f2, n2);
            if (bl2) {
                net.optifine.shaders.ah.aFU();
            }
            GlStateManager.cR(5889);
            GlStateManager.JU();
            Project.gluPerspective((float)this.b(f2, true), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)this.bJU);
            GlStateManager.cR(5888);
        } else {
            GlStateManager.tR();
        }
        this.d(0, f2);
        GlStateManager.cP(7425);
        if (c3.gX + (double)c3.getEyeHeight() < 128.0 + (double)(this.bIT.aIY.cip * 128.0f)) {
            this.a(renderGlobal, f2, n2);
        }
        this.bIT.bhw.fa("prepareterrain");
        this.d(0, f2);
        this.bIT.Bq().a(TextureMap.bZE);
        RenderHelper.Lf();
        this.bIT.bhw.fa("terrain_setup");
        this.a(c3, f2, (ICamera)frustum, this.bIT.bgK.CZ());
        if (bl2) {
            net.optifine.shaders.aj.a(renderGlobal, c3, f2, frustum, this.asz++, this.bIT.bgK.CZ());
        } else {
            renderGlobal.a(c3, f2, frustum, this.asz++, this.bIT.bgK.CZ());
        }
        if (n2 == 2 || n2 == 0) {
            this.bIT.bhw.fa("updatechunks");
            au.ecN.rJ();
            this.bIT.bgG.s(l2);
            au.ecN.vX();
        }
        this.bIT.bhw.fa("terrain");
        au.ecQ.rJ();
        if (this.bIT.aIY.cig && n2 > 0) {
            this.bIT.bhw.fa("finish");
            GL11.glFinish();
            this.bIT.bhw.fa("terrain");
        }
        GlStateManager.cR(5888);
        GlStateManager.JV();
        GlStateManager.Jy();
        if (bl2) {
            net.optifine.shaders.aj.aGU();
        }
        renderGlobal.a(av.dxV, (double)f2, n2, c3);
        GlStateManager.tL();
        if (bl2) {
            net.optifine.shaders.aj.aGV();
        }
        this.bIT.Bq().k(TextureMap.bZE).f(false, this.bIT.aIY.bZj > 0);
        renderGlobal.a(av.dxW, (double)f2, n2, c3);
        this.bIT.Bq().k(TextureMap.bZE).NI();
        this.bIT.Bq().k(TextureMap.bZE).f(false, false);
        if (bl2) {
            net.optifine.shaders.aj.aGW();
        }
        renderGlobal.a(av.dxX, (double)f2, n2, c3);
        this.bIT.Bq().k(TextureMap.bZE).NI();
        if (bl2) {
            net.optifine.shaders.aj.aGX();
        }
        au.ecQ.vX();
        GlStateManager.cP(7424);
        GlStateManager.e(516, 0.1f);
        Objects.requireNonNull(this);
        GlStateManager.cR(5888);
        GlStateManager.JW();
        GlStateManager.JV();
        RenderHelper.Lg();
        this.bIT.bhw.fa("entities");
        if (net.optifine.reflect.g.epp.aDA()) {
            net.optifine.reflect.g.a(net.optifine.reflect.g.epp, 0);
        }
        renderGlobal.a(c3, frustum, f2);
        if (net.optifine.reflect.g.epp.aDA()) {
            net.optifine.reflect.g.a(net.optifine.reflect.g.epp, -1);
        }
        RenderHelper.Lf();
        this.Jj();
        GlStateManager.cR(5888);
        GlStateManager.JW();
        GlStateManager.JV();
        if (this.bIT.bhc != null && c3.c(Material.bev) && bl3) {
            a2 = (net.minecraft.entity.player.a)c3;
            GlStateManager.Jy();
            this.bIT.bhw.fa("outline");
            renderGlobal.a(a2, this.bIT.bhc, 0, f2);
            GlStateManager.tL();
        }
        GlStateManager.cR(5888);
        GlStateManager.JW();
        if (bl3 && this.bIT.bhc != null && !c3.c(Material.bev)) {
            a2 = (net.minecraft.entity.player.a)c3;
            GlStateManager.Jy();
            this.bIT.bhw.fa("outline");
            if (!(net.optifine.reflect.g.epg.aDA() && net.optifine.reflect.g.b(net.optifine.reflect.g.epg, renderGlobal, a2, this.bIT.bhc, 0, a2.Vk(), Float.valueOf(f2)) || this.bIT.aIY.chO)) {
                renderGlobal.a(a2, this.bIT.bhc, 0, f2);
            }
            GlStateManager.tL();
        }
        if (!renderGlobal.bOb.isEmpty()) {
            this.bIT.bhw.fa("destroyProgress");
            GlStateManager.tQ();
            GlStateManager.h(770, 1, 1, 0);
            this.bIT.Bq().k(TextureMap.bZE).f(false, false);
            renderGlobal.a(bKe, bKf, c3, f2);
            this.bIT.Bq().k(TextureMap.bZE).NI();
            GlStateManager.tR();
        }
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.tR();
        Objects.requireNonNull(this);
        this.Jk();
        this.bIT.bhw.fa("litParticles");
        if (bl2) {
            net.optifine.shaders.ah.aGj();
        }
        RenderHelper.Lf();
        this.d(0, f2);
        this.bIT.bhw.fa("particles");
        if (bl2) {
            net.optifine.shaders.ah.aGk();
        }
        c2.b(c3, f2);
        if (bl2) {
            net.optifine.shaders.ah.aGl();
        }
        this.Jj();
        GlStateManager.an(false);
        if (net.minecraft.src.a.aoG()) {
            GlStateManager.an(net.optifine.shaders.ah.aFq());
        }
        GlStateManager.JH();
        this.bIT.bhw.fa("weather");
        if (bl2) {
            net.optifine.shaders.ah.aGn();
        }
        this.ar(f2);
        if (bl2) {
            net.optifine.shaders.ah.aGo();
        }
        GlStateManager.an(true);
        renderGlobal.d(c3, f2);
        if (bl2) {
            net.optifine.shaders.aj.a(this, f2, n2);
            net.optifine.shaders.ah.aGp();
        }
        GlStateManager.tR();
        GlStateManager.JH();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(516, 0.1f);
        this.d(0, f2);
        GlStateManager.tQ();
        GlStateManager.an(false);
        this.bIT.Bq().a(TextureMap.bZE);
        GlStateManager.cP(7425);
        this.bIT.bhw.fa("translucent");
        if (bl2) {
            net.optifine.shaders.ah.aGq();
        }
        renderGlobal.a(av.dxY, (double)f2, n2, c3);
        if (bl2) {
            net.optifine.shaders.ah.aGr();
        }
        if (net.optifine.reflect.g.epp.aDA()) {
            Objects.requireNonNull(this);
            RenderHelper.Lg();
            this.bIT.bhw.fa("entities");
            net.optifine.reflect.g.a(net.optifine.reflect.g.epp, 1);
            this.bIT.bgG.a(c3, frustum, f2);
            GlStateManager.h(770, 771, 1, 0);
            net.optifine.reflect.g.a(net.optifine.reflect.g.epp, -1);
            RenderHelper.Lf();
        }
        GlStateManager.cP(7424);
        GlStateManager.an(true);
        GlStateManager.JH();
        GlStateManager.tR();
        GlStateManager.JG();
        if (c3.gX + (double)c3.getEyeHeight() >= 128.0 + (double)(this.bIT.aIY.cip * 128.0f)) {
            this.bIT.bhw.fa("aboveClouds");
            this.a(renderGlobal, f2, n2);
        }
        if (net.optifine.reflect.g.eoV.aDA()) {
            this.bIT.bhw.fa("forge_render_last");
            net.optifine.reflect.g.a(net.optifine.reflect.g.eoV, renderGlobal, Float.valueOf(f2));
        }
        this.bIT.bhw.fa("hand");
        Objects.requireNonNull(this);
        if (!net.optifine.shaders.ah.eye) {
            if (bl2) {
                net.optifine.shaders.aj.b(this, f2, n2);
                net.optifine.shaders.ah.aFN();
            }
            GlStateManager.cQ(256);
            if (bl2) {
                net.optifine.shaders.aj.c(this, f2, n2);
            } else {
                this.c(f2, n2);
            }
            this.aq(f2);
        }
        if (bl2) {
            net.optifine.shaders.ah.aBq();
        }
        this.b(f2, 0);
        a.a.e().d(new ft(f2));
    }

    private void a(RenderGlobal renderGlobal, float f2, int n2) {
        if (this.bIT.aIY.bOt >= 4 && !net.minecraft.src.a.anr() && net.optifine.shaders.ah.b(this.bIT.aIY)) {
            this.bIT.bhw.fa("clouds");
            GlStateManager.cR(5889);
            GlStateManager.JU();
            Project.gluPerspective((float)this.b(f2, true), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)(this.bJU * 4.0f));
            GlStateManager.cR(5888);
            GlStateManager.JV();
            this.d(0, f2);
            renderGlobal.e(f2, n2);
            GlStateManager.JG();
            GlStateManager.JW();
            GlStateManager.cR(5889);
            GlStateManager.JU();
            Project.gluPerspective((float)this.b(f2, true), (float)((float)this.bIT.bgz / (float)this.bIT.bgA), (float)0.05f, (float)this.bJU);
            GlStateManager.cR(5888);
        }
    }

    private void Jn() {
        float f2 = this.bIT.bgF.ca(1.0f);
        we we2 = a.a.g().c(we.class);
        if (we2 != null && we2.kW()) {
            return;
        }
        if (!net.minecraft.src.a.ano()) {
            f2 /= 2.0f;
        }
        if (f2 != 0.0f && net.minecraft.src.a.anJ()) {
            this.bIV.setSeed((long)this.bIY * 312987231L);
            net.minecraft.entity.c c2 = this.bIT.BC();
            net.minecraft.client.multiplayer.j j2 = this.bIT.bgF;
            net.minecraft.util.b b2 = new net.minecraft.util.b(c2);
            int n2 = 10;
            double d2 = 0.0;
            double d3 = 0.0;
            double d4 = 0.0;
            int n3 = 0;
            int n4 = (int)(100.0f * f2 * f2);
            if (this.bIT.aIY.chZ == 1) {
                n4 >>= 1;
            } else if (this.bIT.aIY.chZ == 2) {
                n4 = 0;
            }
            for (int i2 = 0; i2 < n4; ++i2) {
                net.minecraft.util.b b3 = j2.aS(b2.C(this.bIV.nextInt(10) - this.bIV.nextInt(10), 0, this.bIV.nextInt(10) - this.bIV.nextInt(10)));
                net.minecraft.world.biome.j j3 = j2.aF(b3);
                net.minecraft.util.b b4 = b3.aqY();
                Block block = j2.L(b4).df();
                if (b3.wu() > b2.wu() + 10 || b3.wu() < b2.wu() - 10 || !j3.awX() || !(j3.bi(b3) >= 0.15f)) continue;
                double d5 = this.bIV.nextDouble();
                double d6 = this.bIV.nextDouble();
                if (block.xb() == Material.bew) {
                    this.bIT.bgF.a(as.dxh, (double)b3.wt() + d5, (double)((float)b3.wu() + 0.1f) - block.xr(), (double)b3.wx() + d6, 0.0, 0.0, 0.0, new int[0]);
                    continue;
                }
                if (block.xb() == Material.beo) continue;
                block.c((net.minecraft.world.l)j2, b4);
                if (this.bIV.nextInt(++n3) == 0) {
                    d2 = (double)b4.wt() + d5;
                    d3 = (double)((float)b4.wu() + 0.1f) + block.xs() - 1.0;
                    d4 = (double)b4.wx() + d6;
                }
                this.bIT.bgF.a(as.dxJ, (double)b4.wt() + d5, (double)((float)b4.wu() + 0.1f) + block.xs(), (double)b4.wx() + d6, 0.0, 0.0, 0.0, new int[0]);
            }
            if (n3 > 0 && this.bIV.nextInt(3) < this.bJy++) {
                this.bJy = 0;
                if (d3 > (double)(b2.wu() + 1) && j2.aS(b2).wu() > bt.bL(b2.wu())) {
                    this.bIT.bgF.a(d2, d3, d4, "ambient.weather.rain", 0.1f, 0.5f, false);
                } else {
                    this.bIT.bgF.a(d2, d3, d4, "ambient.weather.rain", 0.2f, 1.0f, false);
                }
            }
        }
    }

    protected void ar(float f2) {
        ac ac2;
        Object object;
        if (net.optifine.reflect.g.epQ.aDA() && (object = net.optifine.reflect.g.g(ac2 = this.bIT.bgF.dDl, net.optifine.reflect.g.epQ, new Object[0])) != null) {
            net.optifine.reflect.g.a(object, net.optifine.reflect.g.eqa, Float.valueOf(f2), this.bIT.bgF, this.bIT);
            return;
        }
        float f3 = this.bIT.bgF.ca(f2);
        if (f3 > 0.0f) {
            if (net.minecraft.src.a.anp()) {
                return;
            }
            this.Jk();
            object = this.bIT.BC();
            net.minecraft.client.multiplayer.j j2 = this.bIT.bgF;
            int n2 = bt.aF(((net.minecraft.entity.c)object).gW);
            int n3 = bt.aF(((net.minecraft.entity.c)object).gX);
            int n4 = bt.aF(((net.minecraft.entity.c)object).gY);
            GlStateManager.JI();
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.e(516, 0.1f);
            double d2 = ((net.minecraft.entity.c)object).csh + (((net.minecraft.entity.c)object).gW - ((net.minecraft.entity.c)object).csh) * (double)f2;
            double d3 = ((net.minecraft.entity.c)object).csi + (((net.minecraft.entity.c)object).gX - ((net.minecraft.entity.c)object).csi) * (double)f2 + (double)((net.minecraft.entity.c)object).getEyeHeight();
            double d4 = ((net.minecraft.entity.c)object).csj + (((net.minecraft.entity.c)object).gY - ((net.minecraft.entity.c)object).csj) * (double)f2;
            int n5 = bt.aF(d3);
            int n6 = 5;
            if (net.minecraft.src.a.ano()) {
                n6 = 10;
            }
            int n7 = -1;
            float f4 = (float)this.bIY + f2;
            bKf.G(-d2, -d3, -d4);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            g g2 = new g();
            for (int i2 = n4 - n6; i2 <= n4 + n6; ++i2) {
                for (int i3 = n2 - n6; i3 <= n2 + n6; ++i3) {
                    double d5;
                    double d6;
                    int n8 = (i2 - n4 + 16) * 32 + i3 - n2 + 16;
                    double d7 = (double)this.bJz[n8] * 0.5;
                    double d8 = (double)this.bJA[n8] * 0.5;
                    g2.E(i3, 0, i2);
                    net.minecraft.world.biome.j j3 = j2.aF(g2);
                    if (!j3.awX() && !j3.awW()) continue;
                    int n9 = j2.aS(g2).wu();
                    int n10 = n3 - n6;
                    int n11 = n3 + n6;
                    if (n10 < n9) {
                        n10 = n9;
                    }
                    if (n11 < n9) {
                        n11 = n9;
                    }
                    int n12 = Math.max(n9, n5);
                    if (n10 == n11) continue;
                    this.bIV.setSeed(i3 * i3 * 3121 + i3 * 45238971 ^ i2 * i2 * 418711 + i2 * 13761);
                    g2.E(i3, n10, i2);
                    we we2 = a.a.g().c(we.class);
                    float f5 = we2.a(g2, j3);
                    if (j2.avp().g(f5, n9) >= 0.15f) {
                        if (n7 != 0) {
                            if (n7 >= 0) {
                                bKe.pZ();
                            }
                            n7 = 0;
                            this.bIT.Bq().a(bIN);
                            bKf.a(7, DefaultVertexFormats.cbD);
                        }
                        double d9 = ((double)(this.bIY + i3 * i3 * 3121 + i3 * 45238971 + i2 * i2 * 418711 + i2 * 13761 & 0x1F) + (double)f2) / 32.0 * (3.0 + this.bIV.nextDouble());
                        d6 = (double)((float)i3 + 0.5f) - ((net.minecraft.entity.c)object).gW;
                        d5 = (double)((float)i2 + 0.5f) - ((net.minecraft.entity.c)object).gY;
                        float f6 = bt.aD(d6 * d6 + d5 * d5) / (float)n6;
                        float f7 = ((1.0f - f6 * f6) * 0.5f + 0.5f) * f3;
                        g2.E(i3, n12, i2);
                        int n13 = ((w)j2).b((net.minecraft.util.b)g2, 0);
                        int n14 = n13 >> 16 & 0xFFFF;
                        int n15 = n13 & 0xFFFF;
                        bKf.F((double)i3 - d7 + 0.5, n10, (double)i2 - d8 + 0.5).r(0.0, (double)n10 * 0.25 + d9).g(1.0f, 1.0f, 1.0f, f7).aa(n14, n15).Lx();
                        bKf.F((double)i3 + d7 + 0.5, n10, (double)i2 + d8 + 0.5).r(1.0, (double)n10 * 0.25 + d9).g(1.0f, 1.0f, 1.0f, f7).aa(n14, n15).Lx();
                        bKf.F((double)i3 + d7 + 0.5, n11, (double)i2 + d8 + 0.5).r(1.0, (double)n11 * 0.25 + d9).g(1.0f, 1.0f, 1.0f, f7).aa(n14, n15).Lx();
                        bKf.F((double)i3 - d7 + 0.5, n11, (double)i2 - d8 + 0.5).r(0.0, (double)n11 * 0.25 + d9).g(1.0f, 1.0f, 1.0f, f7).aa(n14, n15).Lx();
                        continue;
                    }
                    Color color = Color.WHITE;
                    cm cm2 = bIO;
                    if (we2.isEnabled()) {
                        color = (Color)we2.alp.wD();
                        if (((akg)we2.kY().wD()).getName().equals("Light Snow")) {
                            cm2 = bIP;
                        } else if (((akg)we2.kY().wD()).getName().equals("Nether Particles")) {
                            cm2 = bIQ;
                            color = new Color(220, 200, 230);
                        }
                    }
                    if (n7 != 1) {
                        if (n7 >= 0) {
                            bKe.pZ();
                        }
                        n7 = 1;
                        this.bIT.Bq().a(cm2);
                        bKf.a(7, DefaultVertexFormats.cbD);
                    }
                    d6 = ((float)(this.bIY & 0x1FF) + f2) / 512.0f;
                    d5 = this.bIV.nextDouble() + (double)f4 * 0.01 * (double)((float)this.bIV.nextGaussian());
                    double d10 = this.bIV.nextDouble() + (double)(f4 * (float)this.bIV.nextGaussian()) * 0.001;
                    double d11 = (double)((float)i3 + 0.5f) - ((net.minecraft.entity.c)object).gW;
                    double d12 = (double)((float)i2 + 0.5f) - ((net.minecraft.entity.c)object).gY;
                    float f8 = bt.aD(d11 * d11 + d12 * d12) / (float)n6;
                    float f9 = ((1.0f - f8 * f8) * 0.3f + 0.5f) * f3;
                    g2.E(i3, n12, i2);
                    int n16 = (((w)j2).b((net.minecraft.util.b)g2, 0) * 3 + 0xF000F0) / 4;
                    int n17 = n16 >> 16 & 0xFFFF;
                    int n18 = n16 & 0xFFFF;
                    bKf.F((double)i3 - d7 + 0.5, n10, (double)i2 - d8 + 0.5).r(0.0 + d5, (double)n10 * 0.25 + d6 + d10).g((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, f9).aa(n17, n18).Lx();
                    bKf.F((double)i3 + d7 + 0.5, n10, (double)i2 + d8 + 0.5).r(1.0 + d5, (double)n10 * 0.25 + d6 + d10).g((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, f9).aa(n17, n18).Lx();
                    bKf.F((double)i3 + d7 + 0.5, n11, (double)i2 + d8 + 0.5).r(1.0 + d5, (double)n11 * 0.25 + d6 + d10).g((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, f9).aa(n17, n18).Lx();
                    bKf.F((double)i3 - d7 + 0.5, n11, (double)i2 - d8 + 0.5).r(0.0 + d5, (double)n11 * 0.25 + d6 + d10).g((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, f9).aa(n17, n18).Lx();
                }
            }
            if (n7 >= 0) {
                bKe.pZ();
            }
            bKf.G(0.0, 0.0, 0.0);
            GlStateManager.JH();
            GlStateManager.tR();
            GlStateManager.e(516, 0.1f);
            this.Jj();
        }
    }

    public void Jo() {
        cz cz2 = this.bIT.jY;
        GlStateManager.cQ(256);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        GlStateManager.e(0.0, cz2.Gq(), cz2.Gr(), 0.0, 1000.0, 3000.0);
        GlStateManager.cR(5888);
        GlStateManager.JU();
        GlStateManager.j(0.0f, 0.0f, -2000.0f);
    }

    private void as(float f2) {
        float f3;
        float f4;
        Object object;
        float f5;
        Object object2;
        net.minecraft.client.multiplayer.j j2 = this.bIT.bgF;
        net.minecraft.entity.c c2 = this.bIT.BC();
        float f6 = 0.25f + 0.75f * (float)this.bIT.aIY.bOt / 32.0f;
        f6 = 1.0f - (float)Math.pow(f6, 0.25);
        da da2 = j2.i(this.bIT.BC(), f2);
        da2 = s.b(da2, j2, this.bIT.BC(), f2);
        float f7 = (float)da2.dAG;
        float f8 = (float)da2.dAH;
        float f9 = (float)da2.dAI;
        da da3 = j2.bW(f2);
        da3 = s.a(da3, j2, this.bIT.BC(), f2);
        this.bJC = (float)da3.dAG;
        this.bJD = (float)da3.dAH;
        this.bJE = (float)da3.dAI;
        if (this.bIT.aIY.bOt >= 4) {
            double d2 = -1.0;
            object2 = bt.bx(j2.bU(f2)) > 0.0f ? new da(-1.0, 0.0, 0.0) : new da(1.0, 0.0, 0.0);
            f5 = (float)c2.O(f2).t((da)object2);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 0.0f && (object = j2.dDl.z(j2.bT(f2), f2)) != null) {
                this.bJC = this.bJC * (1.0f - (f5 *= object[3])) + object[0] * f5;
                this.bJD = this.bJD * (1.0f - f5) + object[1] * f5;
                this.bJE = this.bJE * (1.0f - f5) + object[2] * f5;
            }
        }
        this.bJC += (f7 - this.bJC) * f6;
        this.bJD += (f8 - this.bJD) * f6;
        this.bJE += (f9 - this.bJE) * f6;
        float f10 = j2.ca(f2);
        if (f10 > 0.0f) {
            f4 = 1.0f - f10 * 0.5f;
            float f11 = 1.0f - f10 * 0.4f;
            this.bJC *= f4;
            this.bJD *= f4;
            this.bJE *= f11;
        }
        if ((f4 = j2.bY(f2)) > 0.0f) {
            float f12 = 1.0f - f4 * 0.5f;
            this.bJC *= f12;
            this.bJD *= f12;
            this.bJE *= f12;
        }
        object2 = ActiveRenderInfo.a(this.bIT.bgF, c2, f2);
        if (this.bJo) {
            da da4 = j2.bV(f2);
            this.bJC = (float)da4.dAG;
            this.bJD = (float)da4.dAH;
            this.bJE = (float)da4.dAI;
        } else if (((Block)object2).xb() == Material.bev) {
            f5 = (float)l.Q(c2) * 0.2f;
            f5 = net.minecraft.src.a.F(f5, 0.0f, 0.6f);
            if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).a(net.minecraft.potion.a.dgI)) {
                f5 = f5 * 0.3f + 0.6f;
            }
            this.bJC = 0.02f + f5;
            this.bJD = 0.02f + f5;
            this.bJE = 0.2f + f5;
            object = s.a((net.minecraft.world.l)this.bIT.bgF, this.bIT.BC().gW, this.bIT.BC().gX + 1.0, this.bIT.BC().gY);
            if (object != null) {
                this.bJC = (float)object.dAG;
                this.bJD = (float)object.dAH;
                this.bJE = (float)object.dAI;
            }
        } else if (((Block)object2).xb() == Material.bew) {
            this.bJC = 0.6f;
            this.bJD = 0.1f;
            this.bJE = 0.0f;
            da da5 = s.b(this.bIT.bgF, this.bIT.BC().gW, this.bIT.BC().gX + 1.0, this.bIT.BC().gY);
            if (da5 != null) {
                this.bJC = (float)da5.dAG;
                this.bJD = (float)da5.dAH;
                this.bJE = (float)da5.dAI;
            }
        }
        float f13 = this.bJF + (this.bJG - this.bJF) * f2;
        this.bJC *= f13;
        this.bJD *= f13;
        this.bJE *= f13;
        double d3 = (c2.csi + (c2.gX - c2.csi) * (double)f2) * j2.dDl.awc();
        if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).a(net.minecraft.potion.a.dgK)) {
            int n2 = ((net.minecraft.entity.r)c2).b(net.minecraft.potion.a.dgK).getDuration();
            d3 = n2 < 20 ? (d3 *= (double)(1.0f - (float)n2 / 20.0f)) : 0.0;
        }
        if (d3 < 1.0) {
            if (d3 < 0.0) {
                d3 = 0.0;
            }
            d3 *= d3;
            this.bJC = (float)((double)this.bJC * d3);
            this.bJD = (float)((double)this.bJD * d3);
            this.bJE = (float)((double)this.bJE * d3);
        }
        if (this.bJm > 0.0f) {
            float f14 = this.bJn + (this.bJm - this.bJn) * f2;
            this.bJC = this.bJC * (1.0f - f14) + this.bJC * 0.7f * f14;
            this.bJD = this.bJD * (1.0f - f14) + this.bJD * 0.6f * f14;
            this.bJE = this.bJE * (1.0f - f14) + this.bJE * 0.6f * f14;
        }
        if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).a(net.minecraft.potion.a.dgL)) {
            float f15 = this.b((net.minecraft.entity.r)c2, f2);
            f3 = 1.0f / this.bJC;
            if (f3 > 1.0f / this.bJD) {
                f3 = 1.0f / this.bJD;
            }
            if (f3 > 1.0f / this.bJE) {
                f3 = 1.0f / this.bJE;
            }
            if (Float.isInfinite(f3)) {
                f3 = Math.nextAfter(f3, 0.0);
            }
            this.bJC = this.bJC * (1.0f - f15) + this.bJC * f3 * f15;
            this.bJD = this.bJD * (1.0f - f15) + this.bJD * f3 * f15;
            this.bJE = this.bJE * (1.0f - f15) + this.bJE * f3 * f15;
        }
        if (this.bIT.aIY.cgt) {
            float f16 = (this.bJC * 30.0f + this.bJD * 59.0f + this.bJE * 11.0f) / 100.0f;
            f3 = (this.bJC * 30.0f + this.bJD * 70.0f) / 100.0f;
            float f17 = (this.bJC * 30.0f + this.bJE * 70.0f) / 100.0f;
            this.bJC = f16;
            this.bJD = f3;
            this.bJE = f17;
        }
        if (net.optifine.reflect.g.enC.aDA()) {
            Object object3 = net.optifine.reflect.g.b(net.optifine.reflect.g.enC, this, c2, object2, Float.valueOf(f2), Float.valueOf(this.bJC), Float.valueOf(this.bJD), Float.valueOf(this.bJE));
            net.optifine.reflect.g.E(object3);
            this.bJC = net.optifine.reflect.g.a(object3, net.optifine.reflect.g.enD, this.bJC);
            this.bJD = net.optifine.reflect.g.a(object3, net.optifine.reflect.g.enE, this.bJD);
            this.bJE = net.optifine.reflect.g.a(object3, net.optifine.reflect.g.enF, this.bJE);
        }
        net.optifine.shaders.ah.n(this.bJC, this.bJD, this.bJE, 0.0f);
    }

    private void d(int n2, float f2) {
        this.bJT = false;
        net.minecraft.entity.c c2 = this.bIT.BC();
        GL11.glFog((int)2918, (FloatBuffer)this.b(this.bJC, this.bJD, this.bJE, 1.0f));
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        Block block = ActiveRenderInfo.a(this.bIT.bgF, c2, f2);
        float f3 = -1.0f;
        if (net.optifine.reflect.g.epb.aDA()) {
            f3 = net.optifine.reflect.g.d(net.optifine.reflect.g.epb, this, c2, block, Float.valueOf(f2), Float.valueOf(0.1f));
        }
        if (f3 >= 0.0f) {
            GlStateManager.at(f3);
        } else if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).a(net.minecraft.potion.a.dgK)) {
            float f4 = 5.0f;
            int n3 = ((net.minecraft.entity.r)c2).b(net.minecraft.potion.a.dgK).getDuration();
            if (n3 < 20) {
                f4 = 5.0f + (this.bIW - 5.0f) * (1.0f - (float)n3 / 20.0f);
            }
            GlStateManager.cK(9729);
            if (n2 == -1) {
                GlStateManager.au(0.0f);
                GlStateManager.av(f4 * 0.8f);
            } else {
                GlStateManager.au(f4 * 0.25f);
                GlStateManager.av(f4);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance && net.minecraft.src.a.anh()) {
                GL11.glFogi((int)34138, (int)34139);
            }
        } else if (this.bJo) {
            GlStateManager.cK(2048);
            GlStateManager.at(0.1f);
        } else if (block.xb() == Material.bev) {
            float f5;
            GlStateManager.cK(2048);
            float f6 = f5 = net.minecraft.src.a.aoe() ? 0.02f : 0.1f;
            if (c2 instanceof net.minecraft.entity.r && ((net.minecraft.entity.r)c2).a(net.minecraft.potion.a.dgI)) {
                GlStateManager.at(0.01f);
            } else {
                float f7 = 0.1f - (float)l.Q(c2) * 0.03f;
                GlStateManager.at(net.minecraft.src.a.F(f7, 0.0f, f5));
            }
        } else if (block.xb() == Material.bew) {
            GlStateManager.cK(2048);
            GlStateManager.at(2.0f);
        } else {
            float f8 = this.bIW;
            this.bJT = true;
            GlStateManager.cK(9729);
            if (n2 == -1) {
                GlStateManager.au(0.0f);
                GlStateManager.av(f8);
            } else {
                GlStateManager.au(f8 * net.minecraft.src.a.anl());
                GlStateManager.av(f8);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                if (net.minecraft.src.a.anh()) {
                    GL11.glFogi((int)34138, (int)34139);
                }
                if (net.minecraft.src.a.ani()) {
                    GL11.glFogi((int)34138, (int)34140);
                }
            }
            if (this.bIT.bgF.dDl.aP((int)c2.gW, (int)c2.gY)) {
                GlStateManager.au(f8 * 0.05f);
                GlStateManager.av(f8);
            }
            if (net.optifine.reflect.g.eph.aDA()) {
                net.optifine.reflect.g.a(net.optifine.reflect.g.eph, this, c2, block, Float.valueOf(f2), n2, Float.valueOf(f8));
            }
        }
        GlStateManager.JB();
        GlStateManager.JF();
        GlStateManager.O(1028, 4608);
    }

    private FloatBuffer b(float f2, float f3, float f4, float f5) {
        if (net.minecraft.src.a.aoG()) {
            net.optifine.shaders.ah.N(f2, f3, f4);
        }
        this.bJB.clear();
        this.bJB.put(f2).put(f3).put(f4).put(f5);
        this.bJB.flip();
        return this.bJB;
    }

    public cx Jp() {
        return this.bIX;
    }

    private void Jq() {
        this.bJY = 0;
        if (net.minecraft.src.a.aoM() && net.minecraft.src.a.aoL()) {
            IntegratedServer integratedServer;
            if (this.bIT.Bf() && (integratedServer = this.bIT.Bg()) != null) {
                boolean bl2 = this.bIT.Bw();
                if (!bl2 && !(this.bIT.bgR instanceof r)) {
                    if (this.bJX > 0) {
                        au.ecR.rJ();
                        net.minecraft.src.a.k(this.bJX);
                        au.ecR.vX();
                        this.bJY = this.bJX;
                    }
                    long l2 = System.nanoTime() / 1000000L;
                    if (this.bJV != 0L && this.bJW != 0) {
                        long l3 = l2 - this.bJV;
                        if (l3 < 0L) {
                            this.bJV = l2;
                            l3 = 0L;
                        }
                        if (l3 >= 50L) {
                            this.bJV = l2;
                            int n2 = integratedServer.alI();
                            int n3 = n2 - this.bJW;
                            if (n3 < 0) {
                                this.bJW = n2;
                                n3 = 0;
                            }
                            if (n3 < 1 && this.bJX < 100) {
                                this.bJX += 2;
                            }
                            if (n3 > 1 && this.bJX > 0) {
                                --this.bJX;
                            }
                            this.bJW = n2;
                        }
                    } else {
                        this.bJV = l2;
                        this.bJW = integratedServer.alI();
                        this.bKa = 1.0f;
                        this.bJZ = 50.0f;
                    }
                } else {
                    if (this.bIT.bgR instanceof r) {
                        net.minecraft.src.a.k(20L);
                    }
                    this.bJV = 0L;
                    this.bJW = 0;
                }
            }
        } else {
            this.bJV = 0L;
            this.bJW = 0;
        }
    }

    private void Jr() {
        net.optifine.as.aBs();
        if (!this.Mq) {
            ak.aJx();
            if (net.minecraft.src.a.aoW() == 64 && net.minecraft.src.a.aoX() == 32) {
                net.minecraft.src.a.cp(true);
            }
            this.Mq = true;
        }
        net.minecraft.src.a.aoS();
        net.minecraft.client.multiplayer.j j2 = this.bIT.bgF;
        if (j2 != null) {
            Object object;
            if (net.minecraft.src.a.aoI() != null) {
                object = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
                String string = (String)object + " " + net.minecraft.src.a.aoI();
                net.minecraft.util.s s2 = new net.minecraft.util.s(I18n.a("of.message.newVersion", "\u00a7n" + string + "\u00a7r"));
                s2.a(new v().a(new net.minecraft.event.a(net.minecraft.event.b.cKI, "https://optifine.net/downloads")));
                this.bIT.bha.Ey().c(s2);
                net.minecraft.src.a.fQ(null);
            }
            if (net.minecraft.src.a.aoY()) {
                net.minecraft.src.a.cp(false);
                object = new net.minecraft.util.s(I18n.a("of.message.java64Bit", new Object[0]));
                this.bIT.bha.Ey().c((ba)object);
            }
        }
        if (this.bIT.bgR instanceof am) {
            this.a((am)this.bIT.bgR);
        }
        if (this.bJR != j2) {
            bd.a(this.bJR, (w)j2);
            net.minecraft.src.a.ana();
            this.bJV = 0L;
            this.bJW = 0;
            this.bJR = j2;
        }
        if (!this.cA(net.optifine.shaders.ah.eDi)) {
            net.optifine.shaders.ah.eDi = 0;
        }
        if (this.bIT.bgR != null && this.bIT.bgR.getClass() == f.class) {
            this.bIT.a(new c((f)this.bIT.bgR));
        }
        aiv.c(this.bIT.Aw());
    }

    private void Js() {
        int n2;
        if (this.bIT.bgF != null && net.minecraft.src.a.apj() && net.optifine.util.ao.f("CheckGlErrorFrameFinish", 10000L) && (n2 = GlStateManager.JZ()) != 0 && net.optifine.as.aX(n2)) {
            String string = net.minecraft.src.a.hi(n2);
            net.minecraft.util.s s2 = new net.minecraft.util.s(I18n.a("of.message.openglError", n2, string));
            this.bIT.bha.Ey().c(s2);
        }
    }

    private void a(am am2) {
        try {
            String string = null;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int n2 = calendar.get(5);
            int n3 = calendar.get(2) + 1;
            if (n2 == 8 && n3 == 4) {
                string = "Happy birthday, OptiFine!";
            }
            if (n2 == 14 && n3 == 8) {
                string = "Happy birthday, sp614x!";
            }
            if (string == null) {
                return;
            }
            net.optifine.reflect.g.a((Object)am2, net.optifine.reflect.g.erm, (Object)string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public boolean cA(int n2) {
        if (!OpenGlHelper.Ky()) {
            return false;
        }
        if (this.bJM != null && this.bJM != this.bKb[2] && this.bJM != this.bKb[4]) {
            return true;
        }
        if (n2 != 2 && n2 != 4) {
            if (this.bJM != null) {
                this.bJM.Rt();
                this.bJM = null;
            }
            return true;
        }
        if (this.bJM != null && this.bJM == this.bKb[n2]) {
            return true;
        }
        if (this.bIT.bgF == null) {
            return true;
        }
        this.h(new cm("shaders/post/fxaa_of_" + n2 + "x.json"));
        this.bKb[n2] = this.bJM;
        return this.bJQ;
    }

    private void a(net.minecraft.entity.c c2, float f2, ICamera iCamera, boolean bl2) {
        int n2 = 201435902;
        if (this.bKc) {
            this.bKc = false;
            this.a(c2, (double)f2, iCamera, bl2);
            this.bIT.bha.Ey().bF(201435902);
        }
        if (Keyboard.isKeyDown((int)61) && Keyboard.isKeyDown((int)38)) {
            if (this.bIT.bgR != null) {
                return;
            }
            this.bKc = true;
            net.minecraft.util.s s2 = new net.minecraft.util.s(I18n.a("of.message.loadingVisibleChunks", new Object[0]));
            this.bIT.bha.Ey().a(s2, 201435902);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(net.minecraft.entity.c c2, double d2, ICamera iCamera, boolean bl2) {
        int n2 = this.bIT.aIY.ciD;
        boolean bl3 = this.bIT.aIY.cii;
        try {
            boolean bl4;
            this.bIT.aIY.ciD = 1000;
            this.bIT.aIY.cii = false;
            RenderGlobal renderGlobal = net.minecraft.src.a.anR();
            int n3 = renderGlobal.KY();
            long l2 = System.currentTimeMillis();
            net.minecraft.src.a.fN("Loading visible chunks");
            long l3 = System.currentTimeMillis() + 5000L;
            int n4 = 0;
            do {
                bl4 = false;
                renderGlobal.bOH = true;
                renderGlobal.a(c2, d2, iCamera, this.asz++, bl2);
                for (int i2 = 0; i2 < 100; ++i2) {
                    if (!renderGlobal.KS()) {
                        bl4 = true;
                    }
                    n4 += renderGlobal.KZ();
                    while (!renderGlobal.KS()) {
                        renderGlobal.s(System.nanoTime() + 1000000000L);
                    }
                    n4 -= renderGlobal.KZ();
                    if (!bl4) break;
                }
                if (renderGlobal.KY() != n3) {
                    bl4 = true;
                    n3 = renderGlobal.KY();
                }
                if (System.currentTimeMillis() <= l3) continue;
                net.minecraft.src.a.fO("Chunks loaded: " + n4);
                l3 = System.currentTimeMillis() + 5000L;
            } while (bl4);
            net.minecraft.src.a.fO("Chunks loaded: " + n4);
            net.minecraft.src.a.fO("Finished loading visible chunks");
            RenderChunk.bTp = 0;
        }
        finally {
            this.bIT.aIY.ciD = n2;
            this.bIT.aIY.cii = bl3;
        }
    }

    static {
        bJN = new cm[]{new cm("shaders/post/notch.json"), new cm("shaders/post/fxaa.json"), new cm("shaders/post/art.json"), new cm("shaders/post/bumpy.json"), new cm("shaders/post/blobs2.json"), new cm("shaders/post/pencil.json"), new cm("shaders/post/color_convolve.json"), new cm("shaders/post/deconverge.json"), new cm("shaders/post/flip.json"), new cm("shaders/post/invert.json"), new cm("shaders/post/ntsc.json"), new cm("shaders/post/outline.json"), new cm("shaders/post/phosphor.json"), new cm("shaders/post/scan_pincushion.json"), new cm("shaders/post/sobel.json"), new cm("shaders/post/bits.json"), new cm("shaders/post/desaturate.json"), new cm("shaders/post/green.json"), new cm("shaders/post/blur.json"), new cm("shaders/post/wobble.json"), new cm("shaders/post/blobs.json"), new cm("shaders/post/antialias.json"), new cm("shaders/post/creeper.json"), new cm("shaders/post/spider.json")};
        bJO = bJN.length;
        bKe = Tessellator.Li();
        bKf = bKe.Lj();
    }
}

