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

public final class HlMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rt = preMotionEvent -> HlMode.aER.bgF.dCY.forEach(a2 -> {
        if (HlMode.aER.bgF.dCY.stream().anyMatch(a3 -> a3.getEntityId() == a2.getEntityId() && a3 != a2)) {
            Client.a.x().b(this, (c)a2);
        }
    });

    public HlMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

