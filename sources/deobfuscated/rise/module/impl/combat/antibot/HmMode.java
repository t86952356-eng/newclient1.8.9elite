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

public final class HmMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> ru = preMotionEvent -> HmMode.aER.bgF.dCY.forEach(a3 -> {
        String string = a3.xW().arq();
        if (HmMode.aER.bgF.dCY.stream().anyMatch(a2 -> string.equals(a2.xW().arq()))) {
            Client.a.x().b(this, (c)a3);
        }
    });

    public HmMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

