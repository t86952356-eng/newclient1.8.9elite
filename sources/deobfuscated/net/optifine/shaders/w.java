/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class w {
    private static final Logger evX = LogManager.getLogger();
    private static final String evY = "[Shaders] ";

    public static void iG(String string) {
        evX.error(evY + string);
    }

    public static void iH(String string) {
        evX.warn(evY + string);
    }

    public static void info(String string) {
        evX.info(evY + string);
    }

    public static void iI(String string) {
        evX.debug(evY + string);
    }

    public static void e(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        evX.error(evY + string2);
    }

    public static void f(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        evX.warn(evY + string2);
    }

    public static void info(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        evX.info(evY + string2);
    }

    public static void g(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        evX.debug(evY + string2);
    }
}

