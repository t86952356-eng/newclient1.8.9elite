/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.bc;
import net.minecraft.client.settings.a;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.network.play.server.at;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class LegitMode
extends Mode<NoSlow> {
    private static final int Nu = 32;
    private static final int Nv = 12;
    private static final int Nw = 0;
    private int Nx;
    private boolean Ny;
    private boolean Nz;
    private boolean NA;
    private int NB;
    @EventLink
    public final Listener<PreMotionEvent> NC = preMotionEvent -> {
        if (LegitMode.aER.bgK == null || LegitMode.aER.bgK.Vk() == null) {
            return;
        }
        if (bc.cR) {
            ++this.Nx;
        }
        if (this.hL()) {
            if (!bc.cR) {
                bc.cR = true;
                this.Nx = LegitMode.aER.bgK.abH();
            }
            LegitMode.aER.bgK.abI();
            LegitMode.aER.aIY.chu.ay(false);
        }
        if (bc.cR && (this.Nx >= 32 || this.Ny)) {
            this.gx();
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> ND = slowDownEvent -> {
        boolean bl2;
        if (!this.hM()) {
            this.hN();
            return;
        }
        boolean bl3 = bl2 = LegitMode.aER.bgK.abH() % 3 != 0;
        if (bl2) {
            if (!this.Nz) {
                this.NA = true;
                this.NB = 0;
                this.Nz = true;
                return;
            }
            if (this.NA) {
                --this.NB;
                if (this.NB <= 0) {
                    this.NA = false;
                    LegitMode.aER.bgK.setSprinting(true);
                }
                return;
            }
            LegitMode.aER.bgK.setSprinting(true);
            return;
        }
        this.hN();
    };
    @EventLink
    public final Listener<PacketReceiveEvent> NE = packetReceiveEvent -> {
        at at2;
        if (packetReceiveEvent.dq() instanceof at && (at2 = (at)packetReceiveEvent.dq()).getSoundName() != null && at2.getSoundName().contains("random.burp")) {
            this.Ny = true;
        }
    };

    public LegitMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }

    @Override
    public void onDisable() {
        this.gx();
        this.hN();
        LegitMode.aER.aIY.chu.ay(a.a(LegitMode.aER.aIY.chu));
    }

    private boolean hL() {
        if (!LegitMode.aER.bgK.isUsingItem()) {
            return false;
        }
        co co2 = LegitMode.aER.bgK.Vk();
        if (co2 == null) {
            return false;
        }
        d d2 = co2.bP();
        return LegitMode.aER.bgK.abH() > 12 && !(d2 instanceof ai) && this.b(co2, false);
    }

    private boolean hM() {
        if (!LegitMode.aER.bgK.isUsingItem()) {
            return false;
        }
        co co2 = LegitMode.aER.bgK.Vk();
        return co2 != null && this.b(co2, true);
    }

    private boolean b(co co2, boolean bl2) {
        d d2 = co2.bP();
        if (d2 instanceof bg) {
            return (Boolean)((NoSlow)this.wy()).DO.wD();
        }
        if (d2 instanceof by) {
            return (Boolean)((NoSlow)this.wy()).DP.wD() != false && !by.gb(co2.yc());
        }
        if (d2 instanceof cp) {
            return (Boolean)((NoSlow)this.wy()).DQ.wD();
        }
        return bl2 && d2 instanceof ai && (Boolean)((NoSlow)this.wy()).DR.wD() != false;
    }

    private void gx() {
        if (bc.cR) {
            bc.dispatch();
            bc.cR = false;
        }
        this.Ny = false;
        this.Nx = 0;
    }

    private void hN() {
        this.Nz = false;
        this.NA = false;
        this.NB = 0;
    }
}

