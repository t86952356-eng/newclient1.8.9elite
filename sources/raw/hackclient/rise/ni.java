/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

public class ni
extends akg<lw> {
    private double Hy;
    private double Hz;
    private double HA;
    private boolean zd;
    @dm
    public final dk<ei> HB = ei2 -> {
        if (!this.zd) {
            double d2 = aii.direction();
            double d3 = 6.0;
            if (ni.aER.bgK.aRg % 3 == 0) {
                ahn.m(new e(ni.aER.bgK.aO));
                ni.aER.bgK.setPosition(this.Hy, this.Hz, this.HA);
            }
            ei2.setPosY(ei2.getPosY() - 1.1 + (double)(ni.aER.bgK.aRg % 3 == 0 ? 0.42f : 0.0f));
            ei2.setPosX(ei2.getPosX() + (double)bt.bx((float)d2) * 6.0);
            ei2.setPosZ(ei2.getPosZ() - (double)bt.bB((float)d2) * 6.0);
        } else {
            ni.aER.bgC.dAp = 0.3f;
        }
    };
    @dm
    public final dk<fh> HC = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i && !this.zd) {
            fh2.cF();
        } else if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == ni.aER.bgK.getEntityId() && (double)t2.dcS / 8000.0 > 0.5) {
            this.zd = true;
        }
    };

    public ni(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.Hy = ni.aER.bgK.gW;
        this.Hz = ni.aER.bgK.gX;
        this.HA = ni.aER.bgK.gY;
        this.zd = false;
    }
}

