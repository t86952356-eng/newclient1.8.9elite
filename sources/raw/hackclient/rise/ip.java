/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.hf;

public final class ip
extends akg<hf> {
    private final akq uu = new akq("Delay", this, (Number)1, (Number)0, (Number)20, (Number)1);
    private int hV;
    @dm
    public final dk<ei> uv = ei2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ip.aER.bgK.cup) {
            return;
        }
        if (ip.aER.bgK.ae == ((Number)this.uu.wD()).intValue()) {
            ip.aER.bgK.aO = true;
        }
    };
    @dm
    public final dk<dz> uw = dz2 -> {
        if (ip.aER.bgK.ae == ((Number)this.uu.wD()).intValue() + 1) {
            dz2.setJump(false);
        }
    };

    public ip(String string, hf hf2) {
        super(string, hf2);
    }
}

