/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bm;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.em;
import hackclient.rise.fi;
import hackclient.rise.mc;
import net.minecraft.item.bg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;

public class pe
extends akg<mc> {
    private boolean enabled;
    @dm
    public final dk<ej> Np = ej2 -> {
        block5: {
            block4: {
                if (!pe.aER.bgK.isUsingItem()) break block4;
                this.d(bu.class);
                if (bu.bO().bP() instanceof bg) break block5;
            }
            return;
        }
        bm.blink();
        if (pe.aER.bgK.cIz < -1) {
            pe.aER.aIY.chu.ay(false);
        }
    };
    @dm
    public final dk<fi> Nq = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            afl.b("digging " + String.valueOf((Object)i2.afW()) + " " + fi2.isCancelled(), new Object[0]);
            this.enabled = false;
        } else if (!this.enabled && aj2 instanceof k) {
            this.d(bu.class);
            if (bu.bO() != null) {
                this.d(bu.class);
                if (bu.bO().bP() instanceof bg) {
                    this.enabled = true;
                    bm.blink();
                    bm.enabled = true;
                    fi2.cF();
                    ahn.n(aj2);
                    afl.b("Started", new Object[0]);
                }
            }
        }
    };
    @dm
    public final dk<em> Nr = em2 -> {
        this.d(bu.class);
        if (bu.bO() != null) {
            this.d(bu.class);
            if (bu.bO().bP() instanceof bg) {
                em2.cF();
            }
        }
    };

    public pe(String string, mc mc2) {
        super(string, mc2);
    }
}

