/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;

public final class Vulcan2Mode
extends Mode<LongJump> {
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> LU = preMotionEvent -> {
        ++this.hV;
        if (this.hV == 1) {
            Vulcan2Mode.aER.bgK.ue = 0.0;
            Vulcan2Mode.aER.bgK.aO = true;
            Vulcan2Mode.aER.bgK.setPosition(Vulcan2Mode.aER.bgK.gW, Vulcan2Mode.aER.bgK.gX + 9.9, Vulcan2Mode.aER.bgK.gY);
        }
        if (this.hV > 0 && this.hV <= 3) {
            Vulcan2Mode.aER.bgK.ue = 0.0;
            Vulcan2Mode.aER.bgK.aO = true;
        }
        if (this.hV > 3 && this.hV % 2 == 0 & !Vulcan2Mode.aER.bgK.aO) {
            Vulcan2Mode.aER.bgK.ue = -0.155;
        } else if (this.hV % 2 != 0 || Vulcan2Mode.aER.bgK.aO) {
            Vulcan2Mode.aER.bgK.ue = -0.098;
        }
    };

    public Vulcan2Mode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.hV = 0;
    }
}

