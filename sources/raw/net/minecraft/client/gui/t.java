/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;

public class t
extends bp {
    private final String bmZ;
    private final String bna;
    private static final d bnb = d.AZ();

    public t(String string, String string2) {
        this.bmZ = string;
        this.bna = string2;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new c(0, this.width / 2 - 100, 140, I18n.a("gui.cancel", new Object[0])));
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawGradientRect(0, 0, this.width, this.height, -12574688, -11530224);
        this.drawCenteredString(this.fontRendererObj, this.bmZ, this.width / 2, 90, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, this.bna, this.width / 2, 110, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
    }

    @Override
    protected void actionPerformed(c c2) {
        bnb.a((bp)null);
    }
}

