/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aco;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import hackclient.rise.afz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import rise.Client;

final class act
implements add {
    private static final String[] aBU = new String[]{"save", "load", "list", "folder", "create"};

    private act() {
    }

    @Override
    public void a(adc adc2) {
        try {
            Client.a.p().update();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
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
            for (String string4 : aBU) {
                String string5 = string4.toLowerCase(Locale.ROOT);
                if (!string3.isEmpty() && !string5.startsWith(string3)) continue;
                boolean bl2 = string5.equals("save") || string5.equals("load") || string5.equals("create");
                arrayList.add(new adb(string4, "Config subcommand", ".config " + String.join((CharSequence)"/", aBU), string4, 0, bl2));
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
        if (!(string.equals("load") || string.equals("save") || string.equals("create"))) {
            return Collections.emptyList();
        }
        String string7 = stringArray[1] == null ? "" : stringArray[1].toLowerCase(Locale.ROOT);
        ArrayList<adb> arrayList = new ArrayList<adb>();
        for (afz afz2 : Client.a.p()) {
            String string8 = afz2.sZ().getName().replace(".json", "");
            String string9 = string8.toLowerCase(Locale.ROOT);
            if (!string7.isEmpty() && !string9.startsWith(string7)) continue;
            arrayList.add(new adb(string8, "Config", ".config " + string + " " + string8, string8, 1, false));
        }
        if (!arrayList.isEmpty()) {
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
        }
        return arrayList;
    }
}

