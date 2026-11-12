/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fd;
import hackclient.rise.fi;
import hackclient.rise.jk;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;

public class kr
extends akg<jk> {
    private float gZ;
    private float ha;
    private boolean ys;
    @dm
    public final dk<fd> Ac = fd2 -> {
        this.gZ = fd2.getYaw();
        this.ha = fd2.getPitch();
        fd2.setYaw(kr.aER.bgK.pl);
        fd2.setPitch(kr.aER.bgK.pm);
        this.ys = true;
    };
    @dm
    public final dk<fi> Ad = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (this.ys && aj2 instanceof h) {
            h h2 = (h)aj2;
            h2.gZ = this.gZ;
            h2.ha = this.ha;
            fi2.e(h2);
            this.ys = false;
        }
    };

    public kr(String string, jk jk2) {
        super(string, jk2);
    }
}

