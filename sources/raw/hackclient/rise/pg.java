/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bc;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.em;
import hackclient.rise.fh;
import hackclient.rise.mc;
import net.minecraft.client.settings.a;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.network.play.server.at;

public class pg
extends akg<mc> {
    private static final int Nu = 32;
    private static final int Nv = 12;
    private static final int Nw = 0;
    private int Nx;
    private boolean Ny;
    private boolean Nz;
    private boolean NA;
    private int NB;
    @dm
    public final dk<ei> NC = ei2 -> {
        if (pg.aER.bgK == null || pg.aER.bgK.Vk() == null) {
            return;
        }
        if (bc.cR) {
            ++this.Nx;
        }
        if (this.hL()) {
            if (!bc.cR) {
                bc.cR = true;
                this.Nx = pg.aER.bgK.abH();
            }
            pg.aER.bgK.abI();
            pg.aER.aIY.chu.ay(false);
        }
        if (bc.cR && (this.Nx >= 32 || this.Ny)) {
            this.gx();
        }
    };
    @dm
    public final dk<em> ND = em2 -> {
        boolean bl2;
        if (!this.hM()) {
            this.hN();
            return;
        }
        boolean bl3 = bl2 = pg.aER.bgK.abH() % 3 != 0;
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
                    pg.aER.bgK.setSprinting(true);
                }
                return;
            }
            pg.aER.bgK.setSprinting(true);
            return;
        }
        this.hN();
    };
    @dm
    public final dk<fh> NE = fh2 -> {
        at at2;
        if (fh2.dq() instanceof at && (at2 = (at)fh2.dq()).getSoundName() != null && at2.getSoundName().contains("random.burp")) {
            this.Ny = true;
        }
    };

    public pg(String string, mc mc2) {
        super(string, mc2);
    }

    @Override
    public void onDisable() {
        this.gx();
        this.hN();
        pg.aER.aIY.chu.ay(a.a(pg.aER.aIY.chu));
    }

    private boolean hL() {
        if (!pg.aER.bgK.isUsingItem()) {
            return false;
        }
        co co2 = pg.aER.bgK.Vk();
        if (co2 == null) {
            return false;
        }
        d d2 = co2.bP();
        return pg.aER.bgK.abH() > 12 && !(d2 instanceof ai) && this.b(co2, false);
    }

    private boolean hM() {
        if (!pg.aER.bgK.isUsingItem()) {
            return false;
        }
        co co2 = pg.aER.bgK.Vk();
        return co2 != null && this.b(co2, true);
    }

    private boolean b(co co2, boolean bl2) {
        d d2 = co2.bP();
        if (d2 instanceof bg) {
            return (Boolean)((mc)this.wy()).DO.wD();
        }
        if (d2 instanceof by) {
            return (Boolean)((mc)this.wy()).DP.wD() != false && !by.gb(co2.yc());
        }
        if (d2 instanceof cp) {
            return (Boolean)((mc)this.wy()).DQ.wD();
        }
        return bl2 && d2 instanceof ai && (Boolean)((mc)this.wy()).DR.wD() != false;
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

