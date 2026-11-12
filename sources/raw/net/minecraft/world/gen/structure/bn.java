/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.bk;
import net.minecraft.world.gen.structure.bl;
import net.minecraft.world.gen.structure.bm;
import net.minecraft.world.gen.structure.bo;
import net.minecraft.world.gen.structure.bq;
import net.minecraft.world.gen.structure.br;
import net.minecraft.world.gen.structure.bs;
import net.minecraft.world.gen.structure.bv;
import net.minecraft.world.gen.structure.bw;
import net.minecraft.world.gen.structure.bx;
import net.minecraft.world.gen.structure.by;
import net.minecraft.world.gen.structure.bz;
import net.minecraft.world.gen.structure.ca;
import net.minecraft.world.gen.structure.w;

public class bn
extends br {
    private bs dRu;
    private bs dRv;
    private final List<br> dRw = Lists.newArrayList();

    public bn() {
    }

    public bn(Random random, int n2, int n3, ao ao2) {
        super(0);
        Object object222;
        this.dQJ = ao2;
        switch (this.dQJ) {
            case dws: 
            case dwt: {
                this.dQI = new w(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
                break;
            }
            default: {
                this.dQI = new w(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
            }
        }
        List<bs> list = this.n(random);
        this.dRu.dRL = true;
        this.dRw.add(new bk(this.dQJ, this.dRu));
        this.dRw.add(new bo(this.dQJ, this.dRv, random));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new bx());
        arrayList.add(new bz());
        arrayList.add(new ca());
        arrayList.add(new bw());
        arrayList.add(new by());
        arrayList.add(new bm());
        arrayList.add(new bl());
        block3: for (bs bs2 : list) {
            if (bs2.dRL || bs2.aza()) continue;
            for (Object object222 : arrayList) {
                if (!object222.a(bs2)) continue;
                this.dRw.add(object222.a(this.dQJ, bs2, random));
                continue block3;
            }
        }
        int n4 = this.dQI.dQC;
        int n5 = this.bn(9, 22);
        int n6 = this.bo(9, 22);
        for (br object3 : this.dRw) {
            object3.ayR().ad(n5, n4, n6);
        }
        object222 = w.i(this.bn(1, 1), this.iH(1), this.bo(1, 1), this.bn(23, 21), this.iH(8), this.bo(23, 21));
        w w2 = w.i(this.bn(34, 1), this.iH(1), this.bo(34, 1), this.bn(56, 21), this.iH(8), this.bo(56, 21));
        w w3 = w.i(this.bn(22, 22), this.iH(13), this.bo(22, 22), this.bn(35, 35), this.iH(17), this.bo(35, 35));
        int n7 = random.nextInt();
        this.dRw.add(new bv(this.dQJ, (w)object222, n7++));
        this.dRw.add(new bv(this.dQJ, w2, n7++));
        this.dRw.add(new bq(this.dQJ, w3));
    }

    private List<bs> n(Random random) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        bs[] bsArray = new bs[75];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 0;
                n5 = bn.af(n8, 0, n7);
                bsArray[n5] = new bs(n5);
            }
        }
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 1;
                n5 = bn.af(n8, 1, n7);
                bsArray[n5] = new bs(n5);
            }
        }
        for (n8 = 1; n8 < 4; ++n8) {
            for (n7 = 0; n7 < 2; ++n7) {
                n6 = 2;
                n5 = bn.af(n8, 2, n7);
                bsArray[n5] = new bs(n5);
            }
        }
        this.dRu = bsArray[dRD];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 5; ++n7) {
                for (n6 = 0; n6 < 3; ++n6) {
                    n5 = bn.af(n8, n6, n7);
                    if (bsArray[n5] == null) continue;
                    for (ao object : ao.values()) {
                        int n9;
                        n4 = n8 + object.asH();
                        n3 = n6 + object.asI();
                        n2 = n7 + object.asJ();
                        if (n4 < 0 || n4 >= 5 || n2 < 0 || n2 >= 5 || n3 < 0 || n3 >= 3 || bsArray[n9 = bn.af(n4, n3, n2)] == null) continue;
                        if (n2 != n7) {
                            bsArray[n5].a(object.asC(), bsArray[n9]);
                            continue;
                        }
                        bsArray[n5].a(object, bsArray[n9]);
                    }
                }
            }
        }
        bs bs2 = new bs(1003);
        bsArray[dRE].a(ao.dwr, bs2);
        bs bs3 = new bs(1001);
        bsArray[dRF].a(ao.dwt, bs3);
        bs bs4 = new bs(1002);
        bsArray[dRG].a(ao.dwt, bs4);
        bs2.dRL = true;
        bs3.dRL = true;
        bs4.dRL = true;
        this.dRu.dRM = true;
        this.dRv = bsArray[bn.af(random.nextInt(4), 0, 2)];
        this.dRv.dRL = true;
        this.dRv.dRJ[ao.dwv.OY()].dRL = true;
        this.dRv.dRJ[ao.dws.OY()].dRL = true;
        this.dRv.dRJ[ao.dwv.OY()].dRJ[ao.dws.OY()].dRL = true;
        this.dRv.dRJ[ao.dwr.OY()].dRL = true;
        this.dRv.dRJ[ao.dwv.OY()].dRJ[ao.dwr.OY()].dRL = true;
        this.dRv.dRJ[ao.dws.OY()].dRJ[ao.dwr.OY()].dRL = true;
        this.dRv.dRJ[ao.dwv.OY()].dRJ[ao.dws.OY()].dRJ[ao.dwr.OY()].dRL = true;
        ArrayList arrayList = Lists.newArrayList();
        for (bs bs5 : bsArray) {
            if (bs5 == null) continue;
            bs5.ayZ();
            arrayList.add(bs5);
        }
        bs2.ayZ();
        Collections.shuffle(arrayList, random);
        int n10 = 1;
        for (bs bs5 : arrayList) {
            int n11 = 0;
            for (n4 = 0; n11 < 2 && n4 < 5; ++n4) {
                n3 = random.nextInt(6);
                if (!bs5.dRK[n3]) continue;
                n2 = ao.hy(n3).asC().OY();
                bs5.dRK[n3] = false;
                bs5.dRJ[n3].dRK[n2] = false;
                if (bs5.iJ(n10++) && bs5.dRJ[n3].iJ(n10++)) {
                    ++n11;
                    continue;
                }
                bs5.dRK[n3] = true;
                bs5.dRJ[n3].dRK[n2] = true;
            }
        }
        arrayList.add(bs2);
        arrayList.add(bs3);
        arrayList.add(bs4);
        return arrayList;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3 = Math.max(w2.avB(), 64) - this.dQI.dQC;
        this.a(w2, w3, 0, 0, 0, 58, n3, 58, false);
        this.a(false, 0, w2, random, w3);
        this.a(true, 33, w2, random, w3);
        this.c(w2, random, w3);
        this.d(w2, random, w3);
        this.e(w2, random, w3);
        this.f(w2, random, w3);
        this.g(w2, random, w3);
        this.h(w2, random, w3);
        for (n2 = 0; n2 < 7; ++n2) {
            int n4 = 0;
            while (n4 < 7) {
                if (n4 == 0 && n2 == 3) {
                    n4 = 6;
                }
                int n5 = n2 * 9;
                int n6 = n4 * 9;
                for (int i2 = 0; i2 < 4; ++i2) {
                    for (int i3 = 0; i3 < 4; ++i3) {
                        this.a(w2, dRy, n5 + i2, 0, n6 + i3, w3);
                        this.b(w2, dRy, n5 + i2, -1, n6 + i3, w3);
                    }
                }
                if (n2 != 0 && n2 != 6) {
                    n4 += 6;
                    continue;
                }
                ++n4;
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.a(w2, w3, -1 - n2, 0 + n2 * 2, -1 - n2, -1 - n2, 23, 58 + n2, false);
            this.a(w2, w3, 58 + n2, 0 + n2 * 2, -1 - n2, 58 + n2, 23, 58 + n2, false);
            this.a(w2, w3, 0 - n2, 0 + n2 * 2, -1 - n2, 57 + n2, 23, -1 - n2, false);
            this.a(w2, w3, 0 - n2, 0 + n2 * 2, 58 + n2, 57 + n2, 23, 58 + n2, false);
        }
        for (br br2 : this.dRw) {
            if (!br2.ayR().b(w3)) continue;
            br2.a(w2, random, w3);
        }
        return true;
    }

    private void a(boolean bl2, int n2, net.minecraft.world.w w2, Random random, w w3) {
        int n3 = 24;
        if (this.a(w3, n2, 0, n2 + 23, 20)) {
            int n4;
            int n5;
            this.a(w2, w3, n2 + 0, 0, 0, n2 + 24, 0, 20, dRx, dRx, false);
            this.a(w2, w3, n2 + 0, 1, 0, n2 + 24, 10, 20, false);
            for (n5 = 0; n5 < 4; ++n5) {
                this.a(w2, w3, n2 + n5, n5 + 1, n5, n2 + n5, n5 + 1, 20, dRy, dRy, false);
                this.a(w2, w3, n2 + n5 + 7, n5 + 5, n5 + 7, n2 + n5 + 7, n5 + 5, 20, dRy, dRy, false);
                this.a(w2, w3, n2 + 17 - n5, n5 + 5, n5 + 7, n2 + 17 - n5, n5 + 5, 20, dRy, dRy, false);
                this.a(w2, w3, n2 + 24 - n5, n5 + 1, n5, n2 + 24 - n5, n5 + 1, 20, dRy, dRy, false);
                this.a(w2, w3, n2 + n5 + 1, n5 + 1, n5, n2 + 23 - n5, n5 + 1, n5, dRy, dRy, false);
                this.a(w2, w3, n2 + n5 + 8, n5 + 5, n5 + 7, n2 + 16 - n5, n5 + 5, n5 + 7, dRy, dRy, false);
            }
            this.a(w2, w3, n2 + 4, 4, 4, n2 + 6, 4, 20, dRx, dRx, false);
            this.a(w2, w3, n2 + 7, 4, 4, n2 + 17, 4, 6, dRx, dRx, false);
            this.a(w2, w3, n2 + 18, 4, 4, n2 + 20, 4, 20, dRx, dRx, false);
            this.a(w2, w3, n2 + 11, 8, 11, n2 + 13, 8, 20, dRx, dRx, false);
            this.a(w2, dRA, n2 + 12, 9, 12, w3);
            this.a(w2, dRA, n2 + 12, 9, 15, w3);
            this.a(w2, dRA, n2 + 12, 9, 18, w3);
            n5 = bl2 ? n2 + 19 : n2 + 5;
            int n6 = bl2 ? n2 + 5 : n2 + 19;
            for (n4 = 20; n4 >= 5; n4 -= 3) {
                this.a(w2, dRA, n5, 5, n4, w3);
            }
            for (n4 = 19; n4 >= 7; n4 -= 3) {
                this.a(w2, dRA, n6, 5, n4, w3);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                int n7 = bl2 ? n2 + (24 - (17 - n4 * 3)) : n2 + 17 - n4 * 3;
                this.a(w2, dRA, n7, 5, 5, w3);
            }
            this.a(w2, dRA, n6, 5, 5, w3);
            this.a(w2, w3, n2 + 11, 1, 12, n2 + 13, 7, 12, dRx, dRx, false);
            this.a(w2, w3, n2 + 12, 1, 11, n2 + 12, 7, 13, dRx, dRx, false);
        }
    }

    private void c(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w3, 22, 5, 35, 17)) {
            this.a(w2, w3, 25, 0, 0, 32, 8, 20, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(w2, w3, 24, 2, 5 + i2 * 4, 24, 4, 5 + i2 * 4, dRy, dRy, false);
                this.a(w2, w3, 22, 4, 5 + i2 * 4, 23, 4, 5 + i2 * 4, dRy, dRy, false);
                this.a(w2, dRy, 25, 5, 5 + i2 * 4, w3);
                this.a(w2, dRy, 26, 6, 5 + i2 * 4, w3);
                this.a(w2, dRB, 26, 5, 5 + i2 * 4, w3);
                this.a(w2, w3, 33, 2, 5 + i2 * 4, 33, 4, 5 + i2 * 4, dRy, dRy, false);
                this.a(w2, w3, 34, 4, 5 + i2 * 4, 35, 4, 5 + i2 * 4, dRy, dRy, false);
                this.a(w2, dRy, 32, 5, 5 + i2 * 4, w3);
                this.a(w2, dRy, 31, 6, 5 + i2 * 4, w3);
                this.a(w2, dRB, 31, 5, 5 + i2 * 4, w3);
                this.a(w2, w3, 27, 6, 5 + i2 * 4, 30, 6, 5 + i2 * 4, dRx, dRx, false);
            }
        }
    }

    private void d(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w3, 15, 20, 42, 21)) {
            int n2;
            this.a(w2, w3, 15, 0, 21, 42, 0, 21, dRx, dRx, false);
            this.a(w2, w3, 26, 1, 21, 31, 3, 21, false);
            this.a(w2, w3, 21, 12, 21, 36, 12, 21, dRx, dRx, false);
            this.a(w2, w3, 17, 11, 21, 40, 11, 21, dRx, dRx, false);
            this.a(w2, w3, 16, 10, 21, 41, 10, 21, dRx, dRx, false);
            this.a(w2, w3, 15, 7, 21, 42, 9, 21, dRx, dRx, false);
            this.a(w2, w3, 16, 6, 21, 41, 6, 21, dRx, dRx, false);
            this.a(w2, w3, 17, 5, 21, 40, 5, 21, dRx, dRx, false);
            this.a(w2, w3, 21, 4, 21, 36, 4, 21, dRx, dRx, false);
            this.a(w2, w3, 22, 3, 21, 26, 3, 21, dRx, dRx, false);
            this.a(w2, w3, 31, 3, 21, 35, 3, 21, dRx, dRx, false);
            this.a(w2, w3, 23, 2, 21, 25, 2, 21, dRx, dRx, false);
            this.a(w2, w3, 32, 2, 21, 34, 2, 21, dRx, dRx, false);
            this.a(w2, w3, 28, 4, 20, 29, 4, 21, dRy, dRy, false);
            this.a(w2, dRy, 27, 3, 21, w3);
            this.a(w2, dRy, 30, 3, 21, w3);
            this.a(w2, dRy, 26, 2, 21, w3);
            this.a(w2, dRy, 31, 2, 21, w3);
            this.a(w2, dRy, 25, 1, 21, w3);
            this.a(w2, dRy, 32, 1, 21, w3);
            for (n2 = 0; n2 < 7; ++n2) {
                this.a(w2, dRz, 28 - n2, 6 + n2, 21, w3);
                this.a(w2, dRz, 29 + n2, 6 + n2, 21, w3);
            }
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, dRz, 28 - n2, 9 + n2, 21, w3);
                this.a(w2, dRz, 29 + n2, 9 + n2, 21, w3);
            }
            this.a(w2, dRz, 28, 12, 21, w3);
            this.a(w2, dRz, 29, 12, 21, w3);
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(w2, dRz, 22 - n2 * 2, 8, 21, w3);
                this.a(w2, dRz, 22 - n2 * 2, 9, 21, w3);
                this.a(w2, dRz, 35 + n2 * 2, 8, 21, w3);
                this.a(w2, dRz, 35 + n2 * 2, 9, 21, w3);
            }
            this.a(w2, w3, 15, 13, 21, 42, 15, 21, false);
            this.a(w2, w3, 15, 1, 21, 15, 6, 21, false);
            this.a(w2, w3, 16, 1, 21, 16, 5, 21, false);
            this.a(w2, w3, 17, 1, 21, 20, 4, 21, false);
            this.a(w2, w3, 21, 1, 21, 21, 3, 21, false);
            this.a(w2, w3, 22, 1, 21, 22, 2, 21, false);
            this.a(w2, w3, 23, 1, 21, 24, 1, 21, false);
            this.a(w2, w3, 42, 1, 21, 42, 6, 21, false);
            this.a(w2, w3, 41, 1, 21, 41, 5, 21, false);
            this.a(w2, w3, 37, 1, 21, 40, 4, 21, false);
            this.a(w2, w3, 36, 1, 21, 36, 3, 21, false);
            this.a(w2, w3, 33, 1, 21, 34, 1, 21, false);
            this.a(w2, w3, 35, 1, 21, 35, 2, 21, false);
        }
    }

    private void e(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w3, 21, 21, 36, 36)) {
            this.a(w2, w3, 21, 0, 22, 36, 0, 36, dRx, dRx, false);
            this.a(w2, w3, 21, 1, 22, 36, 23, 36, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(w2, w3, 21 + i2, 13 + i2, 21 + i2, 36 - i2, 13 + i2, 21 + i2, dRy, dRy, false);
                this.a(w2, w3, 21 + i2, 13 + i2, 36 - i2, 36 - i2, 13 + i2, 36 - i2, dRy, dRy, false);
                this.a(w2, w3, 21 + i2, 13 + i2, 22 + i2, 21 + i2, 13 + i2, 35 - i2, dRy, dRy, false);
                this.a(w2, w3, 36 - i2, 13 + i2, 22 + i2, 36 - i2, 13 + i2, 35 - i2, dRy, dRy, false);
            }
            this.a(w2, w3, 25, 16, 25, 32, 16, 32, dRx, dRx, false);
            this.a(w2, w3, 25, 17, 25, 25, 19, 25, dRy, dRy, false);
            this.a(w2, w3, 32, 17, 25, 32, 19, 25, dRy, dRy, false);
            this.a(w2, w3, 25, 17, 32, 25, 19, 32, dRy, dRy, false);
            this.a(w2, w3, 32, 17, 32, 32, 19, 32, dRy, dRy, false);
            this.a(w2, dRy, 26, 20, 26, w3);
            this.a(w2, dRy, 27, 21, 27, w3);
            this.a(w2, dRB, 27, 20, 27, w3);
            this.a(w2, dRy, 26, 20, 31, w3);
            this.a(w2, dRy, 27, 21, 30, w3);
            this.a(w2, dRB, 27, 20, 30, w3);
            this.a(w2, dRy, 31, 20, 31, w3);
            this.a(w2, dRy, 30, 21, 30, w3);
            this.a(w2, dRB, 30, 20, 30, w3);
            this.a(w2, dRy, 31, 20, 26, w3);
            this.a(w2, dRy, 30, 21, 27, w3);
            this.a(w2, dRB, 30, 20, 27, w3);
            this.a(w2, w3, 28, 21, 27, 29, 21, 27, dRx, dRx, false);
            this.a(w2, w3, 27, 21, 28, 27, 21, 29, dRx, dRx, false);
            this.a(w2, w3, 28, 21, 30, 29, 21, 30, dRx, dRx, false);
            this.a(w2, w3, 30, 21, 28, 30, 21, 29, dRx, dRx, false);
        }
    }

    private void f(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.a(w3, 0, 21, 6, 58)) {
            this.a(w2, w3, 0, 0, 21, 6, 0, 57, dRx, dRx, false);
            this.a(w2, w3, 0, 1, 21, 6, 7, 57, false);
            this.a(w2, w3, 4, 4, 21, 6, 4, 53, dRx, dRx, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, dRy, dRy, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(w2, dRA, 5, 5, n2, w3);
            }
            this.a(w2, dRA, 5, 5, 52, w3);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, dRy, dRy, false);
            }
            this.a(w2, w3, 4, 1, 52, 6, 3, 52, dRx, dRx, false);
            this.a(w2, w3, 5, 1, 51, 5, 3, 53, dRx, dRx, false);
        }
        if (this.a(w3, 51, 21, 58, 58)) {
            this.a(w2, w3, 51, 0, 21, 57, 0, 57, dRx, dRx, false);
            this.a(w2, w3, 51, 1, 21, 57, 7, 57, false);
            this.a(w2, w3, 51, 4, 21, 53, 4, 53, dRx, dRx, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, 57 - n2, n2 + 1, 21, 57 - n2, n2 + 1, 57 - n2, dRy, dRy, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(w2, dRA, 52, 5, n2, w3);
            }
            this.a(w2, dRA, 52, 5, 52, w3);
            this.a(w2, w3, 51, 1, 52, 53, 3, 52, dRx, dRx, false);
            this.a(w2, w3, 52, 1, 51, 52, 3, 53, dRx, dRx, false);
        }
        if (this.a(w3, 0, 51, 57, 57)) {
            this.a(w2, w3, 7, 0, 51, 50, 0, 57, dRx, dRx, false);
            this.a(w2, w3, 7, 1, 51, 50, 10, 57, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, dRy, dRy, false);
            }
        }
    }

    private void g(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.a(w3, 7, 21, 13, 50)) {
            this.a(w2, w3, 7, 0, 21, 13, 0, 50, dRx, dRx, false);
            this.a(w2, w3, 7, 1, 21, 13, 10, 50, false);
            this.a(w2, w3, 11, 8, 21, 13, 8, 53, dRx, dRx, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, n2 + 7, n2 + 5, 21, n2 + 7, n2 + 5, 54, dRy, dRy, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(w2, dRA, 12, 9, n2, w3);
            }
        }
        if (this.a(w3, 44, 21, 50, 54)) {
            this.a(w2, w3, 44, 0, 21, 50, 0, 50, dRx, dRx, false);
            this.a(w2, w3, 44, 1, 21, 50, 10, 50, false);
            this.a(w2, w3, 44, 8, 21, 46, 8, 53, dRx, dRx, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, 50 - n2, n2 + 5, 21, 50 - n2, n2 + 5, 54, dRy, dRy, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(w2, dRA, 45, 9, n2, w3);
            }
        }
        if (this.a(w3, 8, 44, 49, 54)) {
            this.a(w2, w3, 14, 0, 44, 43, 0, 50, dRx, dRx, false);
            this.a(w2, w3, 14, 1, 44, 43, 10, 50, false);
            for (n2 = 12; n2 <= 45; n2 += 3) {
                this.a(w2, dRA, n2, 9, 45, w3);
                this.a(w2, dRA, n2, 9, 52, w3);
                if (n2 != 12 && n2 != 18 && n2 != 24 && n2 != 33 && n2 != 39 && n2 != 45) continue;
                this.a(w2, dRA, n2, 9, 47, w3);
                this.a(w2, dRA, n2, 9, 50, w3);
                this.a(w2, dRA, n2, 10, 45, w3);
                this.a(w2, dRA, n2, 10, 46, w3);
                this.a(w2, dRA, n2, 10, 51, w3);
                this.a(w2, dRA, n2, 10, 52, w3);
                this.a(w2, dRA, n2, 11, 47, w3);
                this.a(w2, dRA, n2, 11, 50, w3);
                this.a(w2, dRA, n2, 12, 48, w3);
                this.a(w2, dRA, n2, 12, 49, w3);
            }
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(w2, w3, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, dRx, dRx, false);
            }
            this.a(w2, w3, 11, 8, 54, 46, 8, 54, dRy, dRy, false);
            this.a(w2, w3, 14, 8, 44, 43, 8, 53, dRx, dRx, false);
        }
    }

    private void h(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        if (this.a(w3, 14, 21, 20, 43)) {
            this.a(w2, w3, 14, 0, 21, 20, 0, 43, dRx, dRx, false);
            this.a(w2, w3, 14, 1, 22, 20, 14, 43, false);
            this.a(w2, w3, 18, 12, 22, 20, 12, 39, dRx, dRx, false);
            this.a(w2, w3, 18, 12, 21, 20, 12, 21, dRy, dRy, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, n2 + 14, n2 + 9, 21, n2 + 14, n2 + 9, 43 - n2, dRy, dRy, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(w2, dRA, 19, 13, n2, w3);
            }
        }
        if (this.a(w3, 37, 21, 43, 43)) {
            this.a(w2, w3, 37, 0, 21, 43, 0, 43, dRx, dRx, false);
            this.a(w2, w3, 37, 1, 22, 43, 14, 43, false);
            this.a(w2, w3, 37, 12, 22, 39, 12, 39, dRx, dRx, false);
            this.a(w2, w3, 37, 12, 21, 39, 12, 21, dRy, dRy, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, 43 - n2, n2 + 9, 21, 43 - n2, n2 + 9, 43 - n2, dRy, dRy, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(w2, dRA, 38, 13, n2, w3);
            }
        }
        if (this.a(w3, 15, 37, 42, 43)) {
            this.a(w2, w3, 21, 0, 37, 36, 0, 43, dRx, dRx, false);
            this.a(w2, w3, 21, 1, 37, 36, 14, 43, false);
            this.a(w2, w3, 21, 12, 37, 36, 12, 39, dRx, dRx, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(w2, w3, 15 + n2, n2 + 9, 43 - n2, 42 - n2, n2 + 9, 43 - n2, dRy, dRy, false);
            }
            for (n2 = 21; n2 <= 36; n2 += 3) {
                this.a(w2, dRA, n2, 13, 38, w3);
            }
        }
    }
}

