/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.bm;
import hackclient.rise.bn;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import net.minecraft.network.aj;
import net.minecraft.util.cw;

final class bp {
    private final String ej;
    private bn ek;
    private long dQ;
    private long el;
    private boolean em;
    private boolean af;
    private boolean en;
    private boolean eo;
    private boolean ep;
    private boolean eq;
    private boolean er;
    private final Deque<Integer> es = new ArrayDeque<Integer>();
    private int et;

    private bp(String string) {
        this.ej = string;
    }

    private void a(long l2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        this.dQ = l2;
        this.em = bl2;
        this.af = bl3;
        this.en = bl4;
        this.eo = bl5;
        this.ep = bl6;
        this.eq = bl7;
        this.er = bl8;
        this.el = System.currentTimeMillis();
        this.bo();
    }

    private void bo() {
        if (this.ek == null) {
            this.ek = new bn(this);
        }
        this.el = System.currentTimeMillis();
    }

    private bn bp() {
        bn bn2 = this.ek;
        if (bn2 != null) {
            bn2.dj = false;
            this.ek = null;
        }
        this.bs();
        return bn2;
    }

    private boolean d(aj<?> aj2) {
        return bp.a(bm.dV, this.em, aj2) || bp.a(bm.dW, this.af, aj2) || bp.a(bm.dX, this.en, aj2) || bp.a(bm.dY, this.eo, aj2) || bp.a(bm.dZ, this.ep, aj2) || bp.a(bm.ea, this.eq, aj2) || bp.a(bm.eb, this.er, aj2);
    }

    private boolean bd() {
        return this.ek != null && this.ek.dj;
    }

    private void bq() {
        ++this.et;
    }

    private void br() {
        if (this.et > 0) {
            this.es.add(this.et);
            this.et = 0;
        }
    }

    private int g(int n2) {
        Integer n3;
        int n4 = 0;
        for (int i2 = 0; i2 < n2 && (n3 = this.es.poll()) != null; ++i2) {
            n4 += n3.intValue();
        }
        return n4;
    }

    private void bs() {
        this.es.clear();
        this.et = 0;
    }

    private static boolean a(cw<Class[], Boolean> cw2, boolean bl2, aj<?> aj2) {
        return bl2 && Arrays.stream(cw2.wi()).anyMatch(clazz -> clazz == aj2.getClass());
    }
}

