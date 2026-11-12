/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.ghost.noclickdelay.name"}, description="module.ghost.noclickdelay.description", category=Category.GHOST)
public class NoClickDelay
extends Module {
    @EventLink
    public final Listener<PreMotionEvent> BP = preMotionEvent -> {
        if (NoClickDelay.aER.bgK != null && NoClickDelay.aER.bgF != null) {
            NoClickDelay.aER.bgV = 0;
        }
    };
}

