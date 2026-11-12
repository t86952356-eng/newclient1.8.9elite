/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ua;
import net.minecraft.network.play.client.e;

public class ux
extends akg<ua> {
    @dm
    public final dk<ei> ajA = ei2 -> {
        float f2 = bd.cY;
        if ((double)bd.cY > 3.1 + ux.aER.bgK.ue) {
            ahn.m(new e(true));
            f2 = 0.0f;
        }
        bd.cY = f2;
    };

    public ux(String string, ua ua2) {
        super(string, ua2);
    }
}

