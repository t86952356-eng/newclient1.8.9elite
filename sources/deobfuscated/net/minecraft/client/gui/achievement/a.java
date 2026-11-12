/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.achievement;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.cm;

public class a
extends b {
    private static final cm buK = new cm("textures/gui/achievement/achievement_background.png");
    private final Minecraft buL;
    private int width;
    private int height;
    private String buM;
    private String buN;
    private net.minecraft.stats.a buO;
    private long buP;
    private final RenderItem buQ;
    private boolean buR;

    public a(Minecraft minecraft) {
        this.buL = minecraft;
        this.buQ = minecraft.BG();
    }

    public void a(net.minecraft.stats.a a2) {
        this.buM = I18n.a("achievement.get", new Object[0]);
        this.buN = a2.app().arq();
        this.buP = Minecraft.Bj();
        this.buO = a2;
        this.buR = false;
    }

    public void b(net.minecraft.stats.a a2) {
        this.buM = a2.app().arq();
        this.buN = a2.getDescription();
        this.buP = Minecraft.Bj() + 2500L;
        this.buO = a2;
        this.buR = true;
    }

    private void Gx() {
        GlStateManager.i(0, 0, this.buL.bgz, this.buL.bgA);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        GlStateManager.cR(5888);
        GlStateManager.JU();
        this.width = this.buL.bgz;
        this.height = this.buL.bgA;
        cz cz2 = new cz(this.buL);
        this.width = cz2.getScaledWidth();
        this.height = cz2.getScaledHeight();
        GlStateManager.cQ(256);
        GlStateManager.cR(5889);
        GlStateManager.JU();
        GlStateManager.e(0.0, this.width, this.height, 0.0, 1000.0, 3000.0);
        GlStateManager.cR(5888);
        GlStateManager.JU();
        GlStateManager.j(0.0f, 0.0f, -2000.0f);
    }

    public void Gy() {
        if (this.buO != null && this.buP != 0L && Minecraft.getMinecraft().bgK != null) {
            double d2 = (double)(Minecraft.Bj() - this.buP) / 3000.0;
            if (!this.buR) {
                if (d2 < 0.0 || d2 > 1.0) {
                    this.buP = 0L;
                    return;
                }
            } else if (d2 > 0.5) {
                d2 = 0.5;
            }
            this.Gx();
            GlStateManager.JD();
            GlStateManager.an(false);
            double d3 = d2 * 2.0;
            if (d3 > 1.0) {
                d3 = 2.0 - d3;
            }
            d3 *= 4.0;
            if ((d3 = 1.0 - d3) < 0.0) {
                d3 = 0.0;
            }
            d3 *= d3;
            d3 *= d3;
            int n2 = this.width - 160;
            int n3 = 0 - (int)(d3 * 36.0);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JN();
            this.buL.Bq().a(buK);
            GlStateManager.JA();
            this.drawTexturedModalRect((float)n2, n3, 96, 202, 160, 32);
            if (this.buR) {
                this.buL.fontRendererObj.a(this.buN, n2 + 30, n3 + 7, 120, -1);
            } else {
                this.buL.fontRendererObj.a(this.buM, (double)(n2 + 30), (double)(n3 + 7), -256);
                this.buL.fontRendererObj.a(this.buN, (double)(n2 + 30), (double)(n3 + 18), -1);
            }
            RenderHelper.Lh();
            GlStateManager.JA();
            GlStateManager.JS();
            GlStateManager.JB();
            GlStateManager.Jz();
            this.buQ.b(this.buO.dox, n2 + 8, n3 + 8);
            GlStateManager.JA();
            GlStateManager.an(true);
            GlStateManager.JE();
        }
    }

    public void Gz() {
        this.buO = null;
        this.buP = 0L;
    }
}

