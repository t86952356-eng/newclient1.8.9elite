/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.eh;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Speed;
import rise.value.NumberValue;

public class WatchdogPredictionMode
extends Mode<Speed> {
    private final NumberValue PV = new NumberValue("Speed", this, (Number)1, (Number)1, (Number)10, (Number)1);
    private double tU;
    private final double PW = 0.03;
    private final double PX = 0.053299998353843775;
    private final double PY = 1.0;
    private int tY;
    private boolean tZ;
    private akd ua;
    @EventLink
    public final Listener<PreMotionEvent> PZ = preMotionEvent -> {};
    @EventLink
    public final Listener<StrafeEvent> Qa = strafeEvent -> {};
    @EventLink
    public final Listener<eh> Qb = eh2 -> {
        double d2;
        if (WatchdogPredictionMode.aER.bgK.aO && aii.isMoving() && !WatchdogPredictionMode.aER.bgK.csz) {
            WatchdogPredictionMode.aER.bgK.jump();
        }
        if (WatchdogPredictionMode.aER.bgK.tR == 5 && WatchdogPredictionMode.aER.bgK.ae > 7) {
            this.ua = new akd(WatchdogPredictionMode.aER.bgK.ud, WatchdogPredictionMode.aER.bgK.ue, WatchdogPredictionMode.aER.bgK.uf);
            WatchdogPredictionMode.aER.bgK.ue = 0.0;
            aii.stop();
        } else if (this.ua != null && WatchdogPredictionMode.aER.bgK.ae > 7 && WatchdogPredictionMode.aER.bgK.tR == 6) {
            if (Math.abs(this.ua.getX()) < 0.005) {
                this.ua.setX(0.0);
            }
            if (Math.abs(this.ua.getY()) < 0.005) {
                this.ua.setY(0.0);
            }
            if (Math.abs(this.ua.getZ()) < 0.005) {
                this.ua.setZ(0.0);
            }
            d2 = WatchdogPredictionMode.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            WatchdogPredictionMode.aER.bgK.ud = this.ua.getX() * d2;
            WatchdogPredictionMode.aER.bgK.ue = this.ua.getY() - 0.02 * d2;
            WatchdogPredictionMode.aER.bgK.uf = this.ua.getZ() * d2;
            if (KillAura.nQ) {
                aii.moveFlying(0.1);
            } else {
                aii.moveFlying(0.1);
            }
            this.ua = null;
            this.tZ = true;
        } else if (this.tZ && WatchdogPredictionMode.aER.bgK.ae > 7 && !KillAura.nQ && WatchdogPredictionMode.aER.bgK.tR == 7) {
            d2 = WatchdogPredictionMode.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            aii.moveFlying(0.06);
            this.tZ = false;
        }
        if (WatchdogPredictionMode.aER.bgK.tR > 5) {
            // empty if block
        }
        if (WatchdogPredictionMode.aER.bgK.csz) {
            WatchdogPredictionMode.aER.aIY.chq.ay(true);
            if ((WatchdogPredictionMode.aER.bgK.tR - 1) % 3 == 0 && WatchdogPredictionMode.aER.bgK.ae > 1) {
                this.ua = new akd(WatchdogPredictionMode.aER.bgK.ud, WatchdogPredictionMode.aER.bgK.ue, WatchdogPredictionMode.aER.bgK.uf);
                WatchdogPredictionMode.aER.bgK.ue = 0.0;
                aii.stop();
            } else if (this.ua != null && WatchdogPredictionMode.aER.bgK.ae > 2) {
                if (Math.abs(this.ua.getX()) < 0.005) {
                    this.ua.setX(0.0);
                }
                if (Math.abs(this.ua.getY()) < 0.005) {
                    this.ua.setY(0.0);
                }
                if (Math.abs(this.ua.getZ()) < 0.005) {
                    this.ua.setZ(0.0);
                }
                d2 = WatchdogPredictionMode.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
                double d3 = 1.0;
                WatchdogPredictionMode.aER.bgK.ud = this.ua.getX() * d2;
                WatchdogPredictionMode.aER.bgK.ue = (this.ua.getY() - 1.0E-14) * d3;
                WatchdogPredictionMode.aER.bgK.uf = this.ua.getZ() * d2;
                if (!KillAura.nQ) {
                    aii.moveFlying(0.087);
                } else {
                    aii.moveFlying(0.063);
                }
                this.ua = null;
                this.tZ = true;
            } else if (this.tZ && WatchdogPredictionMode.aER.bgK.ae > 2) {
                this.tZ = false;
                if (!KillAura.nQ) {
                    aii.moveFlying(0.086);
                } else {
                    aii.moveFlying(0.063);
                }
            }
        }
        if (WatchdogPredictionMode.aER.bgK.Zz == 1) {
            // empty if block
        }
    };

    public WatchdogPredictionMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        this.tU = 0.0;
        if (WatchdogPredictionMode.aER.aIY.chq.Re()) {
            WatchdogPredictionMode.aER.aIY.chq.ay(false);
        }
        WatchdogPredictionMode.aER.bgC.dAp = 1.0f;
        if (this.ua != null) {
            WatchdogPredictionMode.aER.bgK.ud = this.ua.getX() * (double)0.91f;
            WatchdogPredictionMode.aER.bgK.ue = this.ua.getY();
            WatchdogPredictionMode.aER.bgK.uf = this.ua.getZ() * (double)0.91f;
            this.ua = null;
        }
    }

    @Override
    public void onEnable() {
        this.tU = 0.0;
        this.tY = 0;
    }
}

