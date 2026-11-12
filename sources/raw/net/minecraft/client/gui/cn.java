/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.co;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;

public class cn
extends bp {
    private final bp bsY;
    private final a bsZ;
    private final List<String> bta = Lists.newArrayList();
    private final List<String> btb = Lists.newArrayList();
    private String btc;
    private String[] btd;
    private co bte;
    private c btf;

    public cn(bp bp2, a a2) {
        this.bsY = bp2;
        this.bsZ = a2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void initGui() {
        this.btc = I18n.a("options.snooper.title", new Object[0]);
        var1_1 = I18n.a("options.snooper.desc", new Object[0]);
        var2_2 = Lists.newArrayList();
        var2_2.addAll(this.fontRendererObj.m(var1_1, this.width - 30));
        this.btd = var2_2.toArray(new String[0]);
        this.bta.clear();
        this.btb.clear();
        this.btf = new c(1, this.width / 2 - 152, this.height - 30, 150, 20, this.bsZ.c(net.minecraft.client.settings.c.ckd));
        this.buttonList.add(this.btf);
        this.buttonList.add(new c(2, this.width / 2 + 2, this.height - 30, 150, 20, I18n.a("gui.done", new Object[0])));
        if (cn.aER.Bg() == null) ** GOTO lbl-1000
        if (cn.aER.Bg().Bi() != null) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var3_3 = v0;
        for (Map.Entry<String, String> var5_5 : new TreeMap<String, String>(cn.aER.Bi().ajp()).entrySet()) {
            this.bta.add((var3_3 != false ? "C " : "") + var5_5.getKey());
            this.btb.add(this.fontRendererObj.k(var5_5.getValue(), this.width - 220));
        }
        if (var3_3) {
            for (Map.Entry<String, String> var5_5 : new TreeMap<String, String>(cn.aER.Bg().Bi().ajp()).entrySet()) {
                this.bta.add("S " + var5_5.getKey());
                this.btb.add(this.fontRendererObj.k(var5_5.getValue(), this.width - 220));
            }
        }
        this.bte = new co(this);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bte.handleMouseInput();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 2) {
                this.bsZ.QK();
                this.bsZ.QK();
                aER.a(this.bsY);
            }
            if (c2.id == 1) {
                this.bsZ.a(net.minecraft.client.settings.c.ckd, 1);
                this.btf.displayString = this.bsZ.c(net.minecraft.client.settings.c.ckd);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.bte.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.btc, this.width / 2, 8, 0xFFFFFF);
        int n4 = 22;
        for (String string : this.btd) {
            this.drawCenteredString(this.fontRendererObj, string, this.width / 2, n4, 0x808080);
            n4 += agg.aIF;
        }
        super.drawScreen(n2, n3, f2);
    }
}

