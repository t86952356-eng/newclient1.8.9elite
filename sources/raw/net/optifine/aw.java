/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
package net.optifine;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class aw {
    private static final Splitter edn = Splitter.on((char)'=').limit(2);
    private static final Pattern edo = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");

    public static void aBA() {
        Map map = I18n.Pj();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string = "optifine/lang/";
        String string2 = "en_US";
        String string3 = ".lang";
        arrayList.add("optifine/lang/en_US.lang");
        if (!a.aoH().cia.equals("en_US")) {
            arrayList.add("optifine/lang/" + a.aoH().cia + ".lang");
        }
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        aw.a(a.anQ(), stringArray, map);
        IResourcePack[] iResourcePackArray = a.anO();
        for (int i2 = 0; i2 < iResourcePackArray.length; ++i2) {
            IResourcePack iResourcePack = iResourcePackArray[i2];
            aw.a(iResourcePack, stringArray, map);
        }
    }

    private static void a(IResourcePack iResourcePack, String[] stringArray, Map map) {
        try {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                InputStream inputStream;
                String string = stringArray[i2];
                cm cm2 = new cm(string);
                if (!iResourcePack.s(cm2) || (inputStream = iResourcePack.r(cm2)) == null) continue;
                aw.a(inputStream, map);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void a(InputStream inputStream, Map map) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] stringArray;
            if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)edn.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = edo.matcher(stringArray[1]).replaceAll("%$1s");
            map.put(string2, string3);
        }
    }

    public static String cf(String string) {
        return I18n.a(string, new Object[0]);
    }

    public static String ae(String string, String string2) {
        String string3 = I18n.a(string, new Object[0]);
        return string3 != null && !string3.equals(string) ? string3 : string2;
    }

    public static String aBB() {
        return I18n.a("options.on", new Object[0]);
    }

    public static String aBC() {
        return I18n.a("options.off", new Object[0]);
    }

    public static String aBD() {
        return I18n.a("options.graphics.fast", new Object[0]);
    }

    public static String aBE() {
        return I18n.a("options.graphics.fancy", new Object[0]);
    }

    public static String aBF() {
        return I18n.a("generator.default", new Object[0]);
    }
}

