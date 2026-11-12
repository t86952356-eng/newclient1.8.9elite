/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.entity.p;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.pathfinder.c;

public class h
extends e {
    private final p cxa;
    private final float cxb;
    private float cxc;
    private boolean cxd;
    private int cxe;
    private int cxf;

    public h(p p2, float f2) {
        this.cxa = p2;
        this.cxb = f2;
        this.eO(7);
    }

    @Override
    public void WG() {
        this.cxc = 0.0f;
    }

    @Override
    public void WE() {
        this.cxd = false;
        this.cxc = 0.0f;
    }

    @Override
    public boolean WC() {
        return this.cxa.TS() && this.cxa.crA != null && this.cxa.crA instanceof a && (this.cxd || this.cxa.Vl());
    }

    @Override
    public void WF() {
        Object object;
        a a2 = (a)this.cxa.crA;
        j j2 = (j)this.cxa;
        float f2 = bt.bN(a2.pl - this.cxa.pl) * 0.5f;
        if (f2 > 5.0f) {
            f2 = 5.0f;
        }
        if (f2 < -5.0f) {
            f2 = -5.0f;
        }
        this.cxa.pl = bt.bN(this.cxa.pl + f2);
        if (this.cxc < this.cxb) {
            this.cxc += (this.cxb - this.cxc) * 0.01f;
        }
        if (this.cxc > this.cxb) {
            this.cxc = this.cxb;
        }
        int n2 = bt.aF(this.cxa.gW);
        int n3 = bt.aF(this.cxa.gX);
        int n4 = bt.aF(this.cxa.gY);
        float f3 = this.cxc;
        if (this.cxd) {
            if (this.cxe++ > this.cxf) {
                this.cxd = false;
            }
            f3 += f3 * 1.15f * bt.bx((float)this.cxe / (float)this.cxf * (float)Math.PI);
        }
        float f4 = 0.91f;
        if (this.cxa.aO) {
            f4 = this.cxa.baU.L((b)new b((int)bt.bL((float)((float)n2)), (int)(bt.bL((float)((float)n3)) - 1), (int)bt.bL((float)((float)n4)))).df().aSF * 0.91f;
        }
        float f5 = 0.16277136f / (f4 * f4 * f4);
        float f6 = bt.bx(j2.pl * (float)Math.PI / 180.0f);
        float f7 = bt.bB(j2.pl * (float)Math.PI / 180.0f);
        float f8 = j2.Wf() * f5;
        float f9 = Math.max(f3, 1.0f);
        f9 = f8 / f9;
        float f10 = f3 * f9;
        float f11 = -(f10 * f6);
        float f12 = f10 * f7;
        if (bt.bz(f11) > bt.bz(f12)) {
            if (f11 < 0.0f) {
                f11 -= this.cxa.width / 2.0f;
            }
            if (f11 > 0.0f) {
                f11 += this.cxa.width / 2.0f;
            }
            f12 = 0.0f;
        } else {
            f11 = 0.0f;
            if (f12 < 0.0f) {
                f12 -= this.cxa.width / 2.0f;
            }
            if (f12 > 0.0f) {
                f12 += this.cxa.width / 2.0f;
            }
        }
        int n5 = bt.aF(this.cxa.gW + (double)f11);
        int n6 = bt.aF(this.cxa.gY + (double)f12);
        int n7 = bt.bL(this.cxa.width + 1.0f);
        int n8 = bt.bL(this.cxa.height + a2.height + 1.0f);
        int n9 = bt.bL(this.cxa.width + 1.0f);
        if (n2 != n5 || n4 != n6) {
            boolean bl2;
            object = this.cxa.baU.L(new b(n2, n3, n4)).df();
            boolean bl3 = bl2 = !this.C((Block)object) && (((Block)object).xb() != Material.beo || !this.C(this.cxa.baU.L(new b(n2, n3 - 1, n4)).df()));
            if (bl2 && 0 == c.a(this.cxa.baU, this.cxa, n5, n3, n6, n7, n8, n9, false, false, true) && 1 == c.a(this.cxa.baU, this.cxa, n2, n3 + 1, n4, n7, n8, n9, false, false, true) && 1 == c.a(this.cxa.baU, this.cxa, n5, n3 + 1, n6, n7, n8, n9, false, false, true)) {
                j2.UT().Xb();
            }
        }
        if (!a2.cIt.cJM && this.cxc >= this.cxb * 0.5f && this.cxa.VB().nextFloat() < 0.006f && !this.cxd && (object = a2.Vk()) != null && ((co)object).bP() == Items.cSc) {
            ((co)object).b(1, (r)a2);
            if (((co)object).cWZ == 0) {
                co co2 = new co(Items.cQV);
                co2.u(((co)object).aek());
                a2.cHV.cJC[a2.cHV.cJE] = co2;
            }
        }
        this.cxa.t(0.0f, f3);
    }

    private boolean C(Block block) {
        return block instanceof BlockStairs || block instanceof BlockSlab;
    }

    public boolean WJ() {
        return this.cxd;
    }

    public void WK() {
        this.cxd = true;
        this.cxe = 0;
        this.cxf = this.cxa.VB().nextInt(841) + 140;
    }

    public boolean WL() {
        return !this.WJ() && this.cxc > this.cxb * 0.3f;
    }
}

