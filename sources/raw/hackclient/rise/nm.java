/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ez;
import hackclient.rise.lw;

public final class nm
extends akg<lw> {
    private final akq HR = new akq("Speed", this, (Number)1.2, (Number)0.8, (Number)10, (Number)0.05);
    private final akq HS = new akq("Damage Speed", this, (Number)5, (Number)0.8, (Number)10, (Number)0.05);
    private double xv;
    private int FX;
    @dm(cH=4)
    private final dk<ez> HT = ez2 -> {
        if (!aii.isMoving() || nm.aER.bgK.crR) {
            this.FX = -1;
        }
        if (nm.aER.bgK.ae == 1) {
            this.xv = ((Number)this.HS.wD()).doubleValue();
        }
        switch (this.FX) {
            case -1: {
                nm.aER.bgK.ue = 0.0;
                ez2.setPosY(-1.0E-5);
                break;
            }
            case 0: {
                this.xv = 0.3;
                break;
            }
            case 1: {
                if (!nm.aER.bgK.aO) break;
                nm.aER.bgK.ue = 0.3999;
                ez2.setPosY(0.3999);
                this.xv *= 2.14;
                break;
            }
            case 2: {
                this.xv = ((Number)this.HR.wD()).doubleValue();
                break;
            }
            default: {
                this.xv -= this.xv / 109.0;
                nm.aER.bgK.ue = 0.0;
                ez2.setPosY(-1.0E-5);
            }
        }
        if (nm.aER.bgK.aRg % 20 == 0) {
            ez2.setPosY(-0.035);
        }
        if (this.FX != -1) {
            nm.aER.bgK.cuI = 0.0f;
            aii.a(ez2, Math.max(this.xv, aii.getAllowedHorizontalDistance()));
            ++this.FX;
        }
    };

    public nm(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.xv = 0.0;
        this.FX = nm.aER.bgK.aO ? 0 : -1;
    }
}

