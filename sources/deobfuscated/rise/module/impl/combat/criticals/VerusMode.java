/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.criticals;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.f;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.module.Mode;
import rise.module.impl.combat.Criticals;
import rise.value.NumberValue;

public final class VerusMode
extends Mode<Criticals> {
    private final NumberValue rO = new NumberValue("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)1);
    private final double[] rP = new double[]{0.0625, 0.0};
    private final a rQ = new a();
    @EventLink
    public final Listener<AttackEvent> rR = attackEvent -> {
        if (this.rQ.T(((Number)this.rO.wD()).longValue()) && VerusMode.aER.bgK.crx > 2 && VerusMode.aER.bgK.cus != 0) {
            for (double d2 : this.rP) {
                ahn.m(new f(VerusMode.aER.bgK.gW, VerusMode.aER.bgK.gX + d2, VerusMode.aER.bgK.gY, false));
            }
            VerusMode.aER.bgK.E(attackEvent.dc());
            this.rQ.aX();
        }
    };

    public VerusMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

