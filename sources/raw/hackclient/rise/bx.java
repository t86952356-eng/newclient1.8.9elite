/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.util.ArrayList;

public class bx {
    private static final ArrayList<String> gn = new ArrayList();
    private static final ArrayList<String> go = new ArrayList();

    public static void j(String string) {
        if (!gn.contains(string)) {
            gn.add(string);
        }
    }

    public static void k(String string) {
        gn.remove(string);
    }

    public static void l(String string) {
        if (!go.contains(string)) {
            go.add(string);
        }
    }

    public static void m(String string) {
        go.remove(string);
    }

    public static boolean isFriend(String string) {
        return gn.contains(string);
    }

    public static boolean n(String string) {
        return go.contains(string);
    }
}

