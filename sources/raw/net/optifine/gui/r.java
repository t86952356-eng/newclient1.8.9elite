/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import hackclient.rise.agg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.gui.c;
import net.minecraft.client.settings.a;
import net.optifine.aw;
import net.optifine.gui.q;
import net.optifine.shaders.config.o;
import net.optifine.shaders.gui.d;
import net.optifine.util.aj;

public class r
extends q {
    @Override
    public String[] b(c c2, int n2) {
        if (!(c2 instanceof d)) {
            return null;
        }
        d d2 = (d)c2;
        o o2 = d2.aIu();
        String[] stringArray = this.a(o2, n2);
        return stringArray;
    }

    private String[] a(o o2, int n2) {
        Object object;
        String string = o2.aIh();
        String string2 = net.minecraft.src.a.fS(o2.aId()).trim();
        String[] stringArray = this.in(string2);
        a a2 = net.minecraft.src.a.aoH();
        String string3 = null;
        if (!string.equals(o2.getName()) && a2.cgL) {
            string3 = "\u00a78" + aw.cf("of.general.id") + ": " + o2.getName();
        }
        String string4 = null;
        if (o2.aIf() != null && a2.cgL) {
            string4 = "\u00a78" + aw.cf("of.general.from") + ": " + net.minecraft.src.a.c(o2.aIf());
        }
        String string5 = null;
        if (o2.aHp() != null && a2.cgL) {
            object = o2.isEnabled() ? o2.js(o2.aHp()) : aw.cf("of.general.ambiguous");
            string5 = "\u00a78" + aw.aBF() + ": " + (String)object;
        }
        object = new ArrayList<String>();
        object.add(string);
        object.addAll(Arrays.asList(stringArray));
        if (string3 != null) {
            object.add(string3);
        }
        if (string4 != null) {
            object.add(string4);
        }
        if (string5 != null) {
            object.add(string5);
        }
        String[] stringArray2 = this.a(n2, (List<String>)object);
        return stringArray2;
    }

    private String[] in(String string) {
        if (string.length() <= 0) {
            return new String[0];
        }
        string = aj.ax(string, "//");
        String[] stringArray = string.split("\\. ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = "- " + stringArray[i2].trim();
            stringArray[i2] = aj.ay(stringArray[i2], ".");
        }
        return stringArray;
    }

    private String[] a(int n2, List<String> list) {
        agg agg2 = net.minecraft.src.a.AZ().fontRendererObj;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = list.get(i2);
            if (string == null || string.isEmpty()) continue;
            arrayList.addAll(agg2.m(string, n2));
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}

