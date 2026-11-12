/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.cz;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.c;
import net.optifine.aw;
import net.optifine.gui.f;
import net.optifine.gui.g;

public class a
extends GuiScreen {
    private final GuiScreen ejz;
    protected String aAJ;
    private final net.minecraft.client.settings.a ejA;
    private static final c[] ejB = new c[]{c.ckA, c.ckB, c.ckC, c.ckD, c.ckJ, c.ckK, c.ckL, c.ckM, c.ckX, c.ckY, c.ckZ, c.cla, c.clb, c.cle, c.clh, c.cls, c.clc, c.cjX};

    public a(GuiScreen guiScreen, net.minecraft.client.settings.a a2) {
        this.ejz = guiScreen;
        this.ejA = a2;
    }

    @Override
    public void initGui() {
        this.aAJ = I18n.a("of.options.animationsTitle", new Object[0]);
        this.buttonList.clear();
        for (int i2 = 0; i2 < ejB.length; ++i2) {
            c c2 = ejB[i2];
            int n2 = this.width / 2 - 155 + i2 % 2 * 160;
            int n3 = this.height / 6 + 21 * (i2 / 2) - 12;
            if (!c2.QV()) {
                this.buttonList.add(new f(c2.QX(), n2, n3, c2, this.ejA.c(c2)));
                continue;
            }
            this.buttonList.add(new g(c2.QX(), n2, n3, c2));
        }
        this.buttonList.add(new net.minecraft.client.gui.c(210, this.width / 2 - 155, this.height / 6 + 168 + 11, 70, 20, aw.cf("of.options.animation.allOn")));
        this.buttonList.add(new net.minecraft.client.gui.c(211, this.width / 2 - 155 + 80, this.height / 6 + 168 + 11, 70, 20, aw.cf("of.options.animation.allOff")));
        this.buttonList.add(new as(200, this.width / 2 + 5, this.height / 6 + 168 + 11, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(net.minecraft.client.gui.c c2) {
        if (c2.enabled) {
            if (c2.id < 200 && c2 instanceof as) {
                this.ejA.a(((as)c2).Fa(), 1);
                c2.displayString = this.ejA.c(c.dZ(c2.id));
            }
            if (c2.id == 200) {
                a.aER.aIY.QK();
                aER.a(this.ejz);
            }
            if (c2.id == 210) {
                a.aER.aIY.ax(true);
            }
            if (c2.id == 211) {
                a.aER.aIY.ax(false);
            }
            cz cz2 = a.aER.jY;
            this.setWorldAndResolution(aER, cz2.getScaledWidth(), cz2.getScaledHeight());
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

