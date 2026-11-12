/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;
import net.minecraft.network.play.server.ce;

@gl(aliases={"Resource Pack Spoof"}, description="Allows you to pretend you loaded a resource pack a server requested", category=gj.MOVEMENT)
public final class sf
extends gi {
    @dm
    public final dk<fh> VX = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof ce) {
            ce ce2 = (ce)aj2;
            fh2.cF();
            ahn.m(new ad(ce2.getHash(), ae.dbW));
            afl.b("Spoofed resource pack from " + ce2.getURL(), new Object[0]);
        }
    };
}

