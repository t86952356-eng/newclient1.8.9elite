/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;
import net.minecraft.util.bt;

public class vj
extends akg<tn> {
    @dm
    public final dk<ei> ajV = ei2 -> {
        if (Math.abs(bt.bN(vj.aER.bgK.pl) - bt.bN(bs.fk.x)) > 90.0f) {
            vj.aER.aIY.chs.ay(false);
            vj.aER.bgK.setSprinting(false);
        }
    };

    public vj(String string, tn tn2) {
        super(string, tn2);
    }
}

