/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.mh;
import hackclient.rise.tb;
import net.minecraft.block.BlockAir;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;
import net.minecraft.util.a;

public class un
extends akg<tb> {
    private final akq ait = new akq("Distance", this, (Number)2.6, (Number)0, (Number)10, (Number)0.1);
    private boolean zd;
    private boolean aiu;
    private lw zm = null;
    private mh uS = null;
    private lz aiv = null;
    private boolean aiw = false;
    private int zn;
    @dm
    public final dk<ei> aix = ei2 -> {
        if (this.zm == null) {
            this.zm = this.e(lw.class);
        }
        if (this.uS == null) {
            this.uS = this.e(mh.class);
        }
        if (this.aiv == null) {
            this.aiv = this.e(lz.class);
        }
        if (un.aER.bgK.csf > ((Number)this.ait.wD()).floatValue() && !aik.vw()) {
            this.aiu = true;
        }
        if (this.zm.isEnabled() || this.aiv.isEnabled()) {
            this.aiu = false;
        }
        if (this.uS.isEnabled() && this.aiu) {
            this.aiw = true;
            this.uS.toggle();
        }
        if (!this.aiu && !this.uS.isEnabled() && this.aiw) {
            this.uS.toggle();
            this.aiw = false;
        }
    };
    @dm
    public final dk<es> aiy = es2 -> {
        if (es2.df() instanceof BlockAir && !un.aER.bgK.isSneaking() && this.aiu) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < un.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
        if ((!(es2.df() instanceof BlockAir) || un.aER.bgK.isSneaking()) && this.aiu && !un.aER.bgK.crR) {
            this.aiu = false;
        }
    };
    @dm
    public final dk<eo> aiz = eo2 -> {
        if (this.aiu) {
            aii.strafe(0.1);
            if (un.aER.bgK.aRg % 2 == 1 || un.aER.bgK.cuW != 0.0f) {
                eo2.setForward(1.0f);
            } else {
                aii.strafe(0.0);
                eo2.setForward(-1.0f);
            }
        }
    };
    @dm
    public final dk<fh> aiA = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            this.aiu = false;
        }
    };
    @dm
    public final dk<fg> aiB = fg2 -> {
        this.aiu = false;
    };
    @dm
    public final dk<ed> aiC = ed2 -> {
        if (this.aiu) {
            ed2.setJumpMotion(0.0f);
        }
    };

    public un(String string, tb tb2) {
        super(string, tb2);
    }
}

