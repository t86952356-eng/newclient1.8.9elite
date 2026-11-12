/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.entity.c;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.minecraft.world.l;
import net.optifine.aa;
import net.optifine.override.b;
import net.optifine.util.af;
import net.optifine.util.ah;
import net.optifine.z;

public class ac {
    private static final Minecraft eaj = a.AZ();
    private static final b eak = null;
    private static z[][] eal = null;
    public static boolean eam = ac.aAG();

    public static cm I(cm cm2) {
        return cm2;
    }

    private static cm a(aa aa2, net.minecraft.util.b b2, l l2, cm cm2, GuiScreen guiScreen) {
        z[] zArray = eal[aa2.ordinal()];
        if (zArray != null) {
            for (z z2 : zArray) {
                if (!z2.a(aa2, b2, l2, guiScreen)) continue;
                return z2.I(cm2);
            }
        }
        return cm2;
    }

    private static cm a(aa aa2, c c2, l l2, cm cm2) {
        z[] zArray = eal[aa2.ordinal()];
        if (zArray != null) {
            for (z z2 : zArray) {
                if (!z2.a(aa2, c2, l2)) continue;
                return z2.I(cm2);
            }
        }
        return cm2;
    }

    public static void jA() {
        eal = null;
        if (a.ape()) {
            ArrayList<List<z>> arrayList = new ArrayList<List<z>>();
            IResourcePack[] iResourcePackArray = a.anO();
            for (int i2 = iResourcePackArray.length - 1; i2 >= 0; --i2) {
                IResourcePack iResourcePack = iResourcePackArray[i2];
                ac.a(iResourcePack, arrayList);
            }
            eal = ac.O(arrayList);
        }
    }

    private static z[][] O(List<List<z>> list) {
        if (list.isEmpty()) {
            return null;
        }
        z[][] zArray = new z[aa.eaa.length][];
        for (int i2 = 0; i2 < zArray.length; ++i2) {
            List<z> list2;
            if (list.size() <= i2 || (list2 = list.get(i2)) == null) continue;
            z[] zArray2 = list2.toArray(new z[0]);
            zArray[i2] = zArray2;
        }
        return zArray;
    }

    private static void a(IResourcePack iResourcePack, List<List<z>> list) {
        Object[] objectArray = ah.a(iResourcePack, "optifine/gui/container/", ".properties", null);
        Arrays.sort(objectArray);
        for (Object object : objectArray) {
            a.fN("CustomGuis: " + (String)object);
            try {
                cm cm2 = new cm((String)object);
                InputStream inputStream = iResourcePack.r(cm2);
                if (inputStream == null) {
                    a.warn("CustomGuis file not found: " + (String)object);
                    continue;
                }
                af af2 = new af();
                af2.load(inputStream);
                inputStream.close();
                z z2 = new z(af2, (String)object);
                if (!z2.gY((String)object)) continue;
                ac.a(z2, list);
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.warn("CustomGuis file not found: " + (String)object);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void a(z z2, List<List<z>> list) {
        if (z2.aAC() == null) {
            ac.warn("Invalid container: " + String.valueOf((Object)z2.aAC()));
        } else {
            int n2 = z2.aAC().ordinal();
            while (list.size() <= n2) {
                list.add(null);
            }
            List<z> list2 = list.get(n2);
            if (list2 == null) {
                list2 = new ArrayList<z>();
                list.set(n2, list2);
            }
            list2.add(z2);
        }
    }

    public static b aAF() {
        return eak;
    }

    public static void a(b b2) {
    }

    private static boolean aAG() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26;
    }

    private static void warn(String string) {
        a.warn("[CustomGuis] " + string);
    }
}

