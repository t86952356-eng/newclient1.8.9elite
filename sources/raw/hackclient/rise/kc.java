/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.s;

public class kc
extends akg<jg> {
    @dm
    public final dk<fi> yn = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof s && kc.aER.bgK.aRg % 6 != 0) {
            bc.cR = true;
            fi2.cF();
        } else {
            bc.cR = false;
        }
        if (aj2 instanceof s && kc.aER.bgK.aRg % 6 == 0) {
            bc.cR = true;
            bm.a(2000, true, true, false, false);
        }
    };

    public kc(String string, jg jg2) {
        super(string, jg2);
    }
}

