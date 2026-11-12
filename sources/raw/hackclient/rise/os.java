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
import hackclient.rise.lz;

public class os
extends akg<lz> {
    private final akq LR = new akq("Height", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.01);
    private final akq LS = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @dm
    public final dk<eo> LT = eo2 -> {
        if (os.aER.bgK.aO) {
            os.aER.bgK.ue = ((Number)this.LR.wD()).floatValue();
        }
        eo2.setSpeed(((Number)this.LS.wD()).floatValue());
    };

    public os(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

