/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.sneak;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Sneak;

public class NCPMode
extends Mode<Sneak> {
    @EventLink
    public final Listener<PreMotionEvent> Pj = preMotionEvent -> {
        NCPMode.aER.bgK.bkr.jr = NCPMode.aER.bgK.bkd.bEQ;
        ahn.m(new n(NCPMode.aER.bgK, o.dbq));
    };
    @EventLink
    public final Listener<PostMotionEvent> Pk = postMotionEvent -> ahn.m(new n(NCPMode.aER.bgK, o.dbp));

    public NCPMode(String string, Sneak sneak) {
        super(string, sneak);
    }

    @Override
    public void onDisable() {
        ahn.m(new n(NCPMode.aER.bgK, o.dbq));
    }
}

