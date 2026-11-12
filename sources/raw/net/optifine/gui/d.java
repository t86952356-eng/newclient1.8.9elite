/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bp;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.c;
import net.optifine.gui.f;
import net.optifine.gui.g;
import net.optifine.gui.n;
import net.optifine.gui.q;

public class d
extends bp {
    private final bp ejE;
    protected String aAJ;
    private final a ejF;
    private static final c[] ejG = new c[]{c.ckw, c.ckx, c.cky, c.ckz, c.ckO, c.ckP, c.ckQ, c.cln, c.cks, c.ckt, c.clB, c.clv, c.clw, c.ckq, c.ckR, c.clE, c.cli, c.clk};
    private final n ejH = new n(this, new q());

    public d(bp bp2, a a2) {
        this.ejE = bp2;
        this.ejF = a2;
    }

    @Override
    public void initGui() {
        this.aAJ = I18n.a("of.options.detailsTitle", new Object[0]);
        this.buttonList.clear();
        for (int i2 = 0; i2 < ejG.length; ++i2) {
            c c2 = ejG[i2];
            int n2 = this.width / 2 - 155 + i2 % 2 * 160;
            int n3 = this.height / 6 + 21 * (i2 / 2) - 12;
            if (!c2.QV()) {
                this.buttonList.add(new f(c2.QX(), n2, n3, c2, this.ejF.c(c2)));
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
                this.ejF.a(((as)c2).Fa(), 1);
                c2.displayString = this.ejF.c(c.dZ(c2.id));
            }
            if (c2.id == 200) {
                d.aER.aIY.QK();
                aER.a(this.ejE);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
        this.ejH.b(n2, n3, this.buttonList);
    }
}

