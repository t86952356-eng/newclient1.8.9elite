/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bf;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.i;

public class h
extends d {
    private int drj;
    private v drk;
    private boolean drl;
    private List<i> drm;
    private List<b> drn;
    private String dro;

    public void aQ(co co2) {
        this.drk = null;
        if (co2.aej() && co2.aek().C("BlockEntityTag", 10)) {
            n n2 = co2.aek().eN("BlockEntityTag");
            if (n2.eD("Patterns")) {
                this.drk = (v)n2.D("Patterns", 10).aeG();
            }
            this.drj = n2.C("Base", 99) ? n2.eG("Base") : co2.yc() & 0xF;
        } else {
            this.drj = co2.yc() & 0xF;
        }
        this.drm = null;
        this.drn = null;
        this.dro = "";
        this.drl = true;
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        h.a(n2, this.drj, this.drk);
    }

    public static void a(n n2, int n3, v v2) {
        n2.B("Base", n3);
        if (v2 != null) {
            n2.b("Patterns", v2);
        }
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.drj = n2.eG("Base");
        this.drk = n2.D("Patterns", 10);
        this.drm = null;
        this.drn = null;
        this.dro = null;
        this.drl = true;
    }

    @Override
    public aj apQ() {
        n n2 = new n();
        this.b(n2);
        return new bf(this.aZf, 6, n2);
    }

    public int apW() {
        return this.drj;
    }

    public static int aR(co co2) {
        n n2 = co2.j("BlockEntityTag", false);
        return n2 != null && n2.eD("Base") ? n2.eG("Base") : co2.yc();
    }

    public static int aS(co co2) {
        n n2 = co2.j("BlockEntityTag", false);
        return n2 != null && n2.eD("Patterns") ? n2.D("Patterns", 10).aeS() : 0;
    }

    public List<i> apX() {
        this.aqb();
        return this.drm;
    }

    public v apY() {
        return this.drk;
    }

    public List<b> apZ() {
        this.aqb();
        return this.drn;
    }

    public String aqa() {
        this.aqb();
        return this.dro;
    }

    private void aqb() {
        if (this.drm == null || this.drn == null || this.dro == null) {
            if (!this.drl) {
                this.dro = "";
            } else {
                this.drm = Lists.newArrayList();
                this.drn = Lists.newArrayList();
                this.drm.add(i.drp);
                this.drn.add(b.fR(this.drj));
                this.dro = "b" + this.drj;
                if (this.drk != null) {
                    for (int i2 = 0; i2 < this.drk.aeS(); ++i2) {
                        n n2 = this.drk.gi(i2);
                        i i3 = i.fX(n2.eK("Pattern"));
                        if (i3 == null) continue;
                        this.drm.add(i3);
                        int n3 = n2.eG("Color");
                        this.drn.add(b.fR(n3));
                        this.dro = this.dro + i3.aqd() + n3;
                    }
                }
            }
        }
    }

    public static void aT(co co2) {
        v v2;
        n n2 = co2.j("BlockEntityTag", false);
        if (n2 != null && n2.C("Patterns", 9) && (v2 = n2.D("Patterns", 10)).aeS() > 0) {
            v2.gh(v2.aeS() - 1);
            if (v2.aeH()) {
                co2.aek().eP("BlockEntityTag");
                if (co2.aek().aeH()) {
                    co2.u(null);
                }
            }
        }
    }
}

