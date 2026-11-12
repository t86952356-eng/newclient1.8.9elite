/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.eh;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.Speed;

public class WatchdogPrediction2Mode
extends Mode<Flight> {
    private double tU;
    private final double HU = 0.03;
    private final double HV = 0.053299998353843775;
    private final double HW = 1.0;
    private int tY;
    private boolean tZ;
    private akd ua;
    @EventLink
    public final Listener<PreMotionEvent> HX = preMotionEvent -> {};
    @EventLink
    public final Listener<StrafeEvent> HY = strafeEvent -> {
        if (WatchdogPrediction2Mode.aER.bgK.tR == 5) {
            // empty if block
        }
        if ((WatchdogPrediction2Mode.aER.bgK.tR - 1) % 3 == 0) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<eh> HZ = eh2 -> {
        if (WatchdogPrediction2Mode.aER.bgK.aO) {
            WatchdogPrediction2Mode.aER.bgK.jump();
        } else if ((WatchdogPrediction2Mode.aER.bgK.tR - 1) % 3 == 0) {
            this.ua = new akd(WatchdogPrediction2Mode.aER.bgK.ud, WatchdogPrediction2Mode.aER.bgK.ue, WatchdogPrediction2Mode.aER.bgK.uf);
            WatchdogPrediction2Mode.aER.bgK.ue = 0.0;
            aii.stop();
        } else if (this.ua != null) {
            if (Math.abs(this.ua.getX()) < 0.005) {
                this.ua.setX(0.0);
            }
            if (Math.abs(this.ua.getY()) < 0.005) {
                this.ua.setY(0.0);
            }
            if (Math.abs(this.ua.getZ()) < 0.005) {
                this.ua.setZ(0.0);
            }
            double d2 = WatchdogPrediction2Mode.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            double d3 = 1.0;
            WatchdogPrediction2Mode.aER.bgK.ud = this.ua.getX() * d2;
            WatchdogPrediction2Mode.aER.bgK.ue = this.ua.getY() * d2;
            WatchdogPrediction2Mode.aER.bgK.uf = this.ua.getZ() * d2;
            if (!KillAura.nQ) {
                // empty if block
            }
            this.ua = null;
            this.tZ = true;
        } else if (this.tZ) {
            this.tZ = false;
            if (!KillAura.nQ) {
                // empty if block
            }
        }
        if (WatchdogPrediction2Mode.aER.bgK.tR > 5) {
            // empty if block
        }
        if (WatchdogPrediction2Mode.aER.bgK.ae == 1) {
            // empty if block
        }
    };

    public WatchdogPrediction2Mode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        this.tU = 0.0;
        WatchdogPrediction2Mode.aER.bgC.dAp = 1.0f;
        if (this.ua != null) {
            WatchdogPrediction2Mode.aER.bgK.ud = this.ua.getX() * (double)0.91f;
            WatchdogPrediction2Mode.aER.bgK.ue = this.ua.getY();
            WatchdogPrediction2Mode.aER.bgK.uf = this.ua.getZ() * (double)0.91f;
            this.ua = null;
        }
    }

    @Override
    public void onEnable() {
        if (this.e(Speed.class).isEnabled()) {
            this.e(Speed.class).setEnabled(false);
        }
        this.tU = 0.0;
        this.tY = 0;
    }
}

