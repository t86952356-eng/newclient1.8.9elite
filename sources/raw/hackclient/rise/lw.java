/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.cl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.fd;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.ll;
import hackclient.rise.lo;
import hackclient.rise.mq;
import hackclient.rise.mr;
import hackclient.rise.ms;
import hackclient.rise.mu;
import hackclient.rise.mv;
import hackclient.rise.mw;
import hackclient.rise.mx;
import hackclient.rise.my;
import hackclient.rise.mz;
import hackclient.rise.na;
import hackclient.rise.nb;
import hackclient.rise.nc;
import hackclient.rise.nd;
import hackclient.rise.nf;
import hackclient.rise.nh;
import hackclient.rise.ni;
import hackclient.rise.nj;
import hackclient.rise.nk;
import hackclient.rise.nl;
import hackclient.rise.nm;
import hackclient.rise.nn;
import hackclient.rise.np;
import hackclient.rise.nq;
import hackclient.rise.nr;
import hackclient.rise.ns;
import hackclient.rise.nt;
import hackclient.rise.nu;
import hackclient.rise.nv;
import hackclient.rise.nw;
import hackclient.rise.nx;
import hackclient.rise.ny;
import javax.vecmath.Vector3d;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.c;

@gl(aliases={"module.movement.flight.name", "Fly"}, description="module.movement.flight.description", category=gj.MOVEMENT)
public class lw
extends gi {
    private final akp Dn = new akp("Mode", this).a(new akg[]{new nr("Vanilla", this)}).a(new akg[]{new nh("Matrix", this)}).a(new akg[]{new nf("Matrix High Jump", this)}).a(new akg[]{new np("Matrix Damage", this)}).a(new akg[]{new lo("Grim 1.9-1.18.1", this)}).a(new akg[]{new na("Grim 2", this)}).a(new akg[]{new nb("Grim 3", this)}).a(new akg[]{new ll("Watchdog Prediction", this)}).a(new akg[]{new nn("Watchdog Prediction 2", this)}).a(new akg[]{new mq("Watchdog 2", this)}).a(new akg[]{new mv("MiniBlox", this)}).a(new akg[]{new nj("Vulcan 2", this)}).a(new akg[]{new ms("Air Walk", this)}).a(new akg[]{new nl("Old NCP", this)}).a(new akg[]{new mz("Funcraft", this)}).a(new akg[]{new nm("SkyCave", this)}).a(new akg[]{new nc("Latest NCP", this)}).a(new akg[]{new ns("Verus", this)}).a(new akg[]{new mw("Block", this)}).a(new akg[]{new nd("MMC", this)}).a(new akg[]{new mx("Buffer Abuse", this)}).a(new akg[]{new nw("Zone Craft", this)}).a(new akg[]{new nn("Slime NCP", this)}).a(new akg[]{new mr("Air Jump", this)}).a(new akg[]{new my("CubeCraft", this)}).a(new akg[]{new ni("MineLand", this)}).a(new akg[]{new nk("Vulcan (Deprecated)", this)}).a(new akg[]{new mu("Bloxd", this)}).a(new akg[]{new nq("Verus Damage New", this)}).a(new akg[]{new nv("Watchdog", this)}).a(new akg[]{new nu("Watchdog Boat", this)}).a(new akg[]{new ny("Damage (Deprecated)", this)}).a(new akg[]{new nx("MMC Fireball", this)}).a(new akg[]{new nt("Vulcan Damage", this)}).a(new akg[]{new mr("Spartan (Deprecated)", this)}).a(new akg[]{new mx("Vicnix (Deprecated)", this)}).co("Vanilla");
    private final aki Do = new aki("Disable on Teleport", (gi)this, (Boolean)false);
    private final aki Dp = new aki("View Bobbing", (gi)this, (Boolean)false);
    private final aki Dq = new aki("Fake Damage", (gi)this, (Boolean)false);
    private final aki Dr = new aki("Smooth Camera", (gi)this, (Boolean)false);
    private final aki Ds = new aki("Visual Dragon", (gi)this, (Boolean)false);
    private b Dt;
    private boolean zd;
    @dm
    public final dk<ei> Du = ei2 -> {
        if (((Boolean)this.Dp.wD()).booleanValue()) {
            lw.aER.bgK.cIc = 0.1f;
        }
        if (((Boolean)this.Dr.wD()).booleanValue()) {
            cl.cn();
        }
    };
    @dm
    public final dk<ft> Dv = ft2 -> {
        if (((Boolean)this.Ds.wD()).booleanValue()) {
            if (this.Dt == null) {
                this.Dt = new b(lw.aER.bgF);
                lw.aER.bgF.a(-1, (c)this.Dt);
                a.a.x().b(this, this.Dt);
            }
            Vector3d vector3d = new Vector3d(lw.aER.bgK.csh + (lw.aER.bgK.gW - lw.aER.bgK.csh) * (double)lw.aER.bgC.bWY, lw.aER.bgK.csi + (lw.aER.bgK.gX - lw.aER.bgK.csi) * (double)lw.aER.bgC.bWY, lw.aER.bgK.csj + (lw.aER.bgK.gY - lw.aER.bgK.csj) * (double)lw.aER.bgC.bWY);
            this.Dt.a(vector3d.x, vector3d.y - 3.0, vector3d.z, lw.aER.bgK.pl - 180.0f, lw.aER.bgK.pm);
        }
    };
    @dm
    public final dk<eq> Dw = eq2 -> {
        if (eq2.dc() == this.Dt) {
            eq2.cF();
        }
    };
    @dm
    public final dk<fd> Dx = fd2 -> {
        if (((Boolean)this.Do.wD()).booleanValue()) {
            this.toggle();
        }
    };

    @Override
    public void onEnable() {
        if (((Boolean)this.Dq.wD()).booleanValue() && lw.aER.bgK.aRg > 1) {
            aik.fakeDamage();
        }
        this.zd = false;
    }

    @Override
    public void onDisable() {
        if (this.Dt != null) {
            lw.aER.bgF.H(this.Dt);
            this.Dt = null;
        }
        lw.aER.bgC.dAp = 1.0f;
    }
}

