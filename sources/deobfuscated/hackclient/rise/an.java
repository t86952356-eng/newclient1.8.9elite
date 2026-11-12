/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.am;
import hackclient.rise.fg;
import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.KillEvent;
import rise.event.impl.PreMotionEvent;

public class an
extends am
implements ahd {
    c by = null;
    @EventLink(cH=1)
    public final Listener<PreMotionEvent> bz = preMotionEvent -> {
        if (this.by != null && !an.aER.bgF.dCS.contains(this.by)) {
            Client.a.e().d(new KillEvent(this.by));
            this.by = null;
        }
    };
    @EventLink(cH=1)
    public final Listener<AttackEvent> bA = attackEvent -> {
        this.by = attackEvent.dc();
    };
    @EventLink(cH=1)
    public final Listener<fg> bB = fg2 -> {
        this.by = null;
    };
}

