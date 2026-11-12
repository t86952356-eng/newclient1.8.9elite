/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;
import org.apache.commons.lang3.RandomUtils;

public class nl
extends akg<lw> {
    @dm
    public final dk<ei> HP = ei2 -> {
        ei2.setPosY(ei2.getPosY() + 1.0E-5 + (nl.aER.bgK.aRg % 2 == 0 ? RandomUtils.nextDouble((double)1.0E-10, (double)1.0E-5) : -RandomUtils.nextDouble((double)1.0E-10, (double)1.0E-5)));
        nl.aER.bgK.ue = 0.0;
    };
    @dm
    public final dk<eo> HQ = eo2 -> eo2.setSpeed(aii.getAllowedHorizontalDistance(), Math.random() / 2000.0);

    public nl(String string, lw lw2) {
        super(string, lw2);
    }
}

