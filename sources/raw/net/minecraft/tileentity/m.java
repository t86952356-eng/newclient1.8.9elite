/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ai;
import net.minecraft.inventory.h;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.aa;
import net.minecraft.tileentity.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bi;

public class m
extends aa
implements ab,
bi {
    private co[] dsw = new co[27];
    public boolean dsx;
    public m dsy;
    public m dsz;
    public m dsA;
    public m dsB;
    public float dsC;
    public float dsD;
    public int dsE;
    private int dsF;
    private int dsG;
    private String coX;

    public m() {
        this.dsG = -1;
    }

    public m(int n2) {
        this.dsG = n2;
    }

    @Override
    public int YI() {
        return 27;
    }

    @Override
    public co fi(int n2) {
        return this.dsw[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.dsw[n2] != null) {
            if (this.dsw[n2].cWZ <= n3) {
                co co2 = this.dsw[n2];
                this.dsw[n2] = null;
                this.Lw();
                return co2;
            }
            co co3 = this.dsw[n2].ge(n3);
            if (this.dsw[n2].cWZ == 0) {
                this.dsw[n2] = null;
            }
            this.Lw();
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.dsw[n2] != null) {
            co co2 = this.dsw[n2];
            this.dsw[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.dsw[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
        this.Lw();
    }

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.chest";
    }

    @Override
    public boolean xV() {
        return this.coX != null && this.coX.length() > 0;
    }

    public void es(String string) {
        this.coX = string;
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        v v2 = n2.D("Items", 10);
        this.dsw = new co[this.YI()];
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            int n4 = n3.eE("Slot") & 0xFF;
            if (n4 < 0 || n4 >= this.dsw.length) continue;
            this.dsw[n4] = co.s(n3);
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        v v2 = new v();
        for (int i2 = 0; i2 < this.dsw.length; ++i2) {
            if (this.dsw[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.dsw[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
        if (this.xV()) {
            n2.R("CustomName", this.coX);
        }
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public boolean v(net.minecraft.entity.player.a a2) {
        return this.baU.K(this.aZf) == this && a2.M((double)this.aZf.wt() + 0.5, (double)this.aZf.wu() + 0.5, (double)this.aZf.wx() + 0.5) <= 64.0;
    }

    @Override
    public void apU() {
        super.apU();
        this.dsx = false;
    }

    private void a(m m2, ao ao2) {
        if (m2.apR()) {
            this.dsx = false;
        } else if (this.dsx) {
            switch (ao2) {
                case dws: {
                    if (this.dsy == m2) break;
                    this.dsx = false;
                    break;
                }
                case dwt: {
                    if (this.dsB == m2) break;
                    this.dsx = false;
                    break;
                }
                case dwv: {
                    if (this.dsz == m2) break;
                    this.dsx = false;
                    break;
                }
                case dwu: {
                    if (this.dsA == m2) break;
                    this.dsx = false;
                }
            }
        }
    }

    public void aqt() {
        if (!this.dsx) {
            this.dsx = true;
            this.dsA = this.w(ao.dwu);
            this.dsz = this.w(ao.dwv);
            this.dsy = this.w(ao.dws);
            this.dsB = this.w(ao.dwt);
        }
    }

    protected m w(ao ao2) {
        d d2;
        b b2 = this.aZf.x(ao2);
        if (this.aq(b2) && (d2 = this.baU.K(b2)) instanceof m) {
            m m2 = (m)d2;
            m2.a(this, ao2.asC());
            return m2;
        }
        return null;
    }

    private boolean aq(b b2) {
        if (this.baU == null) {
            return false;
        }
        Block block = this.baU.L(b2).df();
        return block instanceof BlockChest && ((BlockChest)block).aTt == this.aqu();
    }

    @Override
    public void jA() {
        float f2;
        this.aqt();
        int n2 = this.aZf.wt();
        int n3 = this.aZf.wu();
        int n4 = this.aZf.wx();
        ++this.dsF;
        if (!this.baU.dDw && this.dsE != 0 && (this.dsF + n2 + n3 + n4) % 200 == 0) {
            this.dsE = 0;
            f2 = 5.0f;
            for (net.minecraft.entity.player.a a2 : this.baU.a(net.minecraft.entity.player.a.class, new a((float)n2 - 5.0f, (float)n3 - 5.0f, (float)n4 - 5.0f, (float)(n2 + 1) + 5.0f, (float)(n3 + 1) + 5.0f, (float)(n4 + 1) + 5.0f))) {
                ab ab2;
                if (!(a2.cHY instanceof h) || (ab2 = ((h)a2.cHY).adf()) != this && (!(ab2 instanceof ai) || !((ai)ab2).d(this))) continue;
                ++this.dsE;
            }
        }
        this.dsD = this.dsC;
        f2 = 0.1f;
        if (this.dsE > 0 && this.dsC == 0.0f && this.dsy == null && this.dsA == null) {
            double d2 = (double)n2 + 0.5;
            double d3 = (double)n4 + 0.5;
            if (this.dsB != null) {
                d3 += 0.5;
            }
            if (this.dsz != null) {
                d2 += 0.5;
            }
            this.baU.a(d2, (double)n3 + 0.5, d3, "random.chestopen", 0.5f, this.baU.dDk.nextFloat() * 0.1f + 0.9f);
        }
        if (this.dsE == 0 && this.dsC > 0.0f || this.dsE > 0 && this.dsC < 1.0f) {
            float f3 = this.dsC;
            this.dsC = this.dsE > 0 ? (this.dsC += 0.1f) : (this.dsC -= 0.1f);
            if (this.dsC > 1.0f) {
                this.dsC = 1.0f;
            }
            float f4 = 0.5f;
            if (this.dsC < 0.5f && f3 >= 0.5f && this.dsy == null && this.dsA == null) {
                double d4 = (double)n2 + 0.5;
                double d5 = (double)n4 + 0.5;
                if (this.dsB != null) {
                    d5 += 0.5;
                }
                if (this.dsz != null) {
                    d4 += 0.5;
                }
                this.baU.a(d4, (double)n3 + 0.5, d5, "random.chestclosed", 0.5f, this.baU.dDk.nextFloat() * 0.1f + 0.9f);
            }
            if (this.dsC < 0.0f) {
                this.dsC = 0.0f;
            }
        }
    }

    @Override
    public boolean aC(int n2, int n3) {
        if (n2 == 1) {
            this.dsE = n3;
            return true;
        }
        return super.aC(n2, n3);
    }

    @Override
    public void w(net.minecraft.entity.player.a a2) {
        if (!a2.CZ()) {
            if (this.dsE < 0) {
                this.dsE = 0;
            }
            ++this.dsE;
            this.baU.c(this.aZf, this.ahl(), 1, this.dsE);
            this.baU.c(this.aZf, this.ahl());
            this.baU.c(this.aZf.aqY(), this.ahl());
        }
    }

    @Override
    public void x(net.minecraft.entity.player.a a2) {
        if (!a2.CZ() && this.ahl() instanceof BlockChest) {
            --this.dsE;
            this.baU.c(this.aZf, this.ahl(), 1, this.dsE);
            this.baU.c(this.aZf, this.ahl());
            this.baU.c(this.aZf.aqY(), this.ahl());
        }
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    @Override
    public void apS() {
        super.apS();
        this.apU();
        this.aqt();
    }

    public int aqu() {
        if (this.dsG == -1) {
            if (this.baU == null || !(this.ahl() instanceof BlockChest)) {
                return 0;
            }
            this.dsG = ((BlockChest)this.ahl()).aTt;
        }
        return this.dsG;
    }

    @Override
    public String xX() {
        return "minecraft:chest";
    }

    @Override
    public net.minecraft.inventory.b a(g g2, net.minecraft.entity.player.a a2) {
        return new h(g2, this, a2);
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
        for (int i2 = 0; i2 < this.dsw.length; ++i2) {
            this.dsw[i2] = null;
        }
    }
}

