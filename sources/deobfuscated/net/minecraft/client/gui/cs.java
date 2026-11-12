/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.f;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.optifine.aw;
import net.optifine.gui.d;
import net.optifine.gui.g;
import net.optifine.gui.h;
import net.optifine.gui.i;
import net.optifine.gui.j;
import net.optifine.gui.l;
import net.optifine.gui.n;
import net.optifine.gui.q;

public class cs
extends l {
    private final GuiScreen btC;
    protected String blo = "Video Settings";
    private final a btD;
    private static final net.minecraft.client.settings.c[] btE = new net.minecraft.client.settings.c[]{net.minecraft.client.settings.c.cjU, net.minecraft.client.settings.c.cjO, net.minecraft.client.settings.c.cjV, net.minecraft.client.settings.c.cjR, net.minecraft.client.settings.c.ckE, net.minecraft.client.settings.c.cjP, net.minecraft.client.settings.c.cjW, net.minecraft.client.settings.c.ckg, net.minecraft.client.settings.c.cjM, net.minecraft.client.settings.c.cko, net.minecraft.client.settings.c.clD, net.minecraft.client.settings.c.clC};
    private final n btF = new n(this, new q());

    public cs(GuiScreen guiScreen, a a2) {
        this.btC = guiScreen;
        this.btD = a2;
    }

    @Override
    public void initGui() {
        int n2;
        this.blo = I18n.a("options.videoTitle", new Object[0]);
        this.buttonList.clear();
        for (n2 = 0; n2 < btE.length; ++n2) {
            net.minecraft.client.settings.c c2 = btE[n2];
            if (c2 == null) continue;
            int n3 = this.width / 2 - 155 + n2 % 2 * 160;
            int n4 = this.height / 6 + 21 * (n2 / 2) - 12;
            if (c2.QV()) {
                this.buttonList.add(new g(c2.QX(), n3, n4, c2));
                continue;
            }
            this.buttonList.add(new net.optifine.gui.f(c2.QX(), n3, n4, c2, this.btD.c(c2)));
        }
        n2 = this.height / 6 + 21 * (btE.length / 2) - 12;
        int n5 = 0;
        n5 = this.width / 2 - 155 + 0;
        this.buttonList.add(new as(231, n5, n2, aw.cf("of.options.shaders")));
        n5 = this.width / 2 - 155 + 160;
        this.buttonList.add(new as(202, n5, n2, aw.cf("of.options.quality")));
        n5 = this.width / 2 - 155 + 0;
        this.buttonList.add(new as(201, n5, n2 += 21, aw.cf("of.options.details")));
        n5 = this.width / 2 - 155 + 160;
        this.buttonList.add(new as(212, n5, n2, aw.cf("of.options.performance")));
        n5 = this.width / 2 - 155 + 0;
        this.buttonList.add(new as(211, n5, n2 += 21, aw.cf("of.options.animations")));
        n5 = this.width / 2 - 155 + 160;
        this.buttonList.add(new as(222, n5, n2, aw.cf("of.options.other")));
        n2 += 21;
        this.buttonList.add(new c(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        this.a(c2, 1);
    }

    @Override
    protected void a(c c2) {
        if (c2.id == net.minecraft.client.settings.c.cjW.ordinal()) {
            this.a(c2, -1);
        }
    }

    private void a(c c2, int n2) {
        if (c2.enabled) {
            Object object;
            int n3 = this.btD.chY;
            if (c2.id < 200 && c2 instanceof as) {
                this.btD.a(((as)c2).Fa(), n2);
                c2.displayString = this.btD.c(net.minecraft.client.settings.c.dZ(c2.id));
            }
            if (c2.id == 200) {
                cs.aER.aIY.QK();
                aER.a(this.btC);
            }
            if (this.btD.chY != n3) {
                object = new cz(aER);
                int n4 = ((cz)object).getScaledWidth();
                int n5 = ((cz)object).getScaledHeight();
                this.setWorldAndResolution(aER, n4, n5);
            }
            if (c2.id == 201) {
                cs.aER.aIY.QK();
                object = new d(this, this.btD);
                aER.a((GuiScreen)object);
            }
            if (c2.id == 202) {
                cs.aER.aIY.QK();
                object = new j(this, this.btD);
                aER.a((GuiScreen)object);
            }
            if (c2.id == 211) {
                cs.aER.aIY.QK();
                object = new net.optifine.gui.a(this, this.btD);
                aER.a((GuiScreen)object);
            }
            if (c2.id == 212) {
                cs.aER.aIY.QK();
                object = new i(this, this.btD);
                aER.a((GuiScreen)object);
            }
            if (c2.id == 222) {
                cs.aER.aIY.QK();
                object = new h(this, this.btD);
                aER.a((GuiScreen)object);
            }
            if (c2.id == 231) {
                if (net.minecraft.src.a.aoi() || net.minecraft.src.a.aoj()) {
                    net.minecraft.src.a.X(aw.cf("of.message.shaders.aa1"), aw.cf("of.message.shaders.aa2"));
                    return;
                }
                if (net.minecraft.src.a.aog()) {
                    net.minecraft.src.a.X(aw.cf("of.message.shaders.af1"), aw.cf("of.message.shaders.af2"));
                    return;
                }
                if (net.minecraft.src.a.aoE()) {
                    net.minecraft.src.a.X(aw.cf("of.message.shaders.fr1"), aw.cf("of.message.shaders.fr2"));
                    return;
                }
                if (net.minecraft.src.a.aoH().cgt) {
                    net.minecraft.src.a.X(aw.cf("of.message.shaders.an1"), aw.cf("of.message.shaders.an2"));
                    return;
                }
                cs.aER.aIY.QK();
                object = new net.optifine.shaders.gui.f(this, this.btD);
                aER.a((GuiScreen)object);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.blo, this.width / 2, 15, 0xFFFFFF);
        String string = net.minecraft.src.a.getVersion();
        String string2 = "HD_U";
        if ("HD_U".equals("HD")) {
            string = "OptiFine HD L5";
        }
        if ("HD_U".equals("HD_U")) {
            string = "OptiFine HD L5 Ultra";
        }
        if ("HD_U".equals("L")) {
            string = "OptiFine L5 Light";
        }
        this.drawString(this.fontRendererObj, string, 2, this.height - 10, 0x808080);
        String string3 = "Minecraft 1.8.9";
        int n4 = this.fontRendererObj.bQ("Minecraft 1.8.9");
        this.drawString(this.fontRendererObj, "Minecraft 1.8.9", this.width - n4 - 2, this.height - 10, 0x808080);
        super.drawScreen(n2, n3, f2);
        this.btF.b(n2, n3, this.buttonList);
    }

    public static int b(c c2) {
        return c2.buttonWidth;
    }

    public static int c(c c2) {
        return c2.height;
    }

    public static void a(GuiScreen guiScreen, int n2, int n3, int n4, int n5, int n6, int n7) {
        guiScreen.drawGradientRect(n2, n3, n4, n5, n6, n7);
    }

    public static String a(f f2) {
        return f2.bkX.getText();
    }
}

