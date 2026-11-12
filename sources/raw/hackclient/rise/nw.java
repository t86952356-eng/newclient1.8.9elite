/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;
import net.minecraft.util.da;

public class nw
extends akg<lw> {
    public da Jr = new da(0.0, 0.0, 0.0);
    @dm
    public final dk<ei> Js = ei2 -> {
        ei2.setPosX(this.Jr.dAG);
        ei2.setPosY(this.Jr.dAH);
        ei2.setPosZ(this.Jr.dAI);
        ei2.setOnGround(true);
    };
    @dm
    public final dk<eo> Jt = eo2 -> {
        float f2 = 3.0f;
        eo2.setSpeed(3.0);
        nw.aER.bgK.ue = 0.0;
    };

    public nw(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        if (!nw.aER.bgK.aO) {
            this.toggle();
        }
        cg.e("Flight", "This feature is only enabled for developers atm");
        this.Jr = new da(nw.aER.bgK.gW, nw.aER.bgK.gX, nw.aER.bgK.gY);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

