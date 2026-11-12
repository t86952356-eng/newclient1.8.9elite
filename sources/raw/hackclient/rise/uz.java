/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ua;

public class uz
extends akg<ua> {
    @dm
    public final dk<ei> ajC = ei2 -> {
        double d2 = aii.roundToGround(ei2.getPosY());
        float f2 = bd.cY;
        if (f2 > 3.0f && Math.abs(d2 - ei2.getPosY()) < 0.005) {
            uz.aER.bgK.setPosition(uz.aER.bgK.gW, d2, uz.aER.bgK.gY);
            ei2.setOnGround(true);
            ei2.setPosY(d2);
        }
    };

    public uz(String string, ua ua2) {
        super(string, ua2);
    }
}

