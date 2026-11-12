/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.bi;
import java.util.Objects;
import net.minecraft.network.play.client.p;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;

public final class dd
extends am {
    @EventLink
    public final Listener<PreUpdateEvent> iE = preUpdateEvent -> {};
    @EventLink
    public final Listener<PreUpdateEvent> iF = preUpdateEvent -> {
        if (Objects.equals(bi.dx, "localhost")) {
            aER.AU().u(new p(dd.aER.bgK.cuV, dd.aER.bgK.cuW, dd.aER.bgK.bkr.gD, dd.aER.bgK.bkr.jr));
        }
    };
}

