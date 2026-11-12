/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.module.Mode;
import rise.module.impl.movement.Phase;

public class PvMode
extends Mode<Phase> {
    public PvMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        if (PvMode.aER.bgK == null || PvMode.aER.bgF == null) {
            this.toggle();
            return;
        }
        b b2 = new b(PvMode.aER.bgK.gW, PvMode.aER.bgK.gX - 1.0, PvMode.aER.bgK.gY);
        ahn.m(new i(j.daZ, b2, ao.dwq));
        PvMode.aER.bgK.swingItem();
        ahn.m(new i(j.dbb, b2, ao.dwq));
        PvMode.aER.bgu.d(b2, ao.dwq);
        double d2 = (double)b2.wt() + 0.5;
        double d3 = (double)b2.wx() + 0.5;
        PvMode.aER.bgK.setPosition(d2, PvMode.aER.bgK.gX, d3);
    }

    @Override
    public void onDisable() {
    }
}

