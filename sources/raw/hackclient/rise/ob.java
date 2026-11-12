/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
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

public final class ob
extends akg<lx> {
    private final d[] JR;
    private final akq JS;
    @dm
    public final dk<ej> JT;
    @dm
    public final dk<en> JU;

    public ob(String string, lx lx2) {
        super(string, lx2);
        this.JR = new d[]{ob.aER.aIY.chm, ob.aER.aIY.cho, ob.aER.aIY.chp, ob.aER.aIY.chn, ob.aER.aIY.chq};
        this.JS = new akq("Manager Extra Sprint Ticks", this, (Number)9, (Number)0, (Number)20, (Number)1);
        this.JT = ej2 -> {
            if (ob.aER.bgR == null || ob.aER.bgR instanceof f || ob.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JR) {
                d2.ay(a.a(d2));
            }
        };
        this.JU = en2 -> {
            if (ob.aER.bgR instanceof q || ob.aER.bgR instanceof h) {
                ob.aER.bgK.setSprinting(false);
            }
        };
    }

    public int hA() {
        return ((Number)this.JS.wD()).intValue();
    }
}

