/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.item.ar;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.u;
import net.minecraft.util.cr;

public class bb
extends d {
    @Override
    public int e(co co2, int n2) {
        if (n2 != 1) {
            return super.e(co2, n2);
        }
        g g2 = bb.a(co2, "Colors");
        if (!(g2 instanceof u)) {
            return 0x8A8A8A;
        }
        u u2 = (u)g2;
        int[] nArray = u2.aeR();
        if (nArray.length == 1) {
            return nArray[0];
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int n6 : nArray) {
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += (n6 & 0xFF) >> 0;
        }
        return (n3 /= nArray.length) << 16 | (n4 /= nArray.length) << 8 | (n5 /= nArray.length);
    }

    public static g a(co co2, String string) {
        n n2;
        if (co2.aej() && (n2 = co2.aek().eN("Explosion")) != null) {
            return n2.eB(string);
        }
        return null;
    }

    @Override
    public void a(co co2, a a2, List<String> list, boolean bl2) {
        n n2;
        if (co2.aej() && (n2 = co2.aek().eN("Explosion")) != null) {
            bb.a(n2, list);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(n n2, List<String> list) {
        boolean bl2;
        boolean bl3;
        int[] nArray;
        int n3;
        byte by2 = n2.eE("Type");
        if (by2 >= 0 && by2 <= 4) {
            list.add(cr.gm("item.fireworksCharge.type." + by2).trim());
        } else {
            list.add(cr.gm("item.fireworksCharge.type").trim());
        }
        int[] nArray2 = n2.eM("Colors");
        if (nArray2.length > 0) {
            boolean bl4 = true;
            Object object = "";
            for (int n4 : nArray2) {
                if (!bl4) {
                    object = (String)object + ", ";
                }
                bl4 = false;
                int n5 = 0;
                for (n3 = 0; n3 < ar.cWc.length; ++n3) {
                    if (n4 != ar.cWc[n3]) continue;
                    n5 = 1;
                    object = (String)object + cr.gm("item.fireworksCharge." + b.fR(n3).xB());
                    break;
                }
                if (n5 != 0) continue;
                object = (String)object + cr.gm("item.fireworksCharge.customColor");
            }
            list.add((String)object);
        }
        if ((nArray = n2.eM("FadeColors")).length > 0) {
            void var6_11;
            boolean bl5 = true;
            String bl22 = cr.gm("item.fireworksCharge.fadeTo") + " ";
            for (int n5 : nArray) {
                if (!bl5) {
                    String string = (String)var6_11 + ", ";
                }
                bl5 = false;
                n3 = 0;
                for (int i2 = 0; i2 < 16; ++i2) {
                    if (n5 != ar.cWc[i2]) continue;
                    n3 = 1;
                    String string = (String)var6_11 + cr.gm("item.fireworksCharge." + b.fR(i2).xB());
                    break;
                }
                if (n3 != 0) continue;
                String string = (String)var6_11 + cr.gm("item.fireworksCharge.customColor");
            }
            list.add((String)var6_11);
        }
        if (bl3 = n2.eO("Trail")) {
            list.add(cr.gm("item.fireworksCharge.trail"));
        }
        if (bl2 = n2.eO("Flicker")) {
            list.add(cr.gm("item.fireworksCharge.flicker"));
        }
    }
}

