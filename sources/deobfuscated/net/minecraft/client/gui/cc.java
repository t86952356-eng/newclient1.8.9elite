/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;

public class cc
extends GuiScreen {
    private final GuiScreen bsn;
    private final f bso;
    private cq bsp;

    public cc(GuiScreen guiScreen, f f2) {
        this.bsn = guiScreen;
        this.bso = f2;
    }

    @Override
    public void updateScreen() {
        this.bsp.Gb();
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 4 + 96 + 12, I18n.a("selectServer.select", new Object[0])));
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 120 + 12, I18n.a("gui.cancel", new Object[0])));
        this.bsp = new cq(2, this.fontRendererObj, this.width / 2 - 100, 116, 200, 20);
        this.bsp.bV(128);
        this.bsp.ag(true);
        this.bsp.bX(cc.aER.aIY.chS);
        ((c)this.buttonList.get((int)0)).enabled = this.bsp.getText().length() > 0 && this.bsp.getText().split(":").length > 0;
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        cc.aER.aIY.chS = this.bsp.getText();
        cc.aER.aIY.QK();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 1) {
                this.bsn.confirmClicked(false, 0);
            } else if (c2.id == 0) {
                this.bso.bDH = this.bsp.getText();
                this.bsn.confirmClicked(true, 0);
            }
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (this.bsp.f(c2, n2)) {
            ((c)this.buttonList.get((int)0)).enabled = this.bsp.getText().length() > 0 && this.bsp.getText().split(":").length > 0;
        } else if (n2 == 28 || n2 == 156) {
            this.actionPerformed((c)this.buttonList.get(0));
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.bsp.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("selectServer.direct", new Object[0]), this.width / 2, 20, 0xFFFFFF);
        this.drawString(this.fontRendererObj, I18n.a("addServer.enterIp", new Object[0]), this.width / 2 - 100, 100, 0xA0A0A0);
        this.bsp.Gf();
        super.drawScreen(n2, n3, f2);
    }
}

