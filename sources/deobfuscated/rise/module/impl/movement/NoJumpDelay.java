/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.Scaffold;

@ModuleInfo(aliases={"module.movement.nojumpdelay.name"}, description="module.movement.nojumpdelay.description", category=Category.MOVEMENT)
public class NoJumpDelay
extends Module {
    @EventLink
    public final Listener<PreUpdateEvent> DM = preUpdateEvent -> {
        Scaffold scaffold = this.e(Scaffold.class);
        if (scaffold.isEnabled() && ((Mode)scaffold.ags.wD()).getName().equals("Telly") && NoJumpDelay.aER.aIY.chq.Re() && scaffold.kw()) {
            return;
        }
        NoJumpDelay.aER.bgK.cvk = 0;
    };
}

