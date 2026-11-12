/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ua;

public class uw
extends akg<ua> {
    @dm
    public final dk<ei> ajz = ei2 -> {
        ei2.setOnGround(false);
        ei2.setPosY(ei2.getPosY() + Math.random() / (double)1.0E20f);
    };

    public uw(String string, ua ua2) {
        super(string, ua2);
    }
}

