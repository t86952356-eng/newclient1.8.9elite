/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tb;

public class um
extends akg<tb> {
    private final akq air = new akq("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @dm
    public final dk<ei> ais = ei2 -> {
        if (um.aER.bgK.csf > ((Number)this.air.wD()).floatValue() && !aik.vw()) {
            ei2.setPosY(ei2.getPosY() + (double)um.aER.bgK.csf);
        }
    };

    public um(String string, tb tb2) {
        super(string, tb2);
    }
}

