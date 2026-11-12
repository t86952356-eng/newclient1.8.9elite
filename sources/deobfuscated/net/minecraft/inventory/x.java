/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import net.minecraft.block.BlockAnvil;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.ak;
import net.minecraft.inventory.v;
import net.minecraft.item.co;
import net.minecraft.util.b;
import net.minecraft.world.w;

class x
extends ak {
    final /* synthetic */ w cTJ;
    final /* synthetic */ b cTK;
    final /* synthetic */ v cTL;

    x(v v2, ab ab2, int n2, int n3, int n4, w w2, b b2) {
        this.cTL = v2;
        this.cTJ = w2;
        this.cTK = b2;
        super(ab2, n2, n3, n4);
    }

    @Override
    public boolean H(co co2) {
        return false;
    }

    @Override
    public boolean G(a a2) {
        return (a2.cIt.cJM || a2.cIu >= this.cTL.cTE) && this.cTL.cTE > 0 && this.GJ();
    }

    @Override
    public void a(a a2, co co2) {
        Object object;
        if (!a2.cIt.cJM) {
            a2.fG(-this.cTL.cTE);
        }
        this.cTL.cTB.g(0, null);
        if (this.cTL.cTF > 0) {
            object = this.cTL.cTB.fi(1);
            if (object != null && ((co)object).cWZ > this.cTL.cTF) {
                ((co)object).cWZ -= this.cTL.cTF;
                this.cTL.cTB.g(1, (co)object);
            } else {
                this.cTL.cTB.g(1, null);
            }
        } else {
            this.cTL.cTB.g(1, null);
        }
        this.cTL.cTE = 0;
        object = this.cTJ.L(this.cTK);
        if (!a2.cIt.cJM && !this.cTJ.dDw && object.df() == Blocks.cOh && a2.VB().nextFloat() < 0.12f) {
            int n2 = object.b(BlockAnvil.aSS);
            if (++n2 > 2) {
                this.cTJ.aL(this.cTK);
                this.cTJ.e(1020, this.cTK, 0);
            } else {
                this.cTJ.a(this.cTK, object.a(BlockAnvil.aSS, n2), 2);
                this.cTJ.e(1021, this.cTK, 0);
            }
        } else if (!this.cTJ.dDw) {
            this.cTJ.e(1021, this.cTK, 0);
        }
    }
}

