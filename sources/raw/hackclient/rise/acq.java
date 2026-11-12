/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aco;
import hackclient.rise.acr;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import hackclient.rise.afz;
import hackclient.rise.ahg;
import hackclient.rise.gi;
import hackclient.rise.p;
import hackclient.rise.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

final class acq
implements add {
    private acq() {
    }

    @Override
    public void a(adc adc2) {
        try {
            a.a.p().update();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Override
    public List<adb> b(adc adc2) {
        String string;
        Object object;
        if (adc2.rA().length == 0 || adc2.rA().length > 1) {
            return Collections.emptyList();
        }
        String string2 = aco.aQ(adc2.rz());
        String string3 = adc2.rA()[0].toLowerCase(Locale.ROOT);
        List<p> list = a.a.t().aP();
        ArrayList<acr> arrayList = new ArrayList<acr>();
        HashSet<String> hashSet = new HashSet<String>();
        for (p p2 : list) {
            if (p2 == null || !this.b(p2, string3) || (object = this.b(p2)) == null || !hashSet.add(string = ((String)(object = ((String)object).replace(" ", ""))).toLowerCase(Locale.ROOT))) continue;
            String string4 = this.c(p2);
            String string5 = this.d(p2);
            arrayList.add(new acr(p2, (String)object, string4, string5));
        }
        arrayList.sort((acr2, acr3) -> {
            long l2;
            int n2;
            int n3 = this.a(acr2.aBP, string3);
            if (n3 != (n2 = this.a(acr3.aBP, string3))) {
                return Integer.compare(n2, n3);
            }
            long l3 = this.a(string2, 0, acr2.aBP, acr2.aBQ);
            if (l3 != (l2 = this.a(string2, 0, acr3.aBP, acr3.aBQ))) {
                return Long.compare(l2, l3);
            }
            String string3 = acr2.aBQ.toLowerCase(Locale.ROOT);
            String string4 = acr3.aBQ.toLowerCase(Locale.ROOT);
            if (string3.length() != string4.length()) {
                return Integer.compare(string3.length(), string4.length());
            }
            String string5 = acr2.aBP.getName() == null ? acr2.aBQ : acr2.aBP.getName();
            String string6 = acr3.aBP.getName() == null ? acr3.aBQ : acr3.aBP.getName();
            return string5.compareToIgnoreCase(string6);
        });
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < Math.min(80, arrayList.size()); ++i2) {
            object = (acr)arrayList.get(i2);
            string = ((acr)object).aBP.getName() == null ? ((acr)object).aBQ : ((acr)object).aBP.getName();
            arrayList2.add(new adb(string, ((acr)object).aBR, ((acr)object).aBS, ((acr)object).aBQ, 0, true));
        }
        return arrayList2;
    }

    private int a(p p2, String string) {
        String string2;
        if (string == null) {
            string = "";
        }
        if ((string2 = string.trim().toLowerCase(Locale.ROOT).replace(" ", "")).isEmpty()) {
            return 0;
        }
        int n2 = 1;
        n2 = Math.max(n2, this.s(p2.getName(), string2));
        String[] stringArray = p2.getAliases();
        if (stringArray != null) {
            for (String string3 : stringArray) {
                n2 = Math.max(n2, this.s(string3, string2));
            }
        }
        return n2;
    }

    private int s(String string, String string2) {
        if (string == null) {
            return 1;
        }
        String string3 = string.toLowerCase(Locale.ROOT).replace(" ", "");
        if (string3.equals(string2)) {
            return 4;
        }
        if (string3.startsWith(string2)) {
            return 3;
        }
        if (string3.contains(string2)) {
            return 2;
        }
        return 1;
    }

    private long a(String string, int n2, p p2, String string2) {
        String string3;
        Object object;
        String[] stringArray;
        long l2 = 0L;
        if (string2 != null) {
            l2 = Math.max(l2, aco.b(string, n2, string2));
        }
        if ((stringArray = p2.getAliases()) != null) {
            object = stringArray;
            int n3 = ((String[])object).length;
            for (int i2 = 0; i2 < n3; ++i2) {
                String string4;
                Object object2 = object[i2];
                if (object2 == null || (string4 = ((String)object2).replace(" ", "")).isEmpty()) continue;
                l2 = Math.max(l2, aco.b(string, n2, string4));
            }
        }
        if ((object = p2.getName()) != null && !(string3 = ((String)object).replace(" ", "")).isEmpty()) {
            l2 = Math.max(l2, aco.b(string, n2, string3));
        }
        return l2;
    }

    private boolean b(p p2, String string) {
        String string2;
        if (string.isEmpty()) {
            return true;
        }
        String string3 = string2 = p2.getName() == null ? "" : p2.getName().toLowerCase(Locale.ROOT);
        if (string2.contains(string)) {
            return true;
        }
        String[] stringArray = p2.getAliases();
        if (stringArray != null) {
            for (String string4 : stringArray) {
                if (string4 == null || !string4.toLowerCase(Locale.ROOT).contains(string)) continue;
                return true;
            }
        }
        return false;
    }

    private String b(p p2) {
        String[] stringArray = p2.getAliases();
        if (stringArray == null || stringArray.length == 0) {
            return p2.getName();
        }
        String string = null;
        for (String string2 : stringArray) {
            if (string2 == null || string2.trim().isEmpty()) continue;
            if (!string2.contains(" ")) {
                string = string2;
                break;
            }
            if (string != null) continue;
            string = string2;
        }
        if (string != null) {
            return string;
        }
        return p2.getName();
    }

    private String c(p p2) {
        if (p2 instanceof gi) {
            gi gi2 = (gi)p2;
            String string = ahg.cf(gi2.getModuleInfo().category().getName());
            return string + " \u2022 Module";
        }
        if (p2 instanceof afz) {
            return "Config";
        }
        return "Bindable";
    }

    private String d(p p2) {
        int n2 = p2.getKey();
        if (n2 == 0) {
            return ahg.cf("ui.command.palette.bind.meta.unbound");
        }
        return String.format(ahg.cf("ui.command.palette.bind.meta.bound"), v.b(n2));
    }
}

