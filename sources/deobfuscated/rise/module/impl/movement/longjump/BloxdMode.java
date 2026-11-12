/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.bc;
import hackclient.rise.bd;
import hackclient.rise.bg;
import hackclient.rise.bu;
import hackclient.rise.ci;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.da;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.module.impl.movement.TerrainSpeed;

public class BloxdMode
extends Mode<LongJump> {
    public da Jr = new da(0.0, 0.0, 0.0);
    public int LO = 0;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @EventLink
    public final Listener<StrafeEvent> LP = strafeEvent -> {
        if (BloxdMode.aER.bgK.ae > 0 && BloxdMode.aER.bgK.ae < 42) {
            ci.a((float)((double)BloxdMode.aER.bgK.ae / 41.0));
        }
        if (BloxdMode.aER.bgK.ae < 37 && BloxdMode.aER.bgK.ae > 1) {
            this.e(LongJump.class).setEnabled(true);
        }
        ++this.LO;
        if (this.LO == 20) {
            this.e(TerrainSpeed.class).setEnabled(true);
        }
        if (BloxdMode.aER.bgK.aO || !(bd.cY > 1.0f)) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> LQ = preMotionEvent -> {
        if (BloxdMode.aER.bgK.aO) {
            bc.cR = false;
        }
        BloxdMode.aER.bgK.cIc = 0.1f;
        if (BloxdMode.aER.bgK.aO || !(bd.cY > 1.0f)) {
            // empty if block
        }
    };

    public BloxdMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.e(TerrainSpeed.class).setEnabled(false);
        aii.stop();
        this.Ji = BloxdMode.aER.bgK.cHV.cJE;
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
        this.e(TerrainSpeed.class).setEnabled(true);
    }

    private int hw() {
        co co2;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = BloxdMode.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cPj) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = BloxdMode.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cQV) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = BloxdMode.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQT) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = BloxdMode.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQM) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        return -1;
    }
}

