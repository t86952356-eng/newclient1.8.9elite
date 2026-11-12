/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bb;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.jg;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.aj;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.s;

public class ju
extends akg<jg> {
    private final ConcurrentLinkedQueue<aj<?>> xG = new ConcurrentLinkedQueue();
    private long xH = 0L;
    private int xI = 25000;
    @dm
    public final dk<ei> xJ = ei2 -> {
        long l2;
        double d2 = aii.roundToGround(ei2.getPosY());
        float f2 = bd.cY;
        ei2.setOnGround(true);
        ei2.setPosY(d2);
        if (ju.aER.bgK.aRg % 100 == 0 && ju.aER.bgK.aO || ju.aER.bgK.aRg % 2 != 0 || !ju.aER.bgK.aO) {
            // empty if block
        }
        if (this.xH == 0L) {
            this.xH = System.currentTimeMillis();
        }
        if ((l2 = System.currentTimeMillis()) - this.xH >= (long)this.xI) {
            while (!this.xG.isEmpty()) {
                aj<?> aj2 = this.xG.poll();
                if (aj2 == null) continue;
                ahn.n(aj2);
            }
            this.xH = 0L;
        }
        if (ju.aER.bgK.Zz < 100) {
            if (ju.aER.bgK.Zz == 2) {
                // empty if block
            }
            if (ju.aER.bgK.Zz == 80) {
                // empty if block
            }
            if (ju.aER.bgK.Zz == 60) {
                // empty if block
            }
            if (ju.aER.bgK.Zz == 40) {
                // empty if block
            }
            if (ju.aER.bgK.Zz == 20) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<fi> xK = fi2 -> {
        aj<b> aj2;
        aj<?> aj3 = fi2.dq();
        if (aj3 instanceof a) {
            aj2 = (a)aj3;
            if (this.xH <= 0L || ju.aER.bgK.aRg < 10) {
                // empty if block
            }
        }
        if (aj3 instanceof s) {
            aj2 = (s)aj3;
            int n2 = ((s)aj2).getWindowId();
            if (this.xH > 0L && n2 > 0) {
                this.xG.add(aj3);
                fi2.cF();
                return;
            }
            if (ju.aER.bgK.aRg % 100 == 0) {
                // empty if block
            }
        }
        if (aj3 instanceof e) {
            aj2 = (e)aj3;
            if (((e)aj2).isMoving() || bb.aW() || ju.aER.bgK.Zz > 10) {
                // empty if block
            }
            if (ju.aER.bgK.getDistance(ju.aER.bgK.bkg, ju.aER.bgK.bkh, ju.aER.bgK.bki) <= 8.0 - aii.speed() - 0.15 && ju.aER.bgK.aRg % 2 != 0 && ju.aER.bgK.Zz > 1) {
                fi2.cF();
            }
        }
    };

    public ju(String string, jg jg2) {
        super(string, jg2);
    }
}

