/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.feature;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.m;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.dg;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l
extends ao {
    private static final Logger dOo = LogManager.getLogger();
    private static final String[] dOp = new String[]{"Skeleton", "Zombie", "Zombie", "Spider"};
    private static final List<dg> dOq = Lists.newArrayList((Object[])new dg[]{new dg(Items.cQE, 0, 1, 1, 10), new dg(Items.cPn, 0, 1, 4, 10), new dg(Items.cPT, 0, 1, 1, 10), new dg(Items.cPS, 0, 1, 4, 10), new dg(Items.cPL, 0, 1, 4, 10), new dg(Items.cPJ, 0, 1, 4, 10), new dg(Items.cQA, 0, 1, 1, 10), new dg(Items.cQs, 0, 1, 1, 1), new dg(Items.cQG, 0, 1, 4, 10), new dg(Items.cSu, 0, 1, 1, 4), new dg(Items.cSv, 0, 1, 1, 4), new dg(Items.cSs, 0, 1, 1, 10), new dg(Items.cSp, 0, 1, 1, 2), new dg(Items.cSo, 0, 1, 1, 5), new dg(Items.cSq, 0, 1, 1, 1)});

    @Override
    public boolean b(w w2, Random random, b b2) {
        b b3;
        int n2;
        int n3;
        int n4;
        int n5 = 3;
        int n6 = random.nextInt(2) + 2;
        int n7 = -n6 - 1;
        int n8 = n6 + 1;
        int n9 = -1;
        int n10 = 4;
        int n11 = random.nextInt(2) + 2;
        int n12 = -n11 - 1;
        int n13 = n11 + 1;
        int n14 = 0;
        for (n4 = n7; n4 <= n8; ++n4) {
            for (n3 = -1; n3 <= 4; ++n3) {
                for (n2 = n12; n2 <= n13; ++n2) {
                    b3 = b2.C(n4, n3, n2);
                    Material material = w2.L(b3).df().xb();
                    boolean bl2 = material.zw();
                    if (n3 == -1 && !bl2) {
                        return false;
                    }
                    if (n3 == 4 && !bl2) {
                        return false;
                    }
                    if (n4 != n7 && n4 != n8 && n2 != n12 && n2 != n13 || n3 != 0 || !w2.aG(b3) || !w2.aG(b3.aqX())) continue;
                    ++n14;
                }
            }
        }
        if (n14 >= 1 && n14 <= 5) {
            for (n4 = n7; n4 <= n8; ++n4) {
                for (n3 = 3; n3 >= -1; --n3) {
                    for (n2 = n12; n2 <= n13; ++n2) {
                        b3 = b2.C(n4, n3, n2);
                        if (n4 != n7 && n3 != -1 && n2 != n12 && n4 != n8 && n3 != 4 && n2 != n13) {
                            if (w2.L(b3).df() == Blocks.cMg) continue;
                            w2.aL(b3);
                            continue;
                        }
                        if (b3.wu() >= 0 && !w2.L(b3.aqY()).df().xb().zw()) {
                            w2.aL(b3);
                            continue;
                        }
                        if (!w2.L(b3).df().xb().zw() || w2.L(b3).df() == Blocks.cMg) continue;
                        if (n3 == -1 && random.nextInt(4) != 0) {
                            w2.a(b3, Blocks.cMa.xM(), 2);
                            continue;
                        }
                        w2.a(b3, Blocks.cLg.xM(), 2);
                    }
                }
            }
            block6: for (n4 = 0; n4 < 2; ++n4) {
                for (n3 = 0; n3 < 3; ++n3) {
                    Object object2;
                    int n15;
                    int n16;
                    n2 = b2.wt() + random.nextInt(n6 * 2 + 1) - n6;
                    b b4 = new b(n2, n16 = b2.wu(), n15 = b2.wx() + random.nextInt(n11 * 2 + 1) - n11);
                    if (!w2.aG(b4)) continue;
                    int n17 = 0;
                    for (Object object2 : ar.dwT) {
                        if (!w2.L(b4.x((net.minecraft.util.ao)object2)).df().xb().zw()) continue;
                        ++n17;
                    }
                    if (n17 != true) continue;
                    w2.a(b4, Blocks.cMg.j(w2, b4, Blocks.cMg.xM()), 2);
                    List<dg> list = dg.a(dOq, Items.cSh.f(random));
                    object2 = w2.K(b4);
                    if (!(object2 instanceof m)) continue block6;
                    dg.a(random, list, (m)object2, 8);
                    continue block6;
                }
            }
            w2.a(b2, Blocks.cMe.xM(), 2);
            d d2 = w2.K(b2);
            if (d2 instanceof ab) {
                ((ab)d2).aqI().fW(this.l(random));
            } else {
                dOo.error("Failed to fetch mob spawner entity at (" + b2.wt() + ", " + b2.wu() + ", " + b2.wx() + ")");
            }
            return true;
        }
        return false;
    }

    private String l(Random random) {
        return dOp[random.nextInt(dOp.length)];
    }
}

