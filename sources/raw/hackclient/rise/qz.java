/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.mn;
import net.minecraft.util.da;

public final class qz
extends akg<mn> {
    public da Jr = new da(0.0, 0.0, 0.0);
    @dm
    public final dk<ei> SK = ei2 -> {
        ei2.setPosY(this.Jr.dAH);
        ei2.setPosX(this.Jr.dAG);
        ei2.setPosZ(this.Jr.dAI);
    };

    public qz(String string, mn mn2) {
        super(string, mn2);
    }

    @Override
    public void onEnable() {
        this.Jr = new da(qz.aER.bgK.gW, qz.aER.bgK.gX, qz.aER.bgK.gY);
        afl.b("Die -> Fly to where you want to teleport -> Toggle", new Object[0]);
    }
}

