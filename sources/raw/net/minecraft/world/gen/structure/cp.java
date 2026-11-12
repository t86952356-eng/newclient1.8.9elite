/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cp
extends cv {
    private static final List<dg> dSl = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 1, 3, 5), new dg(Items.cQG, 0, 4, 9, 5), new dg(Items.cPl, 0, 3, 8, 10), new dg(Items.cPT, 0, 1, 3, 15), new dg(Items.cPi, 0, 1, 3, 15), new dg(Items.cPf, 0, 1, 1, 1)});
    protected int dSm;

    public cp() {
    }

    public cp(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dSt = this.o(random);
        this.dQI = w2;
        this.dSm = random.nextInt(5);
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.B("Type", this.dSm);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dSm = n2.eG("Type");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        this.a((cr)y2, list, random, 4, 1);
        this.b((cr)y2, list, random, 1, 4);
        this.c((cr)y2, list, random, 1, 4);
    }

    public static cp t(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -4, -1, 0, 11, 7, 11, ao2);
        return cp.e(w2) && y.a(list, w2) == null ? new cp(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, 0, 0, 0, 10, 6, 10, true, random, cc.dRW);
        this.a(w2, random, w3, this.dSt, 4, 1, 0);
        this.a(w2, w3, 4, 1, 10, 6, 3, 10, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 0, 1, 4, 0, 3, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        this.a(w2, w3, 10, 1, 4, 10, 3, 6, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        switch (this.dSm) {
            case 0: {
                this.a(w2, Blocks.cNh.xM(), 5, 1, 5, w3);
                this.a(w2, Blocks.cNh.xM(), 5, 2, 5, w3);
                this.a(w2, Blocks.cNh.xM(), 5, 3, 5, w3);
                this.a(w2, Blocks.cMc.xM(), 4, 3, 5, w3);
                this.a(w2, Blocks.cMc.xM(), 6, 3, 5, w3);
                this.a(w2, Blocks.cMc.xM(), 5, 3, 4, w3);
                this.a(w2, Blocks.cMc.xM(), 5, 3, 6, w3);
                this.a(w2, Blocks.cLW.xM(), 4, 1, 4, w3);
                this.a(w2, Blocks.cLW.xM(), 4, 1, 5, w3);
                this.a(w2, Blocks.cLW.xM(), 4, 1, 6, w3);
                this.a(w2, Blocks.cLW.xM(), 6, 1, 4, w3);
                this.a(w2, Blocks.cLW.xM(), 6, 1, 5, w3);
                this.a(w2, Blocks.cLW.xM(), 6, 1, 6, w3);
                this.a(w2, Blocks.cLW.xM(), 5, 1, 4, w3);
                this.a(w2, Blocks.cLW.xM(), 5, 1, 6, w3);
                break;
            }
            case 1: {
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.a(w2, Blocks.cNh.xM(), 3, 1, 3 + i2, w3);
                    this.a(w2, Blocks.cNh.xM(), 7, 1, 3 + i2, w3);
                    this.a(w2, Blocks.cNh.xM(), 3 + i2, 1, 3, w3);
                    this.a(w2, Blocks.cNh.xM(), 3 + i2, 1, 7, w3);
                }
                this.a(w2, Blocks.cNh.xM(), 5, 1, 5, w3);
                this.a(w2, Blocks.cNh.xM(), 5, 2, 5, w3);
                this.a(w2, Blocks.cNh.xM(), 5, 3, 5, w3);
                this.a(w2, Blocks.cLk.xM(), 5, 4, 5, w3);
                break;
            }
            case 2: {
                int n2;
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(w2, Blocks.cLg.xM(), 1, 3, n2, w3);
                    this.a(w2, Blocks.cLg.xM(), 9, 3, n2, w3);
                }
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(w2, Blocks.cLg.xM(), n2, 3, 1, w3);
                    this.a(w2, Blocks.cLg.xM(), n2, 3, 9, w3);
                }
                this.a(w2, Blocks.cLg.xM(), 5, 1, 4, w3);
                this.a(w2, Blocks.cLg.xM(), 5, 1, 6, w3);
                this.a(w2, Blocks.cLg.xM(), 5, 3, 4, w3);
                this.a(w2, Blocks.cLg.xM(), 5, 3, 6, w3);
                this.a(w2, Blocks.cLg.xM(), 4, 1, 5, w3);
                this.a(w2, Blocks.cLg.xM(), 6, 1, 5, w3);
                this.a(w2, Blocks.cLg.xM(), 4, 3, 5, w3);
                this.a(w2, Blocks.cLg.xM(), 6, 3, 5, w3);
                for (n2 = 1; n2 <= 3; ++n2) {
                    this.a(w2, Blocks.cLg.xM(), 4, n2, 4, w3);
                    this.a(w2, Blocks.cLg.xM(), 6, n2, 4, w3);
                    this.a(w2, Blocks.cLg.xM(), 4, n2, 6, w3);
                    this.a(w2, Blocks.cLg.xM(), 6, n2, 6, w3);
                }
                this.a(w2, Blocks.cMc.xM(), 5, 3, 5, w3);
                for (n2 = 2; n2 <= 8; ++n2) {
                    this.a(w2, Blocks.cLh.xM(), 2, 3, n2, w3);
                    this.a(w2, Blocks.cLh.xM(), 3, 3, n2, w3);
                    if (n2 <= 3 || n2 >= 7) {
                        this.a(w2, Blocks.cLh.xM(), 4, 3, n2, w3);
                        this.a(w2, Blocks.cLh.xM(), 5, 3, n2, w3);
                        this.a(w2, Blocks.cLh.xM(), 6, 3, n2, w3);
                    }
                    this.a(w2, Blocks.cLh.xM(), 7, 3, n2, w3);
                    this.a(w2, Blocks.cLh.xM(), 8, 3, n2, w3);
                }
                this.a(w2, Blocks.cMw.aM(this.g(Blocks.cMw, ao.dwu.OY())), 9, 1, 3, w3);
                this.a(w2, Blocks.cMw.aM(this.g(Blocks.cMw, ao.dwu.OY())), 9, 2, 3, w3);
                this.a(w2, Blocks.cMw.aM(this.g(Blocks.cMw, ao.dwu.OY())), 9, 3, 3, w3);
                this.a(w2, w3, random, 3, 4, 8, dg.a(dSl, Items.cSh.f(random)), 1 + random.nextInt(4));
            }
        }
        return true;
    }
}

