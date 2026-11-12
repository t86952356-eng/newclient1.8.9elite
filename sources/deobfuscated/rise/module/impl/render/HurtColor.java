/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.fn;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.hurtcolor.name"}, description="module.render.hurtcolor.description", category=Category.RENDER)
public final class HurtColor
extends Module {
    private final BooleanValue aoE = new BooleanValue("1.7 Damage Animation", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<fn> aoF = fn2 -> fn2.n((Boolean)this.aoE.wD());
}

