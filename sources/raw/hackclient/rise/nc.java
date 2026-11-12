/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.lw;
import net.minecraft.entity.c;
import net.minecraft.network.play.client.h;
import net.minecraft.util.a;

public class nc
extends akg<lw> {
    private final akp Gt = new akp("NCP Mode", this).a(new akg[]{new aks("Normal")}).a(new akg[]{new aks("Clip")}).co("Normal");
    private double xv;
    private boolean yr;
    private boolean Gu;
    private boolean Gv;
    private boolean ys;
    @dm
    public final dk<fd> Gw = fd2 -> {
        if (this.ys) {
            fd2.cF();
            this.ys = false;
            afl.b("Teleported", new Object[0]);
        }
    };
    @dm
    public final dk<eo> Gx = eo2 -> {
        block9: {
            block8: {
                if (!((akg)this.Gt.wD()).getName().equals("Clip")) {
                    return;
                }
                a a2 = nc.aER.bgK.Us().ae(0.0, 1.0, 0.0);
                if (!nc.aER.bgF.a((c)nc.aER.bgK, a2).isEmpty() && !this.yr) break block8;
                switch (nc.aER.bgK.tR) {
                    case 0: {
                        if (this.Gu && this.Gv) {
                            this.yr = true;
                            eo2.setSpeed(10.0);
                            nc.aER.bgK.ue = 0.42f;
                            this.Gu = false;
                            break;
                        }
                        break block9;
                    }
                    case 1: {
                        if (this.yr) {
                            eo2.setSpeed(9.6);
                            break;
                        }
                        break block9;
                    }
                }
                break block9;
            }
            this.Gu = true;
            if (this.Gv) {
                return;
            }
            this.Gv = true;
            ahn.m(new h(nc.aER.bgK.gW, nc.aER.bgK.gX, nc.aER.bgK.gY, nc.aER.bgK.pl, nc.aER.bgK.pm, false));
            ahn.m(new h(nc.aER.bgK.gW, nc.aER.bgK.gX - 0.1, nc.aER.bgK.gY, nc.aER.bgK.pl, nc.aER.bgK.pm, false));
            ahn.m(new h(nc.aER.bgK.gW, nc.aER.bgK.gX, nc.aER.bgK.gY, nc.aER.bgK.pl, nc.aER.bgK.pm, false));
            this.ys = true;
        }
        aii.strafe();
        nc.aER.bgC.dAp = 0.4f;
    };
    @dm
    private final dk<ei> Gy = ei2 -> {
        if (!((akg)this.Gt.wD()).getName().equals("Normal")) {
            return;
        }
        a a2 = nc.aER.bgK.Us().ae(0.0, 1.0, 0.0);
        if (this.yr) {
            nc.aER.bgK.ue += 0.025;
            aii.strafe(this.xv *= (double)0.935f);
            if (nc.aER.bgK.ue < -0.5 && !aik.vw()) {
                this.toggle();
            }
        }
        if (nc.aER.bgF.a((c)nc.aER.bgK, a2).isEmpty() && !this.yr) {
            this.yr = true;
            nc.aER.bgK.jump();
            this.xv = 9.0;
            aii.strafe(9.0);
        }
    };

    public nc(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }

    @Override
    public void onEnable() {
        afl.b("Start the fly under the block and walk forward", new Object[0]);
        this.xv = 0.0;
        this.Gu = false;
        this.yr = false;
        this.Gv = false;
        this.ys = false;
    }
}

