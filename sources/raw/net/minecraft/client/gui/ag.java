/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.client.d;
import net.minecraft.client.gui.af;
import net.minecraft.client.gui.cl;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.Language;
import net.minecraft.client.settings.c;

class ag
extends cl {
    private final List<String> boD;
    private final Map<String, Language> boE;
    final /* synthetic */ af boF;

    public ag(af af2, d d2) {
        this.boF = af2;
        super(d2, af2.width, af2.height, 32, af2.height - 65 + 4, 18);
        this.boD = Lists.newArrayList();
        this.boE = Maps.newHashMap();
        for (Language language : af2.boA.Ps()) {
            this.boE.put(language.Pn(), language);
            this.boD.add(language.Pn());
        }
    }

    @Override
    protected int getSize() {
        return this.boD.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        Language language = this.boE.get(this.boD.get(n2));
        this.boF.boA.b(language);
        this.boF.boz.cia = language.Pn();
        this.mc.Az();
        this.boF.fontRendererObj.C(this.boF.boA.Pp() || this.boF.boz.cib);
        this.boF.fontRendererObj.D(this.boF.boA.Pq());
        this.boF.boC.displayString = I18n.a("gui.done", new Object[0]);
        this.boF.boB.displayString = this.boF.boz.c(c.ckn);
        this.boF.boz.QK();
    }

    @Override
    protected boolean isSelected(int n2) {
        return this.boD.get(n2).equals(this.boF.boA.Pr().Pn());
    }

    @Override
    protected int getContentHeight() {
        return this.getSize() * 18;
    }

    @Override
    protected void drawBackground() {
        this.boF.drawDefaultBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.boF.fontRendererObj.D(true);
        this.boF.drawCenteredString(this.boF.fontRendererObj, this.boE.get(this.boD.get(n2)).toString(), this.width / 2, n4 + 1, 0xFFFFFF);
        this.boF.fontRendererObj.D(this.boF.boA.Pr().Po());
    }
}

