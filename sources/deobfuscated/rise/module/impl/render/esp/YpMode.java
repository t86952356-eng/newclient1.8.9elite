/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.esp;

import hackclient.rise.cf;
import hackclient.rise.cn;
import hackclient.rise.cq;
import java.awt.Color;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.render.ESP;

public final class YpMode
extends Mode<ESP> {
    @EventLink
    public final Listener<PreUpdateEvent> asP = preUpdateEvent -> {
        Color color = this.rP().rQ();
        cf.a(new cq(new cn(color, color, color)));
    };

    public YpMode(String string, ESP eSP) {
        super(string, eSP);
    }
}

