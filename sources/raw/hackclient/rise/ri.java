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
import net.minecraft.util.bt;

public class ri
extends akg<mp> {
    @dm
    public final dk<ei> Tu = ei2 -> {
        if (ri.aER.bgK.crR) {
            if (ri.aER.bgK.aRg % 2 == 0) {
                ei2.setOnGround(true);
                ri.aER.bgK.ue = aii.jumpMotion();
            }
            double d2 = aii.direction();
            ei2.setPosX(ei2.getPosX() - (double)(-bt.bx((float)d2) * 0.1f));
            ei2.setPosZ(ei2.getPosZ() - (double)(bt.bB((float)d2) * 0.1f));
        }
    };

    public ri(String string, mp mp2) {
        super(string, mp2);
    }
}

