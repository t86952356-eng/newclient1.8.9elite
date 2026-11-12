/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

import hackclient.rise.bu;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.i;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.h;
import net.minecraft.entity.r;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ba;
import net.minecraft.util.cl;
import net.minecraft.util.s;
import net.minecraft.util.t;
import rise.util.InstanceAccess;

public class g
implements InstanceAccess,
ab {
    public co[] cJC = new co[36];
    public co[] cJD = new co[4];
    public int cJE;
    public int cJF;
    public boolean cJG;
    public a bij;
    private co jV;
    public boolean cJH;

    public g(a a2) {
        this.bij = a2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public co acE() {
        if (this.bij == Minecraft.getMinecraft().bgK) {
            this.d(bu.class);
            if (bu.bQ() >= 9) return null;
            this.d(bu.class);
            if (bu.bQ() < 0) return null;
            this.d(bu.class);
            co co2 = this.cJC[bu.bQ()];
            return co2;
        }
        if (this.cJE >= 9) return null;
        if (this.cJE < 0) return null;
        co co3 = this.cJC[this.cJE];
        return co3;
    }

    public co acF() {
        return this.cJE < 9 && this.cJE >= 0 ? this.cJC[this.cJE] : null;
    }

    public static int acG() {
        return 9;
    }

    private int m(d d2) {
        for (int i2 = 0; i2 < this.cJC.length; ++i2) {
            if (this.cJC[i2] == null || this.cJC[i2].bP() != d2) continue;
            return i2;
        }
        return -1;
    }

    private int e(d d2, int n2) {
        for (int i2 = 0; i2 < this.cJC.length; ++i2) {
            if (this.cJC[i2] == null || this.cJC[i2].bP() != d2 || this.cJC[i2].yc() != n2) continue;
            return i2;
        }
        return -1;
    }

    private int af(co co2) {
        for (int i2 = 0; i2 < this.cJC.length; ++i2) {
            if (this.cJC[i2] == null || this.cJC[i2].bP() != co2.bP() || !this.cJC[i2].aec() || this.cJC[i2].cWZ >= this.cJC[i2].aeb() || this.cJC[i2].cWZ >= this.YJ() || this.cJC[i2].ads() && this.cJC[i2].yc() != co2.yc() || !co.c(this.cJC[i2], co2)) continue;
            return i2;
        }
        return -1;
    }

    public int acH() {
        for (int i2 = 0; i2 < this.cJC.length; ++i2) {
            if (this.cJC[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    public void a(d d2, int n2, boolean bl2, boolean bl3) {
        int n3;
        co co2 = this.acF();
        int n4 = n3 = bl2 ? this.e(d2, n2) : this.m(d2);
        if (n3 >= 0 && n3 < 9) {
            this.cJE = n3;
        } else if (bl3 && d2 != null) {
            int n5 = this.acH();
            if (n5 >= 0 && n5 < 9) {
                this.cJE = n5;
            }
            if (co2 == null || !co2.aeq() || this.e(co2.bP(), co2.aef()) != this.cJE) {
                int n6;
                int n7 = this.e(d2, n2);
                if (n7 >= 0) {
                    n6 = this.cJC[n7].cWZ;
                    this.d(bu.class);
                    this.cJC[n7] = this.cJC[bu.bQ()];
                } else {
                    n6 = 1;
                }
                this.d(bu.class);
                this.cJC[bu.bQ()] = new co(d2, n6, n2);
            }
        }
    }

    public void fI(int n2) {
        if (n2 > 0) {
            n2 = 1;
        }
        if (n2 < 0) {
            n2 = -1;
        }
        this.cJE -= n2;
        while (this.cJE < 0) {
            this.cJE += 9;
        }
        while (this.cJE >= 9) {
            this.cJE -= 9;
        }
    }

    public int a(d d2, int n2, int n3, n n4) {
        int n5;
        co co2;
        int n6;
        int n7 = 0;
        for (n6 = 0; n6 < this.cJC.length; ++n6) {
            co2 = this.cJC[n6];
            if (co2 == null || d2 != null && co2.bP() != d2 || n2 > -1 && co2.yc() != n2 || n4 != null && !aa.a(n4, co2.aek(), true)) continue;
            n5 = n3 <= 0 ? co2.cWZ : Math.min(n3 - n7, co2.cWZ);
            n7 += n5;
            if (n3 == 0) continue;
            this.cJC[n6].cWZ -= n5;
            if (this.cJC[n6].cWZ == 0) {
                this.cJC[n6] = null;
            }
            if (n3 <= 0 || n7 < n3) continue;
            return n7;
        }
        for (n6 = 0; n6 < this.cJD.length; ++n6) {
            co2 = this.cJD[n6];
            if (co2 == null || d2 != null && co2.bP() != d2 || n2 > -1 && co2.yc() != n2 || n4 != null && !aa.a(n4, co2.aek(), false)) continue;
            n5 = n3 <= 0 ? co2.cWZ : Math.min(n3 - n7, co2.cWZ);
            n7 += n5;
            if (n3 == 0) continue;
            this.cJD[n6].cWZ -= n5;
            if (this.cJD[n6].cWZ == 0) {
                this.cJD[n6] = null;
            }
            if (n3 <= 0 || n7 < n3) continue;
            return n7;
        }
        if (this.jV != null) {
            if (d2 != null && this.jV.bP() != d2) {
                return n7;
            }
            if (n2 > -1 && this.jV.yc() != n2) {
                return n7;
            }
            if (n4 != null && !aa.a(n4, this.jV.aek(), false)) {
                return n7;
            }
            n6 = n3 <= 0 ? this.jV.cWZ : Math.min(n3 - n7, this.jV.cWZ);
            n7 += n6;
            if (n3 != 0) {
                this.jV.cWZ -= n6;
                if (this.jV.cWZ == 0) {
                    this.jV = null;
                }
                if (n3 > 0 && n7 >= n3) {
                    return n7;
                }
            }
        }
        return n7;
    }

    private int ag(co co2) {
        d d2 = co2.bP();
        int n2 = co2.cWZ;
        int n3 = this.af(co2);
        if (n3 < 0) {
            n3 = this.acH();
        }
        if (n3 < 0) {
            return n2;
        }
        if (this.cJC[n3] == null) {
            this.cJC[n3] = new co(d2, 0, co2.yc());
            if (co2.aej()) {
                this.cJC[n3].u((n)co2.aek().aeG());
            }
        }
        int n4 = n2;
        if (n2 > this.cJC[n3].aeb() - this.cJC[n3].cWZ) {
            n4 = this.cJC[n3].aeb() - this.cJC[n3].cWZ;
        }
        if (n4 > this.YJ() - this.cJC[n3].cWZ) {
            n4 = this.YJ() - this.cJC[n3].cWZ;
        }
        if (n4 == 0) {
            return n2;
        }
        this.cJC[n3].cWZ += n4;
        this.cJC[n3].cXc = 5;
        return n2 -= n4;
    }

    public void acI() {
        for (int i2 = 0; i2 < this.cJC.length; ++i2) {
            if (this.cJC[i2] == null) continue;
            this.cJC[i2].a(this.bij.baU, this.bij, i2, this.cJE == i2);
        }
    }

    public boolean n(d d2) {
        int n2 = this.m(d2);
        if (n2 < 0) {
            return false;
        }
        if (--this.cJC[n2].cWZ <= 0) {
            this.cJC[n2] = null;
        }
        return true;
    }

    public boolean o(d d2) {
        int n2 = this.m(d2);
        return n2 >= 0;
    }

    public boolean ah(co co2) {
        if (co2 != null && co2.cWZ != 0 && co2.bP() != null) {
            try {
                int n2;
                if (co2.aee()) {
                    int n3 = this.acH();
                    if (n3 >= 0) {
                        this.cJC[n3] = co.aK(co2);
                        this.cJC[n3].cXc = 5;
                        co2.cWZ = 0;
                        return true;
                    }
                    if (this.bij.cIt.cJM) {
                        co2.cWZ = 0;
                        return true;
                    }
                    return false;
                }
                do {
                    n2 = co2.cWZ;
                    co2.cWZ = this.ag(co2);
                } while (co2.cWZ > 0 && co2.cWZ < n2);
                if (co2.cWZ == n2 && this.bij.cIt.cJM) {
                    co2.cWZ = 0;
                    return true;
                }
                return co2.cWZ < n2;
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Adding item to inventory");
                i i2 = a2.dY("Item being added");
                i2.b("Item ID", d.p(co2.bP()));
                i2.b("Item data", co2.yc());
                i2.a("Item name", new h(this, co2));
                throw new cl(a2);
            }
        }
        return false;
    }

    @Override
    public co ap(int n2, int n3) {
        co[] coArray = this.cJC;
        if (n2 >= this.cJC.length) {
            coArray = this.cJD;
            n2 -= this.cJC.length;
        }
        if (coArray[n2] != null) {
            if (coArray[n2].cWZ <= n3) {
                co co2 = coArray[n2];
                coArray[n2] = null;
                return co2;
            }
            co co3 = coArray[n2].ge(n3);
            if (coArray[n2].cWZ == 0) {
                coArray[n2] = null;
            }
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        co[] coArray = this.cJC;
        if (n2 >= this.cJC.length) {
            coArray = this.cJD;
            n2 -= this.cJC.length;
        }
        if (coArray[n2] != null) {
            co co2 = coArray[n2];
            coArray[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        co[] coArray = this.cJC;
        if (n2 >= coArray.length) {
            n2 -= coArray.length;
            coArray = this.cJD;
        }
        coArray[n2] = co2;
    }

    public float G(Block block) {
        float f2 = 1.0f;
        this.d(bu.class);
        if (this.cJC[bu.bQ()] != null) {
            this.d(bu.class);
            f2 *= this.cJC[bu.bQ()].G(block);
        }
        return f2;
    }

    public v a(v v2) {
        n n2;
        int n3;
        for (n3 = 0; n3 < this.cJC.length; ++n3) {
            if (this.cJC[n3] == null) continue;
            n2 = new n();
            n2.a("Slot", (byte)n3);
            this.cJC[n3].t(n2);
            v2.a(n2);
        }
        for (n3 = 0; n3 < this.cJD.length; ++n3) {
            if (this.cJD[n3] == null) continue;
            n2 = new n();
            n2.a("Slot", (byte)(n3 + 100));
            this.cJD[n3].t(n2);
            v2.a(n2);
        }
        return v2;
    }

    public void b(v v2) {
        this.cJC = new co[36];
        this.cJD = new co[4];
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n2 = v2.gi(i2);
            int n3 = n2.eE("Slot") & 0xFF;
            co co2 = co.s(n2);
            if (co2 == null) continue;
            if (n3 >= 0 && n3 < this.cJC.length) {
                this.cJC[n3] = co2;
            }
            if (n3 < 100 || n3 >= this.cJD.length + 100) continue;
            this.cJD[n3 - 100] = co2;
        }
    }

    @Override
    public int YI() {
        return this.cJC.length + 4;
    }

    @Override
    public co fi(int n2) {
        co[] coArray = this.cJC;
        if (n2 >= coArray.length) {
            n2 -= coArray.length;
            coArray = this.cJD;
        }
        return coArray[n2];
    }

    @Override
    public String xU() {
        return "container.inventory";
    }

    @Override
    public boolean xV() {
        return false;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public int YJ() {
        return 64;
    }

    public boolean H(Block block) {
        if (block.xb().zF()) {
            return true;
        }
        this.d(bu.class);
        co co2 = bu.bO();
        return co2 != null && co2.F(block);
    }

    public co fJ(int n2) {
        return this.cJD[n2];
    }

    public int VQ() {
        int n2 = 0;
        for (co co2 : this.cJD) {
            if (co2 == null || !(co2.bP() instanceof y)) continue;
            int n3 = ((y)co2.bP()).cVI;
            n2 += n3;
        }
        return n2;
    }

    public void aZ(float f2) {
        if ((f2 /= 4.0f) < 1.0f) {
            f2 = 1.0f;
        }
        for (int i2 = 0; i2 < this.cJD.length; ++i2) {
            if (this.cJD[i2] == null || !(this.cJD[i2].bP() instanceof y)) continue;
            this.cJD[i2].b((int)f2, (r)this.bij);
            if (this.cJD[i2].cWZ != 0) continue;
            this.cJD[i2] = null;
        }
    }

    public void acJ() {
        int n2;
        for (n2 = 0; n2 < this.cJC.length; ++n2) {
            if (this.cJC[n2] == null) continue;
            this.bij.a(this.cJC[n2], true, false);
            this.cJC[n2] = null;
        }
        for (n2 = 0; n2 < this.cJD.length; ++n2) {
            if (this.cJD[n2] == null) continue;
            this.bij.a(this.cJD[n2], true, false);
            this.cJD[n2] = null;
        }
    }

    @Override
    public void Lw() {
        this.cJH = true;
    }

    public void e(co co2) {
        this.jV = co2;
    }

    public co bO() {
        return this.jV;
    }

    @Override
    public boolean v(a a2) {
        return !this.bij.csb && a2.T((c)this.bij) <= 64.0;
    }

    public boolean ai(co co2) {
        int n2;
        for (n2 = 0; n2 < this.cJD.length; ++n2) {
            if (this.cJD[n2] == null || !this.cJD[n2].aJ(co2)) continue;
            return true;
        }
        for (n2 = 0; n2 < this.cJC.length; ++n2) {
            if (this.cJC[n2] == null || !this.cJC[n2].aJ(co2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void w(a a2) {
    }

    @Override
    public void x(a a2) {
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    public void a(g g2) {
        int n2;
        for (n2 = 0; n2 < this.cJC.length; ++n2) {
            this.cJC[n2] = co.aK(g2.cJC[n2]);
        }
        for (n2 = 0; n2 < this.cJD.length; ++n2) {
            this.cJD[n2] = co.aK(g2.cJD[n2]);
        }
        this.cJE = g2.cJE;
    }

    @Override
    public int cx(int n2) {
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
    }

    @Override
    public int IG() {
        return 0;
    }

    @Override
    public void clear() {
        Arrays.fill(this.cJC, null);
        Arrays.fill(this.cJD, null);
    }
}

