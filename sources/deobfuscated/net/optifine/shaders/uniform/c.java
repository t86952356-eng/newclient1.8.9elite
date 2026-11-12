/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.uniform;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.world.biome.j;
import net.optifine.expr.a;
import net.optifine.expr.l;
import net.optifine.expr.q;
import net.optifine.shaders.uniform.d;
import net.optifine.shaders.uniform.e;
import net.optifine.shaders.uniform.f;
import net.optifine.shaders.w;

public class c
implements q {
    private final Map<String, l> eIQ = new HashMap<String, l>();

    public c(Map<String, l> map) {
        this.aIF();
        for (String string : map.keySet()) {
            l l2 = map.get(string);
            this.a(string, l2);
        }
    }

    private void aIF() {
        e[] eArray = e.values();
        for (int i2 = 0; i2 < eArray.length; ++i2) {
            e e2 = eArray[i2];
            this.a(this.eIQ, e2);
        }
        d[] dArray = d.values();
        for (int i3 = 0; i3 < dArray.length; ++i3) {
            d object = dArray[i3];
            this.eIQ.put(object.getName(), object);
        }
        for (j j2 : j.dGe.values()) {
            Object object = j2.dGX.trim();
            object = "BIOME_" + ((String)object).toUpperCase().replace(' ', '_');
            int n2 = j2.dHo;
            a a2 = new a(n2);
            this.a((String)object, a2);
        }
    }

    private void a(Map<String, l> map, e e2) {
        String[] stringArray = e2.aII();
        if (stringArray == null) {
            map.put(e2.getName(), new f(e2));
        } else {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                String[] stringArray2 = e2.aIJ();
                if (stringArray2 == null) {
                    map.put(e2.getName() + "." + string, new f(e2, i2));
                    continue;
                }
                for (int i3 = 0; i3 < stringArray2.length; ++i3) {
                    String string2 = stringArray2[i3];
                    map.put(e2.getName() + "." + string + "." + string2, new f(e2, i2, i3));
                }
            }
        }
    }

    public boolean a(String string, l l2) {
        if (this.eIQ.containsKey(string)) {
            w.iH("Expression already defined: " + string);
            return false;
        }
        this.eIQ.put(string, l2);
        return true;
    }

    @Override
    public l ib(String string) {
        return this.eIQ.get(string);
    }

    public boolean jP(String string) {
        return this.eIQ.containsKey(string);
    }
}

