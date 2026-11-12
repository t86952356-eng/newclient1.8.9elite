/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.ax;

@gl(aliases={"module.combat.godmode.name"}, description="module.exploit.godmode.description", category=gj.EXPLOIT)
public class ji
extends gi {
    private float gZ;
    private float ha;
    @dm
    public final dk<ei> wT = ei2 -> {
        ei2.setPosY(ei2.getPosY() - 0.05);
        ei2.setYaw(this.gZ);
        ei2.setPitch(this.ha);
    };
    @dm
    public final dk<fi> wU = fi2 -> {
        c c2;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof c && (c2 = (c)aj2).afQ().equals((Object)d.daU)) {
            fi2.cF();
            ahn.n(new f(ji.aER.bgK.gW, ji.aER.bgK.gX, ji.aER.bgK.gY, true));
            ahn.n(c2);
            ahn.n(new f(ji.aER.bgK.gW, ji.aER.bgK.gX - 0.05, ji.aER.bgK.gY, false));
        }
    };
    @dm
    public final dk<fh> wV = fh2 -> {
        if (fh2.dq() instanceof ax) {
            fh2.cF();
        }
    };
    @dm
    public final dk<eo> wW = eo2 -> eo2.setSpeed(0.0);
    @dm
    public final dk<dz> wX = dz2 -> dz2.setJump(false);

    @Override
    public void onEnable() {
        this.gZ = ji.aER.bgK.pl;
        this.ha = ji.aER.bgK.pm;
    }
}

