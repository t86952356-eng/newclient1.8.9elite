/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.bi;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.achievement.b;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.au;
import net.minecraft.client.gui.cg;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.resources.I18n;

public class aa
extends GuiScreen {
    private int bnV;
    private int bnW;

    /*
     * Unable to fully structure code
     */
    @Override
    public void initGui() {
        this.bnV = 0;
        this.buttonList.clear();
        var1_1 = -16;
        var2_2 = 3;
        if (!aa.aER.Bf()) {
            this.buttonList.add(new net.minecraft.client.gui.c(1, this.width / 2 - 100, this.height / 4 + 120 + -16, 100 - var2_2, 20, "Disconnect"));
            this.buttonList.add(new net.minecraft.client.gui.c(8, this.width / 2 + var2_2, this.height / 4 + 120 + -16, 100 - var2_2, 20, "Reconnect"));
            ((net.minecraft.client.gui.c)this.buttonList.get((int)0)).displayString = I18n.a("menu.disconnect", new Object[0]);
        } else {
            this.buttonList.add(new net.minecraft.client.gui.c(1, this.width / 2 - 100, this.height / 4 + 120 + -16, I18n.a("menu.returnToMenu", new Object[0])));
        }
        this.buttonList.add(new net.minecraft.client.gui.c(4, this.width / 2 - 100, this.height / 4 + 24 + -16, I18n.a("menu.returnToGame", new Object[0])));
        this.buttonList.add(new net.minecraft.client.gui.c(0, this.width / 2 - 100, this.height / 4 + 96 + -16, 98, 20, I18n.a("menu.options", new Object[0])));
        var3_3 = new net.minecraft.client.gui.c(7, this.width / 2 + 2, this.height / 4 + 96 + -16, 98, 20, I18n.a("menu.shareToLan", new Object[0]));
        this.buttonList.add(var3_3);
        this.buttonList.add(new net.minecraft.client.gui.c(5, this.width / 2 - 100, this.height / 4 + 48 + -16, 98, 20, I18n.a("gui.achievements", new Object[0])));
        this.buttonList.add(new net.minecraft.client.gui.c(6, this.width / 2 + 2, this.height / 4 + 48 + -16, 98, 20, I18n.a("gui.stats", new Object[0])));
        if (!aa.aER.isSingleplayer()) ** GOTO lbl-1000
        if (!aa.aER.Bg().amb()) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var3_3.enabled = v0;
    }

    @Override
    protected void actionPerformed(net.minecraft.client.gui.c c2) {
        switch (c2.id) {
            case 0: {
                aER.a(new au(this, aa.aER.aIY));
                break;
            }
            case 1: {
                c2.enabled = false;
                aER.BN();
            }
            default: {
                break;
            }
            case 4: {
                aER.a((GuiScreen)null);
                aER.AK();
                break;
            }
            case 5: {
                aER.a(new b(this, aa.aER.bgK.Dx()));
                break;
            }
            case 6: {
                aER.a(new c(this, aa.aER.bgK.Dx()));
                break;
            }
            case 7: {
                aER.a(new cg(this));
            }
            case 8: {
                aER.BN();
                aER.a(new net.minecraft.client.multiplayer.b(new aq(new am()), aER, new f("", bi.dx, false)));
            }
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        ++this.bnW;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("menu.game", new Object[0]), this.width / 2, 40, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

