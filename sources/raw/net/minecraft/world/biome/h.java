/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.db;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.aa;
import net.minecraft.world.gen.feature.ab;
import net.minecraft.world.gen.feature.ac;
import net.minecraft.world.gen.feature.ad;
import net.minecraft.world.gen.feature.an;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.f;
import net.minecraft.world.gen.feature.i;
import net.minecraft.world.gen.feature.n;
import net.minecraft.world.gen.g;
import net.minecraft.world.gen.l;
import net.minecraft.world.w;

public class h {
    protected w dFb;
    protected Random dFc;
    protected b dFd;
    protected g dFe;
    protected ao dFf = new net.minecraft.world.gen.feature.h(4);
    protected ao dFg = new ad(Blocks.cLo, 7);
    protected ao dFh = new ad(Blocks.cLp, 6);
    protected ao dFi;
    protected ao dFj;
    protected ao dFk;
    protected ao dFl;
    protected ao dFm;
    protected ao dFn;
    protected ao dFo;
    protected ao dFp;
    protected ao dFq;
    protected ao dFr;
    protected ao dFs;
    protected n dFt = new n(Blocks.cLP, BlockFlower$EnumFlowerType.aVa);
    protected ao dFu = new l(Blocks.cLR);
    protected ao dFv = new l(Blocks.cLS);
    protected ao dFw = new net.minecraft.world.gen.feature.b();
    protected ao dFx = new ac();
    protected ao dFy = new f();
    protected ao dFz = new an();
    protected int dFA;
    protected int dFB;
    protected int dFC = 2;
    protected int dFD = 1;
    protected int dFE;
    protected int dFF;
    protected int dFG;
    protected int dFH;
    protected int dFI = 1;
    protected int dFJ = 3;
    protected int dFK = 1;
    protected int dFL;
    public boolean dFM = true;

    public void a(w w2, Random random, j j2, b b2) {
        if (this.dFb != null) {
            throw new RuntimeException("Already decorating");
        }
        this.dFb = w2;
        String string = w2.avH().azM();
        this.dFe = string != null ? net.minecraft.world.gen.h.gI(string).ayi() : net.minecraft.world.gen.h.gI("").ayi();
        this.dFc = random;
        this.dFd = b2;
        this.dFi = new aa(Blocks.cLf.xM(), this.dFe.dMv);
        this.dFj = new aa(Blocks.cLp.xM(), this.dFe.dMz);
        this.dFk = new aa(Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bby), this.dFe.dMD);
        this.dFl = new aa(Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bbA), this.dFe.dMH);
        this.dFm = new aa(Blocks.cLd.xM().a(BlockStone.bbw, BlockStone$EnumType.bbC), this.dFe.dML);
        this.dFn = new aa(Blocks.cLs.xM(), this.dFe.dMP);
        this.dFo = new aa(Blocks.cLr.xM(), this.dFe.dMT);
        this.dFp = new aa(Blocks.cLq.xM(), this.dFe.dMX);
        this.dFq = new aa(Blocks.cME.xM(), this.dFe.dNb);
        this.dFr = new aa(Blocks.cMi.xM(), this.dFe.dNf);
        this.dFs = new aa(Blocks.cLz.xM(), this.dFe.dNj);
        this.a(j2);
        this.dFb = null;
        this.dFc = null;
    }

    protected void a(j j2) {
        Object object;
        Object object2;
        int n2;
        int n3;
        int n4;
        int n5;
        this.awS();
        for (n5 = 0; n5 < this.dFJ; ++n5) {
            n4 = this.dFc.nextInt(16) + 8;
            n3 = this.dFc.nextInt(16) + 8;
            this.dFg.b(this.dFb, this.dFc, this.dFb.aT(this.dFd.C(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.dFK; ++n5) {
            n4 = this.dFc.nextInt(16) + 8;
            n3 = this.dFc.nextInt(16) + 8;
            this.dFf.b(this.dFb, this.dFc, this.dFb.aT(this.dFd.C(n4, 0, n3)));
        }
        for (n5 = 0; n5 < this.dFI; ++n5) {
            n4 = this.dFc.nextInt(16) + 8;
            n3 = this.dFc.nextInt(16) + 8;
            this.dFh.b(this.dFb, this.dFc, this.dFb.aT(this.dFd.C(n4, 0, n3)));
        }
        n5 = this.dFB;
        if (this.dFc.nextInt(10) == 0) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            n2 = this.dFc.nextInt(16) + 8;
            a a2 = j2.j(this.dFc);
            a2.ayx();
            b b2 = this.dFb.aQ(this.dFd.C(n3, 0, n2));
            if (!a2.b(this.dFb, this.dFc, b2)) continue;
            a2.c(this.dFb, this.dFc, b2);
        }
        for (n4 = 0; n4 < this.dFL; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            n2 = this.dFc.nextInt(16) + 8;
            this.dFw.b(this.dFb, this.dFc, this.dFb.aQ(this.dFd.C(n3, 0, n2)));
        }
        for (n4 = 0; n4 < this.dFC; ++n4) {
            int n6;
            BlockFlower blockFlower;
            n3 = this.dFc.nextInt(16) + 8;
            int n7 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() + 32;
            if (n7 <= 0 || (blockFlower = ((BlockFlower$EnumFlowerType)(object2 = j2.a(this.dFc, (b)(object = this.dFd.C(n3, n6 = this.dFc.nextInt(n7), n2))))).yp().yr()).xb() == Material.beo) continue;
            this.dFt.a(blockFlower, (BlockFlower$EnumFlowerType)object2);
            this.dFt.b(this.dFb, this.dFc, (b)object);
        }
        for (n4 = 0; n4 < this.dFD; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n8 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n8 <= 0) continue;
            int n9 = this.dFc.nextInt(n8);
            j2.k(this.dFc).b(this.dFb, this.dFc, this.dFd.C(n3, n9, n2));
        }
        for (n4 = 0; n4 < this.dFE; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n10 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n10 <= 0) continue;
            int n11 = this.dFc.nextInt(n10);
            new i().b(this.dFb, this.dFc, this.dFd.C(n3, n11, n2));
        }
        for (n4 = 0; n4 < this.dFA; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n12 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n12 <= 0) continue;
            int n13 = this.dFc.nextInt(n12);
            object = this.dFd.C(n3, n13, n2);
            while (((db)object).wu() > 0 && this.dFb.aG((b)(object2 = ((b)object).aqY()))) {
                object = object2;
            }
            this.dFz.b(this.dFb, this.dFc, (b)object);
        }
        for (n4 = 0; n4 < this.dFF; ++n4) {
            int n14;
            if (this.dFc.nextInt(4) == 0) {
                n3 = this.dFc.nextInt(16) + 8;
                n2 = this.dFc.nextInt(16) + 8;
                b b3 = this.dFb.aQ(this.dFd.C(n3, 0, n2));
                this.dFu.b(this.dFb, this.dFc, b3);
            }
            if (this.dFc.nextInt(8) != 0 || (n14 = this.dFb.aQ(this.dFd.C(n3 = this.dFc.nextInt(16) + 8, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2) <= 0) continue;
            int n15 = this.dFc.nextInt(n14);
            object = this.dFd.C(n3, n15, n2);
            this.dFv.b(this.dFb, this.dFc, (b)object);
        }
        if (this.dFc.nextInt(4) == 0 && (n2 = this.dFb.aQ(this.dFd.C(n4 = this.dFc.nextInt(16) + 8, 0, n3 = this.dFc.nextInt(16) + 8)).wu() * 2) > 0) {
            int n16 = this.dFc.nextInt(n2);
            this.dFu.b(this.dFb, this.dFc, this.dFd.C(n4, n16, n3));
        }
        if (this.dFc.nextInt(8) == 0 && (n2 = this.dFb.aQ(this.dFd.C(n4 = this.dFc.nextInt(16) + 8, 0, n3 = this.dFc.nextInt(16) + 8)).wu() * 2) > 0) {
            int n17 = this.dFc.nextInt(n2);
            this.dFv.b(this.dFb, this.dFc, this.dFd.C(n4, n17, n3));
        }
        for (n4 = 0; n4 < this.dFG; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n18 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n18 <= 0) continue;
            int n19 = this.dFc.nextInt(n18);
            this.dFx.b(this.dFb, this.dFc, this.dFd.C(n3, n19, n2));
        }
        for (n4 = 0; n4 < 10; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n20 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n20 <= 0) continue;
            int n21 = this.dFc.nextInt(n20);
            this.dFx.b(this.dFb, this.dFc, this.dFd.C(n3, n21, n2));
        }
        if (this.dFc.nextInt(32) == 0 && (n2 = this.dFb.aQ(this.dFd.C(n4 = this.dFc.nextInt(16) + 8, 0, n3 = this.dFc.nextInt(16) + 8)).wu() * 2) > 0) {
            int n22 = this.dFc.nextInt(n2);
            new ab().b(this.dFb, this.dFc, this.dFd.C(n4, n22, n3));
        }
        for (n4 = 0; n4 < this.dFH; ++n4) {
            n3 = this.dFc.nextInt(16) + 8;
            int n23 = this.dFb.aQ(this.dFd.C(n3, 0, n2 = this.dFc.nextInt(16) + 8)).wu() * 2;
            if (n23 <= 0) continue;
            int n24 = this.dFc.nextInt(n23);
            this.dFy.b(this.dFb, this.dFc, this.dFd.C(n3, n24, n2));
        }
        if (this.dFM) {
            for (n4 = 0; n4 < 50; ++n4) {
                n3 = this.dFc.nextInt(16) + 8;
                n2 = this.dFc.nextInt(16) + 8;
                int n25 = this.dFc.nextInt(248) + 8;
                if (n25 <= 0) continue;
                int n26 = this.dFc.nextInt(n25);
                object = this.dFd.C(n3, n26, n2);
                new net.minecraft.world.gen.feature.w(Blocks.cLk).b(this.dFb, this.dFc, (b)object);
            }
            for (n4 = 0; n4 < 20; ++n4) {
                n3 = this.dFc.nextInt(16) + 8;
                n2 = this.dFc.nextInt(16) + 8;
                int n27 = this.dFc.nextInt(this.dFc.nextInt(this.dFc.nextInt(240) + 8) + 8);
                b b4 = this.dFd.C(n3, n27, n2);
                new net.minecraft.world.gen.feature.w(Blocks.cLm).b(this.dFb, this.dFc, b4);
            }
        }
    }

    protected void a(int n2, ao ao2, int n3, int n4) {
        int n5;
        if (n4 < n3) {
            n5 = n3;
            n3 = n4;
            n4 = n5;
        } else if (n4 == n3) {
            if (n3 < 255) {
                ++n4;
            } else {
                --n3;
            }
        }
        for (n5 = 0; n5 < n2; ++n5) {
            b b2 = this.dFd.C(this.dFc.nextInt(16), this.dFc.nextInt(n4 - n3) + n3, this.dFc.nextInt(16));
            ao2.b(this.dFb, this.dFc, b2);
        }
    }

    protected void b(int n2, ao ao2, int n3, int n4) {
        for (int i2 = 0; i2 < n2; ++i2) {
            b b2 = this.dFd.C(this.dFc.nextInt(16), this.dFc.nextInt(n4) + this.dFc.nextInt(n4) + n3 - n4, this.dFc.nextInt(16));
            ao2.b(this.dFb, this.dFc, b2);
        }
    }

    protected void awS() {
        this.a(this.dFe.dMw, this.dFi, this.dFe.dMx, this.dFe.dMy);
        this.a(this.dFe.dMA, this.dFj, this.dFe.dMB, this.dFe.dMC);
        this.a(this.dFe.dMI, this.dFl, this.dFe.dMJ, this.dFe.dMK);
        this.a(this.dFe.dME, this.dFk, this.dFe.dMF, this.dFe.dMG);
        this.a(this.dFe.dMM, this.dFm, this.dFe.dMN, this.dFe.dMO);
        this.a(this.dFe.dMQ, this.dFn, this.dFe.dMR, this.dFe.dMS);
        this.a(this.dFe.dMU, this.dFo, this.dFe.dMV, this.dFe.dMW);
        this.a(this.dFe.dMY, this.dFp, this.dFe.dMZ, this.dFe.dNa);
        this.a(this.dFe.dNc, this.dFq, this.dFe.dNd, this.dFe.dNe);
        this.a(this.dFe.dNg, this.dFr, this.dFe.dNh, this.dFe.dNi);
        this.b(this.dFe.dNk, this.dFs, this.dFe.dNl, this.dFe.dNm);
    }
}

