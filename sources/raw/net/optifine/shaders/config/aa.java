/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.optifine.shaders.config.o;

public class aa {
    private String gK = null;
    private final Map<String, String> eIc = new LinkedHashMap<String, String>();
    private final Set<String> eId = new LinkedHashSet<String>();

    public aa(String string) {
        this.gK = string;
    }

    public String getName() {
        return this.gK;
    }

    public void ar(String string, String string2) {
        this.eIc.put(string, string2);
    }

    public void a(aa aa2) {
        if (aa2 != null) {
            this.eIc.putAll(aa2.eIc);
        }
    }

    public void c(o[] oArray) {
        for (int i2 = 0; i2 < oArray.length; ++i2) {
            o o2 = oArray[i2];
            String string = o2.getName();
            String string2 = this.eIc.get(string);
            if (string2 == null) continue;
            o2.jq(string2);
        }
    }

    public String[] aIq() {
        Set<String> set = this.eIc.keySet();
        String[] stringArray = set.toArray(new String[set.size()]);
        return stringArray;
    }

    public String jL(String string) {
        return this.eIc.get(string);
    }

    public void jM(String string) {
        this.eId.add(string);
    }

    public void jN(String string) {
        this.eId.remove(string);
    }

    public Collection<String> aIr() {
        return new LinkedHashSet<String>(this.eId);
    }

    public void j(Collection<String> collection) {
        this.eId.addAll(collection);
    }

    public boolean jO(String string) {
        return this.eId.contains(string);
    }
}

