/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.RenderAPI;
import com.alan.clients.script.api.wrapper.impl.ScriptFontRenderer;
import hackclient.rise.agg;

public class ScriptMCFontRenderer
extends ScriptFontRenderer<agg> {
    public ScriptMCFontRenderer(agg agg2) {
        super(agg2);
    }

    @Override
    public double width(String string) {
        return ((agg)this.wrapped).bQ(string);
    }

    @Override
    public double height() {
        return agg.aIF;
    }

    @Override
    public void draw(String string, double d2, double d3, int[] nArray) {
        ((agg)this.wrapped).a(string, d2, d3, RenderAPI.intArrayToColor(nArray).getRGB());
    }

    @Override
    public void drawCentered(String string, double d2, double d3, int[] nArray) {
        ((agg)this.wrapped).b(string, (float)d2 - (float)((int)this.width(string) >> 1), (float)d3, RenderAPI.intArrayToColor(nArray).getRGB(), false);
    }

    @Override
    public void drawWithShadow(String string, double d2, double d3, int[] nArray) {
        ((agg)this.wrapped).b(string, d2, d3, RenderAPI.intArrayToColor(nArray).getRGB(), true);
    }

    @Override
    public void drawCenteredWithShadow(String string, float f2, float f3, int[] nArray) {
        ((agg)this.wrapped).b(string, f2 - (float)((int)this.width(string) >> 1), f3, RenderAPI.intArrayToColor(nArray).getRGB(), true);
    }
}

