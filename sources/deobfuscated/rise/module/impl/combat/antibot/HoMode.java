/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import hackclient.rise.fd;
import hackclient.rise.fg;
import net.minecraft.client.network.o;
import net.minecraft.entity.player.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public class HoMode
extends Mode<AntiBot> {
    @EventLink
    public final Listener<PreMotionEvent> rw = preMotionEvent -> {
        if (HoMode.aER.bgF == null || HoMode.aER.bgK == null) {
            return;
        }
        for (a a2 : HoMode.aER.bgF.dCY) {
            if (a2 == HoMode.aER.bgK) continue;
            o o2 = aER.AU().d(a2.Ul());
            if (o2 == null) {
                Client.a.x().b(this, a2);
                continue;
            }
            Client.a.x().c(this, a2);
        }
    };
    @EventLink
    public final Listener<fg> rx = fg2 -> Client.a.x().a(this);
    @EventLink
    public final Listener<fd> ry = fd2 -> Client.a.x().a(this);

    public HoMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
    }
}

