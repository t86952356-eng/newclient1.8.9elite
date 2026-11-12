/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.bu;
import net.minecraft.item.af;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.ghost.fastplace.name"}, description="module.ghost.fastplace.description", category=Category.GHOST)
public class FastPlace
extends Module {
    private final NumberValue Bf = new NumberValue("Delay", this, (Number)0, (Number)0, (Number)3, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> Bg = preMotionEvent -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) {
                FastPlace.aER.bhl = Math.min(FastPlace.aER.bhl, ((Number)this.Bf.wD()).intValue());
            }
        }
    };
}

