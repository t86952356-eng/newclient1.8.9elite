/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;

public class jt
extends akg<jg> {
    @dm
    public final dk<fi> xF = fi2 -> {
        if (fi2.dq() instanceof h) {
            h h2 = (h)fi2.dq();
            fi2.e(new f(h2.getX(), h2.getY(), h2.getZ(), h2.isOnGround()));
        }
    };

    public jt(String string, jg jg2) {
        super(string, jg2);
    }
}

