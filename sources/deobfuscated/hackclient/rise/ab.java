/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahg;
import hackclient.rise.akr;
import hackclient.rise.s;
import java.util.Iterator;
import java.util.Locale;
import rise.Client;
import rise.module.Mode;
import rise.module.Module;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public final class ab
extends s {
    public ab() {
        super("command.module.description", "module", "modules");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length < 3) {
            this.error(".module <module> <setting> <value>  or  .module <module> <modeName>");
            return;
        }
        String string = stringArray[1];
        Object t2 = Client.a.g().q(string);
        if (t2 == null) {
            afl.b(ahg.cf("command.bind.invalidmodule"), new Object[0]);
            return;
        }
        String string2 = stringArray[2];
        Value<?> value = this.a((Module)t2, string2);
        if (value != null) {
            if (stringArray.length < 4) {
                this.error(".module " + string + " " + string2 + " <value>");
                return;
            }
            String string3 = ab.a(stringArray, 3);
            try {
                this.a(value, string3);
                afl.b("Set " + ((Module)t2).getName() + "." + value.getName() + " to " + string3, new Object[0]);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                afl.b(illegalArgumentException.getMessage(), new Object[0]);
            }
            return;
        }
        ModeValue modeValue = this.a((Module)t2);
        if (modeValue == null) {
            this.error(".module " + string + " <setting> <value>");
            return;
        }
        String string4 = ab.a(stringArray, 2);
        try {
            this.a(modeValue, string4);
            afl.b("Set " + ((Module)t2).getName() + " mode to " + string4, new Object[0]);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            afl.b(illegalArgumentException.getMessage(), new Object[0]);
        }
    }

    private ModeValue a(Module module) {
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

    private Value<?> a(Module module, String string) {
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

    private void a(Value<?> value, String string) {
        if (value instanceof NumberValue) {
            NumberValue numberValue = (NumberValue)value;
            try {
                double d2 = Double.parseDouble(string);
                double d3 = numberValue.wM().doubleValue();
                double d4 = numberValue.wN().doubleValue();
                if (d2 < d3 || d2 > d4) {
                    throw new IllegalArgumentException("Value out of range [" + d3 + ", " + d4 + "]");
                }
                numberValue.n(d2);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("Invalid number \"" + string + "\"");
            }
            return;
        }
        if (value instanceof BooleanValue) {
            BooleanValue booleanValue = (BooleanValue)value;
            String string2 = string.toLowerCase(Locale.ROOT);
            if (string2.equals("true") || string2.equals("1") || string2.equals("on")) {
                booleanValue.c(true);
            } else if (string2.equals("false") || string2.equals("0") || string2.equals("off")) {
                booleanValue.c(false);
            } else {
                throw new IllegalArgumentException("Expected true/false for " + value.getName());
            }
            return;
        }
        if (value instanceof ModeValue) {
            ModeValue modeValue = (ModeValue)value;
            String string3 = string.toLowerCase(Locale.ROOT);
            String string4 = string3.replace(" ", "");
            Mode<?> mode = null;
            Mode<?> mode2 = null;
            Iterator<Mode<?>> iterator = modeValue.wU().iterator();
            while (iterator.hasNext()) {
                Mode<?> mode3 = iterator.next();
                String string5 = mode3.getName();
                String string6 = string5.toLowerCase(Locale.ROOT);
                String string7 = string6.replace(" ", "");
                if (string6.equals(string3) || string7.equals(string4)) {
                    mode = mode3;
                    break;
                }
                if (mode2 != null || !string6.startsWith(string3) && !string7.startsWith(string4)) continue;
                mode2 = mode3;
            }
            Iterator<Mode<?>> iterator2 = iterator = mode != null ? mode : mode2;
            if (iterator == null) {
                throw new IllegalArgumentException("Unknown mode \"" + string + "\"");
            }
            modeValue.c((Mode<?>)((Object)iterator));
            return;
        }
        if (value instanceof akr) {
            akr akr2 = (akr)value;
            akr2.n(string);
            return;
        }
        value.m(string);
    }

    private static String a(String[] stringArray, int n2) {
        if (stringArray == null || n2 < 0 || n2 >= stringArray.length) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            if (string == null || (string = string.trim()).isEmpty()) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

