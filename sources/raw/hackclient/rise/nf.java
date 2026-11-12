/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.lw;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;

public class nf
extends akg<lw> {
    private final aki GZ = new aki("Self Damage", (akg<?>)this, (Boolean)false);
    private final akq Ha = new akq("Height", this, (Number)1.0, (Number)0.42, (Number)7.0, (Number)0.1);
    private int Hb;
    private boolean Hc;
    private boolean Hd;
    private double He;
    private double Hf;
    private double Hg;
    @dm
    public final dk<ej> Hh = ej2 -> {
        if (nf.aER.bgK.Zz == 1) {
            // empty if block
        }
        if (this.Hd) {
            nf.aER.bgK.ue = ((Number)this.Ha.wD()).doubleValue();
        }
        if (nf.aER.bgK.cus >= 1 && nf.aER.bgK.cus <= 8) {
            if (nf.aER.bgK.aO) {
                nf.aER.bgK.jump();
            } else if (nf.aER.bgK.ue < 0.2) {
                this.Hd = true;
            }
        }
        if (this.Hb < 4 && ((Boolean)this.GZ.wD()).booleanValue() && nf.aER.bgK.aO) {
            nf.aER.bgK.jump();
            ++this.Hb;
        }
    };
    @dm
    public final dk<ei> Hi = ei2 -> {
        if (this.Hb < 4 && ((Boolean)this.GZ.wD()).booleanValue()) {
            ei2.setOnGround(false);
        }
    };
    @dm
    public final dk<fi> Hj = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof h && this.Hc) {
            this.Hc = false;
            nf.aER.bgK.ud = this.He;
            nf.aER.bgK.ue = this.Hf;
            nf.aER.bgK.uf = this.Hg;
        }
    };
    @dm
    public final dk<fh> Hk = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (this.Hd && aj2 instanceof i) {
            this.Hc = true;
            this.He = nf.aER.bgK.ud;
            this.Hf = nf.aER.bgK.ue;
            this.Hg = nf.aER.bgK.uf;
            this.Hd = false;
        }
    };

    public nf(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.Hb = 0;
        this.Hd = false;
        this.Hc = false;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

