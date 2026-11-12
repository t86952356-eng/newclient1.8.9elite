/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ap;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.s;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.util.g;
import net.minecraft.world.gen.structure.aa;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.w;

public abstract class y {
    protected w dQI;
    protected ao dQJ;
    protected int dQK;

    public y() {
    }

    protected y(int n2) {
        this.dQK = n2;
    }

    public n ayQ() {
        n n2 = new n();
        n2.R("id", t.a(this));
        n2.b("BB", this.dQI.ayP());
        n2.B("O", this.dQJ == null ? -1 : this.dQJ.asA());
        n2.B("GD", this.dQK);
        this.N(n2);
        return n2;
    }

    protected abstract void N(n var1);

    public void b(net.minecraft.world.w w2, n n2) {
        int n3;
        if (n2.eD("BB")) {
            this.dQI = new w(n2.eM("BB"));
        }
        this.dQJ = (n3 = n2.eG("O")) == -1 ? null : ao.hz(n3);
        this.dQK = n2.eG("GD");
        this.O(n2);
    }

    protected abstract void O(n var1);

    public void a(y y2, List<y> list, Random random) {
    }

    public abstract boolean a(net.minecraft.world.w var1, Random var2, w var3);

    public w ayR() {
        return this.dQI;
    }

    public int ayS() {
        return this.dQK;
    }

    public static y a(List<y> list, w w2) {
        for (y y2 : list) {
            if (y2.ayR() == null || !y2.ayR().b(w2)) continue;
            return y2;
        }
        return null;
    }

    public b ayT() {
        return new b(this.dQI.ayO());
    }

    protected boolean a(net.minecraft.world.w w2, w w3) {
        int n2;
        int n3;
        int n4 = Math.max(this.dQI.dQB - 1, w3.dQB);
        int n5 = Math.max(this.dQI.dQC - 1, w3.dQC);
        int n6 = Math.max(this.dQI.dQD - 1, w3.dQD);
        int n7 = Math.min(this.dQI.dQE + 1, w3.dQE);
        int n8 = Math.min(this.dQI.dQF + 1, w3.dQF);
        int n9 = Math.min(this.dQI.dQG + 1, w3.dQG);
        g g2 = new g();
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n6; n2 <= n9; ++n2) {
                if (w2.L(g2.E(n3, n5, n2)).df().xb().zv()) {
                    return true;
                }
                if (!w2.L(g2.E(n3, n8, n2)).df().xb().zv()) continue;
                return true;
            }
        }
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (w2.L(g2.E(n3, n2, n6)).df().xb().zv()) {
                    return true;
                }
                if (!w2.L(g2.E(n3, n2, n9)).df().xb().zv()) continue;
                return true;
            }
        }
        for (n3 = n6; n3 <= n9; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (w2.L(g2.E(n4, n2, n3)).df().xb().zv()) {
                    return true;
                }
                if (!w2.L(g2.E(n7, n2, n3)).df().xb().zv()) continue;
                return true;
            }
        }
        return false;
    }

    protected int bn(int n2, int n3) {
        if (this.dQJ == null) {
            return n2;
        }
        switch (this.dQJ) {
            case dws: 
            case dwt: {
                return this.dQI.dQB + n2;
            }
            case dwu: {
                return this.dQI.dQE - n3;
            }
            case dwv: {
                return this.dQI.dQB + n3;
            }
        }
        return n2;
    }

    protected int iH(int n2) {
        return this.dQJ == null ? n2 : n2 + this.dQI.dQC;
    }

    protected int bo(int n2, int n3) {
        if (this.dQJ == null) {
            return n3;
        }
        switch (this.dQJ) {
            case dws: {
                return this.dQI.dQG - n3;
            }
            case dwt: {
                return this.dQI.dQD + n3;
            }
            case dwu: 
            case dwv: {
                return this.dQI.dQD + n2;
            }
        }
        return n3;
    }

    protected int g(Block block, int n2) {
        if (block == Blocks.cMx) {
            if (this.dQJ == ao.dwu || this.dQJ == ao.dwv) {
                if (n2 == 1) {
                    return 0;
                }
                return 1;
            }
        } else if (block instanceof BlockDoor) {
            if (this.dQJ == ao.dwt) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 2) {
                    return 0;
                }
            } else {
                if (this.dQJ == ao.dwu) {
                    return n2 + 1 & 3;
                }
                if (this.dQJ == ao.dwv) {
                    return n2 + 3 & 3;
                }
            }
        } else if (block != Blocks.cMy && block != Blocks.cMf && block != Blocks.cNC && block != Blocks.cNx && block != Blocks.cNQ) {
            if (block == Blocks.cMw) {
                if (this.dQJ == ao.dwt) {
                    if (n2 == ao.dws.OY()) {
                        return ao.dwt.OY();
                    }
                    if (n2 == ao.dwt.OY()) {
                        return ao.dws.OY();
                    }
                } else if (this.dQJ == ao.dwu) {
                    if (n2 == ao.dws.OY()) {
                        return ao.dwu.OY();
                    }
                    if (n2 == ao.dwt.OY()) {
                        return ao.dwv.OY();
                    }
                    if (n2 == ao.dwu.OY()) {
                        return ao.dws.OY();
                    }
                    if (n2 == ao.dwv.OY()) {
                        return ao.dwt.OY();
                    }
                } else if (this.dQJ == ao.dwv) {
                    if (n2 == ao.dws.OY()) {
                        return ao.dwv.OY();
                    }
                    if (n2 == ao.dwt.OY()) {
                        return ao.dwu.OY();
                    }
                    if (n2 == ao.dwu.OY()) {
                        return ao.dws.OY();
                    }
                    if (n2 == ao.dwv.OY()) {
                        return ao.dwt.OY();
                    }
                }
            } else if (block == Blocks.cMI) {
                if (this.dQJ == ao.dwt) {
                    if (n2 == 3) {
                        return 4;
                    }
                    if (n2 == 4) {
                        return 3;
                    }
                } else if (this.dQJ == ao.dwu) {
                    if (n2 == 3) {
                        return 1;
                    }
                    if (n2 == 4) {
                        return 2;
                    }
                    if (n2 == 2) {
                        return 3;
                    }
                    if (n2 == 1) {
                        return 4;
                    }
                } else if (this.dQJ == ao.dwv) {
                    if (n2 == 3) {
                        return 2;
                    }
                    if (n2 == 4) {
                        return 1;
                    }
                    if (n2 == 2) {
                        return 3;
                    }
                    if (n2 == 1) {
                        return 4;
                    }
                }
            } else if (block != Blocks.cNT && !(block instanceof BlockDirectional)) {
                if (block == Blocks.cLL || block == Blocks.cLH || block == Blocks.cMA || block == Blocks.cLB) {
                    if (this.dQJ == ao.dwt) {
                        if (n2 == ao.dws.OY() || n2 == ao.dwt.OY()) {
                            return ao.hy(n2).asC().OY();
                        }
                    } else if (this.dQJ == ao.dwu) {
                        if (n2 == ao.dws.OY()) {
                            return ao.dwu.OY();
                        }
                        if (n2 == ao.dwt.OY()) {
                            return ao.dwv.OY();
                        }
                        if (n2 == ao.dwu.OY()) {
                            return ao.dws.OY();
                        }
                        if (n2 == ao.dwv.OY()) {
                            return ao.dwt.OY();
                        }
                    } else if (this.dQJ == ao.dwv) {
                        if (n2 == ao.dws.OY()) {
                            return ao.dwv.OY();
                        }
                        if (n2 == ao.dwt.OY()) {
                            return ao.dwu.OY();
                        }
                        if (n2 == ao.dwu.OY()) {
                            return ao.dws.OY();
                        }
                        if (n2 == ao.dwv.OY()) {
                            return ao.dwt.OY();
                        }
                    }
                }
            } else {
                ao ao2 = ao.hz(n2);
                if (this.dQJ == ao.dwt) {
                    if (ao2 == ao.dwt || ao2 == ao.dws) {
                        return ao2.asC().asA();
                    }
                } else if (this.dQJ == ao.dwu) {
                    if (ao2 == ao.dws) {
                        return ao.dwu.asA();
                    }
                    if (ao2 == ao.dwt) {
                        return ao.dwv.asA();
                    }
                    if (ao2 == ao.dwu) {
                        return ao.dws.asA();
                    }
                    if (ao2 == ao.dwv) {
                        return ao.dwt.asA();
                    }
                } else if (this.dQJ == ao.dwv) {
                    if (ao2 == ao.dws) {
                        return ao.dwv.asA();
                    }
                    if (ao2 == ao.dwt) {
                        return ao.dwu.asA();
                    }
                    if (ao2 == ao.dwu) {
                        return ao.dws.asA();
                    }
                    if (ao2 == ao.dwv) {
                        return ao.dwt.asA();
                    }
                }
            }
        } else if (this.dQJ == ao.dwt) {
            if (n2 == 2) {
                return 3;
            }
            if (n2 == 3) {
                return 2;
            }
        } else if (this.dQJ == ao.dwu) {
            if (n2 == 0) {
                return 2;
            }
            if (n2 == 1) {
                return 3;
            }
            if (n2 == 2) {
                return 0;
            }
            if (n2 == 3) {
                return 1;
            }
        } else if (this.dQJ == ao.dwv) {
            if (n2 == 0) {
                return 2;
            }
            if (n2 == 1) {
                return 3;
            }
            if (n2 == 2) {
                return 1;
            }
            if (n2 == 3) {
                return 0;
            }
        }
        return n2;
    }

    protected void a(net.minecraft.world.w w2, IBlockState iBlockState, int n2, int n3, int n4, w w3) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2)) {
            w2.a(b2, iBlockState, 2);
        }
    }

    protected IBlockState a(net.minecraft.world.w w2, int n2, int n3, int n4, w w3) {
        int n5;
        int n6;
        int n7 = this.bn(n2, n4);
        b b2 = new b(n7, n6 = this.iH(n3), n5 = this.bo(n2, n4));
        return !w3.k(b2) ? Blocks.cLc.xM() : w2.L(b2);
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    this.a(w2, Blocks.cLc.xM(), i3, i2, i4, w3);
                }
            }
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(w2, i3, i2, i4, w3).df().xb() == Material.beo) continue;
                    if (i2 != n3 && i2 != n6 && i3 != n2 && i3 != n5 && i4 != n4 && i4 != n7) {
                        this.a(w2, iBlockState2, i3, i2, i4, w3);
                        continue;
                    }
                    this.a(w2, iBlockState, i3, i2, i4, w3);
                }
            }
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, Random random, aa aa2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(w2, i3, i2, i4, w3).df().xb() == Material.beo) continue;
                    aa2.a(random, i3, i2, i4, i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7);
                    this.a(w2, aa2.yU(), i3, i2, i4, w3);
                }
            }
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, Random random, float f2, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (!(random.nextFloat() <= f2) || bl2 && this.a(w2, i3, i2, i4, w3).df().xb() == Material.beo) continue;
                    if (i2 != n3 && i2 != n6 && i3 != n2 && i3 != n5 && i4 != n4 && i4 != n7) {
                        this.a(w2, iBlockState2, i3, i2, i4, w3);
                        continue;
                    }
                    this.a(w2, iBlockState, i3, i2, i4, w3);
                }
            }
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, Random random, float f2, int n2, int n3, int n4, IBlockState iBlockState) {
        if (random.nextFloat() < f2) {
            this.a(w2, iBlockState, n2, n3, n4, w3);
        }
    }

    protected void a(net.minecraft.world.w w2, w w3, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, boolean bl2) {
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = n7 - n4 + 1;
        float f5 = (float)n2 + f2 / 2.0f;
        float f6 = (float)n4 + f4 / 2.0f;
        for (int i2 = n3; i2 <= n6; ++i2) {
            float f7 = (float)(i2 - n3) / f3;
            for (int i3 = n2; i3 <= n5; ++i3) {
                float f8 = ((float)i3 - f5) / (f2 * 0.5f);
                for (int i4 = n4; i4 <= n7; ++i4) {
                    float f9;
                    float f10 = ((float)i4 - f6) / (f4 * 0.5f);
                    if (bl2 && this.a(w2, i3, i2, i4, w3).df().xb() == Material.beo || !((f9 = f8 * f8 + f7 * f7 + f10 * f10) <= 1.05f)) continue;
                    this.a(w2, iBlockState, i3, i2, i4, w3);
                }
            }
        }
    }

    protected void b(net.minecraft.world.w w2, int n2, int n3, int n4, w w3) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2)) {
            while (!w2.aG(b2) && b2.wu() < 255) {
                w2.a(b2, Blocks.cLc.xM(), 2);
                b2 = b2.aqX();
            }
        }
    }

    protected void b(net.minecraft.world.w w2, IBlockState iBlockState, int n2, int n3, int n4, w w3) {
        int n5;
        int n6;
        int n7 = this.bn(n2, n4);
        if (w3.k(new b(n7, n6 = this.iH(n3), n5 = this.bo(n2, n4)))) {
            while ((w2.aG(new b(n7, n6, n5)) || w2.L(new b(n7, n6, n5)).df().xb().zv()) && n6 > 1) {
                w2.a(new b(n7, n6, n5), iBlockState, 2);
                --n6;
            }
        }
    }

    protected boolean a(net.minecraft.world.w w2, w w3, Random random, int n2, int n3, int n4, List<dg> list, int n5) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2) && w2.L(b2).df() != Blocks.cMg) {
            IBlockState iBlockState = Blocks.cMg.xM();
            w2.a(b2, Blocks.cMg.j(w2, b2, iBlockState), 2);
            d d2 = w2.K(b2);
            if (d2 instanceof m) {
                dg.a(random, list, (m)d2, n5);
            }
            return true;
        }
        return false;
    }

    protected boolean a(net.minecraft.world.w w2, w w3, Random random, int n2, int n3, int n4, int n5, List<dg> list, int n6) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2) && w2.L(b2).df() != Blocks.cLB) {
            w2.a(b2, Blocks.cLB.aM(this.g(Blocks.cLB, n5)), 2);
            d d2 = w2.K(b2);
            if (d2 instanceof s) {
                dg.a(random, list, (s)d2, n6);
            }
            return true;
        }
        return false;
    }

    protected void a(net.minecraft.world.w w2, w w3, Random random, int n2, int n3, int n4, ao ao2) {
        b b2 = new b(this.bn(n2, n4), this.iH(n3), this.bo(n2, n4));
        if (w3.k(b2)) {
            ap.a(w2, b2, ao2.asG(), Blocks.cMq);
        }
    }

    public void ae(int n2, int n3, int n4) {
        this.dQI.ad(n2, n3, n4);
    }
}

