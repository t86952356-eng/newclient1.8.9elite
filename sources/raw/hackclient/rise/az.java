/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;

public class az
extends am {
    private boolean cF;
    @dm
    public final dk<ei> cG = ei2 -> {
        if (az.aER.bgR == null && this.cF) {
            for (d d2 : az.aER.aIY.chL) {
                d2.ay(a.a(d2));
            }
        }
        this.cF = az.aER.bgR != null;
    };
}

