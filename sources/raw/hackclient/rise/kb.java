/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.jg;
import hackclient.rise.lw;
import hackclient.rise.mh;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.i;
import net.minecraft.util.cf;

public class kb
extends akg<jg> {
    private int xy = -1;
    private final akq yg = new akq("Reach Ticks", this, (Number)1, (Number)1, (Number)5, (Number)1);
    private final Queue<aj<?>> yh = new ConcurrentLinkedQueue();
    private boolean yi = false;
    @dm
    public final dk<ej> yj = ej2 -> {
        if (kb.aER.bgK.aO && kb.aER.bhc.dzu == cf.dzy) {
            net.minecraft.util.b b2 = kb.aER.bhc.dg();
            Block block = aik.u(b2);
            float f2 = block.a(kb.aER.bgK, kb.aER.bgF, b2);
            kb.aER.bgu.bDx = (float)((double)kb.aER.bgu.bDx - (double)f2 * 0.8);
        }
        if (kb.aER.bgK.aRg % 400 != 0 && kb.aER.bgK.Zz > 2) {
            bm.a(30000, true, true, false, false, false, false, kb.aER.bgK.aRg % 2 != 0);
        } else {
            afl.c("dispatched", new Object[0]);
            bm.dispatch();
        }
        if ((this.e(mh.class).isEnabled() || this.e(lw.class).isEnabled() || kb.aER.bgK.cup || kb.aER.bgK.aRg % 100 != 0) && kb.aER.bgK.Zz > 5 || kb.aER.bgK.cup) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> yk = ei2 -> {
        ei2.setSprinting(false);
        if (kb.aER.bgK.aRg % 2 == 0) {
            ahn.m(new m());
        }
    };
    @dm
    public final dk<fi> yl = fi2 -> {
        c c2;
        Object object;
        aj<b> aj2;
        aj<?> aj3 = fi2.dq();
        if (aj3 instanceof s) {
            aj2 = (s)aj3;
            boolean bl2 = this.yi = !this.yi;
        }
        if ((object = fi2.dq()) instanceof net.minecraft.network.play.client.c && (c2 = ((net.minecraft.network.play.client.c)(aj2 = (net.minecraft.network.play.client.c)object)).j(kb.aER.bgF)) instanceof r) {
            object = (r)c2;
            if (kb.aER.bgK.aRg % ((Number)this.yg.wD()).intValue() == 0) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<fh> ym = fh2 -> {
        aj<a> aj2;
        aj<?> aj3 = fh2.dq();
        if (aj3 instanceof bc) {
            aj2 = (bc)aj3;
            boolean bl2 = this.yi = !this.yi;
        }
        if (aj3 instanceof i) {
            aj2 = (i)aj3;
            double d2 = ((i)aj2).getX();
            double d3 = ((i)aj2).getY();
            double d4 = ((i)aj2).getZ();
            float f2 = ((i)aj2).getYaw();
            float f3 = ((i)aj2).getPitch();
        }
    };

    public kb(String string, jg jg2) {
        super(string, jg2);
    }
}

