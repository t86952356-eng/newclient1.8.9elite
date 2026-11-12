/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fi;
import hackclient.rise.jg;
import io.netty.buffer.Unpooled;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import rip.vantage.commons.util.time.a;

public class kk
extends akg<jg> {
    private final a yR = new a();
    private final Collection<aj<?>> yS = new HashSet();
    @dm
    public final dk<fi> yT = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof ab) {
            ab ab2 = (ab)aj2;
            ab2.e(this.b("eyser", false));
        }
    };

    public kk(String string, jg jg2) {
        super(string, jg2);
    }

    private ak b(String string, boolean bl2) {
        if (bl2) {
            return new ak(Unpooled.buffer()).eS(string);
        }
        return new ak(Unpooled.wrappedBuffer((byte[])string.getBytes()));
    }
}

