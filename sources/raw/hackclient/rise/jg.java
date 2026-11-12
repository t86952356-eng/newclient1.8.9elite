/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.iw;
import hackclient.rise.jp;
import hackclient.rise.jr;
import hackclient.rise.js;
import hackclient.rise.jt;
import hackclient.rise.ju;
import hackclient.rise.jv;
import hackclient.rise.jw;
import hackclient.rise.jx;
import hackclient.rise.jy;
import hackclient.rise.jz;
import hackclient.rise.ka;
import hackclient.rise.kb;
import hackclient.rise.kc;
import hackclient.rise.kd;
import hackclient.rise.ke;
import hackclient.rise.kf;
import hackclient.rise.kg;
import hackclient.rise.kh;
import hackclient.rise.ki;
import hackclient.rise.kj;
import hackclient.rise.kk;
import hackclient.rise.kl;
import hackclient.rise.km;
import hackclient.rise.kn;
import hackclient.rise.ko;
import hackclient.rise.kp;
import hackclient.rise.kq;

@gl(aliases={"module.combat.disabler.name"}, description="module.exploit.disabler.description", category=gj.EXPLOIT)
public class jg
extends gi {
    private final aki wj = new aki("Cubecraft", (gi)this, (Boolean)false, new ju("", this));
    private final aki wk = new aki("Watchdog Prediction", (gi)this, (Boolean)false, new iw("", this));
    private final aki wl = new aki("Mine Land Kick Checks", (gi)this, (Boolean)false, new kd("", this));
    private final aki wm = new aki("Watchdog", (gi)this, (Boolean)false, new jp("", this));
    private final aki wn = new aki("Verus Checks", (gi)this, (Boolean)false, new kp("", this));
    private final aki wo = new aki("Verus Checks 2", (gi)this, (Boolean)false, new ko("", this));
    private final aki wp = new aki("Vehicle Packets", (gi)this, (Boolean)false, new kn("", this));
    private final aki wq = new aki("Force Server Teleport", (gi)this, (Boolean)false, new kj("", this));
    private final aki wr = new aki("Convert Moving Packets", (gi)this, (Boolean)false, new jt("", this));
    public final aki ws = new aki("Vulcan Checks", (gi)this, (Boolean)false, new kq("", this));
    private final aki wt = new aki("Cancel Sprint Packet", (gi)this, (Boolean)false, new ki("", this));
    public final aki wu = new aki("Watchdog Fly", (gi)this, (Boolean)false, new jw("", this));
    private final aki wv = new aki("OmniSprint", (gi)this, (Boolean)false, new kf("", this));
    private final aki ww = new aki("UniversoCraft", (gi)this, (Boolean)false, new km("", this));
    private final aki wx = new aki("Cubecraft Bedrock", (gi)this, (Boolean)false, new kb("", this));
    private final aki wy = new aki("Rise Balance Timer Abuse", (gi)this, (Boolean)false, new kg("", this));
    private final aki wz = new aki("Cancel Transactions", (gi)this, (Boolean)false, new kl("", this));
    private final aki wA = new aki("MMC Reach", (gi)this, (Boolean)false, new kc("", this));
    private final aki wB = new aki("Abilities", (gi)this, (Boolean)false, new jr("", this));
    private final aki wC = new aki("Input", (gi)this, (Boolean)false, new jz("", this));
    private final aki wD = new aki("Spectate", (gi)this, (Boolean)false, new kh("", this));
    private final aki wE = new aki("Cancel Keep Alive", (gi)this, (Boolean)false, new ka("", this));
    private final aki wF = new aki("No Rules", (gi)this, (Boolean)false, new ke("", this));
    private final aki wG = new aki("MiniBlox", (gi)this, (Boolean)false, new js("", this));
    private final aki wH = new aki("Grim Inventory Move", (gi)this, (Boolean)false, new jx("", this));
    private final aki wI = new aki("Grim Spectate", (gi)this, (Boolean)false, new jy("", this));
    public final aki wJ = new aki("Deprecated", (gi)this, (Boolean)false);
    private final aki wK = new aki("Experimental (Used for testing)", (gi)this, (Boolean)false, new jw("", this));
    public final aki wL = new aki("Test", (gi)this, (Boolean)false, new kk("Test", this));
    private final aki wM = new aki("Hypixel Slime (Deprecated)", (gi)this, (Boolean)false, new jr("", this));
    private final aki wN = new aki("MMC Partial Reach (Deprecated)", (gi)this, (Boolean)false, new kl("", this));
    private final aki wO = new aki("MMC Keep Sprint (Deprecated)", (gi)this, (Boolean)false, new ki("", this));
    private final aki wP = new aki("Dynamic PVP (Deprecated)", (gi)this, (Boolean)false, new jv("", this));

    public boolean gC() {
        return this.isEnabled() && (Boolean)this.wH.wD() != false;
    }

    public jg() {
        boolean bl2 = false;
        for (akh<?> akh2 : this.getValues()) {
            if (bl2) {
                akh2.a(() -> (Boolean)this.wJ.wD() == false);
            }
            if (!akh2.getName().equalsIgnoreCase("deprecated")) continue;
            bl2 = true;
        }
    }
}

