/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ain;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.et;
import hackclient.rise.eu;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tn;
import net.minecraft.util.b;
import net.minecraft.util.cf;

@gl(aliases={"module.player.autotool.name"}, description="module.player.autotool.description", category=gj.PLAYER)
public class te
extends gi {
    private int abD;
    private b jI;
    @dm(cH=4)
    public final dk<eu> abE = eu2 -> {
        if (this.e(tn.class).isEnabled()) {
            return;
        }
        if (eu2.dj() != te.aER.bgK) {
            return;
        }
        if (te.aER.bgK.aa(eu2.dg()) > 49.0) {
            return;
        }
        if (!this.jz()) {
            return;
        }
        if (!eu2.dg().equals(te.aER.bhc.dg())) {
            return;
        }
        this.abD = 15;
        this.jI = eu2.dg();
        this.jA();
    };
    @dm
    public final dk<et> abF = et2 -> {
        this.abD = 0;
        this.jI = null;
    };
    @dm
    public final dk<ej> abG = ej2 -> this.jA();

    private boolean jz() {
        return te.aER.bgu != null && (te.aER.bgu.bDA || te.aER.aIY.chw.Re()) && te.aER.bhc != null && te.aER.bhc.dzu == cf.dzy;
    }

    public void jA() {
        if (this.e(tn.class).isEnabled()) {
            return;
        }
        if (!this.jz()) {
            this.abD = 0;
            return;
        }
        if (te.aER.bhc == null || this.abD <= 0 || this.jI == null) {
            return;
        }
        if (te.aER.bhc.dzu != cf.dzy || !this.jI.equals(te.aER.bhc.dg())) {
            this.abD = 0;
            return;
        }
        --this.abD;
        int n2 = ain.v(this.jI);
        if (n2 != -1) {
            this.d(bu.class);
            bu.setSlot(n2);
        }
    }
}

