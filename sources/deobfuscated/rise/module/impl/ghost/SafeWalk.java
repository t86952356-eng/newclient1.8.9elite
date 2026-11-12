/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.ghost;

import hackclient.rise.bu;
import net.minecraft.item.af;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.ghost.safewalk.name"}, description="module.ghost.safewalk.description", category=Category.GHOST)
public class SafeWalk
extends Module {
    private final BooleanValue Ca = new BooleanValue("Blocks Only", (Module)this, (Boolean)false);
    private final BooleanValue Cb = new BooleanValue("Backwards Only", (Module)this, (Boolean)false);
    @EventLink
    public final Listener<PreUpdateEvent> Cc = this::b;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void b(PreUpdateEvent var1_1) {
        block2: {
            v0 = SafeWalk.aER.bgK;
            if (!SafeWalk.aER.bgK.aO || SafeWalk.aER.aIY.chm.Re() && ((Boolean)this.Cb.wD()).booleanValue()) ** GOTO lbl-1000
            this.d(bu.class);
            if (bu.bO() == null) break block2;
            this.d(bu.class);
            if (bu.bO().bP() instanceof af) ** GOTO lbl-1000
        }
        if (!((Boolean)this.Ca.wD()).booleanValue()) lbl-1000:
        // 2 sources

        {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        v0.crP = v1;
    }
}

