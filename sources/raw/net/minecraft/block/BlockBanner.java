/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.h;
import net.minecraft.util.a;
import net.minecraft.util.ar;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockBanner
extends BlockContainer {
    public static final PropertyDirection aSV = PropertyDirection.a("facing", ar.dwT);
    public static final PropertyInteger aSW = PropertyInteger.e("rotation", 0, 15);

    protected BlockBanner() {
        super(Material.ber);
        float f2 = 0.25f;
        float f3 = 1.0f;
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
    }

    @Override
    public String xA() {
        return cr.gm("item.banner.white.name");
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public a c(w w2, b b2) {
        this.c((l)w2, b2);
        return super.c(w2, b2);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2) {
        return true;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xz() {
        return true;
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new h();
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cSI;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cSI;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof h) {
            co co2 = new co(Items.cSI, 1, ((h)d2).apW());
            n n3 = new n();
            d2.b(n3);
            n3.eP("x");
            n3.eP("y");
            n3.eP("z");
            n3.eP("id");
            co2.a("BlockEntityTag", n3);
            BlockBanner.a(w2, b2, co2);
        } else {
            super.a(w2, b2, iBlockState, f2, n2);
        }
    }

    @Override
    public boolean d(w w2, b b2) {
        return !this.v(w2, b2) && super.d(w2, b2);
    }

    @Override
    public void a(w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        if (d2 instanceof h) {
            h h2 = (h)d2;
            co co2 = new co(Items.cSI, 1, ((h)d2).apW());
            n n2 = new n();
            h.a(n2, h2.apW(), h2.apY());
            co2.a("BlockEntityTag", n2);
            BlockBanner.a(w2, b2, co2);
        } else {
            super.a(w2, a2, b2, iBlockState, null);
        }
    }
}

