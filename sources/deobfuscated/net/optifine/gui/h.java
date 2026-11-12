/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.c;
import net.optifine.gui.f;
import net.optifine.gui.g;
import net.optifine.gui.n;
import net.optifine.gui.q;

public class h
extends GuiScreen
implements cv {
    private final GuiScreen ejN;
    protected String aAJ;
    private final a ejO;
    private static final c[] ejP = new c[]{c.ckF, c.cld, c.ckG, c.clG, c.ckN, c.ckU, c.cke, c.clg, c.cjQ, c.ckH, c.clH, c.clK};
    private final n ejQ = new n(this, new q());

    public h(GuiScreen guiScreen, a a2) {
        this.ejN = guiScreen;
        this.ejO = a2;
    }

    @Override
    public void initGui() {
        this.aAJ = I18n.a("of.options.otherTitle", new Object[0]);
        this.buttonList.clear();
        for (int i2 = 0; i2 < ejP.length; ++i2) {
            c c2 = ejP[i2];
            int n2 = this.width / 2 - 155 + i2 % 2 * 160;
            int n3 = this.height / 6 + 21 * (i2 / 2) - 12;
            if (!c2.QV()) {
                this.buttonList.add(new f(c2.QX(), n2, n3, c2, this.ejO.c(c2)));
                continue;
            }
            this.buttonList.add(new g(c2.QX(), n2, n3, c2));
        }
        this.buttonList.add(new net.minecraft.client.gui.c(210, this.width / 2 - 100, this.height / 6 + 168 + 11 - 44, I18n.a("of.options.other.reset", new Object[0])));
        this.buttonList.add(new net.minecraft.client.gui.c(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(net.minecraft.client.gui.c c2) {
        if (c2.enabled) {
            if (c2.id < 200 && c2 instanceof as) {
                this.ejO.a(((as)c2).Fa(), 1);
                c2.displayString = this.ejO.c(c.dZ(c2.id));
            }
            if (c2.id == 200) {
                h.aER.aIY.QK();
                aER.a(this.ejN);
            }
            if (c2.id == 210) {
                h.aER.aIY.QK();
                cu cu2 = new cu(this, I18n.a("of.message.other.reset", new Object[0]), "", 9999);
                aER.a(cu2);
            }
        }
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (bl2) {
            h.aER.aIY.QS();
        }
        aER.a(this);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
        this.ejQ.b(n2, n3, this.buttonList);
    }
}

