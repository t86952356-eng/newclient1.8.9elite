/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.minecraft.client.settings.a;
import net.minecraft.crash.i;
import net.optifine.http.b;
import net.optifine.o;
import net.optifine.shaders.ah;

public class n {
    public static void a(net.minecraft.crash.a a2, i i2) {
        try {
            Throwable throwable = a2.SG();
            if (throwable == null) {
                return;
            }
            if (throwable.getClass().getName().contains(".fml.client.SplashProgress")) {
                return;
            }
            n.d(i2);
            if (throwable.getClass() == Throwable.class) {
                return;
            }
            a a3 = net.minecraft.src.a.aoH();
            if (a3 == null) {
                return;
            }
            if (!a3.cgE) {
                return;
            }
            String string = "http://optifine.net/crashReport";
            String string2 = n.g(a2);
            byte[] byArray = string2.getBytes(StandardCharsets.US_ASCII);
            o o2 = new o();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("OF-Version", net.minecraft.src.a.getVersion());
            hashMap.put("OF-Summary", n.h(a2));
            b b2 = new b("http://optifine.net/crashReport", hashMap, byArray, o2);
            b2.setPriority(10);
            b2.start();
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            net.minecraft.src.a.fN(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static String g(net.minecraft.crash.a a2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OptiFineVersion: ").append(net.minecraft.src.a.getVersion()).append("\n");
        stringBuffer.append("Summary: ").append(n.h(a2)).append("\n");
        stringBuffer.append("\n");
        stringBuffer.append(a2.SI());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String h(net.minecraft.crash.a a2) {
        Throwable throwable = a2.SG();
        if (throwable == null) {
            return "Unknown";
        }
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        String string = "unknown";
        if (stackTraceElementArray.length > 0) {
            string = stackTraceElementArray[0].toString().trim();
        }
        String string2 = throwable.getClass().getName() + ": " + throwable.getMessage() + " (" + a2.getDescription() + ") [" + string + "]";
        return string2;
    }

    public static void d(i i2) {
        i2.b("OptiFine Version", net.minecraft.src.a.getVersion());
        i2.b("OptiFine Build", net.minecraft.src.a.amQ());
        if (net.minecraft.src.a.aoH() != null) {
            i2.b("Render Distance Chunks", "" + net.minecraft.src.a.aoQ());
            i2.b("Mipmaps", "" + net.minecraft.src.a.Ow());
            i2.b("Anisotropic Filtering", "" + net.minecraft.src.a.aof());
            i2.b("Antialiasing", "" + net.minecraft.src.a.aoh());
            i2.b("Multitexture", "" + net.minecraft.src.a.LE());
        }
        i2.b("Shaders", ah.aGB());
        i2.b("OpenGlVersion", net.minecraft.src.a.dnS);
        i2.b("OpenGlRenderer", net.minecraft.src.a.dnT);
        i2.b("OpenGlVendor", net.minecraft.src.a.dnU);
        i2.b("CpuCount", "" + net.minecraft.src.a.aoJ());
    }
}

