/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bc;
import hackclient.rise.bd;
import hackclient.rise.bg;
import hackclient.rise.bu;
import hackclient.rise.ci;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lz;
import hackclient.rise.mo;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.da;

public class or
extends akg<lz> {
    public da Jr = new da(0.0, 0.0, 0.0);
    public int LO = 0;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @dm
    public final dk<eo> LP = eo2 -> {
        if (or.aER.bgK.ae > 0 && or.aER.bgK.ae < 42) {
            ci.a((float)((double)or.aER.bgK.ae / 41.0));
        }
        if (or.aER.bgK.ae < 37 && or.aER.bgK.ae > 1) {
            this.e(lz.class).setEnabled(true);
        }
        ++this.LO;
        if (this.LO == 20) {
            this.e(mo.class).setEnabled(true);
        }
        if (or.aER.bgK.aO || !(bd.cY > 1.0f)) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> LQ = ei2 -> {
        if (or.aER.bgK.aO) {
            bc.cR = false;
        }
        or.aER.bgK.cIc = 0.1f;
        if (or.aER.bgK.aO || !(bd.cY > 1.0f)) {
            // empty if block
        }
    };

    public or(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.e(mo.class).setEnabled(false);
        aii.stop();
        this.Ji = or.aER.bgK.cHV.cJE;
        if (this.hw() == -1) {
            afl.b("you need a projectile in your hotbar for this", new Object[0]);
            return;
        }
        int n2 = this.hw();
        if (n2 != -1) {
            this.d(bu.class);
            bu.setSlot(n2);
        } else {
            afl.b("you need a projectile in your hotbar for this", new Object[0]);
        }
        bg.damage(false);
        this.LO = 0;
    }

    @Override
    public void onDisable() {
        this.e(mo.class).setEnabled(true);
    }

    private int hw() {
        co co2;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = or.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cPj) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = or.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cQV) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = or.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQT) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = or.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQM) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        return -1;
    }
}

