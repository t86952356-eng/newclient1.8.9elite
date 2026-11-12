/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockDispenser;
import net.minecraft.creativetab.a;
import net.minecraft.dispenser.c;
import net.minecraft.entity.p;
import net.minecraft.item.aa;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.z;
import net.minecraft.nbt.n;
import net.minecraft.world.w;

public class y
extends d {
    private static final int[] cVE = new int[]{11, 16, 15, 13};
    public static final String[] cVF = new String[]{"minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots"};
    private static final c cVG = new z();
    public final int cVH;
    public final int cVI;
    public final int cVJ;
    private final aa cVK;

    public y(aa aa2, int n2, int n3) {
        this.cVK = aa2;
        this.cVH = n3;
        this.cVJ = n2;
        this.cVI = aa2.fY(n3);
        this.fW(aa2.fX(n3));
        this.cVn = 1;
        this.d(a.cpF);
        BlockDispenser.aTP.b(this, cVG);
    }

    @Override
    public int e(co co2, int n2) {
        if (n2 > 0) {
            return 0xFFFFFF;
        }
        int n3 = this.az(co2);
        if (n3 < 0) {
            n3 = 0xFFFFFF;
        }
        return n3;
    }

    @Override
    public int adC() {
        return this.cVK.adK();
    }

    public aa adN() {
        return this.cVK;
    }

    public boolean ay(co co2) {
        return this.cVK == aa.cVL && co2.aej() && co2.aek().C("display", 10) && co2.aek().eN("display").C("color", 3);
    }

    public int az(co co2) {
        n n2;
        if (this.cVK != aa.cVL) {
            return -1;
        }
        n n3 = co2.aek();
        if (n3 != null && (n2 = n3.eN("display")) != null && n2.C("color", 3)) {
            return n2.eG("color");
        }
        return 10511680;
    }

    public void aA(co co2) {
        n n2;
        n n3;
        if (this.cVK == aa.cVL && (n3 = co2.aek()) != null && (n2 = n3.eN("display")).eD("color")) {
            n2.eP("color");
        }
    }

    public void f(co co2, int n2) {
        if (this.cVK != aa.cVL) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        n n3 = co2.aek();
        if (n3 == null) {
            n3 = new n();
            co2.u(n3);
        }
        n n4 = n3.eN("display");
        if (!n3.C("display", 10)) {
            n3.b("display", n4);
        }
        n4.B("color", n2);
    }

    @Override
    public boolean b(co co2, co co3) {
        return this.cVK.adL() == co3.bP() || super.b(co2, co3);
    }

    @Override
    public co a(co co2, w w2, net.minecraft.entity.player.a a2) {
        int n2 = p.W(co2) - 1;
        co co3 = a2.eH(n2);
        if (co3 == null) {
            a2.c(n2, co2.aeg());
            co2.cWZ = 0;
        }
        return co2;
    }
}

