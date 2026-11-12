/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.aq;
import net.minecraft.client.network.h;
import net.minecraft.client.resources.I18n;
import net.minecraft.network.play.client.a;
import net.optifine.ah;
import net.optifine.ai;
import rise.Client;

public class r
extends GuiScreen {
    private final h bmH;
    private int bmI;
    private final ah bmJ = ai.aAQ();

    public r(h h2) {
        this.bmH = h2;
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            aER.BN();
            aER.a(new aq(new am()));
        }
        if (n2 == 28) {
            aER.a((GuiScreen)null);
            if (r.aER.bgR == null) {
                aER.AK();
            }
        }
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
    }

    @Override
    public void updateScreen() {
        ++this.bmI;
        if (this.bmI % 20 == 0) {
            this.bmH.u(new a());
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (this.bmJ != null) {
            this.bmJ.bE(this.width, this.height);
        } else {
            this.drawBackground(0);
        }
        this.drawCenteredString(this.fontRendererObj, I18n.a("multiplayer.downloadingTerrain", new Object[0]), this.width / 2, this.height / 2 - 50, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "Press ESC to leave this menu", this.width / 2, this.height / 2 - 25, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "or press RETURN to force yourself into the server (features by " + Client.b + ")", this.width / 2, this.height / 2 - 12, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}

