/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.ha;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.ax;

public final class if
extends akg<ha> {
    private final akq sr = new akq("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private int hV;
    private float gZ;
    private float ha;
    @dm
    public final dk<ei> ss = ei2 -> {
        if (if.aER.bgK.aO && if.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue()) {
            if (this.hV <= 1) {
                ei2.setPosY(ei2.getPosY() - 0.05);
                ei2.setYaw(this.gZ);
                ei2.setPitch(this.ha);
                ++this.hV;
            }
        } else {
            this.gZ = ei2.getYaw();
            this.ha = ei2.getPitch();
            this.hV = 0;
        }
    };
    @dm
    public final dk<fi> st = fi2 -> {
        c c2;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof c && if.aER.bgK.aO && if.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1 && (c2 = (c)aj2).afQ().equals((Object)d.daU)) {
            fi2.cF();
            ahn.n(new f(if.aER.bgK.gW, if.aER.bgK.gX, if.aER.bgK.gY, true));
            ahn.n(c2);
            ahn.n(new f(if.aER.bgK.gW, if.aER.bgK.gX - 0.05, if.aER.bgK.gY, false));
        }
    };
    @dm
    public final dk<fh> su = fh2 -> {
        if (fh2.dq() instanceof ax && this.hV <= 1) {
            fh2.cF();
        }
    };
    @dm
    public final dk<eo> sv = eo2 -> {
        if (if.aER.bgK.aO && if.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1) {
            eo2.setSpeed(0.0);
        }
    };
    @dm
    public final dk<dz> sw = dz2 -> {
        if (if.aER.bgK.aO && if.aER.bgK.getHealth() < ((Number)this.sr.wD()).floatValue() && this.hV <= 1) {
            dz2.setJump(false);
        }
    };

    public if(String string, ha ha2) {
        super(string, ha2);
    }
}

