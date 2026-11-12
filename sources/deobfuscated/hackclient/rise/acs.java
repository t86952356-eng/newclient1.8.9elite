/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aco;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class acs
implements add {
    private static final String[] aBT = new String[]{"up", "down", "forward", "back", "left", "right"};

    private acs() {
    }

    @Override
    public List<adb> b(adc adc2) {
        String[] stringArray = adc2.rA();
        if (stringArray.length == 0) {
            return Collections.emptyList();
        }
        String string = aco.aQ(adc2.rz());
        String string2 = adc2.rz().toLowerCase(Locale.ROOT);
        if (string2.equals("vclip") || string2.equals("hclip")) {
            return Collections.emptyList();
        }
        if (!string2.equals("clip")) {
            return Collections.emptyList();
        }
        if (stringArray.length != 1) {
            return Collections.emptyList();
        }
        String string3 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
        ArrayList<adb> arrayList = new ArrayList<adb>();
        for (String string4 : aBT) {
            String string5 = string4.toLowerCase(Locale.ROOT);
            if (!string3.isEmpty() && !string5.startsWith(string3)) continue;
            arrayList.add(new adb(string4, "Clip direction", ".clip <up/down/forward/back/left/right> <amount>", string4, 0, true));
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
            long l3 = aco.b(string, 0, string3);
            if (l3 != (l2 = aco.b(string, 0, string4))) {
                return Long.compare(l2, l3);
            }
            return adb2.aCn.compareToIgnoreCase(adb3.aCn);
        });
        return arrayList;
    }
}

