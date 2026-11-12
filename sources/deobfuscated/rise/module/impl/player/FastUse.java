/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.player.fastuse.name"}, description="module.player.fastuse.description", category=Category.PLAYER)
public class FastUse
extends Module {
    private final NumberValue adn = new NumberValue("Speed", this, (Number)1, (Number)1, (Number)24, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> ado = preMotionEvent -> {
        if (FastUse.aER.bgK.isUsingItem()) {
            for (int i2 = 0; i2 <= ((Number)this.adn.wD()).intValue(); ++i2) {
                ahn.m(new h(FastUse.aER.bgK.gW, FastUse.aER.bgK.gX, FastUse.aER.bgK.gY, FastUse.aER.bgK.pl, FastUse.aER.bgK.pm, FastUse.aER.bgK.aO));
            }
        }
    };
}

