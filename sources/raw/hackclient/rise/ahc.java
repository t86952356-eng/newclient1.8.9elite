/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class ahc {
    public static final int aKR = 18;
    public static final int aKS = 0;
    public static final int aKT = 0;
    public static final int aKU = 1;
    public static final int aKV = 2;
    public static final int aKW = 3;
    public static final int aKX = 4;
    public static final int aKY = 5;
    public static final int aKZ = 6;
    public static final int aLa = 7;
    public static final int aLb = 8;
    public static final int aLc = 9;
    public static final int aLd = 10;
    public static final int aLe = 11;
    public static final int aLf = 12;
    public static final int aLg = 13;
    public static final int aLh = 14;
    public static final int aLi = 15;
    public static final int aLj = 16;
    public static final int aLk = 17;
    public static final int aLl = 18;
    public static final int aLm = 19;
    public static final int aLn = 20;
    public static final int aLo = 21;
    public static final int aLp = 22;
    public static final int aLq = 23;
    public static final int aLr = 24;
    public static final int aLs = 25;
    public static final int aLt = 26;
    public static final int aLu = 27;
    public static final int aLv = 28;
    public static final int aLw = 29;
    public static final int aLx = 30;
    public static final int aLy = 31;
    public static final int aLz = 32;
    public static final int aLA = 33;
    public static final int aLB = 34;
    public static final int aLC = 35;
    public static final int aLD = 36;
    public static final int aLE = 37;
    public static final int aLF = 38;
    public static final int aLG = 39;
    public static final int aLH = 40;
    public static final int aLI = 41;
    public static final int aLJ = 42;
    public static final int aLK = 43;
    public static final int aLL = 44;
    public static final int aLM = 45;
    public static final int aLN = 46;
    public static final int aLO = 47;
    public static final int aLP = 48;
    public static final int aLQ = 49;
    public static final int aLR = 50;
    public static final int aLS = 51;
    public static final int aLT = 52;
    public static final int aLU = 53;
    public static final int aLV = 54;
    public static final int aLW = 55;
    public static final int aLX = 56;
    public static final int aLY = 57;
    public static final int aLZ = 58;
    public static final int aMa = 59;
    public static final int aMb = 60;
    public static final int aMc = 61;
    public static final int aMd = 62;
    public static final int aMe = 63;
    public static final int aMf = 64;
    public static final int aMg = 65;
    public static final int aMh = 66;
    public static final int aMi = 67;
    public static final int aMj = 68;
    public static final int aMk = 69;
    public static final int aMl = 70;
    public static final int aMm = 71;
    public static final int aMn = 72;
    public static final int aMo = 73;
    public static final int aMp = 74;
    public static final int aMq = 75;
    public static final int aMr = 76;
    public static final int aMs = 77;
    public static final int aMt = 78;
    public static final int aMu = 79;
    public static final int aMv = 80;
    public static final int aMw = 81;
    public static final int aMx = 82;
    public static final int aMy = 83;
    public static final int aMz = 87;
    public static final int aMA = 88;
    public static final int aMB = 100;
    public static final int aMC = 101;
    public static final int aMD = 102;
    public static final int aME = 103;
    public static final int aMF = 104;
    public static final int aMG = 105;
    public static final int aMH = 112;
    public static final int aMI = 113;
    public static final int aMJ = 121;
    public static final int aMK = 123;
    public static final int aML = 125;
    public static final int aMM = 141;
    public static final int aMN = 144;
    public static final int aMO = 145;
    public static final int aMP = 146;
    public static final int aMQ = 147;
    public static final int aMR = 148;
    public static final int aMS = 149;
    public static final int aMT = 150;
    public static final int aMU = 151;
    public static final int aMV = 156;
    public static final int aMW = 157;
    public static final int aMX = 167;
    public static final int aMY = 179;
    public static final int aMZ = 181;
    public static final int aNa = 183;
    public static final int aNb = 184;
    public static final int aNc = 196;
    public static final int aNd = 197;
    public static final int aNe = 199;
    public static final int aNf = 200;
    public static final int aNg = 201;
    public static final int aNh = 203;
    public static final int aNi = 205;
    public static final int aNj = 207;
    public static final int aNk = 208;
    public static final int aNl = 209;
    public static final int aNm = 210;
    public static final int aNn = 211;
    public static final int aNo = 218;
    public static final int aNp = 219;
    public static final int aNq = 220;
    public static final int aNr = 221;
    public static final int aNs = 222;
    public static final int aNt = 223;
    public static final int aNu = 224;
    public static final int aNv = 225;
    public static final int aNw = 226;
    public static final int aNx = 227;
    public static final int aNy = 228;
    public static final int aNz = 229;
    private static final String[] aNA = new String[256];
    private static final Map<String, Integer> aNB = new HashMap<String, Integer>(253);

    public static synchronized String au(int n2) {
        return aNA[n2];
    }

    public static synchronized int ce(String string) {
        Integer n2 = aNB.get(string);
        return n2 == null ? 0 : n2;
    }

    static {
        Field[] fieldArray = ahc.class.getFields();
        try {
            Field[] fieldArray2 = fieldArray;
            int n2 = fieldArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string;
                Field field = fieldArray2[i2];
                if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isPublic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers()) || !field.getType().equals(Integer.TYPE) || !field.getName().startsWith("INPUT_") || field.getName().endsWith("WIN")) continue;
                int n3 = field.getInt(null);
                ahc.aNA[n3] = string = field.getName().substring(10);
                aNB.put(string, n3);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

