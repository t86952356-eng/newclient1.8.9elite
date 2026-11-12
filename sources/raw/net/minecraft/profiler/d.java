/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.profiler;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.profiler.e;
import net.minecraft.src.a;
import net.optifine.au;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d {
    private static final Logger dhR = LogManager.getLogger();
    private final List<String> dhS = Lists.newArrayList();
    private final List<Long> dhT = Lists.newArrayList();
    public boolean dhU;
    private String dhV = "";
    private final Map<String, Long> dhW = Maps.newHashMap();
    public boolean dhX;
    private boolean dhY = this.dhX = true;
    private static final String dhZ = "scheduledExecutables";
    private static final String dia = "tick";
    private static final String dib = "preRenderErrors";
    private static final String dic = "render";
    private static final String did = "display";
    private static final int die = "scheduledExecutables".hashCode();
    private static final int dif = "tick".hashCode();
    private static final int dig = "preRenderErrors".hashCode();
    private static final int dih = "render".hashCode();
    private static final int dii = "display".hashCode();

    public void aju() {
        this.dhW.clear();
        this.dhV = "";
        this.dhS.clear();
        this.dhY = this.dhX;
    }

    public void eY(String string) {
        int n2;
        if (!net.minecraft.client.d.AZ().aIY.bJS) {
            return;
        }
        if (au.bd()) {
            n2 = string.hashCode();
            if (n2 == die && string.equals(dhZ)) {
                au.ecM.rJ();
            } else if (n2 == dif && string.equals(dia) && a.anb()) {
                au.ecM.vX();
            } else if (n2 != dig || string.equals(dib)) {
                // empty if block
            }
        }
        if (a.aoE()) {
            n2 = string.hashCode();
            if (n2 == dih && string.equals(dic)) {
                GlStateManager.bKR = false;
            } else if (n2 == dii && string.equals(did)) {
                GlStateManager.bKR = true;
            }
        }
        if (this.dhY && this.dhV != null && this.dhU) {
            if (this.dhV.length() > 0) {
                this.dhV = this.dhV + ".";
            }
            this.dhV = this.dhV + string;
            this.dhS.add(this.dhV);
            this.dhT.add(System.nanoTime());
        }
    }

    public void ajv() {
        if (!net.minecraft.client.d.AZ().aIY.bJS) {
            return;
        }
        try {
            if (this.dhY && this.dhU) {
                long l2 = System.nanoTime();
                long l3 = this.dhT.remove(this.dhT.size() - 1);
                if (this.dhS.size() - 1 < 0) {
                    return;
                }
                this.dhS.remove(this.dhS.size() - 1);
                long l4 = l2 - l3;
                try {
                    if (this.dhW.containsKey(this.dhV)) {
                        this.dhW.put(this.dhV, this.dhW.get(this.dhV) + l4);
                    } else {
                        this.dhW.put(this.dhV, l4);
                    }
                    if (l4 > 100000000L) {
                        dhR.warn("Something's taking too long! '" + this.dhV + "' took aprox " + (double)l4 / 1000000.0 + " ms");
                    }
                    this.dhV = !this.dhS.isEmpty() ? this.dhS.get(this.dhS.size() - 1) : "";
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    indexOutOfBoundsException.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public List<e> eZ(String object) {
        if (!this.dhU) {
            return null;
        }
        try {
            long l2 = this.dhW.containsKey("root") ? this.dhW.get("root") : 0L;
            long l3 = this.dhW.containsKey(object) ? this.dhW.get(object) : -1L;
            ArrayList arrayList = Lists.newArrayList();
            if (((String)object).length() > 0) {
                object = (String)object + ".";
            }
            long l4 = 0L;
            for (String object2 : this.dhW.keySet()) {
                if (object2 == null || object2.length() <= ((String)object).length() || !object2.startsWith((String)object) || object2.indexOf(".", ((String)object).length() + 1) >= 0) continue;
                l4 += this.dhW.get(object2).longValue();
            }
            float f2 = l4;
            if (l4 < l3) {
                l4 = l3;
            }
            if (l2 < l4) {
                l2 = l4;
            }
            for (String string : this.dhW.keySet()) {
                if (string == null || string.length() <= ((String)object).length() || !string.startsWith((String)object) || string.indexOf(".", ((String)object).length() + 1) >= 0) continue;
                long l5 = this.dhW.get(string);
                double d2 = (double)l5 * 100.0 / (double)l4;
                double d3 = (double)l5 * 100.0 / (double)l2;
                String string2 = string.substring(((String)object).length());
                arrayList.add(new e(string2, d2, d3));
            }
            for (String string : this.dhW.keySet()) {
                this.dhW.put(string, this.dhW.get(string) * 950L / 1000L);
            }
            if ((float)l4 > f2) {
                arrayList.add(new e("unspecified", (double)((float)l4 - f2) * 100.0 / (double)l4, (double)((float)l4 - f2) * 100.0 / (double)l2));
            }
            Collections.sort(arrayList);
            arrayList.add(0, new e((String)object, 100.0, (double)l4 * 100.0 / (double)l2));
            return arrayList;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void fa(String string) {
        if (!net.minecraft.client.d.AZ().aIY.bJS) {
            return;
        }
        if (this.dhY) {
            this.ajv();
            this.eY(string);
        }
    }

    public String ajw() {
        return this.dhS.size() == 0 ? "[UNKNOWN]" : this.dhS.get(this.dhS.size() - 1);
    }

    public void l(Class<?> clazz) {
        if (this.dhU) {
            this.eY(clazz.getSimpleName());
        }
    }
}

