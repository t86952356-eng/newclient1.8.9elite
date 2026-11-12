/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.lz;

public final class ou
extends akg<lz> {
    private int hV;
    @dm
    public final dk<ei> LU = ei2 -> {
        ++this.hV;
        if (this.hV == 1) {
            ou.aER.bgK.ue = 0.0;
            ou.aER.bgK.aO = true;
            ou.aER.bgK.setPosition(ou.aER.bgK.gW, ou.aER.bgK.gX + 9.9, ou.aER.bgK.gY);
        }
        if (this.hV > 0 && this.hV <= 3) {
            ou.aER.bgK.ue = 0.0;
            ou.aER.bgK.aO = true;
        }
        if (this.hV > 3 && this.hV % 2 == 0 & !ou.aER.bgK.aO) {
            ou.aER.bgK.ue = -0.155;
        } else if (this.hV % 2 != 0 || ou.aER.bgK.aO) {
            ou.aER.bgK.ue = -0.098;
        }
    };

    public ou(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.hV = 0;
    }
}

