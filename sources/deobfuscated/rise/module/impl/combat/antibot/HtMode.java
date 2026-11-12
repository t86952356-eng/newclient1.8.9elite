/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import net.minecraft.client.network.o;
import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HtMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rC = preMotionEvent -> HtMode.aER.bgF.dCY.forEach(a2 -> {
        o o2 = aER.AU().d(a2.Ul());
        if (o2 != null && o2.Ig() < 0) {
            Client.a.x().b(this, (c)a2);
        }
    });

    public HtMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

