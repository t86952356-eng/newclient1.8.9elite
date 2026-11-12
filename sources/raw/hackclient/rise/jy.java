/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.jg;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.i;

public class jy
extends akg<jg> {
    private final ConcurrentLinkedQueue<aj<?>> yb = new ConcurrentLinkedQueue();
    private boolean yc = false;
    @dm
    public final dk<fh> yd = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (jy.aER.bgK.aRg < 20) {
            this.yb.clear();
            return;
        }
        if (aj2 instanceof i) {
            if (jy.aER.bgK.cIt.cJK && !this.yc) {
                this.yc = true;
            } else if (this.yc) {
                this.yb.add(aj2);
                fh2.cF();
                afl.b("Grim Spectate: flagged, re-enable to release.", new Object[0]);
            }
        }
        if (this.yc && aj2 instanceof bc) {
            this.yb.add(aj2);
            fh2.cF();
            ahn.n(new s(0, 0, true));
        }
    };

    public jy(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onDisable() {
        if (aER != null && jy.aER.bgK != null) {
            for (aj<?> aj2 : this.yb) {
                ahn.q(aj2);
            }
        }
        this.yb.clear();
        this.yc = false;
    }
}

