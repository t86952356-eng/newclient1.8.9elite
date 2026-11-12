/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.inventory.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bc;

@gl(aliases={"module.player.inventorysync.name"}, description="module.player.inventorysync.description", category=gj.PLAYER)
public class tp
extends gi {
    public short adq;
    @dm
    public final dk<fh> adr = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof bc) {
            bc bc2 = (bc)aj2;
            b b2 = tp.aER.bgK.cHX;
            if (bc2.getWindowId() == b2.cSL) {
                this.adq = bc2.getActionNumber();
                if (this.adq > 0 && this.adq < b2.cSM) {
                    b2.cSM = (short)(this.adq + 1);
                }
            }
        }
    };
}

