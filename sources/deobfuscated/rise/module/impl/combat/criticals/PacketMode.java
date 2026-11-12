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

public final class PacketMode
extends Mode<Criticals> {
    private final NumberValue rK = new NumberValue("Delay", this, (Number)500, (Number)0, (Number)1000, (Number)1);
    private final double[] rL = new double[]{0.42, 0.0};
    private final a rM = new a();
    @EventLink
    public final Listener<AttackEvent> rN = attackEvent -> {
        if (this.rM.T(((Number)this.rK.wD()).longValue()) && PacketMode.aER.bgK.crx > 0) {
            for (double d2 : this.rL) {
                ahn.m(new f(PacketMode.aER.bgK.gW, PacketMode.aER.bgK.gX + d2, PacketMode.aER.bgK.gY, false));
            }
            PacketMode.aER.bgK.E(attackEvent.dc());
            this.rM.aX();
        }
    };

    public PacketMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

