/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dx;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.tn;

public class vo
extends akg<tn> {
    private boolean El;
    @dm(cH=3)
    private final dk<ej> akq = ej2 -> {
        if (vo.aER.bgK.aO && !vo.aER.aIY.chq.Re()) {
            vo.aER.bgC.dAp = 1.0029f;
            aii.preventDiagonalSpeed();
            vo.aER.bgK.uf *= 0.998;
            vo.aER.bgK.ud *= 0.998;
        }
        if (vo.aER.aIY.chq.Rg() && vo.aER.bgK.aO) {
            aii.stop();
            this.El = false;
        }
    };
    @dm(cH=3)
    private final dk<ei> akr = ei2 -> {
        if (vo.aER.bgK.aO) {
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
        }
        if (vo.aER.bgK.aO && !this.El && !vo.aER.aIY.chq.Re()) {
            aii.stop();
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
            this.El = true;
        }
    };
    @dm
    public final dk<ed> aks = ed2 -> ed2.setJumpMotion(0.42f);
    @dm(cH=4)
    public final dk<dx> akt = dx2 -> {
        if (dx2.cQ() != null || dx2.isCancelled()) {
            return;
        }
        if (dx2.cO() == 57) {
            dx2.cF();
        }
    };

    public vo(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onEnable() {
        this.El = true;
        if (!vo.aER.aIY.chq.Re()) {
            aii.stop();
        }
        if (vo.aER.bgK.crx > 10 && !vo.aER.aIY.chq.Re()) {
            vo.aER.bgK.ue = 0.42;
        }
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

