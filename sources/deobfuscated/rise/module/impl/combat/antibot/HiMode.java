/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.antibot;

import hackclient.rise.aem;
import hackclient.rise.fg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.player.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.AntiBot;

public final class HiMode
extends Mode<AntiBot> {
    private final Set<UUID> ri = new HashSet<UUID>();
    private final Set<UUID> rj = new HashSet<UUID>();
    private final Set<String> rk = new HashSet<String>();
    private final Map<String, Integer> rl = new HashMap<String, Integer>();
    @EventLink
    public final Listener<PreMotionEvent> rm = preMotionEvent -> {
        if (HiMode.aER.bgF == null || HiMode.aER.bgK == null) {
            return;
        }
        for (Object e2 : HiMode.aER.bgF.dCY) {
            a a2;
            if (!(e2 instanceof a) || (a2 = (a)e2) == HiMode.aER.bgK) continue;
            String string = a2.xU();
            this.rl.putIfAbsent(string, a2.getEntityId());
            if (this.rk.contains(string) && this.rl.get(string).intValue() != a2.getEntityId()) {
                Client.a.x().b(this, a2);
                continue;
            }
            this.rk.add(string);
            if (a2.Ie() == null) {
                Client.a.x().b(this, a2);
                continue;
            }
            UUID uUID = a2.Ie().getId();
            if (uUID == null) {
                Client.a.x().b(this, a2);
                continue;
            }
            if (uUID.version() != 4) {
                Client.a.x().b(this, a2);
                continue;
            }
            if (this.rj.contains(uUID)) {
                Client.a.x().b(this, a2);
                continue;
            }
            if (this.ri.contains(uUID)) continue;
            this.ri.add(uUID);
            aem.a(uUID, bl2 -> {
                block4: {
                    block3: {
                        this.ri.remove(uUID);
                        if (bl2.booleanValue()) break block3;
                        this.rj.add(uUID);
                        if (HiMode.aER.bgF == null) break block4;
                        for (Object e2 : HiMode.aER.bgF.dCY) {
                            a a2;
                            if (!(e2 instanceof a) || (a2 = (a)e2).Ie() == null || !uUID.equals(a2.Ie().getId())) continue;
                            Client.a.x().b(this, a2);
                        }
                        break block4;
                    }
                    if (HiMode.aER.bgF != null) {
                        for (Object e3 : HiMode.aER.bgF.dCY) {
                            a a3;
                            if (!(e3 instanceof a) || (a3 = (a)e3).Ie() == null || !uUID.equals(a3.Ie().getId())) continue;
                            Client.a.x().c(this, a3);
                        }
                    }
                }
            });
        }
    };
    @EventLink
    public final Listener<fg> rn = fg2 -> {
        Client.a.x().a(this);
        this.ri.clear();
        this.rj.clear();
        this.rk.clear();
        this.rl.clear();
        aem.sr();
    };

    public HiMode(String string, AntiBot antiBot) {
        super(string, antiBot);
    }

    @Override
    public void onDisable() {
        Client.a.x().a(this);
        this.ri.clear();
        this.rj.clear();
        this.rk.clear();
        this.rl.clear();
    }
}

