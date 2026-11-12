/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import hackclient.rise.fg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.passive.z;
import net.minecraft.src.a;
import net.minecraft.tileentity.d;
import net.minecraft.util.cm;
import net.minecraft.world.w;
import net.optifine.at;
import net.optifine.be;
import net.optifine.bf;
import net.optifine.bh;
import net.optifine.reflect.g;
import net.optifine.util.af;
import net.optifine.util.ah;
import net.optifine.util.aj;
import net.optifine.util.n;
import rise.Client;

public class bd {
    private static final Map<String, bf> edK = new HashMap<String, bf>();
    private static boolean dj = false;
    private static RenderGlobal bgG;
    private static final be edL;
    private static TileEntityRendererDispatcher edM;
    private static final bh edN;
    private static boolean edO;
    public static final String edP = ".png";
    public static final String edQ = ".properties";
    public static final String edR = "textures/entity/";
    public static final String edS = "textures/painting/";
    public static final String edT = "textures/";
    public static final String edU = "optifine/random/";
    public static final String edV = "mcpatcher/mob/";
    private static final String[] edW;
    private static final String edX = "horse/";
    private static final String[] edY;
    private static final String[] edZ;

    public static void a(c c2, w w2) {
        if (w2 != null) {
            net.minecraft.entity.a a2 = c2.Tp();
            a2.crp = c2.yl();
            a2.cro = w2.aF(a2.crp);
            UUID uUID = c2.Ul();
            if (c2 instanceof z) {
                bd.a(uUID, (z)c2);
            }
        }
    }

    public static void b(c c2, w w2) {
    }

    private static void a(UUID uUID, z z2) {
        c c2 = n.o(uUID);
        if (c2 instanceof z) {
            z z3 = (z)c2;
            int n2 = z3.abq();
            z2.fA(n2);
            int n3 = g.a((Object)z3, g.eqX, 0);
            g.b((Object)z2, g.eqX, n3);
            int n4 = g.a((Object)z3, g.eqY, 0);
            g.b((Object)z2, g.eqY, n4);
        }
    }

    public static void a(w w2, w w3) {
        Client.a.e().d(new fg());
        if (w3 != null) {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = w3.avA();
            Iterator<c> iterator = concurrentLinkedQueue.iterator();
            while (iterator.hasNext()) {
                c c2;
                c c3 = c2 = iterator.next();
                bd.a(c3, w3);
            }
        }
        edL.aH(null);
        edN.h(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static cm I(cm cm2) {
        cm cm3;
        Object object;
        if (!dj) {
            return cm2;
        }
        if (edO) {
            return cm2;
        }
        try {
            edO = true;
            at at2 = bd.aBI();
            if (at2 != null) {
                cm cm4;
                object = cm2.atA();
                if (((String)object).startsWith(edX)) {
                    object = bd.K((String)object, edX.length());
                }
                if (!((String)object).startsWith(edR) && !((String)object).startsWith(edS)) {
                    cm cm5;
                    cm cm6 = cm5 = cm2;
                    return cm6;
                }
                bf bf2 = edK.get(object);
                if (bf2 == null) {
                    cm cm7;
                    cm cm8 = cm7 = cm2;
                    return cm8;
                }
                cm cm9 = cm4 = bf2.a(cm2, at2);
                return cm9;
            }
            cm3 = cm2;
        }
        catch (Exception exception) {
            cm cm10 = cm2;
            object = cm10;
            return object;
        }
        finally {
            edO = false;
        }
        return cm3;
    }

    private static String K(String string, int n2) {
        if (edY != null && edZ != null) {
            for (int i2 = 0; i2 < edZ.length; ++i2) {
                String string2 = edZ[i2];
                if (!string.startsWith(string2, n2)) continue;
                return edY[i2];
            }
            return string;
        }
        return string;
    }

    private static at aBI() {
        d d2;
        if (bd.bgG.bOJ != null) {
            edL.aH(bd.bgG.bOJ);
            return edL;
        }
        if (bd.edM.cbe != null && (d2 = bd.edM.cbe).de() != null) {
            edN.h(d2);
            return edN;
        }
        return null;
    }

    private static bf b(cm cm2, boolean bl2) {
        cm[] cmArray;
        String string = cm2.atA();
        cm cm3 = bd.c(cm2, bl2);
        if (cm3 != null && (cmArray = bd.a(cm3, cm2)) != null) {
            return cmArray;
        }
        cmArray = bd.e(cm2, bl2);
        return cmArray == null ? null : new bf(string, cmArray);
    }

    private static bf a(cm cm2, cm cm3) {
        try {
            String string = cm2.atA();
            bd.fN(cm3.atA() + ", properties: " + string);
            InputStream inputStream = a.u(cm2);
            if (inputStream == null) {
                bd.warn("Properties not found: " + string);
                return null;
            }
            af af2 = new af();
            af2.load(inputStream);
            inputStream.close();
            bf bf2 = new bf(af2, string, cm3);
            return !bf2.gY(string) ? null : bf2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            bd.warn("File not found: " + cm3.atA());
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private static cm c(cm cm2, boolean bl2) {
        String string;
        String string2;
        String string3;
        cm cm3 = bd.d(cm2, bl2);
        if (cm3 == null) {
            return null;
        }
        String string4 = cm3.atB();
        cm cm4 = new cm(string4, string3 = (string2 = aj.ay(string = cm3.atA(), edP)) + edQ);
        if (a.F(cm4)) {
            return cm4;
        }
        String string5 = bd.hI(string2);
        if (string5 == null) {
            return null;
        }
        cm cm5 = new cm(string4, string5 + edQ);
        return a.F(cm5) ? cm5 : null;
    }

    protected static cm d(cm cm2, boolean bl2) {
        String string = cm2.atB();
        String string2 = cm2.atA();
        String string3 = edT;
        String string4 = edU;
        if (bl2) {
            string3 = edR;
            string4 = edV;
        }
        if (!string2.startsWith(string3)) {
            return null;
        }
        String string5 = aj.i(string2, string3, string4);
        return new cm(string, string5);
    }

    private static String hH(String string) {
        return string.startsWith(edU) ? aj.i(string, edU, edT) : (string.startsWith(edV) ? aj.i(string, edV, edR) : null);
    }

    protected static cm b(cm cm2, int n2) {
        if (cm2 == null) {
            return null;
        }
        String string = cm2.atA();
        int n3 = string.lastIndexOf(46);
        if (n3 < 0) {
            return null;
        }
        String string2 = string.substring(0, n3);
        String string3 = string.substring(n3);
        String string4 = string2 + n2 + string3;
        cm cm3 = new cm(cm2.atB(), string4);
        return cm3;
    }

    private static String hI(String string) {
        for (int i2 = 0; i2 < edW.length; ++i2) {
            String string2 = edW[i2];
            if (!string.endsWith(string2)) continue;
            String string3 = aj.ay(string, string2);
            return string3;
        }
        return null;
    }

    private static cm[] e(cm cm2, boolean bl2) {
        ArrayList<cm> arrayList = new ArrayList<cm>();
        arrayList.add(cm2);
        cm cm3 = bd.d(cm2, bl2);
        if (cm3 == null) {
            return null;
        }
        for (int i2 = 1; i2 < arrayList.size() + 10; ++i2) {
            int n2 = i2 + 1;
            cm cm4 = bd.b(cm3, n2);
            if (!a.F(cm4)) continue;
            arrayList.add(cm4);
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        cm[] cmArray = arrayList.toArray(new cm[arrayList.size()]);
        bd.fN(cm2.atA() + ", variants: " + cmArray.length);
        return cmArray;
    }

    public static void jA() {
        edK.clear();
        dj = false;
        if (a.aou()) {
            bd.oA();
        }
    }

    private static void oA() {
        bgG = a.anR();
        edM = TileEntityRendererDispatcher.caV;
        String[] stringArray = new String[]{edU, edV};
        String[] stringArray2 = new String[]{edP, edQ};
        String[] stringArray3 = ah.b(stringArray, stringArray2);
        HashSet<String> hashSet = new HashSet<String>();
        for (int i2 = 0; i2 < stringArray3.length; ++i2) {
            bf bf2;
            Object object = stringArray3[i2];
            object = aj.e((String)object, stringArray2);
            object = aj.aD((String)object, "0123456789");
            String string = bd.hH((String)(object = (String)object + edP));
            if (hashSet.contains(string)) continue;
            hashSet.add(string);
            cm cm2 = new cm(string);
            if (!a.F(cm2) || (bf2 = edK.get(string)) != null) continue;
            bf2 = bd.b(cm2, false);
            if (bf2 == null) {
                bf2 = bd.b(cm2, true);
            }
            if (bf2 == null) continue;
            edK.put(string, bf2);
        }
        dj = !edK.isEmpty();
    }

    public static void fN(String string) {
        a.fN("RandomEntities: " + string);
    }

    public static void warn(String string) {
        a.warn("RandomEntities: " + string);
    }

    static {
        edL = new be();
        edN = new bh();
        edO = false;
        edW = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};
        edY = (String[])net.optifine.reflect.n.a(null, f.class, String[].class, 0);
        edZ = (String[])net.optifine.reflect.n.a(null, f.class, String[].class, 1);
    }
}

