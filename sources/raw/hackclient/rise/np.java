/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.lw;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;

public class np
extends akg<lw> {
    private final akq Ia = new akq("Timer Speed", this, (Number)30, (Number)1.0, (Number)100.0, (Number)0.1);
    private final akq Ib = new akq("Speed", this, (Number)0.07, (Number)0.0, (Number)1.0, (Number)0.01);
    private final aki Ic = new aki("No Speed", (akg<?>)this, (Boolean)false);
    private final aki Id = new aki("Detect Damage", (akg<?>)this, (Boolean)true);
    private final aki Ie = new aki("Auto Disable", (akg<?>)this, (Boolean)true);
    private final akq If = new akq("Fly Ticks", this, (Number)1000, (Number)0.0, (Number)1600.0, (Number)10.0, () -> (Boolean)this.Id.wD() == false);
    private final aki Ig = new aki("Self Damage", (akg<?>)this, (Boolean)true);
    private final aki Ih = new aki("New Self Damage", (akg<?>)this, (Boolean)false);
    private final aki Ii = new aki("Packet", (akg<?>)this, (Boolean)true);
    private final akp Ij = new akp("Motion Y", this).a(new akg[]{new aks("None")}).a(new akg[]{new aks("Simple")}).a(new akg[]{new aks("Multiply")}).co("None");
    private final akq Ik = new akq("Motion", this, (Number)-0.01, (Number)-0.3, (Number)0.3, (Number)0.01, () -> ((akg)this.Ij.wD()).getName().equals("None"));
    private float Il;
    private float Im;
    private int In;
    private int Hb;
    private int Io;
    private boolean Ip;
    @dm
    public final dk<ei> Iq = ei2 -> {
        if (((Boolean)this.Ig.wD()).booleanValue() && np.aER.bgK.cus <= 0 && this.Hb < 4) {
            ei2.setOnGround(false);
        }
        if (((Boolean)this.Ih.wD()).booleanValue() && bd.cY > 3.0f) {
            ei2.setOnGround(true);
            np.aER.bgK.aO = true;
            np.aER.bgK.ue = 0.0;
            bd.cY = 0.0f;
        }
    };
    @dm
    public final dk<dz> Ir = dz2 -> {
        if (!(!((Boolean)this.Ig.wD()).booleanValue() || this.Ip || this.Hb >= 4 && np.aER.bgK.aO)) {
            dz2.setSneak(false);
            dz2.setJump(false);
            dz2.setStrafe(0.0f);
            dz2.setForward(0.0f);
        }
    };
    @dm
    public final dk<ej> Is = ej2 -> {
        if (np.aER.bgK.cus > 0 && !this.Ip) {
            if (np.aER.bgK.cus <= 8) {
                // empty if block
            }
            if (np.aER.bgK.tR >= 3) {
                this.Io = 20 * ((Number)this.Ia.wD()).intValue();
                this.Ip = true;
            }
        }
        if (((Boolean)this.Ig.wD()).booleanValue() && np.aER.bgK.cus <= 0 && this.Hb < 4 && np.aER.bgK.aO) {
            np.aER.bgK.jump();
            ++this.Hb;
        }
        if (!((Boolean)this.Id.wD()).booleanValue() || this.In <= ((Number)this.If.wD()).intValue() && this.Ip) {
            double d2;
            double d3 = d2 = this.Io > 0 ? ((Number)this.Ib.wD()).doubleValue() : 0.03;
            if (!((Boolean)this.Ic.wD()).booleanValue()) {
                aii.strafe(d2);
            }
            np.aER.bgC.dAp = ((Number)this.Ia.wD()).floatValue();
            switch (((akg)this.Ij.wD()).getName()) {
                case "None": {
                    np.aER.bgK.ue *= 0.039;
                    break;
                }
                case "Stable": {
                    np.aER.bgK.ue = ((Number)this.Ik.wD()).doubleValue();
                    break;
                }
                case "Multiply": {
                    np.aER.bgK.ue *= ((Number)this.Ik.wD()).doubleValue();
                }
            }
            if (this.Io > 0) {
                --this.Io;
            }
            ++this.In;
        }
        if (((Boolean)this.Id.wD()).booleanValue() && this.Ip) {
            if (!((Boolean)this.Ie.wD()).booleanValue()) {
                if (this.In >= ((Number)this.If.wD()).intValue()) {
                    ((lw)this.wy()).toggle();
                }
            } else if (this.Io <= 0) {
                ((lw)this.wy()).toggle();
            }
        }
    };

    public np(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        this.In = 0;
        this.Hb = 0;
        this.Io = 0;
        this.Ip = false;
        this.Il = np.aER.bgK.pl;
        this.Im = np.aER.bgK.pm;
    }

    @Override
    public void onDisable() {
        this.In = 0;
        this.Hb = 0;
        this.Io = 0;
        this.Ip = false;
        np.aER.bgC.dAp = 1.0f;
        if (((Boolean)this.Ii.wD()).booleanValue()) {
            ahn.n(new h(np.aER.bgK.gW, np.aER.bgK.gX, np.aER.bgK.gY, np.aER.bgK.pl, np.aER.bgK.pm, false));
            ahn.n(new f(np.aER.bgK.gW, np.aER.bgK.gX, np.aER.bgK.gY, false));
            ahn.n(new h(np.aER.bgK.gW, np.aER.bgK.gX, np.aER.bgK.gY, np.aER.bgK.pl, np.aER.bgK.pm, false));
        }
    }
}

