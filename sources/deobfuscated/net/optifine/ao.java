/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.c;
import net.minecraft.entity.item.v;
import net.minecraft.entity.monster.z;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.optifine.an;
import net.optifine.ap;
import net.optifine.config.a;
import net.optifine.config.d;
import net.optifine.config.g;
import net.optifine.config.i;
import net.optifine.reflect.l;
import net.optifine.util.af;

public class ao {
    private static final ap ecf = new ap();
    private static final Map<Class, Integer> ecg = new HashMap<Class, Integer>();
    private static final Map<net.minecraft.item.d, Integer> ech = new HashMap<net.minecraft.item.d, Integer>();
    private static long eci = 0L;
    private static final double ecj = 7.5;
    private static final double eck = 56.25;
    private static final int ecl = 15;
    private static final int ecm = 15;
    private static final int ecn = 10;
    private static final int eco = 8;
    private static final int ecp = 13;
    private static final int ecq = 8;
    private static final int ecr = 8;
    private static boolean Mq;

    public static void a(c c2, RenderGlobal renderGlobal) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(c c2, RenderGlobal renderGlobal) {
        if (c2 == null) {
            return;
        }
        ap ap2 = ecf;
        synchronized (ap2) {
            an an2 = ecf.ji(c2.getEntityId());
            if (an2 != null) {
                an2.b(renderGlobal);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(RenderGlobal renderGlobal) {
        long l2 = System.currentTimeMillis();
        if (l2 >= eci + 50L) {
            eci = l2;
            if (!Mq) {
                ao.oA();
            }
            ap ap2 = ecf;
            synchronized (ap2) {
                ao.c(renderGlobal);
                if (ecf.size() > 0) {
                    List<an> list = ecf.aBk();
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        an an2 = list.get(i2);
                        an2.a(renderGlobal);
                    }
                }
            }
        }
    }

    private static void oA() {
        Mq = true;
        ecg.clear();
        ech.clear();
        String[] stringArray = l.aDH();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            try {
                cm cm2 = new cm(string, "optifine/dynamic_lights.properties");
                InputStream inputStream = net.minecraft.src.a.u(cm2);
                ao.a(inputStream, cm2.toString(), string);
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (ecg.size() > 0) {
            net.minecraft.src.a.fN("DynamicLights entities: " + ecg.size());
        }
        if (ech.size() > 0) {
            net.minecraft.src.a.fN("DynamicLights items: " + ech.size());
        }
    }

    private static void a(InputStream inputStream, String string, String string2) {
        if (inputStream != null) {
            try {
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                net.minecraft.src.a.fN("DynamicLights: Parsing " + string);
                a a2 = new a("DynamicLights");
                ao.a(af2.getProperty("entities"), ecg, new d(), a2, string, string2);
                ao.a(af2.getProperty("items"), ech, new i(), a2, string, string2);
            }
            catch (IOException iOException) {
                net.minecraft.src.a.warn("DynamicLights: Error reading " + string);
            }
        }
    }

    private static void a(String string, Map map, g g2, a a2, String string2, String string3) {
        if (string != null) {
            String[] stringArray = net.minecraft.src.a.V(string, " ");
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string4 = stringArray[i2];
                String[] stringArray2 = net.minecraft.src.a.V(string4, ":");
                if (stringArray2.length != 2) {
                    a2.warn("Invalid entry: " + string4 + ", in:" + string2);
                    continue;
                }
                String string5 = stringArray2[0];
                String string6 = stringArray2[1];
                String string7 = string3 + ":" + string5;
                cm cm2 = new cm(string7);
                Object object = g2.L(cm2);
                if (object == null) {
                    a2.warn("Object not found: " + string7);
                    continue;
                }
                int n2 = a2.x(string6, -1);
                if (n2 >= 0 && n2 <= 15) {
                    map.put(object, new Integer(n2));
                    continue;
                }
                a2.warn("Invalid light level: " + string4);
            }
        }
    }

    private static void c(RenderGlobal renderGlobal) {
        j j2 = renderGlobal.La();
        if (j2 != null) {
            for (c c2 : j2.avA()) {
                an an2;
                int n2;
                int n3 = ao.aG(c2);
                if (n3 > 0) {
                    n2 = c2.getEntityId();
                    an2 = ecf.jh(n2);
                    if (an2 != null) continue;
                    an2 = new an(c2);
                    ecf.a(n2, an2);
                    continue;
                }
                n2 = c2.getEntityId();
                an2 = ecf.ji(n2);
                if (an2 == null) continue;
                an2.b(renderGlobal);
            }
        }
    }

    public static int b(b b2, int n2) {
        double d2 = ao.bz(b2);
        n2 = ao.b(d2, n2);
        return n2;
    }

    public static int f(c c2, int n2) {
        double d2 = ao.aG(c2);
        n2 = ao.b(d2, n2);
        return n2;
    }

    public static int b(double d2, int n2) {
        int n3;
        int n4;
        if (d2 > 0.0 && (n4 = (int)(d2 * 16.0)) > (n3 = n2 & 0xFF)) {
            n2 &= 0xFFFFFF00;
            n2 |= n4;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static double bz(b b2) {
        double d2 = 0.0;
        ap ap2 = ecf;
        synchronized (ap2) {
            List<an> list = ecf.aBk();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d3;
                double d4;
                double d5;
                an an2 = list.get(i2);
                int n2 = an2.aBg();
                if (n2 <= 0) continue;
                double d6 = an2.aBd();
                double d7 = an2.aBe();
                double d8 = an2.aBf();
                double d9 = (double)b2.wt() - d6;
                double d10 = (double)b2.wu() - d7;
                double d11 = (double)b2.wx() - d8;
                double d12 = d9 * d9 + d10 * d10 + d11 * d11;
                if (an2.aBh() && !net.minecraft.src.a.aoe()) {
                    n2 = net.minecraft.src.a.A(n2 - 2, 0, 15);
                    d12 *= 2.0;
                }
                if (!(d12 <= 56.25) || !((d5 = (d4 = 1.0 - (d3 = Math.sqrt(d12)) / 7.5) * (double)n2) > d2)) continue;
                d2 = d5;
            }
        }
        double d13 = net.minecraft.src.a.ab(d2, 0.0, 15.0);
        return d13;
    }

    public static int bb(co co2) {
        Object object;
        Block block;
        if (co2 == null) {
            return 0;
        }
        net.minecraft.item.d d2 = co2.bP();
        if (d2 instanceof net.minecraft.item.af && (block = ((net.minecraft.item.af)(object = (net.minecraft.item.af)d2)).df()) != null) {
            return block.wZ();
        }
        if (d2 == Items.cQC) {
            return Blocks.cLn.wZ();
        }
        if (d2 != Items.cRz && d2 != Items.cRH) {
            if (d2 == Items.cQX) {
                return 8;
            }
            if (d2 == Items.cSH) {
                return 8;
            }
            if (d2 == Items.cRI) {
                return 8;
            }
            if (d2 == Items.cSd) {
                return Blocks.cOa.wZ() / 2;
            }
            if (!ech.isEmpty() && (object = ech.get(d2)) != null) {
                return (Integer)object;
            }
            return 0;
        }
        return 10;
    }

    public static int aG(c c2) {
        Object object;
        if (c2 == net.minecraft.src.a.AZ().BC() && !net.minecraft.src.a.apc()) {
            return 0;
        }
        if (c2 instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)(object = (net.minecraft.entity.player.a)c2)).CZ()) {
            return 0;
        }
        if (c2.isBurning()) {
            return 15;
        }
        if (!ecg.isEmpty() && (object = ecg.get(c2.getClass())) != null) {
            return (Integer)object;
        }
        if (c2 instanceof net.minecraft.entity.projectile.c) {
            return 15;
        }
        if (c2 instanceof v) {
            return 15;
        }
        if (c2 instanceof net.minecraft.entity.monster.a) {
            object = (net.minecraft.entity.monster.a)c2;
            return ((net.minecraft.entity.monster.a)object).YZ() ? 15 : 10;
        }
        if (c2 instanceof z) {
            object = (z)c2;
            return (double)((z)object).cEW > 0.6 ? 13 : 8;
        }
        if (c2 instanceof net.minecraft.entity.monster.d && (double)((net.minecraft.entity.monster.d)(object = (net.minecraft.entity.monster.d)c2)).bf(0.0f) > 0.001) {
            return 15;
        }
        if (c2 instanceof r) {
            object = (r)c2;
            co co2 = ((r)object).Vk();
            int n2 = ao.bb(co2);
            co co3 = ((r)object).eG(4);
            int n3 = ao.bb(co3);
            return Math.max(n2, n3);
        }
        if (c2 instanceof net.minecraft.entity.item.i) {
            object = (net.minecraft.entity.item.i)c2;
            co co4 = ao.e((net.minecraft.entity.item.i)object);
            return ao.bb(co4);
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d(RenderGlobal renderGlobal) {
        ap ap2 = ecf;
        synchronized (ap2) {
            List<an> list = ecf.aBk();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                an an2 = list.get(i2);
                an2.b(renderGlobal);
            }
            ecf.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void clear() {
        ap ap2 = ecf;
        synchronized (ap2) {
            ecf.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int akg() {
        ap ap2 = ecf;
        synchronized (ap2) {
            return ecf.size();
        }
    }

    public static co e(net.minecraft.entity.item.i i2) {
        co co2 = i2.Tp().eq(10);
        return co2;
    }
}

