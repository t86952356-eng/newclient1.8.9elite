/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.mj;
import net.minecraft.potion.a;

public class qt
extends akg<mj> {
    private boolean Sk;
    @dm
    public final dk<ei> Sl = ei2 -> {
        if (qt.aER.bgK.aO && qt.aER.bgK.crR && !qt.aER.bgK.a(a.dgD)) {
            qt.aER.bgK.jump();
            aii.stop();
            this.Sk = true;
        }
        if (qt.aER.bgK.tR == 3 && this.Sk) {
            qt.aER.bgK.ue = aii.predictedMotion(qt.aER.bgK.ue, 2);
            aii.strafe(aii.getAllowedHorizontalDistance() * 0.6 - Math.random() / 100.0 - 0.05);
            this.Sk = false;
        }
    };

    public qt(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qt.aER.bgK.cso = 0.6f;
    }
}

