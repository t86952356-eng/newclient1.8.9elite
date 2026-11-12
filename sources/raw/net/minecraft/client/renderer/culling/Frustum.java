/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.culling;

import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.util.a;

public class Frustum
implements ICamera {
    private final ClippingHelper bUf;
    private double bUg;
    private double bUh;
    private double bUi;

    public Frustum() {
        this(ClippingHelperImpl.Ni());
    }

    public Frustum(ClippingHelper clippingHelper) {
        this.bUf = clippingHelper;
    }

    @Override
    public void setPosition(double d2, double d3, double d4) {
        this.bUg = d2;
        this.bUh = d3;
        this.bUi = d4;
    }

    public boolean f(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.bUf.f(d2 - this.bUg, d3 - this.bUh, d4 - this.bUi, d5 - this.bUg, d6 - this.bUh, d7 - this.bUi);
    }

    @Override
    public boolean k(a a2) {
        return this.f(a2.dtH, a2.dtI, a2.dtJ, a2.dtK, a2.dtL, a2.dtM);
    }

    public boolean g(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.bUf.g(d2 - this.bUg, d3 - this.bUh, d4 - this.bUi, d5 - this.bUg, d6 - this.bUh, d7 - this.bUi);
    }
}

