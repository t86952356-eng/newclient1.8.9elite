/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package hackclient.rise;

import com.google.common.collect.Multimap;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockSlime;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.enchantment.l;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.z;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ac;
import net.minecraft.item.af;
import net.minecraft.item.ai;
import net.minecraft.item.aj;
import net.minecraft.item.ak;
import net.minecraft.item.ax;
import net.minecraft.item.bg;
import net.minecraft.item.bw;
import net.minecraft.item.by;
import net.minecraft.item.cn;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.item.d;
import net.minecraft.item.y;
import net.minecraft.nbt.b;
import net.minecraft.util.ad;
import net.minecraft.util.cm;

public final class aih {
    private static final List<d> aOZ = Arrays.asList(Items.cQV, Items.cQB, Items.cQA, Items.cPk, Items.cPj, Items.cQH, Items.cQT, Items.cRy, Items.cQM, Items.cRP, Items.cQI);

    public static boolean v(co co2) {
        Object object;
        d d2 = co2.bP();
        if (d2 instanceof by) {
            object = (by)d2;
        }
        if (d2 instanceof af) {
            object = ((af)d2).df();
            if (object instanceof BlockTNT) {
                return true;
            }
            if (object instanceof BlockGlass || object instanceof BlockStainedGlass || ((Block)object).isFullBlock() && !(object instanceof ITileEntityProvider) && !(object instanceof BlockContainer) && !(object instanceof BlockTNT) && !(object instanceof BlockSlime) && !(object instanceof BlockFalling)) {
                return true;
            }
        }
        return d2 instanceof cp || d2 instanceof cq || d2 instanceof y || d2 instanceof bg || d2 instanceof by || aOZ.contains(d2);
    }

    public static boolean a(co co2, net.minecraft.inventory.b b2) {
        d d3 = co2.bP();
        if (d3 instanceof cp) {
            return aih.b(co2, b2);
        }
        if (d3 instanceof cq) {
            return aih.b(co2, b2, aih.d(d3));
        }
        if (d3 instanceof af) {
            af af2 = (af)d3;
            return af2.df().isFullBlock();
        }
        if (d3 instanceof ak || d3 instanceof aj || d3 instanceof ax) {
            return true;
        }
        if (d3 instanceof by) {
            by by2 = (by)d3;
            List<net.minecraft.potion.d> list = by2.aH(co2);
            if (list != null) {
                return list.stream().anyMatch(d2 -> !net.minecraft.potion.a.dgt[d2.aje()].aiZ());
            }
        } else {
            if (d3 instanceof y) {
                y y2 = (y)d3;
                return aih.a(co2, b2, y2.cVH);
            }
            if (d3 instanceof bg) {
                return true;
            }
            if (d3 instanceof ai) {
                return aih.c(co2, b2);
            }
            return d3 == Items.cPk;
        }
        return false;
    }

    public static boolean a(co co2, net.minecraft.inventory.b b2, int n2) {
        co co3 = aih.c(b2, n2);
        return co3 == null || co2 == co3 || aih.y(co2) > aih.y(co3);
    }

    public static boolean b(co co2, net.minecraft.inventory.b b2, int n2) {
        co co3 = aih.b(b2, n2);
        return co3 == null || co2 == co3 || aih.w(co2) > aih.w(co3);
    }

    public static boolean b(co co2, net.minecraft.inventory.b b2) {
        co co3 = aih.b(b2);
        return co3 == null || co2 == co3 || aih.x(co2) > aih.x(co3);
    }

    public static boolean c(co co2, net.minecraft.inventory.b b2) {
        co co3 = aih.c(b2);
        return co3 == null || co2 == co3 || aih.z(co2) > aih.z(co3);
    }

    private static co b(net.minecraft.inventory.b b2, int n2) {
        return aih.a(9, 45, b2, co2 -> {
            if (co2.bP() != null && co2.bP() instanceof cq) {
                cq cq2 = (cq)co2.bP();
                return aih.d(cq2) == n2;
            }
            return false;
        }, Comparator.comparingDouble(aih::w));
    }

    private static co b(net.minecraft.inventory.b b2) {
        return aih.a(9, 45, b2, co2 -> co2.bP() instanceof cp, Comparator.comparingDouble(aih::x));
    }

    private static co c(net.minecraft.inventory.b b2, int n2) {
        return aih.a(5, 45, b2, co2 -> {
            if (co2.bP() != null && co2.bP() instanceof y) {
                y y2 = (y)co2.bP();
                return y2.cVH == n2;
            }
            return false;
        }, Comparator.comparingDouble(aih::y));
    }

    private static co c(net.minecraft.inventory.b b2) {
        return aih.a(9, 45, b2, co2 -> co2.bP() instanceof ai, Comparator.comparingDouble(aih::z));
    }

    private static co a(int n3, int n4, net.minecraft.inventory.b b2, Predicate<co> predicate, Comparator<co> comparator) {
        return IntStream.range(n3, n4).mapToObj(n2 -> b2.fM(n2).ls()).filter(co2 -> co2 != null && predicate.test((co)co2)).max(comparator.thenComparingDouble(co2 -> co2.adt() - co2.aef())).orElse(null);
    }

    private static float w(co co2) {
        int n2;
        cq cq2 = (cq)co2.bP();
        float f2 = cq2.adY().adH();
        if (f2 > 1.0f && (n2 = l.d(net.minecraft.enchantment.a.cqm.cqw, co2)) > 0) {
            f2 += (float)(n2 * n2 + 1);
        }
        return f2;
    }

    private static double x(co co2) {
        d d2 = co2.bP();
        if (d2 instanceof cp) {
            cp cp2 = (cp)d2;
            int n2 = l.d(net.minecraft.enchantment.a.cqg.cqw, co2);
            int n3 = l.d(net.minecraft.enchantment.a.cqk.cqw, co2);
            return (double)cp2.adI() + (double)n2 * 1.25 + (double)n3 * 2.5;
        }
        Multimap<String, a> multimap = co2.aew();
        if (!multimap.isEmpty()) {
            for (Map.Entry entry : multimap.entries()) {
                if (!((String)entry.getKey()).equals(net.minecraft.entity.aj.cwq.Xs())) continue;
                a a2 = (a)entry.getValue();
                double d3 = a2.Xq() + (double)l.a(co2, z.cvT);
                double d4 = a2.Xp() != 1 && a2.Xp() != 2 ? d3 : d3 * 100.0;
                if (d3 > 0.0) {
                    return d4;
                }
                if (!(d3 < 0.0)) continue;
                return d4 *= -1.0;
            }
        }
        return 0.0;
    }

    private static double y(co co2) {
        y y2 = (y)co2.bP();
        float f2 = -1.0f;
        int n2 = 25 - y2.cVI;
        float f3 = f2 * (float)n2;
        f2 = f3 / 25.0f;
        int n3 = Math.min(20, l.a(new co[]{co2}, ad.dvl));
        if (n3 > 0) {
            int n4 = 25 - n3;
            float f4 = f2 * (float)n4;
            f2 = f4 / 25.0f;
        }
        return f2;
    }

    private static int z(co co2) {
        return l.d(net.minecraft.enchantment.a.cqq.cqw, co2);
    }

    public static int d(d d2) {
        if (d2 instanceof bw) {
            return 0;
        }
        if (d2 instanceof ac) {
            return 1;
        }
        if (d2 instanceof cn) {
            return 2;
        }
        return 0;
    }

    public static co F(String string, String string2) {
        String string3 = String.format("{\"textures\":{\"SKIN\":{\"url\":\"%s\"}}}", string2);
        String string4 = Base64.getEncoder().encodeToString(string3.getBytes());
        return aih.cg(String.format("skull 1 3 {SkullOwner:{Id:\"%s\",Name:\"%s\",Properties:{textures:[{Value:\"%s\"}]}}}", UUID.randomUUID(), string, string4));
    }

    public static co cg(String string) {
        try {
            string = string.replace('&', '\u00a7');
            int n2 = 1;
            int n3 = 0;
            String[] stringArray = string.split(" ");
            cm cm2 = new cm(stringArray[0]);
            d d2 = d.cVi.w(cm2);
            if (stringArray.length >= 2 && stringArray[1].matches("\\d+")) {
                n2 = Integer.parseInt(stringArray[1]);
            }
            if (stringArray.length >= 3 && stringArray[2].matches("\\d+")) {
                n3 = Integer.parseInt(stringArray[2]);
            }
            co co2 = new co(d2, n2, n3);
            if (stringArray.length >= 4) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i2 = 3; i2 < stringArray.length; ++i2) {
                    stringBuilder.append(" ").append(stringArray[i2]);
                }
                co2.u(b.ez(stringBuilder.toString()));
            }
            return co2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new co(Blocks.cOx);
        }
    }

    public String G(String string, String string2) {
        String string3 = String.format("{\"textures\":{\"SKIN\":{\"url\":\"%s\"}}}", string2);
        String string4 = Base64.getEncoder().encodeToString(string3.getBytes());
        return String.format("SkullOwner:{Id:\"%s\",Name:\"%s\",Properties:{textures:[{Value:\"%s\"}]}}", UUID.randomUUID(), string, string4);
    }
}

