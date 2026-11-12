/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahg;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.gi;
import hackclient.rise.s;
import java.util.Iterator;
import java.util.Locale;

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
        Object t2 = a.a.g().q(string);
        if (t2 == null) {
            afl.b(ahg.cf("command.bind.invalidmodule"), new Object[0]);
            return;
        }
        String string2 = stringArray[2];
        akh<?> akh2 = this.a((gi)t2, string2);
        if (akh2 != null) {
            if (stringArray.length < 4) {
                this.error(".module " + string + " " + string2 + " <value>");
                return;
            }
            String string3 = ab.a(stringArray, 3);
            try {
                this.a(akh2, string3);
                afl.b("Set " + ((gi)t2).getName() + "." + akh2.getName() + " to " + string3, new Object[0]);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                afl.b(illegalArgumentException.getMessage(), new Object[0]);
            }
            return;
        }
        akp akp2 = this.a((gi)t2);
        if (akp2 == null) {
            this.error(".module " + string + " <setting> <value>");
            return;
        }
        String string4 = ab.a(stringArray, 2);
        try {
            this.a(akp2, string4);
            afl.b("Set " + ((gi)t2).getName() + " mode to " + string4, new Object[0]);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            afl.b(illegalArgumentException.getMessage(), new Object[0]);
        }
    }

    private akp a(gi gi2) {
        akp akp2 = null;
        for (akh<?> akh2 : gi2.getAllValues()) {
            if (!(akh2 instanceof akp)) continue;
            akp akp3 = (akp)akh2;
            if ("mode".equalsIgnoreCase(akh2.getName())) {
                return akp3;
            }
            if (akp2 != null) continue;
            akp2 = akp3;
        }
        return akp2;
    }

    private akh<?> a(gi gi2, String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        for (akh<?> akh2 : gi2.getAllValues()) {
            if (akh2.wC() != null && akh2.wC().getAsBoolean()) continue;
            String string3 = akh2.getName();
            if (string3.equalsIgnoreCase(string)) {
                return akh2;
            }
            String string4 = string3.replace(" ", "").toLowerCase(Locale.ROOT);
            if (!string4.equals(string2)) continue;
            return akh2;
        }
        return null;
    }

    private void a(akh<?> akh2, String string) {
        if (akh2 instanceof akq) {
            akq akq2 = (akq)akh2;
            try {
                double d2 = Double.parseDouble(string);
                double d3 = akq2.wM().doubleValue();
                double d4 = akq2.wN().doubleValue();
                if (d2 < d3 || d2 > d4) {
                    throw new IllegalArgumentException("Value out of range [" + d3 + ", " + d4 + "]");
                }
                akq2.n(d2);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("Invalid number \"" + string + "\"");
            }
            return;
        }
        if (akh2 instanceof aki) {
            aki aki2 = (aki)akh2;
            String string2 = string.toLowerCase(Locale.ROOT);
            if (string2.equals("true") || string2.equals("1") || string2.equals("on")) {
                aki2.c(true);
            } else if (string2.equals("false") || string2.equals("0") || string2.equals("off")) {
                aki2.c(false);
            } else {
                throw new IllegalArgumentException("Expected true/false for " + akh2.getName());
            }
            return;
        }
        if (akh2 instanceof akp) {
            akp akp2 = (akp)akh2;
            String string3 = string.toLowerCase(Locale.ROOT);
            String string4 = string3.replace(" ", "");
            akg<?> akg2 = null;
            akg<?> akg3 = null;
            Iterator<akg<?>> iterator = akp2.wU().iterator();
            while (iterator.hasNext()) {
                akg<?> akg4 = iterator.next();
                String string5 = akg4.getName();
                String string6 = string5.toLowerCase(Locale.ROOT);
                String string7 = string6.replace(" ", "");
                if (string6.equals(string3) || string7.equals(string4)) {
                    akg2 = akg4;
                    break;
                }
                if (akg3 != null || !string6.startsWith(string3) && !string7.startsWith(string4)) continue;
                akg3 = akg4;
            }
            Iterator<akg<?>> iterator2 = iterator = akg2 != null ? akg2 : akg3;
            if (iterator == null) {
                throw new IllegalArgumentException("Unknown mode \"" + string + "\"");
            }
            akp2.c((akg<?>)((Object)iterator));
            return;
        }
        if (akh2 instanceof akr) {
            akr akr2 = (akr)akh2;
            akr2.n(string);
            return;
        }
        akh2.m(string);
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

