/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.tileentity;

import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockHopper;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ac;
import net.minecraft.inventory.o;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.a;
import net.minecraft.tileentity.aa;
import net.minecraft.tileentity.m;
import net.minecraft.util.ah;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bi;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class z
extends aa
implements a,
bi {
    private co[] dti = new co[5];
    private String coX;
    private int dtj = -1;

    @Override
    public void a(n n2) {
        super.a(n2);
        v v2 = n2.D("Items", 10);
        this.dti = new co[this.YI()];
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
        this.dtj = n2.eG("TransferCooldown");
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            byte by2 = n3.eE("Slot");
            if (by2 < 0 || by2 >= this.dti.length) continue;
            this.dti[by2] = co.s(n3);
        }
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        v v2 = new v();
        for (int i2 = 0; i2 < this.dti.length; ++i2) {
            if (this.dti[i2] == null) continue;
            n n3 = new n();
            n3.a("Slot", (byte)i2);
            this.dti[i2].t(n3);
            v2.a(n3);
        }
        n2.b("Items", v2);
        n2.B("TransferCooldown", this.dtj);
        if (this.xV()) {
            n2.R("CustomName", this.coX);
        }
    }

    @Override
    public void Lw() {
        super.Lw();
    }

    @Override
    public int YI() {
        return this.dti.length;
    }

    @Override
    public co fi(int n2) {
        return this.dti[n2];
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.dti[n2] != null) {
            if (this.dti[n2].cWZ <= n3) {
                co co2 = this.dti[n2];
                this.dti[n2] = null;
                return co2;
            }
            co co3 = this.dti[n2].ge(n3);
            if (this.dti[n2].cWZ == 0) {
                this.dti[n2] = null;
            }
            return co3;
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (this.dti[n2] != null) {
            co co2 = this.dti[n2];
            this.dti[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.dti[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
    }

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.hopper";
    }

    @Override
    public boolean xV() {
        return this.coX != null && this.coX.length() > 0;
    }

    public void es(String string) {
        this.coX = string;
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
    public void w(net.minecraft.entity.player.a a2) {
    }

    @Override
    public void x(net.minecraft.entity.player.a a2) {
    }

    @Override
    public boolean h(int n2, co co2) {
        return true;
    }

    @Override
    public void jA() {
        if (this.baU != null && !this.baU.dDw) {
            --this.dtj;
            if (!this.aqG()) {
                this.hn(0);
                this.aqD();
            }
        }
    }

    public boolean aqD() {
        if (this.baU != null && !this.baU.dDw) {
            if (!this.aqG() && BlockHopper.aX(this.zg())) {
                boolean bl2 = false;
                if (!this.isEmpty()) {
                    bl2 = this.aqE();
                }
                if (!this.sg()) {
                    boolean bl3 = bl2 = z.a(this) || bl2;
                }
                if (bl2) {
                    this.hn(8);
                    this.Lw();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean isEmpty() {
        for (co co2 : this.dti) {
            if (co2 == null) continue;
            return false;
        }
        return true;
    }

    private boolean sg() {
        for (co co2 : this.dti) {
            if (co2 != null && co2.cWZ == co2.aeb()) continue;
            return false;
        }
        return true;
    }

    private boolean aqE() {
        ab ab2 = this.aqF();
        if (ab2 == null) {
            return false;
        }
        ao ao2 = BlockHopper.aQ(this.zg()).asC();
        if (this.a(ab2, ao2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.YI(); ++i2) {
            if (this.fi(i2) == null) continue;
            co co2 = this.fi(i2).aeg();
            co co3 = z.a(ab2, this.ap(i2, 1), ao2);
            if (co3 == null || co3.cWZ == 0) {
                ab2.Lw();
                return true;
            }
            this.g(i2, co2);
        }
        return false;
    }

    private boolean a(ab ab2, ao ao2) {
        if (ab2 instanceof ac) {
            ac ac2 = (ac)ab2;
            int[] nArray = ac2.v(ao2);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                co co2 = ac2.fi(nArray[i2]);
                if (co2 != null && co2.cWZ == co2.aeb()) continue;
                return false;
            }
        } else {
            int n2 = ab2.YI();
            for (int i3 = 0; i3 < n2; ++i3) {
                co co3 = ab2.fi(i3);
                if (co3 != null && co3.cWZ == co3.aeb()) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean b(ab ab2, ao ao2) {
        if (ab2 instanceof ac) {
            ac ac2 = (ac)ab2;
            int[] nArray = ac2.v(ao2);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                if (ac2.fi(nArray[i2]) == null) continue;
                return false;
            }
        } else {
            int n2 = ab2.YI();
            for (int i3 = 0; i3 < n2; ++i3) {
                if (ab2.fi(i3) == null) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean a(a a2) {
        ab ab2 = z.b(a2);
        if (ab2 != null) {
            ao ao2 = ao.dwq;
            if (z.b(ab2, ao2)) {
                return false;
            }
            if (ab2 instanceof ac) {
                ac ac2 = (ac)ab2;
                int[] nArray = ac2.v(ao2);
                for (int i2 = 0; i2 < nArray.length; ++i2) {
                    if (!z.a(a2, ab2, nArray[i2], ao2)) continue;
                    return true;
                }
            } else {
                int n2 = ab2.YI();
                for (int i3 = 0; i3 < n2; ++i3) {
                    if (!z.a(a2, ab2, i3, ao2)) continue;
                    return true;
                }
            }
        } else {
            for (i i4 : z.a(a2.de(), a2.YM(), a2.YN() + 1.0, a2.YO())) {
                if (!z.a(a2, i4)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean a(a a2, ab ab2, int n2, ao ao2) {
        co co2 = ab2.fi(n2);
        if (co2 != null && z.b(ab2, co2, n2, ao2)) {
            co co3 = co2.aeg();
            co co4 = z.a(a2, ab2.ap(n2, 1), null);
            if (co4 == null || co4.cWZ == 0) {
                ab2.Lw();
                return true;
            }
            ab2.g(n2, co3);
        }
        return false;
    }

    public static boolean a(ab ab2, i i2) {
        boolean bl2 = false;
        if (i2 == null) {
            return false;
        }
        co co2 = i2.Yk().aeg();
        co co3 = z.a(ab2, co2, null);
        if (co3 != null && co3.cWZ != 0) {
            i2.Z(co3);
        } else {
            bl2 = true;
            i2.Tt();
        }
        return bl2;
    }

    public static co a(ab ab2, co co2, ao ao2) {
        if (ab2 instanceof ac && ao2 != null) {
            ac ac2 = (ac)ab2;
            int[] nArray = ac2.v(ao2);
            for (int i2 = 0; i2 < nArray.length && co2 != null && co2.cWZ > 0; ++i2) {
                co2 = z.c(ab2, co2, nArray[i2], ao2);
            }
        } else {
            int n2 = ab2.YI();
            for (int i3 = 0; i3 < n2 && co2 != null && co2.cWZ > 0; ++i3) {
                co2 = z.c(ab2, co2, i3, ao2);
            }
        }
        if (co2 != null && co2.cWZ == 0) {
            co2 = null;
        }
        return co2;
    }

    private static boolean a(ab ab2, co co2, int n2, ao ao2) {
        return ab2.h(n2, co2) && (!(ab2 instanceof ac) || ((ac)ab2).a(n2, co2, ao2));
    }

    private static boolean b(ab ab2, co co2, int n2, ao ao2) {
        return !(ab2 instanceof ac) || ((ac)ab2).b(n2, co2, ao2);
    }

    private static co c(ab ab2, co co2, int n2, ao ao2) {
        co co3 = ab2.fi(n2);
        if (z.a(ab2, co2, n2, ao2)) {
            boolean bl2 = false;
            if (co3 == null) {
                ab2.g(n2, co2);
                co2 = null;
                bl2 = true;
            } else if (z.g(co3, co2)) {
                int n3 = co2.aeb() - co3.cWZ;
                int n4 = Math.min(co2.cWZ, n3);
                co2.cWZ -= n4;
                co3.cWZ += n4;
                boolean bl3 = bl2 = n4 > 0;
            }
            if (bl2) {
                if (ab2 instanceof z) {
                    z z2 = (z)ab2;
                    if (z2.aqH()) {
                        z2.hn(8);
                    }
                    ab2.Lw();
                }
                ab2.Lw();
            }
        }
        return co2;
    }

    private ab aqF() {
        ao ao2 = BlockHopper.aQ(this.zg());
        return z.b(this.de(), this.aZf.wt() + ao2.asH(), (double)(this.aZf.wu() + ao2.asI()), this.aZf.wx() + ao2.asJ());
    }

    public static ab b(a a2) {
        return z.b(a2.de(), a2.YM(), a2.YN() + 1.0, a2.YO());
    }

    public static List<i> a(w w2, double d2, double d3, double d4) {
        return w2.a(i.class, new net.minecraft.util.a(d2 - 0.5, d3 - 0.5, d4 - 0.5, d2 + 0.5, d3 + 0.5, d4 + 0.5), ah.dvG);
    }

    public static ab b(w w2, double d2, double d3, double d4) {
        Object object;
        int n2;
        int n3;
        ab ab2 = null;
        int n4 = bt.aF(d2);
        b b2 = new b(n4, n3 = bt.aF(d3), n2 = bt.aF(d4));
        Block block = w2.L(b2).df();
        if (block.xj() && (object = w2.K(b2)) instanceof ab && (ab2 = (ab)object) instanceof m && block instanceof BlockChest) {
            ab2 = ((BlockChest)block).r(w2, b2);
        }
        if (ab2 == null && (object = w2.a((c)null, new net.minecraft.util.a(d2 - 0.5, d3 - 0.5, d4 - 0.5, d2 + 0.5, d3 + 0.5, d4 + 0.5), (Predicate<? super c>)ah.dvI)).size() > 0) {
            ab2 = (ab)object.get(w2.dDk.nextInt(object.size()));
        }
        return ab2;
    }

    private static boolean g(co co2, co co3) {
        return co2.bP() == co3.bP() && co2.yc() == co3.yc() && co2.cWZ <= co2.aeb() && co.c(co2, co3);
    }

    @Override
    public double YM() {
        return (double)this.aZf.wt() + 0.5;
    }

    @Override
    public double YN() {
        return (double)this.aZf.wu() + 0.5;
    }

    @Override
    public double YO() {
        return (double)this.aZf.wx() + 0.5;
    }

    public void hn(int n2) {
        this.dtj = n2;
    }

    public boolean aqG() {
        return this.dtj > 0;
    }

    public boolean aqH() {
        return this.dtj <= 1;
    }

    @Override
    public String xX() {
        return "minecraft:hopper";
    }

    @Override
    public net.minecraft.inventory.b a(g g2, net.minecraft.entity.player.a a2) {
        return new o(g2, this, a2);
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
        for (int i2 = 0; i2 < this.dti.length; ++i2) {
            this.dti[i2] = null;
        }
    }
}

