/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import hackclient.rise.el;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.combat.fences.name"}, description="module.combat.fences.description", category=Category.COMBAT)
public final class Fences
extends Module {
    @EventLink
    public final Listener<el> lJ = el2 -> {
        Fences.aER.bgK.crP = true;
        el2.h(-5.0);
    };

    @Override
    public void onDisable() {
        Fences.aER.bgK.crP = false;
    }
}

