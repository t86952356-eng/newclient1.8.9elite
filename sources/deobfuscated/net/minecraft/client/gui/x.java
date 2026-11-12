/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.an;

public class x
extends GuiScreen
implements cv {
    private int bnq;

    @Override
    public void initGui() {
        this.buttonList.clear();
        if (x.aER.bgF.avH().azv()) {
            if (aER.Bf()) {
                this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 96, I18n.a("deathScreen.deleteWorld", new Object[0])));
            } else {
                this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 96, I18n.a("deathScreen.leaveServer", new Object[0])));
            }
        } else {
            this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 4 + 72, I18n.a("deathScreen.respawn", new Object[0])));
            this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 96, I18n.a("deathScreen.titleScreen", new Object[0])));
            if (aER.Bl() == null) {
                ((c)this.buttonList.get((int)1)).enabled = false;
            }
        }
        for (c c2 : this.buttonList) {
            c2.enabled = false;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
    }

    @Override
    protected void actionPerformed(c c2) {
        switch (c2.id) {
            case 0: {
                x.aER.bgK.Dp();
                aER.a((GuiScreen)null);
                break;
            }
            case 1: {
                if (x.aER.bgF.avH().azv()) {
                    aER.a(new am());
                    break;
                }
                cu cu2 = new cu(this, I18n.a("deathScreen.quit.confirm", new Object[0]), "", I18n.a("deathScreen.titleScreen", new Object[0]), I18n.a("deathScreen.respawn", new Object[0]), 0);
                aER.a(cu2);
                cu2.bZ(20);
            }
        }
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (bl2) {
            x.aER.bgF.HP();
            aER.a((j)null);
            aER.a(new am());
        } else {
            x.aER.bgK.Dp();
            aER.a((GuiScreen)null);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawGradientRect(0, 0, this.width, this.height, 0x60500000, -1602211792);
        GlStateManager.JV();
        GlStateManager.i(2.0f, 2.0f, 2.0f);
        boolean bl2 = x.aER.bgF.avH().azv();
        String string = bl2 ? I18n.a("deathScreen.title.hardcore", new Object[0]) : I18n.a("deathScreen.title", new Object[0]);
        this.drawCenteredString(this.fontRendererObj, string, this.width / 2 / 2, 30, 0xFFFFFF);
        GlStateManager.JW();
        if (bl2) {
            this.drawCenteredString(this.fontRendererObj, I18n.a("deathScreen.hardcoreInfo", new Object[0]), this.width / 2, 144, 0xFFFFFF);
        }
        this.drawCenteredString(this.fontRendererObj, I18n.a("deathScreen.score", new Object[0]) + ": " + String.valueOf((Object)an.dvZ) + x.aER.bgK.abM(), this.width / 2, 100, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        ++this.bnq;
        if (this.bnq == 20) {
            for (c c2 : this.buttonList) {
                c2.enabled = true;
            }
        }
    }
}

