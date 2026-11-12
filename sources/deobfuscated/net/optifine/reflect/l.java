/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.p;
import net.minecraft.item.bo;
import net.minecraft.item.co;
import net.minecraft.item.y;
import net.minecraft.util.cm;
import net.minecraft.world.storage.f;
import net.minecraft.world.w;
import net.optifine.reflect.g;

public class l {
    public static Object etg = g.a(g.enM);
    public static Object eth = g.a(g.enL);
    public static Object eti = g.a(g.enN);

    public static void c(cm cm2, String string) {
        if (!g.enU.aDA()) {
            Object object = g.g(g.enR, new Object[0]);
            g.g(object, g.enU, cm2, string);
        }
    }

    public static void O(cm cm2) {
        if (!g.enV.aDA()) {
            Object object = g.g(g.enR, new Object[0]);
            g.g(object, g.enV, cm2);
        }
    }

    public static void f(String string, Object object) {
        Map map = (Map)g.a(g.eqe);
        if (map != null) {
            map.put(string, object);
        }
    }

    public static boolean b(RenderGlobal renderGlobal, float f2, int n2) {
        return g.epm.aDA() && g.b(g.epm, renderGlobal, Float.valueOf(f2), n2);
    }

    public static InputStream ix(String string) {
        byte[] byArray;
        if (!g.ess.aDA()) {
            return null;
        }
        Object object = g.a(g.ess);
        if (object == null) {
            return null;
        }
        if (string.startsWith("/")) {
            string = string.substring(1);
        }
        if ((byArray = (byte[])g.g(object, g.est, string)) == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return byteArrayInputStream;
    }

    public static boolean K(IBlockState iBlockState) {
        Block block = iBlockState.df();
        return !g.eop.aDA() ? block.xj() : g.b((Object)block, g.eop, iBlockState);
    }

    public static boolean bc(co co2) {
        return !g.epx.aDA() ? co2.aee() : g.b((Object)co2.bP(), g.epx, co2);
    }

    public static boolean a(y y2, co co2) {
        int n2 = y2.az(co2);
        return n2 != -1;
    }

    public static f a(bo bo2, co co2, w w2) {
        return g.eoT.aDA() ? ((bo)co2.bP()).a(co2, w2) : bo2.a(co2, w2);
    }

    public static String[] aDH() {
        if (!g.eqk.aDA()) {
            return new String[0];
        }
        Object object = g.g(g.eqm, new Object[0]);
        List list = (List)g.g(object, g.eql, new Object[0]);
        if (list == null) {
            return new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object e2 : list) {
            String string;
            if (!g.eqs.F(e2) || (string = g.f(e2, g.eqt, new Object[0])) == null) continue;
            arrayList.add(string);
        }
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }

    public static boolean a(p p2, w w2, float f2, float f3, float f4) {
        Object object = g.g(g.eoE, p2, w2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        return object == etg || object == eti && p2.UB() && p2.Vh();
    }

    public static boolean a(p p2, w w2, float f2, int n2, float f3) {
        return g.eoF.aDA() && g.b(g.eoF, p2, w2, Float.valueOf(f2), n2, Float.valueOf(f3));
    }
}

