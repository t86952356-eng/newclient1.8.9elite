/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;

public final class v
extends Enum<v> {
    public static final /* enum */ v cVt = new v(0, 59, 2.0f, 0.0f, 15);
    public static final /* enum */ v cVu = new v(1, 131, 4.0f, 1.0f, 5);
    public static final /* enum */ v cVv = new v(2, 250, 6.0f, 2.0f, 14);
    public static final /* enum */ v cVw = new v(3, 1561, 8.0f, 3.0f, 10);
    public static final /* enum */ v cVx = new v(0, 32, 12.0f, 0.0f, 22);
    private final int cVy;
    private final int cVz;
    private final float cVA;
    private final float cVB;
    private final int cVC;
    private static final /* synthetic */ v[] cVD;

    public static v[] values() {
        return (v[])cVD.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private v(int n3, int n4, float f2, float f3, int n5) {
        this.cVy = n3;
        this.cVz = n4;
        this.cVA = f2;
        this.cVB = f3;
        this.cVC = n5;
    }

    public int adG() {
        return this.cVz;
    }

    public float adH() {
        return this.cVA;
    }

    public float adI() {
        return this.cVB;
    }

    public int adJ() {
        return this.cVy;
    }

    public int adK() {
        return this.cVC;
    }

    public d adL() {
        return this == cVt ? d.I(Blocks.cLh) : (this == cVu ? d.I(Blocks.cLg) : (this == cVx ? Items.cPo : (this == cVv ? Items.cPn : (this == cVw ? Items.cPm : null))));
    }

    private static /* synthetic */ v[] adM() {
        return new v[]{cVt, cVu, cVv, cVw, cVx};
    }

    static {
        cVD = v.adM();
    }
}

