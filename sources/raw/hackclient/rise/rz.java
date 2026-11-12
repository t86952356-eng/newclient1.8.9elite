/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.gui.f;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ay;

@gl(aliases={"module.other.noguiclose.name"}, category=gj.PLAYER, description="module.other.noguiclose.description")
public final class rz
extends gi {
    private final aki Vv = new aki("Chat Only", (gi)this, (Boolean)false);
    @dm
    public final dk<fh> Vw = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (fh2.dq() instanceof ay && (rz.aER.bgR instanceof f || !((Boolean)this.Vv.wD()).booleanValue())) {
            fh2.cF();
        }
    };
}

