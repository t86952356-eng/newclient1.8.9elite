/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.util;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class cs {
    private static final Pattern dAc = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    private static final Splitter dAd = Splitter.on((char)'=').limit(2);
    private static final cs dAe = new cs();
    private final Map<String, String> dAf = Maps.newHashMap();
    private long dAg;

    public cs() {
        InputStream inputStream = cs.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] stringArray;
            if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)dAd.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = dAc.matcher(stringArray[1]).replaceAll("%$1s");
            this.dAf.put(string2, string3);
        }
        this.dAg = System.currentTimeMillis();
    }

    static cs atI() {
        return dAe;
    }

    public static synchronized void s(Map<String, String> map) {
        cs.dAe.dAf.clear();
        cs.dAe.dAf.putAll(map);
        cs.dAe.dAg = System.currentTimeMillis();
    }

    public synchronized String gp(String string) {
        return this.gq(string);
    }

    public synchronized String d(String string, Object ... objectArray) {
        String string2 = this.gq(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private String gq(String string) {
        String string2 = this.dAf.get(string);
        return string2 == null ? string : string2;
    }

    public synchronized boolean gr(String string) {
        return this.dAf.containsKey(string);
    }

    public long atJ() {
        return this.dAg;
    }
}

