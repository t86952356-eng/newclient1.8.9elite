/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 */
package net.minecraft.command;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.command.as;
import net.minecraft.command.at;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.ax;
import net.minecraft.command.ay;
import net.minecraft.command.az;
import net.minecraft.command.b;
import net.minecraft.command.n;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.item.d;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.util.s;

public abstract class a
implements au {
    private static at cnF;

    public int RS() {
        return 4;
    }

    @Override
    public List<String> RT() {
        return Collections.emptyList();
    }

    @Override
    public boolean a(aw aw2) {
        return aw2.c(this.RS(), this.RX());
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, net.minecraft.util.b b2) {
        return null;
    }

    public static int dM(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ax("commands.generic.num.invalid", string);
        }
    }

    public static int x(String string, int n2) {
        return a.h(string, n2, Integer.MAX_VALUE);
    }

    public static int h(String string, int n2, int n3) {
        int n4 = a.dM(string);
        if (n4 < n2) {
            throw new ax("commands.generic.num.tooSmall", n4, n2);
        }
        if (n4 > n3) {
            throw new ax("commands.generic.num.tooBig", n4, n3);
        }
        return n4;
    }

    public static long dN(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ax("commands.generic.num.invalid", string);
        }
    }

    public static long a(String string, long l2, long l3) {
        long l4 = a.dN(string);
        if (l4 < l2) {
            throw new ax("commands.generic.num.tooSmall", l4, l2);
        }
        if (l4 > l3) {
            throw new ax("commands.generic.num.tooBig", l4, l3);
        }
        return l4;
    }

    public static net.minecraft.util.b a(aw aw2, String[] stringArray, int n2, boolean bl2) {
        net.minecraft.util.b b2 = aw2.yl();
        return new net.minecraft.util.b(a.b(b2.wt(), stringArray[n2], -30000000, 30000000, bl2), a.b(b2.wu(), stringArray[n2 + 1], 0, 256, false), a.b(b2.wx(), stringArray[n2 + 2], -30000000, 30000000, bl2));
    }

    public static double dO(String string) {
        try {
            double d2 = Double.parseDouble(string);
            if (!Doubles.isFinite((double)d2)) {
                throw new ax("commands.generic.num.invalid", string);
            }
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ax("commands.generic.num.invalid", string);
        }
    }

    public static double a(String string, double d2) {
        return a.a(string, d2, Double.MAX_VALUE);
    }

    public static double a(String string, double d2, double d3) {
        double d4 = a.dO(string);
        if (d4 < d2) {
            throw new ax("commands.generic.double.tooSmall", d4, d2);
        }
        if (d4 > d3) {
            throw new ax("commands.generic.double.tooBig", d4, d3);
        }
        return d4;
    }

    public static boolean dP(String string) {
        if (!string.equals("true") && !string.equals("1")) {
            if (!string.equals("false") && !string.equals("0")) {
                throw new n("commands.generic.boolean.invalid", string);
            }
            return false;
        }
        return true;
    }

    public static e b(aw aw2) {
        if (aw2 instanceof e) {
            return (e)aw2;
        }
        throw new ay("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static e a(aw aw2, String string) {
        e e2 = az.j(aw2, string);
        if (e2 == null) {
            try {
                e2 = MinecraftServer.afs().alE().m(UUID.fromString(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (e2 == null) {
            e2 = MinecraftServer.afs().alE().fG(string);
        }
        if (e2 == null) {
            throw new ay();
        }
        return e2;
    }

    public static c b(aw aw2, String string) {
        return a.a(aw2, string, c.class);
    }

    public static <T extends c> T a(aw aw2, String string, Class<? extends T> clazz) {
        Object object = az.b(aw2, string, clazz);
        MinecraftServer minecraftServer = MinecraftServer.afs();
        if (object == null) {
            object = minecraftServer.alE().fG(string);
        }
        if (object == null) {
            try {
                UUID uUID = UUID.fromString(string);
                object = minecraftServer.j(uUID);
                if (object == null) {
                    object = minecraftServer.alE().m(uUID);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new as("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (object != null && clazz.isAssignableFrom(object.getClass())) {
            return (T)object;
        }
        throw new as();
    }

    public static List<c> c(aw aw2, String string) {
        return az.dU(string) ? az.c(aw2, string, c.class) : Lists.newArrayList((Object[])new c[]{a.b(aw2, string)});
    }

    public static String d(aw aw2, String string) {
        try {
            return a.a(aw2, string).xU();
        }
        catch (ay ay2) {
            if (az.dU(string)) {
                throw ay2;
            }
            return string;
        }
    }

    public static String e(aw aw2, String string) {
        try {
            return a.a(aw2, string).xU();
        }
        catch (ay ay2) {
            try {
                return a.b(aw2, string).Ul().toString();
            }
            catch (as as2) {
                if (az.dU(string)) {
                    throw as2;
                }
                return string;
            }
        }
    }

    public static ba a(aw aw2, String[] stringArray, int n2) {
        return a.b(aw2, stringArray, n2, false);
    }

    public static ba b(aw aw2, String[] stringArray, int n2, boolean bl2) {
        s s2 = new s("");
        for (int i2 = n2; i2 < stringArray.length; ++i2) {
            if (i2 > n2) {
                s2.ga(" ");
            }
            ba ba2 = new s(stringArray[i2]);
            if (bl2) {
                ba ba3 = az.k(aw2, stringArray[i2]);
                if (ba3 == null) {
                    if (az.dU(stringArray[i2])) {
                        throw new ay();
                    }
                } else {
                    ba2 = ba3;
                }
            }
            s2.n(ba2);
        }
        return s2;
    }

    public static String c(String[] stringArray, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < stringArray.length; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(" ");
            }
            String string = stringArray[i2];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static b a(double d2, String string, boolean bl2) {
        return a.a(d2, string, -30000000, 30000000, bl2);
    }

    public static b a(double d2, String string, int n2, int n3, boolean bl2) {
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new ax("commands.generic.num.invalid", d2);
        }
        double d3 = 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += a.dO(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (d3 < (double)n2) {
                throw new ax("commands.generic.double.tooSmall", d3, n2);
            }
            if (d3 > (double)n3) {
                throw new ax("commands.generic.double.tooBig", d3, n3);
            }
        }
        return new b(d3 + (bl3 ? d2 : 0.0), d3, bl3);
    }

    public static double b(double d2, String string, boolean bl2) {
        return a.b(d2, string, -30000000, 30000000, bl2);
    }

    public static double b(double d2, String string, int n2, int n3, boolean bl2) {
        double d3;
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new ax("commands.generic.num.invalid", d2);
        }
        double d4 = d3 = bl3 ? d2 : 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += a.dO(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (d3 < (double)n2) {
                throw new ax("commands.generic.double.tooSmall", d3, n2);
            }
            if (d3 > (double)n3) {
                throw new ax("commands.generic.double.tooBig", d3, n3);
            }
        }
        return d3;
    }

    public static d f(aw aw2, String string) {
        cm cm2 = new cm(string);
        d d2 = d.cVi.w(cm2);
        if (d2 == null) {
            throw new ax("commands.give.item.notFound", cm2);
        }
        return d2;
    }

    public static Block g(aw aw2, String string) {
        cm cm2 = new cm(string);
        if (!Block.aRV.containsKey(cm2)) {
            throw new ax("commands.give.block.notFound", cm2);
        }
        Block block = Block.aRV.w(cm2);
        if (block == null) {
            throw new ax("commands.give.block.notFound", cm2);
        }
        return block;
    }

    public static String b(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            String string = objectArray[i2].toString();
            if (i2 > 0) {
                if (i2 == objectArray.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static ba z(List<ba> list) {
        s s2 = new s("");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 > 0) {
                if (i2 == list.size() - 1) {
                    s2.ga(" and ");
                } else if (i2 > 0) {
                    s2.ga(", ");
                }
            }
            s2.n(list.get(i2));
        }
        return s2;
    }

    public static String c(Collection<String> collection) {
        return a.b(collection.toArray(new String[collection.size()]));
    }

    public static List<String> a(String[] stringArray, int n2, net.minecraft.util.b b2) {
        String string;
        if (b2 == null) {
            return null;
        }
        int n3 = stringArray.length - 1;
        if (n3 == n2) {
            string = Integer.toString(b2.wt());
        } else if (n3 == n2 + 1) {
            string = Integer.toString(b2.wu());
        } else {
            if (n3 != n2 + 2) {
                return null;
            }
            string = Integer.toString(b2.wx());
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    public static List<String> b(String[] stringArray, int n2, net.minecraft.util.b b2) {
        String string;
        if (b2 == null) {
            return null;
        }
        int n3 = stringArray.length - 1;
        if (n3 == n2) {
            string = Integer.toString(b2.wt());
        } else {
            if (n3 != n2 + 1) {
                return null;
            }
            string = Integer.toString(b2.wx());
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    public static boolean N(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List<String> a(String[] stringArray, String ... stringArray2) {
        return a.a(stringArray, Arrays.asList(stringArray2));
    }

    public static List<String> a(String[] stringArray, Collection<?> collection) {
        String string = stringArray[stringArray.length - 1];
        ArrayList arrayList = Lists.newArrayList();
        if (!collection.isEmpty()) {
            for (Object object : Iterables.transform(collection, (Function)Functions.toStringFunction())) {
                if (!a.N(string, (String)object)) continue;
                arrayList.add(object);
            }
            if (arrayList.isEmpty()) {
                for (Object object : collection) {
                    if (!(object instanceof cm) || !a.N(string, ((cm)object).atA())) continue;
                    arrayList.add(String.valueOf(object));
                }
            }
        }
        return arrayList;
    }

    @Override
    public boolean d(String[] stringArray, int n2) {
        return false;
    }

    public static void a(aw aw2, au au2, String string, Object ... objectArray) {
        a.a(aw2, au2, 0, string, objectArray);
    }

    public static void a(aw aw2, au au2, int n2, String string, Object ... objectArray) {
        if (cnF != null) {
            cnF.a(aw2, au2, n2, string, objectArray);
        }
    }

    public static void a(at at2) {
        cnF = at2;
    }

    public int a(au au2) {
        return this.RX().compareTo(au2.RX());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((au)object);
    }
}

