/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.ag;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cz;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.settings.a;

public class af
extends bp {
    protected bp bln;
    private static final d box = d.AZ();
    private ag boy;
    private final a boz;
    private final LanguageManager boA;
    private as boB;
    private as boC;

    public af(bp bp2, a a2, LanguageManager languageManager) {
        this.bln = bp2;
        this.boz = a2;
        this.boA = languageManager;
    }

    @Override
    public void initGui() {
        this.boB = new as(100, this.width / 2 - 155, this.height - 38, net.minecraft.client.settings.c.ckn, this.boz.c(net.minecraft.client.settings.c.ckn));
        this.buttonList.add(this.boB);
        this.boC = new as(6, this.width / 2 - 155 + 160, this.height - 38, I18n.a("gui.done", new Object[0]));
        this.buttonList.add(this.boC);
        this.boy = new ag(this, box);
        this.boy.registerScrollButtons(7, 8);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.boy.handleMouseInput();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            switch (c2.id) {
                case 5: {
                    break;
                }
                case 6: {
                    box.a(this.bln);
                    break;
                }
                case 100: {
                    if (!(c2 instanceof as)) break;
                    this.boz.a(((as)c2).Fa(), 1);
                    c2.displayString = this.boz.c(net.minecraft.client.settings.c.ckn);
                    cz cz2 = new cz(box);
                    int n2 = cz2.getScaledWidth();
                    int n3 = cz2.getScaledHeight();
                    this.setWorldAndResolution(box, n2, n3);
                    break;
                }
                default: {
                    this.boy.actionPerformed(c2);
                }
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.boy.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, I18n.a("options.language", new Object[0]), this.width / 2, 16, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, "(" + I18n.a("options.languageWarning", new Object[0]) + ")", this.width / 2, this.height - 56, 0x808080);
        super.drawScreen(n2, n3, f2);
    }
}

