/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.nbt;

import java.util.Stack;
import java.util.regex.Pattern;
import net.minecraft.nbt.c;
import net.minecraft.nbt.d;
import net.minecraft.nbt.e;
import net.minecraft.nbt.f;
import net.minecraft.nbt.i;
import net.minecraft.nbt.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
    private static final Logger cXK = LogManager.getLogger();
    private static final Pattern cXL = Pattern.compile("\\[[-+\\d|,\\s]+\\]");

    public static n ez(String string) {
        if (!(string = string.trim()).startsWith("{")) {
            throw new i("Invalid tag encountered, expected '{' as first char.");
        }
        if (b.eA(string) != 1) {
            throw new i("Encountered multiple top tags, only one expected");
        }
        return (n)b.Q("tag", string).aeE();
    }

    static int eA(String string) {
        int n2 = 0;
        boolean bl2 = false;
        Stack<Character> stack = new Stack<Character>();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\"') {
                if (b.A(string, i2)) {
                    if (bl2) continue;
                    throw new i("Illegal use of \\\": " + string);
                }
                bl2 = !bl2;
                continue;
            }
            if (bl2) continue;
            if (c2 != '{' && c2 != '[') {
                if (c2 == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                    throw new i("Unbalanced curly brackets {}: " + string);
                }
                if (c2 != ']' || !stack.isEmpty() && ((Character)stack.pop()).charValue() == '[') continue;
                throw new i("Unbalanced square brackets []: " + string);
            }
            if (stack.isEmpty()) {
                ++n2;
            }
            stack.push(Character.valueOf(c2));
        }
        if (bl2) {
            throw new i("Unbalanced quotation: " + string);
        }
        if (!stack.isEmpty()) {
            throw new i("Unbalanced brackets: " + string);
        }
        if (n2 == 0 && !string.isEmpty()) {
            n2 = 1;
        }
        return n2;
    }

    static c k(String ... stringArray) {
        return b.Q(stringArray[0], stringArray[1]);
    }

    static c Q(String string, String string2) {
        if ((string2 = string2.trim()).startsWith("{")) {
            string2 = string2.substring(1, string2.length() - 1);
            d d2 = new d(string);
            while (string2.length() > 0) {
                char c2;
                String string3 = b.l(string2, true);
                if (string3.length() > 0) {
                    c2 = '\u0000';
                    d2.cXN.add(b.k(string3, false));
                }
                if (string2.length() < string3.length() + 1) break;
                c2 = string2.charAt(string3.length());
                if (c2 != ',' && c2 != '{' && c2 != '}' && c2 != '[' && c2 != ']') {
                    throw new i("Unexpected token '" + c2 + "' at: " + string2.substring(string3.length()));
                }
                string2 = string2.substring(string3.length() + 1);
            }
            return d2;
        }
        if (string2.startsWith("[") && !cXL.matcher(string2).matches()) {
            string2 = string2.substring(1, string2.length() - 1);
            e e2 = new e(string);
            while (string2.length() > 0) {
                char c3;
                String string4 = b.l(string2, false);
                if (string4.length() > 0) {
                    c3 = '\u0001';
                    e2.cXO.add(b.k(string4, true));
                }
                if (string2.length() < string4.length() + 1) break;
                c3 = string2.charAt(string4.length());
                if (c3 != ',' && c3 != '{' && c3 != '}' && c3 != '[' && c3 != ']') {
                    throw new i("Unexpected token '" + c3 + "' at: " + string2.substring(string4.length()));
                }
                string2 = string2.substring(string4.length() + 1);
            }
            return e2;
        }
        return new f(string, string2);
    }

    private static c k(String string, boolean bl2) {
        String string2 = b.m(string, bl2);
        String string3 = b.n(string, bl2);
        return b.k(string2, string3);
    }

    private static String l(String string, boolean bl2) {
        int n2 = b.a(string, ':');
        int n3 = b.a(string, ',');
        if (bl2) {
            if (n2 == -1) {
                throw new i("Unable to locate name/value separator for string: " + string);
            }
            if (n3 != -1 && n3 < n2) {
                throw new i("Name error at: " + string);
            }
        } else if (n2 == -1 || n2 > n3) {
            n2 = -1;
        }
        return b.z(string, n2);
    }

    private static String z(String string, int n2) {
        int n3;
        Stack<Character> stack = new Stack<Character>();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n4 = 0;
        for (n3 = n2 + 1; n3 < string.length(); ++n3) {
            char c2 = string.charAt(n3);
            if (c2 == '\"') {
                if (b.A(string, n3)) {
                    if (!bl2) {
                        throw new i("Illegal use of \\\": " + string);
                    }
                } else {
                    boolean bl5 = bl2 = !bl2;
                    if (bl2 && !bl4) {
                        bl3 = true;
                    }
                    if (!bl2) {
                        n4 = n3;
                    }
                }
            } else if (!bl2) {
                if (c2 != '{' && c2 != '[') {
                    if (c2 == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                        throw new i("Unbalanced curly brackets {}: " + string);
                    }
                    if (c2 == ']' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '[')) {
                        throw new i("Unbalanced square brackets []: " + string);
                    }
                    if (c2 == ',' && stack.isEmpty()) {
                        return string.substring(0, n3);
                    }
                } else {
                    stack.push(Character.valueOf(c2));
                }
            }
            if (Character.isWhitespace(c2)) continue;
            if (!bl2 && bl3 && n4 != n3) {
                return string.substring(0, n4 + 1);
            }
            bl4 = true;
        }
        return string.substring(0, n3);
    }

    private static String m(String string, boolean bl2) {
        if (bl2 && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return "";
        }
        int n2 = b.a(string, ':');
        if (n2 == -1) {
            if (bl2) {
                return "";
            }
            throw new i("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(0, n2).trim();
    }

    private static String n(String string, boolean bl2) {
        if (bl2 && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return string;
        }
        int n2 = b.a(string, ':');
        if (n2 == -1) {
            if (bl2) {
                return string;
            }
            throw new i("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(n2 + 1).trim();
    }

    private static int a(String string, char c2) {
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = string.charAt(i2);
            if (c3 == '\"') {
                if (b.A(string, i2)) continue;
                bl2 = !bl2;
                continue;
            }
            if (!bl2) continue;
            if (c3 == c2) {
                return i2;
            }
            if (c3 != '{' && c3 != '[') continue;
            return -1;
        }
        return -1;
    }

    private static boolean A(String string, int n2) {
        return n2 > 0 && string.charAt(n2 - 1) == '\\' && !b.A(string, n2 - 1);
    }
}

