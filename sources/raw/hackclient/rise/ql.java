/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.mh;
import net.minecraft.entity.c;

public class ql
extends akg<mh> {
    public final aki QO = new aki("Smooth Camera", (akg<?>)this, (Boolean)false);
    private boolean LK;
    private double LL;
    private boolean HJ;
    private double QP;
    private int FX;
    private double QQ;
    private final double QR = 0.2873;
    @dm
    public final dk<ei> QS = ei2 -> {
        double d2 = ql.aER.bgK.gW - ql.aER.bgK.csh;
        double d3 = ql.aER.bgK.gY - ql.aER.bgK.csj;
        this.QQ = Math.sqrt(d2 * d2 + d3 * d3);
        if (this.FX == 3) {
            ei2.setPosY(ei2.getPosY() + 0.4);
        }
    };
    @dm
    public final dk<dz> QT = dz2 -> dz2.setJump(false);
    @dm
    public final dk<eo> QU = eo2 -> {
        if (!aii.isMoving()) {
            // empty if block
        }
        switch (this.FX) {
            case 2: {
                this.LL *= 2.14;
                this.FX = 3;
                break;
            }
            case 3: {
                this.FX = 2;
                double d2 = 0.66 * (this.QQ - 0.2873);
                this.LL = this.QQ - d2;
                break;
            }
            default: {
                if (ql.aER.bgF.a((c)ql.aER.bgK, ql.aER.bgK.Us().ae(0.0, ql.aER.bgK.ue, 0.0)).size() > 0 || ql.aER.bgK.crW) {
                    this.FX = 1;
                }
                this.LL = this.QQ - this.QQ / 159.0;
            }
        }
        if (ql.aER.bgK.crR) {
            this.LL = 0.2873;
        }
        if (ql.aER.bgK.tR == 1 && ql.aER.bgK.Zz > 2) {
            this.LL = 0.3873;
        }
        if (!ql.aER.bgK.aO) {
            ++this.FX;
        }
        eo2.setSpeed(this.LL);
        aii.preventDiagonalSpeed();
    };
    @dm
    public final dk<dz> QV = dz2 -> dz2.setJump(false);
    @dm
    public final dk<ed> QW = ed2 -> ed2.setJumpMotion(0.4f);

    public ql(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }

    @Override
    public void onEnable() {
        this.FX = 2;
        this.LL = 0.2873;
        this.QQ = 0.0;
    }
}

