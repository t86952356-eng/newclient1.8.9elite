/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.gy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.m;
import net.minecraft.util.cw;

public class ib
extends akg<gy> {
    private long sc;
    private HashMap<String, cw<ArrayList<Integer>, Integer>> sd = new HashMap();
    @dm(cH=0)
    public final dk<fh> se = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof m) {
            m m2 = (m)aj2;
            int n2 = m2.getEntityID();
            if (n2 == ib.aER.bgK.getEntityId()) {
                return;
            }
            String string = ib.aER.bgF.cn(n2).xU();
            int n3 = ib.aER.bgK.aRg;
            if (!this.sd.containsKey(string)) {
                this.sd.put(string, new cw(new ArrayList(), n3));
            }
            cw<ArrayList<Integer>, Integer> cw2 = this.sd.get(string);
            afl.b("Recorded " + (n3 - cw2.wj()) + " von " + string, new Object[0]);
            cw2.wi().add(n3 - cw2.wj());
            cw2.k(n3);
        }
    };
    @dm(cH=0)
    public final dk<ej> sf = ej2 -> {
        if (!ib.aER.aIY.chw.Re()) {
            return;
        }
        if (ib.aER.aIY.chr.Re()) {
            this.sd = new HashMap();
        }
        if (System.currentTimeMillis() > this.sc) {
            long l2 = 0L;
            while (l2 == 0L || l2 >= 450L) {
                Optional optional;
                if (l2 != 0L) {
                    afl.b("Running again prev " + l2, new Object[0]);
                }
                if (!(optional = this.sd.keySet().stream().findFirst()).isPresent()) {
                    afl.b("Empty", new Object[0]);
                    return;
                }
                cw<ArrayList<Integer>, Integer> cw2 = this.sd.get(optional.get());
                if (cw2.wi().isEmpty()) {
                    this.sd.remove(optional.get());
                    return;
                }
                l2 = cw2.wi().get(0) * 50;
                cw2.wi().remove(0);
                afl.b("Running " + (String)optional.get() + " " + l2, new Object[0]);
            }
            this.sc = System.currentTimeMillis() + l2 / 2L;
            aER.AN();
            ib.aER.bgV = 1;
        }
    };

    public ib(String string, gy gy2) {
        super(string, gy2);
    }
}

