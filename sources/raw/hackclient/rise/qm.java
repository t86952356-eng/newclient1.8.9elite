/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.mh;

public class qm
extends akg<mh> {
    private final akq QX = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @dm
    public final dk<eo> QY = eo2 -> {
        if (aii.isMoving() && qm.aER.bgK.aO) {
            qm.aER.bgK.jump();
        }
        eo2.setSpeed(((Number)this.QX.wD()).floatValue());
    };

    public qm(String string, mh mh2) {
        super(string, mh2);
    }
}

