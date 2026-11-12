/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ek;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.md;
import net.minecraft.block.BlockAir;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;

public class pu
extends akg<md> {
    private final akq OV = new akq("Amount", this, (Number)1, (Number)0.1, (Number)1.5, (Number)0.1);
    private final akq OW = new akq("Timer", this, (Number)0.1, (Number)0.1, (Number)1, (Number)0.1);
    private final aki OX = new aki("Packet", (akg<?>)this, (Boolean)false);
    private boolean OY;
    private boolean Or;
    private double OZ;
    private double Pa;
    @dm
    public final dk<ei> Pb = ei2 -> {
        this.Or = false;
        double d2 = Math.toRadians(pu.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (pu.aER.bgK.crR) {
            pu.aER.bgK.setPosition(pu.aER.bgK.gW - d3 * 0.01, pu.aER.bgK.gX, pu.aER.bgK.gY + d4 * 0.01);
            this.Or = true;
        } else if (this.OY && aik.vz()) {
            pu.aER.bgC.dAp = ((Number)this.OW.wD()).floatValue();
            if (!((Boolean)this.OX.wD()).booleanValue()) {
                pu.aER.bgK.setPosition(pu.aER.bgK.gW - d3 * ((Number)this.OV.wD()).doubleValue(), pu.aER.bgK.gX, pu.aER.bgK.gY + d4 * ((Number)this.OV.wD()).doubleValue());
            } else {
                ahn.n(new f(pu.aER.bgK.gW - d3 * ((Number)this.OV.wD()).doubleValue(), pu.aER.bgK.gX, pu.aER.bgK.gY + d4 * ((Number)this.OV.wD()).doubleValue(), false));
            }
            this.Or = true;
        }
    };
    @dm
    public final dk<eo> Pc = eo2 -> {
        if (this.OY && aik.vz()) {
            aii.stop();
        }
    };
    @dm
    public final dk<ek> Pd = dh::cF;
    @dm
    public final dk<es> Pe = es2 -> {
        if (es2.df() instanceof BlockAir && this.Or) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < pu.aER.bgK.gX) {
                // empty if block
            }
        }
    };
    @dm
    private final dk<ez> Pf = ez2 -> {
        if (!this.OY || aik.vz()) {
            // empty if block
        }
    };
    @dm
    private final dk<fh> Pg = fh2 -> {
        if (fh2.dq() instanceof i) {
            i i2 = (i)fh2.dq();
            double d2 = i2.getX();
            double d3 = i2.getZ();
            double d4 = Math.abs(d2 - this.OZ);
            double d5 = Math.abs(d3 - this.Pa);
            this.OZ = d2;
            this.Pa = d3;
            this.OY = d4 <= 0.001 && d5 <= 0.001;
        }
    };

    public pu(String string, md md2) {
        super(string, md2);
    }

    @Override
    public void onEnable() {
        afl.b("try to jump around a bit before phasing if its the start of a game", new Object[0]);
    }

    @Override
    public void onDisable() {
        this.OY = false;
    }
}

