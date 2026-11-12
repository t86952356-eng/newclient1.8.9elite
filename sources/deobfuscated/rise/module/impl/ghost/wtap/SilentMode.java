/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost.wtap;

import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.ghost.WTap_lk;

public final class SilentMode
extends Mode<WTap_lk> {
    private r jE;
    @EventLink
    public final Listener<PreMotionEvent> Cy = preMotionEvent -> {
        if (this.jE != null && this.jE.cus == 9) {
            preMotionEvent.setSprinting(false);
        }
    };
    @EventLink
    public final Listener<AttackEvent> Cz = attackEvent -> {
        this.jE = attackEvent.dc();
    };

    public SilentMode(String string, WTap_lk wTap_lk) {
        super(string, wTap_lk);
    }
}

