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
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.util.ao;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.ai;
import net.minecraft.world.gen.structure.as;
import net.minecraft.world.gen.structure.aw;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

abstract class av
extends y {
    protected static final List<dg> dRc = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPm, 0, 1, 3, 5), new dg(Items.cPn, 0, 1, 5, 5), new dg(Items.cPo, 0, 1, 3, 15), new dg(Items.cPF, 0, 1, 1, 5), new dg(Items.cQl, 0, 1, 1, 5), new dg(Items.cPh, 0, 1, 1, 5), new dg(Items.cRC, 0, 3, 7, 5), new dg(Items.cQE, 0, 1, 1, 10), new dg(Items.cSp, 0, 1, 1, 8), new dg(Items.cSo, 0, 1, 1, 5), new dg(Items.cSq, 0, 1, 1, 3), new dg(d.I(Blocks.cMb), 0, 2, 4, 2)});

    public av() {
    }

    protected av(int n2) {
        super(n2);
    }

    @Override
    protected void O(n n2) {
    }

    @Override
    protected void N(n n2) {
    }

    private int K(List<aw> list) {
        boolean bl2 = false;
        int n2 = 0;
        for (aw aw2 : list) {
            if (aw2.dRg > 0 && aw2.dRf < aw2.dRg) {
                bl2 = true;
            }
            n2 += aw2.dRe;
        }
        return bl2 ? n2 : -1;
    }

    private av a(ay ay2, List<aw> list, List<y> list2, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        int n6 = this.K(list);
        boolean bl2 = n6 > 0 && n5 <= 30;
        int n7 = 0;
        block0: while (n7 < 5 && bl2) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (aw aw2 : list) {
                if ((n8 -= aw2.dRe) >= 0) continue;
                if (!aw2.iI(n5) || aw2 == ay2.dRi && !aw2.dRh) continue block0;
                av av2 = ai.a(aw2, list2, random, n2, n3, n4, ao2, n5);
                if (av2 == null) continue;
                ++aw2.dRf;
                ay2.dRi = aw2;
                if (!aw2.ayW()) {
                    list.remove(aw2);
                }
                return av2;
            }
        }
        return as.j(list2, random, n2, n3, n4, ao2, n5);
    }

    private y a(ay ay2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5, boolean bl2) {
        if (Math.abs(n2 - ay2.ayR().dQB) <= 112 && Math.abs(n4 - ay2.ayR().dQD) <= 112) {
            av av2;
            List<aw> list2 = ay2.dRj;
            if (bl2) {
                list2 = ay2.dRk;
            }
            if ((av2 = this.a(ay2, list2, list, random, n2, n3, n4, ao2, n5 + 1)) != null) {
                list.add(av2);
                ay2.dRl.add(av2);
            }
            return av2;
        }
        return as.j(list, random, n2, n3, n4, ao2, n5);
    }

    protected y a(ay ay2, List<y> list, Random random, int n2, int n3, boolean bl2) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return this.a(ay2, list, random, this.dQI.dQB + n2, this.dQI.dQC + n3, this.dQI.dQD - 1, this.dQJ, this.ayS(), bl2);
                }
                case dwt: {
                    return this.a(ay2, list, random, this.dQI.dQB + n2, this.dQI.dQC + n3, this.dQI.dQG + 1, this.dQJ, this.ayS(), bl2);
                }
                case dwu: {
                    return this.a(ay2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n3, this.dQI.dQD + n2, this.dQJ, this.ayS(), bl2);
                }
                case dwv: {
                    return this.a(ay2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n3, this.dQI.dQD + n2, this.dQJ, this.ayS(), bl2);
                }
            }
        }
        return null;
    }

    protected y b(ay ay2, List<y> list, Random random, int n2, int n3, boolean bl2) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return this.a(ay2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS(), bl2);
                }
                case dwt: {
                    return this.a(ay2, list, random, this.dQI.dQB - 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwu, this.ayS(), bl2);
                }
                case dwu: {
                    return this.a(ay2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS(), bl2);
                }
                case dwv: {
                    return this.a(ay2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQD - 1, ao.dws, this.ayS(), bl2);
                }
            }
        }
        return null;
    }

    protected y c(ay ay2, List<y> list, Random random, int n2, int n3, boolean bl2) {
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dws: {
                    return this.a(ay2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS(), bl2);
                }
                case dwt: {
                    return this.a(ay2, list, random, this.dQI.dQE + 1, this.dQI.dQC + n2, this.dQI.dQD + n3, ao.dwv, this.ayS(), bl2);
                }
                case dwu: {
                    return this.a(ay2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS(), bl2);
                }
                case dwv: {
                    return this.a(ay2, list, random, this.dQI.dQB + n3, this.dQI.dQC + n2, this.dQI.dQG + 1, ao.dwt, this.ayS(), bl2);
                }
            }
        }
        return null;
    }

    protected static boolean d(w w2) {
        return w2 != null && w2.dQC > 10;
    }
}

