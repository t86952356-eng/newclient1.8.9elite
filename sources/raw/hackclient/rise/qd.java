/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.go;
import hackclient.rise.mh;

public class qd
extends akg<mh> {
    private final akq PV = new akq("Speed", this, (Number)1, (Number)1, (Number)10, (Number)1);
    private double tU;
    private final double PW = 0.03;
    private final double PX = 0.053299998353843775;
    private final double PY = 1.0;
    private int tY;
    private boolean tZ;
    private akd ua;
    @dm
    public final dk<ei> PZ = ei2 -> {};
    @dm
    public final dk<eo> Qa = eo2 -> {};
    @dm
    public final dk<eh> Qb = eh2 -> {
        double d2;
        if (qd.aER.bgK.aO && aii.isMoving() && !qd.aER.bgK.csz) {
            qd.aER.bgK.jump();
        }
        if (qd.aER.bgK.tR == 5 && qd.aER.bgK.ae > 7) {
            this.ua = new akd(qd.aER.bgK.ud, qd.aER.bgK.ue, qd.aER.bgK.uf);
            qd.aER.bgK.ue = 0.0;
            aii.stop();
        } else if (this.ua != null && qd.aER.bgK.ae > 7 && qd.aER.bgK.tR == 6) {
            if (Math.abs(this.ua.getX()) < 0.005) {
                this.ua.setX(0.0);
            }
            if (Math.abs(this.ua.getY()) < 0.005) {
                this.ua.setY(0.0);
            }
            if (Math.abs(this.ua.getZ()) < 0.005) {
                this.ua.setZ(0.0);
            }
            d2 = qd.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            qd.aER.bgK.ud = this.ua.getX() * d2;
            qd.aER.bgK.ue = this.ua.getY() - 0.02 * d2;
            qd.aER.bgK.uf = this.ua.getZ() * d2;
            if (go.nQ) {
                aii.moveFlying(0.1);
            } else {
                aii.moveFlying(0.1);
            }
            this.ua = null;
            this.tZ = true;
        } else if (this.tZ && qd.aER.bgK.ae > 7 && !go.nQ && qd.aER.bgK.tR == 7) {
            d2 = qd.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            aii.moveFlying(0.06);
            this.tZ = false;
        }
        if (qd.aER.bgK.tR > 5) {
            // empty if block
        }
        if (qd.aER.bgK.csz) {
            qd.aER.aIY.chq.ay(true);
            if ((qd.aER.bgK.tR - 1) % 3 == 0 && qd.aER.bgK.ae > 1) {
                this.ua = new akd(qd.aER.bgK.ud, qd.aER.bgK.ue, qd.aER.bgK.uf);
                qd.aER.bgK.ue = 0.0;
                aii.stop();
            } else if (this.ua != null && qd.aER.bgK.ae > 2) {
                if (Math.abs(this.ua.getX()) < 0.005) {
                    this.ua.setX(0.0);
                }
                if (Math.abs(this.ua.getY()) < 0.005) {
                    this.ua.setY(0.0);
                }
                if (Math.abs(this.ua.getZ()) < 0.005) {
                    this.ua.setZ(0.0);
                }
                d2 = qd.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
                double d3 = 1.0;
                qd.aER.bgK.ud = this.ua.getX() * d2;
                qd.aER.bgK.ue = (this.ua.getY() - 1.0E-14) * d3;
                qd.aER.bgK.uf = this.ua.getZ() * d2;
                if (!go.nQ) {
                    aii.moveFlying(0.087);
                } else {
                    aii.moveFlying(0.063);
                }
                this.ua = null;
                this.tZ = true;
            } else if (this.tZ && qd.aER.bgK.ae > 2) {
                this.tZ = false;
                if (!go.nQ) {
                    aii.moveFlying(0.086);
                } else {
                    aii.moveFlying(0.063);
                }
            }
        }
        if (qd.aER.bgK.Zz == 1) {
            // empty if block
        }
    };

    public qd(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onDisable() {
        this.tU = 0.0;
        if (qd.aER.aIY.chq.Re()) {
            qd.aER.aIY.chq.ay(false);
        }
        qd.aER.bgC.dAp = 1.0f;
        if (this.ua != null) {
            qd.aER.bgK.ud = this.ua.getX() * (double)0.91f;
            qd.aER.bgK.ue = this.ua.getY();
            qd.aER.bgK.uf = this.ua.getZ() * (double)0.91f;
            this.ua = null;
        }
    }

    @Override
    public void onEnable() {
        this.tU = 0.0;
        this.tY = 0;
    }
}

