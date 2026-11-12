/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.jg;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.s;

public class jv
extends akg<jg> {
    @dm
    public final dk<ei> xL = ei2 -> {
        if (!((Boolean)((jg)this.wy()).wJ.wD()).booleanValue()) {
            return;
        }
        ei2.setSprinting(false);
    };
    @dm
    public final dk<fi> xM = fi2 -> {
        if (!((Boolean)((jg)this.wy()).wJ.wD()).booleanValue()) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            if (jv.aER.bgK.aRg % 3 == 0) {
                fi2.cF();
            }
            e e2 = (e)fi2.dq();
            double d2 = jv.aER.bgK.gW;
            double d3 = jv.aER.bgK.gX;
            double d4 = jv.aER.bgK.gY;
            if (e2.isMoving()) {
                d2 = e2.afS();
                d3 = e2.afT();
                d4 = e2.afU();
            }
            if (jv.aER.bgK.aRg % 20 == 0) {
                ahn.n(new f(d2, d3, d4, e2.isOnGround()));
            }
            fi2.e(new h(d2, d3, d4, jv.aER.bgK.pl, jv.aER.bgK.pm, e2.isOnGround()));
        }
        if (aj2 instanceof s || aj2 instanceof a) {
            fi2.cF();
        }
    };

    public jv(String string, jg jg2) {
        super(string, jg2);
    }
}

