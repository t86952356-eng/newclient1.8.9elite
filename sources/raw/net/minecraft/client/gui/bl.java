/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import io.netty.buffer.Unpooled;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.b;
import net.minecraft.inventory.v;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import net.minecraft.util.cm;
import net.minecraft.world.w;
import org.lwjgl.input.Keyboard;

public class bl
extends i
implements z {
    private static final cm bqY = new cm("textures/gui/container/anvil.png");
    private final v bqZ;
    private cq bra;
    private final g brb;

    public bl(g g2, w w2) {
        super(new v(g2, w2, d.AZ().bgK));
        this.brb = g2;
        this.bqZ = (v)this.bwi;
    }

    @Override
    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        int n2 = (this.width - this.bwg) / 2;
        int n3 = (this.height - this.bwh) / 2;
        this.bra = new cq(0, this.fontRendererObj, n2 + 62, n3 + 24, 103, 12);
        this.bra.bW(-1);
        this.bra.bX(-1);
        this.bra.af(false);
        this.bra.bV(30);
        this.bwi.b(this);
        this.bwi.a(this);
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        Keyboard.enableRepeatEvents((boolean)false);
        this.bwi.b(this);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void s(int var1_1, int var2_2) {
        block8: {
            GlStateManager.JA();
            GlStateManager.tR();
            this.fontRendererObj.a(I18n.a("container.repair", new Object[0]), 60.0, 6.0, 0x404040);
            if (this.bqZ.cTE <= 0) break block8;
            var3_3 = 8453920;
            var4_4 = true;
            var5_5 = I18n.a("container.repair.cost", new Object[]{this.bqZ.cTE});
            if (this.bqZ.cTE < 40) ** GOTO lbl-1000
            if (!bl.aER.bgK.cIt.cJM) {
                var5_5 = I18n.a("container.repair.expensive", new Object[0]);
                var3_3 = 0xFF6060;
            } else if (!this.bqZ.fM(2).GJ()) {
                var4_4 = false;
            } else if (!this.bqZ.fM(2).G(this.brb.bij)) {
                var3_3 = 0xFF6060;
            }
            if (var4_4) {
                var6_6 = -16777216 | (var3_3 & 0xFCFCFC) >> 2 | var3_3 & -16777216;
                var7_7 = this.bwg - 8 - this.fontRendererObj.bQ(var5_5);
                var8_8 = 67;
                if (this.fontRendererObj.tJ()) {
                    bl.drawRect(var7_7 - 3, 65, this.bwg - 7, 77, -16777216);
                    bl.drawRect(var7_7 - 2, 66, this.bwg - 8, 76, -12895429);
                } else {
                    this.fontRendererObj.a(var5_5, (double)var7_7, 68.0, var6_6);
                    this.fontRendererObj.a(var5_5, (double)(var7_7 + 1), 67.0, var6_6);
                    this.fontRendererObj.a(var5_5, (double)(var7_7 + 1), 68.0, var6_6);
                }
                this.fontRendererObj.a(var5_5, (double)var7_7, 67.0, var3_3);
            }
        }
        GlStateManager.Jz();
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (this.bra.f(c2, n2)) {
            this.Fz();
        } else {
            super.keyTyped(c2, n2);
        }
    }

    private void Fz() {
        String string = this.bra.getText();
        ak ak2 = this.bqZ.fM(0);
        if (ak2 != null && ak2.GJ() && !ak2.ls().aen() && string.equals(ak2.ls().getDisplayName())) {
            string = "";
        }
        this.bqZ.er(string);
        bl.aER.bgK.bkd.u(new net.minecraft.network.play.client.ab("MC|ItemName", new net.minecraft.network.ak(Unpooled.buffer()).eS(string)));
    }

    @Override
    public void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.bra.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        GlStateManager.JA();
        GlStateManager.tR();
        this.bra.Gf();
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bqY);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        this.drawTexturedModalRect((float)(n4 + 59), n5 + 20, 0, this.bwh + (this.bqZ.fM(0).GJ() ? 0 : 16), 110, 16);
        if ((this.bqZ.fM(0).GJ() || this.bqZ.fM(1).GJ()) && !this.bqZ.fM(2).GJ()) {
            this.drawTexturedModalRect((float)(n4 + 99), n5 + 45, this.bwg, 0, 28, 21);
        }
    }

    @Override
    public void a(b b2, List<co> list) {
        this.a(b2, 0, b2.fM(0).ls());
    }

    @Override
    public void a(b b2, int n2, co co2) {
        if (n2 == 0) {
            this.bra.bX(co2 == null ? "" : co2.getDisplayName());
            this.bra.setEnabled(co2 != null);
            if (co2 != null) {
                this.Fz();
            }
        }
    }

    @Override
    public void a(b b2, int n2, int n3) {
    }

    @Override
    public void a(b b2, ab ab2) {
    }
}

