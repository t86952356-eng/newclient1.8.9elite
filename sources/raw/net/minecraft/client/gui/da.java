/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.at;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;

public class da
extends bp {
    private static final net.minecraft.client.settings.c[] buj = new net.minecraft.client.settings.c[]{net.minecraft.client.settings.c.cjY, net.minecraft.client.settings.c.cjZ, net.minecraft.client.settings.c.cka, net.minecraft.client.settings.c.ckb, net.minecraft.client.settings.c.ckc, net.minecraft.client.settings.c.cki, net.minecraft.client.settings.c.ckk, net.minecraft.client.settings.c.ckl, net.minecraft.client.settings.c.ckj, net.minecraft.client.settings.c.ckp};
    private final bp buk;
    private final a bul;
    private String bum;
    private static final d bun = d.AZ();

    public da(bp bp2, a a2) {
        this.buk = bp2;
        this.bul = a2;
    }

    @Override
    public void initGui() {
        int n2 = 0;
        this.bum = I18n.a("options.chat.title", new Object[0]);
        for (net.minecraft.client.settings.c c2 : buj) {
            if (c2.QV()) {
                this.buttonList.add(new at(c2.QX(), this.width / 2 - 155 + n2 % 2 * 160, this.height / 6 + 24 * (n2 >> 1), c2));
            } else {
                this.buttonList.add(new as(c2.QX(), this.width / 2 - 155 + n2 % 2 * 160, this.height / 6 + 24 * (n2 >> 1), c2, this.bul.c(c2)));
            }
            ++n2;
        }
        this.buttonList.add(new c(200, this.width / 2 - 100, this.height / 6 + 120, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id < 100 && c2 instanceof as) {
                this.bul.a(((as)c2).Fa(), 1);
                c2.displayString = this.bul.c(net.minecraft.client.settings.c.dZ(c2.id));
            }
            if (c2.id == 200) {
                da.bun.aIY.QK();
                bun.a(this.buk);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.bum, this.width / 2, 20, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

