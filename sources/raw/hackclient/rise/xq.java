/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.akb;
import hackclient.rise.xp;
import hackclient.rise.zr;
import java.util.ArrayList;

class xq
extends ArrayList<zr> {
    final /* synthetic */ xp apA;

    xq(xp xp2) {
        this.apA = xp2;
        this.add(new zr(new akb(25.0f, 0.0f), aea.aER.aIY.chm));
        this.add(new zr(new akb(0.0f, 25.0f), aea.aER.aIY.chn));
        this.add(new zr(new akb(50.0f, 25.0f), aea.aER.aIY.chp));
        this.add(new zr(new akb(25.0f, 25.0f), aea.aER.aIY.cho));
        if (((Boolean)this.apA.apv.wD()).booleanValue()) {
            this.add(new zr(new akb(72.0f, 22.0f), new akb(0.0f, 50.0f), "Space", aea.aER.aIY.chq));
        }
    }
}

