/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class MatrixHighJumpMode
extends Mode<Flight> {
    private final BooleanValue GZ = new BooleanValue("Self Damage", (Mode<?>)this, (Boolean)false);
    private final NumberValue Ha = new NumberValue("Height", this, (Number)1.0, (Number)0.42, (Number)7.0, (Number)0.1);
    private int Hb;
    private boolean Hc;
    private boolean Hd;
    private double He;
    private double Hf;
    private double Hg;
    @EventLink
    public final Listener<PreUpdateEvent> Hh = preUpdateEvent -> {
        if (MatrixHighJumpMode.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (this.Hd) {
            MatrixHighJumpMode.aER.bgK.ue = ((Number)this.Ha.wD()).doubleValue();
        }
        if (MatrixHighJumpMode.aER.bgK.cus >= 1 && MatrixHighJumpMode.aER.bgK.cus <= 8) {
            if (MatrixHighJumpMode.aER.bgK.aO) {
                MatrixHighJumpMode.aER.bgK.jump();
            } else if (MatrixHighJumpMode.aER.bgK.ue < 0.2) {
                this.Hd = true;
            }
        }
        if (this.Hb < 4 && ((Boolean)this.GZ.wD()).booleanValue() && MatrixHighJumpMode.aER.bgK.aO) {
            MatrixHighJumpMode.aER.bgK.jump();
            ++this.Hb;
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Hi = preMotionEvent -> {
        if (this.Hb < 4 && ((Boolean)this.GZ.wD()).booleanValue()) {
            preMotionEvent.setOnGround(false);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Hj = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof h && this.Hc) {
            this.Hc = false;
            MatrixHighJumpMode.aER.bgK.ud = this.He;
            MatrixHighJumpMode.aER.bgK.ue = this.Hf;
            MatrixHighJumpMode.aER.bgK.uf = this.Hg;
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> Hk = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (this.Hd && aj2 instanceof i) {
            this.Hc = true;
            this.He = MatrixHighJumpMode.aER.bgK.ud;
            this.Hf = MatrixHighJumpMode.aER.bgK.ue;
            this.Hg = MatrixHighJumpMode.aER.bgK.uf;
            this.Hd = false;
        }
    };

    public MatrixHighJumpMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Hb = 0;
        this.Hd = false;
        this.Hc = false;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

