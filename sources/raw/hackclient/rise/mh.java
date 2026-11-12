/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fd;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.on;
import hackclient.rise.ot;
import hackclient.rise.qa;
import hackclient.rise.qb;
import hackclient.rise.qc;
import hackclient.rise.qd;
import hackclient.rise.qe;
import hackclient.rise.qf;
import hackclient.rise.qg;
import hackclient.rise.qh;
import hackclient.rise.qi;
import hackclient.rise.qj;
import hackclient.rise.qk;
import hackclient.rise.ql;
import hackclient.rise.qm;
import hackclient.rise.qn;
import hackclient.rise.qo;
import hackclient.rise.qp;
import hackclient.rise.qq;
import lombok.Generated;

@gl(aliases={"module.movement.speed.name"}, description="module.movement.speed.description", category=gj.MOVEMENT)
public class mh
extends gi {
    public final akp Eg = new akp("Mode", this).a(new akg[]{new qm("Vanilla", this)}).a(new akg[]{new qk("Strafe", this)}).a(new akg[]{new qd("Watchdog Prediction", this)}).a(new akg[]{new qo("Vulcan", this)}).a(new akg[]{new qq("Watchdog", this)}).a(new akg[]{new qi("NCP", this)}).a(new akg[]{new qb("MiniBlox", this)}).a(new akg[]{new qn("Verus", this)}).a(new akg[]{new qg("Matrix", this)}).a(new akg[]{new qa("BlocksMC", this)}).a(new akg[]{new qh("MineMenClub", this)}).a(new akg[]{new qp("Watchdog 6 Tick", this)}).a(new akg[]{new qe("KoksCraft", this)}).a(new akg[]{new qf("Legit", this)}).a(new akg[]{new qc("Polar", this)}).a(new akg[]{new qj("Tatako", this)}).a(new akg[]{new ot("Grim", this)}).a(new akg[]{new on("Grim 2", this)}).a(new akg[]{new ql("Old NCP Y-port", this)}).co("Vanilla");
    private final aki Eh = new aki("Disable on Teleport", (gi)this, (Boolean)false);
    private final aki Ei = new aki("Stop on Disable", (gi)this, (Boolean)false);
    @dm
    public final dk<fd> Ej = fd2 -> {
        if (((Boolean)this.Eh.wD()).booleanValue()) {
            this.toggle();
        }
    };

    @Override
    public void onDisable() {
        mh.aER.bgC.dAp = 1.0f;
        if (((Boolean)this.Ei.wD()).booleanValue()) {
            aii.stop();
        }
    }

    @Generated
    public akp hl() {
        return this.Eg;
    }
}

