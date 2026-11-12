/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.gen.structure.cc;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.cw;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cm
extends cv {
    private boolean dRm;

    public cm() {
    }

    public cm(int n2, Random random, w w2, ao ao2) {
        super(n2);
        this.dQJ = ao2;
        this.dQI = w2;
    }

    @Override
    protected void N(n n2) {
        super.N(n2);
        n2.o("Mob", this.dRm);
    }

    @Override
    protected void O(n n2) {
        super.O(n2);
        this.dRm = n2.eO("Mob");
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        if (y2 != null) {
            ((cr)y2).dSp = this;
        }
    }

    public static cm r(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        w w2 = w.a(n2, n3, n4, -4, -1, 0, 11, 8, 16, ao2);
        return cm.e(w2) && y.a(list, w2) == null ? new cm(n5, random, w2, ao2) : null;
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        int n2;
        int n3;
        this.a(w2, w3, 0, 0, 0, 10, 7, 15, false, random, cc.dRW);
        this.a(w2, random, w3, cw.dSw, 4, 1, 0);
        int n4 = 6;
        this.a(w2, w3, 1, n4, 1, 1, n4, 14, false, random, cc.dRW);
        this.a(w2, w3, 9, n4, 1, 9, n4, 14, false, random, cc.dRW);
        this.a(w2, w3, 2, n4, 1, 8, n4, 2, false, random, cc.dRW);
        this.a(w2, w3, 2, n4, 14, 8, n4, 14, false, random, cc.dRW);
        this.a(w2, w3, 1, 1, 1, 2, 1, 4, false, random, cc.dRW);
        this.a(w2, w3, 8, 1, 1, 9, 1, 4, false, random, cc.dRW);
        this.a(w2, w3, 1, 1, 1, 1, 1, 3, Blocks.cLm.xM(), Blocks.cLm.xM(), false);
        this.a(w2, w3, 9, 1, 1, 9, 1, 3, Blocks.cLm.xM(), Blocks.cLm.xM(), false);
        this.a(w2, w3, 3, 1, 8, 7, 1, 12, false, random, cc.dRW);
        this.a(w2, w3, 4, 1, 9, 6, 1, 11, Blocks.cLm.xM(), Blocks.cLm.xM(), false);
        for (n3 = 3; n3 < 14; n3 += 2) {
            this.a(w2, w3, 0, 3, n3, 0, 4, n3, Blocks.cNk.xM(), Blocks.cNk.xM(), false);
            this.a(w2, w3, 10, 3, n3, 10, 4, n3, Blocks.cNk.xM(), Blocks.cNk.xM(), false);
        }
        for (n3 = 2; n3 < 9; n3 += 2) {
            this.a(w2, w3, n3, 3, 15, n3, 4, 15, Blocks.cNk.xM(), Blocks.cNk.xM(), false);
        }
        n3 = this.g(Blocks.cNx, 3);
        this.a(w2, w3, 4, 1, 5, 6, 1, 7, false, random, cc.dRW);
        this.a(w2, w3, 4, 2, 6, 6, 2, 7, false, random, cc.dRW);
        this.a(w2, w3, 4, 3, 7, 6, 3, 7, false, random, cc.dRW);
        for (n2 = 4; n2 <= 6; ++n2) {
            this.a(w2, Blocks.cNx.aM(n3), n2, 1, 4, w3);
            this.a(w2, Blocks.cNx.aM(n3), n2, 2, 5, w3);
            this.a(w2, Blocks.cNx.aM(n3), n2, 3, 6, w3);
        }
        n2 = ao.dws.asA();
        int n5 = ao.dwt.asA();
        int n6 = ao.dwv.asA();
        int n7 = ao.dwu.asA();
        if (this.dQJ != null) {
            switch (this.dQJ) {
                case dwt: {
                    n2 = ao.dwt.asA();
                    n5 = ao.dws.asA();
                    break;
                }
                case dwu: {
                    n2 = ao.dwu.asA();
                    n5 = ao.dwv.asA();
                    n6 = ao.dwt.asA();
                    n7 = ao.dws.asA();
                    break;
                }
                case dwv: {
                    n2 = ao.dwv.asA();
                    n5 = ao.dwu.asA();
                    n6 = ao.dwt.asA();
                    n7 = ao.dws.asA();
                }
            }
        }
        this.a(w2, Blocks.cNI.aM(n2).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 4, 3, 8, w3);
        this.a(w2, Blocks.cNI.aM(n2).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 5, 3, 8, w3);
        this.a(w2, Blocks.cNI.aM(n2).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 6, 3, 8, w3);
        this.a(w2, Blocks.cNI.aM(n5).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 4, 3, 12, w3);
        this.a(w2, Blocks.cNI.aM(n5).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 5, 3, 12, w3);
        this.a(w2, Blocks.cNI.aM(n5).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 6, 3, 12, w3);
        this.a(w2, Blocks.cNI.aM(n6).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 3, 3, 9, w3);
        this.a(w2, Blocks.cNI.aM(n6).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 3, 3, 10, w3);
        this.a(w2, Blocks.cNI.aM(n6).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 3, 3, 11, w3);
        this.a(w2, Blocks.cNI.aM(n7).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 7, 3, 9, w3);
        this.a(w2, Blocks.cNI.aM(n7).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 7, 3, 10, w3);
        this.a(w2, Blocks.cNI.aM(n7).a(BlockEndPortalFrame.aUv, random.nextFloat() > 0.9f), 7, 3, 11, w3);
        if (!this.dRm) {
            n4 = this.iH(3);
            b b2 = new b(this.bn(5, 6), n4, this.bo(5, 6));
            if (w3.k(b2)) {
                this.dRm = true;
                w2.a(b2, Blocks.cMe.xM(), 2);
                d d2 = w2.K(b2);
                if (d2 instanceof ab) {
                    ((ab)d2).aqI().fW("Silverfish");
                }
            }
        }
        return true;
    }
}

