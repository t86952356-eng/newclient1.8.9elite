/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

import java.util.Map;
import net.minecraft.src.a;
import net.optifine.expr.g;
import net.optifine.expr.k;
import net.optifine.expr.l;
import net.optifine.expr.q;

public class c
implements q {
    private Map<String, String> eGa = null;

    public c(Map<String, String> map) {
        this.eGa = map;
    }

    @Override
    public l ib(String string) {
        String string2;
        String string3 = "defined_";
        if (string.startsWith("defined_")) {
            String string4 = string.substring("defined_".length());
            return this.eGa.containsKey(string4) ? new g(k.eiU, null) : new g(k.eiV, null);
        }
        while (this.eGa.containsKey(string) && (string2 = this.eGa.get(string)) != null && !string2.equals(string)) {
            string = string2;
        }
        int n2 = a.x(string, Integer.MIN_VALUE);
        if (n2 == Integer.MIN_VALUE) {
            a.warn("Unknown macro value: " + string);
            return new net.optifine.expr.a(0.0f);
        }
        return new net.optifine.expr.a(n2);
    }
}

