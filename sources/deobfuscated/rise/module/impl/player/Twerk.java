/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.player.twerk.name"}, description="module.player.twerk.description", category=Category.PLAYER)
public class Twerk
extends Module {
    @EventLink
    public final Listener<PreMotionEvent> aib = preMotionEvent -> Twerk.aER.aIY.chr.ay(Math.random() < 0.5);
}

