/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.eh;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.stuck.name", "stasis"}, description="module.movement.stuck.description", category=Category.MOVEMENT)
public class Stuck
extends Module {
    private akd EC;
    private final BooleanValue ED = new BooleanValue("Rotate", (Module)this, (Boolean)false);
    private final BooleanValue EE = new BooleanValue("Test", (Module)this, (Boolean)false);
    private final NumberValue EF = new NumberValue("Pulse Ticks", this, (Number)0, (Number)0, (Number)30, (Number)1);
    private boolean EG;
    private int EH;
    private int EI;
    @EventLink
    public final Listener<eh> EJ = eh2 -> {
        if (!this.EG) {
            return;
        }
        aii.stop();
        Stuck.aER.bgK.ue = 0.0;
    };
    @EventLink
    public final Listener<TickEvent> EK = tickEvent -> {
        int n2 = ((Number)this.EF.wD()).intValue();
        if (n2 <= 0) {
            if (!this.EG) {
                this.hm();
            }
            this.EH = 0;
            this.EI = 0;
            return;
        }
        if (this.EG) {
            if (++this.EH >= n2) {
                this.hn();
                this.EH = 0;
                this.EI = 1;
            }
            return;
        }
        if (this.EI > 0 && --this.EI <= 0) {
            this.hm();
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> EL = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (((Boolean)this.EE.wD()).booleanValue() && this.EG && (aj2 instanceof c || aj2 instanceof i || aj2 instanceof k)) {
            this.ho();
        }
        if (this.EG && aj2 instanceof e) {
            if (!((Boolean)this.ED.wD()).booleanValue()) {
                packetSendEvent.cF();
                return;
            }
            if (!(aj2 instanceof g)) {
                packetSendEvent.cF();
            }
        }
    };

    @Override
    public void onEnable() {
        this.EG = false;
        this.EH = 0;
        this.EI = 0;
        this.hm();
    }

    @Override
    public void onDisable() {
        this.EH = 0;
        this.EI = 0;
        this.hn();
    }

    private void hm() {
        if (this.EG) {
            return;
        }
        this.EC = new akd(Stuck.aER.bgK.ud, Stuck.aER.bgK.ue, Stuck.aER.bgK.uf);
        this.EG = true;
    }

    private void hn() {
        if (!this.EG) {
            return;
        }
        if (this.EC != null) {
            Stuck.aER.bgK.ud = this.EC.x;
            Stuck.aER.bgK.ue = this.EC.y;
            Stuck.aER.bgK.uf = this.EC.z;
        }
        this.EG = false;
    }

    private void ho() {
        this.hn();
        this.EH = 0;
        this.EI = 1;
    }
}

