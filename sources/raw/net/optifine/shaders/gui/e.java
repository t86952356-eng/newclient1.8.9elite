/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import hackclient.rise.agg;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.util.bt;
import net.optifine.aw;
import net.optifine.gui.l;
import net.optifine.gui.n;
import net.optifine.gui.r;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.o;
import net.optifine.shaders.config.p;
import net.optifine.shaders.config.s;
import net.optifine.shaders.gui.d;
import net.optifine.shaders.gui.h;

public class e
extends l {
    private final bp eIh;
    protected String aAJ = "Shader Options";
    private final a eIi;
    private final n eIj = new n(this, new r());
    private String eIk = null;
    private String eIl = null;
    private boolean bsm = false;
    public static final String eIm = "<profile>";
    public static final String eIn = "<empty>";
    public static final String eIo = "*";
    private static final net.minecraft.client.d eIp = net.minecraft.client.d.AZ();

    public e(bp bp2, a a2) {
        this.eIh = bp2;
        this.eIi = a2;
    }

    public e(bp bp2, a a2, String string) {
        this(bp2, a2);
        this.eIk = string;
        if (string != null) {
            this.eIl = ah.ak("screen." + string, string);
        }
    }

    @Override
    public void initGui() {
        this.aAJ = I18n.a("of.options.shaderOptionsTitle", new Object[0]);
        int n2 = 100;
        int n3 = 0;
        int n4 = 30;
        int n5 = 20;
        int n6 = 120;
        int n7 = 20;
        int n8 = ah.T(this.eIk, 2);
        o[] oArray = ah.iM(this.eIk);
        if (oArray != null) {
            int n9 = bt.aI((double)oArray.length / 9.0);
            if (n8 < n9) {
                n8 = n9;
            }
            for (int i2 = 0; i2 < oArray.length; ++i2) {
                o o2 = oArray[i2];
                if (o2 == null || !o2.wE()) continue;
                int n10 = i2 % n8;
                int n11 = i2 / n8;
                int n12 = Math.min(this.width / n8, 200);
                n3 = (this.width - n12 * n8) / 2;
                int n13 = n10 * n12 + 5 + n3;
                int n14 = 30 + n11 * 20;
                int n15 = n12 - 10;
                String string = e.b(o2, n15);
                d d2 = ah.iO(o2.getName()) ? new h(100 + i2, n13, n14, n15, 20, o2, string) : new d(100 + i2, n13, n14, n15, 20, o2, string);
                d2.enabled = o2.isEnabled();
                this.buttonList.add(d2);
            }
        }
        this.buttonList.add(new c(201, this.width / 2 - 120 - 20, this.height / 6 + 168 + 11, 120, 20, I18n.a("controls.reset", new Object[0])));
        this.buttonList.add(new c(200, this.width / 2 + 20, this.height / 6 + 168 + 11, 120, 20, I18n.a("gui.done", new Object[0])));
    }

    public static String b(o o2, int n2) {
        String string = o2.aIh();
        if (o2 instanceof s) {
            s s2 = (s)o2;
            return string + "...";
        }
        agg agg2 = net.minecraft.src.a.AZ().fontRendererObj;
        int n3 = agg2.bQ(": " + aw.aBC()) + 5;
        while (agg2.bQ(string) + n3 >= n2 && string.length() > 0) {
            string = string.substring(0, string.length() - 1);
        }
        String string2 = o2.aIg() ? o2.jt(o2.SN()) : "";
        String string3 = o2.js(o2.SN());
        return string + ": " + string2 + string3;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            o[] oArray;
            if (c2.id < 200 && c2 instanceof d) {
                oArray = (o[])c2;
                o o2 = oArray.aIu();
                if (o2 instanceof s) {
                    String string = o2.getName();
                    e e2 = new e(this, this.eIi, string);
                    eIp.a(e2);
                    return;
                }
                if (e.isShiftKeyDown()) {
                    o2.aHy();
                } else if (oArray.aIw()) {
                    o2.aHs();
                }
                this.aIx();
                this.bsm = true;
            }
            if (c2.id == 201) {
                oArray = ah.b(ah.aFe());
                for (int i2 = 0; i2 < oArray.length; ++i2) {
                    o o3 = oArray[i2];
                    o3.aHy();
                    this.bsm = true;
                }
                this.aIx();
            }
            if (c2.id == 200) {
                if (this.bsm) {
                    ah.aFf();
                    this.bsm = false;
                    ah.aFx();
                }
                eIp.a(this.eIh);
            }
        }
    }

    @Override
    protected void a(c c2) {
        if (c2 instanceof d) {
            d d2 = (d)c2;
            o o2 = d2.aIu();
            if (e.isShiftKeyDown()) {
                o2.aHy();
            } else if (d2.aIw()) {
                o2.aIe();
            }
            this.aIx();
            this.bsm = true;
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        if (this.bsm) {
            ah.aFf();
            this.bsm = false;
            ah.aFx();
        }
    }

    private void aIx() {
        for (c c2 : this.buttonList) {
            if (!(c2 instanceof d)) continue;
            d d2 = (d)c2;
            o o2 = d2.aIu();
            if (o2 instanceof p) {
                p p2 = (p)o2;
                p2.aIl();
            }
            d2.displayString = e.b(o2, d2.getButtonWidth());
            d2.aIv();
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        if (this.eIl != null) {
            this.drawCenteredString(this.fontRendererObj, this.eIl, this.width / 2, 15, 0xFFFFFF);
        } else {
            this.drawCenteredString(this.fontRendererObj, this.aAJ, this.width / 2, 15, 0xFFFFFF);
        }
        super.drawScreen(n2, n3, f2);
        this.eIj.b(n2, n3, this.buttonList);
    }
}

