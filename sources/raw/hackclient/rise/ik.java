/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.il;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;

public class ik
extends akg<hf> {
    private final akq tl = new akq("Delay (ticks)", this, (Number)5, (Number)0, (Number)40, (Number)1);
    private final aki tm = new aki("Delay Explosions", (akg<?>)this, (Boolean)true);
    private final Deque<il> tn = new ArrayDeque<il>();
    private boolean to = false;
    @dm
    public final dk<fh> tp = fh2 -> {
        if (this.to || ik.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == ik.aER.bgK.getEntityId()) {
                fh2.cF();
                int n2 = ((Number)this.tl.wD()).intValue();
                int n3 = ik.aER.bgK.aRg;
                this.tn.addLast(new il(t2, n3 + n2));
            }
            return;
        }
        if (aj2 instanceof bc) {
            bc bc2 = (bc)aj2;
            fh2.cF();
            int n4 = ((Number)this.tl.wD()).intValue();
            int n5 = ik.aER.bgK.aRg;
            this.tn.addLast(new il(bc2, n5 + n4));
            return;
        }
        if (((Boolean)this.tm.wD()).booleanValue() && aj2 instanceof ar) {
            fh2.cF();
            int n6 = ((Number)this.tl.wD()).intValue();
            int n7 = ik.aER.bgK.aRg;
            this.tn.addLast(new il(aj2, n7 + n6));
        }
    };
    @dm
    public final dk<fe> tq = fe2 -> {
        if (ik.aER.bgK == null || this.tn.isEmpty()) {
            return;
        }
        int n2 = ik.aER.bgK.aRg;
        while (!this.tn.isEmpty() && this.tn.peekFirst().ts <= n2) {
            aj<?> aj2 = this.tn.removeFirst().tr;
            this.to = true;
            try {
                ahn.q(aj2);
            }
            finally {
                this.to = false;
            }
        }
        afl.c(this.tn.peekFirst().ts - n2, new Object[0]);
    };

    public ik(String string, hf hf2) {
        super(string, hf2);
    }

    @Override
    public void onDisable() {
        if (this.tn.isEmpty()) {
            return;
        }
        this.to = true;
        try {
            for (il il2 : this.tn) {
                ahn.q(il2.tr);
            }
        }
        finally {
            this.to = false;
            this.tn.clear();
        }
    }
}

