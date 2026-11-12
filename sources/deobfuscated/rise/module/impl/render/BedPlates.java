/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.util.glu.GLU
 */
package rise.module.impl.render;

import hackclient.rise.abz;
import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.ahd;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.wl;
import hackclient.rise.wn;
import hackclient.rise.wo;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.cz;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.w;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.glu.GLU;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.Breaker;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.render.bedplates.name", "Bed Plates"}, description="module.render.bedplates.description", category=Category.RENDER)
public class BedPlates
extends Module {
    private final BooleanValue alV = new BooleanValue("Whitelist Own Bed", (Module)this, (Boolean)true);
    /* ANDROID/VANILLA PORT NOTE (blur removal): "Overlays (Bloom/Blur)"
     * (alW) gate removed; the plate backdrop now renders on the plain
     * overlay layer (gg.kV) instead of the blur layer (gg.kU). */
    private final BooleanValue alX = new BooleanValue("Minimal", (Module)this, (Boolean)false);
    private final BooleanValue alY = new BooleanValue("Show Gradient", (Module)this, (Boolean)false);
    private final BooleanValue alZ = new BooleanValue("Show Distance", (Module)this, (Boolean)true);
    private final BooleanValue ama = new BooleanValue("Distance Scale", (Module)this, (Boolean)true);
    private final NumberValue amb = new NumberValue("Range", this, (Number)200, (Number)20, (Number)200, (Number)10);
    private final NumberValue amc = new NumberValue("Refresh Ticks", this, (Number)1, (Number)1, (Number)20, (Number)1);
    private final agf amd = gb.ks.a(15, gd.kF);
    private final agf ame = gb.ks.a(11, gd.kH);
    private final agf amf = gb.ks.a(11, gd.kG);
    private final List<wl> amg = new ArrayList<wl>();
    private final List<wn> amh = new CopyOnWriteArrayList<wn>();
    private int ami = 0;
    private int amj = -1;
    private int amk = 0;
    private double aml = 0.5;
    private boolean amm;
    private double amn;
    private double amo;
    private double amp;
    private int amq;
    private int amr;
    private float Il;
    private float Im;
    private volatile boolean ams = false;
    private long amt = 0L;
    private static final long amu = 5000L;
    private static final ao[] amv = new ao[]{ao.dwr, ao.dws, ao.dwt, ao.dwu, ao.dwv};
    @EventLink
    public final Listener<Render2DEvent> amw = render2DEvent -> {
        if (!this.le()) {
            this.amg.clear();
            this.amh.clear();
            this.ams = false;
            return;
        }
        int n2 = BedPlates.aER.bgK.aRg;
        if (n2 != this.amj) {
            this.amj = n2;
            ++this.ami;
            this.lf();
            if (this.ami >= ((Number)this.amc.wD()).intValue() || this.amg.isEmpty()) {
                this.ami = 0;
                this.lh();
            }
        }
        this.li();
    };

    @Override
    public void onDisable() {
        this.amg.clear();
        this.amh.clear();
        this.ami = 0;
        this.amj = -1;
        this.amk = 0;
        this.amm = false;
        this.ams = false;
        this.amt = 0L;
    }

    @Override
    public void onEnable() {
        this.amg.clear();
        this.amh.clear();
        this.ami = 0;
        this.amj = -1;
        this.amk = 0;
        this.amm = false;
        this.ams = false;
        this.amt = 0L;
    }

    private boolean le() {
        return BedPlates.aER.bgF != null && BedPlates.aER.bgK != null;
    }

    private void lf() {
        if (!this.le()) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.ams) {
            return;
        }
        if (l2 - this.amt < 5000L) {
            return;
        }
        this.amt = l2;
        this.lg();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lg() {
        if (!this.le()) {
            return;
        }
        ahd ahd2 = this;
        synchronized (ahd2) {
            if (this.ams) {
                return;
            }
            this.ams = true;
        }
        ahd2 = BedPlates.aER.bgF;
        if (ahd2 == null) {
            this.ams = false;
            return;
        }
        b b2 = new b(BedPlates.aER.bgK.gW, BedPlates.aER.bgK.gX, BedPlates.aER.bgK.gY);
        int n2 = ((Number)this.amb.wD()).intValue();
        int n3 = Math.min(100, Math.max(4, n2 / 2));
        double d2 = ((Number)this.amb.wD()).doubleValue();
        double d3 = d2 * d2;
        double d4 = BedPlates.aER.bgK.gW;
        double d5 = BedPlates.aER.bgK.gX;
        double d6 = BedPlates.aER.bgK.gY;
        double d7 = (double)b2.wt() + 0.5 - d4;
        double d8 = (double)b2.wx() + 0.5 - d6;
        boolean bl2 = (Boolean)this.alV.wD();
        new Thread(() -> this.a(n2, b2, d7, d8, d3, n3, (w)ahd2, d5, bl2), "BedPlates-AsyncBedScan").start();
    }

    private void lh() {
        this.amg.clear();
        if (!this.le() || this.amh.isEmpty()) {
            return;
        }
        double d2 = ((Number)this.amb.wD()).doubleValue();
        double d3 = d2 * d2;
        double d4 = BedPlates.aER.bgK.gW;
        double d5 = BedPlates.aER.bgK.gX;
        double d6 = BedPlates.aER.bgK.gY;
        j j2 = BedPlates.aER.bgF;
        for (wn wn2 : this.amh) {
            wo wo2;
            double d7;
            double d8;
            double d9;
            double d10;
            b b2 = wn2.lr();
            IBlockState iBlockState = j2.L(b2);
            Block block = iBlockState.df();
            if (!(block instanceof BlockBed) || iBlockState.b(BlockBed.aTc) != BlockBed$EnumPartType.aTe) continue;
            ao ao2 = iBlockState.b(BlockBed.aTB);
            if (((Boolean)this.alV.wD()).booleanValue() && this.a(b2, ao2)) continue;
            b b3 = b2.x(ao2.asC());
            double d11 = ((double)(b2.wt() + b3.wt()) + 1.0) / 2.0;
            double d12 = d11 - d4;
            double d13 = d12 * d12 + (d10 = (d9 = (double)b2.wu() + 0.5) - d5) * d10 + (d8 = (d7 = ((double)(b2.wx() + b3.wx()) + 1.0) / 2.0) - d6) * d8;
            if (!(d13 <= d3) || (wo2 = this.a(b2, ao2, d11, d9, d7)) == null) continue;
            akd akd2 = new akd(d11, d9, d7);
            this.amg.add(new wl(akd2, d13, wo2));
        }
        this.amg.sort(Comparator.comparingDouble(wl::ll));
    }

    private boolean a(b b2, ao ao2) {
        akd akd2 = Breaker.acy;
        if (akd2 == null) {
            return false;
        }
        akd akd3 = new akd((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5);
        b b3 = b2.x(ao2.asC());
        akd akd4 = new akd((double)b3.wt() + 0.5, (double)b3.wu() + 0.5, (double)b3.wx() + 0.5);
        double d2 = 4.5;
        return akd3.g(akd2) <= d2 || akd4.g(akd2) <= d2;
    }

    private wo a(b b2, ao ao2, double d2, double d3, double d4) {
        co co2 = null;
        double d5 = Double.MAX_VALUE;
        double d6 = 0.0;
        MapColor mapColor = null;
        akd akd2 = null;
        int n2 = 0;
        b b3 = b2.x(ao2.asC());
        b[] bArray = new b[]{b2, b3};
        int n3 = 8;
        double d7 = BedPlates.aER.bgK.gW;
        double d8 = BedPlates.aER.bgK.gX;
        double d9 = BedPlates.aER.bgK.gY;
        j j2 = BedPlates.aER.bgF;
        for (b d19 : bArray) {
            for (ao d21 : amv) {
                co co3;
                d d10;
                double d11;
                b b4 = d19.x(d21);
                IBlockState iBlockState = j2.L(b4);
                Block block = iBlockState.df();
                if (block instanceof BlockBed || block instanceof BlockAir || block instanceof BlockLiquid || !block.xb().zw() || (d11 = (double)block.b(j2, b4)) < 0.0) continue;
                ++n2;
                if (!(d11 < d5) || (d10 = block.e(j2, b4)) == null || (co3 = new co(d10, 1, block.f(j2, b4))).bP() == null) continue;
                double d12 = (double)b4.wt() + 0.5;
                double d13 = (double)b4.wu() + 0.5;
                double d14 = (double)b4.wx() + 0.5;
                double d15 = d12 - d7;
                double d16 = d13 - d8;
                double d17 = d14 - d9;
                co2 = co3;
                d6 = d15 * d15 + d16 * d16 + d17 * d17;
                mapColor = block.b(iBlockState);
                akd2 = new akd(d12, d13, d14);
                d5 = d11;
            }
        }
        if (n2 == 0) {
            co bl2 = new co(Items.cRe, 1, 0);
            double d18 = d2 - d7;
            double d19 = d3 - d8;
            double d20 = d4 - d9;
            double d21 = d18 * d18 + d19 * d19 + d20 * d20;
            return new wo(bl2, d21, MapColor.bdC, new akd(d2, d3, d4), false, true);
        }
        if (co2 != null) {
            boolean bl2 = n2 < 8;
            return new wo(co2, d6, mapColor, akd2, bl2, false);
        }
        return null;
    }

    private void li() {
        boolean bl2;
        boolean bl3;
        if (this.amg.isEmpty()) {
            return;
        }
        if (BedPlates.aER.bgR != null) {
            return;
        }
        this.aml = Math.sin((double)System.currentTimeMillis() / 600.0) * 0.5 + 0.5;
        ++this.amk;
        boolean bl4 = bl3 = this.amk >= 20;
        if (bl3) {
            this.amk = 0;
        }
        cz cz2 = BedPlates.aER.jY;
        int n2 = cz2.getScaleFactor();
        int n3 = Display.getHeight();
        double d2 = RenderManager.bVA;
        double d3 = RenderManager.bVB;
        double d4 = RenderManager.bVC;
        float f2 = BedPlates.aER.bgK.pl;
        float f3 = BedPlates.aER.bgK.pm;
        boolean bl5 = bl2 = !this.amm || d2 != this.amn || d3 != this.amo || d4 != this.amp || n2 != this.amq || n3 != this.amr || f2 != this.Il || f3 != this.Im;
        if (bl2) {
            this.amm = true;
            this.amn = d2;
            this.amo = d3;
            this.amp = d4;
            this.amq = n2;
            this.amr = n3;
            this.Il = f2;
            this.Im = f3;
        }
        for (wl wl2 : this.amg) {
            Object object;
            if (bl3) {
                object = wl2.lk();
                b b2 = new b(((akd)object).getX(), ((akd)object).getY(), ((akd)object).getZ());
                IBlockState iBlockState = BedPlates.aER.bgF.L(b2);
                if (!(iBlockState.df() instanceof BlockBed)) {
                    wl2.v(false);
                    continue;
                }
                wl2.v(true);
            }
            if (!wl2.ln()) continue;
            object = wl2.lo();
            wl2.lq();
            if (object == null || bl2 || wl2.lp() > 60) {
                object = this.a(wl2.lk(), d2, d3, d4, n2, n3);
                if (object == null) continue;
                wl2.a((double[])object);
            }
            if (object[2] < 0.0 || object[2] > 1.0) continue;
            this.a(wl2.lm(), (double)object[0], (double)object[1], 0);
        }
    }

    private void a(wo wo2, double d2, double d3, int n2) {
        double d4;
        double d5;
        double d6;
        double d7;
        co co2 = wo2.ls();
        if (co2 == null || co2.bP() == null) {
            return;
        }
        boolean bl2 = (Boolean)this.alX.wD();
        if (bl2 && (wo2.lx() || wo2.ly())) {
            co2 = new co(Items.cRe, 1, 0);
        }
        double d8 = wo2.lu();
        double d9 = 1.0;
        if (((Boolean)this.ama.wD()).booleanValue() && d8 > 10.0) {
            d9 = Math.max(0.5, 1.0 - (d8 - 10.0) / 80.0);
        }
        boolean bl3 = (Boolean)this.alZ.wD();
        double d10 = 4.0 * d9;
        double d11 = 16.0 * d9;
        double d12 = 1.05 * d9;
        double d13 = 8.0 * d9;
        if (bl2) {
            d7 = bl3 ? (double)this.amf.bQ(wo2.lz()) * d9 : 0.0;
            d6 = Math.max(d11 + d10 * 2.0, d7 + d10 * 4.0);
            d5 = d11 + d10 * 1.0;
        } else {
            d7 = (double)this.amd.tF() * d9;
            d4 = Math.max(d11, d7);
            double d14 = (double)this.amd.bQ(wo2.lt()) * d9;
            double d15 = bl3 ? (double)(this.ame.bQ("distance: ") + this.amf.bQ(wo2.lz())) * d9 : 0.0;
            double d16 = d11 + d10 * 3.0 + d14;
            d6 = Math.max(d16, d15 + d10 * 4.0);
            d5 = d4 + d10 * 1.0;
        }
        d7 = d2 - d6 / 2.0;
        d4 = d3 - d5 - d13 - 8.0 - (double)n2 * (d5 + d13 + 6.0);
        int n3 = this.lj();
        Color color = ady.sa();
        Color color2 = this.a(color, wo2.lv());
        Color color3 = this.rP().rQ();
        Color color4 = new Color(Math.min(255, color2.getRed() + color3.getRed() / 26), Math.min(255, color2.getGreen() + color3.getGreen() / 26), Math.min(255, color2.getBlue() + color3.getBlue() / 26), 180);
        Color color5 = this.rP().rQ();
        Color color6 = this.rP().rR();
        Color color7 = ais.a(color5, color6, this.aml);
        Color color8 = ais.a(color6, color5, this.aml);
        co co3 = co2;
        double d17 = d7;
        double d18 = d4;
        double d19 = d13;
        double d20 = d6;
        double d21 = d5;
        double d22 = d10;
        double d23 = d11;
        double d24 = d12;
        double d25 = d9;
        Color color9 = ais.d(abz.aAb.ql(), 105);
        Color color10 = color4;
        Color color11 = color7;
        Color color12 = color8;
        String string = wo2.lt();
        String string2 = wo2.lz();
        boolean bl4 = bl3;
        boolean bl5 = bl2;
        this.b(gg.kV).c(() -> {
            ait.a(d17, d18, d20, d19, n3, abz.aAb.ql(), true, true, false, false);
            ait.a(d17, d18 + d19, d20, d21, n3, abz.aAa.ql(), false, false, true, true);
        });
        this.b(gg.kT).c(() -> {
                ait.c(d17, d18, d20, d21 + d19, n3 + 1, this.rP().rU());
                if (bl4 && !bl5) {
                    String string2 = "distance: ";
                    double d8 = (double)this.ame.bQ(string2) * d25;
                    double d9 = (double)this.amf.bQ(string2) * d25;
                    double d10 = d8 + d9;
                    double d11 = d17 + (d20 - d10) / 2.0;
                    double d12 = d18 + d19 / 2.0 - 1.2 * d25;
                    GlStateManager.JV();
                    GlStateManager.C(d11, d12, 0.0);
                    GlStateManager.B(d25, d25, d25);
                    this.ame.a(string2, 0.0, 0.0, ais.d(this.rP().rQ(), 240).getRGB());
                    GlStateManager.JW();
                }
            });
        this.b(gg.kV).c(() -> {
            double d11;
            double d12;
            double d13;
            int n3 = Math.max(2, n3 - 1);
            ait.a(d17, d18, d20, d19, n3, color9, true, true, false, false);
            ait.a(d17, d18 + d19, d20, d21, n3, color10, false, false, true, true);
            if (((Boolean)this.alY.wD()).booleanValue()) {
                d13 = 2.5 * d25;
                ait.c(d17, d18, d20, d13, color11, color12);
            }
            if (bl4) {
                if (bl5) {
                    d13 = (double)this.amf.bQ(string2) * d25;
                    d12 = d17 + (d20 - d13) / 2.0;
                    d11 = d18 + d19 / 2.0 - 1.2 * d25;
                    GlStateManager.JV();
                    GlStateManager.C(d12, d11, 0.0);
                    GlStateManager.B(d25, d25, d25);
                    this.amf.a(string2, 0.0, 0.0, abz.aAc.qm());
                    GlStateManager.JW();
                } else {
                    String string3 = "distance: ";
                    double d14 = (double)this.ame.bQ(string3) * d25;
                    double d15 = (double)this.amf.bQ(string2) * d25;
                    double d16 = d14 + d15;
                    double d17 = d17 + (d20 - d16) / 2.0;
                    double d18 = d18 + d19 / 2.0 - 1.2 * d25;
                    GlStateManager.JV();
                    GlStateManager.C(d17, d18, 0.0);
                    GlStateManager.B(d25, d25, d25);
                    this.ame.a(string3, 0.0, 0.0, this.rP().rT().getRGB());
                    this.amf.a(string2, (float)(d14 / d25), 0.0, abz.aAc.qm());
                    GlStateManager.JW();
                }
            }
            double d19 = d18 + d19;
            if (bl5) {
                d12 = 16.0 * d24;
                d11 = d17 + (d20 - d12) / 2.0;
                double d20 = d19 + (d21 - d12) / 2.0;
                GlStateManager.JV();
                GlStateManager.tQ();
                GlStateManager.C(d11, d20, 0.0);
                GlStateManager.B(d24, d24, d24);
                RenderHelper.Lh();
                aER.BG().b(co3, 0.0, 0.0);
                RenderHelper.Lf();
                GlStateManager.JA();
                GlStateManager.JW();
            } else {
                d12 = 16.0 * d24;
                d11 = d17 + d22;
                double d21 = d19 + (d21 - d12) / 2.0;
                GlStateManager.JV();
                GlStateManager.tQ();
                GlStateManager.C(d11, d21, 0.0);
                GlStateManager.B(d24, d24, d24);
                RenderHelper.Lh();
                aER.BG().b(co3, 0.0, 0.0);
                RenderHelper.Lf();
                GlStateManager.JA();
                GlStateManager.JW();
                double d22 = d17 + d22 * 2.0 + d23;
                double d23 = d19 + d21 / 2.0 - ((double)this.amd.tF() / 2.0 - 1.5) * d25;
                GlStateManager.JV();
                GlStateManager.C(d22, d23, 0.0);
                GlStateManager.B(d25, d25, d25);
                this.amd.a(string, 0.0, 0.0, -2038554);
                GlStateManager.JW();
            }
        });
    }

    private double[] b(akd akd2) {
        return this.f(akd2.getX(), akd2.getY(), akd2.getZ());
    }

    private double[] f(double d2, double d3, double d4) {
        cz cz2 = BedPlates.aER.jY;
        int n2 = cz2.getScaleFactor();
        double d5 = RenderManager.bVA;
        double d6 = RenderManager.bVB;
        double d7 = RenderManager.bVC;
        int n3 = Display.getHeight();
        return this.a(d2, d3, d4, d5, d6, d7, n2, n3);
    }

    private double[] a(akd akd2, double d2, double d3, double d4, int n2, int n3) {
        return this.a(akd2.getX(), akd2.getY(), akd2.getZ(), d2, d3, d4, n2, n3);
    }

    private double[] a(double d2, double d3, double d4, double d5, double d6, double d7, int n2, int n3) {
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        if (GLU.gluProject((float)((float)d8), (float)((float)d9), (float)((float)d10), (FloatBuffer)ActiveRenderInfo.bHm, (FloatBuffer)ActiveRenderInfo.bHn, (IntBuffer)ActiveRenderInfo.bHl, (FloatBuffer)ActiveRenderInfo.bHo)) {
            float f2 = ActiveRenderInfo.bHo.get(0);
            float f3 = ActiveRenderInfo.bHo.get(1);
            float f4 = ActiveRenderInfo.bHo.get(2);
            double d11 = f2 / (float)n2;
            double d12 = ((float)n3 - f3) / (float)n2;
            return new double[]{d11, d12, f4};
        }
        return null;
    }

    private int lj() {
        return this.rP().pB();
    }

    private Color a(Color color, MapColor mapColor) {
        if (mapColor == null) {
            return color;
        }
        Color color2 = new Color(mapColor.bem | 0xFF000000, true);
        Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), color.getAlpha());
        return BedPlates.a(color, color3, 0.35f);
    }

    private static Color a(Color color, Color color2, float f2) {
        f2 = Math.max(0.0f, Math.min(1.0f, f2));
        int n2 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f2);
        int n3 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f2);
        int n4 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f2);
        int n5 = (int)((float)color.getAlpha() + (float)(color2.getAlpha() - color.getAlpha()) * f2);
        return new Color(n2, n3, n4, n5);
    }

    private static boolean a(List<wn> list, b b2) {
        for (wn wn2 : list) {
            if (!wn2.lr().equals(b2)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void a(int n2, b b2, double d2, double d3, double d4, int n3, w w2, double d5, boolean bl2) {
        try {
            ArrayList<wn> arrayList = new ArrayList<wn>();
            g g2 = new g();
            for (int i2 = -n2; i2 <= n2; ++i2) {
                int n4 = b2.wt() + i2;
                double d6 = (double)i2 + d2;
                double d7 = d6 * d6;
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    double d8 = (double)i3 + d3;
                    double d9 = d7 + d8 * d8;
                    if (d9 > d4) continue;
                    int n5 = b2.wx() + i3;
                    for (int i4 = -n3; i4 <= n3; ++i4) {
                        double d10;
                        double d11;
                        double d12;
                        int n6 = b2.wu() + i4;
                        if (n6 < 0 || n6 > 255) continue;
                        g2.E(n4, n6, n5);
                        IBlockState iBlockState = w2.L(g2);
                        Block block = iBlockState.df();
                        if (!(block instanceof BlockBed) || iBlockState.b(BlockBed.aTc) != BlockBed$EnumPartType.aTe || (d12 = d9 + (d11 = (d10 = (double)n6 + 0.5) - d5) * d11) > d4) continue;
                        b b3 = new b(n4, n6, n5);
                        ao ao2 = iBlockState.b(BlockBed.aTB);
                        if (bl2 && this.a(b3, ao2) || BedPlates.a(arrayList, b3)) continue;
                        arrayList.add(new wn(b3));
                    }
                }
            }
            this.amh.clear();
            this.amh.addAll(arrayList);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        finally {
            this.ams = false;
        }
    }
}

