/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import hackclient.rise.fg;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.network.o;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;
import rise.module.impl.combat.KillAura;

public final class HjMode
extends Mode<AntiBot> {
    private boolean ro;
    private final Set<UUID> rp = new HashSet<UUID>();
    @EventLink
    public final Listener<PreMotionEvent> rq = preMotionEvent -> {
        if (HjMode.aER.bgF == null || HjMode.aER.bgK == null) {
            return;
        }
        KillAura killAura = this.e(KillAura.class);
        r r2 = killAura.jE;
        if (!this.ro && HjMode.aER.bgK.aRg >= 150 && this.e(KillAura.class).isEnabled() && r2 != null && !r2.csb) {
            this.rp.clear();
            for (o object : aER.AU().Id()) {
                if (object == null || object.Ie() == null) continue;
                this.rp.add(object.Ie().getId());
            }
            this.ro = true;
        }
        for (a a2 : HjMode.aER.bgF.dCY) {
            if (a2 == HjMode.aER.bgK) continue;
            if (!this.ro) {
                Client.a.x().c(this, a2);
                continue;
            }
            UUID uUID = a2.Ul();
            if (this.rp.contains(uUID)) {
                Client.a.x().c(this, a2);
                continue;
            }
            Client.a.x().b(this, a2);
        }
    };
    @EventLink
    public final Listener<fg> rr = fg2 -> {
        this.ro = false;
        this.rp.clear();
        Client.a.x().a(this);
    };

    public HjMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        this.ro = false;
        this.rp.clear();
        Client.a.x().a(this);
    }
}

