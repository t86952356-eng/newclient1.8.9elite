/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.BlockBrewingStand;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Items;
import net.minecraft.inventory.ac;
import net.minecraft.inventory.b;
import net.minecraft.inventory.e;
import net.minecraft.item.by;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.potion.d;
import net.minecraft.tileentity.aa;
import net.minecraft.util.ao;
import net.minecraft.util.bi;

public class l
extends aa
implements ac,
bi {
    private static final int[] dsr = new int[]{3};
    private static final int[] dss = new int[]{0, 1, 2};
    private co[] dst = new co[4];
    private int cSW;
    private boolean[] dsu;
    private net.minecraft.item.d dsv;
    private String coX;

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.brewing";
    }

    @Override
    public boolean xV() {
        return this.coX != null && this.coX.length() > 0;
    }

    public void setName(String string) {
        this.coX = string;
    }

    @Override
    public int YI() {
        return this.dst.length;
    }

    @Override
    public void jA() {
        boolean[] blArray;
        if (this.cSW > 0) {
            --this.cSW;
            if (this.cSW == 0) {
                this.aqr();
                this.Lw();
            } else if (!this.aqq()) {
                this.cSW = 0;
                this.Lw();
            } else if (this.dsv != this.dst[3].bP()) {
                this.cSW = 0;
                this.Lw();
            }
        } else if (this.aqq()) {
            this.cSW = 400;
            this.dsv = this.dst[3].bP();
        }
        if (!this.baU.dDw && !Arrays.equals(blArray = this.aqs(), this.dsu)) {
            this.dsu = blArray;
            IBlockState iBlockState = this.baU.L(this.Ab());
            if (!(iBlockState.df() instanceof BlockBrewingStand)) {
                return;
            }
            for (int i2 = 0; i2 < BlockBrewingStand.aTj.length; ++i2) {
                iBlockState = iBlockState.a(BlockBrewingStand.aTj[i2], blArray[i2]);
            }
            this.baU.a(this.aZf, iBlockState, 2);
        }
    }

    private boolean aqq() {
        if (this.dst[3] != null && this.dst[3].cWZ > 0) {
            co co2 = this.dst[3];
            if (!co2.bP().as(co2)) {
                return false;
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < 3; ++i2) {
                if (this.dst[i2] == null || this.dst[i2].bP() != Items.cRD) continue;
                int n2 = this.dst[i2].yc();
                int n3 = this.j(n2, co2);
                if (!by.gb(n2) && by.gb(n3)) {
                    bl2 = true;
                    break;
                }
                List<d> list = Items.cRD.ga(n2);
                List<d> list2 = Items.cRD.ga(n3);
                if (n2 > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null) || n2 == n3) continue;
                bl2 = true;
                break;
            }
            return bl2;
        }
        return false;
    }

    private void aqr() {
        if (this.aqq()) {
            co co2 = this.dst[3];
            for (int i2 = 0; i2 < 3; ++i2) {
                if (this.dst[i2] == null || this.dst[i2].bP() != Items.cRD) continue;
                int n2 = this.dst[i2].yc();
                int n3 = this.j(n2, co2);
                List<d> list = Items.cRD.ga(n2);
                List<d> list2 = Items.cRD.ga(n3);
                if (n2 > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null)) {
                    if (by.gb(n2) || !by.gb(n3)) continue;
                    this.dst[i2].gf(n3);
                    continue;
                }
                if (n2 == n3) continue;
                this.dst[i2].gf(n3);
            }
            if (co2.bP().adA()) {
                this.dst[3] = new co(co2.bP().adz());
            } else {
                --this.dst[3].cWZ;
                if (this.dst[3].cWZ <= 0) {
                    this.dst[3] = null;
                }
            }
        }
    }

    private int j(int n2, co co2) {
        return co2 == null ? n2 : (co2.bP().as(co2) ? net.minecraft.potion.g.e(n2, co2.bP().ar(co2)) : n2);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        v v2 = n2.D("Items", 10);
        this.dst = new co[this.YI()];
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            byte by2 = n3.eE("Slot");
            if (by2 < 0 || by2 >= this.dst.length) continue;
            this.dst[by2] = co.s(n3);
        }
        this.cSW = n2.eF("BrewTime");
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.a("BrewTime", (short)this.cSW);
        v v2 = new v();
        for (int i2 = 0; i2 < this.dst.length; ++i2) {
            if (this.dst[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.dst[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
        if (this.xV()) {
            n2.R("CustomName", this.coX);
        }
    }

    @Override
    public co fi(int n2) {
        return n2 >= 0 && n2 < this.dst.length ? this.dst[n2] : null;
    }

    @Override
    public co ap(int n2, int n3) {
        if (n2 >= 0 && n2 < this.dst.length) {
            co co2 = this.dst[n2];
            this.dst[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (n2 >= 0 && n2 < this.dst.length) {
            co co2 = this.dst[n2];
            this.dst[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        if (n2 >= 0 && n2 < this.dst.length) {
            this.dst[n2] = co2;
        }
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public boolean v(a a2) {
        return this.baU.K(this.aZf) == this && a2.M((double)this.aZf.wt() + 0.5, (double)this.aZf.wu() + 0.5, (double)this.aZf.wx() + 0.5) <= 64.0;
    }

    @Override
    public void w(a a2) {
    }

    @Override
    public void x(a a2) {
    }

    @Override
    public boolean h(int n2, co co2) {
        return n2 == 3 ? co2.bP().as(co2) : co2.bP() == Items.cRD || co2.bP() == Items.cRE;
    }

    public boolean[] aqs() {
        boolean[] blArray = new boolean[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.dst[i2] == null) continue;
            blArray[i2] = true;
        }
        return blArray;
    }

    @Override
    public int[] v(ao ao2) {
        return ao2 == ao.dwr ? dsr : dss;
    }

    @Override
    public boolean a(int n2, co co2, ao ao2) {
        return this.h(n2, co2);
    }

    @Override
    public boolean b(int n2, co co2, ao ao2) {
        return true;
    }

    @Override
    public String xX() {
        return "minecraft:brewing_stand";
    }

    @Override
    public b a(g g2, a a2) {
        return new e(g2, this);
    }

    @Override
    public int cx(int n2) {
        switch (n2) {
            case 0: {
                return this.cSW;
            }
        }
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.cSW = n3;
            }
        }
    }

    @Override
    public int IG() {
        return 1;
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.dst.length; ++i2) {
            this.dst[i2] = null;
        }
    }
}

