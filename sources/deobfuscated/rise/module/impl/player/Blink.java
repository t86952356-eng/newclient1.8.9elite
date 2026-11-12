/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahj;
import hackclient.rise.akj;
import hackclient.rise.bm;
import hackclient.rise.fg;
import net.minecraft.client.entity.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.player.blink.name"}, description="module.player.blink.description", category=Category.PLAYER)
public class Blink
extends Module {
    public BooleanValue yz = new BooleanValue("Pulse", (Module)this, (Boolean)false);
    public akj xa = new akj("Delay", this, (Number)2, (Number)2, (Number)2, (Number)40, (Number)1, () -> (Boolean)this.yz.wD() == false);
    public int ps;
    private b pv;
    @EventLink
    public final Listener<PreMotionEvent> abH = preMotionEvent -> bm.blink();
    @EventLink
    public final Listener<PostMotionEvent> abI = postMotionEvent -> {
        if (Blink.aER.bgK.aRg > this.ps && ((Boolean)this.yz.wD()).booleanValue()) {
            this.gi();
            bm.dispatch();
            this.gj();
        }
    };
    @EventLink
    public final Listener<fg> abJ = fg2 -> this.gi();

    @Override
    public void onEnable() {
        this.gi();
    }

    @Override
    public void onDisable() {
        this.gj();
    }

    public void gi() {
        if (Blink.aER.bgK == null) {
            return;
        }
        this.ps = Blink.aER.bgK.aRg + (int)ahj.l(((Number)this.xa.wD()).intValue(), this.xa.wP().intValue());
    }

    public void gj() {
        if (this.pv != null) {
            Client.a.x().c(this, this.pv);
            Blink.aER.bgF.co(this.pv.getEntityId());
            this.pv = null;
        }
    }
}

