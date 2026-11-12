/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ec;
import hackclient.rise.ej;
import hackclient.rise.eq;
import hackclient.rise.hf;

public final class iq
extends akg<hf> {
    private boolean pw;
    private boolean ux;
    @dm
    public final dk<ej> uy = ej2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !iq.aER.bgK.cup) {
            return;
        }
        if (this.pw && !this.ux && iq.aER.bgK.isSprinting()) {
            iq.aER.bgK.ud *= 0.6;
            iq.aER.bgK.uf *= 0.6;
            iq.aER.bgK.setSprinting(false);
        }
        this.pw = false;
        this.ux = false;
    };
    @dm
    public final dk<ec> uz = ec2 -> {
        this.ux = true;
    };
    @dm
    public final dk<eq> uA = eq2 -> {
        this.pw = true;
    };

    public iq(String string, hf hf2) {
        super(string, hf2);
    }
}

