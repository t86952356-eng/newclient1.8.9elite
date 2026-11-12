/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.ar;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.world.w;

public class f
implements d {
    private co cXv;

    @Override
    public boolean c(af af2, w w2) {
        Object object;
        this.cXv = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            object = af2.fi(i2);
            if (object == null) continue;
            if (((co)object).bP() == Items.cPL) {
                ++n3;
                continue;
            }
            if (((co)object).bP() == Items.cSg) {
                ++n5;
                continue;
            }
            if (((co)object).bP() == Items.cRa) {
                ++n4;
                continue;
            }
            if (((co)object).bP() == Items.cQO) {
                ++n2;
                continue;
            }
            if (((co)object).bP() == Items.cQX) {
                ++n6;
                continue;
            }
            if (((co)object).bP() == Items.cPm) {
                ++n6;
                continue;
            }
            if (((co)object).bP() == Items.cRP) {
                ++n7;
                continue;
            }
            if (((co)object).bP() == Items.cPK) {
                ++n7;
                continue;
            }
            if (((co)object).bP() == Items.cRB) {
                ++n7;
                continue;
            }
            if (((co)object).bP() != Items.cSb) {
                return false;
            }
            ++n7;
        }
        n6 = n6 + n4 + n7;
        if (n3 <= 3 && n2 <= 1) {
            if (n3 >= 1 && n2 == 1 && n6 == 0) {
                this.cXv = new co(Items.cSf);
                if (n5 > 0) {
                    n n8 = new n();
                    object = new n();
                    v v2 = new v();
                    for (int i3 = 0; i3 < af2.YI(); ++i3) {
                        co co2 = af2.fi(i3);
                        if (co2 == null || co2.bP() != Items.cSg || !co2.aej() || !co2.aek().C("Explosion", 10)) continue;
                        v2.a(co2.aek().eN("Explosion"));
                    }
                    ((n)object).b("Explosions", v2);
                    ((n)object).a("Flight", (byte)n3);
                    n8.b("Fireworks", (g)object);
                    this.cXv.u(n8);
                }
                return true;
            }
            if (n3 == 1 && n2 == 0 && n5 == 0 && n4 > 0 && n7 <= 1) {
                this.cXv = new co(Items.cSg);
                n n9 = new n();
                object = new n();
                int n10 = 0;
                ArrayList arrayList = Lists.newArrayList();
                for (int i4 = 0; i4 < af2.YI(); ++i4) {
                    co co3 = af2.fi(i4);
                    if (co3 == null) continue;
                    if (co3.bP() == Items.cRa) {
                        arrayList.add(ar.cWc[co3.yc() & 0xF]);
                        continue;
                    }
                    if (co3.bP() == Items.cQX) {
                        ((n)object).o("Flicker", true);
                        continue;
                    }
                    if (co3.bP() == Items.cPm) {
                        ((n)object).o("Trail", true);
                        continue;
                    }
                    if (co3.bP() == Items.cRP) {
                        n10 = 1;
                        continue;
                    }
                    if (co3.bP() == Items.cPK) {
                        n10 = 4;
                        continue;
                    }
                    if (co3.bP() == Items.cRB) {
                        n10 = 2;
                        continue;
                    }
                    if (co3.bP() != Items.cSb) continue;
                    n10 = 3;
                }
                int[] nArray = new int[arrayList.size()];
                for (int i5 = 0; i5 < nArray.length; ++i5) {
                    nArray[i5] = (Integer)arrayList.get(i5);
                }
                ((n)object).a("Colors", nArray);
                ((n)object).a("Type", (byte)n10);
                n9.b("Explosion", (g)object);
                this.cXv.u(n9);
                return true;
            }
            if (n3 == 0 && n2 == 0 && n5 == 1 && n4 > 0 && n4 == n6) {
                ArrayList arrayList = Lists.newArrayList();
                for (int i6 = 0; i6 < af2.YI(); ++i6) {
                    co co4 = af2.fi(i6);
                    if (co4 == null) continue;
                    if (co4.bP() == Items.cRa) {
                        arrayList.add(ar.cWc[co4.yc() & 0xF]);
                        continue;
                    }
                    if (co4.bP() != Items.cSg) continue;
                    this.cXv = co4.aeg();
                    this.cXv.cWZ = 1;
                }
                int[] nArray = new int[arrayList.size()];
                for (int i7 = 0; i7 < nArray.length; ++i7) {
                    nArray[i7] = (Integer)arrayList.get(i7);
                }
                if (this.cXv != null && this.cXv.aej()) {
                    n n11 = this.cXv.aek().eN("Explosion");
                    if (n11 == null) {
                        return false;
                    }
                    n11.a("FadeColors", nArray);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public co a(af af2) {
        return this.cXv.aeg();
    }

    @Override
    public int aeC() {
        return 10;
    }

    @Override
    public co aeD() {
        return this.cXv;
    }

    @Override
    public co[] b(af af2) {
        co[] coArray = new co[af2.YI()];
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null || !co2.bP().adA()) continue;
            coArray[i2] = new co(co2.bP().adz());
        }
        return coArray;
    }
}

