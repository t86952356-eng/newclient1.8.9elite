/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.ajw;
import hackclient.rise.akg;
import hackclient.rise.akr;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.rt;
import hackclient.rise.st;
import io.netty.buffer.Unpooled;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;

public class ss
extends akg<rt> {
    private final akr ZT = new akr("Spoofed Version, Latest would be preferred", (akg<?>)this, "4.2.31");
    @dm
    public final dk<fi> ZU = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof ab) {
            st st2 = new st(this);
            fi2.cF();
            for (ajw ajw2 : st2) {
                ak ak2 = new ak(Unpooled.buffer());
                if (((Boolean)ajw2.wk()).booleanValue()) {
                    ak2.eS((String)ajw2.wj());
                } else {
                    ak2.writeBytes(((String)ajw2.wj()).getBytes());
                }
                ab ab2 = new ab((String)ajw2.wi(), ak2);
                ahn.n(ab2);
            }
        }
    };

    public ss(String string, rt rt2) {
        super(string, rt2);
    }
}

