/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.esp;

import hackclient.rise.cf;
import hackclient.rise.cn;
import hackclient.rise.cs;
import java.awt.Color;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.render.ESP;

public class YrMode
extends Mode<ESP> {
    @EventLink
    public final Listener<PreUpdateEvent> asR = preUpdateEvent -> {
        Color color = this.rP().rQ();
        cf.a(new cs(new cn(color, color, color)));
    };

    public YrMode(String string, ESP eSP) {
        super(string, eSP);
    }
}

