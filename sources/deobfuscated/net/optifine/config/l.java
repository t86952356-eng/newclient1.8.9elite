/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
package net.optifine.config;

import java.util.Arrays;
import java.util.regex.Pattern;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.q;
import net.minecraft.nbt.s;
import net.minecraft.nbt.t;
import net.minecraft.nbt.v;
import net.minecraft.nbt.w;
import net.minecraft.nbt.y;
import net.minecraft.nbt.z;
import net.minecraft.src.a;
import net.optifine.util.aj;
import org.apache.commons.lang3.StringEscapeUtils;

public class l {
    private String[] efd = null;
    private String gK = null;
    private boolean efe = false;
    private int bif = 0;
    private String cpv = null;
    private int eff = 0;
    private static final int efg = 0;
    private static final int efh = 1;
    private static final int efi = 2;
    private static final int efj = 3;
    private static final int efk = 4;
    private static final String efl = "pattern:";
    private static final String efm = "ipattern:";
    private static final String efn = "regex:";
    private static final String efo = "iregex:";
    private static final int efp = 0;
    private static final int efq = 1;
    private static final String efr = "#";
    private static final Pattern efs = Pattern.compile("^#[0-9a-f]{6}+$");

    public l(String string, String string2) {
        String[] stringArray = a.V(string, ".");
        this.efd = Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.gK = stringArray[stringArray.length - 1];
        if (string2.startsWith("!")) {
            this.efe = true;
            string2 = string2.substring(1);
        }
        if (string2.startsWith(efl)) {
            this.bif = 1;
            string2 = string2.substring(efl.length());
        } else if (string2.startsWith(efm)) {
            this.bif = 2;
            string2 = string2.substring(efm.length()).toLowerCase();
        } else if (string2.startsWith(efn)) {
            this.bif = 3;
            string2 = string2.substring(efn.length());
        } else if (string2.startsWith(efo)) {
            this.bif = 4;
            string2 = string2.substring(efo.length()).toLowerCase();
        } else {
            this.bif = 0;
        }
        string2 = StringEscapeUtils.unescapeJava((String)string2);
        if (this.bif == 0 && efs.matcher(string2).matches()) {
            this.eff = 1;
        }
        this.cpv = string2;
    }

    public boolean Q(n n2) {
        return this.efe != this.R(n2);
    }

    public boolean R(n n2) {
        if (n2 == null) {
            return false;
        }
        g g2 = n2;
        for (int i2 = 0; i2 < this.efd.length; ++i2) {
            String string = this.efd[i2];
            if ((g2 = l.a(g2, string)) != null) continue;
            return false;
        }
        if (this.gK.equals("*")) {
            return this.b(g2);
        }
        if ((g2 = l.a(g2, this.gK)) == null) {
            return false;
        }
        return this.c(g2);
    }

    private boolean b(g g2) {
        g g3;
        g g4;
        if (g2 instanceof n) {
            g4 = (n)g2;
            for (String string : ((n)g4).aeQ()) {
                g3 = ((n)g4).eB(string);
                if (!this.c(g3)) continue;
                return true;
            }
        }
        if (g2 instanceof v) {
            g4 = (v)g2;
            int n2 = ((v)g4).aeS();
            for (int i2 = 0; i2 < n2; ++i2) {
                g3 = ((v)g4).gn(i2);
                if (!this.c(g3)) continue;
                return true;
            }
        }
        return false;
    }

    private static g a(g g2, String string) {
        if (g2 instanceof n) {
            n n2 = (n)g2;
            return n2.eB(string);
        }
        if (g2 instanceof v) {
            v v2 = (v)g2;
            if (string.equals("count")) {
                return new t(v2.aeS());
            }
            int n3 = a.x(string, -1);
            return n3 >= 0 && n3 < v2.aeS() ? v2.gn(n3) : null;
        }
        return null;
    }

    public boolean c(g g2) {
        if (g2 == null) {
            return false;
        }
        String string = l.a(g2, this.eff);
        return this.hW(string);
    }

    public boolean hW(String string) {
        if (string == null) {
            return false;
        }
        switch (this.bif) {
            case 0: {
                return string.equals(this.cpv);
            }
            case 1: {
                return this.ah(string, this.cpv);
            }
            case 2: {
                return this.ah(string.toLowerCase(), this.cpv);
            }
            case 3: {
                return this.ai(string, this.cpv);
            }
            case 4: {
                return this.ai(string.toLowerCase(), this.cpv);
            }
        }
        throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.bif);
    }

    private boolean ah(String string, String string2) {
        return aj.a(string, string2, '*', '?');
    }

    private boolean ai(String string, String string2) {
        return string.matches(string2);
    }

    private static String a(g g2, int n2) {
        if (g2 == null) {
            return null;
        }
        if (g2 instanceof z) {
            z z2 = (z)g2;
            return z2.aeI();
        }
        if (g2 instanceof t) {
            t t2 = (t)g2;
            return n2 == 1 ? efr + aj.a(Integer.toHexString(t2.aeK()), 6, '0') : Integer.toString(t2.aeK());
        }
        if (g2 instanceof net.minecraft.nbt.l) {
            net.minecraft.nbt.l l2 = (net.minecraft.nbt.l)g2;
            return Byte.toString(l2.aeM());
        }
        if (g2 instanceof y) {
            y y2 = (y)g2;
            return Short.toString(y2.aeL());
        }
        if (g2 instanceof w) {
            w w2 = (w)g2;
            return Long.toString(w2.aeJ());
        }
        if (g2 instanceof s) {
            s s2 = (s)g2;
            return Float.toString(s2.aeO());
        }
        if (g2 instanceof q) {
            q q2 = (q)g2;
            return Double.toString(q2.aeN());
        }
        return g2.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.efd.length; ++i2) {
            String string = this.efd[i2];
            if (i2 > 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(string);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.append(".");
        }
        stringBuffer.append(this.gK);
        stringBuffer.append(" = ");
        stringBuffer.append(this.cpv);
        return stringBuffer.toString();
    }
}

