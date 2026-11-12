/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tb;

public class uk
extends akg<tb> {
    private final akq ain = new akq("Distance", this, (Number)5, (Number)0, (Number)10, (Number)1);
    @dm
    public final dk<ei> aio = ei2 -> {
        if (bd.cY > (float)((Number)this.ain.wD()).intValue() && !aik.vw() && uk.aER.bgK.gX + uk.aER.bgK.ue < Math.floor(uk.aER.bgK.gX)) {
            uk.aER.bgK.ue = Math.floor(uk.aER.bgK.gX) - uk.aER.bgK.gX;
            if (uk.aER.bgK.ue == 0.0) {
                uk.aER.bgK.aO = true;
                ei2.setOnGround(true);
            }
        }
    };

    public uk(String string, tb tb2) {
        super(string, tb2);
    }
}

