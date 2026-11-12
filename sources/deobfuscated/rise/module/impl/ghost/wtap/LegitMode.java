/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost.wtap;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.ghost.WTap_lk;

public class LegitMode
extends Mode<WTap_lk> {
    private boolean Cu;
    private boolean Cv;
    @EventLink
    public final Listener<AttackEvent> Cw = attackEvent -> {
        boolean bl2 = this.Cv = Math.random() * 100.0 < ((Number)((WTap_lk)this.wy()).Ce.wD()).doubleValue() && attackEvent.dc().cus >= 6;
        if (!this.Cv || this.Cu) {
            return;
        }
        if (LegitMode.aER.bgK.isSprinting() || LegitMode.aER.aIY.chs.Re()) {
            LegitMode.aER.aIY.chs.ay(true);
            this.Cu = true;
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Cx = preMotionEvent -> {
        if (!this.Cv) {
            return;
        }
        if (this.Cu && Math.random() * 100.0 < ((Number)((WTap_lk)this.wy()).Ce.wD()).doubleValue()) {
            LegitMode.aER.aIY.chs.ay(false);
            this.Cu = false;
        }
    };

    public LegitMode(String string, WTap_lk wTap_lk) {
        super(string, wTap_lk);
    }
}

