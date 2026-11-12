/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aco;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import hackclient.rise.ahg;
import hackclient.rise.akr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import rise.Client;
import rise.module.Mode;
import rise.module.Module;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

final class acy
implements add {
    private acy() {
    }

    @Override
    public List<adb> b(adc adc2) {
        String[] stringArray = adc2.rA();
        if (stringArray.length == 0) {
            return Collections.emptyList();
        }
        String string = aco.aQ(adc2.rz());
        if (stringArray.length == 1) {
            String string2 = stringArray[0] == null ? "" : stringArray[0].toLowerCase(Locale.ROOT);
            String string3 = string2.trim().toLowerCase(Locale.ROOT).replace(" ", "");
            ArrayList<Module> arrayList = new ArrayList<Module>();
            for (Module object : Client.a.g().ef()) {
                if (object == null || !string3.isEmpty() && acy.b(object, string3) <= 1) continue;
                arrayList.add(object);
            }
            arrayList.sort((module, module2) -> {
                long l2;
                int n2;
                int n3 = acy.b(module, string3);
                if (n3 != (n2 = acy.b(module2, string3))) {
                    return Integer.compare(n2, n3);
                }
                long l3 = acy.a(string, 0, module);
                if (l3 != (l2 = acy.a(string, 0, module2))) {
                    return Long.compare(l2, l3);
                }
                return module.getName().compareToIgnoreCase(module2.getName());
            });
            ArrayList arrayList2 = new ArrayList();
            for (Module arrayList3 : arrayList) {
                String modeValue = arrayList3.getName();
                String string4 = modeValue.replace(" ", "");
                arrayList2.add(new adb(modeValue, ahg.cf(arrayList3.getModuleInfo().description()), arrayList3.getModuleInfo().category().getName(), string4, 0, true));
            }
            return arrayList2;
        }
        String string6 = stringArray[0];
        Object t2 = Client.a.g().q(string6);
        if (t2 == null) {
            return Collections.emptyList();
        }
        if (stringArray.length == 2) {
            String string5;
            String string7;
            String string9 = stringArray[1] == null ? "" : stringArray[1].toLowerCase(Locale.ROOT);
            ArrayList<adb> arrayList = new ArrayList<adb>();
            for (Value<?> value : ((Module)t2).getAllValues()) {
                boolean string17;
                if (value.wC() != null && value.wC().getAsBoolean()) continue;
                String string8 = value.getName();
                String string10 = string8.replace(" ", "");
                string7 = string10.toLowerCase(Locale.ROOT);
                if (!string9.isEmpty() && !string7.startsWith(string9)) continue;
                if (value instanceof NumberValue) {
                    string5 = "Number";
                    string17 = true;
                } else if (value instanceof BooleanValue) {
                    string5 = "Boolean";
                    string17 = true;
                } else if (value instanceof ModeValue) {
                    string5 = "Mode";
                    string17 = true;
                } else if (value instanceof akr) {
                    string5 = "String";
                    string17 = true;
                } else {
                    string5 = "Value";
                    string17 = true;
                }
                arrayList.add(new adb(string8, ((Module)t2).getName() + " setting", string5, string10, 1, string17));
            }
            ModeValue modeValue = acy.a(t2);
            if (modeValue != null) {
                Value<?> value;
                value = string9;
                for (Mode mode : modeValue.wU()) {
                    string7 = mode.getName();
                    string5 = string7.toLowerCase(Locale.ROOT);
                    if (!((String)((Object)value)).isEmpty() && !string5.startsWith((String)((Object)value))) continue;
                    String string11 = string7.replace(" ", "");
                    arrayList.add(new adb(string7, "Mode", "Mode for " + ((Module)t2).getName(), string11, 1, false));
                }
            }
            arrayList.sort((adb2, adb3) -> {
                long l2;
                int n2;
                int n3;
                String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
                String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
                int n4 = string3.equals(string9) ? 2 : (n3 = !string9.isEmpty() && string3.startsWith(string9) ? 1 : 0);
                int n5 = string4.equals(string9) ? 2 : (n2 = !string9.isEmpty() && string4.startsWith(string9) ? 1 : 0);
                if (n3 != n2) {
                    return Integer.compare(n2, n3);
                }
                long l3 = aco.b(string, 1, string3);
                if (l3 != (l2 = aco.b(string, 1, string4))) {
                    return Long.compare(l2, l3);
                }
                return adb2.aCk.compareToIgnoreCase(adb3.aCk);
            });
            return arrayList;
        }
        if (stringArray.length >= 3) {
            String string12 = stringArray[1];
            String string13 = stringArray[2] == null ? "" : stringArray[2].toLowerCase(Locale.ROOT);
            Value<?> value = acy.c(t2, string12);
            if (value == null) {
                return Collections.emptyList();
            }
            ArrayList<adb> arrayList = new ArrayList<adb>();
            if (value instanceof ModeValue) {
                ModeValue modeValue = (ModeValue)value;
                for (Mode<?> mode : modeValue.wU()) {
                    String string14 = mode.getName();
                    String string15 = string14.toLowerCase(Locale.ROOT);
                    if (!string13.isEmpty() && !string15.startsWith(string13)) continue;
                    String string16 = string14.replace(" ", "");
                    arrayList.add(new adb(string14, ((Module)t2).getName() + " mode", "Modes", string16, 2, false));
                }
            } else if (value instanceof BooleanValue) {
                for (String string17 : new String[]{"true", "false"}) {
                    if (!string13.isEmpty() && !string17.startsWith(string13)) continue;
                    arrayList.add(new adb(string17, ((Module)t2).getName() + " flag", "Boolean", string17, 2, false));
                }
            }
            arrayList.sort((adb2, adb3) -> {
                long l2;
                int n2;
                int n3;
                String string3 = adb2.aCn.toLowerCase(Locale.ROOT);
                String string4 = adb3.aCn.toLowerCase(Locale.ROOT);
                int n4 = string3.equals(string13) ? 2 : (n3 = !string13.isEmpty() && string3.startsWith(string13) ? 1 : 0);
                int n5 = string4.equals(string13) ? 2 : (n2 = !string13.isEmpty() && string4.startsWith(string13) ? 1 : 0);
                if (n3 != n2) {
                    return Integer.compare(n2, n3);
                }
                long l3 = aco.b(string, 2, string3);
                if (l3 != (l2 = aco.b(string, 2, string4))) {
                    return Long.compare(l2, l3);
                }
                return adb2.aCk.compareToIgnoreCase(adb3.aCk);
            });
            return arrayList;
        }
        return Collections.emptyList();
    }

    private static int b(Module module, String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        int n2 = 1;
        n2 = Math.max(n2, acy.s(module.getName(), string));
        String[] stringArray = module.getAliases();
        if (stringArray != null) {
            for (String string2 : stringArray) {
                n2 = Math.max(n2, acy.s(string2, string));
            }
        }
        return n2;
    }

    private static int s(String string, String string2) {
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

    private static long a(String string, int n2, Module module) {
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

    private static ModeValue a(Module module) {
        ModeValue modeValue = null;
        for (Value<?> value : module.getAllValues()) {
            if (!(value instanceof ModeValue)) continue;
            ModeValue modeValue2 = (ModeValue)value;
            if ("mode".equalsIgnoreCase(value.getName())) {
                return modeValue2;
            }
            if (modeValue != null) continue;
            modeValue = modeValue2;
        }
        return modeValue;
    }

    private static Value<?> c(Module module, String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        for (Value<?> value : module.getAllValues()) {
            if (value.wC() != null && value.wC().getAsBoolean()) continue;
            String string3 = value.getName();
            if (string3.equalsIgnoreCase(string)) {
                return value;
            }
            String string4 = string3.replace(" ", "").toLowerCase(Locale.ROOT);
            if (!string4.equals(string2)) continue;
            return value;
        }
        return null;
    }
}

