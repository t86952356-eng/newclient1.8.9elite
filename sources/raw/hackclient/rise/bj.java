/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.am;
import hackclient.rise.bc;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fg;
import hackclient.rise.fi;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;

public class bj
extends am {
    public static final ConcurrentLinkedQueue<aj<?>> dA = new ConcurrentLinkedQueue();
    public static boolean cR;
    @dm(cH=1)
    public final dk<fi> dB = fi2 -> {
        if (bj.aER.bgK == null) {
            cR = false;
            dA.clear();
            return;
        }
        if (bj.aER.bgK.csb || aER.isSingleplayer() || bc.cR) {
            dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            dA.clear();
            cR = false;
            return;
        }
        if (fi2.isCancelled()) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (cR) {
            if (aj2 instanceof e) {
                dA.add(aj2);
                fi2.cF();
            }
        } else if (aj2 instanceof e) {
            dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            dA.clear();
        }
    };
    @dm
    public final dk<fg> dC = fg2 -> {
        cR = false;
        dA.clear();
    };

    public static void bc() {
        dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
        dA.clear();
        cR = false;
    }
}

