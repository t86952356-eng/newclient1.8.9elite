/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.enchantment.a;
import net.minecraft.enchantment.z;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.ac;
import net.minecraft.item.co;
import net.minecraft.potion.d;
import net.minecraft.util.cm;

public class f
extends a {
    private static final String[] cqz = new String[]{"all", "undead", "arthropods"};
    private static final int[] cqA = new int[]{1, 5, 5};
    private static final int[] cqB = new int[]{11, 8, 8};
    private static final int[] cqC = new int[]{20, 20, 20};
    public final int cqD;

    public f(int n2, cm cm2, int n3, int n4) {
        super(n2, cm2, n3, z.crc);
        this.cqD = n4;
    }

    @Override
    public int ei(int n2) {
        return cqA[this.cqD] + (n2 - 1) * cqB[this.cqD];
    }

    @Override
    public int ej(int n2) {
        return this.ei(n2) + cqC[this.cqD];
    }

    @Override
    public int Te() {
        return 5;
    }

    @Override
    public float a(int n2, net.minecraft.entity.z z2) {
        return this.cqD == 0 ? (float)n2 * 1.25f : (this.cqD == 1 && z2 == net.minecraft.entity.z.cvU ? (float)n2 * 2.5f : (this.cqD == 2 && z2 == net.minecraft.entity.z.cvV ? (float)n2 * 2.5f : 0.0f));
    }

    @Override
    public String getName() {
        return "enchantment.damage." + cqz[this.cqD];
    }

    @Override
    public boolean a(a a2) {
        return !(a2 instanceof f);
    }

    @Override
    public boolean T(co co2) {
        return co2.bP() instanceof ac || super.T(co2);
    }

    @Override
    public void a(r r2, c c2, int n2) {
        if (c2 instanceof r) {
            r r3 = (r)c2;
            if (this.cqD == 2 && r3.VY() == net.minecraft.entity.z.cvV) {
                int n3 = 20 + r2.VB().nextInt(10 * n2);
                r3.b(new d(net.minecraft.potion.a.dgx.dhb, n3, 3));
            }
        }
    }
}

