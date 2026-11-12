/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.ArrayList;
import net.optifine.aw;
import net.optifine.shaders.ag;
import net.optifine.shaders.ah;
import net.optifine.shaders.config.aa;
import net.optifine.shaders.config.o;

public class p
extends o {
    private aa[] eHB = null;
    private o[] eHC = null;
    private static final String eHD = "<profile>";
    private static final String eHE = "<custom>";

    public p(aa[] aaArray, o[] oArray) {
        super(eHD, "", p.a(aaArray, oArray), p.a(aaArray), p.b(aaArray, oArray, true), null);
        this.eHB = aaArray;
        this.eHC = oArray;
    }

    @Override
    public void aHs() {
        super.aHs();
        if (this.SN().equals(eHE)) {
            super.aHs();
        }
        this.aIm();
    }

    public void aIl() {
        aa aa2 = this.jx(this.SN());
        if (aa2 == null || !ag.a(aa2, this.eHC, false)) {
            String string = p.a(this.eHB, this.eHC);
            this.jq(string);
        }
    }

    private void aIm() {
        aa aa2 = this.jx(this.SN());
        if (aa2 != null) {
            String[] stringArray = aa2.aIq();
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                o o2 = this.jw(string);
                if (o2 == null) continue;
                String string2 = aa2.jL(string);
                o2.jq(string2);
            }
        }
    }

    private o jw(String string) {
        for (int i2 = 0; i2 < this.eHC.length; ++i2) {
            o o2 = this.eHC[i2];
            if (!o2.getName().equals(string)) continue;
            return o2;
        }
        return null;
    }

    private aa jx(String string) {
        for (int i2 = 0; i2 < this.eHB.length; ++i2) {
            aa aa2 = this.eHB[i2];
            if (!aa2.getName().equals(string)) continue;
            return aa2;
        }
        return null;
    }

    @Override
    public String aIh() {
        return aw.cf("of.shaders.profile");
    }

    @Override
    public String js(String string) {
        return string.equals(eHE) ? aw.ae("of.general.custom", eHE) : ah.ak("profile." + string, string);
    }

    @Override
    public String jt(String string) {
        return string.equals(eHE) ? "\u00a7c" : "\u00a7a";
    }

    @Override
    public String aId() {
        String string = ah.ak("profile.comment", null);
        if (string != null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.eHB.length; ++i2) {
            String string2;
            String string3 = this.eHB[i2].getName();
            if (string3 == null || (string2 = ah.ak("profile." + string3 + ".comment", null)) == null) continue;
            stringBuffer.append(string2);
            if (string2.endsWith(". ")) continue;
            stringBuffer.append(". ");
        }
        return stringBuffer.toString();
    }

    private static String a(aa[] aaArray, o[] oArray) {
        return p.b(aaArray, oArray, false);
    }

    private static String b(aa[] aaArray, o[] oArray, boolean bl2) {
        aa aa2 = ag.a(aaArray, oArray, bl2);
        return aa2 == null ? eHE : aa2.getName();
    }

    private static String[] a(aa[] aaArray) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < aaArray.length; ++i2) {
            aa aa2 = aaArray[i2];
            arrayList.add(aa2.getName());
        }
        arrayList.add(eHE);
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }
}

