/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.inventorymove;

import hackclient.rise.ahn;
import hackclient.rise.fg;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.InventoryMove;
import rise.value.NumberValue;

public class BufferAbuseMode
extends Mode<InventoryMove> {
    private final NumberValue JB = new NumberValue("Clicks", this, (Number)3, (Number)2, (Number)10, (Number)1);
    private final NumberValue JC = new NumberValue("Amount", this, (Number)5, (Number)1, (Number)10, (Number)1);
    private final ConcurrentLinkedQueue<aj<?>> JD = new ConcurrentLinkedQueue();
    private boolean JE;
    private boolean GU;
    private int JF;
    @EventLink
    public final Listener<PreMotionEvent> JG = preMotionEvent -> {
        if (this.hz()) {
            if (!this.GU) {
                if (!this.JE) {
                    this.JE = true;
                } else {
                    for (int i2 = 0; i2 < ((Number)this.JC.wD()).intValue(); ++i2) {
                        ahn.n(new r());
                    }
                    this.JD.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
                    this.JD.clear();
                    this.GU = true;
                }
            }
        } else {
            this.JE = false;
            this.GU = false;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> JH = strafeEvent -> {
        if (this.hz() && !this.GU) {
            strafeEvent.cF();
        }
    };
    @EventLink
    public final Listener<JumpEvent> JI = jumpEvent -> {
        if (this.hz() && !this.GU) {
            jumpEvent.cF();
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> JJ = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof r) {
            if (this.hz() && !this.GU) {
                packetSendEvent.cF();
                this.JD.add(aj2);
                return;
            }
            ++this.JF;
        }
    };
    @EventLink
    public final Listener<fg> JK = fg2 -> this.JD.clear();
    private final d[] JL;
    @EventLink
    public final Listener<PreUpdateEvent> JM;

    public BufferAbuseMode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.JL = new d[]{BufferAbuseMode.aER.aIY.chm, BufferAbuseMode.aER.aIY.cho, BufferAbuseMode.aER.aIY.chp, BufferAbuseMode.aER.aIY.chn, BufferAbuseMode.aER.aIY.chq};
        this.JM = preUpdateEvent -> {
            if (BufferAbuseMode.aER.bgR instanceof f || BufferAbuseMode.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JL) {
                d2.ay(a.a(d2));
            }
        };
    }

    private boolean hz() {
        return this.JF > 0 && this.JF % ((Number)this.JB.wD()).intValue() == 0;
    }
}

