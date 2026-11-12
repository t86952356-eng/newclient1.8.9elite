/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.world;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.aa;
import net.minecraft.entity.ab;
import net.minecraft.entity.p;
import net.minecraft.entity.q;
import net.minecraft.entity.v;
import net.minecraft.init.Blocks;
import net.minecraft.util.bt;
import net.minecraft.util.db;
import net.minecraft.util.de;
import net.minecraft.util.g;
import net.minecraft.world.ai;
import net.minecraft.world.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.a;
import net.minecraft.world.w;
import net.optifine.d;
import net.optifine.reflect.l;

public final class t {
    private static final int dCF = (int)Math.pow(17.0, 2.0);
    private final Set<b> dCG = Sets.newHashSet();
    private final Map<Class, p> dCH = new HashMap<Class, p>();
    private int dCI = Integer.MAX_VALUE;
    private int dCJ = Integer.MAX_VALUE;
    private int dCK;

    public int a(ai ai2, boolean bl2, boolean bl3, boolean bl4) {
        Object object;
        int n2;
        int n3;
        Object object22;
        int n4;
        if (!bl2 && !bl3) {
            return 0;
        }
        boolean bl5 = true;
        net.minecraft.entity.player.a a2 = null;
        if (ai2.dCY.size() == 1) {
            a2 = (net.minecraft.entity.player.a)ai2.dCY.get(0);
            if (this.dCG.size() > 0 && a2 != null && a2.csH == this.dCI && a2.csJ == this.dCJ) {
                bl5 = false;
            }
        }
        if (bl5) {
            this.dCG.clear();
            n4 = 0;
            for (Object object22 : ai2.dCY) {
                if (((net.minecraft.entity.player.a)object22).CZ()) continue;
                int n5 = bt.aF(((net.minecraft.entity.player.a)object22).gW / 16.0);
                int n6 = bt.aF(((net.minecraft.entity.player.a)object22).gY / 16.0);
                int n7 = 8;
                for (int i2 = -8; i2 <= 8; ++i2) {
                    for (n3 = -8; n3 <= 8; ++n3) {
                        n2 = i2 == -8 || i2 == 8 || n3 == -8 || n3 == 8 ? 1 : 0;
                        object = new b(i2 + n5, n3 + n6);
                        if (this.dCG.contains(object)) continue;
                        ++n4;
                        if (n2 != 0 || !ai2.Sv().a((b)object)) continue;
                        this.dCG.add((b)object);
                    }
                }
            }
            this.dCK = n4;
            if (a2 != null) {
                this.dCI = a2.csH;
                this.dCJ = a2.csJ;
            }
        }
        n4 = 0;
        net.minecraft.util.b b2 = ai2.avE();
        object22 = new d(0, 0, 0);
        new g();
        for (aa aa2 : aa.values()) {
            Object object3;
            if (aa2.Ww() && !bl3 || !aa2.Ww() && !bl2 || aa2.Wx() && !bl4 || (n3 = net.optifine.reflect.g.epL.aDA() ? net.optifine.reflect.g.c(ai2, net.optifine.reflect.g.epL, new Object[]{aa2, true}) : ai2.r(aa2.Wu())) > (n2 = aa2.Wv() * this.dCK / dCF)) continue;
            object = this.dCG;
            if (net.optifine.reflect.g.eoT.aDA()) {
                object3 = Lists.newArrayList((Iterable)object);
                Collections.shuffle(object3);
                object = object3;
            }
            object3 = object.iterator();
            block6: while (object3.hasNext()) {
                b b3 = (b)object3.next();
                d d2 = t.a(ai2, b3.dBK, b3.dBL, (d)object22);
                int n8 = ((db)d2).wt();
                int n9 = ((db)d2).wu();
                int n10 = ((db)d2).wx();
                Block block = ai2.L(d2).df();
                if (block.xd()) continue;
                int n11 = 0;
                block7: for (int i3 = 0; i3 < 3; ++i3) {
                    int n12 = n8;
                    int n13 = n9;
                    int n14 = n10;
                    int n15 = 6;
                    m m2 = null;
                    ab ab2 = null;
                    for (int i4 = 0; i4 < 4; ++i4) {
                        boolean bl6;
                        p p2;
                        net.minecraft.util.b b4 = new net.minecraft.util.b(n12 += ai2.dDk.nextInt(6) - ai2.dDk.nextInt(6), n13 += ai2.dDk.nextInt(1) - ai2.dDk.nextInt(1), n14 += ai2.dDk.nextInt(6) - ai2.dDk.nextInt(6));
                        float f2 = (float)n12 + 0.5f;
                        float f3 = (float)n14 + 0.5f;
                        if (ai2.p(f2, n13, f3, 24.0) || !(b2.am(f2, n13, f3) >= 576.0)) continue;
                        if (m2 == null && (m2 = ai2.b(aa2, b4)) == null) continue block7;
                        if (!ai2.a(aa2, m2, b4) || !t.a(v.j(m2.bUo), ai2, b4)) continue;
                        try {
                            p2 = this.dCH.get(m2.bUo);
                            if (p2 == null) {
                                p2 = m2.bUo.getConstructor(w.class).newInstance(ai2);
                                this.dCH.put(m2.bUo, p2);
                            }
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n4;
                        }
                        p2.b((double)f2, (double)n13, (double)f3, ai2.dDk.nextFloat() * 360.0f, 0.0f);
                        boolean bl7 = net.optifine.reflect.g.eoE.aDA() ? l.a(p2, (w)ai2, f2, (float)n13, f3) : (bl6 = p2.UB() && p2.Vh());
                        if (bl6) {
                            int n16;
                            this.dCH.remove(m2.bUo);
                            if (!l.a(p2, (w)ai2, f2, n13, f3)) {
                                ab2 = p2.a(ai2.bg(new net.minecraft.util.b(p2)), ab2);
                            }
                            if (p2.Vh()) {
                                ++n11;
                                ai2.G(p2);
                            }
                            int n17 = n16 = net.optifine.reflect.g.eoG.aDA() ? net.optifine.reflect.g.c(net.optifine.reflect.g.eoG, p2) : p2.Vj();
                            if (n11 >= n16) continue block6;
                        }
                        n4 += n11;
                    }
                }
            }
        }
        return n4;
    }

    protected static net.minecraft.util.b a(w w2, int n2, int n3) {
        a a2 = w2.aL(n2, n3);
        int n4 = n2 * 16 + w2.dDk.nextInt(16);
        int n5 = n3 * 16 + w2.dDk.nextInt(16);
        int n6 = bt.aH(a2.bn(new net.minecraft.util.b(n4, 0, n5)) + 1, 16);
        int n7 = w2.dDk.nextInt(n6 > 0 ? n6 : a2.axv() + 16 - 1);
        return new net.minecraft.util.b(n4, n7, n5);
    }

    private static d a(w w2, int n2, int n3, d d2) {
        a a2 = w2.aL(n2, n3);
        int n4 = n2 * 16 + w2.dDk.nextInt(16);
        int n5 = n3 * 16 + w2.dDk.nextInt(16);
        int n6 = bt.aH(a2.aU(n4 & 0xF, n5 & 0xF) + 1, 16);
        int n7 = w2.dDk.nextInt(n6 > 0 ? n6 : a2.axv() + 16 - 1);
        d2.ah(n4, n7, n5);
        return d2;
    }

    public static boolean a(q q2, w w2, net.minecraft.util.b b2) {
        boolean bl2;
        if (!w2.Sv().bm(b2)) {
            return false;
        }
        if (q2 == null) {
            return false;
        }
        Block block = w2.L(b2).df();
        if (q2 == q.cuh) {
            return block.xb().zv() && w2.L(b2.aqY()).df().xb().zv() && !w2.L(b2.aqX()).df().xd();
        }
        net.minecraft.util.b b3 = b2.aqY();
        IBlockState iBlockState = w2.L(b3);
        boolean bl3 = bl2 = net.optifine.reflect.g.eoi.aDA() ? net.optifine.reflect.g.b((Object)iBlockState.df(), net.optifine.reflect.g.eoi, new Object[]{w2, b3, q2}) : w.v(w2, b3);
        if (!bl2) {
            return false;
        }
        Block block2 = w2.L(b3).df();
        boolean bl4 = block2 != Blocks.cLj && block2 != Blocks.cOx;
        return bl4 && !block.xd() && !block.xb().zv() && !w2.L(b2.aqX()).df().xd();
    }

    public static void a(w w2, j j2, int n2, int n3, int n4, int n5, Random random) {
        List<m> list = j2.a(aa.cvY);
        if (!list.isEmpty()) {
            while (random.nextFloat() < j2.awZ()) {
                m m2 = de.a(w2.dDk, list);
                int n6 = m2.dHv + random.nextInt(1 + m2.dHw - m2.dHv);
                ab ab2 = null;
                int n7 = n2 + random.nextInt(n4);
                int n8 = n3 + random.nextInt(n5);
                int n9 = n7;
                int n10 = n8;
                for (int i2 = 0; i2 < n6; ++i2) {
                    boolean bl2 = false;
                    for (int i3 = 0; !bl2 && i3 < 4; ++i3) {
                        net.minecraft.util.b b2 = w2.aT(new net.minecraft.util.b(n7, 0, n8));
                        if (t.a(q.cuf, w2, b2)) {
                            Object object;
                            p p2;
                            try {
                                p2 = m2.bUo.getConstructor(w.class).newInstance(w2);
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                continue;
                            }
                            if (net.optifine.reflect.g.eoE.aDA() && (object = net.optifine.reflect.g.g(net.optifine.reflect.g.eoE, p2, w2, Float.valueOf((float)n7 + 0.5f), b2.wu(), Float.valueOf((float)n8 + 0.5f))) == l.eth) continue;
                            p2.b((double)((float)n7 + 0.5f), (double)b2.wu(), (double)((float)n8 + 0.5f), random.nextFloat() * 360.0f, 0.0f);
                            w2.G(p2);
                            ab2 = p2.a(w2.bg(new net.minecraft.util.b(p2)), ab2);
                            bl2 = true;
                        }
                        n7 += random.nextInt(5) - random.nextInt(5);
                        n8 += random.nextInt(5) - random.nextInt(5);
                        while (n7 < n2 || n7 >= n2 + n4 || n8 < n3 || n8 >= n3 + n4) {
                            n7 = n9 + random.nextInt(5) - random.nextInt(5);
                            n8 = n10 + random.nextInt(5) - random.nextInt(5);
                        }
                    }
                }
            }
        }
    }
}

