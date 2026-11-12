/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.src.a;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.e;
import net.optifine.shaders.config.l;
import net.optifine.shaders.config.m;
import net.optifine.shaders.config.o;

public class d {
    public static InputStream b(InputStream inputStream, String string) {
        Object object;
        Object object2 = a.a(inputStream, "ASCII");
        String string2 = d.ja((String)object2);
        if (!string2.isEmpty()) {
            object2 = string2 + (String)object2;
            if (ah.eEi) {
                object = string.replace(':', '/') + ".pre";
                ah.aj((String)object, (String)object2);
            }
            object2 = d.iZ((String)object2);
        }
        if (ah.eEi) {
            object = string.replace(':', '/');
            ah.aj((String)object, (String)object2);
        }
        object = ((String)object2).getBytes(StandardCharsets.US_ASCII);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        return byteArrayInputStream;
    }

    public static String iZ(String string) {
        StringReader stringReader = new StringReader(string);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        e e2 = new e();
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String string2;
            if ((string2 = bufferedReader.readLine()) == null) {
                string2 = stringBuilder.toString();
                return string2;
            }
            if (!e2.jb(string2) || e.jc(string2)) continue;
            stringBuilder.append(string2);
            stringBuilder.append("\n");
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String ja(String var0) {
        var1_1 = new StringBuilder();
        var2_2 = null;
        var3_3 = null;
        var4_4 = new StringReader(var0);
        var5_5 = new BufferedReader(var4_4);
        block0: while (true) {
            if ((var6_6 = var5_5.readLine()) == null) {
                return var1_1.toString();
            }
            if (!e.jc(var6_6)) continue;
            if (var1_1.length() == 0) {
                var1_1.append(m.aIb());
            }
            if (var3_3 == null) {
                var3_3 = new ArrayList<l>(Arrays.asList(m.aIa()));
            }
            var7_7 = var3_3.iterator();
            while (true) {
                if (var7_7.hasNext()) ** break;
                continue block0;
                var8_8 = (l)var7_7.next();
                if (!var6_6.contains(var8_8.getName())) continue;
                var1_1.append(var8_8.aHV());
                var1_1.append("\n");
                var7_7.remove();
            }
            break;
        }
    }

    private static List<o> aHr() {
        ArrayList<o> arrayList = new ArrayList<o>();
        o[] oArray = ah.aFe();
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            o o2 = oArray[i2];
            String string = o2.aHV();
            if (string == null || !string.startsWith("#")) continue;
            arrayList.add(o2);
        }
        return arrayList;
    }
}

