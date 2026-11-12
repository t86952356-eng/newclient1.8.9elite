/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aks;
import hackclient.rise.bd;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

public class MatrixDamageMode
extends Mode<Flight> {
    private final NumberValue Ia = new NumberValue("Timer Speed", this, (Number)30, (Number)1.0, (Number)100.0, (Number)0.1);
    private final NumberValue Ib = new NumberValue("Speed", this, (Number)0.07, (Number)0.0, (Number)1.0, (Number)0.01);
    private final BooleanValue Ic = new BooleanValue("No Speed", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Id = new BooleanValue("Detect Damage", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Ie = new BooleanValue("Auto Disable", (Mode<?>)this, (Boolean)true);
    private final NumberValue If = new NumberValue("Fly Ticks", this, (Number)1000, (Number)0.0, (Number)1600.0, (Number)10.0, () -> (Boolean)this.Id.wD() == false);
    private final BooleanValue Ig = new BooleanValue("Self Damage", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Ih = new BooleanValue("New Self Damage", (Mode<?>)this, (Boolean)false);
    private final BooleanValue Ii = new BooleanValue("Packet", (Mode<?>)this, (Boolean)true);
    private final ModeValue Ij = new ModeValue("Motion Y", this).a(new Mode[]{new aks("None")}).a(new Mode[]{new aks("Simple")}).a(new Mode[]{new aks("Multiply")}).co("None");
    private final NumberValue Ik = new NumberValue("Motion", this, (Number)-0.01, (Number)-0.3, (Number)0.3, (Number)0.01, () -> ((Mode)this.Ij.wD()).getName().equals("None"));
    private float Il;
    private float Im;
    private int In;
    private int Hb;
    private int Io;
    private boolean Ip;
    @EventLink
    public final Listener<PreMotionEvent> Iq = preMotionEvent -> {
        if (((Boolean)this.Ig.wD()).booleanValue() && MatrixDamageMode.aER.bgK.cus <= 0 && this.Hb < 4) {
            preMotionEvent.setOnGround(false);
        }
        if (((Boolean)this.Ih.wD()).booleanValue() && bd.cY > 3.0f) {
            preMotionEvent.setOnGround(true);
            MatrixDamageMode.aER.bgK.aO = true;
            MatrixDamageMode.aER.bgK.ue = 0.0;
            bd.cY = 0.0f;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Ir = moveInputEvent -> {
        if (!(!((Boolean)this.Ig.wD()).booleanValue() || this.Ip || this.Hb >= 4 && MatrixDamageMode.aER.bgK.aO)) {
            moveInputEvent.setSneak(false);
            moveInputEvent.setJump(false);
            moveInputEvent.setStrafe(0.0f);
            moveInputEvent.setForward(0.0f);
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> Is = preUpdateEvent -> {
        if (MatrixDamageMode.aER.bgK.cus > 0 && !this.Ip) {
            if (MatrixDamageMode.aER.bgK.cus <= 8) {
                // empty if block
            }
            if (MatrixDamageMode.aER.bgK.tR >= 3) {
                this.Io = 20 * ((Number)this.Ia.wD()).intValue();
                this.Ip = true;
            }
        }
        if (((Boolean)this.Ig.wD()).booleanValue() && MatrixDamageMode.aER.bgK.cus <= 0 && this.Hb < 4 && MatrixDamageMode.aER.bgK.aO) {
            MatrixDamageMode.aER.bgK.jump();
            ++this.Hb;
        }
        if (!((Boolean)this.Id.wD()).booleanValue() || this.In <= ((Number)this.If.wD()).intValue() && this.Ip) {
            double d2;
            double d3 = d2 = this.Io > 0 ? ((Number)this.Ib.wD()).doubleValue() : 0.03;
            if (!((Boolean)this.Ic.wD()).booleanValue()) {
                aii.strafe(d2);
            }
            MatrixDamageMode.aER.bgC.dAp = ((Number)this.Ia.wD()).floatValue();
            switch (((Mode)this.Ij.wD()).getName()) {
                case "None": {
                    MatrixDamageMode.aER.bgK.ue *= 0.039;
                    break;
                }
                case "Stable": {
                    MatrixDamageMode.aER.bgK.ue = ((Number)this.Ik.wD()).doubleValue();
                    break;
                }
                case "Multiply": {
                    MatrixDamageMode.aER.bgK.ue *= ((Number)this.Ik.wD()).doubleValue();
                }
            }
            if (this.Io > 0) {
                --this.Io;
            }
            ++this.In;
        }
        if (((Boolean)this.Id.wD()).booleanValue() && this.Ip) {
            if (!((Boolean)this.Ie.wD()).booleanValue()) {
                if (this.In >= ((Number)this.If.wD()).intValue()) {
                    ((Flight)this.wy()).toggle();
                }
            } else if (this.Io <= 0) {
                ((Flight)this.wy()).toggle();
            }
        }
    };

    public MatrixDamageMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.In = 0;
        this.Hb = 0;
        this.Io = 0;
        this.Ip = false;
        this.Il = MatrixDamageMode.aER.bgK.pl;
        this.Im = MatrixDamageMode.aER.bgK.pm;
    }

    @Override
    public void onDisable() {
        this.In = 0;
        this.Hb = 0;
        this.Io = 0;
        this.Ip = false;
        MatrixDamageMode.aER.bgC.dAp = 1.0f;
        if (((Boolean)this.Ii.wD()).booleanValue()) {
            ahn.n(new h(MatrixDamageMode.aER.bgK.gW, MatrixDamageMode.aER.bgK.gX, MatrixDamageMode.aER.bgK.gY, MatrixDamageMode.aER.bgK.pl, MatrixDamageMode.aER.bgK.pm, false));
            ahn.n(new f(MatrixDamageMode.aER.bgK.gW, MatrixDamageMode.aER.bgK.gX, MatrixDamageMode.aER.bgK.gY, false));
            ahn.n(new h(MatrixDamageMode.aER.bgK.gW, MatrixDamageMode.aER.bgK.gX, MatrixDamageMode.aER.bgK.gY, MatrixDamageMode.aER.bgK.pl, MatrixDamageMode.aER.bgK.pm, false));
        }
    }
}

