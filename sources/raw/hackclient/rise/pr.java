/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.akg;
import hackclient.rise.cl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ek;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fe;
import hackclient.rise.fh;
import hackclient.rise.md;
import net.minecraft.block.BlockAir;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;
import net.minecraft.util.a;

public class pr
extends akg<md> {
    private boolean ys = false;
    private boolean Ka = false;
    private boolean El = true;
    private int Ou = 0;
    private int Ov = 0;
    private int qH = 0;
    private boolean Ow = false;
    private boolean JE = true;
    private boolean GQ = true;
    @dm
    public final dk<ei> Ox = ei2 -> {
        pr.aER.bgK.cIc = 0.1f;
        if (this.Ov > 25 && aik.vz()) {
            if (pr.aER.bgK.ue > 0.0) {
                // empty if block
            }
            pr.aER.bgK.aO = false;
        }
        if (aik.vz()) {
            ++this.Ov;
        }
        if (this.JE && this.Ov < 25) {
            cl.cn();
        } else if (this.GQ) {
            // empty if block
        }
        if (aik.vz() && !this.El && this.GQ) {
            this.GQ = false;
            afl.b("Phased", new Object[0]);
        }
        if (!aik.vz() || !this.El) {
            // empty if block
        }
    };
    @dm
    public final dk<es> Oy = es2 -> {
        if (aik.vz()) {
            es2.a(null);
            if (!(es2.df() instanceof BlockAir) && !pr.aER.aIY.chr.Re()) {
                double d2 = es2.dg().wt();
                double d3 = es2.dg().wu();
                double d4 = es2.dg().wx();
                if (d3 < pr.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
                }
            }
        } else if (!this.ys) {
            if (es2.df() instanceof BlockAir && !pr.aER.bgK.isSneaking()) {
                double d5 = es2.dg().wt();
                double d6 = es2.dg().wu();
                double d7 = es2.dg().wx();
                if (d6 < pr.aER.bgK.gX) {
                    es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d5, d6, d7));
                }
            }
        } else if (this.ys && !aik.vz()) {
            afl.b("Disabled due to not being in a block", new Object[0]);
            this.e(md.class).toggle();
        }
    };
    @dm
    public final dk<fe> Oz = fe2 -> {};
    @dm
    public final dk<eo> OA = eo2 -> {
        int n2 = ain.vM();
        if (pr.aER.aIY.chq.Re() && pr.aER.bgK.cus > 0 || pr.aER.aIY.chr.Re() || pr.aER.aIY.chq.Re() || !aik.vz() || this.Ov > 25) {
            // empty if block
        }
        if (aik.vz()) {
            if (pr.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                eo2.setSpeed(0.0605 * (double)(1 + pr.aER.bgK.b(net.minecraft.potion.a.dgw).ajf()) + 0.306);
            } else {
                eo2.setSpeed(0.306);
            }
        }
        if (pr.aER.bgK.aO && this.El && this.ys) {
            pr.aER.bgK.jump();
            this.ys = false;
            this.El = false;
        }
        if (pr.aER.bgK.aO && !this.ys && !this.El) {
            if (pr.aER.bgK.aRg % 2 == 1 || pr.aER.bgK.cuW != 0.0f) {
                eo2.setForward(1.0f);
            } else {
                aii.strafe(0.0);
                eo2.setForward(-1.0f);
            }
        }
    };
    @dm
    public final dk<fh> OB = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i) {
            this.ys = true;
            ++this.Ou;
        }
        this.JE = this.Ou <= 4;
    };
    @dm
    public final dk<ek> OC = ek2 -> ek2.cF();

    public pr(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        this.Ka = false;
        this.JE = true;
        this.GQ = true;
        this.Ov = 0;
        this.Ou = 0;
        this.ys = false;
        this.El = true;
        if (pr.aER.bgK.aO) {
            pr.aER.bgK.setPosition(pr.aER.bgK.gW, pr.aER.bgK.gX - 1.0, pr.aER.bgK.gY);
            aii.stop();
        } else {
            afl.b("You must me on the ground to do this", new Object[0]);
            this.e(md.class).toggle();
        }
    }

    @Override
    public void onDisable() {
        this.Ka = false;
    }
}

