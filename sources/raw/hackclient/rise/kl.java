/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.s;

public class kl
extends akg<jg> {
    @dm
    public final dk<fi> yU = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof s) {
            s s2 = (s)aj2;
            fi2.cF();
        }
    };

    public kl(String string, jg jg2) {
        super(string, jg2);
    }
}

