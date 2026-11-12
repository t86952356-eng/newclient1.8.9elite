/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.an;
import net.minecraft.util.ba;
import net.minecraft.util.s;

public class cr {
    public static String h(String string, boolean bl2) {
        return !bl2 && !Minecraft.getMinecraft().aIY.cgA ? an.ge(string) : string;
    }

    public static List<ba> a(ba ba2, int n2, agg agg2, boolean bl2, boolean bl3) {
        int n3 = 0;
        s s2 = new s("");
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList((Iterable)ba2);
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            String string;
            String string2;
            ba ba3 = (ba)arrayList2.get(i2);
            String string3 = ba3.arj();
            boolean bl4 = false;
            if (string3.contains("\n")) {
                int n4 = string3.indexOf(10);
                string2 = string3.substring(n4 + 1);
                string3 = string3.substring(0, n4 + 1);
                s s3 = new s(string2);
                s3.a(ba3.arp().arG());
                arrayList2.add(i2 + 1, s3);
                bl4 = true;
            }
            string2 = (string = cr.h(ba3.arp().arE() + string3, bl3)).endsWith("\n") ? string.substring(0, string.length() - 1) : string;
            int n5 = agg2.bQ(string2);
            s s4 = new s(string2);
            s4.a(ba3.arp().arG());
            if (n3 + n5 > n2) {
                String string4;
                String string5 = agg2.a(string, n2 - n3, false);
                String string6 = string4 = string5.length() < string.length() ? string.substring(string5.length()) : null;
                if (string4 != null && !string4.isEmpty()) {
                    int n6 = string5.lastIndexOf(" ");
                    if (n6 >= 0 && agg2.bQ(string.substring(0, n6)) > 0) {
                        string5 = string.substring(0, n6);
                        if (bl2) {
                            ++n6;
                        }
                        string4 = string.substring(n6);
                    } else if (n3 > 0 && !string.contains(" ")) {
                        string5 = "";
                        string4 = string;
                    }
                    s s5 = new s(string4);
                    s5.a(ba3.arp().arG());
                    arrayList2.add(i2 + 1, s5);
                }
                n5 = agg2.bQ(string5);
                s4 = new s(string5);
                s4.a(ba3.arp().arG());
                bl4 = true;
            }
            if (n3 + n5 <= n2) {
                n3 += n5;
                s2.n(s4);
            } else {
                bl4 = true;
            }
            if (!bl4) continue;
            arrayList.add(s2);
            n3 = 0;
            s2 = new s("");
        }
        arrayList.add(s2);
        return arrayList;
    }
}

