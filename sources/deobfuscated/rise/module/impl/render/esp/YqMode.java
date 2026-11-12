/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.esp;

import hackclient.rise.cf;
import hackclient.rise.cn;
import hackclient.rise.cr;
import java.awt.Color;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.render.ESP;

public final class YqMode
extends Mode<ESP> {
    @EventLink
    public final Listener<PreUpdateEvent> asQ = preUpdateEvent -> {
        Color color = this.rP().rQ();
        cf.a(new cr(new cn(color, color, color)));
    };

    public YqMode(String string, ESP eSP) {
        super(string, eSP);
    }
}

