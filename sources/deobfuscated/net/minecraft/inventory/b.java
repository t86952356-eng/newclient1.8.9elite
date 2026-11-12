/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.inventory;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.z;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.bt;

public abstract class b {
    public List<co> cSJ = Lists.newArrayList();
    public List<ak> cSK = Lists.newArrayList();
    public int cSL;
    public short cSM;
    private int cSN = -1;
    private int cSO;
    private final Set<ak> cSP = Sets.newHashSet();
    protected List<z> cSQ = Lists.newArrayList();
    private final Set<a> cSR = Sets.newHashSet();

    protected ak c(ak ak2) {
        ak2.cUk = this.cSK.size();
        this.cSK.add(ak2);
        this.cSJ.add(null);
        return ak2;
    }

    public void a(z z2) {
        if (this.cSQ.contains(z2)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.cSQ.add(z2);
        z2.a(this, this.adb());
        this.adc();
    }

    public void b(z z2) {
        this.cSQ.remove(z2);
    }

    public List<co> adb() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.cSK.size(); ++i2) {
            arrayList.add(this.cSK.get(i2).ls());
        }
        return arrayList;
    }

    public void adc() {
        for (int i2 = 0; i2 < this.cSK.size(); ++i2) {
            co co2 = this.cSK.get(i2).ls();
            co co3 = this.cSJ.get(i2);
            if (co.d(co3, co2)) continue;
            co3 = co2 == null ? null : co2.aeg();
            this.cSJ.set(i2, co3);
            for (int i3 = 0; i3 < this.cSQ.size(); ++i3) {
                this.cSQ.get(i3).a(this, i2, co3);
            }
        }
    }

    public boolean c(a a2, int n2) {
        return false;
    }

    public ak b(ab ab2, int n2) {
        for (int i2 = 0; i2 < this.cSK.size(); ++i2) {
            ak ak2 = this.cSK.get(i2);
            if (!ak2.a(ab2, n2)) continue;
            return ak2;
        }
        return null;
    }

    public ak fM(int n2) {
        return this.cSK.get(n2);
    }

    public co a(a a2, int n2) {
        ak ak2 = this.cSK.get(n2);
        return ak2 != null ? ak2.ls() : null;
    }

    public co a(int n2, int n3, int n4, a a2) {
        co co2 = null;
        g g2 = a2.cHV;
        if (n4 == 5) {
            int n5 = this.cSO;
            this.cSO = b.fO(n3);
            if ((n5 != 1 || this.cSO != 2) && n5 != this.cSO) {
                this.add();
            } else if (g2.bO() == null) {
                this.add();
            } else if (this.cSO == 0) {
                this.cSN = b.fN(n3);
                if (b.a(this.cSN, a2)) {
                    this.cSO = 1;
                    this.cSP.clear();
                } else {
                    this.add();
                }
            } else if (this.cSO == 1) {
                ak ak2 = this.cSK.get(n2);
                if (ak2 != null && b.a(ak2, g2.bO(), true) && ak2.H(g2.bO()) && g2.bO().cWZ > this.cSP.size() && this.b(ak2)) {
                    this.cSP.add(ak2);
                }
            } else if (this.cSO == 2) {
                if (!this.cSP.isEmpty()) {
                    co co3 = g2.bO().aeg();
                    int n6 = g2.bO().cWZ;
                    for (ak ak3 : this.cSP) {
                        if (ak3 == null || !b.a(ak3, g2.bO(), true) || !ak3.H(g2.bO()) || g2.bO().cWZ < this.cSP.size() || !this.b(ak3)) continue;
                        co co4 = co3.aeg();
                        int n7 = ak3.GJ() ? ak3.ls().cWZ : 0;
                        b.a(this.cSP, this.cSN, co4, n7);
                        if (co4.cWZ > co4.aeb()) {
                            co4.cWZ = co4.aeb();
                        }
                        if (co4.cWZ > ak3.J(co4)) {
                            co4.cWZ = ak3.J(co4);
                        }
                        n6 -= co4.cWZ - n7;
                        ak3.I(co4);
                    }
                    co3.cWZ = n6;
                    if (co3.cWZ <= 0) {
                        co3 = null;
                    }
                    g2.e(co3);
                }
                this.add();
            } else {
                this.add();
            }
        } else if (this.cSO != 0) {
            this.add();
        } else if (!(n4 != 0 && n4 != 1 || n3 != 0 && n3 != 1)) {
            if (n2 == -999) {
                if (g2.bO() != null) {
                    if (n3 == 0) {
                        a2.d(g2.bO(), true);
                        g2.e((co)null);
                    }
                    if (n3 == 1) {
                        a2.d(g2.bO().ge(1), true);
                        if (g2.bO().cWZ == 0) {
                            g2.e((co)null);
                        }
                    }
                }
            } else if (n4 == 1) {
                co co5;
                if (n2 < 0) {
                    return null;
                }
                ak ak4 = this.cSK.get(n2);
                if (ak4 != null && ak4.G(a2) && (co5 = this.a(a2, n2)) != null) {
                    d d2 = co5.bP();
                    co2 = co5.aeg();
                    if (ak4.ls() != null && ak4.ls().bP() == d2) {
                        this.a(n2, n3, true, a2);
                    }
                }
            } else {
                if (n2 < 0) {
                    return null;
                }
                ak ak5 = this.cSK.get(n2);
                if (ak5 != null) {
                    co co6 = ak5.ls();
                    co co7 = g2.bO();
                    if (co6 != null) {
                        co2 = co6.aeg();
                    }
                    if (co6 == null) {
                        if (co7 != null && ak5.H(co7)) {
                            int n8;
                            int n9 = n8 = n3 == 0 ? co7.cWZ : 1;
                            if (n8 > ak5.J(co7)) {
                                n8 = ak5.J(co7);
                            }
                            if (co7.cWZ >= n8) {
                                ak5.I(co7.ge(n8));
                            }
                            if (co7.cWZ == 0) {
                                g2.e((co)null);
                            }
                        }
                    } else if (ak5.G(a2)) {
                        int n10;
                        if (co7 == null) {
                            int n11 = n3 == 0 ? co6.cWZ : (co6.cWZ + 1) / 2;
                            co co8 = ak5.cf(n11);
                            g2.e(co8);
                            if (co6.cWZ == 0) {
                                ak5.I(null);
                            }
                            ak5.a(a2, g2.bO());
                        } else if (ak5.H(co7)) {
                            if (co6.bP() == co7.bP() && co6.yc() == co7.yc() && co.c(co6, co7)) {
                                int n12;
                                int n13 = n12 = n3 == 0 ? co7.cWZ : 1;
                                if (n12 > ak5.J(co7) - co6.cWZ) {
                                    n12 = ak5.J(co7) - co6.cWZ;
                                }
                                if (n12 > co7.aeb() - co6.cWZ) {
                                    n12 = co7.aeb() - co6.cWZ;
                                }
                                co7.ge(n12);
                                if (co7.cWZ == 0) {
                                    g2.e((co)null);
                                }
                                co6.cWZ += n12;
                            } else if (co7.cWZ <= ak5.J(co7)) {
                                ak5.I(co7);
                                g2.e(co6);
                            }
                        } else if (co6.bP() == co7.bP() && co7.aeb() > 1 && (!co6.ads() || co6.yc() == co7.yc()) && co.c(co6, co7) && (n10 = co6.cWZ) > 0 && n10 + co7.cWZ <= co7.aeb()) {
                            co7.cWZ += n10;
                            co6 = ak5.cf(n10);
                            if (co6.cWZ == 0) {
                                ak5.I(null);
                            }
                            ak5.a(a2, g2.bO());
                        }
                    }
                    ak5.GK();
                }
            }
        } else if (n4 == 2 && n3 >= 0 && n3 < 9) {
            ak ak6 = this.cSK.get(n2);
            if (ak6.G(a2)) {
                co co9 = g2.fi(n3);
                boolean bl2 = co9 == null || ak6.cUj == g2 && ak6.H(co9);
                int n14 = -1;
                if (!bl2) {
                    n14 = g2.acH();
                    boolean bl3 = bl2 = n14 > -1;
                }
                if (ak6.GJ() && bl2) {
                    co co10 = ak6.ls();
                    g2.g(n3, co10.aeg());
                    if (!(ak6.cUj == g2 && ak6.H(co9) || co9 == null)) {
                        if (n14 > -1) {
                            g2.ah(co9);
                            ak6.cf(co10.cWZ);
                            ak6.I(null);
                            ak6.a(a2, co10);
                        }
                    } else {
                        ak6.cf(co10.cWZ);
                        ak6.I(co9);
                        ak6.a(a2, co10);
                    }
                } else if (!ak6.GJ() && co9 != null && ak6.H(co9)) {
                    g2.g(n3, null);
                    ak6.I(co9);
                }
            }
        } else if (n4 == 3 && a2.cIt.cJM && g2.bO() == null && n2 >= 0) {
            ak ak7 = this.cSK.get(n2);
            if (ak7 != null && ak7.GJ()) {
                co co11 = ak7.ls().aeg();
                co11.cWZ = co11.aeb();
                g2.e(co11);
            }
        } else if (n4 == 4 && g2.bO() == null && n2 >= 0) {
            ak ak8 = this.cSK.get(n2);
            if (ak8 != null && ak8.GJ() && ak8.G(a2)) {
                co co12 = ak8.cf(n3 == 0 ? 1 : ak8.ls().cWZ);
                ak8.a(a2, co12);
                a2.d(co12, true);
            }
        } else if (n4 == 6 && n2 >= 0) {
            ak ak9 = this.cSK.get(n2);
            co co13 = g2.bO();
            if (!(co13 == null || ak9 != null && ak9.GJ() && ak9.G(a2))) {
                int n15 = n3 == 0 ? 0 : this.cSK.size() - 1;
                int n16 = n3 == 0 ? 1 : -1;
                for (int i2 = 0; i2 < 2; ++i2) {
                    for (int i3 = n15; i3 >= 0 && i3 < this.cSK.size() && co13.cWZ < co13.aeb(); i3 += n16) {
                        ak ak10 = this.cSK.get(i3);
                        if (!ak10.GJ() || !b.a(ak10, co13, true) || !ak10.G(a2) || !this.a(co13, ak10) || i2 == 0 && ak10.ls().cWZ == ak10.ls().aeb()) continue;
                        int n17 = Math.min(co13.aeb() - co13.cWZ, ak10.ls().cWZ);
                        co co14 = ak10.cf(n17);
                        co13.cWZ += n17;
                        if (co14.cWZ <= 0) {
                            ak10.I(null);
                        }
                        ak10.a(a2, co14);
                    }
                }
            }
            this.adc();
        }
        return co2;
    }

    public boolean a(co co2, ak ak2) {
        return true;
    }

    protected void a(int n2, int n3, boolean bl2, a a2) {
        this.a(n2, n3, 1, a2);
    }

    public void E(a a2) {
        g g2 = a2.cHV;
        if (g2.bO() != null) {
            a2.d(g2.bO(), false);
            g2.e((co)null);
        }
    }

    public void b(ab ab2) {
        this.adc();
    }

    public void i(int n2, co co2) {
        this.fM(n2).I(co2);
    }

    public void a(co[] coArray) {
        for (int i2 = 0; i2 < coArray.length; ++i2) {
            this.fM(i2).I(coArray[i2]);
        }
    }

    public void aq(int n2, int n3) {
    }

    public short b(g g2) {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            this.cSM = (short)(this.cSM + 1);
        }
        return this.cSM;
    }

    public boolean F(a a2) {
        return !this.cSR.contains(a2);
    }

    public void c(a a2, boolean bl2) {
        if (bl2) {
            this.cSR.remove(a2);
        } else {
            this.cSR.add(a2);
        }
    }

    public abstract boolean i(a var1);

    protected boolean a(co co2, int n2, int n3, boolean bl2) {
        co co3;
        ak ak2;
        boolean bl3 = false;
        int n4 = n2;
        if (bl2) {
            n4 = n3 - 1;
        }
        if (co2.aec()) {
            while (co2.cWZ > 0 && (!bl2 && n4 < n3 || bl2 && n4 >= n2)) {
                ak2 = this.cSK.get(n4);
                co3 = ak2.ls();
                if (co3 != null && co3.bP() == co2.bP() && (!co2.ads() || co2.yc() == co3.yc()) && co.c(co2, co3)) {
                    int n5 = co3.cWZ + co2.cWZ;
                    if (n5 <= co2.aeb()) {
                        co2.cWZ = 0;
                        co3.cWZ = n5;
                        ak2.GK();
                        bl3 = true;
                    } else if (co3.cWZ < co2.aeb()) {
                        co2.cWZ -= co2.aeb() - co3.cWZ;
                        co3.cWZ = co2.aeb();
                        ak2.GK();
                        bl3 = true;
                    }
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        if (co2.cWZ > 0) {
            n4 = bl2 ? n3 - 1 : n2;
            while (!bl2 && n4 < n3 || bl2 && n4 >= n2) {
                ak2 = this.cSK.get(n4);
                co3 = ak2.ls();
                if (co3 == null) {
                    ak2.I(co2.aeg());
                    ak2.GK();
                    co2.cWZ = 0;
                    bl3 = true;
                    break;
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        return bl3;
    }

    public static int fN(int n2) {
        return n2 >> 2 & 3;
    }

    public static int fO(int n2) {
        return n2 & 3;
    }

    public static int ar(int n2, int n3) {
        return n2 & 3 | (n3 & 3) << 2;
    }

    public static boolean a(int n2, a a2) {
        return n2 == 0 || n2 == 1 || n2 == 2 && a2.cIt.cJM;
    }

    protected void add() {
        this.cSO = 0;
        this.cSP.clear();
    }

    public static boolean a(ak ak2, co co2, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = ak2 == null || !ak2.GJ();
        if (ak2 != null && ak2.GJ() && co2 != null && co2.aJ(ak2.ls()) && co.c(ak2.ls(), co2)) {
            bl3 |= ak2.ls().cWZ + (bl2 ? 0 : co2.cWZ) <= co2.aeb();
        }
        return bl3;
    }

    public static void a(Set<ak> set, int n2, co co2, int n3) {
        switch (n2) {
            case 0: {
                co2.cWZ = bt.bL((float)co2.cWZ / (float)set.size());
                break;
            }
            case 1: {
                co2.cWZ = 1;
                break;
            }
            case 2: {
                co2.cWZ = co2.bP().adr();
            }
        }
        co2.cWZ += n3;
    }

    public boolean b(ak ak2) {
        return true;
    }

    public static int d(net.minecraft.tileentity.d d2) {
        return d2 instanceof ab ? b.c((ab)((Object)d2)) : 0;
    }

    public static int c(ab ab2) {
        if (ab2 == null) {
            return 0;
        }
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < ab2.YI(); ++i2) {
            co co2 = ab2.fi(i2);
            if (co2 == null) continue;
            f2 += (float)co2.cWZ / (float)Math.min(ab2.YJ(), co2.aeb());
            ++n2;
        }
        return bt.bL((f2 /= (float)ab2.YI()) * 14.0f) + (n2 > 0 ? 1 : 0);
    }
}

