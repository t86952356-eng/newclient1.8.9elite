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
package net.minecraft.client.resources;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.cm;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class Locale {
    private static final Splitter cdd = Splitter.on((char)'=').limit(2);
    private static final Pattern cde = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    Map<String, String> cdf = Maps.newHashMap();
    private boolean cdg;

    public synchronized void a(IResourceManager iResourceManager, List<String> list) {
        this.cdf.clear();
        for (String string : list) {
            String string2 = String.format("lang/%s.lang", string);
            for (String string3 : iResourceManager.Ph()) {
                try {
                    this.x(iResourceManager.w(new cm(string3, string2)));
                }
                catch (IOException iOException) {}
            }
        }
        this.Pt();
    }

    public boolean Ay() {
        return this.cdg;
    }

    private void Pt() {
        this.cdg = false;
        int n2 = 0;
        int n3 = 0;
        for (String string : this.cdf.values()) {
            int n4 = string.length();
            n3 += n4;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (string.charAt(i2) < '\u0100') continue;
                ++n2;
            }
        }
        float f2 = (float)n2 / (float)n3;
        this.cdg = (double)f2 > 0.1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void x(List<IResource> list) {
        for (IResource iResource : list) {
            InputStream inputStream = iResource.getInputStream();
            try {
                this.e(inputStream);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
    }

    private void e(InputStream inputStream) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] stringArray;
            if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)cdd.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = cde.matcher(stringArray[1]).replaceAll("%$1s");
            this.cdf.put(string2, string3);
        }
    }

    private String dy(String string) {
        String string2 = this.cdf.get(string);
        return string2 == null ? string : string2;
    }

    public String b(String string, Object[] objectArray) {
        String string2 = this.dy(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }
}

