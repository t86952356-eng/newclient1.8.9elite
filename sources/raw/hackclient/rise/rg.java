/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.mp;

public class rg
extends akg<mp> {
    private boolean Tr;
    @dm
    public final dk<ei> Ts = ei2 -> {
        if (rg.aER.bgK.crR && !this.Tr && rg.aER.bgK.aRg % 3 == 0) {
            rg.aER.bgK.ue = aii.jumpMotion();
        }
        if (rg.aER.bgK.crW) {
            this.Tr = !rg.aER.bgK.aO;
        }
    };

    public rg(String string, mp mp2) {
        super(string, mp2);
    }
}

