/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.optifine.shaders.config.k;

public class z {
    public static Pattern eHQ = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
    public static Pattern eHR = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
    public static Pattern eHS = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
    public static Pattern eHT = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
    public static Pattern eHU = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
    public static Pattern eHV = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
    public static Pattern eHW = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
    public static Pattern eHX = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
    public static Pattern eHY = Pattern.compile(".*deferred[0-9]*\\.fsh");
    public static Pattern eHZ = Pattern.compile(".*composite[0-9]*\\.fsh");
    public static Pattern eIa = Pattern.compile(".*final\\.fsh");
    public static Pattern eIb = Pattern.compile("[0-7N]*");

    public static k jC(String string) {
        Matcher matcher = eHQ.matcher(string);
        if (matcher.matches()) {
            return new k(1, matcher.group(1), "", string);
        }
        Matcher matcher2 = eHR.matcher(string);
        if (matcher2.matches()) {
            return new k(2, matcher2.group(1), "", string);
        }
        Matcher matcher3 = eHW.matcher(string);
        if (matcher3.matches()) {
            return new k(6, matcher3.group(2), matcher3.group(3), string);
        }
        Matcher matcher4 = eHS.matcher(string);
        if (matcher4.matches()) {
            return new k(3, matcher4.group(1), matcher4.group(2), string);
        }
        Matcher matcher5 = eHT.matcher(string);
        if (matcher5.matches()) {
            return new k(4, matcher5.group(1), matcher5.group(2), string);
        }
        Matcher matcher6 = eHV.matcher(string);
        if (matcher6.matches()) {
            return new k(5, matcher6.group(1), matcher6.group(2), string);
        }
        Matcher matcher7 = eHX.matcher(string);
        if (matcher7.matches()) {
            return new k(7, matcher7.group(1), matcher7.group(2), string);
        }
        Matcher matcher8 = eHU.matcher(string);
        return matcher8.matches() ? new k(8, matcher8.group(1), matcher8.group(2), string) : null;
    }

    public static int a(String string, String string2, int n2, int n3) {
        if (string.length() != string2.length() + 1) {
            return -1;
        }
        if (!string.startsWith(string2)) {
            return -1;
        }
        int n4 = string.charAt(string2.length()) - 48;
        return n4 >= n2 && n4 <= n3 ? n4 : -1;
    }

    public static int jD(String string) {
        return string.equals("shadow") ? 0 : (string.equals("watershadow") ? 1 : z.a(string, "shadowtex", 0, 1));
    }

    public static int jE(String string) {
        return string.equals("shadowcolor") ? 0 : z.a(string, "shadowcolor", 0, 1);
    }

    public static int jF(String string) {
        return z.a(string, "depthtex", 0, 2);
    }

    public static int jG(String string) {
        int n2 = z.a(string, "gaux", 1, 4);
        return n2 > 0 ? n2 + 3 : z.a(string, "colortex", 4, 7);
    }

    public static boolean jH(String string) {
        return eHY.matcher(string).matches();
    }

    public static boolean jI(String string) {
        return eHZ.matcher(string).matches();
    }

    public static boolean jJ(String string) {
        return eIa.matcher(string).matches();
    }

    public static boolean jK(String string) {
        return eIb.matcher(string).matches();
    }
}

