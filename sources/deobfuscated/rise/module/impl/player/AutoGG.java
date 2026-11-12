/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.akr;
import hackclient.rise.fg;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.other.autogg.name"}, description="module.other.autogg.description", category=Category.PLAYER)
public final class AutoGG
extends Module {
    private final akr TD = new akr("Message", (Module)this, "Why waste another game without Rise?");
    private boolean dj;
    private boolean TE;
    @EventLink
    public final Listener<PreMotionEvent> TF = preMotionEvent -> {
        if (AutoGG.aER.bgK.aRg % 18 != 0 || !AutoGG.aER.bgK.bkd.bEQ || aER.Bf()) {
            return;
        }
        if (AutoGG.aER.bgF.dCY.stream().filter(a2 -> !a2.isInvisible() || a2 == AutoGG.aER.bgK).count() <= 1L) {
            if (this.dj) {
                AutoGG.aER.bgK.sendChatMessage((String)this.TD.wD());
                this.dj = false;
            }
        } else if (this.TE) {
            this.dj = true;
            this.TE = false;
        }
    };
    @EventLink
    public final Listener<fg> TG = fg2 -> {
        this.TE = true;
    };

    @Override
    public void onEnable() {
        this.TE = true;
    }
}

