/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aco;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import hackclient.rise.age;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class acw
implements add {
    private static final String[] aCd = new String[]{"create", "delete"};

    private acw() {
    }

    @Override
    public List<adb> b(adc adc2) {
        String string;
        String[] stringArray = adc2.rA();
        if (stringArray.length == 0) {
            return Collections.emptyList();
        }
        String string2 = aco.aQ(adc2.rz());
        if (stringArray.length == 1) {
            String string3 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
            ArrayList<adb> arrayList = new ArrayList<adb>();
            for (String string4 : aCd) {
                String string5 = string4.toLowerCase(Locale.ROOT);
                if (!string3.isEmpty() && !string5.startsWith(string3)) continue;
                arrayList.add(new adb(string4, "Insults action", ".insults <create/delete> <name>", string4, 0, true));
            }
            arrayList.sort((adb2, adb3) -> {
                long l2;
                int n2;
                int n3;
                String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
                String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
                int n4 = string3.equals(string3) ? 2 : (n3 = string3.startsWith(string3) ? 1 : 0);
                int n5 = string4.equals(string3) ? 2 : (n2 = string4.startsWith(string3) ? 1 : 0);
                if (n3 != n2) {
                    return Integer.compare(n2, n3);
                }
                long l3 = aco.b(string2, 0, string3);
                if (l3 != (l2 = aco.b(string2, 0, string4))) {
                    return Long.compare(l2, l3);
                }
                return adb2.aCn.compareToIgnoreCase(adb3.aCn);
            });
            return arrayList;
        }
        String string6 = string = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
        if (!string.equals("delete")) {
            return Collections.emptyList();
        }
        String string7 = stringArray[1] == null ? "" : stringArray[1].toLowerCase(Locale.ROOT);
        age age2 = a.a.r();
        age2.update();
        ArrayList<adb> arrayList = new ArrayList<adb>();
        age2.forEach(agd2 -> {
            String string2 = agd2.sZ().getName().replace(".txt", "");
            String string3 = string2.toLowerCase(Locale.ROOT);
            if (!string7.isEmpty() && !string3.startsWith(string7)) {
                return;
            }
            arrayList.add(new adb(string2, "Insult file", ".insults delete <name>", string2, 1, false));
        });
        arrayList.sort((adb2, adb3) -> {
            long l2;
            boolean bl2;
            String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
            String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
            boolean bl3 = !string7.isEmpty() && string3.equals(string7);
            boolean bl4 = bl2 = !string7.isEmpty() && string4.equals(string7);
            if (bl3 != bl2) {
                return bl3 ? -1 : 1;
            }
            long l3 = aco.b(string2, 1, string3);
            if (l3 != (l2 = aco.b(string2, 1, string4))) {
                return Long.compare(l2, l3);
            }
            return adb2.aCn.compareToIgnoreCase(adb3.aCn);
        });
        return arrayList;
    }
}

