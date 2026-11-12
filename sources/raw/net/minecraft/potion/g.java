/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.potion;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.potion.a;
import net.minecraft.potion.d;
import net.minecraft.util.bl;
import net.optifine.s;

public class g {
    public static final String dhp = null;
    public static final String dhq = "-0+1-2-3&4-4+13";
    public static final String dhr = "+0-1-2-3&4-4+13";
    public static final String dhs = "-0-1+2-3&4-4+13";
    public static final String dht = "-0+3-4+13";
    public static final String dhu = "+0-1+2-3&4-4+13";
    public static final String dhv = "+0-1-2+3&4-4+13";
    public static final String dhw = "+0+1-2-3&4-4+13";
    public static final String dhx = "-5+6-7";
    public static final String dhy = "+5-6-7";
    public static final String dhz = "+14&13-13";
    public static final String dhA = "-0+1+2-3+13&4-4";
    public static final String dhB = "+0-1+2+3+13&4-4";
    public static final String dhC = "+0+1-2+3&4-4+13";
    private static final Map<Integer, String> dhD = Maps.newHashMap();
    private static final Map<Integer, String> dhE = Maps.newHashMap();
    private static final Map<Integer, Integer> dhF = Maps.newHashMap();
    private static final String[] dhG = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};

    public static boolean av(int n2, int n3) {
        return (n2 & 1 << n3) != 0;
    }

    private static int aw(int n2, int n3) {
        return g.av(n2, n3) ? 1 : 0;
    }

    private static int ax(int n2, int n3) {
        return g.av(n2, n3) ? 0 : 1;
    }

    public static int gJ(int n2) {
        return g.g(n2, 5, 4, 3, 2, 1);
    }

    public static int d(Collection<d> collection) {
        int n2 = 3694022;
        if (collection != null && !collection.isEmpty()) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (d d2 : collection) {
                if (!d2.ajh()) continue;
                int n3 = a.dgt[d2.aje()].ajc();
                if (net.minecraft.src.a.aow()) {
                    n3 = s.bC(d2.aje(), n3);
                }
                for (int i2 = 0; i2 <= d2.ajf(); ++i2) {
                    f2 += (float)(n3 >> 16 & 0xFF) / 255.0f;
                    f3 += (float)(n3 >> 8 & 0xFF) / 255.0f;
                    f4 += (float)(n3 & 0xFF) / 255.0f;
                    f5 += 1.0f;
                }
            }
            if (f5 == 0.0f) {
                return 0;
            }
            f2 = f2 / f5 * 255.0f;
            f3 = f3 / f5 * 255.0f;
            f4 = f4 / f5 * 255.0f;
            return (int)f2 << 16 | (int)f3 << 8 | (int)f4;
        }
        return net.minecraft.src.a.aow() ? s.bC(0, 3694022) : 3694022;
    }

    public static boolean e(Collection<d> collection) {
        for (d d2 : collection) {
            if (d2.ajg()) continue;
            return false;
        }
        return true;
    }

    public static int q(int n2, boolean bl2) {
        Integer n3 = bl.hK(n2);
        if (!bl2) {
            if (dhF.containsKey(n3)) {
                return dhF.get(n3);
            }
            int n4 = g.d(g.r(n3, false));
            dhF.put(n3, n4);
            return n4;
        }
        return g.d(g.r(n3, true));
    }

    public static String gK(int n2) {
        int n3 = g.gJ(n2);
        return dhG[n3];
    }

    private static int a(boolean bl2, boolean bl3, boolean bl4, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        if (bl2) {
            n6 = g.ax(n5, n3);
        } else if (n2 != -1) {
            if (n2 == 0 && g.gL(n5) == n3) {
                n6 = 1;
            } else if (n2 == 1 && g.gL(n5) > n3) {
                n6 = 1;
            } else if (n2 == 2 && g.gL(n5) < n3) {
                n6 = 1;
            }
        } else {
            n6 = g.aw(n5, n3);
        }
        if (bl3) {
            n6 *= n4;
        }
        if (bl4) {
            n6 *= -1;
        }
        return n6;
    }

    private static int gL(int n2) {
        int n3 = 0;
        while (n2 > 0) {
            n2 &= n2 - 1;
            ++n3;
        }
        return n3;
    }

    private static int c(String string, int n2, int n3, int n4) {
        if (n2 < string.length() && n3 >= 0 && n2 < n3) {
            int n5 = string.indexOf(124, n2);
            if (n5 >= 0 && n5 < n3) {
                int n6 = g.c(string, n2, n5 - 1, n4);
                if (n6 > 0) {
                    return n6;
                }
                int n7 = g.c(string, n5 + 1, n3, n4);
                return n7 > 0 ? n7 : 0;
            }
            int n8 = string.indexOf(38, n2);
            if (n8 >= 0 && n8 < n3) {
                int n9 = g.c(string, n2, n8 - 1, n4);
                if (n9 <= 0) {
                    return 0;
                }
                int n10 = g.c(string, n8 + 1, n3, n4);
                return n10 <= 0 ? 0 : (n9 > n10 ? n9 : n10);
            }
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            boolean bl6 = false;
            int n11 = -1;
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            for (int i2 = n2; i2 < n3; ++i2) {
                char c2 = string.charAt(i2);
                if (c2 >= '0' && c2 <= '9') {
                    if (bl2) {
                        n13 = c2 - 48;
                        bl3 = true;
                        continue;
                    }
                    n12 *= 10;
                    n12 += c2 - 48;
                    bl4 = true;
                    continue;
                }
                if (c2 == '*') {
                    bl2 = true;
                    continue;
                }
                if (c2 == '!') {
                    if (bl4) {
                        n14 += g.a(bl5, bl3, bl6, n11, n12, n13, n4);
                        bl5 = false;
                        bl6 = false;
                        bl2 = false;
                        bl3 = false;
                        bl4 = false;
                        n13 = 0;
                        n12 = 0;
                        n11 = -1;
                    }
                    bl5 = true;
                    continue;
                }
                if (c2 == '-') {
                    if (bl4) {
                        n14 += g.a(bl5, bl3, bl6, n11, n12, n13, n4);
                        bl5 = false;
                        bl6 = false;
                        bl2 = false;
                        bl3 = false;
                        bl4 = false;
                        n13 = 0;
                        n12 = 0;
                        n11 = -1;
                    }
                    bl6 = true;
                    continue;
                }
                if (c2 != '=' && c2 != '<' && c2 != '>') {
                    if (c2 != '+' || !bl4) continue;
                    n14 += g.a(bl5, bl3, bl6, n11, n12, n13, n4);
                    bl5 = false;
                    bl6 = false;
                    bl2 = false;
                    bl3 = false;
                    bl4 = false;
                    n13 = 0;
                    n12 = 0;
                    n11 = -1;
                    continue;
                }
                if (bl4) {
                    n14 += g.a(bl5, bl3, bl6, n11, n12, n13, n4);
                    bl5 = false;
                    bl6 = false;
                    bl2 = false;
                    bl3 = false;
                    bl4 = false;
                    n13 = 0;
                    n12 = 0;
                    n11 = -1;
                }
                if (c2 == '=') {
                    n11 = 0;
                    continue;
                }
                if (c2 == '<') {
                    n11 = 2;
                    continue;
                }
                if (c2 != '>') continue;
                n11 = 1;
            }
            if (bl4) {
                n14 += g.a(bl5, bl3, bl6, n11, n12, n13, n4);
            }
            return n14;
        }
        return 0;
    }

    public static List<d> r(int n2, boolean bl2) {
        ArrayList arrayList = null;
        for (a a2 : a.dgt) {
            int n3;
            String string;
            if (a2 == null || a2.ajb() && !bl2 || (string = dhD.get(a2.getId())) == null || (n3 = g.c(string, 0, string.length(), n2)) <= 0) continue;
            int n4 = 0;
            String string2 = dhE.get(a2.getId());
            if (string2 != null && (n4 = g.c(string2, 0, string2.length(), n2)) < 0) {
                n4 = 0;
            }
            if (a2.aiW()) {
                n3 = 1;
            } else {
                n3 = 1200 * (n3 * 3 + (n3 - 1) * 2);
                n3 >>= n4;
                n3 = (int)Math.round((double)n3 * a2.aja());
                if ((n2 & 0x4000) != 0) {
                    n3 = (int)Math.round((double)n3 * 0.75 + 0.5);
                }
            }
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            d d2 = new d(a2.getId(), n3, n4);
            if ((n2 & 0x4000) != 0) {
                d2.bV(true);
            }
            arrayList.add(d2);
        }
        return arrayList;
    }

    private static int a(int n2, int n3, boolean bl2, boolean bl3, boolean bl4) {
        if (bl4) {
            if (!g.av(n2, n3)) {
                return 0;
            }
        } else {
            n2 = bl2 ? (n2 &= ~(1 << n3)) : (bl3 ? ((n2 & 1 << n3) == 0 ? (n2 |= 1 << n3) : (n2 &= ~(1 << n3))) : (n2 |= 1 << n3));
        }
        return n2;
    }

    public static int e(int n2, String string) {
        boolean bl2 = false;
        int n3 = string.length();
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= '0' && c2 <= '9') {
                n4 *= 10;
                n4 += c2 - 48;
                bl3 = true;
                continue;
            }
            if (c2 == '!') {
                if (bl3) {
                    n2 = g.a(n2, n4, bl5, bl4, bl6);
                    bl6 = false;
                    bl4 = false;
                    bl5 = false;
                    bl3 = false;
                    n4 = 0;
                }
                bl4 = true;
                continue;
            }
            if (c2 == '-') {
                if (bl3) {
                    n2 = g.a(n2, n4, bl5, bl4, bl6);
                    bl6 = false;
                    bl4 = false;
                    bl5 = false;
                    bl3 = false;
                    n4 = 0;
                }
                bl5 = true;
                continue;
            }
            if (c2 == '+') {
                if (!bl3) continue;
                n2 = g.a(n2, n4, bl5, bl4, bl6);
                bl6 = false;
                bl4 = false;
                bl5 = false;
                bl3 = false;
                n4 = 0;
                continue;
            }
            if (c2 != '&') continue;
            if (bl3) {
                n2 = g.a(n2, n4, bl5, bl4, bl6);
                bl6 = false;
                bl4 = false;
                bl5 = false;
                bl3 = false;
                n4 = 0;
            }
            bl6 = true;
        }
        if (bl3) {
            n2 = g.a(n2, n4, bl5, bl4, bl6);
        }
        return n2 & Short.MAX_VALUE;
    }

    public static int g(int n2, int n3, int n4, int n5, int n6, int n7) {
        return (g.av(n2, n3) ? 16 : 0) | (g.av(n2, n4) ? 8 : 0) | (g.av(n2, n5) ? 4 : 0) | (g.av(n2, n6) ? 2 : 0) | (g.av(n2, n7) ? 1 : 0);
    }

    static {
        dhD.put(a.dgF.getId(), "0 & !1 & !2 & !3 & 0+6");
        dhD.put(a.dgw.getId(), "!0 & 1 & !2 & !3 & 1+6");
        dhD.put(a.dgH.getId(), "0 & 1 & !2 & !3 & 0+6");
        dhD.put(a.dgB.getId(), "0 & !1 & 2 & !3");
        dhD.put(a.dgO.getId(), "!0 & !1 & 2 & !3 & 2+6");
        dhD.put(a.dgN.getId(), "!0 & !1 & !2 & 3 & 3+6");
        dhD.put(a.dgC.getId(), "!0 & !1 & 2 & 3");
        dhD.put(a.dgx.getId(), "!0 & 1 & !2 & 3 & 3+6");
        dhD.put(a.dgA.getId(), "0 & !1 & !2 & 3 & 3+6");
        dhD.put(a.dgL.getId(), "!0 & 1 & 2 & !3 & 2+6");
        dhD.put(a.dgJ.getId(), "!0 & 1 & 2 & 3 & 2+6");
        dhD.put(a.dgI.getId(), "0 & !1 & 2 & 3 & 2+6");
        dhD.put(a.dgD.getId(), "0 & 1 & !2 & 3 & 3+6");
        dhE.put(a.dgw.getId(), "5");
        dhE.put(a.dgy.getId(), "5");
        dhE.put(a.dgA.getId(), "5");
        dhE.put(a.dgF.getId(), "5");
        dhE.put(a.dgC.getId(), "5");
        dhE.put(a.dgB.getId(), "5");
        dhE.put(a.dgG.getId(), "5");
        dhE.put(a.dgO.getId(), "5");
        dhE.put(a.dgD.getId(), "5");
    }
}

