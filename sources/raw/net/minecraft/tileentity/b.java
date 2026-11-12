/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.n;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.nbt.g;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.c;
import net.minecraft.util.a;
import net.minecraft.util.as;
import net.minecraft.util.ct;
import net.minecraft.util.de;
import net.minecraft.world.w;

public abstract class b {
    private int dqM = 20;
    private String dqN = "Pig";
    private final List<c> dqO = Lists.newArrayList();
    private c dqP;
    private double dqQ;
    private double dqR;
    private int dqS = 200;
    private int dqT = 800;
    private int dqU = 4;
    private net.minecraft.entity.c dqV;
    private int dqW = 6;
    private int dqX = 16;
    private int dqY = 4;

    private String apG() {
        if (this.apK() == null) {
            if (this.dqN != null && this.dqN.equals("Minecart")) {
                this.dqN = "MinecartRideable";
            }
            return this.dqN;
        }
        return this.apK().dra;
    }

    public void fW(String string) {
        this.dqN = string;
    }

    private boolean apH() {
        net.minecraft.util.b b2 = this.Xk();
        return this.Xj().p((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, this.dqX);
    }

    public void apI() {
        if (this.apH()) {
            net.minecraft.util.b b2 = this.Xk();
            if (this.Xj().dDw) {
                double d2 = (float)b2.wt() + this.Xj().dDk.nextFloat();
                double d3 = (float)b2.wu() + this.Xj().dDk.nextFloat();
                double d4 = (float)b2.wx() + this.Xj().dDk.nextFloat();
                this.Xj().a(as.dxh, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                this.Xj().a(as.dxw, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                if (this.dqM > 0) {
                    --this.dqM;
                }
                this.dqR = this.dqQ;
                this.dqQ = (this.dqQ + (double)(1000.0f / ((float)this.dqM + 200.0f))) % 360.0;
            } else {
                if (this.dqM == -1) {
                    this.apJ();
                }
                if (this.dqM > 0) {
                    --this.dqM;
                    return;
                }
                boolean bl2 = false;
                for (int i2 = 0; i2 < this.dqU; ++i2) {
                    net.minecraft.entity.c c2 = n.a(this.apG(), this.Xj());
                    if (c2 == null) {
                        return;
                    }
                    int n2 = this.Xj().a(c2.getClass(), new a(b2.wt(), b2.wu(), b2.wx(), b2.wt() + 1, b2.wu() + 1, b2.wx() + 1).ad(this.dqY, this.dqY, this.dqY)).size();
                    if (n2 >= this.dqW) {
                        this.apJ();
                        return;
                    }
                    double d5 = (double)b2.wt() + (this.Xj().dDk.nextDouble() - this.Xj().dDk.nextDouble()) * (double)this.dqY + 0.5;
                    double d6 = b2.wu() + this.Xj().dDk.nextInt(3) - 1;
                    double d7 = (double)b2.wx() + (this.Xj().dDk.nextDouble() - this.Xj().dDk.nextDouble()) * (double)this.dqY + 0.5;
                    p p2 = c2 instanceof p ? (p)c2 : null;
                    c2.b(d5, d6, d7, this.Xj().dDk.nextFloat() * 360.0f, 0.0f);
                    if (p2 != null && (!p2.UB() || !p2.Vh())) continue;
                    this.c(c2, true);
                    this.Xj().e(2004, b2, 0);
                    if (p2 != null) {
                        p2.Va();
                    }
                    bl2 = true;
                }
                if (bl2) {
                    this.apJ();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private net.minecraft.entity.c c(net.minecraft.entity.c c2, boolean bl2) {
        if (this.apK() != null) {
            Object object;
            Object object3 = new net.minecraft.nbt.n();
            c2.k((net.minecraft.nbt.n)object3);
            for (String object22 : this.apK().dqZ.aeQ()) {
                object = this.apK().dqZ.eB(object22);
                ((net.minecraft.nbt.n)object3).b(object22, ((g)object).aeG());
            }
            c2.a((net.minecraft.nbt.n)object3);
            if (c2.baU != null && bl2) {
                c2.baU.G(c2);
            }
            net.minecraft.entity.c c3 = c2;
            while (((net.minecraft.nbt.n)object3).C("Riding", 10)) {
                net.minecraft.nbt.n n2 = ((net.minecraft.nbt.n)object3).eN("Riding");
                object = n.a(n2.eK("id"), c2.baU);
                if (object != null) {
                    void var5_7;
                    net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
                    ((net.minecraft.entity.c)object).k(n3);
                    for (String string : n2.aeQ()) {
                        g g2 = n2.eB(string);
                        n3.b(string, g2.aeG());
                    }
                    ((net.minecraft.entity.c)object).a(n3);
                    ((net.minecraft.entity.c)object).b(var5_7.gW, var5_7.gX, var5_7.gY, var5_7.pl, var5_7.pm);
                    if (c2.baU != null && bl2) {
                        c2.baU.G((net.minecraft.entity.c)object);
                    }
                    var5_7.D((net.minecraft.entity.c)object);
                }
                Object object2 = object;
                object3 = n2;
            }
        } else if (c2 instanceof r && c2.baU != null && bl2) {
            if (c2 instanceof p) {
                ((p)c2).a(c2.baU.bg(new net.minecraft.util.b(c2)), null);
            }
            c2.baU.G(c2);
        }
        return c2;
    }

    private void apJ() {
        if (this.dqT <= this.dqS) {
            this.dqM = this.dqS;
        } else {
            int n2 = this.dqT - this.dqS;
            this.dqM = this.dqS + this.Xj().dDk.nextInt(n2);
        }
        if (this.dqO.size() > 0) {
            this.a(de.a(this.Xj().dDk, this.dqO));
        }
        this.eQ(1);
    }

    public void a(net.minecraft.nbt.n n2) {
        this.dqN = n2.eK("EntityId");
        this.dqM = n2.eF("Delay");
        this.dqO.clear();
        if (n2.C("SpawnPotentials", 9)) {
            v v2 = n2.D("SpawnPotentials", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                this.dqO.add(new c(this, v2.gi(i2)));
            }
        }
        if (n2.C("SpawnData", 10)) {
            this.a(new c(this, n2.eN("SpawnData"), this.dqN));
        } else {
            this.a((c)null);
        }
        if (n2.C("MinSpawnDelay", 99)) {
            this.dqS = n2.eF("MinSpawnDelay");
            this.dqT = n2.eF("MaxSpawnDelay");
            this.dqU = n2.eF("SpawnCount");
        }
        if (n2.C("MaxNearbyEntities", 99)) {
            this.dqW = n2.eF("MaxNearbyEntities");
            this.dqX = n2.eF("RequiredPlayerRange");
        }
        if (n2.C("SpawnRange", 99)) {
            this.dqY = n2.eF("SpawnRange");
        }
        if (this.Xj() != null) {
            this.dqV = null;
        }
    }

    public void b(net.minecraft.nbt.n n2) {
        String string = this.apG();
        if (!ct.cU(string)) {
            n2.R("EntityId", string);
            n2.a("Delay", (short)this.dqM);
            n2.a("MinSpawnDelay", (short)this.dqS);
            n2.a("MaxSpawnDelay", (short)this.dqT);
            n2.a("SpawnCount", (short)this.dqU);
            n2.a("MaxNearbyEntities", (short)this.dqW);
            n2.a("RequiredPlayerRange", (short)this.dqX);
            n2.a("SpawnRange", (short)this.dqY);
            if (this.apK() != null) {
                n2.b("SpawnData", this.apK().dqZ.aeG());
            }
            if (this.apK() != null || this.dqO.size() > 0) {
                v v2 = new v();
                if (this.dqO.size() > 0) {
                    for (c c2 : this.dqO) {
                        v2.a(c2.apN());
                    }
                } else {
                    v2.a(this.apK().apN());
                }
                n2.b("SpawnPotentials", v2);
            }
        }
    }

    public net.minecraft.entity.c m(w w2) {
        net.minecraft.entity.c c2;
        if (this.dqV == null && (c2 = n.a(this.apG(), w2)) != null) {
            this.dqV = c2 = this.c(c2, false);
        }
        return this.dqV;
    }

    public boolean hk(int n2) {
        if (n2 == 1 && this.Xj().dDw) {
            this.dqM = this.dqS;
            return true;
        }
        return false;
    }

    private c apK() {
        return this.dqP;
    }

    public void a(c c2) {
        this.dqP = c2;
    }

    public abstract void eQ(int var1);

    public abstract w Xj();

    public abstract net.minecraft.util.b Xk();

    public double apL() {
        return this.dqQ;
    }

    public double apM() {
        return this.dqR;
    }
}

