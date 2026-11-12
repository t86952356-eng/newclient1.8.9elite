/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.i;
import net.minecraft.world.w;

class k
implements d {
    private k() {
    }

    @Override
    public boolean c(af af2, w w2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < af2.YI(); ++i2) {
            co co2 = af2.fi(i2);
            if (co2 == null || co2.bP() != Items.cSI) continue;
            if (bl2) {
                return false;
            }
            if (h.aS(co2) >= 6) {
                return false;
            }
            bl2 = true;
        }
        if (!bl2) {
            return false;
        }
        return this.c(af2) != null;
    }

    @Override
    public co a(af af2) {
        i i2;
        co co2 = null;
        for (int i3 = 0; i3 < af2.YI(); ++i3) {
            co co3 = af2.fi(i3);
            if (co3 == null || co3.bP() != Items.cSI) continue;
            co2 = co3.aeg();
            co2.cWZ = 1;
            break;
        }
        if ((i2 = this.c(af2)) != null) {
            Object object;
            int n2 = 0;
            for (int i4 = 0; i4 < af2.YI(); ++i4) {
                object = af2.fi(i4);
                if (object == null || ((co)object).bP() != Items.cRa) continue;
                n2 = ((co)object).yc();
                break;
            }
            n n3 = co2.j("BlockEntityTag", true);
            object = null;
            if (n3.C("Patterns", 9)) {
                object = n3.D("Patterns", 10);
            } else {
                object = new v();
                n3.b("Patterns", (g)object);
            }
            n n4 = new n();
            n4.R("Pattern", i2.aqd());
            n4.B("Color", n2);
            ((v)object).a(n4);
        }
        return co2;
    }

    @Override
    public int aeC() {
        return 10;
    }

    @Override
    public co aeD() {
        return null;
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

    /*
     * Enabled aggressive block sorting
     */
    private i c(af af2) {
        i[] iArray = i.values();
        int n2 = iArray.length;
        int n3 = 0;
        while (true) {
            block12: {
                boolean bl2;
                i i2;
                block17: {
                    int n4;
                    int n5;
                    int n6;
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    if (n3 >= n2) {
                                        return null;
                                    }
                                    i2 = iArray[n3];
                                    if (!i2.aqf()) break block12;
                                    bl2 = true;
                                    if (!i2.aqg()) break block13;
                                    n6 = 0;
                                    n5 = 0;
                                    break block14;
                                }
                                if (af2.YI() != i2.aqe().length * i2.aqe()[0].length()) break block15;
                                n6 = -1;
                                break block16;
                            }
                            bl2 = false;
                            break block17;
                        }
                        for (n4 = 0; n4 < af2.YI() && bl2; ++n4) {
                            co co2 = af2.fi(n4);
                            if (co2 == null || co2.bP() == Items.cSI) continue;
                            if (co2.bP() == Items.cRa) {
                                if (n5 != 0) {
                                    bl2 = false;
                                    break;
                                }
                                n5 = 1;
                                continue;
                            }
                            if (n6 != 0 || !co2.aJ(i2.aqh())) {
                                bl2 = false;
                                break;
                            }
                            n6 = 1;
                        }
                        if (n6 != 0) break block17;
                        bl2 = false;
                        break block17;
                    }
                    for (n5 = 0; n5 < af2.YI() && bl2; ++n5) {
                        n4 = n5 / 3;
                        int n7 = n5 % 3;
                        co co3 = af2.fi(n5);
                        if (co3 != null && co3.bP() != Items.cSI) {
                            if (co3.bP() != Items.cRa) {
                                bl2 = false;
                                break;
                            }
                            if (n6 != -1 && n6 != co3.yc()) {
                                bl2 = false;
                                break;
                            }
                            if (i2.aqe()[n4].charAt(n7) == ' ') {
                                bl2 = false;
                                break;
                            }
                            n6 = co3.yc();
                            continue;
                        }
                        if (i2.aqe()[n4].charAt(n7) == ' ') continue;
                        bl2 = false;
                        break;
                    }
                }
                if (bl2) {
                    return i2;
                }
            }
            ++n3;
        }
    }
}

