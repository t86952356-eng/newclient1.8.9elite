/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.o;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.f;
import net.optifine.gui.b;
import net.optifine.gui.k;

public class n
extends GuiScreen {
    private final GuiScreen bme;
    private String aAJ;

    public n(GuiScreen guiScreen) {
        this.bme = guiScreen;
    }

    @Override
    public void initGui() {
        int n2 = 0;
        this.aAJ = I18n.a("options.skinCustomisation.title", new Object[0]);
        for (f f2 : f.values()) {
            this.buttonList.add(new o(this, f2.acA(), this.width / 2 - 155 + n2 % 2 * 160, this.height / 6 + 24 * (n2 >> 1), 150, 20, f2));
            ++n2;
        }
        if (n2 % 2 == 1) {
            ++n2;
        }
        this.buttonList.add(new b(210, this.width / 2 - 100, this.height / 6 + 24 * (n2 >> 1), I18n.a("of.options.skinCustomisation.ofCape", new Object[0])));
        this.buttonList.add(new c(200, this.width / 2 - 100, this.height / 6 + 24 * ((n2 += 2) >> 1), I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 210) {
                aER.a(new k(this));
            }
            if (c2.id == 200) {
                n.aER.aIY.QK();
                aER.a(this.bme);
            } else if (c2 instanceof o) {
                f f2 = ((o)c2).bmf;
                n.aER.aIY.b(f2);
                c2.displayString = this.a(f2);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 20, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    private String a(f f2) {
        String string = n.aER.aIY.QM().contains((Object)f2) ? I18n.a("options.on", new Object[0]) : I18n.a("options.off", new Object[0]);
        return f2.acC().getFormattedText() + ": " + string;
    }
}

