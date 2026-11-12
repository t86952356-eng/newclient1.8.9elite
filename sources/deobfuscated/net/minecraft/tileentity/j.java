/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.u;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.c;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bf;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.tileentity.aa;
import net.minecraft.tileentity.k;
import net.minecraft.util.b;
import net.minecraft.util.bi;
import net.minecraft.util.g;

public class j
extends aa
implements ab,
bi {
    public static final a[][] dsh = new a[][]{{a.dgw, a.dgy}, {a.dgG, a.dgD}, {a.dgA}, {a.dgF}};
    private final List<k> dsi = Lists.newArrayList();
    private long dsj;
    private float dsk;
    private boolean dsl;
    private int dsm = -1;
    private int dsn;
    private int dso;
    private co dsp;
    private String coX;

    @Override
    public void jA() {
        if (this.baU.getTotalWorldTime() % 80L == 0L) {
            this.aqj();
        }
    }

    public void aqj() {
        this.aql();
        this.aqk();
    }

    private void aqk() {
        if (this.dsl && this.dsm > 0 && !this.baU.dDw && this.dsn > 0) {
            double d2 = this.dsm * 10 + 10;
            int n2 = 0;
            if (this.dsm >= 4 && this.dsn == this.dso) {
                n2 = 1;
            }
            int n3 = this.aZf.wt();
            int n4 = this.aZf.wu();
            int n5 = this.aZf.wx();
            net.minecraft.util.a a2 = new net.minecraft.util.a(n3, n4, n5, n3 + 1, n4 + 1, n5 + 1).ad(d2, d2, d2).ac(0.0, this.baU.getHeight(), 0.0);
            List<net.minecraft.entity.player.a> list = this.baU.a(net.minecraft.entity.player.a.class, a2);
            for (net.minecraft.entity.player.a a3 : list) {
                a3.b(new d(this.dsn, 180, n2, true, true));
            }
            if (this.dsm >= 4 && this.dsn != this.dso && this.dso > 0) {
                for (net.minecraft.entity.player.a a3 : list) {
                    a3.b(new d(this.dso, 180, 0, true, true));
                }
            }
        }
    }

    private void aql() {
        int n2;
        int n3 = this.dsm;
        int n4 = this.aZf.wt();
        int n5 = this.aZf.wu();
        int n6 = this.aZf.wx();
        this.dsm = 0;
        this.dsi.clear();
        this.dsl = true;
        k k2 = new k(u.a(net.minecraft.item.b.cUC));
        this.dsi.add(k2);
        boolean bl2 = true;
        g g2 = new g();
        for (n2 = n5 + 1; n2 < 256; ++n2) {
            float[] bl3;
            IBlockState object = this.baU.L(g2.E(n4, n2, n6));
            if (object.df() == Blocks.cOI) {
                bl3 = u.a(object.b(BlockStainedGlass.baX));
            } else {
                if (object.df() != Blocks.cOJ) {
                    if (object.df().wX() >= 15 && object.df() != Blocks.cLj) {
                        this.dsl = false;
                        this.dsi.clear();
                        break;
                    }
                    k2.aqo();
                    continue;
                }
                bl3 = u.a(object.b(BlockStainedGlassPane.baY));
            }
            if (!bl2) {
                bl3 = new float[]{(k2.aqp()[0] + bl3[0]) / 2.0f, (k2.aqp()[1] + bl3[1]) / 2.0f, (k2.aqp()[2] + bl3[2]) / 2.0f};
            }
            if (Arrays.equals(bl3, k2.aqp())) {
                k2.aqo();
            } else {
                k2 = new k(bl3);
                this.dsi.add(k2);
            }
            bl2 = false;
        }
        if (this.dsl) {
            int n7;
            n2 = 1;
            while (n2 <= 4 && (n7 = n5 - n2) >= 0) {
                boolean bl3 = true;
                block2: for (int i2 = n4 - n2; i2 <= n4 + n2 && bl3; ++i2) {
                    for (int i3 = n6 - n2; i3 <= n6 + n2; ++i3) {
                        Block block = this.baU.L(new b(i2, n7, i3)).df();
                        if (block == Blocks.cNV || block == Blocks.cLT || block == Blocks.cMj || block == Blocks.cLU) continue;
                        bl3 = false;
                        continue block2;
                    }
                }
                if (!bl3) break;
                this.dsm = n2++;
            }
            if (this.dsm == 0) {
                this.dsl = false;
            }
        }
        if (!this.baU.dDw && this.dsm == 4 && n3 < this.dsm) {
            for (net.minecraft.entity.player.a a2 : this.baU.a(net.minecraft.entity.player.a.class, new net.minecraft.util.a(n4, n5, n6, n4, n5 - 4, n6).ad(10.0, 5.0, 10.0))) {
                a2.a(net.minecraft.stats.b.dpj);
            }
        }
    }

    public List<k> aqm() {
        return this.dsi;
    }

    public float aqn() {
        if (!this.dsl) {
            return 0.0f;
        }
        int n2 = (int)(this.baU.getTotalWorldTime() - this.dsj);
        this.dsj = this.baU.getTotalWorldTime();
        if (n2 > 1) {
            this.dsk -= (float)n2 / 40.0f;
            if (this.dsk < 0.0f) {
                this.dsk = 0.0f;
            }
        }
        this.dsk += 0.025f;
        if (this.dsk > 1.0f) {
            this.dsk = 1.0f;
        }
        return this.dsk;
    }

    @Override
    public aj apQ() {
        n n2 = new n();
        this.b(n2);
        return new bf(this.aZf, 3, n2);
    }

    @Override
    public double apP() {
        return 65536.0;
    }

    private int hl(int n2) {
        if (n2 >= 0 && n2 < a.dgt.length && a.dgt[n2] != null) {
            a a2 = a.dgt[n2];
            return a2 != a.dgw && a2 != a.dgy && a2 != a.dgG && a2 != a.dgD && a2 != a.dgA && a2 != a.dgF ? 0 : n2;
        }
        return 0;
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dsn = this.hl(n2.eG("Primary"));
        this.dso = this.hl(n2.eG("Secondary"));
        this.dsm = n2.eG("Levels");
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.B("Primary", this.dsn);
        n2.B("Secondary", this.dso);
        n2.B("Levels", this.dsm);
    }

    @Override
    public int YI() {
        return 1;
    }

    @Override
    public co fi(int n2) {
        return n2 == 0 ? this.dsp : null;
    }

    @Override
    public co ap(int n2, int n3) {
        if (n2 == 0 && this.dsp != null) {
            if (n3 >= this.dsp.cWZ) {
                co co2 = this.dsp;
                this.dsp = null;
                return co2;
            }
            this.dsp.cWZ -= n3;
            return new co(this.dsp.bP(), n3, this.dsp.yc());
        }
        return null;
    }

    @Override
    public co fj(int n2) {
        if (n2 == 0 && this.dsp != null) {
            co co2 = this.dsp;
            this.dsp = null;
            return co2;
        }
        return null;
    }

    @Override
    public void g(int n2, co co2) {
        if (n2 == 0) {
            this.dsp = co2;
        }
    }

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.beacon";
    }

    @Override
    public boolean xV() {
        return this.coX != null && this.coX.length() > 0;
    }

    public void setName(String string) {
        this.coX = string;
    }

    @Override
    public int YJ() {
        return 1;
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
        return co2.bP() == Items.cRS || co2.bP() == Items.cPm || co2.bP() == Items.cPo || co2.bP() == Items.cPn;
    }

    @Override
    public String xX() {
        return "minecraft:beacon";
    }

    @Override
    public net.minecraft.inventory.b a(net.minecraft.entity.player.g g2, net.minecraft.entity.player.a a2) {
        return new c(g2, this);
    }

    @Override
    public int cx(int n2) {
        switch (n2) {
            case 0: {
                return this.dsm;
            }
            case 1: {
                return this.dsn;
            }
            case 2: {
                return this.dso;
            }
        }
        return 0;
    }

    @Override
    public void K(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.dsm = n3;
                break;
            }
            case 1: {
                this.dsn = this.hl(n3);
                break;
            }
            case 2: {
                this.dso = this.hl(n3);
            }
        }
    }

    @Override
    public int IG() {
        return 3;
    }

    @Override
    public void clear() {
        this.dsp = null;
    }

    @Override
    public boolean aC(int n2, int n3) {
        if (n2 == 1) {
            this.aqj();
            return true;
        }
        return super.aC(n2, n3);
    }
}

