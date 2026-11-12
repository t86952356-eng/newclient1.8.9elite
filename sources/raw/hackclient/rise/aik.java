/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.ahj;
import hackclient.rise.aie;
import hackclient.rise.aii;
import hackclient.rise.ail;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akc;
import hackclient.rise.akd;
import hackclient.rise.bs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.settings.d;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.util.db;
import net.minecraft.util.dd;
import net.minecraft.world.w;

public final class aik
implements aea {
    private static final HashMap<Integer, Integer> aPv = new ail();

    public static Block o(double d2, double d3, double d4) {
        return aik.aER.bgF.L(new b(d2, d3, d4)).df();
    }

    public static Block u(b b2) {
        return aik.aER.bgF.L(b2).df();
    }

    public static Block a(db db2) {
        return aik.u(new b(db2));
    }

    public static Block c(akd akd2) {
        return aik.o(akd2.getX(), akd2.getY(), akd2.getZ());
    }

    public static Block a(dd dd2) {
        return aik.u(new b(new db(dd2.dAO, dd2.dAP, dd2.dAQ)));
    }

    public static double a(b b2, b b3) {
        double d2 = b2.wt() - b3.wt();
        double d3 = b2.wu() - b3.wu();
        double d4 = b2.wx() - b3.wx();
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public static boolean vv() {
        return aik.av(0);
    }

    public static boolean av(int n2) {
        akc[] akcArray;
        if (!aik.aER.bgK.aO || !aik.aER.bgK.crR) {
            return false;
        }
        for (akc akc2 : akcArray = new akc[]{new akc(0, 1), new akc(1, 0), new akc(0, -1), new akc(-1, 0)}) {
            if (aik.p(akc2.alM, n2, akc2.alN) instanceof BlockAir || !(aik.p(akc2.alM, 1 + n2, akc2.alN) instanceof BlockAir)) continue;
            return true;
        }
        return false;
    }

    public static Block p(double d2, double d3, double d4) {
        return aik.o(aik.aER.bgK.gW + d2, aik.aER.bgK.gX + d3, aik.aER.bgK.gY + d4);
    }

    public static Block o(double d2, double d3) {
        return aik.p(-Math.sin(aii.direction()) * d2, d3, Math.cos(aii.direction()) * d2);
    }

    public static String g(net.minecraft.entity.player.a a2) {
        return a2.xU();
    }

    public static String R() {
        return aik.aER.bgK.xU();
    }

    public static boolean D(r r2) {
        if (r2.Vw() != null && aik.aER.bgK.Vw() != null) {
            char c2;
            char c3 = r2.xW().getFormattedText().charAt(1);
            return c3 == (c2 = aik.aER.bgK.xW().getFormattedText().charAt(1));
        }
        return false;
    }

    public static boolean ad(double d2) {
        return aik.a(d2, true);
    }

    public static boolean a(double d2, boolean bl2) {
        if (bl2) {
            a a2 = aik.aER.bgK.Us().ae(0.0, -d2, 0.0);
            if (!aik.aER.bgF.a((c)aik.aER.bgK, a2).isEmpty()) {
                return true;
            }
        } else {
            int n2 = 0;
            while ((double)n2 < d2) {
                if (aik.p(0.0, -n2, 0.0).isFullBlock()) {
                    return true;
                }
                ++n2;
            }
        }
        return false;
    }

    public static boolean b(double d2, boolean bl2) {
        a a2 = aik.aER.bgK.Us().ae(0.0, d2 / 2.0, 0.0).ad(0.0, d2 - (double)aik.aER.bgK.height, 0.0);
        return !aik.aER.bgF.a((c)aik.aER.bgK, a2).isEmpty();
    }

    public static boolean vw() {
        return aik.ad(10.0);
    }

    public static boolean ae(double d2) {
        a a2 = aik.aER.bgK.Us().ae(0.0, d2, 0.0);
        return !aik.aER.bgF.a((c)aik.aER.bgK, a2).isEmpty();
    }

    public static double vx() {
        a a2 = aik.aER.bgK.Us();
        int n2 = bt.aF(a2.dtH + 1.0E-7);
        int n3 = bt.aF(a2.dtK - 1.0E-7);
        int n4 = bt.aF(a2.dtJ + 1.0E-7);
        int n5 = bt.aF(a2.dtM - 1.0E-7);
        double d2 = a2.dtI;
        double d3 = Double.POSITIVE_INFINITY;
        for (int i2 = n2; i2 <= n3; ++i2) {
            block1: for (int i3 = n4; i3 <= n5; ++i3) {
                for (int i4 = bt.aF(d2) - 1; i4 >= 0; --i4) {
                    b b2 = new b(i2, i4, i3);
                    IBlockState iBlockState = aik.aER.bgF.L(b2);
                    a a3 = iBlockState.df().a((w)aik.aER.bgF, b2, iBlockState);
                    if (a3 == null) continue;
                    double d4 = a3.dtL;
                    if (d2 >= d4) {
                        double d5 = d2 - d4;
                        if (!(d5 < d3)) continue block1;
                        d3 = d5;
                        continue block1;
                    }
                    d3 = 0.0;
                    continue block1;
                }
            }
        }
        return d3 == Double.POSITIVE_INFINITY ? -1.0 : d3;
    }

    public static boolean aw(int n2) {
        return aPv.containsKey(n2);
    }

    public static int ax(int n2) {
        return aPv.getOrDefault(n2, -1);
    }

    public static boolean vy() {
        return aik.aER.bgK.isInWater() || aik.aER.bgK.isInLava();
    }

    public static void fakeDamage() {
        aik.aER.bgK.a((byte)2);
        aik.aER.bha.bnT = aik.aER.bha.bnB + 20;
    }

    public static boolean ay(int n2) {
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    Block block = aik.p(i2, i3, i4);
                    if (block instanceof BlockAir) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(int n2, Material material) {
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    Block block = aik.p(i2, i3, i4);
                    if (!block.xb().equals(material)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean vz() {
        if (aik.aER.bgK.aRg < 5) {
            return false;
        }
        net.minecraft.client.entity.c c2 = aik.aER.bgK;
        j j2 = aik.aER.bgF;
        a a2 = c2.Us();
        for (int i2 = bt.aF(a2.dtH); i2 < bt.aF(a2.dtK) + 1; ++i2) {
            for (int i3 = bt.aF(a2.dtI); i3 < bt.aF(a2.dtL) + 1; ++i3) {
                for (int i4 = bt.aF(a2.dtJ); i4 < bt.aF(a2.dtM) + 1; ++i4) {
                    a a3;
                    Block block = j2.L(new b(i2, i3, i4)).df();
                    if (block == null || block instanceof BlockAir || (a3 = block.a((w)j2, new b(i2, i3, i4), j2.L(new b(i2, i3, i4)))) == null || !c2.Us().q(a3)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static void h(int n2, boolean bl2) {
        int n3 = n2 == 0 ? aik.aER.aIY.chw.cO() : aik.aER.aIY.chu.cO();
        d.k(n3, bl2);
        if (bl2) {
            d.ea(n3);
        }
    }

    public static boolean vA() {
        boolean bl2 = false;
        a a2 = aik.aER.bgK.Us();
        j j2 = aik.aER.bgF;
        int n2 = (int)a2.ae((double)0.0, (double)-0.01, (double)0.0).dtI;
        for (int i2 = bt.aF(a2.dtH); i2 < bt.aF(a2.dtK) + 1; ++i2) {
            for (int i3 = bt.aF(a2.dtJ); i3 < bt.aF(a2.dtM) + 1; ++i3) {
                Block block = j2.L(new b(i2, n2, i3)).df();
                if (block == null || block instanceof BlockAir) continue;
                if (!(block instanceof BlockLiquid)) {
                    return false;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    public static aie e(da da2) {
        return aik.a(da2, false);
    }

    public static aie a(da da2, boolean bl2) {
        int n2;
        ArrayList<aie> arrayList = new ArrayList<aie>();
        for (n2 = -1; n2 <= 1; n2 += 2) {
            if (aik.o(da2.dAG, da2.dAH, da2.dAI + (double)n2).a((w)aik.aER.bgF, new b(da2.dAG, da2.dAH, da2.dAI + (double)n2))) continue;
            if (n2 < 0) {
                arrayList.add(new aie(ao.dwt, new da(0.0, 0.0, n2)));
                continue;
            }
            arrayList.add(new aie(ao.dws, new da(0.0, 0.0, n2)));
        }
        for (n2 = -1; n2 <= 1; n2 += 2) {
            if (aik.o(da2.dAG + (double)n2, da2.dAH, da2.dAI).a((w)aik.aER.bgF, new b(da2.dAG + (double)n2, da2.dAH, da2.dAI))) continue;
            if (n2 > 0) {
                arrayList.add(new aie(ao.dwu, new da(n2, 0.0, 0.0)));
                continue;
            }
            arrayList.add(new aie(ao.dwv, new da(n2, 0.0, 0.0)));
        }
        arrayList.sort(Comparator.comparingDouble(aie2 -> {
            double d2 = Math.toDegrees(Math.atan2(aie2.vq().dAI, aie2.vq().dAG)) % 360.0;
            double d3 = bs.fk.x % 360.0f + 90.0f;
            return Math.abs(ahj.n(d2, d3));
        }));
        if (!arrayList.isEmpty()) {
            return (aie)arrayList.get(0);
        }
        for (n2 = -1; n2 <= 1; n2 += 2) {
            if (aik.o(da2.dAG, da2.dAH + (double)n2, da2.dAI).a((w)aik.aER.bgF, new b(da2.dAG, da2.dAH + (double)n2, da2.dAI))) continue;
            if (n2 < 0) {
                return new aie(ao.dwr, new da(0.0, n2, 0.0));
            }
            if (!bl2) continue;
            return new aie(ao.dwq, new da(0.0, n2, 0.0));
        }
        return null;
    }

    public static da q(double d2, double d3, double d4) {
        return aik.a(d2, d3, d4, null);
    }

    public static da a(double d2, double d3, double d4, Integer n2) {
        ArrayList<da> arrayList = new ArrayList<da>();
        int n3 = (int)(5.0 + (Math.abs(d2) + Math.abs(d4)));
        for (int i2 = -n3; i2 <= n3; ++i2) {
            for (int i3 = -n3; i3 <= n3; ++i3) {
                for (int i4 = -n3; i4 <= n3; ++i4) {
                    int n4;
                    b b2 = new b(aik.aER.bgK.gW + (double)i2, aik.aER.bgK.gX + (double)i3, aik.aER.bgK.gY + (double)i4);
                    Block block = aik.aER.bgF.L(b2).df();
                    if (block == Blocks.cMg || block == Blocks.cOi || block == Blocks.cOh || block == Blocks.cMk || block == Blocks.cMn || block == Blocks.cMo || block == Blocks.cOr || block == Blocks.cOv || block == Blocks.cLB || block == Blocks.cLD || block == Blocks.cMP) continue;
                    if (block.isFullBlock() && block.xd() || block instanceof BlockStairs || !(block instanceof BlockSlab) || !aik.aER.bgK.aO || Math.abs(aik.aER.bgK.gX - (double)Math.round(aik.aER.bgK.gX)) > 0.03) {
                        // empty if block
                    }
                    if (block.a((w)aik.aER.bgF, b2)) continue;
                    for (n4 = -1; n4 <= 1; n4 += 2) {
                        arrayList.add(new da(aik.aER.bgK.gW + (double)i2 + (double)n4, aik.aER.bgK.gX + (double)i3, aik.aER.bgK.gY + (double)i4));
                    }
                    for (n4 = -1; n4 <= 1; n4 += 2) {
                        arrayList.add(new da(aik.aER.bgK.gW + (double)i2, aik.aER.bgK.gX + (double)i3 + (double)n4, aik.aER.bgK.gY + (double)i4));
                    }
                    for (n4 = -1; n4 <= 1; n4 += 2) {
                        arrayList.add(new da(aik.aER.bgK.gW + (double)i2, aik.aER.bgK.gX + (double)i3, aik.aER.bgK.gY + (double)i4 + (double)n4));
                    }
                }
            }
        }
        arrayList.removeIf(da2 -> aik.aER.bgK.getDistance(da2.dAG, da2.dAH, da2.dAI) > 5.0 || !aik.o(da2.dAG, da2.dAH, da2.dAI).a((w)aik.aER.bgF, new b(da2.dAG, da2.dAH, da2.dAI)));
        if (arrayList.isEmpty()) {
            return null;
        }
        if (n2 != null) {
            arrayList.removeIf(da2 -> Math.floor(da2.dAH + 1.0) != (double)n2.intValue());
        }
        arrayList.sort(Comparator.comparingDouble(da2 -> {
            double d5 = aik.aER.bgK.gW + d2 - da2.dAG;
            double d6 = aik.aER.bgK.gX - 1.0 + d3 - da2.dAH;
            double d7 = aik.aER.bgK.gY + d4 - da2.dAI;
            return bt.aD(d5 * d5 + d6 * d6 + d7 * d7);
        }));
        return arrayList.isEmpty() ? null : (da)arrayList.getFirst();
    }

    public static net.minecraft.client.entity.b c(net.minecraft.client.entity.b b2) {
        net.minecraft.client.entity.b b3 = new net.minecraft.client.entity.b(b2.Se(), b2.Ie());
        b3.ud = b2.ud;
        b3.ue = b2.ue;
        b3.uf = b2.uf;
        b3.pl = b2.pl;
        b3.eu(b2.getEntityId());
        b3.csh = b2.csh;
        b3.csi = b2.csi;
        b3.csj = b2.csj;
        b3.setPosition(b2.gW, b2.gX, b2.gY);
        return b3;
    }

    public static double v(c c2) {
        if (c2 == null || aik.aER.bgK == null) {
            return Double.MAX_VALUE;
        }
        a a2 = c2.Us();
        if (a2 == null || a2.aqW() || !aik.w(c2)) {
            return aik.aER.bgK.S(c2);
        }
        double d2 = 1000.0;
        da da2 = aik.aER.bgK.aQ(1.0f);
        if (!(aik.af(da2.dAG) && aik.af(da2.dAH) && aik.af(da2.dAI))) {
            return aik.aER.bgK.S(c2);
        }
        akb akb2 = aix.y(c2);
        if (akb2 == null || !aik.af(akb2.getX()) || !aik.af(akb2.getY())) {
            return aik.aER.bgK.S(c2);
        }
        da da3 = aik.aER.bgK.s(akb2.getY(), akb2.getX());
        if (!(aik.af(da3.dAG) && aik.af(da3.dAH) && aik.af(da3.dAI))) {
            return aik.aER.bgK.S(c2);
        }
        ce ce2 = a2.ad(0.1, 0.1, 0.1).c(da2, da2.al(da3.dAG * 1000.0, da3.dAH * 1000.0, da3.dAI * 1000.0));
        if (ce2 == null || ce2.daS == null) {
            return aik.aER.bgK.S(c2);
        }
        double d3 = ce2.daS.x(da2);
        return aik.af(d3) ? d3 : (double)aik.aER.bgK.S(c2);
    }

    private static boolean w(c c2) {
        return aik.af(c2.gW) && aik.af(c2.gX) && aik.af(c2.gY);
    }

    private static boolean af(double d2) {
        return !Double.isNaN(d2) && !Double.isInfinite(d2);
    }

    @Generated
    private aik() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

