/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.item;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.m;
import net.minecraft.entity.item.o;
import net.minecraft.entity.player.g;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.a;
import net.minecraft.tileentity.z;
import net.minecraft.util.ad;
import net.minecraft.util.ah;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class r
extends o
implements a {
    private boolean cCW = true;
    private int cCX = -1;
    private final b cCY = b.dtN;

    public r(w w2) {
        super(w2);
    }

    public r(w w2, double d2, double d3, double d4) {
        super(w2, d2, d3, d4);
    }

    @Override
    public m Wm() {
        return m.cCL;
    }

    @Override
    public IBlockState Wn() {
        return Blocks.cOr.xM();
    }

    @Override
    public int YE() {
        return 1;
    }

    @Override
    public int YI() {
        return 5;
    }

    @Override
    public boolean o(net.minecraft.entity.player.a a2) {
        if (!this.baU.dDw) {
            a2.a(this);
        }
        return true;
    }

    @Override
    public void b(int n2, int n3, int n4, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = !bl2;
        if (bl3 != this.YL()) {
            this.aY(bl3);
        }
    }

    public boolean YL() {
        return this.cCW;
    }

    public void aY(boolean bl2) {
        this.cCW = bl2;
    }

    @Override
    public w de() {
        return this.baU;
    }

    @Override
    public double YM() {
        return this.gW;
    }

    @Override
    public double YN() {
        return this.gX + 0.5;
    }

    @Override
    public double YO() {
        return this.gY;
    }

    @Override
    public void Dm() {
        super.Dm();
        if (!this.baU.dDw && this.TS() && this.YL()) {
            b b2 = new b(this);
            if (b2.equals(this.cCY)) {
                --this.cCX;
            } else {
                this.fk(0);
            }
            if (!this.YQ()) {
                this.fk(0);
                if (this.YP()) {
                    this.fk(4);
                    this.Lw();
                }
            }
        }
    }

    public boolean YP() {
        if (z.a(this)) {
            return true;
        }
        Predicate<c> predicate = this.baU.a(i.class, this.Us().ad(0.25, 0.0, 0.25), ah.dvG);
        if (predicate.size() > 0) {
            z.a(this, (i)predicate.get(0));
        }
        return false;
    }

    @Override
    public void c(ad ad2) {
        super.c(ad2);
        if (this.baU.Si().gw("doEntityDrops")) {
            this.a(d.I(Blocks.cOr), 1, 0.0f);
        }
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        n2.B("TransferCooldown", this.cCX);
    }

    @Override
    protected void e(n n2) {
        super.e(n2);
        this.cCX = n2.eG("TransferCooldown");
    }

    public void fk(int n2) {
        this.cCX = n2;
    }

    public boolean YQ() {
        return this.cCX > 0;
    }

    @Override
    public String xX() {
        return "minecraft:hopper";
    }

    @Override
    public net.minecraft.inventory.b a(g g2, net.minecraft.entity.player.a a2) {
        return new net.minecraft.inventory.o(g2, this, a2);
    }
}

