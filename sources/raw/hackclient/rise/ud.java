/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.play.client.s;

@gl(aliases={"module.player.polardetector.name"}, description="module.player.polardetector.description", category=gj.PLAYER)
public class ud
extends gi {
    boolean ago = false;
    @dm
    public final dk<ei> agp = ei2 -> {
        if (ud.aER.bgK.aRg == 30) {
            afl.b(this.ago ? "Polar is enabled" : "Polar is disabled", new Object[0]);
        }
    };
    @dm
    public final dk<fi> agq = fi2 -> {
        if (fi2.dq() instanceof s) {
            this.ago = true;
        }
    };
    @dm
    public final dk<fg> agr = fg2 -> {
        this.ago = false;
    };

    @Override
    public void onEnable() {
        cg.e("Polar Detector", "Join a game and this module will notify you of polars status");
    }
}

