/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fc;
import hackclient.rise.mj;
import net.minecraft.network.play.client.f;

public class qx
extends akg<mj> {
    @dm
    public final dk<ei> SC = ei2 -> {
        qx.aER.bgK.cso = qx.aER.bgK.cvl > 11 ? 1.0f : 0.6f;
    };
    @dm
    public final dk<fc> SD = fc2 -> {
        if (fc2.da() > 0.6) {
            qx.aER.bgC.dAp = 0.5f;
            ahn.m(new f(qx.aER.bgK.gW, qx.aER.bgK.gX + 0.5, qx.aER.bgK.gY, true));
        }
    };

    public qx(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qx.aER.bgK.cso = 0.6f;
    }
}

