/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HnMode
extends Mode<AntiBot> {
    @EventLink
    private final Listener<PreUpdateEvent> rv = preUpdateEvent -> HnMode.aER.bgF.dCY.forEach(a2 -> {
        if (a2.xW().arq().contains("\u00a7")) {
            Client.a.x().c(this, (c)a2);
            return;
        }
        Client.a.x().b(this, (c)a2);
    });

    public HnMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

