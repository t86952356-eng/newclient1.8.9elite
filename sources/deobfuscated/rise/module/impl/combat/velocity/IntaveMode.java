/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.HitSlowDownEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;

public final class IntaveMode
extends Mode<Velocity> {
    private boolean pw;
    private boolean ux;
    @EventLink
    public final Listener<PreUpdateEvent> uy = preUpdateEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !IntaveMode.aER.bgK.cup) {
            return;
        }
        if (this.pw && !this.ux && IntaveMode.aER.bgK.isSprinting()) {
            IntaveMode.aER.bgK.ud *= 0.6;
            IntaveMode.aER.bgK.uf *= 0.6;
            IntaveMode.aER.bgK.setSprinting(false);
        }
        this.pw = false;
        this.ux = false;
    };
    @EventLink
    public final Listener<HitSlowDownEvent> uz = hitSlowDownEvent -> {
        this.ux = true;
    };
    @EventLink
    public final Listener<AttackEvent> uA = attackEvent -> {
        this.pw = true;
    };

    public IntaveMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

