/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.en;
import hackclient.rise.lx;
import net.minecraft.client.gui.f;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;

public final class oc
extends akg<lx> {
    private final d[] JV;
    @dm
    public final dk<en> JW;
    @dm
    private final dk<ej> JX;

    public oc(String string, lx lx2) {
        super(string, lx2);
        this.JV = new d[]{oc.aER.aIY.chm, oc.aER.aIY.cho, oc.aER.aIY.chp, oc.aER.aIY.chn, oc.aER.aIY.chq};
        this.JW = en2 -> {
            if (oc.aER.bgR instanceof q || oc.aER.bgR instanceof h) {
                oc.aER.bgK.setSprinting(false);
            }
        };
        this.JX = ej2 -> {
            if (oc.aER.bgR == null || oc.aER.bgR instanceof f || oc.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JV) {
                d2.ay(a.a(d2));
            }
        };
    }
}

