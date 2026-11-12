/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.player.antisuffocate.name"}, description="module.player.antifsuffocate.description", category=Category.PLAYER)
public class AntiSuffocate
extends Module {
    private final BooleanValue abo = new BooleanValue("Swing", (Module)this, (Boolean)true);
    @EventLink
    public final Listener<PreMotionEvent> abp = preMotionEvent -> {
        if (AntiSuffocate.aER.bgK.TT()) {
            ahn.m(new i(j.daZ, new b(AntiSuffocate.aER.bgK).aqY(), ao.dwr));
            if (((Boolean)this.abo.wD()).booleanValue()) {
                AntiSuffocate.aER.bgK.swingItem();
            }
        }
    };
}

