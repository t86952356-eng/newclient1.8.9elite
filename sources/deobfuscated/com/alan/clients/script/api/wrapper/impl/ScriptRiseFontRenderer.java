/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.RenderAPI;
import com.alan.clients.script.api.wrapper.impl.ScriptFontRenderer;
import hackclient.rise.agi;

public class ScriptRiseFontRenderer
extends ScriptFontRenderer<agi> {
    public ScriptRiseFontRenderer(agi agi2) {
        super(agi2);
    }

    @Override
    public double width(String string) {
        return ((agi)this.wrapped).bQ(string);
    }

    @Override
    public double height() {
        return ((agi)this.wrapped).tF();
    }

    @Override
    public void draw(String string, double d2, double d3, int[] nArray) {
        ((agi)this.wrapped).a(string, d2, d3, RenderAPI.intArrayToColor(nArray).getRGB());
    }

    @Override
    public void drawCentered(String string, double d2, double d3, int[] nArray) {
        ((agi)this.wrapped).c(string, d2, d3, RenderAPI.intArrayToColor(nArray).getRGB());
    }

    @Override
    public void drawWithShadow(String string, double d2, double d3, int[] nArray) {
        ((agi)this.wrapped).b(string, d2, d3, RenderAPI.intArrayToColor(nArray).getRGB());
    }

    @Override
    public void drawCenteredWithShadow(String string, float f2, float f3, int[] nArray) {
        ((agi)this.wrapped).a(string, f2, f3, RenderAPI.intArrayToColor(nArray).getRGB());
    }
}

