/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import org.lwjgl.input.Keyboard;

public class ve
extends akg<tn> {
    int bj;
    @dm(cH=0)
    public final dk<eo> ajL = eo2 -> {
        if (!Keyboard.isKeyDown((int)ve.aER.aIY.chr.cO())) {
            return;
        }
        ve.aER.aIY.chs.ay(false);
        ve.aER.bgK.setSprinting(false);
    };
    @dm(cH=3)
    public final dk<ej> ajM = ej2 -> {
        if (!Keyboard.isKeyDown((int)ve.aER.aIY.chr.cO()) || ve.aER.bgK.cst > 20) {
            this.bj = 1000;
            return;
        }
        ++this.bj;
        if (ve.aER.bgK.gX % 1.0 != 0.0) {
            this.bj = 0;
        }
        if (ve.aER.bgK.ue <= 0.0 && this.bj >= 15) {
            ((tn)this.wy()).ahh = ((tn)this.wy()).ahh.v(0.0, -1.0, 0.0);
        }
    };
    @dm
    public final dk<fi> ajN = fi2 -> {
        k k2;
        aj<?> aj2 = fi2.dq();
        if (!(aj2 instanceof k) || (k2 = (k)aj2).yl().h(new akd(-1.0, -1.0, -1.0)) || k2.getPlacedBlockDirection() == ao.dwq.OY()) {
            // empty if block
        }
    };

    public ve(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onEnable() {
        this.bj = 1000;
    }
}

