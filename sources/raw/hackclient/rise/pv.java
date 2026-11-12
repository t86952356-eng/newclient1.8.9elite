/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.md;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class pv
extends akg<md> {
    public pv(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        if (pv.aER.bgK == null || pv.aER.bgF == null) {
            this.toggle();
            return;
        }
        b b2 = new b(pv.aER.bgK.gW, pv.aER.bgK.gX - 1.0, pv.aER.bgK.gY);
        ahn.m(new i(j.daZ, b2, ao.dwq));
        pv.aER.bgK.swingItem();
        ahn.m(new i(j.dbb, b2, ao.dwq));
        pv.aER.bgu.d(b2, ao.dwq);
        double d2 = (double)b2.wt() + 0.5;
        double d3 = (double)b2.wx() + 0.5;
        pv.aER.bgK.setPosition(d2, pv.aER.bgK.gX, d3);
    }

    @Override
    public void onDisable() {
    }
}

