/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aix;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.entity.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.m;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.player.antifireball.name"}, description="module.player.antifireball.description", category=Category.PLAYER)
public class AntiFireBall
extends Module {
    private final BooleanValue abg = new BooleanValue("Rotate", (Module)this, (Boolean)true);
    private final BooleanValue abh = new BooleanValue("Movement Correction", (Module)this, (Boolean)true, () -> (Boolean)this.abg.wD() == false);
    private final BooleanValue abi = new BooleanValue("Bad Packets Check", (Module)this, (Boolean)false);
    public final a abj = new a();
    public int abk = 0;
    private final HashSet<UUID> abl = new HashSet();
    @EventLink(cH=-100)
    public final Listener<PreUpdateEvent> abm = preUpdateEvent -> this.jy();
    @EventLink(cH=-100)
    public final Listener<TickEvent> abn = tickEvent -> this.jy();

    public final void jy() {
        if (bb.aW() && ((Boolean)this.abi.wD()).booleanValue() || !this.abj.T(this.abk)) {
            return;
        }
        for (c c2 : AntiFireBall.aER.bgF.dCS) {
            if (!(c2 instanceof net.minecraft.entity.projectile.c) || !(c2.S(AntiFireBall.aER.bgK) < 6.0f)) continue;
            if (((Boolean)this.abg.wD()).booleanValue()) {
                bs.a(aix.y(c2), 10.0, (Boolean)this.abh.wD() != false ? cb.gH : cb.gG);
            }
            aii.strafe(0.0);
            if (c2.S(AntiFireBall.aER.bgK) <= 3.0f && !this.abl.contains(c2.Ul())) {
                ahn.m(new m());
                ahn.m(new net.minecraft.network.play.client.c(c2, d.daU));
                this.abl.add(c2.Ul());
                break;
            }
            aik.h(0, true);
            aik.h(0, false);
            break;
        }
    }
}

