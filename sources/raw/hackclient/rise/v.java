/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.s;
import net.minecraft.event.b;
import net.minecraft.event.c;
import net.minecraft.event.d;
import org.lwjgl.input.Keyboard;

public final class v
extends s {
    public v() {
        super("command.bind.description", "bind", "binds", "keybind", "b");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length == 3) {
            Object t2 = a.a.t().a(stringArray[1]);
            if (t2 == null) {
                afl.b("command.bind.invalidmodule", new Object[0]);
                return;
            }
            int n2 = v.d(stringArray[2]);
            t2.setKey(n2);
            afl.b("Bound " + t2.getName() + " to " + v.b(n2) + ".", new Object[0]);
            afl.b("Remember you can bind configs by doing .bind configname key", new Object[0]);
        } else if (stringArray.length == 2 && stringArray[1].equalsIgnoreCase("list")) {
            afl.b("Displaying all active binds", new Object[0]);
            a.a.t().aP().forEach(p2 -> {
                if (p2.getKey() != 0) {
                    String string = this.rP().rX().toString();
                    net.minecraft.util.s s2 = new net.minecraft.util.s(string + "> " + p2.getAliases()[0] + "\u00a7f " + v.b(p2.getKey()));
                    net.minecraft.util.s s3 = new net.minecraft.util.s("Click to remove " + p2.getAliases()[0] + " bind");
                    s2.arp().a(new net.minecraft.event.a(b.cKK, ".bind " + p2.getName().replace(" ", "") + " none")).a(new c(d.cKU, s3));
                    v.aER.bgK.a(s2);
                }
            });
        } else {
            this.error(".bind <list/module/config> (KEY)");
        }
    }

    public static int d(String string) {
        if (string == null) {
            return 0;
        }
        String string2 = string.trim().toUpperCase();
        if (string2.isEmpty()) {
            return 0;
        }
        switch (string2) {
            case "NONE": 
            case "UNBOUND": {
                return 0;
            }
            case "LEFTCLICK": 
            case "LEFTMOUSE": 
            case "MOUSE1": 
            case "MB1": {
                return -100;
            }
            case "RIGHTCLICK": 
            case "RIGHTMOUSE": 
            case "MOUSE2": 
            case "MB2": {
                return -99;
            }
            case "MIDDLECLICK": 
            case "MIDDLEMOUSE": 
            case "MOUSE3": 
            case "MB3": {
                return -98;
            }
        }
        if (string2.startsWith("MOUSE") || string2.startsWith("MB")) {
            String string3 = string2.startsWith("MOUSE") ? string2.substring(5) : string2.substring(2);
            try {
                int n2 = Integer.parseInt(string3);
                if (n2 >= 1) {
                    return n2 - 101;
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return Keyboard.getKeyIndex((String)string2);
    }

    public static String b(int n2) {
        switch (n2) {
            case -100: {
                return "Left Click";
            }
            case -99: {
                return "Right Click";
            }
            case -98: {
                return "Middle Click";
            }
        }
        String string = net.minecraft.client.settings.a.dY(n2);
        return string == null || string.trim().isEmpty() ? "NONE" : string;
    }

    public static String c(int n2) {
        if (n2 == 0) {
            return "NONE";
        }
        if (n2 < 0) {
            return "MOUSE" + (n2 + 101);
        }
        String string = Keyboard.getKeyName((int)n2);
        return string == null || string.trim().isEmpty() ? "NONE" : string.toUpperCase();
    }
}

