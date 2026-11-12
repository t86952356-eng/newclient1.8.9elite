/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.bi;

public class ae
extends d
implements bi {
    private IBlockState dtp;
    private ao dtq;
    private boolean dtr;
    private boolean dts;
    private float dtt;
    private float dtu;
    private final List<c> dtv = Lists.newArrayList();

    public ae() {
    }

    public ae(IBlockState iBlockState, ao ao2, boolean bl2, boolean bl3) {
        this.dtp = iBlockState;
        this.dtq = ao2;
        this.dtr = bl2;
        this.dts = bl3;
    }

    public IBlockState aqK() {
        return this.dtp;
    }

    @Override
    public int zg() {
        return 0;
    }

    public boolean aqL() {
        return this.dtr;
    }

    public ao yx() {
        return this.dtq;
    }

    public boolean aqM() {
        return this.dts;
    }

    public float bF(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return this.dtu + (this.dtt - this.dtu) * f2;
    }

    public float bG(float f2) {
        return this.dtr ? (this.bF(f2) - 1.0f) * (float)this.dtq.asH() : (1.0f - this.bF(f2)) * (float)this.dtq.asH();
    }

    public float bH(float f2) {
        return this.dtr ? (this.bF(f2) - 1.0f) * (float)this.dtq.asI() : (1.0f - this.bF(f2)) * (float)this.dtq.asI();
    }

    public float bI(float f2) {
        return this.dtr ? (this.bF(f2) - 1.0f) * (float)this.dtq.asJ() : (1.0f - this.bF(f2)) * (float)this.dtq.asJ();
    }

    private void w(float f2, float f3) {
        List<c> list;
        f2 = this.dtr ? 1.0f - f2 : (f2 -= 1.0f);
        a a2 = Blocks.cLO.a(this.baU, this.aZf, this.dtp, f2, this.dtq);
        if (a2 != null && !(list = this.baU.b((c)null, a2)).isEmpty()) {
            this.dtv.addAll(list);
            for (c c2 : this.dtv) {
                if (this.dtp.df() == Blocks.cOG && this.dtr) {
                    switch (this.dtq.asL()) {
                        case dwH: {
                            c2.ud = this.dtq.asH();
                            break;
                        }
                        case dwI: {
                            c2.ue = this.dtq.asI();
                            break;
                        }
                        case dwJ: {
                            c2.uf = this.dtq.asJ();
                        }
                    }
                    continue;
                }
                c2.y(f3 * (float)this.dtq.asH(), f3 * (float)this.dtq.asI(), f3 * (float)this.dtq.asJ());
            }
            this.dtv.clear();
        }
    }

    public void aqN() {
        if (this.dtu < 1.0f && this.baU != null) {
            this.dtt = 1.0f;
            this.dtu = 1.0f;
            this.baU.aU(this.aZf);
            this.apS();
            if (this.baU.L(this.aZf).df() == Blocks.cLO) {
                this.baU.a(this.aZf, this.dtp, 3);
                this.baU.d(this.aZf, this.dtp.df());
            }
        }
    }

    @Override
    public void jA() {
        this.dtu = this.dtt;
        if (this.dtu >= 1.0f) {
            this.w(1.0f, 0.25f);
            this.baU.aU(this.aZf);
            this.apS();
            if (this.baU.L(this.aZf).df() == Blocks.cLO) {
                this.baU.a(this.aZf, this.dtp, 3);
                this.baU.d(this.aZf, this.dtp.df());
            }
        } else {
            this.dtt += 0.5f;
            if (this.dtt >= 1.0f) {
                this.dtt = 1.0f;
            }
            if (this.dtr) {
                this.w(this.dtt, this.dtt - this.dtu + 0.0625f);
            }
        }
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dtp = Block.aK(n2.eG("blockId")).aM(n2.eG("blockData"));
        this.dtq = ao.hy(n2.eG("facing"));
        this.dtu = this.dtt = n2.eI("progress");
        this.dtr = n2.eO("extending");
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.B("blockId", Block.i(this.dtp.df()));
        n2.B("blockData", this.dtp.df().c(this.dtp));
        n2.B("facing", this.dtq.OY());
        n2.a("progress", this.dtu);
        n2.o("extending", this.dtr);
    }
}

