/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aks;
import hackclient.rise.fd;
import net.minecraft.entity.c;
import net.minecraft.network.play.client.h;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.ModeValue;

public class LatestNCPMode
extends Mode<Flight> {
    private final ModeValue Gt = new ModeValue("NCP Mode", this).a(new Mode[]{new aks("Normal")}).a(new Mode[]{new aks("Clip")}).co("Normal");
    private double xv;
    private boolean yr;
    private boolean Gu;
    private boolean Gv;
    private boolean ys;
    @EventLink
    public final Listener<fd> Gw = fd2 -> {
        if (this.ys) {
            fd2.cF();
            this.ys = false;
            afl.b("Teleported", new Object[0]);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Gx = strafeEvent -> {
        block9: {
            block8: {
                if (!((Mode)this.Gt.wD()).getName().equals("Clip")) {
                    return;
                }
                a a2 = LatestNCPMode.aER.bgK.Us().ae(0.0, 1.0, 0.0);
                if (!LatestNCPMode.aER.bgF.a((c)LatestNCPMode.aER.bgK, a2).isEmpty() && !this.yr) break block8;
                switch (LatestNCPMode.aER.bgK.tR) {
                    case 0: {
                        if (this.Gu && this.Gv) {
                            this.yr = true;
                            strafeEvent.setSpeed(10.0);
                            LatestNCPMode.aER.bgK.ue = 0.42f;
                            this.Gu = false;
                            break;
                        }
                        break block9;
                    }
                    case 1: {
                        if (this.yr) {
                            strafeEvent.setSpeed(9.6);
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
            ahn.m(new h(LatestNCPMode.aER.bgK.gW, LatestNCPMode.aER.bgK.gX, LatestNCPMode.aER.bgK.gY, LatestNCPMode.aER.bgK.pl, LatestNCPMode.aER.bgK.pm, false));
            ahn.m(new h(LatestNCPMode.aER.bgK.gW, LatestNCPMode.aER.bgK.gX - 0.1, LatestNCPMode.aER.bgK.gY, LatestNCPMode.aER.bgK.pl, LatestNCPMode.aER.bgK.pm, false));
            ahn.m(new h(LatestNCPMode.aER.bgK.gW, LatestNCPMode.aER.bgK.gX, LatestNCPMode.aER.bgK.gY, LatestNCPMode.aER.bgK.pl, LatestNCPMode.aER.bgK.pm, false));
            this.ys = true;
        }
        aii.strafe();
        LatestNCPMode.aER.bgC.dAp = 0.4f;
    };
    @EventLink
    private final Listener<PreMotionEvent> Gy = preMotionEvent -> {
        if (!((Mode)this.Gt.wD()).getName().equals("Normal")) {
            return;
        }
        a a2 = LatestNCPMode.aER.bgK.Us().ae(0.0, 1.0, 0.0);
        if (this.yr) {
            LatestNCPMode.aER.bgK.ue += 0.025;
            aii.strafe(this.xv *= (double)0.935f);
            if (LatestNCPMode.aER.bgK.ue < -0.5 && !aik.vw()) {
                this.toggle();
            }
        }
        if (LatestNCPMode.aER.bgF.a((c)LatestNCPMode.aER.bgK, a2).isEmpty() && !this.yr) {
            this.yr = true;
            LatestNCPMode.aER.bgK.jump();
            this.xv = 9.0;
            aii.strafe(9.0);
        }
    };

    public LatestNCPMode(String string, Flight flight) {
        super(string, flight);
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

