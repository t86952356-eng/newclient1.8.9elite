/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ac;
import net.minecraft.inventory.am;
import net.minecraft.inventory.b;
import net.minecraft.item.af;
import net.minecraft.item.bj;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.item.crafting.c;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.aa;
import net.minecraft.util.ao;
import net.minecraft.util.bi;
import net.minecraft.util.bt;

public class y
extends aa
implements ac,
bi {
    private static final int[] dsZ = new int[]{0};
    private static final int[] dta = new int[]{2, 1};
    private static final int[] dtb = new int[]{1};
    private co[] dtc = new co[3];
    private int dtd;
    private int dte;
    private int dtf;
    private int dtg;
    private String dth;

    @Override
    public int YI() {
        return this.dtc.length;
    }

    @Override
    public co fi(int n2) {
        return this.dtc[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.dtc[n2] != null) {
            if (this.dtc[n2].cWZ <= n3) {
                co co2 = this.dtc[n2];
                this.dtc[n2] = null;
                return co2;
            }
            co co3 = this.dtc[n2].ge(n3);
            if (this.dtc[n2].cWZ == 0) {
                this.dtc[n2] = null;
            }
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.dtc[n2] != null) {
            co co2 = this.dtc[n2];
            this.dtc[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        boolean bl2 = co2 != null && co2.aJ(this.dtc[n2]) && co.c(co2, this.dtc[n2]);
        this.dtc[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
        if (n2 == 0 && !bl2) {
            this.dtg = this.aV(co2);
            this.dtf = 0;
            this.Lw();
        }
    }

    @Override
    public String xU() {
        return this.xV() ? this.dth : "container.furnace";
    }

    @Override
    public boolean xV() {
        return this.dth != null && this.dth.length() > 0;
    }

    public void fY(String string) {
        this.dth = string;
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        v v2 = n2.D("Items", 10);
        this.dtc = new co[this.YI()];
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            byte by2 = n3.eE("Slot");
            if (by2 < 0 || by2 >= this.dtc.length) continue;
            this.dtc[by2] = co.s(n3);
        }
        this.dtd = n2.eF("BurnTime");
        this.dtf = n2.eF("CookTime");
        this.dtg = n2.eF("CookTimeTotal");
        this.dte = y.aW(this.dtc[1]);
        if (n2.C("CustomName", 8)) {
            this.dth = n2.eK("CustomName");
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.a("BurnTime", (short)this.dtd);
        n2.a("CookTime", (short)this.dtf);
        n2.a("CookTimeTotal", (short)this.dtg);
        v v2 = new v();
        for (int i2 = 0; i2 < this.dtc.length; ++i2) {
            if (this.dtc[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.dtc[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
        if (this.xV()) {
            n2.R("CustomName", this.dth);
        }
    }

    @Override
    public int YJ() {
        return 64;
    }

    public boolean isBurning() {
        return this.dtd > 0;
    }

    public static boolean e(ab ab2) {
        return ab2.cx(0) > 0;
    }

    @Override
    public void jA() {
        boolean bl2 = this.isBurning();
        boolean bl3 = false;
        if (this.isBurning()) {
            --this.dtd;
        }
        if (!this.baU.dDw) {
            if (this.isBurning() || this.dtc[1] != null && this.dtc[0] != null) {
                if (!this.isBurning() && this.aqB()) {
                    this.dte = this.dtd = y.aW(this.dtc[1]);
                    if (this.isBurning()) {
                        bl3 = true;
                        if (this.dtc[1] != null) {
                            --this.dtc[1].cWZ;
                            if (this.dtc[1].cWZ == 0) {
                                d d2 = this.dtc[1].bP().adz();
                                co co2 = this.dtc[1] = d2 != null ? new co(d2) : null;
                            }
                        }
                    }
                }
                if (this.isBurning() && this.aqB()) {
                    ++this.dtf;
                    if (this.dtf == this.dtg) {
                        this.dtf = 0;
                        this.dtg = this.aV(this.dtc[0]);
                        this.aqC();
                        bl3 = true;
                    }
                } else {
                    this.dtf = 0;
                }
            } else if (!this.isBurning() && this.dtf > 0) {
                this.dtf = bt.F(this.dtf - 2, 0, this.dtg);
            }
            if (bl2 != this.isBurning()) {
                bl3 = true;
                BlockFurnace.a(this.isBurning(), this.baU, this.aZf);
            }
        }
        if (bl3) {
            this.Lw();
        }
    }

    public int aV(co co2) {
        return 200;
    }

    private boolean aqB() {
        if (this.dtc[0] == null) {
            return false;
        }
        co co2 = c.aeA().aM(this.dtc[0]);
        return co2 != null && (this.dtc[2] == null || this.dtc[2].aJ(co2) && (this.dtc[2].cWZ < this.YJ() && this.dtc[2].cWZ < this.dtc[2].aeb() || this.dtc[2].cWZ < co2.aeb()));
    }

    public void aqC() {
        if (this.aqB()) {
            co co2 = c.aeA().aM(this.dtc[0]);
            if (this.dtc[2] == null) {
                this.dtc[2] = co2.aeg();
            } else if (this.dtc[2].bP() == co2.bP()) {
                ++this.dtc[2].cWZ;
            }
            if (this.dtc[0].bP() == d.I(Blocks.cLx) && this.dtc[0].yc() == 1 && this.dtc[1] != null && this.dtc[1].bP() == Items.cQA) {
                this.dtc[1] = new co(Items.cQB);
            }
            --this.dtc[0].cWZ;
            if (this.dtc[0].cWZ <= 0) {
                this.dtc[0] = null;
            }
        }
    }

    public static int aW(co co2) {
        if (co2 == null) {
            return 0;
        }
        d d2 = co2.bP();
        if (d2 instanceof af && Block.f(d2) != Blocks.cLc) {
            Block block = Block.f(d2);
            if (block == Blocks.cNO) {
                return 150;
            }
            if (block.xb() == Material.ber) {
                return 300;
            }
            if (block == Blocks.cOC) {
                return 16000;
            }
        }
        return d2 instanceof cq && ((cq)d2).aex().equals("WOOD") ? 200 : (d2 instanceof cp && ((cp)d2).aex().equals("WOOD") ? 200 : (d2 instanceof bj && ((bj)d2).adZ().equals("WOOD") ? 200 : (d2 == Items.cPC ? 100 : (d2 == Items.cPl ? 1600 : (d2 == Items.cQC ? 20000 : (d2 == d.I(Blocks.cLi) ? 100 : (d2 == Items.cRz ? 2400 : 0)))))));
    }

    public static boolean aX(co co2) {
        return y.aW(co2) > 0;
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
        return n2 != 2 && (n2 != 1 || y.aX(co2) || am.am(co2));
    }

    @Override
    public int[] v(ao ao2) {
        return ao2 == ao.dwq ? dta : (ao2 == ao.dwr ? dsZ : dtb);
    }

    @Override
    public boolean a(int n2, co co2, ao ao2) {
        return this.h(n2, co2);
    }

    @Override
    public boolean b(int n2, co co2, ao ao2) {
        if (ao2 == ao.dwq && n2 == 1) {
            d d2 = co2.bP();
            return d2 == Items.cQB || d2 == Items.cQA;
        }
        return true;
    }

    @Override
    public String xX() {
        return "minecraft:furnace";
    }

    @Override
    public b a(g g2, a a2) {
        return new net.minecraft.inventory.n(g2, this);
    }

    @Override
    public int cx(int n2) {
        switch (n2) {
            case 0: {
                return this.dtd;
            }
            case 1: {
                return this.dte;
            }
            case 2: {
                return this.dtf;
            }
            case 3: {
                return this.dtg;
            }
        }
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.dtd = n3;
                break;
            }
            case 1: {
                this.dte = n3;
                break;
            }
            case 2: {
                this.dtf = n3;
                break;
            }
            case 3: {
                this.dtg = n3;
            }
        }
    }

    @Override
    public int IG() {
        return 4;
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.dtc.length; ++i2) {
            this.dtc[i2] = null;
        }
    }
}

