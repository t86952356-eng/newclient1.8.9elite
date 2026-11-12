/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.go;
import hackclient.rise.lw;
import hackclient.rise.mh;

public class nn
extends akg<lw> {
    private double tU;
    private final double HU = 0.03;
    private final double HV = 0.053299998353843775;
    private final double HW = 1.0;
    private int tY;
    private boolean tZ;
    private akd ua;
    @dm
    public final dk<ei> HX = ei2 -> {};
    @dm
    public final dk<eo> HY = eo2 -> {
        if (nn.aER.bgK.tR == 5) {
            // empty if block
        }
        if ((nn.aER.bgK.tR - 1) % 3 == 0) {
            // empty if block
        }
    };
    @dm
    public final dk<eh> HZ = eh2 -> {
        if (nn.aER.bgK.aO) {
            nn.aER.bgK.jump();
        } else if ((nn.aER.bgK.tR - 1) % 3 == 0) {
            this.ua = new akd(nn.aER.bgK.ud, nn.aER.bgK.ue, nn.aER.bgK.uf);
            nn.aER.bgK.ue = 0.0;
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
            double d2 = nn.aER.bgK.tR <= 1 ? 0.5460000157356262 : 1.0;
            double d3 = 1.0;
            nn.aER.bgK.ud = this.ua.getX() * d2;
            nn.aER.bgK.ue = this.ua.getY() * d2;
            nn.aER.bgK.uf = this.ua.getZ() * d2;
            if (!go.nQ) {
                // empty if block
            }
            this.ua = null;
            this.tZ = true;
        } else if (this.tZ) {
            this.tZ = false;
            if (!go.nQ) {
                // empty if block
            }
        }
        if (nn.aER.bgK.tR > 5) {
            // empty if block
        }
        if (nn.aER.bgK.ae == 1) {
            // empty if block
        }
    };

    public nn(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        this.tU = 0.0;
        nn.aER.bgC.dAp = 1.0f;
        if (this.ua != null) {
            nn.aER.bgK.ud = this.ua.getX() * (double)0.91f;
            nn.aER.bgK.ue = this.ua.getY();
            nn.aER.bgK.uf = this.ua.getZ() * (double)0.91f;
            this.ua = null;
        }
    }

    @Override
    public void onEnable() {
        if (this.e(mh.class).isEnabled()) {
            this.e(mh.class).setEnabled(false);
        }
        this.tU = 0.0;
        this.tY = 0;
    }
}

