/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.sh;
import java.util.HashMap;
import net.minecraft.client.entity.c;
import net.minecraft.entity.r;

@gl(aliases={"Sampler (Dev)"}, description="module.other.antiafk.description", category=gj.PLAYER)
public final class sg
extends gi {
    private final HashMap<String, akb> VY = new HashMap();
    private akb Uz;
    @dm
    public final dk<ei> VZ = ei2 -> {
        r r2 = bv.e(6.0);
        c c2 = sg.aER.bgK;
        akb akb2 = new akb(c2.pl % 360.0f, c2.pm);
        if (r2 != null && this.Uz != null) {
            sh sh2 = new sh(new akd(r2.gW - c2.gW, r2.gX - c2.gX, r2.gY - c2.gY), new akb(akb2.getX(), akb2.getY()));
            String string = sh2.hS();
            if (this.VY.containsKey(string)) {
                akb akb3 = this.VY.get(sh2.hS());
                sg.aER.bgK.pl += akb3.getX();
                sg.aER.bgK.pm += akb3.getY();
                afl.b("Contained: " + string, new Object[0]);
                afl.b("Yaw: " + akb3.getX() + " Pitch: " + akb3.getY(), new Object[0]);
            } else {
                afl.b("None " + string, new Object[0]);
            }
        }
        this.Uz = new akb(akb2.getX(), akb2.getY());
    };

    @Override
    public void onEnable() {
        if (sg.aER.aIY.chr.Re()) {
            this.VY.clear();
        }
    }
}

