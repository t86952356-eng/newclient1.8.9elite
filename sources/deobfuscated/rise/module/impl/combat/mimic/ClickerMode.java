/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.mimic;

import hackclient.rise.afl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.m;
import net.minecraft.util.cw;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.combat.Mimic;

public class ClickerMode
extends Mode<Mimic> {
    private long sc;
    private HashMap<String, cw<ArrayList<Integer>, Integer>> sd = new HashMap();
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> se = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof m) {
            m m2 = (m)aj2;
            int n2 = m2.getEntityID();
            if (n2 == ClickerMode.aER.bgK.getEntityId()) {
                return;
            }
            String string = ClickerMode.aER.bgF.cn(n2).xU();
            int n3 = ClickerMode.aER.bgK.aRg;
            if (!this.sd.containsKey(string)) {
                this.sd.put(string, new cw(new ArrayList(), n3));
            }
            cw<ArrayList<Integer>, Integer> cw2 = this.sd.get(string);
            afl.b("Recorded " + (n3 - cw2.wj()) + " von " + string, new Object[0]);
            cw2.wi().add(n3 - cw2.wj());
            cw2.k(n3);
        }
    };
    @EventLink(cH=0)
    public final Listener<PreUpdateEvent> sf = preUpdateEvent -> {
        if (!ClickerMode.aER.aIY.chw.Re()) {
            return;
        }
        if (ClickerMode.aER.aIY.chr.Re()) {
            this.sd = new HashMap();
        }
        if (System.currentTimeMillis() > this.sc) {
            long l2 = 0L;
            while (l2 == 0L || l2 >= 450L) {
                Optional optional;
                if (l2 != 0L) {
                    afl.b("Running again prev " + l2, new Object[0]);
                }
                if (!(optional = this.sd.keySet().stream().findFirst()).isPresent()) {
                    afl.b("Empty", new Object[0]);
                    return;
                }
                cw<ArrayList<Integer>, Integer> cw2 = this.sd.get(optional.get());
                if (cw2.wi().isEmpty()) {
                    this.sd.remove(optional.get());
                    return;
                }
                l2 = cw2.wi().get(0) * 50;
                cw2.wi().remove(0);
                afl.b("Running " + (String)optional.get() + " " + l2, new Object[0]);
            }
            this.sc = System.currentTimeMillis() + l2 / 2L;
            aER.AN();
            ClickerMode.aER.bgV = 1;
        }
    };

    public ClickerMode(String string, Mimic mimic) {
        super(string, mimic);
    }
}

