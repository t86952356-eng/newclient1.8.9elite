/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;

public class a
extends net.minecraft.util.a {
    private int asz = -1;
    private boolean etm = false;

    public a(double d2, double d3, double d4, double d5, double d6, double d7) {
        super(d2, d3, d4, d5, d6, d7);
    }

    public boolean b(ICamera iCamera, int n2) {
        if (this.asz != n2) {
            this.etm = iCamera instanceof Frustum && ((Frustum)iCamera).g(this.dtH, this.dtI, this.dtJ, this.dtK, this.dtL, this.dtM);
            this.asz = n2;
        }
        return this.etm;
    }
}

