/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.bi;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import java.util.Objects;
import net.minecraft.network.play.client.p;

public final class dd
extends am {
    @dm
    public final dk<ej> iE = ej2 -> {};
    @dm
    public final dk<ej> iF = ej2 -> {
        if (Objects.equals(bi.dx, "localhost")) {
            aER.AU().u(new p(dd.aER.bgK.cuV, dd.aER.bgK.cuW, dd.aER.bgK.bkr.gD, dd.aER.bgK.bkr.jr));
        }
    };
}

