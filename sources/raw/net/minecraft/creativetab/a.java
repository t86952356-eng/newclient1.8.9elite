/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.creativetab;

import java.util.List;
import net.minecraft.creativetab.b;
import net.minecraft.creativetab.c;
import net.minecraft.creativetab.d;
import net.minecraft.creativetab.e;
import net.minecraft.creativetab.f;
import net.minecraft.creativetab.g;
import net.minecraft.creativetab.h;
import net.minecraft.creativetab.i;
import net.minecraft.creativetab.j;
import net.minecraft.creativetab.k;
import net.minecraft.creativetab.l;
import net.minecraft.creativetab.m;
import net.minecraft.enchantment.z;
import net.minecraft.init.Items;
import net.minecraft.item.co;

public abstract class a {
    public static final a[] cpw = new a[13];
    public static final a cpx = new b(0, "buildingBlocks");
    public static final a cpy = new f(1, "decorations");
    public static final a cpz = new g(2, "redstone");
    public static final a cpA = new h(3, "transportation");
    public static final a cpB = new i(4, "misc").a(new z[]{z.cqW});
    public static final a cpC = new j(5, "search").dZ("item_search.png");
    public static final a cpD = new k(6, "food");
    public static final a cpE = new l(7, "tools").a(z.crd, z.cre, z.crf);
    public static final a cpF = new m(8, "combat").a(z.cqX, z.cqY, z.crb, z.cqZ, z.cra, z.crg, z.crc);
    public static final a cpG = new c(9, "brewing");
    public static final a cpH = new d(10, "materials");
    public static final a cpI = new e(11, "inventory").dZ("inventory.png").SW().SU();
    private final int cpJ;
    private final String cpK;
    private String cpL = "items.png";
    private boolean cpM = true;
    private boolean cpN = true;
    private z[] cpO;
    private co cpP;

    public a(int n2, String string) {
        this.cpJ = n2;
        this.cpK = string;
        a.cpw[n2] = this;
    }

    public int SO() {
        return this.cpJ;
    }

    public String SP() {
        return this.cpK;
    }

    public String cD() {
        return "itemGroup." + this.SP();
    }

    public co SQ() {
        if (this.cpP == null) {
            this.cpP = new co(this.cE(), 1, this.SR());
        }
        return this.cpP;
    }

    public abstract net.minecraft.item.d cE();

    public int SR() {
        return 0;
    }

    public String SS() {
        return this.cpL;
    }

    public a dZ(String string) {
        this.cpL = string;
        return this;
    }

    public boolean ST() {
        return this.cpN;
    }

    public a SU() {
        this.cpN = false;
        return this;
    }

    public boolean SV() {
        return this.cpM;
    }

    public a SW() {
        this.cpM = false;
        return this;
    }

    public int SX() {
        return this.cpJ % 6;
    }

    public boolean SY() {
        return this.cpJ < 6;
    }

    public z[] SZ() {
        return this.cpO;
    }

    public a a(z ... zArray) {
        this.cpO = zArray;
        return this;
    }

    public boolean a(z z2) {
        if (this.cpO == null) {
            return false;
        }
        for (z z3 : this.cpO) {
            if (z3 != z2) continue;
            return true;
        }
        return false;
    }

    public void c(List<co> list) {
        for (net.minecraft.item.d d2 : net.minecraft.item.d.cVi) {
            if (d2 == null || d2.adD() != this) continue;
            d2.b(d2, this, list);
        }
        if (this.SZ() != null) {
            this.a(list, this.SZ());
        }
    }

    public void a(List<co> list, z ... zArray) {
        for (net.minecraft.enchantment.a a2 : net.minecraft.enchantment.a.cpV) {
            if (a2 == null || a2.cqy == null) continue;
            boolean bl2 = false;
            for (z z2 : zArray) {
                if (a2.cqy != z2) continue;
                bl2 = true;
                break;
            }
            if (!bl2) continue;
            list.add(Items.cSh.a(new net.minecraft.enchantment.g(a2, a2.Te())));
        }
    }
}

