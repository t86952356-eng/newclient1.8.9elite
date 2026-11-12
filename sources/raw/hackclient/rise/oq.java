/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.lz;

public class oq
extends akg<lz> {
    private final akq LF = new akq("Bunny Friction", this, (Number)159, (Number)59, (Number)259, (Number)1);
    private final akq LG = new akq("Ground Speed", this, (Number)0.4, (Number)0.1, (Number)3, (Number)0.1);
    private final akq LH = new akq("Jump Speed", this, (Number)1.4, (Number)0, (Number)3, (Number)0.1);
    private final akq LI = new akq("Glide", this, (Number)0, (Number)0, (Number)3, (Number)0.5);
    private final akq LJ = new akq("Timer", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1);
    private boolean LK;
    private double LL;
    @dm
    public final dk<eo> LM = eo2 -> {
        double d2 = aii.getAllowedHorizontalDistance();
        if (aii.isMoving()) {
            switch (oq.aER.bgK.tR) {
                case 0: {
                    oq.aER.bgK.ue = aii.jumpMotion() + 0.017;
                    this.LL = ((Number)this.LG.wD()).doubleValue();
                    break;
                }
                case 1: {
                    this.LL = ((Number)this.LH.wD()).doubleValue();
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            oq.aER.bgC.dAp = ((Number)this.LJ.wD()).floatValue();
            this.LK = false;
        } else if (!this.LK) {
            this.LL = aii.getAllowedHorizontalDistance();
            oq.aER.bgC.dAp = 1.0f;
            this.LK = true;
        }
        if (oq.aER.bgK.csf > 0.0f) {
            oq.aER.bgK.ue += (double)(((Number)this.LI.wD()).floatValue() / 100.0f);
        }
        if (oq.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        eo2.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @dm
    public final dk<fd> LN = fd2 -> {
        this.LL = 0.0;
    };

    public oq(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onDisable() {
        aii.stop();
        this.LL = 0.0;
    }
}

