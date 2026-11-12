/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockPortal$Size {
    private final w aXW;
    private final ap aXX;
    private final ao aXY;
    private final ao aXZ;
    private int aYa = 0;
    private b aYb;
    private int aYc;
    private int aYd;

    public BlockPortal$Size(w w2, b b2, ap ap2) {
        this.aXW = w2;
        this.aXX = ap2;
        if (ap2 == ap.dwH) {
            this.aXZ = ao.dwv;
            this.aXY = ao.dwu;
        } else {
            this.aXZ = ao.dws;
            this.aXY = ao.dwt;
        }
        b b3 = b2;
        while (b2.wu() > b3.wu() - 21 && b2.wu() > 0 && this.p(w2.L(b2.aqY()).df())) {
            b2 = b2.aqY();
        }
        int n2 = this.c(b2, this.aXZ) - 1;
        if (n2 >= 0) {
            this.aYb = b2.d(this.aXZ, n2);
            this.aYd = this.c(this.aYb, this.aXY);
            if (this.aYd < 2 || this.aYd > 21) {
                this.aYb = null;
                this.aYd = 0;
            }
        }
        if (this.aYb != null) {
            this.aYc = this.yF();
        }
    }

    protected int c(b b2, ao ao2) {
        Object object;
        int n2;
        for (n2 = 0; n2 < 22 && this.p(this.aXW.L((b)(object = b2.d(ao2, n2))).df()) && this.aXW.L(((b)object).aqY()).df() == Blocks.cMb; ++n2) {
        }
        object = this.aXW.L(b2.d(ao2, n2)).df();
        return object == Blocks.cMb ? n2 : 0;
    }

    public int yD() {
        return this.aYc;
    }

    public int yE() {
        return this.aYd;
    }

    protected int yF() {
        int n2;
        this.aYc = 0;
        block0: while (this.aYc < 21) {
            for (n2 = 0; n2 < this.aYd; ++n2) {
                b b2 = this.aYb.d(this.aXY, n2).hq(this.aYc);
                Block block = this.aXW.L(b2).df();
                if (!this.p(block)) break block0;
                if (block == Blocks.cNa) {
                    ++this.aYa;
                }
                if (n2 == 0 ? (block = this.aXW.L(b2.x(this.aXZ)).df()) != Blocks.cMb : n2 == this.aYd - 1 && (block = this.aXW.L(b2.x(this.aXY)).df()) != Blocks.cMb) break block0;
            }
            ++this.aYc;
        }
        for (n2 = 0; n2 < this.aYd; ++n2) {
            if (this.aXW.L(this.aYb.d(this.aXY, n2).hq(this.aYc)).df() == Blocks.cMb) continue;
            this.aYc = 0;
            break;
        }
        if (this.aYc <= 21 && this.aYc >= 3) {
            return this.aYc;
        }
        this.aYb = null;
        this.aYd = 0;
        this.aYc = 0;
        return 0;
    }

    protected boolean p(Block block) {
        return block.aSD == Material.beo || block == Blocks.cMd || block == Blocks.cNa;
    }

    public boolean yG() {
        return this.aYb != null && this.aYd >= 2 && this.aYd <= 21 && this.aYc >= 3 && this.aYc <= 21;
    }

    public void yH() {
        for (int i2 = 0; i2 < this.aYd; ++i2) {
            b b2 = this.aYb.d(this.aXY, i2);
            for (int i3 = 0; i3 < this.aYc; ++i3) {
                this.aXW.a(b2.hq(i3), Blocks.cNa.xM().a(BlockPortal.aXV, this.aXX), 2);
            }
        }
    }
}

