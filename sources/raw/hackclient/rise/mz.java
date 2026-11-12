/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ez;
import hackclient.rise.lw;
import net.minecraft.network.play.client.f;

public final class mz
extends akg<lw> {
    private final akq FV = new akq("Speed", this, (Number)1.2, (Number)0.8, (Number)2, (Number)0.05);
    private final aki FW = new aki("Vanilla Kick Bypass", (akg<?>)this, (Boolean)true);
    private double xv;
    private int FX;
    private int hV;
    @dm
    private final dk<ei> FY = ei2 -> ei2.setOnGround(true);
    @dm(cH=4)
    private final dk<ez> FZ = ez2 -> {
        if (!aii.isMoving() || mz.aER.bgK.crR) {
            this.FX = -1;
        }
        if (((Boolean)this.FW.wD()).booleanValue() && this.hV > 125) {
            this.FX = -1;
            this.hV = 0;
            ahn.n(new f(mz.aER.bgK.gW + 5.0, mz.aER.bgK.gX + 1.0, mz.aER.bgK.gY + 5.0, true));
            return;
        }
        switch (this.FX) {
            case -1: {
                mz.aER.bgK.ue = 0.0;
                ez2.setPosY(-1.0E-5);
                return;
            }
            case 0: {
                this.xv = 0.3;
                break;
            }
            case 1: {
                if (!mz.aER.bgK.aO) break;
                mz.aER.bgK.ue = 0.3999;
                ez2.setPosY(0.3999);
                this.xv *= 2.14;
                break;
            }
            case 2: {
                this.xv = ((Number)this.FV.wD()).doubleValue();
                break;
            }
            default: {
                this.xv -= this.xv / 109.0;
                mz.aER.bgK.ue = 0.0;
                ez2.setPosY(-1.0E-5);
            }
        }
        mz.aER.bgK.cuI = 0.0f;
        aii.a(ez2, Math.max(this.xv, aii.getAllowedHorizontalDistance()));
        ++this.FX;
    };

    public mz(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.xv = 0.0;
        this.FX = mz.aER.bgK.aO ? 0 : -1;
        this.hV = 0;
    }
}

