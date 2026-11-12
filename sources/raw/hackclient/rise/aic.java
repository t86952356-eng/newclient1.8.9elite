/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.ahn;
import hackclient.rise.aid;
import lombok.Generated;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import net.minecraft.potion.a;

public final class aic
implements aea {
    public static void ab(double d2) {
        aic.a(aid.aOJ, d2, true, true);
    }

    public static void a(aid aid2, double d2, boolean bl2, boolean bl3) {
        if (!(bl2 && !aic.aER.bgK.aO || bl3 && aic.aER.bgK.cus != 0)) {
            int n2;
            double d3 = aic.aER.bgK.gW;
            double d4 = aic.aER.bgK.gX;
            double d5 = aic.aER.bgK.gY;
            double d6 = 3.1;
            if (aic.aER.bgK.a(a.dgD)) {
                n2 = aic.aER.bgK.b(a.dgD).ajf();
                d6 += (double)(n2 + 1);
            }
            n2 = (int)Math.ceil(d6 / d2);
            block4: for (int i2 = 0; i2 < n2; ++i2) {
                switch (aid2.ordinal()) {
                    case 0: {
                        ahn.m(new h(d3, d4 + d2, d5, aic.aER.bgK.pl, aic.aER.bgK.pm, false));
                        ahn.m(new h(d3, d4, d5, aic.aER.bgK.pl, aic.aER.bgK.pm, false));
                        continue block4;
                    }
                    case 1: {
                        ahn.m(new f(d3, d4 + d2, d5, false));
                        ahn.m(new f(d3, d4, d5, false));
                    }
                }
            }
            ahn.m(new e(true));
        }
    }

    public static void a(aid aid2, double d2, int n2, boolean bl2, boolean bl3) {
        if (!(bl2 && !aic.aER.bgK.aO || bl3 && aic.aER.bgK.cus != 0)) {
            double d3 = aic.aER.bgK.gW;
            double d4 = aic.aER.bgK.gX;
            double d5 = aic.aER.bgK.gY;
            block4: for (int i2 = 0; i2 < n2; ++i2) {
                switch (aid2.ordinal()) {
                    case 0: {
                        ahn.m(new h(d3, d4 + d2, d5, aic.aER.bgK.pl, aic.aER.bgK.pm, false));
                        ahn.m(new h(d3, d4, d5, aic.aER.bgK.pl, aic.aER.bgK.pm, false));
                        continue block4;
                    }
                    case 1: {
                        ahn.m(new f(d3, d4 + d2, d5, false));
                        ahn.m(new f(d3, d4, d5, false));
                    }
                }
            }
            ahn.m(new e(true));
        }
    }

    @Generated
    private aic() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

