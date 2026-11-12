/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.fs;
import hackclient.rise.gy;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class ic
extends akg<gy> {
    akb sg = new akb(0.0f, 0.0f);
    akb fu = new akb(0.0f, 0.0f);
    afj sh = new afj(afk.aGW, 150L);
    afj si = new afj(afk.aGW, 150L);
    @dm
    public final dk<ej> sj = ej2 -> {
        r r2 = bv.e(6.0);
        if (r2 == null || !ic.aER.aIY.chw.Re()) {
            this.sh.T(ic.aER.bgK.pl);
            this.si.T(ic.aER.bgK.pm);
            this.fu = new akb(0.0f, 0.0f);
            return;
        }
        float f2 = r2.pl;
        float f3 = r2.pm;
        f3 = -f3;
        this.sh.Q(f2 -= 180.0f);
        this.sg.x = (float)this.sh.sV();
        this.si.Q(f3);
        this.sg.y = (float)this.si.sV();
        akb akb2 = aix.a(new akb(f2, f3), aix.y(r2), 1000.0);
        akb akb3 = aix.a(new akb(f2, f3), aix.y(r2), (double)(Math.abs(akb2.getX()) + Math.abs(akb2.getY())) / (akb2.getX() > 90.0f ? 1.05 : 1.5));
        this.fu = new akb(bt.bN((f2 += akb3.x) - ic.aER.bgK.pl), (f3 += akb3.y) - ic.aER.bgK.pm);
        this.fu.x += (float)((Math.random() - 0.5) * (double)this.fu.getX() / 10.0);
        this.fu.y += (float)((Math.random() - 0.5) * (double)this.fu.getY() / 10.0);
    };
    private long sk;
    @dm
    public final dk<fs> sl = fs2 -> {
        double d2 = 50.0 / (double)(System.currentTimeMillis() - this.sk);
        this.sk = System.currentTimeMillis();
        double d3 = (double)ic.aER.aIY.cgq * (double)0.6f + (double)0.2f;
        double d4 = d3 * d3 * d3;
        double d5 = d4 * 8.0;
        double d6 = (int)((double)this.fu.getX() / d5);
        double d7 = (int)((double)this.fu.getY() / d5);
        d6 = d6 * (1.0 / d5) * 6.666666507720947;
        d7 = d7 * (1.0 / d5) * 6.666666507720947;
        ic.aER.bgK.p((float)(d6 /= d2), (float)((d7 /= d2) * (ic.aER.aIY.cgr ? 1.0 : -1.0)));
    };

    public ic(String string, gy gy2) {
        super(string, gy2);
    }
}

