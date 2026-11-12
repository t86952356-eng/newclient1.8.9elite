/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.inventory;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.inventory.aa;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;

public class ad
implements ab {
    private String cTO;
    private final int cTP;
    private final co[] cTQ;
    private List<aa> cTR;
    private boolean cTS;

    public ad(String string, boolean bl2, int n2) {
        this.cTO = string;
        this.cTS = bl2;
        this.cTP = n2;
        this.cTQ = new co[n2];
    }

    public ad(ba ba2, int n2) {
        this(ba2.arq(), true, n2);
    }

    public void a(aa aa2) {
        if (this.cTR == null) {
            this.cTR = Lists.newArrayList();
        }
        this.cTR.add(aa2);
    }

    public void b(aa aa2) {
        this.cTR.remove(aa2);
    }

    @Override
    public co fi(int n2) {
        return n2 >= 0 && n2 < this.cTQ.length ? this.cTQ[n2] : null;
    }

    @Override
    public co ap(int n2, int n3) {
        if (this.cTQ[n2] != null) {
            if (this.cTQ[n2].cWZ <= n3) {
                co co2 = this.cTQ[n2];
                this.cTQ[n2] = null;
                this.Lw();
                return co2;
            }
            co co3 = this.cTQ[n2].ge(n3);
            if (this.cTQ[n2].cWZ == 0) {
                this.cTQ[n2] = null;
            }
            this.Lw();
            return co3;
        }
        return null;
    }

    public co ak(co co2) {
        co co3 = co2.aeg();
        for (int i2 = 0; i2 < this.cTP; ++i2) {
            int n2;
            int n3;
            co co4 = this.fi(i2);
            if (co4 == null) {
                this.g(i2, co3);
                this.Lw();
                return null;
            }
            if (!co.e(co4, co3) || (n3 = Math.min(co3.cWZ, (n2 = Math.min(this.YJ(), co4.aeb())) - co4.cWZ)) <= 0) continue;
            co4.cWZ += n3;
            co3.cWZ -= n3;
            if (co3.cWZ > 0) continue;
            this.Lw();
            return null;
        }
        if (co3.cWZ != co2.cWZ) {
            this.Lw();
        }
        return co3;
    }

    @Override
    public co fj(int n2) {
        if (this.cTQ[n2] != null) {
            co co2 = this.cTQ[n2];
            this.cTQ[n2] = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        this.cTQ[n2] = co2;
        if (co2 != null && co2.cWZ > this.YJ()) {
            co2.cWZ = this.YJ();
        }
        this.Lw();
    }

    @Override
    public int YI() {
        return this.cTP;
    }

    @Override
    public String xU() {
        return this.cTO;
    }

    @Override
    public boolean xV() {
        return this.cTS;
    }

    public void es(String string) {
        this.cTS = true;
        this.cTO = string;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public int YJ() {
        return 64;
    }

    @Override
    public void Lw() {
        if (this.cTR != null) {
            for (int i2 = 0; i2 < this.cTR.size(); ++i2) {
                this.cTR.get(i2).a(this);
            }
        }
    }

    @Override
    public boolean v(a a2) {
        return true;
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
        for (int i2 = 0; i2 < this.cTQ.length; ++i2) {
            this.cTQ[i2] = null;
        }
    }
}

