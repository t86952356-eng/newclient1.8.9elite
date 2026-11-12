/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.a;
import hackclient.rise.agg;
import hackclient.rise.fv;
import hackclient.rise.gi;
import hackclient.rise.wt;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.d;
import net.minecraft.client.gui.ar;
import net.minecraft.client.gui.ay;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bi;
import net.minecraft.client.gui.cp;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.ai.attributes.e;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.util.an;
import net.minecraft.util.aw;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.cf;
import net.minecraft.util.cm;
import net.minecraft.util.ct;
import net.optifine.s;

public class z
extends b {
    private static final cm bnu = new cm("textures/misc/vignette.png");
    private static final cm bnv = new cm("textures/gui/widgets.png");
    private static final cm bnw = new cm("textures/misc/pumpkinblur.png");
    public final Random bnx = new Random();
    private final d bny;
    private final RenderItem bnz;
    private float aox;
    public ar bnA;
    public int bnB;
    private String bnC = "";
    private int bnD;
    private boolean bnE;
    public float bnF = 1.0f;
    private int bnG;
    private co bnH;
    private final ay bnI;
    private final cp bnJ;
    public final bi bnK;
    private int bnL;
    private String aAJ = "";
    private String bnM = "";
    private int bnN;
    private int bnO;
    private int bnP;
    private int bnQ = 0;
    private int bnR = 0;
    public long bnS = 0L;
    public long bnT = 0L;
    public int bnU;
    private static cz jY = new cz(d.AZ());

    public z(d d2) {
        this.bny = d2;
        this.bnz = d2.BG();
        this.bnI = new ay(d2);
        this.bnJ = new cp(d2);
        this.bnA = new ar(d2);
        this.bnK = new bi(d2, this);
        this.Eu();
    }

    public void Eu() {
        this.bnN = 10;
        this.bnO = 70;
        this.bnP = 20;
    }

    public void w(float f2) {
        if (jY.getScaledWidth() != this.bny.bgz || jY.getScaledHeight() != this.bny.bgA) {
            jY = new cz(this.bny);
        }
        int n2 = jY.getScaledWidth();
        int n3 = jY.getScaledHeight();
        GlStateManager.tQ();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.bny.Bq().a(b.icons);
        GlStateManager.tQ();
        if (this.bny.bgu.CZ()) {
            this.bnJ.a(jY, f2);
        }
        GlStateManager.tL();
        GlStateManager.h(770, 771, 1, 0);
        this.bny.bhw.eY("bossHealth");
        boolean bl2 = true;
        try {
            gi gi2;
            gi gi3 = gi2 = a.a != null && a.a.g() != null ? a.a.g().c(wt.class) : null;
            if (gi2 != null) {
                bl2 = gi2.isEnabled();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (bl2) {
            this.Ew();
        }
        this.bny.bhw.ajv();
        if (this.bny.bgu.Hp()) {
            this.g(jY);
        }
        GlStateManager.tR();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = n2 / 2 - 91;
        if (this.bny.aIY.cgR && !this.bny.bgu.CZ()) {
            this.e(jY);
        } else if (this.bny.bgK.CZ()) {
            this.bnJ.k(jY);
        }
        if (this.bny.aIY.bJS) {
            this.bnI.i(jY);
        }
        if (this.bnL > 0) {
            this.bny.bhw.eY("titleAndSubtitle");
            float f3 = (float)this.bnL - f2;
            int n5 = 255;
            if (this.bnL > this.bnP + this.bnO) {
                float f4 = (float)(this.bnN + this.bnO + this.bnP) - f3;
                n5 = (int)(f4 * 255.0f / (float)this.bnN);
            }
            if (this.bnL <= this.bnP) {
                n5 = (int)(f3 * 255.0f / (float)this.bnP);
            }
            if ((n5 = bt.F(n5, 0, 255)) > 8) {
                GlStateManager.JV();
                GlStateManager.j(n2 / 2, n3 / 2, 0.0f);
                GlStateManager.tQ();
                GlStateManager.h(770, 771, 1, 0);
                GlStateManager.JV();
                GlStateManager.i(4.0f, 4.0f, 4.0f);
                int n6 = n5 << 24 & 0xFF000000;
                this.EA().b(this.aAJ, -this.EA().bQ(this.aAJ) / 2, -10.0, 0xFFFFFF | n6, true);
                GlStateManager.JW();
                GlStateManager.JV();
                GlStateManager.i(2.0f, 2.0f, 2.0f);
                this.EA().b(this.bnM, -this.EA().bQ(this.bnM) / 2, 5.0, 0xFFFFFF | n6, true);
                GlStateManager.JW();
                GlStateManager.tR();
                GlStateManager.JW();
                if (this.bny.bgK.aRg <= 20) {
                    this.a("", "", -1, -1, -1);
                    this.Eu();
                }
            }
            this.bny.bhw.ajv();
        }
        GlStateManager.tQ();
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.Jy();
        GlStateManager.JV();
        GlStateManager.j(0.0f, n3 - 48, 0.0f);
        this.bny.bhw.eY("chat");
        this.bny.bhw.ajv();
        GlStateManager.JW();
        i i2 = this.bny.bgF.SD();
        g g2 = i2.gY(0);
        if (this.bny.aIY.chz.Re() && (!this.bny.Bf() || this.bny.bgK.bkd.Id().size() > 1 || g2 != null)) {
            this.bnK.ad(true);
            this.bnK.a(n2, i2, g2);
        } else {
            this.bnK.ad(false);
        }
    }

    protected void a(cz cz2, float f2) {
        if (this.bny.BC() instanceof net.minecraft.entity.player.a) {
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.bny.Bq().a(bnv);
            net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)this.bny.BC();
            int n2 = cz2.getScaledWidth() / 2;
            float f3 = zLevel;
            zLevel = -90.0f;
            this.drawTexturedModalRect((float)(n2 - 91), cz2.getScaledHeight() - 22, 0, 0, 182, 22);
            this.drawTexturedModalRect(this.aox, cz2.getScaledHeight() - 22 - 1, 0, 22, 24, 22);
            zLevel = f3;
            GlStateManager.JS();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            RenderHelper.Lh();
            for (int i2 = 0; i2 < 9; ++i2) {
                int n3 = cz2.getScaledWidth() / 2 - 90 + i2 * 20 + 2;
                int n4 = cz2.getScaledHeight() - 16 - 3;
                this.b(i2, n3, n4, f2, a2);
            }
            RenderHelper.Lf();
            GlStateManager.JT();
            GlStateManager.tR();
        }
    }

    public void a(cz cz2, int n2) {
        this.bny.bhw.eY("jumpBar");
        this.bny.Bq().a(b.icons);
        float f2 = this.bny.bgK.DA();
        int n3 = 182;
        int n4 = (int)(f2 * 183.0f);
        int n5 = cz2.getScaledHeight() - 32 + 3;
        this.drawTexturedModalRect((float)n2, n5, 0, 84, 182, 5);
        if (n4 > 0) {
            this.drawTexturedModalRect((float)n2, n5, 0, 89, n4, 5);
        }
        this.bny.bhw.ajv();
    }

    public void b(cz cz2, int n2) {
        int n3;
        int n4;
        this.bny.bhw.eY("expBar");
        this.bny.Bq().a(b.icons);
        int n5 = this.bny.bgK.abX();
        if (n5 > 0) {
            n4 = 182;
            int n6 = (int)(this.bny.bgK.cIw * 183.0f);
            n3 = cz2.getScaledHeight() - 32 + 3;
            this.drawTexturedModalRect((float)n2, n3, 0, 64, 182, 5);
            if (n6 > 0) {
                this.drawTexturedModalRect((float)n2, n3, 0, 69, n6, 5);
            }
        }
        this.bny.bhw.ajv();
        if (this.bny.bgK.cIu > 0) {
            this.bny.bhw.eY("expLevel");
            n4 = 8453920;
            if (net.minecraft.src.a.aow()) {
                n4 = s.jb(n4);
            }
            String string = "" + this.bny.bgK.cIu;
            n3 = (cz2.getScaledWidth() - this.EA().bQ(string)) / 2;
            int n7 = cz2.getScaledHeight() - 31 - 4;
            this.EA().a(string, (double)(n3 + 1), (double)(n7 - 7), 0);
            this.EA().a(string, (double)(n3 - 1), (double)(n7 - 7), 0);
            this.EA().a(string, (double)n3, (double)(n7 + 1 - 7), 0);
            this.EA().a(string, (double)n3, (double)(n7 - 1 - 7), 0);
            this.EA().a(string, (double)n3, (double)(n7 - 7), n4);
            this.bny.bhw.ajv();
        }
    }

    public void e(cz cz2) {
        this.bny.bhw.eY("selectedItemName");
        if (this.bnG > 0 && this.bnH != null) {
            int n2;
            Object object = this.bnH.getDisplayName();
            if (this.bnH.aen()) {
                object = String.valueOf((Object)an.dwg) + (String)object;
            }
            int n3 = (cz2.getScaledWidth() - this.EA().bQ((String)object)) / 2;
            int n4 = cz2.getScaledHeight() - 59;
            if (!this.bny.bgu.Hp()) {
                n4 += 14;
            }
            if ((n2 = (int)((float)this.bnG * 256.0f / 10.0f)) > 255) {
                n2 = 255;
            }
            if (n2 > 0) {
                GlStateManager.JV();
                GlStateManager.tQ();
                GlStateManager.h(770, 771, 1, 0);
                this.EA().b((String)object, n3, n4, 0xFFFFFF + (n2 << 24));
                GlStateManager.tR();
                GlStateManager.JW();
            }
        }
        this.bny.bhw.ajv();
    }

    public void f(cz cz2) {
        this.bny.bhw.eY("demo");
        String string = this.bny.bgF.getTotalWorldTime() >= 120500L ? I18n.a("demo.demoExpired", new Object[0]) : I18n.a("demo.remainingTime", ct.hU((int)(120500L - this.bny.bgF.getTotalWorldTime())));
        int n2 = this.EA().bQ(string);
        this.EA().b(string, cz2.getScaledWidth() - n2 - 10, 5.0, 0xFFFFFF);
        this.bny.bhw.ajv();
    }

    public boolean Ev() {
        if (this.bny.aIY.bJS && !this.bny.bgK.acd() && !this.bny.aIY.cgJ) {
            return false;
        }
        if (this.bny.bgu.CZ()) {
            if (this.bny.bgM != null) {
                return true;
            }
            if (this.bny.bhc != null && this.bny.bhc.dzu == cf.dzy) {
                net.minecraft.util.b b2 = this.bny.bhc.dg();
                return this.bny.bgF.K(b2) instanceof ab;
            }
            return false;
        }
        return true;
    }

    private void g(cz cz2) {
        if (this.bny.BC() instanceof net.minecraft.entity.player.a) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            boolean bl2;
            net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)this.bny.BC();
            int n9 = bt.bM(a2.getHealth());
            boolean bl3 = bl2 = this.bnT > (long)this.bnB && (this.bnT - (long)this.bnB) / 3L % 2L == 1L;
            if (this.bnS == -50L) {
                this.bny.bgu.d(null, null);
            }
            if (n9 < this.bnQ && a2.csA > 0) {
                this.bnS = d.Bj();
                this.bnT = this.bnB + 20;
            } else if (n9 > this.bnQ && a2.csA > 0) {
                this.bnS = d.Bj();
                this.bnT = this.bnB + 10;
            }
            if (d.Bj() - this.bnS > 1000L) {
                this.bnQ = n9;
                this.bnR = n9;
                this.bnS = d.Bj();
            }
            this.bnQ = n9;
            int n10 = this.bnR;
            this.bnx.setSeed((long)this.bnB * 312871L);
            boolean bl4 = false;
            aw aw2 = a2.abY();
            int n11 = aw2.getFoodLevel();
            e e2 = a2.a(aj.cwm);
            int n12 = cz2.getScaledWidth() / 2 - 91;
            int n13 = cz2.getScaledWidth() / 2 + 91;
            int n14 = cz2.getScaledHeight() - 39;
            float f2 = (float)e2.XB();
            float f3 = a2.Wi();
            int n15 = bt.bM((f2 + f3) / 2.0f / 10.0f);
            int n16 = Math.max(10 - (n15 - 2), 3);
            int n17 = n14 - (n15 - 1) * n16 - 10;
            float f4 = f3;
            int n18 = a2.VQ();
            int n19 = -1;
            if (a2.a(net.minecraft.potion.a.dgF)) {
                n19 = this.bnB % bt.bM(f2 + 5.0f);
            }
            this.bny.bhw.eY("armor");
            for (n8 = 0; n8 < 10; ++n8) {
                if (n18 <= 0) continue;
                n7 = n12 + n8 * 8;
                if (n8 * 2 + 1 < n18) {
                    this.drawTexturedModalRect((float)n7, n17, 34, 9, 9, 9);
                }
                if (n8 * 2 + 1 == n18) {
                    this.drawTexturedModalRect((float)n7, n17, 25, 9, 9, 9);
                }
                if (n8 * 2 + 1 <= n18) continue;
                this.drawTexturedModalRect((float)n7, n17, 16, 9, 9, 9);
            }
            this.bny.bhw.fa("health");
            for (n8 = bt.bM((f2 + f3) / 2.0f) - 1; n8 >= 0; --n8) {
                n7 = 16;
                if (a2.a(net.minecraft.potion.a.dgO)) {
                    n7 += 36;
                } else if (a2.a(net.minecraft.potion.a.dgP)) {
                    n7 += 72;
                }
                n6 = 0;
                if (bl2) {
                    n6 = 1;
                }
                n5 = bt.bM((float)(n8 + 1) / 10.0f) - 1;
                n4 = n12 + n8 % 10 * 8;
                n3 = n14 - n5 * n16;
                if (n9 <= 4) {
                    n3 += this.bnx.nextInt(2);
                }
                if (n8 == n19) {
                    n3 -= 2;
                }
                n2 = 0;
                if (a2.baU.avH().azv()) {
                    n2 = 5;
                }
                this.drawTexturedModalRect((float)n4, n3, 16 + n6 * 9, 9 * n2, 9, 9);
                if (bl2) {
                    if (n8 * 2 + 1 < n10) {
                        this.drawTexturedModalRect((float)n4, n3, n7 + 54, 9 * n2, 9, 9);
                    }
                    if (n8 * 2 + 1 == n10) {
                        this.drawTexturedModalRect((float)n4, n3, n7 + 63, 9 * n2, 9, 9);
                    }
                }
                if (f4 <= 0.0f) {
                    if (n8 * 2 + 1 < n9) {
                        this.drawTexturedModalRect((float)n4, n3, n7 + 36, 9 * n2, 9, 9);
                    }
                    if (n8 * 2 + 1 != n9) continue;
                    this.drawTexturedModalRect((float)n4, n3, n7 + 45, 9 * n2, 9, 9);
                    continue;
                }
                if (f4 == f3 && f3 % 2.0f == 1.0f) {
                    this.drawTexturedModalRect((float)n4, n3, n7 + 153, 9 * n2, 9, 9);
                } else {
                    this.drawTexturedModalRect((float)n4, n3, n7 + 144, 9 * n2, 9, 9);
                }
                f4 -= 2.0f;
            }
            c c2 = a2.crC;
            if (c2 == null) {
                this.bny.bhw.fa("food");
                for (n7 = 0; n7 < 10; ++n7) {
                    n6 = n14;
                    n5 = 16;
                    n4 = 0;
                    if (a2.a(net.minecraft.potion.a.dgM)) {
                        n5 += 36;
                        n4 = 13;
                    }
                    if (a2.abY().getSaturationLevel() <= 0.0f && this.bnB % (n11 * 3 + 1) == 0) {
                        n6 = n14 + (this.bnx.nextInt(3) - 1);
                    }
                    n3 = n13 - n7 * 8 - 9;
                    this.drawTexturedModalRect((float)n3, n6, 16 + n4 * 9, 27, 9, 9);
                    if (n7 * 2 + 1 < n11) {
                        this.drawTexturedModalRect((float)n3, n6, n5 + 36, 27, 9, 9);
                    }
                    if (n7 * 2 + 1 != n11) continue;
                    this.drawTexturedModalRect((float)n3, n6, n5 + 45, 27, 9, 9);
                }
                a.a.e().d(new fv(cz2));
            } else if (c2 instanceof r) {
                this.bny.bhw.fa("mountHealth");
                r r2 = (r)c2;
                n6 = (int)Math.ceil(r2.getHealth());
                float f5 = r2.getMaxHealth();
                n4 = (int)(f5 + 0.5f) / 2;
                if (n4 > 30) {
                    n4 = 30;
                }
                n3 = n14;
                n2 = 0;
                while (n4 > 0) {
                    int n20 = Math.min(n4, 10);
                    n4 -= n20;
                    for (int i2 = 0; i2 < n20; ++i2) {
                        int n21 = 52;
                        int n22 = n13 - i2 * 8 - 9;
                        this.drawTexturedModalRect((float)n22, n3, 52, 9, 9, 9);
                        if (i2 * 2 + 1 + n2 < n6) {
                            this.drawTexturedModalRect((float)n22, n3, 88, 9, 9, 9);
                        }
                        if (i2 * 2 + 1 + n2 != n6) continue;
                        this.drawTexturedModalRect((float)n22, n3, 97, 9, 9, 9);
                    }
                    n3 -= 10;
                    n2 += 20;
                }
            }
            this.bny.bhw.fa("air");
            if (a2.c(Material.bev)) {
                int n23 = this.bny.bgK.Uc();
                n6 = bt.aI((double)(n23 - 2) * 10.0 / 300.0);
                int n24 = bt.aI((double)n23 * 10.0 / 300.0) - n6;
                for (n4 = 0; n4 < n6 + n24; ++n4) {
                    if (n4 < n6) {
                        this.drawTexturedModalRect((float)(n13 - n4 * 8 - 9), n17, 16, 18, 9, 9);
                        continue;
                    }
                    this.drawTexturedModalRect((float)(n13 - n4 * 8 - 9), n17, 25, 18, 9, 9);
                }
            }
            this.bny.bhw.ajv();
        }
    }

    private void Ew() {
        if (net.minecraft.entity.boss.a.cAY != null && net.minecraft.entity.boss.a.cAX > 0) {
            --net.minecraft.entity.boss.a.cAX;
            cz cz2 = this.bny.jY;
            int n2 = cz2.getScaledWidth();
            int n3 = 182;
            int n4 = n2 / 2 - 91;
            int n5 = (int)(net.minecraft.entity.boss.a.cAW * 183.0f);
            int n6 = 12;
            this.drawTexturedModalRect((float)n4, 12, 0, 74, 182, 5);
            this.drawTexturedModalRect((float)n4, 12, 0, 74, 182, 5);
            if (n5 > 0) {
                this.drawTexturedModalRect((float)n4, 12, 0, 79, n5, 5);
            }
            String string = net.minecraft.entity.boss.a.cAY;
            this.EA().b(string, n2 / 2 - this.EA().bQ(string) / 2, 2.0, 0xFFFFFF);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.bny.Bq().a(icons);
        }
    }

    private void h(cz cz2) {
        GlStateManager.JD();
        GlStateManager.an(false);
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.Jy();
        this.bny.Bq().a(bnw);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(0.0, cz2.getScaledHeight(), -90.0).r(0.0, 1.0).Lx();
        worldRenderer.F(cz2.getScaledWidth(), cz2.getScaledHeight(), -90.0).r(1.0, 1.0).Lx();
        worldRenderer.F(cz2.getScaledWidth(), 0.0, -90.0).r(1.0, 0.0).Lx();
        worldRenderer.F(0.0, 0.0, -90.0).r(0.0, 0.0).Lx();
        tessellator.pZ();
        GlStateManager.an(true);
        GlStateManager.JE();
        GlStateManager.tL();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void a(float f2, cz cz2) {
        if (!net.minecraft.src.a.anZ()) {
            GlStateManager.JE();
            GlStateManager.h(770, 771, 1, 0);
        } else {
            f2 = 1.0f - f2;
            f2 = bt.I(f2, 0.0f, 1.0f);
            net.minecraft.world.border.c c2 = this.bny.bgF.Sv();
            float f3 = (float)c2.aD(this.bny.bgK);
            double d2 = Math.min(c2.axu() * (double)c2.getWarningTime() * 1000.0, Math.abs(c2.getTargetSize() - c2.axq()));
            double d3 = Math.max((double)c2.getWarningDistance(), d2);
            f3 = (double)f3 < d3 ? 1.0f - (float)((double)f3 / d3) : 0.0f;
            this.bnF = (float)((double)this.bnF + (double)(f2 - this.bnF) * 0.01);
            GlStateManager.JD();
            GlStateManager.an(false);
            GlStateManager.h(0, 769, 1, 0);
            if (f3 > 0.0f) {
                GlStateManager.e(0.0f, f3, f3, 1.0f);
            } else {
                GlStateManager.e(this.bnF, this.bnF, this.bnF, 1.0f);
            }
            this.bny.Bq().a(bnu);
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            worldRenderer.a(7, DefaultVertexFormats.cbG);
            worldRenderer.F(0.0, cz2.getScaledHeight(), -90.0).r(0.0, 1.0).Lx();
            worldRenderer.F(cz2.getScaledWidth(), cz2.getScaledHeight(), -90.0).r(1.0, 1.0).Lx();
            worldRenderer.F(cz2.getScaledWidth(), 0.0, -90.0).r(1.0, 0.0).Lx();
            worldRenderer.F(0.0, 0.0, -90.0).r(0.0, 0.0).Lx();
            tessellator.pZ();
            GlStateManager.an(true);
            GlStateManager.JE();
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.h(770, 771, 1, 0);
        }
    }

    private void b(float f2, cz cz2) {
        if (f2 < 1.0f) {
            f2 *= f2;
            f2 *= f2;
            f2 = f2 * 0.8f + 0.2f;
        }
        GlStateManager.Jy();
        GlStateManager.JD();
        GlStateManager.an(false);
        GlStateManager.h(770, 771, 1, 0);
        GlStateManager.e(1.0f, 1.0f, 1.0f, f2);
        this.bny.Bq().a(TextureMap.bZE);
        TextureAtlasSprite textureAtlasSprite = this.bny.BE().IY().A(Blocks.cNa.xM());
        float f3 = textureAtlasSprite.NY();
        float f4 = textureAtlasSprite.Oa();
        float f5 = textureAtlasSprite.NZ();
        float f6 = textureAtlasSprite.Ob();
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(0.0, cz2.getScaledHeight(), -90.0).r(f3, f6).Lx();
        worldRenderer.F(cz2.getScaledWidth(), cz2.getScaledHeight(), -90.0).r(f5, f6).Lx();
        worldRenderer.F(cz2.getScaledWidth(), 0.0, -90.0).r(f5, f4).Lx();
        worldRenderer.F(0.0, 0.0, -90.0).r(f3, f4).Lx();
        tessellator.pZ();
        GlStateManager.an(true);
        GlStateManager.JE();
        GlStateManager.tL();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void b(int n2, int n3, int n4, float f2, net.minecraft.entity.player.a a2) {
        co co2 = a2.cHV.cJC[n2];
        if (co2 != null) {
            float f3 = (float)co2.cXc - f2;
            if (f3 > 0.0f) {
                GlStateManager.JV();
                float f4 = 1.0f + f3 / 5.0f;
                GlStateManager.j(n3 + 8, n4 + 12, 0.0f);
                GlStateManager.i(1.0f / f4, (f4 + 1.0f) / 2.0f, 1.0f);
                GlStateManager.j(-(n3 + 8), -(n4 + 12), 0.0f);
            }
            this.bnz.b(co2, n3, n4);
            if (f3 > 0.0f) {
                GlStateManager.JW();
            }
            this.bnz.a(this.bny.fontRendererObj, co2, n3, n4);
        }
    }

    public void Ex() {
        if (this.bnD > 0) {
            --this.bnD;
        }
        if (this.bnL > 0) {
            --this.bnL;
            if (this.bnL <= 0) {
                this.aAJ = "";
                this.bnM = "";
            }
        }
        ++this.bnB;
        if (this.bny.bgK != null) {
            co co2 = this.bny.bgK.cHV.cJC[this.bny.bgK.cHV.cJE];
            if (co2 == null) {
                this.bnG = 0;
            } else if (this.bnH != null && co2.bP() == this.bnH.bP() && co.c(co2, this.bnH) && (co2.aed() || co2.yc() == this.bnH.yc())) {
                if (this.bnG > 0) {
                    --this.bnG;
                }
            } else {
                this.bnG = 40;
            }
            this.bnH = co2;
        }
    }

    public void cL(String string) {
        this.g(I18n.a("record.nowPlaying", string), true);
    }

    public void g(String string, boolean bl2) {
        this.bnC = string;
        this.bnD = 60;
        this.bnE = bl2;
    }

    public void a(String string, String string2, int n2, int n3, int n4) {
        if (string == null && string2 == null && n2 < 0 && n3 < 0 && n4 < 0) {
            this.aAJ = "";
            this.bnM = "";
            this.bnL = 0;
        } else if (string != null) {
            this.aAJ = string;
            this.bnL = this.bnN + this.bnO + this.bnP;
        } else if (string2 != null) {
            this.bnM = string2;
        } else {
            if (n2 >= 0) {
                this.bnN = n2;
            }
            if (n3 >= 0) {
                this.bnO = n3;
            }
            if (n4 >= 0) {
                this.bnP = n4;
            }
            if (this.bnL > 0) {
                this.bnL = this.bnN + this.bnO + this.bnP;
            }
        }
    }

    public void a(ba ba2, boolean bl2) {
        this.g(ba2.arq(), bl2);
    }

    public ar Ey() {
        return this.bnA;
    }

    public int Ez() {
        return this.bnB;
    }

    public agg EA() {
        return this.bny.fontRendererObj;
    }

    public cp EB() {
        return this.bnJ;
    }

    public bi EC() {
        return this.bnK;
    }

    public void ED() {
        this.bnK.Fy();
    }
}

