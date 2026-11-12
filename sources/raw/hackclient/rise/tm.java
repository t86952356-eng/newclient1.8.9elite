/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.play.client.h;

@gl(aliases={"module.player.fastuse.name"}, description="module.player.fastuse.description", category=gj.PLAYER)
public class tm
extends gi {
    private final akq adn = new akq("Speed", this, (Number)1, (Number)1, (Number)24, (Number)1);
    @dm
    public final dk<ei> ado = ei2 -> {
        if (tm.aER.bgK.isUsingItem()) {
            for (int i2 = 0; i2 <= ((Number)this.adn.wD()).intValue(); ++i2) {
                ahn.m(new h(tm.aER.bgK.gW, tm.aER.bgK.gX, tm.aER.bgK.gY, tm.aER.bgK.pl, tm.aER.bgK.pm, tm.aER.bgK.aO));
            }
        }
    };
}

