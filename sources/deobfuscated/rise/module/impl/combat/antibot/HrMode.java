/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HrMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rA = preMotionEvent -> HrMode.aER.bgF.dCY.forEach(a2 -> {
        if (a2.aec) {
            Client.a.x().c(this, (c)a2);
        } else {
            Client.a.x().b(this, (c)a2);
        }
    });

    public HrMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

