/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.client.gui;

import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import net.minecraft.client.gui.ap;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.ae;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.s;
import net.minecraft.item.co;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.village.a;
import net.minecraft.village.b;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ao
extends i {
    private static final Logger bpv = LogManager.getLogger();
    private static final cm bpw = new cm("textures/gui/container/villager.png");
    private final ae bpx;
    private ap bpy;
    private ap bpz;
    private int bpA;
    private final ba bpB;

    public ao(g g2, ae ae2, w w2) {
        super(new s(g2, ae2, w2));
        this.bpx = ae2;
        this.bpB = ae2.xW();
    }

    @Override
    public void initGui() {
        super.initGui();
        int n2 = (this.width - this.bwg) / 2;
        int n3 = (this.height - this.bwh) / 2;
        this.bpy = new ap(1, n2 + 120 + 27, n3 + 24 - 1, true);
        this.buttonList.add(this.bpy);
        this.bpz = new ap(2, n2 + 36 - 19, n3 + 24 - 1, false);
        this.buttonList.add(this.bpz);
        this.bpy.enabled = false;
        this.bpz.enabled = false;
    }

    @Override
    protected void s(int n2, int n3) {
        String string = this.bpB.arq();
        this.fontRendererObj.a(string, (double)(this.bwg / 2 - this.fontRendererObj.bQ(string) / 2), 6.0, 0x404040);
        this.fontRendererObj.a(I18n.a("container.inventory", new Object[0]), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        b b2 = this.bpx.t(ao.aER.bgK);
        if (b2 != null) {
            this.bpy.enabled = this.bpA < b2.size() - 1;
            this.bpz.enabled = this.bpA > 0;
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        Object object;
        boolean bl2 = false;
        if (c2 == this.bpy) {
            ++this.bpA;
            object = this.bpx.t(ao.aER.bgK);
            if (object != null && this.bpA >= ((ArrayList)object).size()) {
                this.bpA = ((ArrayList)object).size() - 1;
            }
            bl2 = true;
        } else if (c2 == this.bpz) {
            --this.bpA;
            if (this.bpA < 0) {
                this.bpA = 0;
            }
            bl2 = true;
        }
        if (bl2) {
            ((s)this.bwi).fP(this.bpA);
            object = new ak(Unpooled.buffer());
            ((ak)((Object)object)).writeInt(this.bpA);
            aER.AU().u(new ab("MC|TrSel", (ak)((Object)object)));
        }
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bpw);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        b b2 = this.bpx.t(ao.aER.bgK);
        if (b2 != null && !b2.isEmpty()) {
            int n6 = this.bpA;
            if (n6 < 0 || n6 >= b2.size()) {
                return;
            }
            a a2 = (a)b2.get(n6);
            if (a2.auf()) {
                aER.Bq().a(bpw);
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.JA();
                this.drawTexturedModalRect((float)(this.bwj + 83), this.bwk + 21, 212, 0, 28, 21);
                this.drawTexturedModalRect((float)(this.bwj + 83), this.bwk + 51, 212, 0, 28, 21);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        b b2 = this.bpx.t(ao.aER.bgK);
        if (b2 != null && !b2.isEmpty()) {
            int n4 = (this.width - this.bwg) / 2;
            int n5 = (this.height - this.bwh) / 2;
            int n6 = this.bpA;
            a a2 = (a)b2.get(n6);
            co co2 = a2.atY();
            co co3 = a2.atZ();
            co co4 = a2.aub();
            GlStateManager.JV();
            RenderHelper.Lh();
            GlStateManager.JA();
            GlStateManager.JS();
            GlStateManager.JB();
            GlStateManager.Jz();
            this.itemRender.zLevel = 100.0f;
            this.itemRender.b(co2, n4 + 36, n5 + 24);
            this.itemRender.a(this.fontRendererObj, co2, n4 + 36, n5 + 24);
            if (co3 != null) {
                this.itemRender.b(co3, n4 + 62, n5 + 24);
                this.itemRender.a(this.fontRendererObj, co3, n4 + 62, n5 + 24);
            }
            this.itemRender.b(co4, n4 + 120, n5 + 24);
            this.itemRender.a(this.fontRendererObj, co4, n4 + 120, n5 + 24);
            this.itemRender.zLevel = 0.0f;
            GlStateManager.JA();
            if (this.c(36, 24, 16, 16, n2, n3) && co2 != null) {
                this.renderToolTip(co2, n2, n3);
            } else if (co3 != null && this.c(62, 24, 16, 16, n2, n3) && co3 != null) {
                this.renderToolTip(co3, n2, n3);
            } else if (co4 != null && this.c(120, 24, 16, 16, n2, n3) && co4 != null) {
                this.renderToolTip(co4, n2, n3);
            } else if (a2.auf() && (this.c(83, 21, 28, 21, n2, n3) || this.c(83, 51, 28, 21, n2, n3))) {
                this.drawCreativeTabHoveringText(I18n.a("merchant.deprecated", new Object[0]), n2, n3);
            }
            GlStateManager.JW();
            GlStateManager.Jz();
            GlStateManager.JE();
            RenderHelper.Lg();
        }
    }

    public ae EL() {
        return this.bpx;
    }
}

