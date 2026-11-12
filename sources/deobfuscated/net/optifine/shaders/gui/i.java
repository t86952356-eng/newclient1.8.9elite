/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.gui;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.cl;
import net.minecraft.client.gui.cu;
import net.minecraft.client.resources.I18n;
import net.minecraft.src.a;
import net.optifine.aw;
import net.optifine.shaders.ah;
import net.optifine.shaders.gui.f;
import net.optifine.shaders.gui.j;
import net.optifine.shaders.m;

class i
extends cl {
    private ArrayList eIF;
    private int aBA;
    private long eIG = 0L;
    final f eIH;

    public i(f f2, int n2, int n3, int n4, int n5, int n6) {
        super(f2.aIy(), n2, n3, n4, n5, n6);
        this.eIH = f2;
        this.aIA();
        this.amountScrolled = 0.0f;
        int n7 = this.aBA * n6;
        int n8 = (n5 - n4) / 2;
        if (n7 > n8) {
            this.scrollBy(n7 - n8);
        }
    }

    @Override
    public int getListWidth() {
        return this.width - 20;
    }

    public void aIA() {
        this.eIF = ah.aFh();
        this.aBA = 0;
        int n2 = this.eIF.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.eIF.get(i2).equals(ah.eDr)) continue;
            this.aBA = i2;
            break;
        }
    }

    @Override
    protected int getSize() {
        return this.eIF.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        String string;
        m m2;
        if ((n2 != this.aBA || this.lastClicked != this.eIG) && this.a(m2 = ah.iL(string = (String)this.eIF.get(n2)), n2)) {
            this.ko(n2);
        }
    }

    private void ko(int n2) {
        this.aBA = n2;
        this.eIG = this.lastClicked;
        ah.iK((String)this.eIF.get(n2));
        ah.aFx();
        this.eIH.FC();
    }

    private boolean a(m m2, int n2) {
        if (m2 == null) {
            return true;
        }
        InputStream inputStream = m2.iz("/shaders/shaders.properties");
        Properties properties = net.optifine.util.ah.c(inputStream, "Shaders");
        if (properties == null) {
            return true;
        }
        String string = "version.1.8.9";
        String string2 = properties.getProperty("version.1.8.9");
        if (string2 == null) {
            return true;
        }
        string2 = string2.trim();
        String string3 = "L5";
        int n3 = a.W("L5", string2);
        if (n3 >= 0) {
            return true;
        }
        String string4 = ("HD_U_" + string2).replace('_', ' ');
        String string5 = I18n.a("of.message.shaders.nv1", string4);
        String string6 = I18n.a("of.message.shaders.nv2", new Object[0]);
        j j2 = new j(this, n2);
        cu cu2 = new cu(j2, string5, string6, 0);
        this.mc.a(cu2);
        return false;
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.aBA;
    }

    @Override
    protected int getScrollBarX() {
        return this.width - 6;
    }

    @Override
    protected int getContentHeight() {
        return this.getSize() * 18;
    }

    @Override
    protected void drawBackground() {
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        String string = (String)this.eIF.get(n2);
        if (string.equals("OFF")) {
            string = aw.cf("of.options.shaders.packNone");
        } else if (string.equals("(internal)")) {
            string = aw.cf("of.options.shaders.packDefault");
        }
        this.eIH.drawCenteredString(string, this.width / 2, n4 + 1, 0xE0E0E0);
    }

    public int uC() {
        return this.aBA;
    }

    static /* synthetic */ Minecraft a(i i2) {
        return i2.mc;
    }
}

