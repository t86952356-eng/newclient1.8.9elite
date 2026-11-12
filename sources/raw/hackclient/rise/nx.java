/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.lw;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.h;

public class nx
extends akg<lw> {
    private int hQ;
    private int hV;
    @dm
    public final dk<ej> Ju = ej2 -> {
        int n2 = ain.e(Items.cRP);
        if (this.hQ > 10) {
            bm.a(30000, true, true, false, false, false);
        }
        if (nx.aER.bgK.crx == 1) {
            aii.stop();
        }
        if (n2 == -1) {
            return;
        }
        ++this.hQ;
        if (this.hQ == 4) {
            ahn.m(new h(nx.aER.bgK.gW, nx.aER.bgK.gX - 8.0, nx.aER.bgK.gY, nx.aER.bgK.pl, nx.aER.bgK.pm, false));
        }
        this.d(bu.class);
        bu.setSlot(n2);
        if (this.hQ == 2) {
            aER.AO();
        }
        if (this.hQ < 100) {
            bs.a(new akb(nx.aER.bgK.pl, 90.0f), 10.0, cb.gG);
        }
    };
    @dm
    public final dk<ei> Jv = ei2 -> {
        float f2 = 0.42f;
        nx.aER.bgK.ue = 0.0f + (nx.aER.aIY.chq.Re() ? 0.42f : 0.0f) - (nx.aER.aIY.chr.Re() ? 0.42f : 0.0f);
        if (nx.aER.bgK.getDistance(nx.aER.bgK.bkg, nx.aER.bgK.bkh, nx.aER.bgK.bki) <= (double)8.58f) {
            if (this.hQ > 4) {
                ei2.cF();
            }
        } else {
            ++this.hV;
            if (this.hV >= 8) {
                aii.stop();
                ((lw)this.wy()).toggle();
            }
        }
    };
    @dm
    public final dk<eo> Jw = eo2 -> {
        float f2 = 2.0f;
        if (this.hQ > 4) {
            eo2.setSpeed(2.0);
        }
    };

    public nx(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

