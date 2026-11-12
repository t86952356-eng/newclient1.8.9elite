/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui.achievement;

import hackclient.rise.agg;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.d;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cw;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.z;
import net.minecraft.stats.a;
import net.minecraft.stats.m;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.util.t;
import org.lwjgl.input.Mouse;

public class b
extends bp
implements cw {
    private static final int buS = net.minecraft.stats.b.doz * 24 - 112;
    private static final int buT = net.minecraft.stats.b.doA * 24 - 112;
    private static final int buU = net.minecraft.stats.b.doB * 24 - 77;
    private static final int buV = net.minecraft.stats.b.doC * 24 - 77;
    private static final cm buW = new cm("textures/gui/achievement/achievement_background.png");
    protected bp bln;
    private static final d buX = d.AZ();
    protected int buY = 256;
    protected int buZ = 202;
    protected int bva;
    protected int bvb;
    protected float bvc = 1.0f;
    protected double bvd;
    protected double bve;
    protected double bvf;
    protected double bvg;
    protected double bvh;
    protected double bvi;
    private int bvj;
    private final m bvk;
    private boolean bvl = true;

    public b(bp bp2, m m2) {
        this.bln = bp2;
        this.bvk = m2;
        int n2 = 141;
        int n3 = 141;
        this.bvf = this.bvh = (double)(net.minecraft.stats.b.doE.dos * 24 - 70 - 12);
        this.bvd = this.bvh;
        this.bvg = this.bvi = (double)(net.minecraft.stats.b.doE.dot * 24 - 70);
        this.bve = this.bvi;
    }

    @Override
    public void initGui() {
        buX.AU().u(new z(aa.dbQ));
        this.buttonList.clear();
        this.buttonList.add(new as(1, this.width / 2 + 24, this.height / 2 + 74, 80, 20, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (!this.bvl && c2.id == 1) {
            buX.a(this.bln);
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == b.buX.aIY.cht.cO()) {
            buX.a((bp)null);
            buX.AK();
        } else {
            super.keyTyped(c2, n2);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (this.bvl) {
            this.drawDefaultBackground();
            this.drawCenteredString(this.fontRendererObj, I18n.a("multiplayer.downloadingStats", new Object[0]), this.width / 2, this.height / 2, 0xFFFFFF);
            this.drawCenteredString(this.fontRendererObj, btV[(int)(d.Bj() / 150L % (long)btV.length)], this.width / 2, this.height / 2 + agg.aIF * 2, 0xFFFFFF);
        } else {
            int n4;
            if (Mouse.isButtonDown((int)0)) {
                n4 = (this.width - this.buY) / 2;
                int n5 = (this.height - this.buZ) / 2;
                int n6 = n4 + 8;
                int n7 = n5 + 17;
                if ((this.bvj == 0 || this.bvj == 1) && n2 >= n6 && n2 < n6 + 224 && n3 >= n7 && n3 < n7 + 155) {
                    if (this.bvj == 0) {
                        this.bvj = 1;
                    } else {
                        this.bvf -= (double)((float)(n2 - this.bva) * this.bvc);
                        this.bvg -= (double)((float)(n3 - this.bvb) * this.bvc);
                        this.bvh = this.bvd = this.bvf;
                        this.bvi = this.bve = this.bvg;
                    }
                    this.bva = n2;
                    this.bvb = n3;
                }
            } else {
                this.bvj = 0;
            }
            n4 = Mouse.getDWheel();
            float f3 = this.bvc;
            if (n4 < 0) {
                this.bvc += 0.25f;
            } else if (n4 > 0) {
                this.bvc -= 0.25f;
            }
            this.bvc = bt.I(this.bvc, 1.0f, 2.0f);
            if (this.bvc != f3) {
                float f4 = f3 - this.bvc;
                float f5 = f3 * (float)this.buY;
                float f6 = f3 * (float)this.buZ;
                float f7 = this.bvc * (float)this.buY;
                float f8 = this.bvc * (float)this.buZ;
                this.bvf -= (double)((f7 - f5) * 0.5f);
                this.bvg -= (double)((f8 - f6) * 0.5f);
                this.bvh = this.bvd = this.bvf;
                this.bvi = this.bve = this.bvg;
            }
            if (this.bvh < (double)buS) {
                this.bvh = buS;
            }
            if (this.bvi < (double)buT) {
                this.bvi = buT;
            }
            if (this.bvh >= (double)buU) {
                this.bvh = buU - 1;
            }
            if (this.bvi >= (double)buV) {
                this.bvi = buV - 1;
            }
            this.drawDefaultBackground();
            this.h(n2, n3, f2);
            GlStateManager.JA();
            GlStateManager.JD();
            this.GA();
            GlStateManager.Jz();
            GlStateManager.JE();
        }
    }

    @Override
    public void Gn() {
        if (this.bvl) {
            this.bvl = false;
        }
    }

    @Override
    public void updateScreen() {
        if (!this.bvl) {
            this.bvd = this.bvf;
            this.bve = this.bvg;
            double d2 = this.bvh - this.bvf;
            double d3 = this.bvi - this.bvg;
            if (d2 * d2 + d3 * d3 < 4.0) {
                this.bvf += d2;
                this.bvg += d3;
            } else {
                this.bvf += d2 * 0.85;
                this.bvg += d3 * 0.85;
            }
        }
    }

    protected void GA() {
        int n2 = (this.width - this.buY) / 2;
        int n3 = (this.height - this.buZ) / 2;
        this.fontRendererObj.a(I18n.a("gui.achievements", new Object[0]), (double)(n2 + 15), (double)(n3 + 5), 0x404040);
    }

    protected void h(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = bt.aF(this.bvd + (this.bvf - this.bvd) * (double)f2);
        int n10 = bt.aF(this.bve + (this.bvg - this.bve) * (double)f2);
        if (n9 < buS) {
            n9 = buS;
        }
        if (n10 < buT) {
            n10 = buT;
        }
        if (n9 >= buU) {
            n9 = buU - 1;
        }
        if (n10 >= buV) {
            n10 = buV - 1;
        }
        int n11 = (this.width - this.buY) / 2;
        int n12 = (this.height - this.buZ) / 2;
        int n13 = n11 + 16;
        int n14 = n12 + 17;
        zLevel = 0.0f;
        GlStateManager.cJ(518);
        GlStateManager.JV();
        GlStateManager.j(n13, n14, -200.0f);
        GlStateManager.i(1.0f / this.bvc, 1.0f / this.bvc, 0.0f);
        GlStateManager.JN();
        GlStateManager.JA();
        GlStateManager.JS();
        GlStateManager.JB();
        int n15 = n9 + 288 >> 4;
        int n16 = n10 + 288 >> 4;
        int n17 = (n9 + 288) % 16;
        int n18 = (n10 + 288) % 16;
        int n19 = 4;
        int n20 = 8;
        int n21 = 10;
        int n22 = 22;
        int n23 = 37;
        Random random = new Random();
        float f3 = 16.0f / this.bvc;
        float f4 = 16.0f / this.bvc;
        int n24 = 0;
        while ((float)n24 * f3 - (float)n18 < 155.0f) {
            float f5 = 0.6f - (float)(n16 + n24) / 25.0f * 0.3f;
            GlStateManager.e(f5, f5, f5, 1.0f);
            n8 = 0;
            while ((float)n8 * f4 - (float)n17 < 224.0f) {
                random.setSeed(buX.Bl().getPlayerID().hashCode() + n15 + n8 + (n16 + n24) * 16);
                n7 = random.nextInt(1 + n16 + n24) + (n16 + n24) / 2;
                TextureAtlasSprite textureAtlasSprite = this.z(Blocks.cLo);
                if (n7 <= 37 && n16 + n24 != 35) {
                    if (n7 == 22) {
                        textureAtlasSprite = random.nextInt(2) == 0 ? this.z(Blocks.cMi) : this.z(Blocks.cME);
                    } else if (n7 == 10) {
                        textureAtlasSprite = this.z(Blocks.cLr);
                    } else if (n7 == 8) {
                        textureAtlasSprite = this.z(Blocks.cLs);
                    } else if (n7 > 4) {
                        textureAtlasSprite = this.z(Blocks.cLd);
                    } else if (n7 > 0) {
                        textureAtlasSprite = this.z(Blocks.cLf);
                    }
                } else {
                    Block block = Blocks.cLj;
                    textureAtlasSprite = this.z(block);
                }
                buX.Bq().a(TextureMap.bZE);
                this.drawTexturedModalRect(n8 * 16 - n17, n24 * 16 - n18, textureAtlasSprite, 16, 16);
                ++n8;
            }
            ++n24;
        }
        GlStateManager.JE();
        GlStateManager.cJ(515);
        buX.Bq().a(buW);
        for (n24 = 0; n24 < net.minecraft.stats.b.doD.size(); ++n24) {
            a a2 = net.minecraft.stats.b.doD.get(n24);
            if (a2.dou == null) continue;
            n8 = a2.dos * 24 - n9 + 11;
            n7 = a2.dot * 24 - n10 + 11;
            int n25 = a2.dou.dos * 24 - n9 + 11;
            int n26 = a2.dou.dot * 24 - n10 + 11;
            n6 = this.bvk.d(a2) ? 1 : 0;
            n5 = this.bvk.e(a2);
            int n27 = this.bvk.f(a2);
            if (n27 > 4) continue;
            n4 = -16777216;
            if (n6 != 0) {
                n4 = -6250336;
            } else if (n5 != 0) {
                n4 = -16711936;
            }
            this.drawHorizontalLine(n8, n25, n7, n4);
            this.drawVerticalLine(n25, n7, n26, n4);
            if (n8 > n25) {
                this.drawTexturedModalRect((float)(n8 - 11 - 7), n7 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n8 < n25) {
                this.drawTexturedModalRect((float)(n8 + 11), n7 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n7 > n26) {
                this.drawTexturedModalRect((float)(n8 - 5), n7 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n7 >= n26) continue;
            this.drawTexturedModalRect((float)(n8 - 5), n7 + 11, 96, 241, 11, 7);
        }
        a a3 = null;
        float f6 = (float)(n2 - n13) * this.bvc;
        float f7 = (float)(n3 - n14) * this.bvc;
        RenderHelper.Lh();
        GlStateManager.JA();
        GlStateManager.JS();
        GlStateManager.JB();
        for (n7 = 0; n7 < net.minecraft.stats.b.doD.size(); ++n7) {
            float f8;
            a a4 = net.minecraft.stats.b.doD.get(n7);
            int n28 = a4.dos * 24 - n9;
            n6 = a4.dot * 24 - n10;
            if (n28 < -24 || n6 < -24 || !((float)n28 <= 224.0f * this.bvc) || !((float)n6 <= 155.0f * this.bvc)) continue;
            n5 = this.bvk.f(a4);
            if (this.bvk.d(a4)) {
                f8 = 0.75f;
                GlStateManager.e(0.75f, 0.75f, 0.75f, 1.0f);
            } else if (this.bvk.e(a4)) {
                f8 = 1.0f;
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            } else if (n5 < 3) {
                f8 = 0.3f;
                GlStateManager.e(0.3f, 0.3f, 0.3f, 1.0f);
            } else if (n5 == 3) {
                f8 = 0.2f;
                GlStateManager.e(0.2f, 0.2f, 0.2f, 1.0f);
            } else {
                if (n5 != 4) continue;
                f8 = 0.1f;
                GlStateManager.e(0.1f, 0.1f, 0.1f, 1.0f);
            }
            buX.Bq().a(buW);
            if (a4.apq()) {
                this.drawTexturedModalRect((float)(n28 - 2), n6 - 2, 26, 202, 26, 26);
            } else {
                this.drawTexturedModalRect((float)(n28 - 2), n6 - 2, 0, 202, 26, 26);
            }
            if (!this.bvk.e(a4)) {
                f8 = 0.1f;
                GlStateManager.e(0.1f, 0.1f, 0.1f, 1.0f);
                this.itemRender.ar(false);
            }
            GlStateManager.Jz();
            GlStateManager.JH();
            this.itemRender.b(a4.dox, n28 + 3, n6 + 3);
            GlStateManager.P(770, 771);
            GlStateManager.JA();
            if (!this.bvk.e(a4)) {
                this.itemRender.ar(true);
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            if (!(f6 >= (float)n28) || !(f6 <= (float)(n28 + 22)) || !(f7 >= (float)n6) || !(f7 <= (float)(n6 + 22))) continue;
            a3 = a4;
        }
        GlStateManager.JD();
        GlStateManager.tQ();
        GlStateManager.JW();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        buX.Bq().a(buW);
        this.drawTexturedModalRect((float)n11, n12, 0, 0, this.buY, this.buZ);
        zLevel = 0.0f;
        GlStateManager.cJ(515);
        GlStateManager.JD();
        GlStateManager.JN();
        super.drawScreen(n2, n3, f2);
        if (a3 != null) {
            String string = a3.app().arq();
            String string2 = a3.getDescription();
            int n29 = n2 + 12;
            n6 = n3 - 4;
            n5 = this.bvk.f(a3);
            if (this.bvk.e(a3)) {
                int n30 = Math.max(this.fontRendererObj.bQ(string), 120);
                n4 = this.fontRendererObj.l(string2, n30);
                if (this.bvk.d(a3)) {
                    n4 += 12;
                }
                this.drawGradientRect(n29 - 3, n6 - 3, n29 + n30 + 3, n6 + n4 + 3 + 12, -1073741824, -1073741824);
                this.fontRendererObj.a(string2, n29, n6 + 12, n30, -6250336);
                if (this.bvk.d(a3)) {
                    this.fontRendererObj.b(I18n.a("achievement.taken", new Object[0]), n29, n6 + n4 + 4, -7302913);
                }
            } else if (n5 == 3) {
                string = I18n.a("achievement.unknown", new Object[0]);
                int n31 = Math.max(this.fontRendererObj.bQ(string), 120);
                String string3 = new t("achievement.requires", a3.dou.app()).arq();
                int n32 = this.fontRendererObj.l(string3, n31);
                this.drawGradientRect(n29 - 3, n6 - 3, n29 + n31 + 3, n6 + n32 + 12 + 3, -1073741824, -1073741824);
                this.fontRendererObj.a(string3, n29, n6 + 12, n31, -9416624);
            } else if (n5 < 3) {
                int n33 = Math.max(this.fontRendererObj.bQ(string), 120);
                String string4 = new t("achievement.requires", a3.dou.app()).arq();
                int n34 = this.fontRendererObj.l(string4, n33);
                this.drawGradientRect(n29 - 3, n6 - 3, n29 + n33 + 3, n6 + n34 + 12 + 3, -1073741824, -1073741824);
                this.fontRendererObj.a(string4, n29, n6 + 12, n33, -9416624);
            } else {
                string = null;
            }
            if (string != null) {
                this.fontRendererObj.b(string, n29, n6, this.bvk.e(a3) ? (a3.apq() ? -128 : -1) : (a3.apq() ? -8355776 : -8355712));
            }
        }
        GlStateManager.JE();
        GlStateManager.Jz();
        RenderHelper.Lf();
    }

    private TextureAtlasSprite z(Block block) {
        return d.AZ().BE().IY().A(block.xM());
    }

    @Override
    public boolean doesGuiPauseGame() {
        return !this.bvl;
    }
}

