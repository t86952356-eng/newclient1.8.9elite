/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.cz;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.c;
import net.optifine.gui.f;
import net.optifine.gui.g;
import net.optifine.gui.n;
import net.optifine.gui.q;

public class j
extends GuiScreen {
    private final GuiScreen ejV;
    protected String aAJ;
    private final a ejW;
    private static final c[] ejX = new c[]{c.ckm, c.cku, c.clr, c.clq, c.ckV, c.clj, c.ckI, c.clf, c.cll, c.clm, c.clo, c.clt, c.cly, c.clp, c.clF, c.clI, c.clu};
    private final n ejY = new n(this, new q());

    public j(GuiScreen guiScreen, a a2) {
        this.ejV = guiScreen;
        this.ejW = a2;
    }

    @Override
    public void initGui() {
        this.aAJ = I18n.a("of.options.qualityTitle", new Object[0]);
        this.buttonList.clear();
        for (int i2 = 0; i2 < ejX.length; ++i2) {
            c c2 = ejX[i2];
            int n2 = this.width / 2 - 155 + i2 % 2 * 160;
            int n3 = this.height / 6 + 21 * (i2 / 2) - 12;
            if (!c2.QV()) {
                this.buttonList.add(new f(c2.QX(), n2, n3, c2, this.ejW.c(c2)));
                continue;
            }
            this.buttonList.add(new g(c2.QX(), n2, n3, c2));
        }
        this.buttonList.add(new net.minecraft.client.gui.c(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(net.minecraft.client.gui.c c2) {
        if (c2.enabled) {
            if (c2.id < 200 && c2 instanceof as) {
                this.ejW.a(((as)c2).Fa(), 1);
                c2.displayString = this.ejW.c(c.dZ(c2.id));
            }
            if (c2.id == 200) {
                j.aER.aIY.QK();
                aER.a(this.ejV);
            }
            if (c2.id != c.clq.ordinal()) {
                cz cz2 = new cz(aER);
                this.setWorldAndResolution(aER, cz2.getScaledWidth(), cz2.getScaledHeight());
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
        this.ejY.b(n2, n3, this.buttonList);
    }
}

