/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.lx;
import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;

public final class od
extends akg<lx> {
    private final d[] JY;
    @dm
    private final dk<ej> JZ;

    public od(String string, lx lx2) {
        super(string, lx2);
        this.JY = new d[]{od.aER.aIY.chm, od.aER.aIY.cho, od.aER.aIY.chp, od.aER.aIY.chn, od.aER.aIY.chq};
        this.JZ = ej2 -> {
            if (od.aER.bgR == null || od.aER.bgR instanceof f || od.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JY) {
                d2.ay(a.a(d2));
            }
        };
    }
}

