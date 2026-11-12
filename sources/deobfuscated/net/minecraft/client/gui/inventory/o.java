/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.network.h;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.v;
import net.minecraft.tileentity.ag;
import net.minecraft.util.l;
import net.minecraft.util.s;
import org.lwjgl.input.Keyboard;

public class o
extends GuiScreen {
    private final ag bwY;
    private int bnB;
    private int bwZ;
    private c ble;

    public o(ag ag2) {
        this.bwY = ag2;
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.ble = new c(0, this.width / 2 - 100, this.height / 4 + 120, I18n.a("gui.done", new Object[0]));
        this.buttonList.add(this.ble);
        this.bwY.cq(false);
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        h h2 = aER.AU();
        if (h2 != null) {
            h2.u(new v(this.bwY.Ab(), this.bwY.dtx));
        }
        this.bwY.cq(true);
    }

    @Override
    public void updateScreen() {
        ++this.bnB;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled && c2.id == 0) {
            this.bwY.Lw();
            aER.a((GuiScreen)null);
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 200) {
            this.bwZ = this.bwZ - 1 & 3;
        }
        if (n2 == 208 || n2 == 28 || n2 == 156) {
            this.bwZ = this.bwZ + 1 & 3;
        }
        Object object = this.bwY.dtx[this.bwZ].arq();
        if (n2 == 14 && ((String)object).length() > 0) {
            object = ((String)object).substring(0, ((String)object).length() - 1);
        }
        if (l.o(c2) && this.fontRendererObj.bQ((String)object + c2) <= 90) {
            object = (String)object + c2;
        }
        this.bwY.dtx[this.bwZ] = new s((String)object);
        if (n2 == 1) {
            this.actionPerformed(this.ble);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("sign.edit", new Object[0]), this.width / 2, 40, 0xFFFFFF);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.JV();
        GlStateManager.j(this.width / 2, 0.0f, 50.0f);
        float f3 = 93.75f;
        GlStateManager.i(-93.75f, -93.75f, -93.75f);
        GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
        Block block = this.bwY.ahl();
        if (block == Blocks.cMp) {
            float f4 = (float)(this.bwY.zg() * 360) / 16.0f;
            GlStateManager.d(f4, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.0f, -1.0625f, 0.0f);
        } else {
            int n4 = this.bwY.zg();
            float f5 = 0.0f;
            if (n4 == 2) {
                f5 = 180.0f;
            }
            if (n4 == 4) {
                f5 = 90.0f;
            }
            if (n4 == 5) {
                f5 = -90.0f;
            }
            GlStateManager.d(f5, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(0.0f, -1.0625f, 0.0f);
        }
        if (this.bnB / 6 % 2 == 0) {
            this.bwY.dty = this.bwZ;
        }
        TileEntityRendererDispatcher.caV.a(this.bwY, -0.5, -0.75, -0.5, 0.0f);
        this.bwY.dty = -1;
        GlStateManager.JW();
        super.drawScreen(n2, n3, f2);
    }
}

