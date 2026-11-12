/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.ArrayList;
import java.util.List;
import net.optifine.shaders.s;
import net.optifine.shaders.u;

public class v {
    private final List<s> evV = new ArrayList<s>();
    private final s evW = this.a("", u.evO, true);

    public s a(String string, u u2, s s2) {
        int n2 = this.evV.size();
        s s3 = new s(n2, string, u2, s2);
        this.evV.add(s3);
        return s3;
    }

    private s a(String string, u u2, boolean bl2) {
        int n2 = this.evV.size();
        s s2 = new s(n2, string, u2, bl2);
        this.evV.add(s2);
        return s2;
    }

    public s a(String string, s s2) {
        return this.a(string, u.evQ, s2);
    }

    public s iC(String string) {
        return this.a(string, u.evS, this.evW);
    }

    public s iD(String string) {
        return this.a(string, u.evR, this.evW);
    }

    public s b(String string, s s2) {
        return this.a(string, u.evP, s2);
    }

    public s iE(String string) {
        return this.a(string, u.evO, true);
    }

    public s[] R(String string, int n2) {
        s[] sArray = new s[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = i2 == 0 ? string : string + i2;
            sArray[i2] = this.iC(string2);
        }
        return sArray;
    }

    public s[] S(String string, int n2) {
        s[] sArray = new s[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = i2 == 0 ? string : string + i2;
            sArray[i2] = this.iD(string2);
        }
        return sArray;
    }

    public s aEQ() {
        return this.evW;
    }

    public int akg() {
        return this.evV.size();
    }

    public s iF(String string) {
        if (string == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.evV.size(); ++i2) {
            s s2 = this.evV.get(i2);
            String string2 = s2.getName();
            if (!string2.equals(string)) continue;
            return s2;
        }
        return null;
    }

    public String[] aER() {
        String[] stringArray = new String[this.evV.size()];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = this.evV.get(i2).getName();
        }
        return stringArray;
    }

    public s[] aES() {
        s[] sArray = this.evV.toArray(new s[this.evV.size()]);
        return sArray;
    }

    public s[] a(s s2, s s3) {
        int n2;
        int n3 = s2.OY();
        if (n3 > (n2 = s3.OY())) {
            int n4 = n3;
            n3 = n2;
            n2 = n4;
        }
        s[] sArray = new s[n2 - n3 + 1];
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            sArray[i2] = this.evV.get(n3 + i2);
        }
        return sArray;
    }

    public String toString() {
        return this.evV.toString();
    }
}

