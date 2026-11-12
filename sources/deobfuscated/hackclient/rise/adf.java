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
import rise.Client;
import rise.module.Module;

final class adf
implements add {
    private adf() {
    }

    @Override
    public List<adb> b(adc adc2) {
        String[] stringArray = adc2.rA();
        if (stringArray.length == 0) {
            return Collections.emptyList();
        }
        String string = aco.aQ(adc2.rz());
        String string2 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
        String string3 = string2 == null ? "" : string2.trim().toLowerCase(Locale.ROOT).replace(" ", "");
        ArrayList<Module> arrayList = new ArrayList<Module>();
        for (Module object : Client.a.g().ef()) {
            if (object == null || !string3.isEmpty() && this.b(object, string3) <= 1) continue;
            arrayList.add(object);
        }
        arrayList.sort((module, module2) -> {
            long l2;
            int n2;
            int n3 = this.b((Module)module, string3);
            if (n3 != (n2 = this.b((Module)module2, string3))) {
                return Integer.compare(n2, n3);
            }
            long l3 = this.a(string, 0, (Module)module);
            if (l3 != (l2 = this.a(string, 0, (Module)module2))) {
                return Long.compare(l2, l3);
            }
            return module.getName().compareToIgnoreCase(module2.getName());
        });
        ArrayList arrayList2 = new ArrayList();
        for (Module module3 : arrayList) {
            String string4 = module3.getName().replace(" ", "");
            arrayList2.add(new adb(module3.getName(), "Module", ".toggle <module>", string4, 0, false));
        }
        return arrayList2;
    }

    private int b(Module module, String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        int n2 = 1;
        n2 = Math.max(n2, this.s(module.getName(), string));
        String[] stringArray = module.getAliases();
        if (stringArray != null) {
            for (String string2 : stringArray) {
                n2 = Math.max(n2, this.s(string2, string));
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

    private long a(String string, int n2, Module module) {
        String string2;
        Object object;
        long l2 = 0L;
        String[] stringArray = module.getAliases();
        if (stringArray != null) {
            object = stringArray;
            int n3 = ((String[])object).length;
            for (int i2 = 0; i2 < n3; ++i2) {
                String string3;
                Object object2 = object[i2];
                if (object2 == null || (string3 = ((String)object2).replace(" ", "")).isEmpty()) continue;
                l2 = Math.max(l2, aco.b(string, n2, string3));
            }
        }
        if ((object = module.getName()) != null && !(string2 = ((String)object).replace(" ", "")).isEmpty()) {
            l2 = Math.max(l2, aco.b(string, n2, string2));
        }
        return l2;
    }
}

