/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import java.net.URI;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bx
extends bp {
    private static final Logger brU = LogManager.getLogger();
    private static final cm brV = new cm("textures/gui/demo_background.png");

    @Override
    public void initGui() {
        this.buttonList.clear();
        int n2 = -16;
        this.buttonList.add(new c(1, this.width / 2 - 116, this.height / 2 + 62 + -16, 114, 20, I18n.a("demo.help.buy", new Object[0])));
        this.buttonList.add(new c(2, this.width / 2 + 2, this.height / 2 + 62 + -16, 114, 20, I18n.a("demo.help.later", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        switch (c2.id) {
            case 1: {
                c2.enabled = false;
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable throwable) {
                    brU.error("Couldn't open link", throwable);
                }
                break;
            }
            case 2: {
                aER.a((bp)null);
                aER.AK();
            }
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
    }

    @Override
    public void drawDefaultBackground() {
        super.drawDefaultBackground();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(brV);
        int n2 = (this.width - 248) / 2;
        int n3 = (this.height - 166) / 2;
        this.drawTexturedModalRect((float)n2, n3, 0, 0, 248, 166);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        int n4 = (this.width - 248) / 2 + 10;
        int n5 = (this.height - 166) / 2 + 8;
        this.fontRendererObj.a(I18n.a("demo.help.title", new Object[0]), (double)n4, (double)n5, 0x1F1F1F);
        a a2 = bx.aER.aIY;
        this.fontRendererObj.a(I18n.a("demo.help.movementShort", a.dY(a2.chm.cO()), a.dY(a2.chn.cO()), a.dY(a2.cho.cO()), a.dY(a2.chp.cO())), (double)n4, (double)(n5 += 12), 0x4F4F4F);
        this.fontRendererObj.a(I18n.a("demo.help.movementMouse", new Object[0]), (double)n4, (double)(n5 + 12), 0x4F4F4F);
        this.fontRendererObj.a(I18n.a("demo.help.jump", a.dY(a2.chq.cO())), (double)n4, (double)(n5 + 24), 0x4F4F4F);
        this.fontRendererObj.a(I18n.a("demo.help.inventory", a.dY(a2.cht.cO())), (double)n4, (double)(n5 + 36), 0x4F4F4F);
        this.fontRendererObj.a(I18n.a("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 0x1F1F1F);
        super.drawScreen(n2, n3, f2);
    }
}

