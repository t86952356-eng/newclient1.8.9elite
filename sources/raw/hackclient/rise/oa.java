/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.en;
import hackclient.rise.fi;
import hackclient.rise.lx;
import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.z;

public class oa
extends akg<lx> {
    @dm
    public final dk<fi> JN = fi2 -> {
        aj<b> aj2;
        aj<?> aj3 = fi2.dq();
        if (aj3 instanceof z && ((z)(aj2 = (z)aj3)).agh() == aa.dbR) {
            fi2.cF();
        }
        if (aj3 instanceof n && ((n)(aj2 = (n)aj3)).agb() == o.dbv) {
            fi2.cF();
        }
        if (aj3 instanceof q) {
            fi2.cF();
        }
    };
    private final d[] JO;
    @dm
    public final dk<en> JP;
    @dm
    public final dk<ej> JQ;

    public oa(String string, lx lx2) {
        super(string, lx2);
        this.JO = new d[]{oa.aER.aIY.chm, oa.aER.aIY.cho, oa.aER.aIY.chp, oa.aER.aIY.chn, oa.aER.aIY.chq};
        this.JP = en2 -> {};
        this.JQ = ej2 -> {
            if (oa.aER.bgR instanceof f || oa.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JO) {
                d2.ay(a.a(d2));
            }
        };
    }
}

