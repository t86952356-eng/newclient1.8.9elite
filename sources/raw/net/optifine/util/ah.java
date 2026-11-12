/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.util.af;
import net.optifine.util.aj;

public class ah {
    public static String[] as(String string, String string2) {
        return ah.b(new String[]{string}, new String[]{string2});
    }

    public static String[] b(String[] stringArray, String[] stringArray2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        IResourcePack[] iResourcePackArray = a.anO();
        for (int i2 = 0; i2 < iResourcePackArray.length; ++i2) {
            IResourcePack iResourcePack = iResourcePackArray[i2];
            String[] stringArray3 = ah.a(iResourcePack, stringArray, stringArray2, null);
            linkedHashSet.addAll(Arrays.asList(stringArray3));
        }
        String[] stringArray4 = linkedHashSet.toArray(new String[linkedHashSet.size()]);
        return stringArray4;
    }

    public static String[] a(IResourcePack iResourcePack, String string, String string2, String[] stringArray) {
        return ah.a(iResourcePack, new String[]{string}, new String[]{string2}, stringArray);
    }

    public static String[] a(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2) {
        return ah.a(iResourcePack, stringArray, stringArray2, null);
    }

    public static String[] a(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2, String[] stringArray3) {
        if (iResourcePack instanceof DefaultResourcePack) {
            return ah.a(iResourcePack, stringArray3);
        }
        if (!(iResourcePack instanceof AbstractResourcePack)) {
            a.warn("Unknown resource pack type: " + String.valueOf(iResourcePack));
            return new String[0];
        }
        AbstractResourcePack abstractResourcePack = (AbstractResourcePack)iResourcePack;
        File file = abstractResourcePack.ccE;
        if (file == null) {
            return new String[0];
        }
        if (file.isDirectory()) {
            return ah.a(file, "", stringArray, stringArray2);
        }
        if (file.isFile()) {
            return ah.a(file, stringArray, stringArray2);
        }
        a.warn("Unknown resource pack file: " + String.valueOf(file));
        return new String[0];
    }

    private static String[] a(IResourcePack iResourcePack, String[] stringArray) {
        if (stringArray == null) {
            return new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            cm cm2 = new cm(string);
            if (!iResourcePack.s(cm2)) continue;
            arrayList.add(string);
        }
        String[] stringArray2 = arrayList.toArray(new String[arrayList.size()]);
        return stringArray2;
    }

    private static String[] a(File file, String string, String[] stringArray, String[] stringArray2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string2 = "assets/minecraft/";
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return new String[0];
        }
        for (int i2 = 0; i2 < fileArray.length; ++i2) {
            Object object;
            File file2 = fileArray[i2];
            if (file2.isFile()) {
                object = string + file2.getName();
                if (!((String)object).startsWith("assets/minecraft/") || !aj.c((String)(object = ((String)object).substring("assets/minecraft/".length())), stringArray) || !aj.d((String)object, stringArray2)) continue;
                arrayList.add(object);
                continue;
            }
            if (!file2.isDirectory()) continue;
            object = string + file2.getName() + "/";
            String[] stringArray3 = ah.a(file2, (String)object, stringArray, stringArray2);
            arrayList.addAll(Arrays.asList(stringArray3));
        }
        String[] stringArray4 = arrayList.toArray(new String[arrayList.size()]);
        return stringArray4;
    }

    private static String[] a(File file, String[] stringArray, String[] stringArray2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "assets/minecraft/";
        try {
            String[] stringArray3;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                stringArray3 = enumeration.nextElement();
                String string2 = stringArray3.getName();
                if (!string2.startsWith("assets/minecraft/") || !aj.c(string2 = string2.substring("assets/minecraft/".length()), stringArray) || !aj.d(string2, stringArray2)) continue;
                arrayList.add(string2);
            }
            zipFile.close();
            stringArray3 = arrayList.toArray(new String[arrayList.size()]);
            return stringArray3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[0];
        }
    }

    private static boolean kc(String string) {
        return string.equals(string.toLowerCase(Locale.ROOT));
    }

    public static Properties at(String string, String string2) {
        cm cm2 = new cm(string);
        try {
            InputStream inputStream = a.u(cm2);
            if (inputStream == null) {
                return null;
            }
            af af2 = new af();
            af2.load(inputStream);
            inputStream.close();
            a.fN(string2 + ": Loading " + string);
            return af2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            a.warn(string2 + ": Error reading " + string);
            return null;
        }
    }

    public static Properties c(InputStream inputStream, String string) {
        if (inputStream == null) {
            return null;
        }
        try {
            af af2 = new af();
            af2.load(inputStream);
            inputStream.close();
            return af2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

