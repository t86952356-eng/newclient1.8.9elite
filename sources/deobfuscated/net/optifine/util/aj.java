/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class aj {
    public static boolean a(String string, String string2, char c2, char c3) {
        if (string2 != null && string != null) {
            String string3;
            if (string2.indexOf(c2) < 0) {
                return string2.indexOf(c3) < 0 ? string2.equals(string) : aj.a(string, string2, c3);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String string4 = "" + c2;
            if (string2.startsWith(string4)) {
                arrayList.add("");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string2, string4);
            while (stringTokenizer.hasMoreElements()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            if (string2.endsWith(string4)) {
                arrayList.add("");
            }
            if (!aj.c(string, string3 = (String)arrayList.get(0), c3)) {
                return false;
            }
            String string5 = (String)arrayList.get(arrayList.size() - 1);
            if (!aj.b(string, string5, c3)) {
                return false;
            }
            int n2 = 0;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                String string6 = (String)arrayList.get(i2);
                if (string6.length() <= 0) continue;
                int n3 = aj.a(string, string6, n2, c3);
                if (n3 < 0) {
                    return false;
                }
                n2 = n3 + string6.length();
            }
            return true;
        }
        return string2 == string;
    }

    private static boolean a(String string, String string2, char c2) {
        if (string != null && string2 != null) {
            if (string.length() != string2.length()) {
                return false;
            }
            for (int i2 = 0; i2 < string2.length(); ++i2) {
                char c3 = string2.charAt(i2);
                if (c3 == c2 || string.charAt(i2) == c3) continue;
                return false;
            }
            return true;
        }
        return string == string2;
    }

    private static int a(String string, String string2, int n2, char c2) {
        if (string != null && string2 != null) {
            if (n2 >= 0 && n2 <= string.length()) {
                if (string.length() < n2 + string2.length()) {
                    return -1;
                }
                int n3 = n2;
                while (n3 + string2.length() <= string.length()) {
                    String string3 = string.substring(n3, n3 + string2.length());
                    if (aj.a(string3, string2, c2)) {
                        return n3;
                    }
                    ++n3;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    private static boolean b(String string, String string2, char c2) {
        if (string != null && string2 != null) {
            if (string.length() < string2.length()) {
                return false;
            }
            String string3 = string.substring(string.length() - string2.length());
            return aj.a(string3, string2, c2);
        }
        return string == string2;
    }

    private static boolean c(String string, String string2, char c2) {
        if (string != null && string2 != null) {
            if (string.length() < string2.length()) {
                return false;
            }
            String string3 = string.substring(0, string2.length());
            return aj.a(string3, string2, c2);
        }
        return string == string2;
    }

    public static boolean a(String string, String[] stringArray, char c2) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!aj.d(string, string2, c2)) continue;
            return true;
        }
        return false;
    }

    public static boolean d(String string, String string2, char c2) {
        if (string2 != null && string != null) {
            String string3;
            if (string2.indexOf(c2) < 0) {
                return string2.equals(string);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String string4 = "" + c2;
            if (string2.startsWith(string4)) {
                arrayList.add("");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string2, string4);
            while (stringTokenizer.hasMoreElements()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            if (string2.endsWith(string4)) {
                arrayList.add("");
            }
            if (!string.startsWith(string3 = (String)arrayList.get(0))) {
                return false;
            }
            String string5 = (String)arrayList.get(arrayList.size() - 1);
            if (!string.endsWith(string5)) {
                return false;
            }
            int n2 = 0;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                String string6 = (String)arrayList.get(i2);
                if (string6.length() <= 0) continue;
                int n3 = string.indexOf(string6, n2);
                if (n3 < 0) {
                    return false;
                }
                n2 = n3 + string6.length();
            }
            return true;
        }
        return string2 == string;
    }

    public static String[] au(String string, String string2) {
        if (string != null && string.length() > 0) {
            if (string2 == null) {
                return new String[]{string};
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = 0;
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c2 = string.charAt(i2);
                if (!aj.a(c2, string2)) continue;
                arrayList.add(string.substring(n2, i2));
                n2 = i2 + 1;
            }
            arrayList.add(string.substring(n2));
            return arrayList.toArray(new String[arrayList.size()]);
        }
        return new String[0];
    }

    private static boolean a(char c2, String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) != c2) continue;
            return true;
        }
        return false;
    }

    public static boolean av(String string, String string2) {
        if (string != null) {
            string = string.trim();
        }
        if (string2 != null) {
            string2 = string2.trim();
        }
        return aj.a(string, (Object)string2);
    }

    public static boolean fh(String string) {
        return string == null || string.trim().length() <= 0;
    }

    public static String kd(String string) {
        String string2;
        int n2 = aj.x(string, -1);
        if (n2 == -1) {
            return "";
        }
        return (string2 = "" + ++n2).length() > string.length() ? "" : aj.a("" + n2, string.length(), '0');
    }

    public static int x(String string, int n2) {
        if (string == null) {
            return n2;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static boolean ke(String string) {
        return !aj.fh(string);
    }

    public static String aw(String object, String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (((String)object).indexOf(string.charAt(i2)) >= 0) continue;
            object = (String)object + string.charAt(i2);
        }
        return object;
    }

    public static String a(String string, int n2, char c2) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n2) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = n2 - string.length();
        while (stringBuffer.length() < n3) {
            stringBuffer.append(c2);
        }
        return String.valueOf(stringBuffer) + string;
    }

    public static String b(String string, int n2, char c2) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n2) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        while (stringBuffer.length() < n2) {
            stringBuffer.append(c2);
        }
        return stringBuffer.toString();
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2) || object2 != null && object2.equals(object);
    }

    public static boolean c(String string, String[] stringArray) {
        if (string == null) {
            return false;
        }
        if (stringArray == null) {
            return false;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }

    public static boolean d(String string, String[] stringArray) {
        if (string == null) {
            return false;
        }
        if (stringArray == null) {
            return false;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!string.endsWith(string2)) continue;
            return true;
        }
        return false;
    }

    public static String ax(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.startsWith(string2)) {
                string = string.substring(string2.length());
            }
            return string;
        }
        return string;
    }

    public static String ay(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.endsWith(string2)) {
                string = string.substring(0, string.length() - string2.length());
            }
            return string;
        }
        return string;
    }

    public static String h(String string, String string2, String string3) {
        if (string != null && string2 != null) {
            if (!string.endsWith(string2)) {
                return string;
            }
            if (string3 == null) {
                string3 = "";
            }
            string = string.substring(0, string.length() - string2.length());
            return string + string3;
        }
        return string;
    }

    public static String i(String string, String string2, String string3) {
        if (string != null && string2 != null) {
            if (!string.startsWith(string2)) {
                return string;
            }
            if (string3 == null) {
                string3 = "";
            }
            string = string.substring(string2.length());
            return string3 + string;
        }
        return string;
    }

    public static int c(String[] stringArray, String string) {
        if (stringArray != null && string != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string2 = stringArray[i2];
                if (!string2.startsWith(string)) continue;
                return i2;
            }
            return -1;
        }
        return -1;
    }

    public static int d(String[] stringArray, String string) {
        if (stringArray != null && string != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string2 = stringArray[i2];
                if (!string2.endsWith(string)) continue;
                return i2;
            }
            return -1;
        }
        return -1;
    }

    public static String[] a(String[] stringArray, int n2, int n3) {
        if (stringArray == null) {
            return stringArray;
        }
        if (n3 > 0 && n2 < stringArray.length) {
            if (n2 >= n3) {
                return stringArray;
            }
            ArrayList<String> arrayList = new ArrayList<String>(stringArray.length);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                if (i2 >= n2 && i2 < n3) continue;
                arrayList.add(string);
            }
            String[] stringArray2 = arrayList.toArray(new String[arrayList.size()]);
            return stringArray2;
        }
        return stringArray;
    }

    public static String e(String string, String[] stringArray) {
        if (string != null && stringArray != null) {
            String string2;
            int n2 = string.length();
            for (int i2 = 0; i2 < stringArray.length && (string = aj.ay(string, string2 = stringArray[i2])).length() == n2; ++i2) {
            }
            return string;
        }
        return string;
    }

    public static String f(String string, String[] stringArray) {
        if (string != null && stringArray != null) {
            String string2;
            int n2 = string.length();
            for (int i2 = 0; i2 < stringArray.length && (string = aj.ax(string, string2 = stringArray[i2])).length() == n2; ++i2) {
            }
            return string;
        }
        return string;
    }

    public static String a(String string, String[] stringArray, String[] stringArray2) {
        string = aj.f(string, stringArray);
        string = aj.e(string, stringArray2);
        return string;
    }

    public static String j(String string, String string2, String string3) {
        return aj.a(string, new String[]{string2}, new String[]{string3});
    }

    public static String k(String string, String string2, String string3) {
        if (string != null && string2 != null && string3 != null) {
            int n2 = string.indexOf(string2);
            if (n2 < 0) {
                return null;
            }
            int n3 = string.indexOf(string3, n2);
            return n3 < 0 ? null : string.substring(n2, n3 + string3.length());
        }
        return null;
    }

    public static String az(String string, String string2) {
        return string != null && string2 != null ? (string.endsWith(string2) ? string : string + string2) : string;
    }

    public static String aA(String string, String string2) {
        return string != null && string2 != null ? (string.endsWith(string2) ? string : string2 + string) : string;
    }

    public static String aB(String string, String string2) {
        if (string != null && string2 != null) {
            string = aj.aC(string, string2);
            string = aj.aD(string, string2);
            return string;
        }
        return string;
    }

    public static String aC(String string, String string2) {
        if (string != null && string2 != null) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = string.charAt(i2);
                if (string2.indexOf(c2) >= 0) continue;
                return string.substring(i2);
            }
            return "";
        }
        return string;
    }

    public static String aD(String string, String string2) {
        if (string != null && string2 != null) {
            int n2;
            char c2;
            int n3;
            for (n3 = n2 = string.length(); n3 > 0 && string2.indexOf(c2 = string.charAt(n3 - 1)) >= 0; --n3) {
            }
            return n3 == n2 ? string : string.substring(0, n3);
        }
        return string;
    }
}

