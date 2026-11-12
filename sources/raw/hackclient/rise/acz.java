/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.script.ScriptManager;
import hackclient.rise.aco;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class acz
implements add {
    private static final String[] aCi = new String[]{"load", "reload", "unload", "disablesecurity", "enablesecurity", "download", "install", "folder"};

    private acz() {
    }

    @Override
    public List<adb> b(adc adc2) {
        String string2;
        String[] stringArray = adc2.rA();
        if (stringArray.length == 0) {
            return Collections.emptyList();
        }
        String string3 = aco.aQ(adc2.rz());
        if (stringArray.length == 1) {
            String string4 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
            ArrayList<adb> arrayList = new ArrayList<adb>();
            for (String string5 : aCi) {
                String string6 = string5.toLowerCase(Locale.ROOT);
                if (!string4.isEmpty() && !string6.startsWith(string4)) continue;
                arrayList.add(new adb(string5, "Script action", "load/reload/unload/disablesecurity/enablesecurity/download/install/folder", string5, 0, true));
            }
            arrayList.sort((adb2, adb3) -> {
                long l2;
                int n2;
                int n3;
                String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
                String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
                int n4 = string3.equals(string4) ? 2 : (n3 = string3.startsWith(string4) ? 1 : 0);
                int n5 = string4.equals(string4) ? 2 : (n2 = string4.startsWith(string4) ? 1 : 0);
                if (n3 != n2) {
                    return Integer.compare(n2, n3);
                }
                long l3 = aco.b(string3, 0, string3);
                if (l3 != (l2 = aco.b(string3, 0, string4))) {
                    return Long.compare(l2, l3);
                }
                return adb2.aCn.compareToIgnoreCase(adb3.aCn);
            });
            return arrayList;
        }
        String string7 = string2 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
        if (!(string2.equals("load") || string2.equals("unload") || string2.equals("download") || string2.equals("install"))) {
            return Collections.emptyList();
        }
        String string8 = stringArray[1] == null ? "" : stringArray[1].toLowerCase(Locale.ROOT);
        ArrayList<adb> arrayList = new ArrayList<adb>();
        try {
            File[] fileArray;
            File file2 = ScriptManager.SCRIPT_DIRECTORY;
            if (file2.exists() && (fileArray = file2.listFiles((file, string) -> string != null && string.toLowerCase(Locale.ENGLISH).endsWith(".js"))) != null) {
                for (File file3 : fileArray) {
                    String string9 = file3.getName().replace(".js", "");
                    String string10 = string9.toLowerCase(Locale.ROOT);
                    if (!string8.isEmpty() && !string10.startsWith(string8)) continue;
                    arrayList.add(new adb(string9, "Script", ".script " + string2 + " " + string9, string9, 1, false));
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        arrayList.sort((adb2, adb3) -> {
            long l2;
            boolean bl2;
            String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
            String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
            boolean bl3 = !string8.isEmpty() && string3.equals(string8);
            boolean bl4 = bl2 = !string8.isEmpty() && string4.equals(string8);
            if (bl3 != bl2) {
                return bl3 ? -1 : 1;
            }
            long l3 = aco.b(string3, 1, string3);
            if (l3 != (l2 = aco.b(string3, 1, string4))) {
                return Long.compare(l2, l3);
            }
            return adb2.aCn.compareToIgnoreCase(adb3.aCn);
        });
        return arrayList;
    }
}

